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
import com.bydan.erp.cartera.util.GarantiaClienteConstantesFunciones;

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
public class GarantiaClienteDetalleFormJInternalFrame extends GarantiaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGarantiaCliente;
	
	protected JMenuBar jmenuBarDetalleGarantiaCliente;
	
	protected JMenu jmenuDetalleGarantiaCliente;
	protected JMenu jmenuDetalleArchivoGarantiaCliente;
	protected JMenu jmenuDetalleAccionesGarantiaCliente;
	protected JMenu jmenuDetalleDatosGarantiaCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGarantiaCliente;	
	protected GridBagConstraints gridBagConstraintsGarantiaCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GarantiaClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleGarantiaCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoGarantiaEmpresaBeanSwingJInternalFrame tipogarantiaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogarantiaempresa="";

	protected EstadoGarantiaClienteBeanSwingJInternalFrame estadogarantiaclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadogarantiacliente="";
	
	public GarantiaClienteSessionBean garantiaclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoGarantiaEmpresaSessionBean tipogarantiaempresaSessionBean;
	public EstadoGarantiaClienteSessionBean estadogarantiaclienteSessionBean;	
	
	public GarantiaClienteLogic garantiaclienteLogic;
	
	public JScrollPane jScrollPanelDatosGarantiaCliente;
	public JScrollPane jScrollPanelDatosEdicionGarantiaCliente;
	public JScrollPane jScrollPanelDatosGeneralGarantiaCliente;
	
	protected JPanel jPanelCamposGarantiaCliente;    
	protected JPanel jPanelCamposOcultosGarantiaCliente;    	
	protected JPanel jPanelAccionesGarantiaCliente;
	protected JPanel jPanelAccionesFormularioGarantiaCliente;
    
	
	
	protected Integer iXPanelCamposGarantiaCliente=0;
	protected Integer iYPanelCamposGarantiaCliente=0;
	
	protected Integer iXPanelCamposOcultosGarantiaCliente=0;
	protected Integer iYPanelCamposOcultosGarantiaCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGarantiaCliente;
	public JButton jButtonModificarGarantiaCliente;
	public JButton jButtonActualizarGarantiaCliente;
    public JButton jButtonEliminarGarantiaCliente;
	public JButton jButtonCancelarGarantiaCliente;
    public JButton jButtonGuardarCambiosGarantiaCliente;
	public JButton jButtonGuardarCambiosTablaGarantiaCliente;
	protected JButton jButtonCerrarGarantiaCliente;
	
	
	protected JButton jButtonProcesarInformacionGarantiaCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGarantiaCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGarantiaCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGarantiaCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGarantiaCliente;
	protected JButton jButtonModificarToolBarGarantiaCliente;
	protected JButton jButtonActualizarToolBarGarantiaCliente;
    protected JButton jButtonEliminarToolBarGarantiaCliente;
	protected JButton jButtonCancelarToolBarGarantiaCliente;
    protected JButton jButtonGuardarCambiosToolBarGarantiaCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarGarantiaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarGarantiaCliente;
	protected JButton jButtonCerrarToolBarGarantiaCliente;
	
	protected JButton jButtonProcesarInformacionToolBarGarantiaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGarantiaCliente;
	protected JMenuItem jMenuItemModificarGarantiaCliente;
	protected JMenuItem jMenuItemActualizarGarantiaCliente;
    protected JMenuItem jMenuItemEliminarGarantiaCliente;
	protected JMenuItem jMenuItemCancelarGarantiaCliente;
    protected JMenuItem jMenuItemGuardarCambiosGarantiaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaGarantiaCliente;
	protected JMenuItem jMenuItemCerrarGarantiaCliente;
	protected JMenuItem jMenuItemDetalleCerrarGarantiaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarGarantiaCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionGarantiaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGarantiaCliente;
	protected JMenuItem jMenuItemMostrarOcultarGarantiaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGarantiaCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGarantiaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGarantiaCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGarantiaCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGarantiaCliente;
	public JLabel jLabelIdGarantiaCliente;
	public JLabel jLabelidGarantiaCliente;
	public JButton jButtonidGarantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelvalorGarantiaCliente;
	public JLabel jLabelvalorGarantiaCliente;
	public JTextField jTextFieldvalorGarantiaCliente;
	public JButton jButtonvalorGarantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_recepcionGarantiaCliente;
	public JLabel jLabelfecha_recepcionGarantiaCliente;
	//public JFormattedTextField jDateChooserfecha_recepcionGarantiaCliente;

	public JDateChooser jDateChooserfecha_recepcionGarantiaCliente;
	public JButton jButtonfecha_recepcionGarantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_firmaGarantiaCliente;
	public JLabel jLabelfecha_firmaGarantiaCliente;
	//public JFormattedTextField jDateChooserfecha_firmaGarantiaCliente;

	public JDateChooser jDateChooserfecha_firmaGarantiaCliente;
	public JButton jButtonfecha_firmaGarantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_devolucionGarantiaCliente;
	public JLabel jLabelfecha_devolucionGarantiaCliente;
	//public JFormattedTextField jDateChooserfecha_devolucionGarantiaCliente;

	public JDateChooser jDateChooserfecha_devolucionGarantiaCliente;
	public JButton jButtonfecha_devolucionGarantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioGarantiaCliente;
	public JLabel jLabelbeneficiarioGarantiaCliente;
	public JTextArea jTextAreabeneficiarioGarantiaCliente;
	public JScrollPane jscrollPanebeneficiarioGarantiaCliente;
	public JButton jButtonbeneficiarioGarantiaClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGarantiaCliente;
	public JLabel jLabelid_empresaGarantiaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGarantiaCliente;
	public JButton jButtonid_empresaGarantiaCliente= new JButtonMe();
	public JButton jButtonid_empresaGarantiaClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaGarantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalGarantiaCliente;
	public JLabel jLabelid_sucursalGarantiaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalGarantiaCliente;
	public JButton jButtonid_sucursalGarantiaCliente= new JButtonMe();
	public JButton jButtonid_sucursalGarantiaClienteUpdate= new JButtonMe();
	public JButton jButtonid_sucursalGarantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteGarantiaCliente;
	public JLabel jLabelid_clienteGarantiaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteGarantiaCliente;
	public JButton jButtonid_clienteGarantiaCliente= new JButtonMe();
	public JButton jButtonid_clienteGarantiaClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteGarantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_garantia_empresaGarantiaCliente;
	public JLabel jLabelid_tipo_garantia_empresaGarantiaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_garantia_empresaGarantiaCliente;
	public JButton jButtonid_tipo_garantia_empresaGarantiaCliente= new JButtonMe();
	public JButton jButtonid_tipo_garantia_empresaGarantiaClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_garantia_clienteGarantiaCliente;
	public JLabel jLabelid_estado_garantia_clienteGarantiaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_garantia_clienteGarantiaCliente;
	public JButton jButtonid_estado_garantia_clienteGarantiaCliente= new JButtonMe();
	public JButton jButtonid_estado_garantia_clienteGarantiaClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_garantia_clienteGarantiaClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGarantiaCliente;
	
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
	
	public GarantiaClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGarantiaCliente=new JPanel();
				this.jPanelAccionesFormularioGarantiaCliente=new JPanel();
				this.jmenuBarDetalleGarantiaCliente=new JMenuBar();
				this.jTtoolBarDetalleGarantiaCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GarantiaClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GarantiaClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GarantiaClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GarantiaClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GarantiaClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGarantiaCliente() {
		return this.jButtonActualizarToolBarGarantiaCliente;
	}
	
	public JButton getjButtonEliminarToolBarGarantiaCliente() {
		return this.jButtonEliminarToolBarGarantiaCliente;
	}
	
	public JButton getjButtonCancelarToolBarGarantiaCliente() {
		return this.jButtonCancelarToolBarGarantiaCliente;
	}		
	
	public JButton getjButtonProcesarInformacionGarantiaCliente() {
		return this.jButtonProcesarInformacionGarantiaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGarantiaCliente)	{
		this.jButtonProcesarInformacionGarantiaCliente = jButtonProcesarInformacionGarantiaCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGarantiaCliente() {
		return this.jComboBoxTiposAccionesGarantiaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGarantiaCliente(
			JComboBox jComboBoxTiposRelacionesGarantiaCliente) {
		this.jComboBoxTiposRelacionesGarantiaCliente = jComboBoxTiposRelacionesGarantiaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGarantiaCliente(
			JComboBox jComboBoxTiposAccionesGarantiaCliente) {
		this.jComboBoxTiposAccionesGarantiaCliente = jComboBoxTiposAccionesGarantiaCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGarantiaCliente() {
		return this.jComboBoxTiposAccionesFormularioGarantiaCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGarantiaCliente(
			JComboBox jComboBoxTiposAccionesFormularioGarantiaCliente) {
		this.jComboBoxTiposAccionesFormularioGarantiaCliente = jComboBoxTiposAccionesFormularioGarantiaCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		
		this.garantiaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.garantiaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.garantiaclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GarantiaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Garantia Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGarantiaCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGarantiaCliente=new JButtonMe();
				this.jButtonModificarToolBarGarantiaCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGarantiaCliente,this.jTtoolBarDetalleGarantiaCliente,
							"actualizar","actualizar","Actualizar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGarantiaCliente,this.jTtoolBarDetalleGarantiaCliente,
							"eliminar","eliminar","Eliminar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGarantiaCliente,this.jTtoolBarDetalleGarantiaCliente,
							"cancelar","cancelar","Cancelar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGarantiaCliente,this.jTtoolBarDetalleGarantiaCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGarantiaCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGarantiaCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGarantiaCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGarantiaCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGarantiaCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGarantiaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGarantiaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGarantiaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGarantiaCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGarantiaCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGarantiaCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGarantiaCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGarantiaCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGarantiaCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGarantiaCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGarantiaCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGarantiaCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGarantiaCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGarantiaCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGarantiaCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGarantiaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGarantiaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGarantiaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGarantiaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGarantiaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGarantiaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGarantiaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGarantiaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGarantiaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGarantiaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGarantiaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGarantiaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGarantiaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGarantiaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGarantiaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGarantiaCliente.add(this.jMenuItemDetalleCerrarGarantiaCliente);
		
		this.jmenuDetalleAccionesGarantiaCliente.add(this.jMenuItemActualizarGarantiaCliente);
		this.jmenuDetalleAccionesGarantiaCliente.add(this.jMenuItemEliminarGarantiaCliente);
		this.jmenuDetalleAccionesGarantiaCliente.add(this.jMenuItemCancelarGarantiaCliente);		
		
		//this.jmenuDetalleDatosGarantiaCliente.add(this.jMenuItemDetalleAbrirOrderByGarantiaCliente);				
		this.jmenuDetalleDatosGarantiaCliente.add(this.jMenuItemDetalleMostarOcultarGarantiaCliente);				
				
		//this.jmenuDetalleAccionesGarantiaCliente.add(this.jMenuItemGuardarCambiosGarantiaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGarantiaCliente.add(this.jmenuDetalleArchivoGarantiaCliente);		
		this.jmenuBarDetalleGarantiaCliente.add(this.jmenuDetalleAccionesGarantiaCliente);		
		this.jmenuBarDetalleGarantiaCliente.add(this.jmenuDetalleDatosGarantiaCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGarantiaCliente);				
	}
	
	
	public void inicializarElementosCamposGarantiaCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGarantiaCliente = new JLabelMe();
		jLabelIdGarantiaCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGarantiaCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGarantiaCliente.setToolTipText(GarantiaClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGarantiaCliente= new GridBagLayout();

		this.jPanelidGarantiaCliente.setLayout(this.gridaBagLayoutGarantiaCliente);

		jLabelidGarantiaCliente = new JLabel();
		jLabelidGarantiaCliente.setText("Id");

		jLabelidGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorGarantiaCliente = new JLabelMe();
		this.jLabelvalorGarantiaCliente.setText(""+GarantiaClienteConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorGarantiaCliente.setToolTipText("Valor");
		this.jLabelvalorGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorGarantiaCliente.setToolTipText(GarantiaClienteConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutGarantiaCliente = new GridBagLayout();
		this.jPanelvalorGarantiaCliente.setLayout(this.gridaBagLayoutGarantiaCliente);


		jTextFieldvalorGarantiaCliente= new JTextFieldMe();
		jTextFieldvalorGarantiaCliente.setEnabled(false);
		jTextFieldvalorGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorGarantiaCliente.setText("0.0");

		this.jButtonvalorGarantiaClienteBusqueda= new JButtonMe();
		this.jButtonvalorGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorGarantiaClienteBusqueda.setText("U");
		this.jButtonvalorGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorGarantiaClienteBusqueda"));

		if(this.garantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorGarantiaClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_recepcionGarantiaCliente = new JLabelMe();
		this.jLabelfecha_recepcionGarantiaCliente.setText(""+GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION+" : *");
		this.jLabelfecha_recepcionGarantiaCliente.setToolTipText("Fecha Recepcion");
		this.jLabelfecha_recepcionGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_recepcionGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_recepcionGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_recepcionGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_recepcionGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_recepcionGarantiaCliente.setToolTipText(GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION);
		this.gridaBagLayoutGarantiaCliente = new GridBagLayout();
		this.jPanelfecha_recepcionGarantiaCliente.setLayout(this.gridaBagLayoutGarantiaCliente);


		//jFormattedTextFieldfecha_recepcionGarantiaCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_recepcionGarantiaCliente= new JDateChooser();
		jDateChooserfecha_recepcionGarantiaCliente.setEnabled(false);
		jDateChooserfecha_recepcionGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_recepcionGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_recepcionGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_recepcionGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_recepcionGarantiaCliente.setDate(new Date());
		jDateChooserfecha_recepcionGarantiaCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_recepcionGarantiaCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_recepcionGarantiaClienteBusqueda= new JButtonMe();
		this.jButtonfecha_recepcionGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_recepcionGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_recepcionGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_recepcionGarantiaClienteBusqueda.setText("U");
		this.jButtonfecha_recepcionGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_recepcionGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_recepcionGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_recepcionGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_recepcionGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_recepcionGarantiaClienteBusqueda"));

		if(this.garantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_recepcionGarantiaClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_firmaGarantiaCliente = new JLabelMe();
		this.jLabelfecha_firmaGarantiaCliente.setText(""+GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA+" : *");
		this.jLabelfecha_firmaGarantiaCliente.setToolTipText("Fecha Firma");
		this.jLabelfecha_firmaGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_firmaGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_firmaGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_firmaGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_firmaGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_firmaGarantiaCliente.setToolTipText(GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA);
		this.gridaBagLayoutGarantiaCliente = new GridBagLayout();
		this.jPanelfecha_firmaGarantiaCliente.setLayout(this.gridaBagLayoutGarantiaCliente);


		//jFormattedTextFieldfecha_firmaGarantiaCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_firmaGarantiaCliente= new JDateChooser();
		jDateChooserfecha_firmaGarantiaCliente.setEnabled(false);
		jDateChooserfecha_firmaGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_firmaGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_firmaGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_firmaGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_firmaGarantiaCliente.setDate(new Date());
		jDateChooserfecha_firmaGarantiaCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_firmaGarantiaCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_firmaGarantiaClienteBusqueda= new JButtonMe();
		this.jButtonfecha_firmaGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_firmaGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_firmaGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_firmaGarantiaClienteBusqueda.setText("U");
		this.jButtonfecha_firmaGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_firmaGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_firmaGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_firmaGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_firmaGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_firmaGarantiaClienteBusqueda"));

		if(this.garantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_firmaGarantiaClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_devolucionGarantiaCliente = new JLabelMe();
		this.jLabelfecha_devolucionGarantiaCliente.setText(""+GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION+" : *");
		this.jLabelfecha_devolucionGarantiaCliente.setToolTipText("Fecha Devolucion");
		this.jLabelfecha_devolucionGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_devolucionGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_devolucionGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_devolucionGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_devolucionGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_devolucionGarantiaCliente.setToolTipText(GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION);
		this.gridaBagLayoutGarantiaCliente = new GridBagLayout();
		this.jPanelfecha_devolucionGarantiaCliente.setLayout(this.gridaBagLayoutGarantiaCliente);


		//jFormattedTextFieldfecha_devolucionGarantiaCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_devolucionGarantiaCliente= new JDateChooser();
		jDateChooserfecha_devolucionGarantiaCliente.setEnabled(false);
		jDateChooserfecha_devolucionGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_devolucionGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_devolucionGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_devolucionGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_devolucionGarantiaCliente.setDate(new Date());
		jDateChooserfecha_devolucionGarantiaCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_devolucionGarantiaCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_devolucionGarantiaClienteBusqueda= new JButtonMe();
		this.jButtonfecha_devolucionGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_devolucionGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_devolucionGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_devolucionGarantiaClienteBusqueda.setText("U");
		this.jButtonfecha_devolucionGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_devolucionGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_devolucionGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_devolucionGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_devolucionGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_devolucionGarantiaClienteBusqueda"));

		if(this.garantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_devolucionGarantiaClienteBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioGarantiaCliente = new JLabelMe();
		this.jLabelbeneficiarioGarantiaCliente.setText(""+GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioGarantiaCliente.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioGarantiaCliente.setToolTipText(GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutGarantiaCliente = new GridBagLayout();
		this.jPanelbeneficiarioGarantiaCliente.setLayout(this.gridaBagLayoutGarantiaCliente);


		jTextAreabeneficiarioGarantiaCliente= new JTextAreaMe();
		jTextAreabeneficiarioGarantiaCliente.setEnabled(false);
		jTextAreabeneficiarioGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioGarantiaCliente.setLineWrap(true);
		jTextAreabeneficiarioGarantiaCliente.setWrapStyleWord(true);
		jTextAreabeneficiarioGarantiaCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioGarantiaCliente.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioGarantiaCliente = new JScrollPane(jTextAreabeneficiarioGarantiaCliente);
		jscrollPanebeneficiarioGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonbeneficiarioGarantiaClienteBusqueda= new JButtonMe();
		this.jButtonbeneficiarioGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioGarantiaClienteBusqueda.setText("U");
		this.jButtonbeneficiarioGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioGarantiaClienteBusqueda"));

		if(this.garantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioGarantiaClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGarantiaCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGarantiaCliente = new JLabelMe();
		this.jLabelid_empresaGarantiaCliente.setText(""+GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGarantiaCliente.setToolTipText("Empresa");
		this.jLabelid_empresaGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGarantiaCliente.setToolTipText(GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGarantiaCliente = new GridBagLayout();
		this.jPanelid_empresaGarantiaCliente.setLayout(this.gridaBagLayoutGarantiaCliente);


		jComboBoxid_empresaGarantiaCliente= new JComboBoxMe();
		jComboBoxid_empresaGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGarantiaCliente.setEnabled(false);

		this.jButtonid_empresaGarantiaCliente= new JButtonMe();
		this.jButtonid_empresaGarantiaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGarantiaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGarantiaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGarantiaCliente.setText("Buscar");
		this.jButtonid_empresaGarantiaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGarantiaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGarantiaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGarantiaCliente"));

		this.jButtonid_empresaGarantiaClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGarantiaClienteBusqueda.setText("U");
		this.jButtonid_empresaGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGarantiaClienteBusqueda"));

		if(this.garantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGarantiaClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaGarantiaClienteUpdate= new JButtonMe();
		this.jButtonid_empresaGarantiaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGarantiaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGarantiaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGarantiaClienteUpdate.setText("U");
		this.jButtonid_empresaGarantiaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGarantiaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGarantiaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGarantiaClienteUpdate"));



					
		this.jLabelid_sucursalGarantiaCliente = new JLabelMe();
		this.jLabelid_sucursalGarantiaCliente.setText(""+GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalGarantiaCliente.setToolTipText("Sucursal");
		this.jLabelid_sucursalGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalGarantiaCliente.setToolTipText(GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutGarantiaCliente = new GridBagLayout();
		this.jPanelid_sucursalGarantiaCliente.setLayout(this.gridaBagLayoutGarantiaCliente);


		jComboBoxid_sucursalGarantiaCliente= new JComboBoxMe();
		jComboBoxid_sucursalGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalGarantiaCliente.setEnabled(false);

		this.jButtonid_sucursalGarantiaCliente= new JButtonMe();
		this.jButtonid_sucursalGarantiaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGarantiaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGarantiaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGarantiaCliente.setText("Buscar");
		this.jButtonid_sucursalGarantiaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalGarantiaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGarantiaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGarantiaCliente"));

		this.jButtonid_sucursalGarantiaClienteBusqueda= new JButtonMe();
		this.jButtonid_sucursalGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalGarantiaClienteBusqueda.setText("U");
		this.jButtonid_sucursalGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGarantiaClienteBusqueda"));

		if(this.garantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalGarantiaClienteBusqueda.setVisible(false);		}

		this.jButtonid_sucursalGarantiaClienteUpdate= new JButtonMe();
		this.jButtonid_sucursalGarantiaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGarantiaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGarantiaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalGarantiaClienteUpdate.setText("U");
		this.jButtonid_sucursalGarantiaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalGarantiaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGarantiaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGarantiaClienteUpdate"));



					
		this.jLabelid_clienteGarantiaCliente = new JLabelMe();
		this.jLabelid_clienteGarantiaCliente.setText(""+GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteGarantiaCliente.setToolTipText("Cliente");
		this.jLabelid_clienteGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteGarantiaCliente.setToolTipText(GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutGarantiaCliente = new GridBagLayout();
		this.jPanelid_clienteGarantiaCliente.setLayout(this.gridaBagLayoutGarantiaCliente);


		jComboBoxid_clienteGarantiaCliente= new JComboBoxMe();
		jComboBoxid_clienteGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteGarantiaCliente= new JButtonMe();
		this.jButtonid_clienteGarantiaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteGarantiaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteGarantiaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteGarantiaCliente.setText("Buscar");
		this.jButtonid_clienteGarantiaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteGarantiaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteGarantiaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteGarantiaCliente"));

		this.jButtonid_clienteGarantiaClienteBusqueda= new JButtonMe();
		this.jButtonid_clienteGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteGarantiaClienteBusqueda.setText("U");
		this.jButtonid_clienteGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteGarantiaClienteBusqueda"));

		if(this.garantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteGarantiaClienteBusqueda.setVisible(false);		}

		this.jButtonid_clienteGarantiaClienteUpdate= new JButtonMe();
		this.jButtonid_clienteGarantiaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteGarantiaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteGarantiaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteGarantiaClienteUpdate.setText("U");
		this.jButtonid_clienteGarantiaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteGarantiaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteGarantiaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteGarantiaClienteUpdate"));



					
		this.jLabelid_tipo_garantia_empresaGarantiaCliente = new JLabelMe();
		this.jLabelid_tipo_garantia_empresaGarantiaCliente.setText(""+GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA+" : *");
		this.jLabelid_tipo_garantia_empresaGarantiaCliente.setToolTipText("Tipo Garantia Empresa");
		this.jLabelid_tipo_garantia_empresaGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_garantia_empresaGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_garantia_empresaGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_garantia_empresaGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_garantia_empresaGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_garantia_empresaGarantiaCliente.setToolTipText(GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA);
		this.gridaBagLayoutGarantiaCliente = new GridBagLayout();
		this.jPanelid_tipo_garantia_empresaGarantiaCliente.setLayout(this.gridaBagLayoutGarantiaCliente);


		jComboBoxid_tipo_garantia_empresaGarantiaCliente= new JComboBoxMe();
		jComboBoxid_tipo_garantia_empresaGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_garantia_empresaGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_garantia_empresaGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_garantia_empresaGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_garantia_empresaGarantiaCliente= new JButtonMe();
		this.jButtonid_tipo_garantia_empresaGarantiaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_garantia_empresaGarantiaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_garantia_empresaGarantiaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_garantia_empresaGarantiaCliente.setText("Buscar");
		this.jButtonid_tipo_garantia_empresaGarantiaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_garantia_empresaGarantiaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_garantia_empresaGarantiaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_garantia_empresaGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_garantia_empresaGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_garantia_empresaGarantiaCliente"));

		this.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda.setText("U");
		this.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_garantia_empresaGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_garantia_empresaGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_garantia_empresaGarantiaClienteBusqueda"));

		if(this.garantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_garantia_empresaGarantiaClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_garantia_empresaGarantiaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_garantia_empresaGarantiaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_garantia_empresaGarantiaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_garantia_empresaGarantiaClienteUpdate.setText("U");
		this.jButtonid_tipo_garantia_empresaGarantiaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_garantia_empresaGarantiaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_garantia_empresaGarantiaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_garantia_empresaGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_garantia_empresaGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_garantia_empresaGarantiaClienteUpdate"));



					
		this.jLabelid_estado_garantia_clienteGarantiaCliente = new JLabelMe();
		this.jLabelid_estado_garantia_clienteGarantiaCliente.setText(""+GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE+" : *");
		this.jLabelid_estado_garantia_clienteGarantiaCliente.setToolTipText("Estado Garantia Cliente");
		this.jLabelid_estado_garantia_clienteGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_garantia_clienteGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_garantia_clienteGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_garantia_clienteGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_garantia_clienteGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_garantia_clienteGarantiaCliente.setToolTipText(GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE);
		this.gridaBagLayoutGarantiaCliente = new GridBagLayout();
		this.jPanelid_estado_garantia_clienteGarantiaCliente.setLayout(this.gridaBagLayoutGarantiaCliente);


		jComboBoxid_estado_garantia_clienteGarantiaCliente= new JComboBoxMe();
		jComboBoxid_estado_garantia_clienteGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_garantia_clienteGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_garantia_clienteGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_garantia_clienteGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_garantia_clienteGarantiaCliente= new JButtonMe();
		this.jButtonid_estado_garantia_clienteGarantiaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_garantia_clienteGarantiaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_garantia_clienteGarantiaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_garantia_clienteGarantiaCliente.setText("Buscar");
		this.jButtonid_estado_garantia_clienteGarantiaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_garantia_clienteGarantiaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_garantia_clienteGarantiaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_garantia_clienteGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_garantia_clienteGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_garantia_clienteGarantiaCliente"));

		this.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda= new JButtonMe();
		this.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda.setText("U");
		this.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_garantia_clienteGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_garantia_clienteGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_garantia_clienteGarantiaClienteBusqueda"));

		if(this.garantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda.setVisible(false);		}

		this.jButtonid_estado_garantia_clienteGarantiaClienteUpdate= new JButtonMe();
		this.jButtonid_estado_garantia_clienteGarantiaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_garantia_clienteGarantiaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_garantia_clienteGarantiaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_garantia_clienteGarantiaClienteUpdate.setText("U");
		this.jButtonid_estado_garantia_clienteGarantiaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_garantia_clienteGarantiaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_garantia_clienteGarantiaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_garantia_clienteGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_garantia_clienteGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_garantia_clienteGarantiaClienteUpdate"));



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
		//this.jInternalFrameDetalleGarantiaCliente = new GarantiaClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Garantia Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGarantiaCliente= new GridBagLayout();
		

		
		String sToolTipGarantiaCliente="";
		sToolTipGarantiaCliente=GarantiaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGarantiaCliente+="(Cartera.GarantiaCliente)";
		}
		
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipGarantiaCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGarantiaCliente = new JButtonMe();
		this.jButtonModificarGarantiaCliente = new JButtonMe();
        this.jButtonActualizarGarantiaCliente = new JButtonMe();
        this.jButtonEliminarGarantiaCliente = new JButtonMe();
        this.jButtonCancelarGarantiaCliente = new JButtonMe();
        this.jButtonGuardarCambiosGarantiaCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaGarantiaCliente = new JButtonMe();
		this.jButtonCerrarGarantiaCliente = new JButtonMe();
		
		this.jScrollPanelDatosGarantiaCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionGarantiaCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralGarantiaCliente = new JScrollPane();
				
		
		
		this.jPanelCamposGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Garantia Cliente";
		
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Garantia Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosGarantiaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGarantiaCliente.setName("jPanelCamposGarantiaCliente"); 

		this.jPanelCamposOcultosGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGarantiaCliente.setName("jPanelCamposOcultosGarantiaCliente"); 

        this.jPanelAccionesGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGarantiaCliente.setToolTipText("Acciones");
        this.jPanelAccionesGarantiaCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGarantiaCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGarantiaCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGarantiaCliente.setText("Nuevo");
		this.jButtonModificarGarantiaCliente.setText("Editar");
        this.jButtonActualizarGarantiaCliente.setText("Actualizar");
        this.jButtonEliminarGarantiaCliente.setText("Eliminar");
        this.jButtonCancelarGarantiaCliente.setText("Cancelar");
        this.jButtonGuardarCambiosGarantiaCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaGarantiaCliente.setText("Guardar");
		this.jButtonCerrarGarantiaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGarantiaCliente,"nuevo_button","Nuevo",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGarantiaCliente,"modificar_button","Editar",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGarantiaCliente,"actualizar_button","Actualizar",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGarantiaCliente,"eliminar_button","Eliminar",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGarantiaCliente,"cancelar_button","Cancelar",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGarantiaCliente,"guardarcambios_button","Guardar",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGarantiaCliente,"guardarcambiostabla_button","Guardar",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGarantiaCliente,"cerrar_button","Salir",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGarantiaCliente.setToolTipText("Nuevo"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGarantiaCliente.setToolTipText("Editar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGarantiaCliente.setToolTipText("Actualizar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGarantiaCliente.setToolTipText("Eliminar)"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGarantiaCliente.setToolTipText("Cancelar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGarantiaCliente.setToolTipText("Guardar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGarantiaCliente.setToolTipText("Guardar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGarantiaCliente.setToolTipText("Salir"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGarantiaCliente";
		inputMap = this.jButtonNuevoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGarantiaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGarantiaCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGarantiaCliente";
		inputMap = this.jButtonActualizarGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGarantiaCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarGarantiaCliente";
		inputMap = this.jButtonEliminarGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGarantiaCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarGarantiaCliente";
		inputMap = this.jButtonCancelarGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGarantiaCliente"));
		
		//CERRAR		
		sMapKey = "CerrarGarantiaCliente";
		inputMap = this.jButtonCerrarGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGarantiaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGarantiaCliente";
		inputMap = this.jButtonGuardarCambiosTablaGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGarantiaCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGarantiaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGarantiaCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGarantiaCliente.setToolTipText("Nuevo GarantiaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGarantiaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGarantiaCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGarantiaCliente.setToolTipText("Sin Cerrar Ventana GarantiaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGarantiaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGarantiaCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGarantiaCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGarantiaCliente.setText("Accion");
		this.jComboBoxTiposAccionesGarantiaCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGarantiaCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGarantiaCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGarantiaCliente = new JLabelMe();
		
		this.jLabelAccionesGarantiaCliente.setText("Acciones");		
		this.jLabelAccionesGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGarantiaCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGarantiaCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGarantiaCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGarantiaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGarantiaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGarantiaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGarantiaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGarantiaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGarantiaCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGarantiaCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGarantiaCliente = new GridBagLayout();
		
		this.jPanelCamposGarantiaCliente.setLayout(gridaBagLayoutCamposGarantiaCliente);
		this.jPanelCamposOcultosGarantiaCliente.setLayout(gridaBagLayoutCamposOcultosGarantiaCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 0;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGarantiaCliente.add(jLabelIdGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 1;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGarantiaCliente.add(jLabelidGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 0;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGarantiaCliente.add(jLabelid_empresaGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 2;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGarantiaCliente.add(jButtonid_empresaGarantiaClienteBusqueda, this.gridBagConstraintsGarantiaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 3;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGarantiaCliente.add(jButtonid_empresaGarantiaClienteUpdate, this.gridBagConstraintsGarantiaCliente);
	}

	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 1;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGarantiaCliente.add(jComboBoxid_empresaGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 0;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalGarantiaCliente.add(jLabelid_sucursalGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 2;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalGarantiaCliente.add(jButtonid_sucursalGarantiaClienteBusqueda, this.gridBagConstraintsGarantiaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 3;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalGarantiaCliente.add(jButtonid_sucursalGarantiaClienteUpdate, this.gridBagConstraintsGarantiaCliente);
	}

	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 1;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalGarantiaCliente.add(jComboBoxid_sucursalGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 0;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteGarantiaCliente.add(jLabelid_clienteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 2;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteGarantiaCliente.add(jButtonid_clienteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 3;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteGarantiaCliente.add(jButtonid_clienteGarantiaClienteBusqueda, this.gridBagConstraintsGarantiaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 4;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteGarantiaCliente.add(jButtonid_clienteGarantiaClienteUpdate, this.gridBagConstraintsGarantiaCliente);
	}

	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 1;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteGarantiaCliente.add(jComboBoxid_clienteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 0;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_garantia_empresaGarantiaCliente.add(jLabelid_tipo_garantia_empresaGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 2;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_garantia_empresaGarantiaCliente.add(jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda, this.gridBagConstraintsGarantiaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 3;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_garantia_empresaGarantiaCliente.add(jButtonid_tipo_garantia_empresaGarantiaClienteUpdate, this.gridBagConstraintsGarantiaCliente);
	}

	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 1;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_garantia_empresaGarantiaCliente.add(jComboBoxid_tipo_garantia_empresaGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 0;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorGarantiaCliente.add(jLabelvalorGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 2;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorGarantiaCliente.add(jButtonvalorGarantiaClienteBusqueda, this.gridBagConstraintsGarantiaCliente);
	}

	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 1;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorGarantiaCliente.add(jTextFieldvalorGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 0;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_recepcionGarantiaCliente.add(jLabelfecha_recepcionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 2;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_recepcionGarantiaCliente.add(jButtonfecha_recepcionGarantiaClienteBusqueda, this.gridBagConstraintsGarantiaCliente);
	}

	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 1;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_recepcionGarantiaCliente.add(jDateChooserfecha_recepcionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 0;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_firmaGarantiaCliente.add(jLabelfecha_firmaGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 2;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_firmaGarantiaCliente.add(jButtonfecha_firmaGarantiaClienteBusqueda, this.gridBagConstraintsGarantiaCliente);
	}

	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 1;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_firmaGarantiaCliente.add(jDateChooserfecha_firmaGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 0;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_devolucionGarantiaCliente.add(jLabelfecha_devolucionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 2;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_devolucionGarantiaCliente.add(jButtonfecha_devolucionGarantiaClienteBusqueda, this.gridBagConstraintsGarantiaCliente);
	}

	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 1;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_devolucionGarantiaCliente.add(jDateChooserfecha_devolucionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 0;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiarioGarantiaCliente.add(jLabelbeneficiarioGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 2;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioGarantiaCliente.add(jButtonbeneficiarioGarantiaClienteBusqueda, this.gridBagConstraintsGarantiaCliente);
	}

	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 1;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiarioGarantiaCliente.add(jscrollPanebeneficiarioGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 0;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_garantia_clienteGarantiaCliente.add(jLabelid_estado_garantia_clienteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 2;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_garantia_clienteGarantiaCliente.add(jButtonid_estado_garantia_clienteGarantiaClienteBusqueda, this.gridBagConstraintsGarantiaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 3;
		this.gridBagConstraintsGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_garantia_clienteGarantiaCliente.add(jButtonid_estado_garantia_clienteGarantiaClienteUpdate, this.gridBagConstraintsGarantiaCliente);
	}

	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGarantiaCliente.gridy = 0;
	this.gridBagConstraintsGarantiaCliente.gridx = 1;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_garantia_clienteGarantiaCliente.add(jComboBoxid_estado_garantia_clienteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGarantiaCliente.gridy = iYPanelCamposGarantiaCliente;
	this.gridBagConstraintsGarantiaCliente.gridx = iXPanelCamposGarantiaCliente++;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGarantiaCliente.add(this.jPanelidGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(iXPanelCamposGarantiaCliente % 1==0) {
		iXPanelCamposGarantiaCliente=0;
		iYPanelCamposGarantiaCliente++;
	}
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGarantiaCliente.gridy = iYPanelCamposGarantiaCliente;
	this.gridBagConstraintsGarantiaCliente.gridx = iXPanelCamposGarantiaCliente++;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGarantiaCliente.add(this.jPanelid_clienteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(iXPanelCamposGarantiaCliente % 1==0) {
		iXPanelCamposGarantiaCliente=0;
		iYPanelCamposGarantiaCliente++;
	}
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGarantiaCliente.gridy = iYPanelCamposGarantiaCliente;
	this.gridBagConstraintsGarantiaCliente.gridx = iXPanelCamposGarantiaCliente++;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGarantiaCliente.add(this.jPanelid_tipo_garantia_empresaGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(iXPanelCamposGarantiaCliente % 1==0) {
		iXPanelCamposGarantiaCliente=0;
		iYPanelCamposGarantiaCliente++;
	}
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGarantiaCliente.gridy = iYPanelCamposGarantiaCliente;
	this.gridBagConstraintsGarantiaCliente.gridx = iXPanelCamposGarantiaCliente++;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGarantiaCliente.add(this.jPanelvalorGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(iXPanelCamposGarantiaCliente % 1==0) {
		iXPanelCamposGarantiaCliente=0;
		iYPanelCamposGarantiaCliente++;
	}
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGarantiaCliente.gridy = iYPanelCamposGarantiaCliente;
	this.gridBagConstraintsGarantiaCliente.gridx = iXPanelCamposGarantiaCliente++;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGarantiaCliente.add(this.jPanelfecha_recepcionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(iXPanelCamposGarantiaCliente % 1==0) {
		iXPanelCamposGarantiaCliente=0;
		iYPanelCamposGarantiaCliente++;
	}
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGarantiaCliente.gridy = iYPanelCamposGarantiaCliente;
	this.gridBagConstraintsGarantiaCliente.gridx = iXPanelCamposGarantiaCliente++;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGarantiaCliente.add(this.jPanelfecha_firmaGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(iXPanelCamposGarantiaCliente % 1==0) {
		iXPanelCamposGarantiaCliente=0;
		iYPanelCamposGarantiaCliente++;
	}
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGarantiaCliente.gridy = iYPanelCamposGarantiaCliente;
	this.gridBagConstraintsGarantiaCliente.gridx = iXPanelCamposGarantiaCliente++;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGarantiaCliente.add(this.jPanelfecha_devolucionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(iXPanelCamposGarantiaCliente % 1==0) {
		iXPanelCamposGarantiaCliente=0;
		iYPanelCamposGarantiaCliente++;
	}
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGarantiaCliente.gridy = iYPanelCamposGarantiaCliente;
	this.gridBagConstraintsGarantiaCliente.gridx = iXPanelCamposGarantiaCliente++;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGarantiaCliente.add(this.jPanelbeneficiarioGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(iXPanelCamposGarantiaCliente % 1==0) {
		iXPanelCamposGarantiaCliente=0;
		iYPanelCamposGarantiaCliente++;
	}
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGarantiaCliente.gridy = iYPanelCamposGarantiaCliente;
	this.gridBagConstraintsGarantiaCliente.gridx = iXPanelCamposGarantiaCliente++;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGarantiaCliente.add(this.jPanelid_estado_garantia_clienteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(iXPanelCamposGarantiaCliente % 1==0) {
		iXPanelCamposGarantiaCliente=0;
		iYPanelCamposGarantiaCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGarantiaCliente.gridy = iYPanelCamposOcultosGarantiaCliente;
	this.gridBagConstraintsGarantiaCliente.gridx = iXPanelCamposOcultosGarantiaCliente++;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGarantiaCliente.add(this.jPanelid_empresaGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(iXPanelCamposOcultosGarantiaCliente % 1==0) {
		iXPanelCamposOcultosGarantiaCliente=0;
		iYPanelCamposOcultosGarantiaCliente++;
	}
	this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGarantiaCliente.gridy = iYPanelCamposOcultosGarantiaCliente;
	this.gridBagConstraintsGarantiaCliente.gridx = iXPanelCamposOcultosGarantiaCliente++;
	this.gridBagConstraintsGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGarantiaCliente.add(this.jPanelid_sucursalGarantiaCliente, this.gridBagConstraintsGarantiaCliente);



	if(iXPanelCamposOcultosGarantiaCliente % 1==0) {
		iXPanelCamposOcultosGarantiaCliente=0;
		iYPanelCamposOcultosGarantiaCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesGarantiaCliente= new GridBagLayout();
		this.jPanelAccionesGarantiaCliente.setLayout(gridaBagLayoutAccionesGarantiaCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGarantiaCliente= new GridBagLayout();
		this.jPanelAccionesFormularioGarantiaCliente.setLayout(gridaBagLayoutAccionesFormularioGarantiaCliente);
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGarantiaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGarantiaCliente.add(this.jComboBoxTiposAccionesFormularioGarantiaCliente, this.gridBagConstraintsGarantiaCliente);

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGarantiaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGarantiaCliente.add(this.jCheckBoxPostAccionNuevoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGarantiaCliente.add(this.jCheckBoxPostAccionSinCerrarGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGarantiaCliente.add(this.jCheckBoxPostAccionSinMensajeGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesGarantiaCliente.add(this.jButtonModificarGarantiaCliente, this.gridBagConstraintsGarantiaCliente);							

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesGarantiaCliente.add(this.jButtonEliminarGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
			
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = 0;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesGarantiaCliente.add(this.jButtonActualizarGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = 0;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesGarantiaCliente.add(this.jButtonGuardarCambiosGarantiaCliente, this.gridBagConstraintsGarantiaCliente);	
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = 0;		
		this.gridBagConstraintsGarantiaCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesGarantiaCliente.add(this.jButtonCancelarGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGarantiaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGarantiaCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();						
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGarantiaCliente.gridx = 0;		
			//this.gridBagConstraintsGarantiaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGarantiaCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGarantiaCliente.gridx =0;
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGarantiaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GarantiaClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGarantiaCliente = new GarantiaClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Garantia Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Garantia Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Garantia Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GarantiaClienteModel garantiaclienteModel=new GarantiaClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//GarantiaClienteModel.GarantiaClienteFocusTraversalPolicy garantiaclienteFocusTraversalPolicy = garantiaclienteModel.new GarantiaClienteFocusTraversalPolicy(this);
			
			//garantiaclienteFocusTraversalPolicy.setgarantiaclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(garantiaclienteModel);
			
			
			this.jContentPaneDetalleGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGarantiaCliente = new GridBagLayout();	
			this.jContentPaneDetalleGarantiaCliente.setLayout(gridaBagLayoutDetalleGarantiaCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGarantiaCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
				this.gridBagConstraintsGarantiaCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGarantiaCliente.gridx = 0;
					
				
				this.jContentPaneDetalleGarantiaCliente.add(jTtoolBarDetalleGarantiaCliente, gridBagConstraintsGarantiaCliente);								
				
}
			
			this.jScrollPanelDatosEdicionGarantiaCliente=   new JScrollPane(jContentPaneDetalleGarantiaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGarantiaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGarantiaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGarantiaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGarantiaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGarantiaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGarantiaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGarantiaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGarantiaCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGarantiaCliente.gridx = 0;
	        
			this.jContentPaneDetalleGarantiaCliente.add(jPanelCamposGarantiaCliente, gridBagConstraintsGarantiaCliente);
			
			
			
			
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
						&& garantiaclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.garantiaclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGarantiaCliente= new GridBagConstraints();
						this.gridBagConstraintsGarantiaCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGarantiaCliente.gridx = 0;
						this.jContentPaneDetalleGarantiaCliente.add(this.jTabbedPaneRelacionesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGarantiaCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGarantiaCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
					this.gridBagConstraintsGarantiaCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGarantiaCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGarantiaCliente.gridx = 0;
					
				
					this.jContentPaneDetalleGarantiaCliente.add(jPanelCamposOcultosGarantiaCliente, gridBagConstraintsGarantiaCliente);
				
					this.jPanelCamposOcultosGarantiaCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsGarantiaCliente.gridx = 0;
	        this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGarantiaCliente.add(this.jPanelAccionesFormularioGarantiaCliente, this.gridBagConstraintsGarantiaCliente);							
			
			
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
	        this.gridBagConstraintsGarantiaCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsGarantiaCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleGarantiaCliente.add(this.jPanelAccionesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGarantiaCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGarantiaCliente=   new JScrollPane(this.jPanelCamposGarantiaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGarantiaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGarantiaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGarantiaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGarantiaCliente.gridx = 0;
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGarantiaCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGarantiaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGarantiaCliente, this.gridBagConstraintsGarantiaCliente);			
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGarantiaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGarantiaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			
			
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGarantiaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
			
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGarantiaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGarantiaCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionGarantiaCliente;
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
