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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TransportistaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TransportistaDetalleFormJInternalFrame extends TransportistaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransportista;
	
	protected JMenuBar jmenuBarDetalleTransportista;
	
	protected JMenu jmenuDetalleTransportista;
	protected JMenu jmenuDetalleArchivoTransportista;
	protected JMenu jmenuDetalleAccionesTransportista;
	protected JMenu jmenuDetalleDatosTransportista;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransportista;	
	protected GridBagConstraints gridBagConstraintsTransportista;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransportistaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransportista;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public TransportistaSessionBean transportistaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public TransportistaLogic transportistaLogic;
	
	public JScrollPane jScrollPanelDatosTransportista;
	public JScrollPane jScrollPanelDatosEdicionTransportista;
	public JScrollPane jScrollPanelDatosGeneralTransportista;
	
	protected JPanel jPanelCamposTransportista;    
	protected JPanel jPanelCamposOcultosTransportista;    	
	protected JPanel jPanelAccionesTransportista;
	protected JPanel jPanelAccionesFormularioTransportista;
    
	
	
	protected Integer iXPanelCamposTransportista=0;
	protected Integer iYPanelCamposTransportista=0;
	
	protected Integer iXPanelCamposOcultosTransportista=0;
	protected Integer iYPanelCamposOcultosTransportista=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransportista;
	public JButton jButtonModificarTransportista;
	public JButton jButtonActualizarTransportista;
    public JButton jButtonEliminarTransportista;
	public JButton jButtonCancelarTransportista;
    public JButton jButtonGuardarCambiosTransportista;
	public JButton jButtonGuardarCambiosTablaTransportista;
	protected JButton jButtonCerrarTransportista;
	
	
	protected JButton jButtonProcesarInformacionTransportista;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransportista;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransportista;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransportista;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransportista;
	protected JButton jButtonModificarToolBarTransportista;
	protected JButton jButtonActualizarToolBarTransportista;
    protected JButton jButtonEliminarToolBarTransportista;
	protected JButton jButtonCancelarToolBarTransportista;
    protected JButton jButtonGuardarCambiosToolBarTransportista;
	protected JButton jButtonGuardarCambiosTablaToolBarTransportista;
	protected JButton jButtonMostrarOcultarTablaToolBarTransportista;
	protected JButton jButtonCerrarToolBarTransportista;
	
	protected JButton jButtonProcesarInformacionToolBarTransportista;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransportista;
	protected JMenuItem jMenuItemModificarTransportista;
	protected JMenuItem jMenuItemActualizarTransportista;
    protected JMenuItem jMenuItemEliminarTransportista;
	protected JMenuItem jMenuItemCancelarTransportista;
    protected JMenuItem jMenuItemGuardarCambiosTransportista;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransportista;
	protected JMenuItem jMenuItemCerrarTransportista;
	protected JMenuItem jMenuItemDetalleCerrarTransportista;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransportista;
	
	protected JMenuItem jMenuItemProcesarInformacionTransportista;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransportista;
	protected JMenuItem jMenuItemMostrarOcultarTransportista;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransportista;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransportista;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransportista;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransportista;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransportista;
	public JLabel jLabelIdTransportista;
	public JLabel jLabelidTransportista;
	public JButton jButtonidTransportistaBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionTransportista;
	public JLabel jLabelidentificacionTransportista;
	public JTextField jTextFieldidentificacionTransportista;
	public JButton jButtonidentificacionTransportistaBusqueda= new JButtonMe();

	public JPanel jPanelrucTransportista;
	public JLabel jLabelrucTransportista;
	public JTextField jTextFieldrucTransportista;
	public JButton jButtonrucTransportistaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTransportista;
	public JLabel jLabelnombreTransportista;
	public JTextArea jTextAreanombreTransportista;
	public JScrollPane jscrollPanenombreTransportista;
	public JButton jButtonnombreTransportistaBusqueda= new JButtonMe();

	public JPanel jPanelapellidoTransportista;
	public JLabel jLabelapellidoTransportista;
	public JTextArea jTextAreaapellidoTransportista;
	public JScrollPane jscrollPaneapellidoTransportista;
	public JButton jButtonapellidoTransportistaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoTransportista;
	public JLabel jLabelnombre_completoTransportista;
	public JTextArea jTextAreanombre_completoTransportista;
	public JScrollPane jscrollPanenombre_completoTransportista;
	public JButton jButtonnombre_completoTransportistaBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoTransportista;
	public JLabel jLabeltelefonoTransportista;
	public JTextField jTextFieldtelefonoTransportista;
	public JButton jButtontelefonoTransportistaBusqueda= new JButtonMe();

	public JPanel jPaneldireccionTransportista;
	public JLabel jLabeldireccionTransportista;
	public JTextArea jTextAreadireccionTransportista;
	public JScrollPane jscrollPanedireccionTransportista;
	public JButton jButtondireccionTransportistaBusqueda= new JButtonMe();

	public JPanel jPanelplacaTransportista;
	public JLabel jLabelplacaTransportista;
	public JTextField jTextFieldplacaTransportista;
	public JButton jButtonplacaTransportistaBusqueda= new JButtonMe();

	public JPanel jPanelnumeroTransportista;
	public JLabel jLabelnumeroTransportista;
	public JTextField jTextFieldnumeroTransportista;
	public JButton jButtonnumeroTransportistaBusqueda= new JButtonMe();

	public JPanel jPanelobservacionTransportista;
	public JLabel jLabelobservacionTransportista;
	public JTextArea jTextAreaobservacionTransportista;
	public JScrollPane jscrollPaneobservacionTransportista;
	public JButton jButtonobservacionTransportistaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTransportista;
	public JLabel jLabelid_empresaTransportista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTransportista;
	public JButton jButtonid_empresaTransportista= new JButtonMe();
	public JButton jButtonid_empresaTransportistaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTransportistaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTransportista;
	public JLabel jLabelid_sucursalTransportista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTransportista;
	public JButton jButtonid_sucursalTransportista= new JButtonMe();
	public JButton jButtonid_sucursalTransportistaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTransportistaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_via_transporteTransportista;
	public JLabel jLabelid_tipo_via_transporteTransportista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteTransportista;
	public JButton jButtonid_tipo_via_transporteTransportista= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteTransportistaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteTransportistaBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteTransportista;
	public JLabel jLabelid_clienteTransportista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteTransportista;
	public JButton jButtonid_clienteTransportista= new JButtonMe();
	public JButton jButtonid_clienteTransportistaUpdate= new JButtonMe();
	public JButton jButtonid_clienteTransportistaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransportista;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=836;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransportistaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransportista=new JPanel();
				this.jPanelAccionesFormularioTransportista=new JPanel();
				this.jmenuBarDetalleTransportista=new JMenuBar();
				this.jTtoolBarDetalleTransportista=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransportistaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Transportista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransportistaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Transportista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransportistaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transportista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransportistaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transportista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransportistaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Transportista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTransportista() {
		return this.jButtonActualizarToolBarTransportista;
	}
	
	public JButton getjButtonEliminarToolBarTransportista() {
		return this.jButtonEliminarToolBarTransportista;
	}
	
	public JButton getjButtonCancelarToolBarTransportista() {
		return this.jButtonCancelarToolBarTransportista;
	}		
	
	public JButton getjButtonProcesarInformacionTransportista() {
		return this.jButtonProcesarInformacionTransportista;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransportista)	{
		this.jButtonProcesarInformacionTransportista = jButtonProcesarInformacionTransportista;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransportista() {
		return this.jComboBoxTiposAccionesTransportista;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransportista(
			JComboBox jComboBoxTiposRelacionesTransportista) {
		this.jComboBoxTiposRelacionesTransportista = jComboBoxTiposRelacionesTransportista;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransportista(
			JComboBox jComboBoxTiposAccionesTransportista) {
		this.jComboBoxTiposAccionesTransportista = jComboBoxTiposAccionesTransportista;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransportista() {
		return this.jComboBoxTiposAccionesFormularioTransportista;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransportista(
			JComboBox jComboBoxTiposAccionesFormularioTransportista) {
		this.jComboBoxTiposAccionesFormularioTransportista = jComboBoxTiposAccionesFormularioTransportista;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transportistaSessionBean=new TransportistaSessionBean();
		
		this.transportistaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transportistaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transportistaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransportistaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransportistaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransportistaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transportista MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
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
	
		TransportistaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransportista= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransportista=new JButtonMe();
				this.jButtonModificarToolBarTransportista=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransportista,this.jTtoolBarDetalleTransportista,
							"actualizar","actualizar","Actualizar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransportista,this.jTtoolBarDetalleTransportista,
							"eliminar","eliminar","Eliminar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransportista,this.jTtoolBarDetalleTransportista,
							"cancelar","cancelar","Cancelar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransportista,this.jTtoolBarDetalleTransportista,
							"guardarcambios","guardarcambios","Guardar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransportista,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransportista,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransportista,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransportista=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransportista=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransportista=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransportista=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransportista=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransportista= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransportista.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransportista,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransportista= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransportista.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransportista,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransportista= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransportista.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransportista,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransportista= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransportista.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransportista,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransportista= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransportista.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransportista,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransportista= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransportista.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransportista,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransportista= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransportista.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransportista,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransportista= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransportista.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransportista,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransportista= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransportista.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransportista,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransportista= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransportista.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransportista,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransportista.add(this.jMenuItemDetalleCerrarTransportista);
		
		this.jmenuDetalleAccionesTransportista.add(this.jMenuItemActualizarTransportista);
		this.jmenuDetalleAccionesTransportista.add(this.jMenuItemEliminarTransportista);
		this.jmenuDetalleAccionesTransportista.add(this.jMenuItemCancelarTransportista);		
		
		//this.jmenuDetalleDatosTransportista.add(this.jMenuItemDetalleAbrirOrderByTransportista);				
		this.jmenuDetalleDatosTransportista.add(this.jMenuItemDetalleMostarOcultarTransportista);				
				
		//this.jmenuDetalleAccionesTransportista.add(this.jMenuItemGuardarCambiosTransportista);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransportista.add(this.jmenuDetalleArchivoTransportista);		
		this.jmenuBarDetalleTransportista.add(this.jmenuDetalleAccionesTransportista);		
		this.jmenuBarDetalleTransportista.add(this.jmenuDetalleDatosTransportista);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTransportista);				
	}
	
	
	public void inicializarElementosCamposTransportista() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransportista = new JLabelMe();
		jLabelIdTransportista.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransportista = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransportista= new GridBagLayout();

		this.jPanelidTransportista.setLayout(this.gridaBagLayoutTransportista);

		jLabelidTransportista = new JLabel();
		jLabelidTransportista.setText("Id");

		jLabelidTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelidentificacionTransportista = new JLabelMe();
		this.jLabelidentificacionTransportista.setText(""+TransportistaConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionTransportista.setToolTipText("Identificacion");
		this.jLabelidentificacionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelidentificacionTransportista.setLayout(this.gridaBagLayoutTransportista);


		jTextFieldidentificacionTransportista= new JTextFieldMe();

		jTextFieldidentificacionTransportista.setEnabled(false);
		jTextFieldidentificacionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionTransportistaBusqueda= new JButtonMe();
		this.jButtonidentificacionTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionTransportistaBusqueda.setText("U");
		this.jButtonidentificacionTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionTransportistaBusqueda.setVisible(false);		}


					
		this.jLabelrucTransportista = new JLabelMe();
		this.jLabelrucTransportista.setText(""+TransportistaConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucTransportista.setToolTipText("Ruc");
		this.jLabelrucTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelrucTransportista.setLayout(this.gridaBagLayoutTransportista);


		jTextFieldrucTransportista= new JTextFieldMe();

		jTextFieldrucTransportista.setEnabled(false);
		jTextFieldrucTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucTransportistaBusqueda= new JButtonMe();
		this.jButtonrucTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucTransportistaBusqueda.setText("U");
		this.jButtonrucTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucTransportistaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTransportista = new JLabelMe();
		this.jLabelnombreTransportista.setText(""+TransportistaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTransportista.setToolTipText("Nombre");
		this.jLabelnombreTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelnombreTransportista.setLayout(this.gridaBagLayoutTransportista);


		jTextAreanombreTransportista= new JTextAreaMe();
		jTextAreanombreTransportista.setEnabled(false);
		jTextAreanombreTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransportista.setLineWrap(true);
		jTextAreanombreTransportista.setWrapStyleWord(true);
		jTextAreanombreTransportista.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTransportista.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTransportista = new JScrollPane(jTextAreanombreTransportista);
		jscrollPanenombreTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTransportistaBusqueda= new JButtonMe();
		this.jButtonnombreTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTransportistaBusqueda.setText("U");
		this.jButtonnombreTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTransportistaBusqueda.setVisible(false);		}


					
		this.jLabelapellidoTransportista = new JLabelMe();
		this.jLabelapellidoTransportista.setText(""+TransportistaConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoTransportista.setToolTipText("Apellido");
		this.jLabelapellidoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelapellidoTransportista.setLayout(this.gridaBagLayoutTransportista);


		jTextAreaapellidoTransportista= new JTextAreaMe();
		jTextAreaapellidoTransportista.setEnabled(false);
		jTextAreaapellidoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoTransportista.setLineWrap(true);
		jTextAreaapellidoTransportista.setWrapStyleWord(true);
		jTextAreaapellidoTransportista.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoTransportista.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoTransportista = new JScrollPane(jTextAreaapellidoTransportista);
		jscrollPaneapellidoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoTransportistaBusqueda= new JButtonMe();
		this.jButtonapellidoTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoTransportistaBusqueda.setText("U");
		this.jButtonapellidoTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoTransportistaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoTransportista = new JLabelMe();
		this.jLabelnombre_completoTransportista.setText(""+TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO+" :");
		this.jLabelnombre_completoTransportista.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelnombre_completoTransportista.setLayout(this.gridaBagLayoutTransportista);


		jTextAreanombre_completoTransportista= new JTextAreaMe();
		jTextAreanombre_completoTransportista.setEnabled(false);
		jTextAreanombre_completoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoTransportista.setLineWrap(true);
		jTextAreanombre_completoTransportista.setWrapStyleWord(true);
		jTextAreanombre_completoTransportista.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoTransportista.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoTransportista = new JScrollPane(jTextAreanombre_completoTransportista);
		jscrollPanenombre_completoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		jTextAreanombre_completoTransportista.setEnabled(false);
		this.jButtonnombre_completoTransportistaBusqueda= new JButtonMe();
		this.jButtonnombre_completoTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoTransportistaBusqueda.setText("U");
		this.jButtonnombre_completoTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoTransportistaBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoTransportista = new JLabelMe();
		this.jLabeltelefonoTransportista.setText(""+TransportistaConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoTransportista.setToolTipText("Telefono");
		this.jLabeltelefonoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPaneltelefonoTransportista.setLayout(this.gridaBagLayoutTransportista);


		jTextFieldtelefonoTransportista= new JTextFieldMe();

		jTextFieldtelefonoTransportista.setEnabled(false);
		jTextFieldtelefonoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoTransportistaBusqueda= new JButtonMe();
		this.jButtontelefonoTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoTransportistaBusqueda.setText("U");
		this.jButtontelefonoTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoTransportistaBusqueda.setVisible(false);		}


					
		this.jLabeldireccionTransportista = new JLabelMe();
		this.jLabeldireccionTransportista.setText(""+TransportistaConstantesFunciones.LABEL_DIRECCION+" :");
		this.jLabeldireccionTransportista.setToolTipText("Direccion");
		this.jLabeldireccionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPaneldireccionTransportista.setLayout(this.gridaBagLayoutTransportista);


		jTextAreadireccionTransportista= new JTextAreaMe();
		jTextAreadireccionTransportista.setEnabled(false);
		jTextAreadireccionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionTransportista.setLineWrap(true);
		jTextAreadireccionTransportista.setWrapStyleWord(true);
		jTextAreadireccionTransportista.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionTransportista.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionTransportista = new JScrollPane(jTextAreadireccionTransportista);
		jscrollPanedireccionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccionTransportistaBusqueda= new JButtonMe();
		this.jButtondireccionTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionTransportistaBusqueda.setText("U");
		this.jButtondireccionTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionTransportistaBusqueda.setVisible(false);		}


					
		this.jLabelplacaTransportista = new JLabelMe();
		this.jLabelplacaTransportista.setText(""+TransportistaConstantesFunciones.LABEL_PLACA+" : *");
		this.jLabelplacaTransportista.setToolTipText("Placa");
		this.jLabelplacaTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplacaTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplacaTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelplacaTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelplacaTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelplacaTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_PLACA);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelplacaTransportista.setLayout(this.gridaBagLayoutTransportista);


		jTextFieldplacaTransportista= new JTextFieldMe();

		jTextFieldplacaTransportista.setEnabled(false);
		jTextFieldplacaTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplacaTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplacaTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldplacaTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonplacaTransportistaBusqueda= new JButtonMe();
		this.jButtonplacaTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplacaTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplacaTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonplacaTransportistaBusqueda.setText("U");
		this.jButtonplacaTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonplacaTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonplacaTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldplacaTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldplacaTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"placaTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonplacaTransportistaBusqueda.setVisible(false);		}


					
		this.jLabelnumeroTransportista = new JLabelMe();
		this.jLabelnumeroTransportista.setText(""+TransportistaConstantesFunciones.LABEL_NUMERO+" :");
		this.jLabelnumeroTransportista.setToolTipText("Numero");
		this.jLabelnumeroTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelnumeroTransportista.setLayout(this.gridaBagLayoutTransportista);


		jTextFieldnumeroTransportista= new JTextFieldMe();

		jTextFieldnumeroTransportista.setEnabled(false);
		jTextFieldnumeroTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroTransportistaBusqueda= new JButtonMe();
		this.jButtonnumeroTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroTransportistaBusqueda.setText("U");
		this.jButtonnumeroTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroTransportistaBusqueda.setVisible(false);		}


					
		this.jLabelobservacionTransportista = new JLabelMe();
		this.jLabelobservacionTransportista.setText(""+TransportistaConstantesFunciones.LABEL_OBSERVACION+" :");
		this.jLabelobservacionTransportista.setToolTipText("Observacion");
		this.jLabelobservacionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelobservacionTransportista.setLayout(this.gridaBagLayoutTransportista);


		jTextAreaobservacionTransportista= new JTextAreaMe();
		jTextAreaobservacionTransportista.setEnabled(false);
		jTextAreaobservacionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionTransportista.setLineWrap(true);
		jTextAreaobservacionTransportista.setWrapStyleWord(true);
		jTextAreaobservacionTransportista.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionTransportista.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionTransportista = new JScrollPane(jTextAreaobservacionTransportista);
		jscrollPaneobservacionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionTransportistaBusqueda= new JButtonMe();
		this.jButtonobservacionTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionTransportistaBusqueda.setText("U");
		this.jButtonobservacionTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionTransportistaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransportista() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTransportista = new JLabelMe();
		this.jLabelid_empresaTransportista.setText(""+TransportistaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTransportista.setToolTipText("Empresa");
		this.jLabelid_empresaTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelid_empresaTransportista.setLayout(this.gridaBagLayoutTransportista);


		jComboBoxid_empresaTransportista= new JComboBoxMe();
		jComboBoxid_empresaTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTransportista,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTransportista.setEnabled(false);

		this.jButtonid_empresaTransportista= new JButtonMe();
		this.jButtonid_empresaTransportista.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransportista.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransportista.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransportista.setText("Buscar");
		this.jButtonid_empresaTransportista.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTransportista.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransportista,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransportista"));

		this.jButtonid_empresaTransportistaBusqueda= new JButtonMe();
		this.jButtonid_empresaTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransportistaBusqueda.setText("U");
		this.jButtonid_empresaTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTransportistaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTransportistaUpdate= new JButtonMe();
		this.jButtonid_empresaTransportistaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransportistaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransportistaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransportistaUpdate.setText("U");
		this.jButtonid_empresaTransportistaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTransportistaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransportistaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransportistaUpdate"));



					
		this.jLabelid_sucursalTransportista = new JLabelMe();
		this.jLabelid_sucursalTransportista.setText(""+TransportistaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTransportista.setToolTipText("Sucursal");
		this.jLabelid_sucursalTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelid_sucursalTransportista.setLayout(this.gridaBagLayoutTransportista);


		jComboBoxid_sucursalTransportista= new JComboBoxMe();
		jComboBoxid_sucursalTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTransportista,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTransportista.setEnabled(false);

		this.jButtonid_sucursalTransportista= new JButtonMe();
		this.jButtonid_sucursalTransportista.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransportista.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransportista.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransportista.setText("Buscar");
		this.jButtonid_sucursalTransportista.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTransportista.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransportista,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransportista"));

		this.jButtonid_sucursalTransportistaBusqueda= new JButtonMe();
		this.jButtonid_sucursalTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTransportistaBusqueda.setText("U");
		this.jButtonid_sucursalTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTransportistaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTransportistaUpdate= new JButtonMe();
		this.jButtonid_sucursalTransportistaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransportistaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransportistaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTransportistaUpdate.setText("U");
		this.jButtonid_sucursalTransportistaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTransportistaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransportistaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransportistaUpdate"));



					
		this.jLabelid_tipo_via_transporteTransportista = new JLabelMe();
		this.jLabelid_tipo_via_transporteTransportista.setText(""+TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE+" : *");
		this.jLabelid_tipo_via_transporteTransportista.setToolTipText("Tipo Via Transporte");
		this.jLabelid_tipo_via_transporteTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transporteTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transporteTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_via_transporteTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_via_transporteTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelid_tipo_via_transporteTransportista.setLayout(this.gridaBagLayoutTransportista);


		jComboBoxid_tipo_via_transporteTransportista= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_via_transporteTransportista= new JButtonMe();
		this.jButtonid_tipo_via_transporteTransportista.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteTransportista.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteTransportista.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteTransportista.setText("Buscar");
		this.jButtonid_tipo_via_transporteTransportista.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_via_transporteTransportista.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteTransportista,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_via_transporteTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteTransportista"));

		this.jButtonid_tipo_via_transporteTransportistaBusqueda= new JButtonMe();
		this.jButtonid_tipo_via_transporteTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteTransportistaBusqueda.setText("U");
		this.jButtonid_tipo_via_transporteTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_via_transporteTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_via_transporteTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_via_transporteTransportistaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_via_transporteTransportistaUpdate= new JButtonMe();
		this.jButtonid_tipo_via_transporteTransportistaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteTransportistaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteTransportistaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteTransportistaUpdate.setText("U");
		this.jButtonid_tipo_via_transporteTransportistaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_via_transporteTransportistaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteTransportistaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_via_transporteTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteTransportistaUpdate"));



					
		this.jLabelid_clienteTransportista = new JLabelMe();
		this.jLabelid_clienteTransportista.setText(""+TransportistaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteTransportista.setToolTipText("Cliente");
		this.jLabelid_clienteTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteTransportista.setToolTipText(TransportistaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutTransportista = new GridBagLayout();
		this.jPanelid_clienteTransportista.setLayout(this.gridaBagLayoutTransportista);


		jComboBoxid_clienteTransportista= new JComboBoxMe();
		jComboBoxid_clienteTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteTransportista,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteTransportista= new JButtonMe();
		this.jButtonid_clienteTransportista.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTransportista.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTransportista.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTransportista.setText("Buscar");
		this.jButtonid_clienteTransportista.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteTransportista.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTransportista,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTransportista"));

		this.jButtonid_clienteTransportistaBusqueda= new JButtonMe();
		this.jButtonid_clienteTransportistaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTransportistaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTransportistaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteTransportistaBusqueda.setText("U");
		this.jButtonid_clienteTransportistaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteTransportistaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTransportistaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTransportistaBusqueda"));

		if(this.transportistaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteTransportistaBusqueda.setVisible(false);		}

		this.jButtonid_clienteTransportistaUpdate= new JButtonMe();
		this.jButtonid_clienteTransportistaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTransportistaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTransportistaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteTransportistaUpdate.setText("U");
		this.jButtonid_clienteTransportistaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteTransportistaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTransportistaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTransportistaUpdate"));



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
		//this.jInternalFrameDetalleTransportista = new TransportistaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transportista DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransportista= new GridBagLayout();
		

		
		String sToolTipTransportista="";
		sToolTipTransportista=TransportistaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransportista+="(Facturacion.Transportista)";
		}
		
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransportista+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransportista = new JButtonMe();
		this.jButtonModificarTransportista = new JButtonMe();
        this.jButtonActualizarTransportista = new JButtonMe();
        this.jButtonEliminarTransportista = new JButtonMe();
        this.jButtonCancelarTransportista = new JButtonMe();
        this.jButtonGuardarCambiosTransportista = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransportista = new JButtonMe();
		this.jButtonCerrarTransportista = new JButtonMe();
		
		this.jScrollPanelDatosTransportista = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransportista = new JScrollPane();
		this.jScrollPanelDatosGeneralTransportista = new JScrollPane();
				
		
		
		this.jPanelCamposTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Transportista";
		
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportistas" + this.sPath));
		} else {
			this.jScrollPanelDatosTransportista.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTransportista.setName("jPanelCamposTransportista"); 

		this.jPanelCamposOcultosTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransportista.setName("jPanelCamposOcultosTransportista"); 

        this.jPanelAccionesTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransportista.setToolTipText("Acciones");
        this.jPanelAccionesTransportista.setName("Acciones"); 

		this.jPanelAccionesFormularioTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransportista.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransportista.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransportista, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransportista.setText("Nuevo");
		this.jButtonModificarTransportista.setText("Editar");
        this.jButtonActualizarTransportista.setText("Actualizar");
        this.jButtonEliminarTransportista.setText("Eliminar");
        this.jButtonCancelarTransportista.setText("Cancelar");
        this.jButtonGuardarCambiosTransportista.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransportista.setText("Guardar");
		this.jButtonCerrarTransportista.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransportista,"nuevo_button","Nuevo",this.transportistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransportista,"modificar_button","Editar",this.transportistaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransportista,"actualizar_button","Actualizar",this.transportistaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransportista,"eliminar_button","Eliminar",this.transportistaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransportista,"cancelar_button","Cancelar",this.transportistaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransportista,"guardarcambios_button","Guardar",this.transportistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransportista,"guardarcambiostabla_button","Guardar",this.transportistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransportista,"cerrar_button","Salir",this.transportistaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransportista.setToolTipText("Nuevo"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransportista.setToolTipText("Editar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransportista.setToolTipText("Actualizar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransportista.setToolTipText("Eliminar)"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransportista.setToolTipText("Cancelar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransportista.setToolTipText("Guardar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransportista.setToolTipText("Guardar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransportista.setToolTipText("Salir"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransportista";
		inputMap = this.jButtonNuevoTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransportista.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransportista"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransportista";
		inputMap = this.jButtonActualizarTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransportista"));
		
		//ELIMINAR
		sMapKey = "EliminarTransportista";
		inputMap = this.jButtonEliminarTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransportista"));
		
		//CANCELAR	
		sMapKey = "CancelarTransportista";
		inputMap = this.jButtonCancelarTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransportista"));
		
		//CERRAR		
		sMapKey = "CerrarTransportista";
		inputMap = this.jButtonCerrarTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransportista"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransportista";
		inputMap = this.jButtonGuardarCambiosTablaTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransportista"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransportista = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransportista.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransportista.setToolTipText("Nuevo Transportista");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransportista = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransportista.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransportista.setToolTipText("Sin Cerrar Ventana Transportista");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransportista = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransportista.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransportista.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransportista, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransportista = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransportista.setText("Accion");
		this.jComboBoxTiposAccionesTransportista.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransportista = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransportista.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransportista.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransportista = new JLabelMe();
		
		this.jLabelAccionesTransportista.setText("Acciones");		
		this.jLabelAccionesTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransportista();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransportista();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransportista=new JTabbedPane();
		this.jTabbedPaneRelacionesTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransportista,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransportista.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransportista.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransportista.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransportista.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransportista.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransportista.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransportista, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransportista = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransportista = new GridBagLayout();
		
		this.jPanelCamposTransportista.setLayout(gridaBagLayoutCamposTransportista);
		this.jPanelCamposOcultosTransportista.setLayout(gridaBagLayoutCamposOcultosTransportista);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTransportista.add(jLabelIdTransportista, this.gridBagConstraintsTransportista);



	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTransportista.add(jLabelidTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTransportista.add(jLabelid_empresaTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransportista.add(jButtonid_empresaTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 3;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransportista.add(jButtonid_empresaTransportistaUpdate, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTransportista.add(jComboBoxid_empresaTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTransportista.add(jLabelid_sucursalTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTransportista.add(jButtonid_sucursalTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 3;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTransportista.add(jButtonid_sucursalTransportistaUpdate, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTransportista.add(jComboBoxid_sucursalTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_via_transporteTransportista.add(jLabelid_tipo_via_transporteTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteTransportista.add(jButtonid_tipo_via_transporteTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 3;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteTransportista.add(jButtonid_tipo_via_transporteTransportistaUpdate, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_via_transporteTransportista.add(jComboBoxid_tipo_via_transporteTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionTransportista.add(jLabelidentificacionTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionTransportista.add(jButtonidentificacionTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionTransportista.add(jTextFieldidentificacionTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucTransportista.add(jLabelrucTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucTransportista.add(jButtonrucTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucTransportista.add(jTextFieldrucTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTransportista.add(jLabelnombreTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTransportista.add(jButtonnombreTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTransportista.add(jscrollPanenombreTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoTransportista.add(jLabelapellidoTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoTransportista.add(jButtonapellidoTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoTransportista.add(jscrollPaneapellidoTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoTransportista.add(jLabelnombre_completoTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoTransportista.add(jButtonnombre_completoTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoTransportista.add(jscrollPanenombre_completoTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoTransportista.add(jLabeltelefonoTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoTransportista.add(jButtontelefonoTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoTransportista.add(jTextFieldtelefonoTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionTransportista.add(jLabeldireccionTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionTransportista.add(jButtondireccionTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionTransportista.add(jscrollPanedireccionTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteTransportista.add(jLabelid_clienteTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 2;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteTransportista.add(jButtonid_clienteTransportista, this.gridBagConstraintsTransportista);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 3;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteTransportista.add(jButtonid_clienteTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 4;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteTransportista.add(jButtonid_clienteTransportistaUpdate, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteTransportista.add(jComboBoxid_clienteTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelplacaTransportista.add(jLabelplacaTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelplacaTransportista.add(jButtonplacaTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelplacaTransportista.add(jTextFieldplacaTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroTransportista.add(jLabelnumeroTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroTransportista.add(jButtonnumeroTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroTransportista.add(jTextFieldnumeroTransportista, this.gridBagConstraintsTransportista);


	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 0;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionTransportista.add(jLabelobservacionTransportista, this.gridBagConstraintsTransportista);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 2;
		this.gridBagConstraintsTransportista.ipadx = 0;
		this.gridBagConstraintsTransportista.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionTransportista.add(jButtonobservacionTransportistaBusqueda, this.gridBagConstraintsTransportista);
	}

	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransportista.gridy = 0;
	this.gridBagConstraintsTransportista.gridx = 1;
	this.gridBagConstraintsTransportista.ipadx = 0;
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionTransportista.add(jscrollPaneobservacionTransportista, this.gridBagConstraintsTransportista);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPanelidTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPanelid_tipo_via_transporteTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPanelidentificacionTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPanelrucTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPanelnombreTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPanelapellidoTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPanelnombre_completoTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPaneltelefonoTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPaneldireccionTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPanelid_clienteTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPanelplacaTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPanelnumeroTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransportista.add(this.jPanelobservacionTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposTransportista % 2==0) {
		iXPanelCamposTransportista=0;
		iYPanelCamposTransportista++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposOcultosTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposOcultosTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransportista.add(this.jPanelid_empresaTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposOcultosTransportista % 2==0) {
		iXPanelCamposOcultosTransportista=0;
		iYPanelCamposOcultosTransportista++;
	}
	this.gridBagConstraintsTransportista = new GridBagConstraints();
	this.gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransportista.gridy = iYPanelCamposOcultosTransportista;
	this.gridBagConstraintsTransportista.gridx = iXPanelCamposOcultosTransportista++;
	this.gridBagConstraintsTransportista.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransportista.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransportista.add(this.jPanelid_sucursalTransportista, this.gridBagConstraintsTransportista);



	if(iXPanelCamposOcultosTransportista % 2==0) {
		iXPanelCamposOcultosTransportista=0;
		iYPanelCamposOcultosTransportista++;
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
			
		GridBagLayout gridaBagLayoutAccionesTransportista= new GridBagLayout();
		this.jPanelAccionesTransportista.setLayout(gridaBagLayoutAccionesTransportista);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransportista= new GridBagLayout();
		this.jPanelAccionesFormularioTransportista.setLayout(gridaBagLayoutAccionesFormularioTransportista);
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransportista.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransportista.add(this.jComboBoxTiposAccionesFormularioTransportista, this.gridBagConstraintsTransportista);

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransportista.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransportista.add(this.jCheckBoxPostAccionNuevoTransportista, this.gridBagConstraintsTransportista);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.transportistaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransportista.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransportista.add(this.jCheckBoxPostAccionSinCerrarTransportista, this.gridBagConstraintsTransportista);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.transportistaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransportista.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransportista.add(this.jCheckBoxPostAccionSinMensajeTransportista, this.gridBagConstraintsTransportista);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransportista.add(this.jButtonModificarTransportista, this.gridBagConstraintsTransportista);							

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransportista.add(this.jButtonEliminarTransportista, this.gridBagConstraintsTransportista);
		
			
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = 0;		
		this.gridBagConstraintsTransportista.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransportista.add(this.jButtonActualizarTransportista, this.gridBagConstraintsTransportista);


		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = 0;		
		this.gridBagConstraintsTransportista.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransportista.add(this.jButtonGuardarCambiosTransportista, this.gridBagConstraintsTransportista);	
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = 0;		
		this.gridBagConstraintsTransportista.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransportista.add(this.jButtonCancelarTransportista, this.gridBagConstraintsTransportista);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransportista = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransportista);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transportistaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransportista = new GridBagConstraints();						
			this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransportista.gridx = 0;		
			//this.gridBagConstraintsTransportista.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransportista.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransportista.gridx =0;
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransportista.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransportista, this.gridBagConstraintsTransportista);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransportistaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransportista = new TransportistaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transportista DATOS");
			
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
			
	        //this.setTitle("[FOR] - Transportista DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transportista Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransportistaModel transportistaModel=new TransportistaModel(this);
			
			//SI USARA CLASE INTERNA
			//TransportistaModel.TransportistaFocusTraversalPolicy transportistaFocusTraversalPolicy = transportistaModel.new TransportistaFocusTraversalPolicy(this);
			
			//transportistaFocusTraversalPolicy.settransportistaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transportistaModel);
			
			
			this.jContentPaneDetalleTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransportista = new GridBagLayout();	
			this.jContentPaneDetalleTransportista.setLayout(gridaBagLayoutDetalleTransportista);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransportista = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTransportista = new GridBagConstraints();
				this.gridBagConstraintsTransportista.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTransportista.gridx = 0;
					
				
				this.jContentPaneDetalleTransportista.add(jTtoolBarDetalleTransportista, gridBagConstraintsTransportista);								
				
}
			
			this.jScrollPanelDatosEdicionTransportista=   new JScrollPane(jContentPaneDetalleTransportista,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransportista.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransportista.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransportista.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransportista=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransportista.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransportista.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransportista.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTransportista.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTransportista.gridx = 0;
	        
			this.jContentPaneDetalleTransportista.add(jPanelCamposTransportista, gridBagConstraintsTransportista);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& transportistaSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.transportistaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransportista= new GridBagConstraints();
						this.gridBagConstraintsTransportista.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransportista.gridx = 0;
						this.jContentPaneDetalleTransportista.add(this.jTabbedPaneRelacionesTransportista, this.gridBagConstraintsTransportista);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransportista.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransportista.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransportista = new GridBagConstraints();
					this.gridBagConstraintsTransportista.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransportista.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransportista.gridx = 0;
					
				
					this.jContentPaneDetalleTransportista.add(jPanelCamposOcultosTransportista, gridBagConstraintsTransportista);
				
					this.jPanelCamposOcultosTransportista.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTransportista.gridx = 0;
	        this.gridBagConstraintsTransportista.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransportista.add(this.jPanelAccionesFormularioTransportista, this.gridBagConstraintsTransportista);							
			
			
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
	        this.gridBagConstraintsTransportista.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTransportista.gridx = 0;
	        
			
			this.jContentPaneDetalleTransportista.add(this.jPanelAccionesTransportista, this.gridBagConstraintsTransportista);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransportista);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransportista=   new JScrollPane(this.jPanelCamposTransportista,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransportista.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransportista.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransportista.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransportista.gridx = 0;
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransportista.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransportista, this.gridBagConstraintsTransportista);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransportista.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransportista, this.gridBagConstraintsTransportista);			
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransportista.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransportista, this.gridBagConstraintsTransportista);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransportista.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransportista, this.gridBagConstraintsTransportista);
			
			
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransportista.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransportista, this.gridBagConstraintsTransportista);
		
			
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransportista.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransportista, this.gridBagConstraintsTransportista);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransportista;//jContentPane;
		
		return jScrollPanelDatosEdicionTransportista;
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
