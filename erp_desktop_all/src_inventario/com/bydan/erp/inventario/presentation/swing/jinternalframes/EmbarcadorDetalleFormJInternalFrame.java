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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.inventario.util.EmbarcadorConstantesFunciones;

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
public class EmbarcadorDetalleFormJInternalFrame extends EmbarcadorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmbarcador;
	
	protected JMenuBar jmenuBarDetalleEmbarcador;
	
	protected JMenu jmenuDetalleEmbarcador;
	protected JMenu jmenuDetalleArchivoEmbarcador;
	protected JMenu jmenuDetalleAccionesEmbarcador;
	protected JMenu jmenuDetalleDatosEmbarcador;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmbarcador;	
	protected GridBagConstraints gridBagConstraintsEmbarcador;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmbarcadorBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmbarcador;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";

	protected PuertoBeanSwingJInternalFrame puertoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_puerto="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public EmbarcadorSessionBean embarcadorSessionBean;
	
	

	public PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame=null;
	public PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoCompraImpor=false;
	public PedidoCompraImporSessionBean pedidocompraimporSessionBean;

	public ParametroCompraBeanSwingJInternalFrame parametrocompraBeanSwingJInternalFrame=null;
	public ParametroCompraBeanSwingJInternalFrame parametrocompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCompra=false;
	public ParametroCompraSessionBean parametrocompraSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	public PuertoSessionBean puertoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public EmbarcadorLogic embarcadorLogic;
	
	public JScrollPane jScrollPanelDatosEmbarcador;
	public JScrollPane jScrollPanelDatosEdicionEmbarcador;
	public JScrollPane jScrollPanelDatosGeneralEmbarcador;
	
	protected JPanel jPanelCamposEmbarcador;    
	protected JPanel jPanelCamposOcultosEmbarcador;    	
	protected JPanel jPanelAccionesEmbarcador;
	protected JPanel jPanelAccionesFormularioEmbarcador;
    
	
	
	protected Integer iXPanelCamposEmbarcador=0;
	protected Integer iYPanelCamposEmbarcador=0;
	
	protected Integer iXPanelCamposOcultosEmbarcador=0;
	protected Integer iYPanelCamposOcultosEmbarcador=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmbarcador;
	public JButton jButtonModificarEmbarcador;
	public JButton jButtonActualizarEmbarcador;
    public JButton jButtonEliminarEmbarcador;
	public JButton jButtonCancelarEmbarcador;
    public JButton jButtonGuardarCambiosEmbarcador;
	public JButton jButtonGuardarCambiosTablaEmbarcador;
	protected JButton jButtonCerrarEmbarcador;
	
	
	protected JButton jButtonProcesarInformacionEmbarcador;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmbarcador;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmbarcador;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmbarcador;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmbarcador;
	protected JButton jButtonModificarToolBarEmbarcador;
	protected JButton jButtonActualizarToolBarEmbarcador;
    protected JButton jButtonEliminarToolBarEmbarcador;
	protected JButton jButtonCancelarToolBarEmbarcador;
    protected JButton jButtonGuardarCambiosToolBarEmbarcador;
	protected JButton jButtonGuardarCambiosTablaToolBarEmbarcador;
	protected JButton jButtonMostrarOcultarTablaToolBarEmbarcador;
	protected JButton jButtonCerrarToolBarEmbarcador;
	
	protected JButton jButtonProcesarInformacionToolBarEmbarcador;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmbarcador;
	protected JMenuItem jMenuItemModificarEmbarcador;
	protected JMenuItem jMenuItemActualizarEmbarcador;
    protected JMenuItem jMenuItemEliminarEmbarcador;
	protected JMenuItem jMenuItemCancelarEmbarcador;
    protected JMenuItem jMenuItemGuardarCambiosEmbarcador;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmbarcador;
	protected JMenuItem jMenuItemCerrarEmbarcador;
	protected JMenuItem jMenuItemDetalleCerrarEmbarcador;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmbarcador;
	
	protected JMenuItem jMenuItemProcesarInformacionEmbarcador;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmbarcador;
	protected JMenuItem jMenuItemMostrarOcultarEmbarcador;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmbarcador;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmbarcador;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmbarcador;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmbarcador;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmbarcador;
	public JLabel jLabelIdEmbarcador;
	public JLabel jLabelidEmbarcador;
	public JButton jButtonidEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPanelnombreEmbarcador;
	public JLabel jLabelnombreEmbarcador;
	public JTextField jTextFieldnombreEmbarcador;
	public JButton jButtonnombreEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPanelrucEmbarcador;
	public JLabel jLabelrucEmbarcador;
	public JTextField jTextFieldrucEmbarcador;
	public JButton jButtonrucEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPaneldireccionEmbarcador;
	public JLabel jLabeldireccionEmbarcador;
	public JTextArea jTextAreadireccionEmbarcador;
	public JScrollPane jscrollPanedireccionEmbarcador;
	public JButton jButtondireccionEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoEmbarcador;
	public JLabel jLabeltelefonoEmbarcador;
	public JTextField jTextFieldtelefonoEmbarcador;
	public JButton jButtontelefonoEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPanelcontactoEmbarcador;
	public JLabel jLabelcontactoEmbarcador;
	public JTextArea jTextAreacontactoEmbarcador;
	public JScrollPane jscrollPanecontactoEmbarcador;
	public JButton jButtoncontactoEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPanele_mailEmbarcador;
	public JLabel jLabele_mailEmbarcador;
	public JTextField jTextFielde_mailEmbarcador;
	public JButton jButtone_mailEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPanelfaxEmbarcador;
	public JLabel jLabelfaxEmbarcador;
	public JTextField jTextFieldfaxEmbarcador;
	public JButton jButtonfaxEmbarcadorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmbarcador;
	public JLabel jLabelid_empresaEmbarcador;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmbarcador;
	public JButton jButtonid_empresaEmbarcador= new JButtonMe();
	public JButton jButtonid_empresaEmbarcadorUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_via_transporteEmbarcador;
	public JLabel jLabelid_tipo_via_transporteEmbarcador;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteEmbarcador;
	public JButton jButtonid_tipo_via_transporteEmbarcador= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteEmbarcadorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPanelid_puertoEmbarcador;
	public JLabel jLabelid_puertoEmbarcador;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_puertoEmbarcador;
	public JButton jButtonid_puertoEmbarcador= new JButtonMe();
	public JButton jButtonid_puertoEmbarcadorUpdate= new JButtonMe();
	public JButton jButtonid_puertoEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEmbarcador;
	public JLabel jLabelid_empleadoEmbarcador;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmbarcador;
	public JButton jButtonid_empleadoEmbarcador= new JButtonMe();
	public JButton jButtonid_empleadoEmbarcadorUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPanelid_paisEmbarcador;
	public JLabel jLabelid_paisEmbarcador;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisEmbarcador;
	public JButton jButtonid_paisEmbarcador= new JButtonMe();
	public JButton jButtonid_paisEmbarcadorUpdate= new JButtonMe();
	public JButton jButtonid_paisEmbarcadorBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadEmbarcador;
	public JLabel jLabelid_ciudadEmbarcador;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadEmbarcador;
	public JButton jButtonid_ciudadEmbarcador= new JButtonMe();
	public JButton jButtonid_ciudadEmbarcadorUpdate= new JButtonMe();
	public JButton jButtonid_ciudadEmbarcadorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmbarcador;
	
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
	public int iHeightFormulario=1298;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmbarcadorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmbarcador=new JPanel();
				this.jPanelAccionesFormularioEmbarcador=new JPanel();
				this.jmenuBarDetalleEmbarcador=new JMenuBar();
				this.jTtoolBarDetalleEmbarcador=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmbarcadorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Embarcador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmbarcadorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Embarcador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmbarcadorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Embarcador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmbarcadorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Embarcador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmbarcadorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Embarcador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmbarcador() {
		return this.jButtonActualizarToolBarEmbarcador;
	}
	
	public JButton getjButtonEliminarToolBarEmbarcador() {
		return this.jButtonEliminarToolBarEmbarcador;
	}
	
	public JButton getjButtonCancelarToolBarEmbarcador() {
		return this.jButtonCancelarToolBarEmbarcador;
	}		
	
	public JButton getjButtonProcesarInformacionEmbarcador() {
		return this.jButtonProcesarInformacionEmbarcador;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmbarcador)	{
		this.jButtonProcesarInformacionEmbarcador = jButtonProcesarInformacionEmbarcador;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmbarcador() {
		return this.jComboBoxTiposAccionesEmbarcador;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmbarcador(
			JComboBox jComboBoxTiposRelacionesEmbarcador) {
		this.jComboBoxTiposRelacionesEmbarcador = jComboBoxTiposRelacionesEmbarcador;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmbarcador(
			JComboBox jComboBoxTiposAccionesEmbarcador) {
		this.jComboBoxTiposAccionesEmbarcador = jComboBoxTiposAccionesEmbarcador;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmbarcador() {
		return this.jComboBoxTiposAccionesFormularioEmbarcador;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmbarcador(
			JComboBox jComboBoxTiposAccionesFormularioEmbarcador) {
		this.jComboBoxTiposAccionesFormularioEmbarcador = jComboBoxTiposAccionesFormularioEmbarcador;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.embarcadorSessionBean=new EmbarcadorSessionBean();
		
		this.embarcadorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.embarcadorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.embarcadorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pedidocompraimporSessionBean=new PedidoCompraImporSessionBean();
		//this.parametrocompraSessionBean=new ParametroCompraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmbarcadorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Embarcador MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
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
	
		EmbarcadorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmbarcador= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmbarcador=new JButtonMe();
				this.jButtonModificarToolBarEmbarcador=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmbarcador,this.jTtoolBarDetalleEmbarcador,
							"actualizar","actualizar","Actualizar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmbarcador,this.jTtoolBarDetalleEmbarcador,
							"eliminar","eliminar","Eliminar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmbarcador,this.jTtoolBarDetalleEmbarcador,
							"cancelar","cancelar","Cancelar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmbarcador,this.jTtoolBarDetalleEmbarcador,
							"guardarcambios","guardarcambios","Guardar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmbarcador=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmbarcador=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmbarcador=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmbarcador=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmbarcador=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmbarcador= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmbarcador.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmbarcador,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmbarcador= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmbarcador.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmbarcador,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmbarcador= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmbarcador.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmbarcador,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmbarcador= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmbarcador.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmbarcador,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmbarcador= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmbarcador.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmbarcador,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmbarcador= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmbarcador.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmbarcador,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmbarcador= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmbarcador.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmbarcador,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmbarcador= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmbarcador.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmbarcador,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmbarcador= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmbarcador.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmbarcador,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmbarcador= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmbarcador.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmbarcador,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmbarcador.add(this.jMenuItemDetalleCerrarEmbarcador);
		
		this.jmenuDetalleAccionesEmbarcador.add(this.jMenuItemActualizarEmbarcador);
		this.jmenuDetalleAccionesEmbarcador.add(this.jMenuItemEliminarEmbarcador);
		this.jmenuDetalleAccionesEmbarcador.add(this.jMenuItemCancelarEmbarcador);		
		
		//this.jmenuDetalleDatosEmbarcador.add(this.jMenuItemDetalleAbrirOrderByEmbarcador);				
		this.jmenuDetalleDatosEmbarcador.add(this.jMenuItemDetalleMostarOcultarEmbarcador);				
				
		//this.jmenuDetalleAccionesEmbarcador.add(this.jMenuItemGuardarCambiosEmbarcador);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmbarcador.add(this.jmenuDetalleArchivoEmbarcador);		
		this.jmenuBarDetalleEmbarcador.add(this.jmenuDetalleAccionesEmbarcador);		
		this.jmenuBarDetalleEmbarcador.add(this.jmenuDetalleDatosEmbarcador);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEmbarcador.add(this.jmenuDetalleEmbarcador);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmbarcador);				
	}
	
	
	public void inicializarElementosCamposEmbarcador() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmbarcador = new JLabelMe();
		jLabelIdEmbarcador.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmbarcador = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmbarcador= new GridBagLayout();

		this.jPanelidEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);

		jLabelidEmbarcador = new JLabel();
		jLabelidEmbarcador.setText("Id");

		jLabelidEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreEmbarcador = new JLabelMe();
		this.jLabelnombreEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEmbarcador.setToolTipText("Nombre");
		this.jLabelnombreEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPanelnombreEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jTextFieldnombreEmbarcador= new JTextFieldMe();

		jTextFieldnombreEmbarcador.setEnabled(false);
		jTextFieldnombreEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreEmbarcadorBusqueda= new JButtonMe();
		this.jButtonnombreEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEmbarcadorBusqueda.setText("U");
		this.jButtonnombreEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEmbarcadorBusqueda.setVisible(false);		}


					
		this.jLabelrucEmbarcador = new JLabelMe();
		this.jLabelrucEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucEmbarcador.setToolTipText("Ruc");
		this.jLabelrucEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPanelrucEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jTextFieldrucEmbarcador= new JTextFieldMe();

		jTextFieldrucEmbarcador.setEnabled(false);
		jTextFieldrucEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucEmbarcadorBusqueda= new JButtonMe();
		this.jButtonrucEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucEmbarcadorBusqueda.setText("U");
		this.jButtonrucEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucEmbarcadorBusqueda.setVisible(false);		}


					
		this.jLabeldireccionEmbarcador = new JLabelMe();
		this.jLabeldireccionEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionEmbarcador.setToolTipText("Direccion");
		this.jLabeldireccionEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPaneldireccionEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jTextAreadireccionEmbarcador= new JTextAreaMe();
		jTextAreadireccionEmbarcador.setEnabled(false);
		jTextAreadireccionEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionEmbarcador.setLineWrap(true);
		jTextAreadireccionEmbarcador.setWrapStyleWord(true);
		jTextAreadireccionEmbarcador.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionEmbarcador.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionEmbarcador = new JScrollPane(jTextAreadireccionEmbarcador);
		jscrollPanedireccionEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccionEmbarcadorBusqueda= new JButtonMe();
		this.jButtondireccionEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionEmbarcadorBusqueda.setText("U");
		this.jButtondireccionEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionEmbarcadorBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoEmbarcador = new JLabelMe();
		this.jLabeltelefonoEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoEmbarcador.setToolTipText("Telefono");
		this.jLabeltelefonoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPaneltelefonoEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jTextFieldtelefonoEmbarcador= new JTextFieldMe();

		jTextFieldtelefonoEmbarcador.setEnabled(false);
		jTextFieldtelefonoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoEmbarcadorBusqueda= new JButtonMe();
		this.jButtontelefonoEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoEmbarcadorBusqueda.setText("U");
		this.jButtontelefonoEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoEmbarcadorBusqueda.setVisible(false);		}


					
		this.jLabelcontactoEmbarcador = new JLabelMe();
		this.jLabelcontactoEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_CONTACTO+" :");
		this.jLabelcontactoEmbarcador.setToolTipText("Contacto");
		this.jLabelcontactoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontactoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontactoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcontactoEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcontactoEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcontactoEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_CONTACTO);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPanelcontactoEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jTextAreacontactoEmbarcador= new JTextAreaMe();
		jTextAreacontactoEmbarcador.setEnabled(false);
		jTextAreacontactoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoEmbarcador.setLineWrap(true);
		jTextAreacontactoEmbarcador.setWrapStyleWord(true);
		jTextAreacontactoEmbarcador.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacontactoEmbarcador.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacontactoEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecontactoEmbarcador = new JScrollPane(jTextAreacontactoEmbarcador);
		jscrollPanecontactoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecontactoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecontactoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncontactoEmbarcadorBusqueda= new JButtonMe();
		this.jButtoncontactoEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontactoEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontactoEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncontactoEmbarcadorBusqueda.setText("U");
		this.jButtoncontactoEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncontactoEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncontactoEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacontactoEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacontactoEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"contactoEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncontactoEmbarcadorBusqueda.setVisible(false);		}


					
		this.jLabele_mailEmbarcador = new JLabelMe();
		this.jLabele_mailEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_EMAIL+" :");
		this.jLabele_mailEmbarcador.setToolTipText("E Mail");
		this.jLabele_mailEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabele_mailEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanele_mailEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanele_mailEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPanele_mailEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jTextFielde_mailEmbarcador= new JTextFieldMe();

		jTextFielde_mailEmbarcador.setEnabled(false);
		jTextFielde_mailEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielde_mailEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielde_mailEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielde_mailEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtone_mailEmbarcadorBusqueda= new JButtonMe();
		this.jButtone_mailEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtone_mailEmbarcadorBusqueda.setText("U");
		this.jButtone_mailEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtone_mailEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtone_mailEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielde_mailEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielde_mailEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"e_mailEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtone_mailEmbarcadorBusqueda.setVisible(false);		}


					
		this.jLabelfaxEmbarcador = new JLabelMe();
		this.jLabelfaxEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_FAX+" :");
		this.jLabelfaxEmbarcador.setToolTipText("Fax");
		this.jLabelfaxEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfaxEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfaxEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfaxEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfaxEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfaxEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_FAX);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPanelfaxEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jTextFieldfaxEmbarcador= new JTextFieldMe();

		jTextFieldfaxEmbarcador.setEnabled(false);
		jTextFieldfaxEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfaxEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfaxEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfaxEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonfaxEmbarcadorBusqueda= new JButtonMe();
		this.jButtonfaxEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfaxEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfaxEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfaxEmbarcadorBusqueda.setText("U");
		this.jButtonfaxEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfaxEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfaxEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfaxEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfaxEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"faxEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfaxEmbarcadorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmbarcador() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmbarcador = new JLabelMe();
		this.jLabelid_empresaEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmbarcador.setToolTipText("Empresa");
		this.jLabelid_empresaEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPanelid_empresaEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jComboBoxid_empresaEmbarcador= new JComboBoxMe();
		jComboBoxid_empresaEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmbarcador.setEnabled(false);

		this.jButtonid_empresaEmbarcador= new JButtonMe();
		this.jButtonid_empresaEmbarcador.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmbarcador.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmbarcador.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmbarcador.setText("Buscar");
		this.jButtonid_empresaEmbarcador.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmbarcador.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmbarcador,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmbarcador"));

		this.jButtonid_empresaEmbarcadorBusqueda= new JButtonMe();
		this.jButtonid_empresaEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmbarcadorBusqueda.setText("U");
		this.jButtonid_empresaEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmbarcadorBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmbarcadorUpdate= new JButtonMe();
		this.jButtonid_empresaEmbarcadorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmbarcadorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmbarcadorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmbarcadorUpdate.setText("U");
		this.jButtonid_empresaEmbarcadorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmbarcadorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmbarcadorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmbarcadorUpdate"));



					
		this.jLabelid_tipo_via_transporteEmbarcador = new JLabelMe();
		this.jLabelid_tipo_via_transporteEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE+" : *");
		this.jLabelid_tipo_via_transporteEmbarcador.setToolTipText("Tipo Via Transporte");
		this.jLabelid_tipo_via_transporteEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transporteEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transporteEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_via_transporteEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_via_transporteEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPanelid_tipo_via_transporteEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jComboBoxid_tipo_via_transporteEmbarcador= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_via_transporteEmbarcador= new JButtonMe();
		this.jButtonid_tipo_via_transporteEmbarcador.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteEmbarcador.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteEmbarcador.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteEmbarcador.setText("Buscar");
		this.jButtonid_tipo_via_transporteEmbarcador.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_via_transporteEmbarcador.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteEmbarcador,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_via_transporteEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteEmbarcador"));

		this.jButtonid_tipo_via_transporteEmbarcadorBusqueda= new JButtonMe();
		this.jButtonid_tipo_via_transporteEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteEmbarcadorBusqueda.setText("U");
		this.jButtonid_tipo_via_transporteEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_via_transporteEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_via_transporteEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_via_transporteEmbarcadorBusqueda.setVisible(false);		}

		this.jButtonid_tipo_via_transporteEmbarcadorUpdate= new JButtonMe();
		this.jButtonid_tipo_via_transporteEmbarcadorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteEmbarcadorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteEmbarcadorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteEmbarcadorUpdate.setText("U");
		this.jButtonid_tipo_via_transporteEmbarcadorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_via_transporteEmbarcadorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteEmbarcadorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_via_transporteEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteEmbarcadorUpdate"));



					
		this.jLabelid_puertoEmbarcador = new JLabelMe();
		this.jLabelid_puertoEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_IDPUERTO+" : *");
		this.jLabelid_puertoEmbarcador.setToolTipText("Puerto");
		this.jLabelid_puertoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_puertoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_puertoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_puertoEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_puertoEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_puertoEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_IDPUERTO);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPanelid_puertoEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jComboBoxid_puertoEmbarcador= new JComboBoxMe();
		jComboBoxid_puertoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_puertoEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_puertoEmbarcador= new JButtonMe();
		this.jButtonid_puertoEmbarcador.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puertoEmbarcador.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puertoEmbarcador.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puertoEmbarcador.setText("Buscar");
		this.jButtonid_puertoEmbarcador.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_puertoEmbarcador.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puertoEmbarcador,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_puertoEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puertoEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puertoEmbarcador"));

		this.jButtonid_puertoEmbarcadorBusqueda= new JButtonMe();
		this.jButtonid_puertoEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_puertoEmbarcadorBusqueda.setText("U");
		this.jButtonid_puertoEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_puertoEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puertoEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_puertoEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puertoEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puertoEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_puertoEmbarcadorBusqueda.setVisible(false);		}

		this.jButtonid_puertoEmbarcadorUpdate= new JButtonMe();
		this.jButtonid_puertoEmbarcadorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoEmbarcadorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoEmbarcadorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_puertoEmbarcadorUpdate.setText("U");
		this.jButtonid_puertoEmbarcadorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_puertoEmbarcadorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puertoEmbarcadorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_puertoEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puertoEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puertoEmbarcadorUpdate"));



					
		this.jLabelid_empleadoEmbarcador = new JLabelMe();
		this.jLabelid_empleadoEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmbarcador.setToolTipText("Empleado");
		this.jLabelid_empleadoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPanelid_empleadoEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jComboBoxid_empleadoEmbarcador= new JComboBoxMe();
		jComboBoxid_empleadoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmbarcador= new JButtonMe();
		this.jButtonid_empleadoEmbarcador.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmbarcador.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmbarcador.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmbarcador.setText("Buscar");
		this.jButtonid_empleadoEmbarcador.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmbarcador.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmbarcador,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmbarcador"));

		this.jButtonid_empleadoEmbarcadorBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmbarcadorBusqueda.setText("U");
		this.jButtonid_empleadoEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmbarcadorBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmbarcadorUpdate= new JButtonMe();
		this.jButtonid_empleadoEmbarcadorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmbarcadorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmbarcadorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmbarcadorUpdate.setText("U");
		this.jButtonid_empleadoEmbarcadorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmbarcadorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmbarcadorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmbarcadorUpdate"));



					
		this.jLabelid_paisEmbarcador = new JLabelMe();
		this.jLabelid_paisEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisEmbarcador.setToolTipText("Pais");
		this.jLabelid_paisEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPanelid_paisEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jComboBoxid_paisEmbarcador= new JComboBoxMe();
		jComboBoxid_paisEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisEmbarcador= new JButtonMe();
		this.jButtonid_paisEmbarcador.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEmbarcador.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEmbarcador.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEmbarcador.setText("Buscar");
		this.jButtonid_paisEmbarcador.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisEmbarcador.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEmbarcador,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEmbarcador"));

		this.jButtonid_paisEmbarcadorBusqueda= new JButtonMe();
		this.jButtonid_paisEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisEmbarcadorBusqueda.setText("U");
		this.jButtonid_paisEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisEmbarcadorBusqueda.setVisible(false);		}

		this.jButtonid_paisEmbarcadorUpdate= new JButtonMe();
		this.jButtonid_paisEmbarcadorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmbarcadorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmbarcadorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisEmbarcadorUpdate.setText("U");
		this.jButtonid_paisEmbarcadorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisEmbarcadorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEmbarcadorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEmbarcadorUpdate"));



					
		this.jLabelid_ciudadEmbarcador = new JLabelMe();
		this.jLabelid_ciudadEmbarcador.setText(""+EmbarcadorConstantesFunciones.LABEL_IDCIUDAD+" :");
		this.jLabelid_ciudadEmbarcador.setToolTipText("Ciudad");
		this.jLabelid_ciudadEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadEmbarcador.setToolTipText(EmbarcadorConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutEmbarcador = new GridBagLayout();
		this.jPanelid_ciudadEmbarcador.setLayout(this.gridaBagLayoutEmbarcador);


		jComboBoxid_ciudadEmbarcador= new JComboBoxMe();
		jComboBoxid_ciudadEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadEmbarcador= new JButtonMe();
		this.jButtonid_ciudadEmbarcador.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEmbarcador.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEmbarcador.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEmbarcador.setText("Buscar");
		this.jButtonid_ciudadEmbarcador.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadEmbarcador.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEmbarcador,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEmbarcador"));

		this.jButtonid_ciudadEmbarcadorBusqueda= new JButtonMe();
		this.jButtonid_ciudadEmbarcadorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmbarcadorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmbarcadorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadEmbarcadorBusqueda.setText("U");
		this.jButtonid_ciudadEmbarcadorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadEmbarcadorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEmbarcadorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEmbarcadorBusqueda"));

		if(this.embarcadorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadEmbarcadorBusqueda.setVisible(false);		}

		this.jButtonid_ciudadEmbarcadorUpdate= new JButtonMe();
		this.jButtonid_ciudadEmbarcadorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmbarcadorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmbarcadorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadEmbarcadorUpdate.setText("U");
		this.jButtonid_ciudadEmbarcadorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadEmbarcadorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEmbarcadorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEmbarcadorUpdate"));



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
		//this.jInternalFrameDetalleEmbarcador = new EmbarcadorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Embarcador DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmbarcador= new GridBagLayout();
		

		
		String sToolTipEmbarcador="";
		sToolTipEmbarcador=EmbarcadorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmbarcador+="(Inventario.Embarcador)";
		}
		
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmbarcador+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmbarcador = new JButtonMe();
		this.jButtonModificarEmbarcador = new JButtonMe();
        this.jButtonActualizarEmbarcador = new JButtonMe();
        this.jButtonEliminarEmbarcador = new JButtonMe();
        this.jButtonCancelarEmbarcador = new JButtonMe();
        this.jButtonGuardarCambiosEmbarcador = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmbarcador = new JButtonMe();
		this.jButtonCerrarEmbarcador = new JButtonMe();
		
		this.jScrollPanelDatosEmbarcador = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmbarcador = new JScrollPane();
		this.jScrollPanelDatosGeneralEmbarcador = new JScrollPane();
				
		
		
		this.jPanelCamposEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Embarcador";
		
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Embarcadores" + this.sPath));
		} else {
			this.jScrollPanelDatosEmbarcador.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmbarcador.setName("jPanelCamposEmbarcador"); 

		this.jPanelCamposOcultosEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmbarcador.setName("jPanelCamposOcultosEmbarcador"); 

        this.jPanelAccionesEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmbarcador.setToolTipText("Acciones");
        this.jPanelAccionesEmbarcador.setName("Acciones"); 

		this.jPanelAccionesFormularioEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmbarcador.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmbarcador.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmbarcador.setText("Nuevo");
		this.jButtonModificarEmbarcador.setText("Editar");
        this.jButtonActualizarEmbarcador.setText("Actualizar");
        this.jButtonEliminarEmbarcador.setText("Eliminar");
        this.jButtonCancelarEmbarcador.setText("Cancelar");
        this.jButtonGuardarCambiosEmbarcador.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmbarcador.setText("Guardar");
		this.jButtonCerrarEmbarcador.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmbarcador,"nuevo_button","Nuevo",this.embarcadorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmbarcador,"modificar_button","Editar",this.embarcadorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmbarcador,"actualizar_button","Actualizar",this.embarcadorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmbarcador,"eliminar_button","Eliminar",this.embarcadorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmbarcador,"cancelar_button","Cancelar",this.embarcadorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmbarcador,"guardarcambios_button","Guardar",this.embarcadorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmbarcador,"guardarcambiostabla_button","Guardar",this.embarcadorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmbarcador,"cerrar_button","Salir",this.embarcadorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmbarcador.setToolTipText("Nuevo"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmbarcador.setToolTipText("Editar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmbarcador.setToolTipText("Actualizar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmbarcador.setToolTipText("Eliminar)"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmbarcador.setToolTipText("Cancelar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmbarcador.setToolTipText("Guardar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmbarcador.setToolTipText("Guardar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmbarcador.setToolTipText("Salir"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmbarcador";
		inputMap = this.jButtonNuevoEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmbarcador.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmbarcador"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmbarcador";
		inputMap = this.jButtonActualizarEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmbarcador"));
		
		//ELIMINAR
		sMapKey = "EliminarEmbarcador";
		inputMap = this.jButtonEliminarEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmbarcador"));
		
		//CANCELAR	
		sMapKey = "CancelarEmbarcador";
		inputMap = this.jButtonCancelarEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmbarcador"));
		
		//CERRAR		
		sMapKey = "CerrarEmbarcador";
		inputMap = this.jButtonCerrarEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmbarcador"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmbarcador";
		inputMap = this.jButtonGuardarCambiosTablaEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmbarcador"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmbarcador = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmbarcador.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmbarcador.setToolTipText("Nuevo Embarcador");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmbarcador = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmbarcador.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmbarcador.setToolTipText("Sin Cerrar Ventana Embarcador");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmbarcador = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmbarcador.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmbarcador.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmbarcador = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmbarcador.setText("Accion");
		this.jComboBoxTiposAccionesEmbarcador.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmbarcador = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmbarcador.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmbarcador.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmbarcador = new JLabelMe();
		
		this.jLabelAccionesEmbarcador.setText("Acciones");		
		this.jLabelAccionesEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmbarcador();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmbarcador();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmbarcador=new JTabbedPane();
		this.jTabbedPaneRelacionesEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmbarcador,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmbarcador.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmbarcador.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmbarcador.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmbarcador.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmbarcador.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmbarcador.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmbarcador = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmbarcador = new GridBagLayout();
		
		this.jPanelCamposEmbarcador.setLayout(gridaBagLayoutCamposEmbarcador);
		this.jPanelCamposOcultosEmbarcador.setLayout(gridaBagLayoutCamposOcultosEmbarcador);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmbarcador.add(jLabelIdEmbarcador, this.gridBagConstraintsEmbarcador);



	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmbarcador.add(jLabelidEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmbarcador.add(jLabelid_empresaEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmbarcador.add(jButtonid_empresaEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 3;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmbarcador.add(jButtonid_empresaEmbarcadorUpdate, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmbarcador.add(jComboBoxid_empresaEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEmbarcador.add(jLabelnombreEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEmbarcador.add(jButtonnombreEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEmbarcador.add(jTextFieldnombreEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucEmbarcador.add(jLabelrucEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucEmbarcador.add(jButtonrucEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucEmbarcador.add(jTextFieldrucEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionEmbarcador.add(jLabeldireccionEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionEmbarcador.add(jButtondireccionEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionEmbarcador.add(jscrollPanedireccionEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoEmbarcador.add(jLabeltelefonoEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoEmbarcador.add(jButtontelefonoEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoEmbarcador.add(jTextFieldtelefonoEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcontactoEmbarcador.add(jLabelcontactoEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelcontactoEmbarcador.add(jButtoncontactoEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcontactoEmbarcador.add(jscrollPanecontactoEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanele_mailEmbarcador.add(jLabele_mailEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanele_mailEmbarcador.add(jButtone_mailEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanele_mailEmbarcador.add(jTextFielde_mailEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfaxEmbarcador.add(jLabelfaxEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelfaxEmbarcador.add(jButtonfaxEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfaxEmbarcador.add(jTextFieldfaxEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_via_transporteEmbarcador.add(jLabelid_tipo_via_transporteEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteEmbarcador.add(jButtonid_tipo_via_transporteEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 3;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteEmbarcador.add(jButtonid_tipo_via_transporteEmbarcadorUpdate, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_via_transporteEmbarcador.add(jComboBoxid_tipo_via_transporteEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_puertoEmbarcador.add(jLabelid_puertoEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_puertoEmbarcador.add(jButtonid_puertoEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 3;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_puertoEmbarcador.add(jButtonid_puertoEmbarcadorUpdate, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_puertoEmbarcador.add(jComboBoxid_puertoEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmbarcador.add(jLabelid_empleadoEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 2;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoEmbarcador.add(jButtonid_empleadoEmbarcador, this.gridBagConstraintsEmbarcador);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 3;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmbarcador.add(jButtonid_empleadoEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 4;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmbarcador.add(jButtonid_empleadoEmbarcadorUpdate, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmbarcador.add(jComboBoxid_empleadoEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisEmbarcador.add(jLabelid_paisEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisEmbarcador.add(jButtonid_paisEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 3;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisEmbarcador.add(jButtonid_paisEmbarcadorUpdate, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisEmbarcador.add(jComboBoxid_paisEmbarcador, this.gridBagConstraintsEmbarcador);


	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 0;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadEmbarcador.add(jLabelid_ciudadEmbarcador, this.gridBagConstraintsEmbarcador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 2;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadEmbarcador.add(jButtonid_ciudadEmbarcadorBusqueda, this.gridBagConstraintsEmbarcador);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 3;
		this.gridBagConstraintsEmbarcador.ipadx = 0;
		this.gridBagConstraintsEmbarcador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadEmbarcador.add(jButtonid_ciudadEmbarcadorUpdate, this.gridBagConstraintsEmbarcador);
	}

	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmbarcador.gridy = 0;
	this.gridBagConstraintsEmbarcador.gridx = 1;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadEmbarcador.add(jComboBoxid_ciudadEmbarcador, this.gridBagConstraintsEmbarcador);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPanelidEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPanelnombreEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPanelrucEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPaneldireccionEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPaneltelefonoEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPanelcontactoEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPanele_mailEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPanelfaxEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPanelid_tipo_via_transporteEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPanelid_puertoEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPanelid_empleadoEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPanelid_paisEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmbarcador.add(this.jPanelid_ciudadEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposEmbarcador % 1==0) {
		iXPanelCamposEmbarcador=0;
		iYPanelCamposEmbarcador++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmbarcador.gridy = iYPanelCamposOcultosEmbarcador;
	this.gridBagConstraintsEmbarcador.gridx = iXPanelCamposOcultosEmbarcador++;
	this.gridBagConstraintsEmbarcador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmbarcador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmbarcador.add(this.jPanelid_empresaEmbarcador, this.gridBagConstraintsEmbarcador);



	if(iXPanelCamposOcultosEmbarcador % 1==0) {
		iXPanelCamposOcultosEmbarcador=0;
		iYPanelCamposOcultosEmbarcador++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmbarcador= new GridBagLayout();
		this.jPanelAccionesEmbarcador.setLayout(gridaBagLayoutAccionesEmbarcador);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmbarcador= new GridBagLayout();
		this.jPanelAccionesFormularioEmbarcador.setLayout(gridaBagLayoutAccionesFormularioEmbarcador);
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmbarcador.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmbarcador.add(this.jComboBoxTiposAccionesFormularioEmbarcador, this.gridBagConstraintsEmbarcador);

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmbarcador.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmbarcador.add(this.jCheckBoxPostAccionNuevoEmbarcador, this.gridBagConstraintsEmbarcador);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.embarcadorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmbarcador.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmbarcador.add(this.jCheckBoxPostAccionSinCerrarEmbarcador, this.gridBagConstraintsEmbarcador);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.embarcadorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmbarcador.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmbarcador.add(this.jCheckBoxPostAccionSinMensajeEmbarcador, this.gridBagConstraintsEmbarcador);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmbarcador.add(this.jButtonModificarEmbarcador, this.gridBagConstraintsEmbarcador);							

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmbarcador.add(this.jButtonEliminarEmbarcador, this.gridBagConstraintsEmbarcador);
		
			
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = 0;		
		this.gridBagConstraintsEmbarcador.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmbarcador.add(this.jButtonActualizarEmbarcador, this.gridBagConstraintsEmbarcador);


		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = 0;		
		this.gridBagConstraintsEmbarcador.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmbarcador.add(this.jButtonGuardarCambiosEmbarcador, this.gridBagConstraintsEmbarcador);	
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = 0;		
		this.gridBagConstraintsEmbarcador.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmbarcador.add(this.jButtonCancelarEmbarcador, this.gridBagConstraintsEmbarcador);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmbarcador = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmbarcador);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();						
			this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmbarcador.gridx = 0;		
			//this.gridBagConstraintsEmbarcador.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmbarcador.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmbarcador.gridx =0;
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmbarcador.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmbarcador, this.gridBagConstraintsEmbarcador);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmbarcadorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmbarcador = new EmbarcadorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Embarcador DATOS");
			
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
			
	        //this.setTitle("[FOR] - Embarcador DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Embarcador Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmbarcadorModel embarcadorModel=new EmbarcadorModel(this);
			
			//SI USARA CLASE INTERNA
			//EmbarcadorModel.EmbarcadorFocusTraversalPolicy embarcadorFocusTraversalPolicy = embarcadorModel.new EmbarcadorFocusTraversalPolicy(this);
			
			//embarcadorFocusTraversalPolicy.setembarcadorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(embarcadorModel);
			
			
			this.jContentPaneDetalleEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmbarcador = new GridBagLayout();	
			this.jContentPaneDetalleEmbarcador.setLayout(gridaBagLayoutDetalleEmbarcador);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmbarcador = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmbarcador = new GridBagConstraints();
				this.gridBagConstraintsEmbarcador.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmbarcador.gridx = 0;
					
				
				this.jContentPaneDetalleEmbarcador.add(jTtoolBarDetalleEmbarcador, gridBagConstraintsEmbarcador);								
				
}
			
			this.jScrollPanelDatosEdicionEmbarcador=   new JScrollPane(jContentPaneDetalleEmbarcador,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmbarcador.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmbarcador.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmbarcador.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmbarcador=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmbarcador.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmbarcador.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmbarcador.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmbarcador.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmbarcador.gridx = 0;
	        
			this.jContentPaneDetalleEmbarcador.add(jPanelCamposEmbarcador, gridBagConstraintsEmbarcador);
			
			
			
			
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
						&& embarcadorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroCompra(this.puedeCargarPorParteParametroCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoCompraImpor(this.puedeCargarPorPartePedidoCompraImpor,false,-1);
					
					if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmbarcador= new GridBagConstraints();
						this.gridBagConstraintsEmbarcador.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmbarcador.gridx = 0;
						this.jContentPaneDetalleEmbarcador.add(this.jTabbedPaneRelacionesEmbarcador, this.gridBagConstraintsEmbarcador);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmbarcador.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoCompraImpor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmbarcador.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmbarcador = new GridBagConstraints();
					this.gridBagConstraintsEmbarcador.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmbarcador.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmbarcador.gridx = 0;
					
				
					this.jContentPaneDetalleEmbarcador.add(jPanelCamposOcultosEmbarcador, gridBagConstraintsEmbarcador);
				
					this.jPanelCamposOcultosEmbarcador.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsEmbarcador.gridx = 0;
	        this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmbarcador.add(this.jPanelAccionesFormularioEmbarcador, this.gridBagConstraintsEmbarcador);							
			
			
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
	        this.gridBagConstraintsEmbarcador.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsEmbarcador.gridx = 0;
	        
			
			this.jContentPaneDetalleEmbarcador.add(this.jPanelAccionesEmbarcador, this.gridBagConstraintsEmbarcador);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmbarcador);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmbarcador=   new JScrollPane(this.jPanelCamposEmbarcador,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmbarcador.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmbarcador.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmbarcador.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmbarcador.gridx = 0;
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmbarcador.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmbarcador, this.gridBagConstraintsEmbarcador);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmbarcador.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmbarcador, this.gridBagConstraintsEmbarcador);			
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmbarcador.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmbarcador, this.gridBagConstraintsEmbarcador);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmbarcador.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmbarcador, this.gridBagConstraintsEmbarcador);
			
			
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmbarcador.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmbarcador, this.gridBagConstraintsEmbarcador);
		
			
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmbarcador.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmbarcador, this.gridBagConstraintsEmbarcador);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmbarcador;//jContentPane;
		
		return jScrollPanelDatosEdicionEmbarcador;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocompraSessionBean=new ParametroCompraSessionBean();
		this.parametrocompraSessionBean.setConGuardarRelaciones(false);
		this.parametrocompraSessionBean.setEsGuardarRelacionado(true);

		this.parametrocompraBeanSwingJInternalFrame=null;//new ParametroCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocompraBeanSwingJInternalFramePopup=new ParametroCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocompraSessionBean.getEsGuardarRelacionado()) {

				ParametroCompraJInternalFrame.STIPO_TAMANIO_GENERAL=EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocompraSessionBean.setEsGuardarRelacionado(true);

				this.parametrocompraBeanSwingJInternalFrame=new ParametroCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocompraBeanSwingJInternalFrame.setparametrocompraSessionBean(this.parametrocompraSessionBean);

				//this.gridBagConstraintsEmbarcador = new GridBagConstraints();
				//this.gridBagConstraintsEmbarcador.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmbarcador.gridx = 0;
				//this.jContentPaneDetalleEmbarcador.add(this.parametrocompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmbarcador);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmbarcador.add("Parametro Compraes",this.parametrocompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmbarcador.setComponentAt(iIndexTab,this.parametrocompraBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocompraSessionBean.setEsGuardarRelacionado(false);
				this.parametrocompraBeanSwingJInternalFrame=null;//new ParametroCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCompra) {
					this.jTabbedPaneRelacionesEmbarcador.add("Parametro Compraes",new JPanel());
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

				PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL=EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidocompraimporSessionBean.setEsGuardarRelacionado(true);

				this.pedidocompraimporBeanSwingJInternalFrame=new PedidoCompraImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidocompraimporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidocompraimporBeanSwingJInternalFrame.setpedidocompraimporSessionBean(this.pedidocompraimporSessionBean);

				//this.gridBagConstraintsEmbarcador = new GridBagConstraints();
				//this.gridBagConstraintsEmbarcador.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmbarcador.gridx = 0;
				//this.jContentPaneDetalleEmbarcador.add(this.pedidocompraimporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmbarcador);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmbarcador.add("Pedido Compras",this.pedidocompraimporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmbarcador.setComponentAt(iIndexTab,this.pedidocompraimporBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidocompraimporSessionBean.setEsGuardarRelacionado(false);
				this.pedidocompraimporBeanSwingJInternalFrame=null;//new PedidoCompraImporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoCompraImpor) {
					this.jTabbedPaneRelacionesEmbarcador.add("Pedido Compras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPedidoCompraImporBeanSwingJInternalFrame(List<Embarcador> embarcadors,Embarcador embarcador,PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidocompraimporBeanSwingJInternalFrame=new PedidoCompraImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidocompraimporBeanSwingJInternalFrame.getPedidoCompraImporLogic().setConnexion(this.embarcadorLogic.getConnexion());

					pedidocompraimporBeanSwingJInternalFrame.setembarcadorsForeignKey(embarcadors);
					pedidocompraimporBeanSwingJInternalFrame.setembarcadorForeignKey(embarcador);
					pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setisBusquedaDesdeForeignKeySesionEmbarcador(true);
					pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setlidEmbarcadorActual(embarcador.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidocompraimporBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoCompraImpor(pedidocompraimporBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidocompraimporBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmbarcador(true);
					pedidocompraimporBeanSwingJInternalFrame.setid_embarcadorFK_IdEmbarcador(embarcador.getId());

					if(!this.conCargarFormDetalle) {
						pedidocompraimporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidocompraimporBeanSwingJInternalFrame.setSelectedItemCombosFrameEmbarcadorForeignKey(embarcador,1,false,true,true);
					pedidocompraimporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidocompraimporBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmbarcador");
					pedidocompraimporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmbarcador");
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

		public void cargarParametroCompraBeanSwingJInternalFrame(List<Embarcador> embarcadors,Embarcador embarcador,ParametroCompraBeanSwingJInternalFrame parametrocompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocompraBeanSwingJInternalFrame=new ParametroCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocompraBeanSwingJInternalFrame.getParametroCompraLogic().setConnexion(this.embarcadorLogic.getConnexion());

					parametrocompraBeanSwingJInternalFrame.setembarcadorsForeignKey(embarcadors);
					parametrocompraBeanSwingJInternalFrame.setembarcadorForeignKey(embarcador);
					parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setisBusquedaDesdeForeignKeySesionEmbarcador(true);
					parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setlidEmbarcadorActual(embarcador.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocompraBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCompra(parametrocompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmbarcador(true);
					parametrocompraBeanSwingJInternalFrame.setid_embarcadorFK_IdEmbarcador(embarcador.getId());

					if(!this.conCargarFormDetalle) {
						parametrocompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocompraBeanSwingJInternalFrame.setSelectedItemCombosFrameEmbarcadorForeignKey(embarcador,1,false,true,true);
					parametrocompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmbarcador");
					parametrocompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmbarcador");
					parametrocompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCompra(true);
					parametrocompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCompra("n",parametrocompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocompraBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocompraBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCompra("relacionado");
					} else {
						parametrocompraBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCompra("no_relacionado");
					}

					parametrocompraBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCompra().setVisible(false);

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
