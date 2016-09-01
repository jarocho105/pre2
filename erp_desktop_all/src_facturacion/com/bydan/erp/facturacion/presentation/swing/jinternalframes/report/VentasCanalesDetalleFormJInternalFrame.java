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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.VentasCanalesConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class VentasCanalesDetalleFormJInternalFrame extends VentasCanalesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVentasCanales;
	
	protected JMenuBar jmenuBarDetalleVentasCanales;
	
	protected JMenu jmenuDetalleVentasCanales;
	protected JMenu jmenuDetalleArchivoVentasCanales;
	protected JMenu jmenuDetalleAccionesVentasCanales;
	protected JMenu jmenuDetalleDatosVentasCanales;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasCanales;	
	protected GridBagConstraints gridBagConstraintsVentasCanales;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VentasCanalesBeanSwingJInternalFrameAdditional jInternalFrameDetalleVentasCanales;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TituloClienteBeanSwingJInternalFrame tituloclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_titulocliente="";
	
	public VentasCanalesSessionBean ventascanalesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TituloClienteSessionBean tituloclienteSessionBean;	
	
	public VentasCanalesLogic ventascanalesLogic;
	
	public JScrollPane jScrollPanelDatosVentasCanales;
	public JScrollPane jScrollPanelDatosEdicionVentasCanales;
	public JScrollPane jScrollPanelDatosGeneralVentasCanales;
	
	protected JPanel jPanelCamposVentasCanales;    
	protected JPanel jPanelCamposOcultosVentasCanales;    	
	protected JPanel jPanelAccionesVentasCanales;
	protected JPanel jPanelAccionesFormularioVentasCanales;
    
	
	
	protected Integer iXPanelCamposVentasCanales=0;
	protected Integer iYPanelCamposVentasCanales=0;
	
	protected Integer iXPanelCamposOcultosVentasCanales=0;
	protected Integer iYPanelCamposOcultosVentasCanales=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVentasCanales;
	public JButton jButtonModificarVentasCanales;
	public JButton jButtonActualizarVentasCanales;
    public JButton jButtonEliminarVentasCanales;
	public JButton jButtonCancelarVentasCanales;
    public JButton jButtonGuardarCambiosVentasCanales;
	public JButton jButtonGuardarCambiosTablaVentasCanales;
	protected JButton jButtonCerrarVentasCanales;
	
	
	protected JButton jButtonProcesarInformacionVentasCanales;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVentasCanales;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVentasCanales;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVentasCanales;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasCanales;
	protected JButton jButtonModificarToolBarVentasCanales;
	protected JButton jButtonActualizarToolBarVentasCanales;
    protected JButton jButtonEliminarToolBarVentasCanales;
	protected JButton jButtonCancelarToolBarVentasCanales;
    protected JButton jButtonGuardarCambiosToolBarVentasCanales;
	protected JButton jButtonGuardarCambiosTablaToolBarVentasCanales;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasCanales;
	protected JButton jButtonCerrarToolBarVentasCanales;
	
	protected JButton jButtonProcesarInformacionToolBarVentasCanales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasCanales;
	protected JMenuItem jMenuItemModificarVentasCanales;
	protected JMenuItem jMenuItemActualizarVentasCanales;
    protected JMenuItem jMenuItemEliminarVentasCanales;
	protected JMenuItem jMenuItemCancelarVentasCanales;
    protected JMenuItem jMenuItemGuardarCambiosVentasCanales;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasCanales;
	protected JMenuItem jMenuItemCerrarVentasCanales;
	protected JMenuItem jMenuItemDetalleCerrarVentasCanales;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasCanales;
	
	protected JMenuItem jMenuItemProcesarInformacionVentasCanales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasCanales;
	protected JMenuItem jMenuItemMostrarOcultarVentasCanales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasCanales;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasCanales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasCanales;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVentasCanales;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVentasCanales;
	public JLabel jLabelIdVentasCanales;
	public JLabel jLabelidVentasCanales;
	public JButton jButtonidVentasCanalesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeVentasCanales;
	public JLabel jLabelfecha_emision_desdeVentasCanales;
	//public JFormattedTextField jDateChooserfecha_emision_desdeVentasCanales;

	public JDateChooser jDateChooserfecha_emision_desdeVentasCanales;
	public JButton jButtonfecha_emision_desdeVentasCanalesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaVentasCanales;
	public JLabel jLabelfecha_emision_hastaVentasCanales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaVentasCanales;

	public JDateChooser jDateChooserfecha_emision_hastaVentasCanales;
	public JButton jButtonfecha_emision_hastaVentasCanalesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_titulo_clienteVentasCanales;
	public JLabel jLabelnombre_titulo_clienteVentasCanales;
	public JTextArea jTextAreanombre_titulo_clienteVentasCanales;
	public JScrollPane jscrollPanenombre_titulo_clienteVentasCanales;
	public JButton jButtonnombre_titulo_clienteVentasCanalesBusqueda= new JButtonMe();

	public JPanel jPanelmontoVentasCanales;
	public JLabel jLabelmontoVentasCanales;
	public JTextField jTextFieldmontoVentasCanales;
	public JButton jButtonmontoVentasCanalesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_titulo_clienteVentasCanales;
	public JLabel jLabelcodigo_titulo_clienteVentasCanales;
	public JTextField jTextFieldcodigo_titulo_clienteVentasCanales;
	public JButton jButtoncodigo_titulo_clienteVentasCanalesBusqueda= new JButtonMe();

	public JPanel jPanelnotas_creditoVentasCanales;
	public JLabel jLabelnotas_creditoVentasCanales;
	public JTextField jTextFieldnotas_creditoVentasCanales;
	public JButton jButtonnotas_creditoVentasCanalesBusqueda= new JButtonMe();

	public JPanel jPanelventa_netaVentasCanales;
	public JLabel jLabelventa_netaVentasCanales;
	public JTextField jTextFieldventa_netaVentasCanales;
	public JButton jButtonventa_netaVentasCanalesBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeVentasCanales;
	public JLabel jLabelporcentajeVentasCanales;
	public JTextField jTextFieldporcentajeVentasCanales;
	public JButton jButtonporcentajeVentasCanalesBusqueda= new JButtonMe();

	public JPanel jPanelacumuladoVentasCanales;
	public JLabel jLabelacumuladoVentasCanales;
	public JTextField jTextFieldacumuladoVentasCanales;
	public JButton jButtonacumuladoVentasCanalesBusqueda= new JButtonMe();

	public JPanel jPaneltipoVentasCanales;
	public JLabel jLabeltipoVentasCanales;
	public JTextField jTextFieldtipoVentasCanales;
	public JButton jButtontipoVentasCanalesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVentasCanales;
	public JLabel jLabelid_empresaVentasCanales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVentasCanales;
	public JButton jButtonid_empresaVentasCanales= new JButtonMe();
	public JButton jButtonid_empresaVentasCanalesUpdate= new JButtonMe();
	public JButton jButtonid_empresaVentasCanalesBusqueda= new JButtonMe();

	public JPanel jPanelid_titulo_clienteVentasCanales;
	public JLabel jLabelid_titulo_clienteVentasCanales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_titulo_clienteVentasCanales;
	public JButton jButtonid_titulo_clienteVentasCanales= new JButtonMe();
	public JButton jButtonid_titulo_clienteVentasCanalesUpdate= new JButtonMe();
	public JButton jButtonid_titulo_clienteVentasCanalesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVentasCanales;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VentasCanalesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVentasCanales=new JPanel();
				this.jPanelAccionesFormularioVentasCanales=new JPanel();
				this.jmenuBarDetalleVentasCanales=new JMenuBar();
				this.jTtoolBarDetalleVentasCanales=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCanalesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VentasCanales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VentasCanalesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VentasCanales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCanalesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasCanales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCanalesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasCanales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCanalesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasCanales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVentasCanales() {
		return this.jButtonActualizarToolBarVentasCanales;
	}
	
	public JButton getjButtonEliminarToolBarVentasCanales() {
		return this.jButtonEliminarToolBarVentasCanales;
	}
	
	public JButton getjButtonCancelarToolBarVentasCanales() {
		return this.jButtonCancelarToolBarVentasCanales;
	}		
	
	public JButton getjButtonProcesarInformacionVentasCanales() {
		return this.jButtonProcesarInformacionVentasCanales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasCanales)	{
		this.jButtonProcesarInformacionVentasCanales = jButtonProcesarInformacionVentasCanales;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasCanales() {
		return this.jComboBoxTiposAccionesVentasCanales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasCanales(
			JComboBox jComboBoxTiposRelacionesVentasCanales) {
		this.jComboBoxTiposRelacionesVentasCanales = jComboBoxTiposRelacionesVentasCanales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasCanales(
			JComboBox jComboBoxTiposAccionesVentasCanales) {
		this.jComboBoxTiposAccionesVentasCanales = jComboBoxTiposAccionesVentasCanales;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVentasCanales() {
		return this.jComboBoxTiposAccionesFormularioVentasCanales;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVentasCanales(
			JComboBox jComboBoxTiposAccionesFormularioVentasCanales) {
		this.jComboBoxTiposAccionesFormularioVentasCanales = jComboBoxTiposAccionesFormularioVentasCanales;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ventascanalesSessionBean=new VentasCanalesSessionBean();
		
		this.ventascanalesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventascanalesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventascanalesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasCanalesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasCanalesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasCanalesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Canales MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
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
	
		VentasCanalesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVentasCanales= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVentasCanales=new JButtonMe();
				this.jButtonModificarToolBarVentasCanales=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVentasCanales,this.jTtoolBarDetalleVentasCanales,
							"actualizar","actualizar","Actualizar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVentasCanales,this.jTtoolBarDetalleVentasCanales,
							"eliminar","eliminar","Eliminar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVentasCanales,this.jTtoolBarDetalleVentasCanales,
							"cancelar","cancelar","Cancelar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVentasCanales,this.jTtoolBarDetalleVentasCanales,
							"guardarcambios","guardarcambios","Guardar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVentasCanales=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVentasCanales=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVentasCanales=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVentasCanales=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVentasCanales=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasCanales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasCanales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasCanales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVentasCanales= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVentasCanales.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVentasCanales,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVentasCanales= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVentasCanales.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVentasCanales,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVentasCanales= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVentasCanales.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVentasCanales,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVentasCanales= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVentasCanales.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVentasCanales,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVentasCanales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasCanales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasCanales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasCanales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasCanales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasCanales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVentasCanales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVentasCanales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVentasCanales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasCanales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasCanales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasCanales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasCanales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasCanales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasCanales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVentasCanales.add(this.jMenuItemDetalleCerrarVentasCanales);
		
		this.jmenuDetalleAccionesVentasCanales.add(this.jMenuItemActualizarVentasCanales);
		this.jmenuDetalleAccionesVentasCanales.add(this.jMenuItemEliminarVentasCanales);
		this.jmenuDetalleAccionesVentasCanales.add(this.jMenuItemCancelarVentasCanales);		
		
		//this.jmenuDetalleDatosVentasCanales.add(this.jMenuItemDetalleAbrirOrderByVentasCanales);				
		this.jmenuDetalleDatosVentasCanales.add(this.jMenuItemDetalleMostarOcultarVentasCanales);				
				
		//this.jmenuDetalleAccionesVentasCanales.add(this.jMenuItemGuardarCambiosVentasCanales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVentasCanales.add(this.jmenuDetalleArchivoVentasCanales);		
		this.jmenuBarDetalleVentasCanales.add(this.jmenuDetalleAccionesVentasCanales);		
		this.jmenuBarDetalleVentasCanales.add(this.jmenuDetalleDatosVentasCanales);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVentasCanales);				
	}
	
	
	public void inicializarElementosCamposVentasCanales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVentasCanales = new JLabelMe();
		jLabelIdVentasCanales.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVentasCanales = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVentasCanales= new GridBagLayout();

		this.jPanelidVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);

		jLabelidVentasCanales = new JLabel();
		jLabelidVentasCanales.setText("Id");

		jLabelidVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeVentasCanales = new JLabelMe();
		this.jLabelfecha_emision_desdeVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeVentasCanales.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPanelfecha_emision_desdeVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		//jFormattedTextFieldfecha_emision_desdeVentasCanales= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeVentasCanales= new JDateChooser();
		jDateChooserfecha_emision_desdeVentasCanales.setEnabled(false);
		jDateChooserfecha_emision_desdeVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeVentasCanales.setDate(new Date());
		jDateChooserfecha_emision_desdeVentasCanales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeVentasCanales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeVentasCanalesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeVentasCanalesBusqueda.setText("U");
		this.jButtonfecha_emision_desdeVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeVentasCanalesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaVentasCanales = new JLabelMe();
		this.jLabelfecha_emision_hastaVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaVentasCanales.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPanelfecha_emision_hastaVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		//jFormattedTextFieldfecha_emision_hastaVentasCanales= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaVentasCanales= new JDateChooser();
		jDateChooserfecha_emision_hastaVentasCanales.setEnabled(false);
		jDateChooserfecha_emision_hastaVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaVentasCanales.setDate(new Date());
		jDateChooserfecha_emision_hastaVentasCanales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaVentasCanales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaVentasCanalesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaVentasCanalesBusqueda.setText("U");
		this.jButtonfecha_emision_hastaVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaVentasCanalesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_titulo_clienteVentasCanales = new JLabelMe();
		this.jLabelnombre_titulo_clienteVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE+" : *");
		this.jLabelnombre_titulo_clienteVentasCanales.setToolTipText("Nombre Titulo Cliente");
		this.jLabelnombre_titulo_clienteVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_titulo_clienteVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_titulo_clienteVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_titulo_clienteVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_titulo_clienteVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_titulo_clienteVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPanelnombre_titulo_clienteVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		jTextAreanombre_titulo_clienteVentasCanales= new JTextAreaMe();
		jTextAreanombre_titulo_clienteVentasCanales.setEnabled(false);
		jTextAreanombre_titulo_clienteVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_titulo_clienteVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_titulo_clienteVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_titulo_clienteVentasCanales.setLineWrap(true);
		jTextAreanombre_titulo_clienteVentasCanales.setWrapStyleWord(true);
		jTextAreanombre_titulo_clienteVentasCanales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_titulo_clienteVentasCanales.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_titulo_clienteVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_titulo_clienteVentasCanales = new JScrollPane(jTextAreanombre_titulo_clienteVentasCanales);
		jscrollPanenombre_titulo_clienteVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_titulo_clienteVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_titulo_clienteVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_titulo_clienteVentasCanalesBusqueda= new JButtonMe();
		this.jButtonnombre_titulo_clienteVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_titulo_clienteVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_titulo_clienteVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_titulo_clienteVentasCanalesBusqueda.setText("U");
		this.jButtonnombre_titulo_clienteVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_titulo_clienteVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_titulo_clienteVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_titulo_clienteVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_titulo_clienteVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_titulo_clienteVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_titulo_clienteVentasCanalesBusqueda.setVisible(false);		}


					
		this.jLabelmontoVentasCanales = new JLabelMe();
		this.jLabelmontoVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoVentasCanales.setToolTipText("Monto");
		this.jLabelmontoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPanelmontoVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		jTextFieldmontoVentasCanales= new JTextFieldMe();
		jTextFieldmontoVentasCanales.setEnabled(false);
		jTextFieldmontoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoVentasCanales.setText("0.0");

		this.jButtonmontoVentasCanalesBusqueda= new JButtonMe();
		this.jButtonmontoVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoVentasCanalesBusqueda.setText("U");
		this.jButtonmontoVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoVentasCanalesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_titulo_clienteVentasCanales = new JLabelMe();
		this.jLabelcodigo_titulo_clienteVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE+" : *");
		this.jLabelcodigo_titulo_clienteVentasCanales.setToolTipText("Codigo Titulo Cliente");
		this.jLabelcodigo_titulo_clienteVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_titulo_clienteVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_titulo_clienteVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_titulo_clienteVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_titulo_clienteVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_titulo_clienteVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPanelcodigo_titulo_clienteVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		jTextFieldcodigo_titulo_clienteVentasCanales= new JTextFieldMe();

		jTextFieldcodigo_titulo_clienteVentasCanales.setEnabled(false);
		jTextFieldcodigo_titulo_clienteVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_titulo_clienteVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_titulo_clienteVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_titulo_clienteVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_titulo_clienteVentasCanalesBusqueda= new JButtonMe();
		this.jButtoncodigo_titulo_clienteVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_titulo_clienteVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_titulo_clienteVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_titulo_clienteVentasCanalesBusqueda.setText("U");
		this.jButtoncodigo_titulo_clienteVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_titulo_clienteVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_titulo_clienteVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_titulo_clienteVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_titulo_clienteVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_titulo_clienteVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_titulo_clienteVentasCanalesBusqueda.setVisible(false);		}


					
		this.jLabelnotas_creditoVentasCanales = new JLabelMe();
		this.jLabelnotas_creditoVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO+" : *");
		this.jLabelnotas_creditoVentasCanales.setToolTipText("Notas Credito");
		this.jLabelnotas_creditoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnotas_creditoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnotas_creditoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnotas_creditoVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnotas_creditoVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnotas_creditoVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPanelnotas_creditoVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		jTextFieldnotas_creditoVentasCanales= new JTextFieldMe();
		jTextFieldnotas_creditoVentasCanales.setEnabled(false);
		jTextFieldnotas_creditoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnotas_creditoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnotas_creditoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnotas_creditoVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnotas_creditoVentasCanales.setText("0.0");

		this.jButtonnotas_creditoVentasCanalesBusqueda= new JButtonMe();
		this.jButtonnotas_creditoVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnotas_creditoVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnotas_creditoVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnotas_creditoVentasCanalesBusqueda.setText("U");
		this.jButtonnotas_creditoVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnotas_creditoVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnotas_creditoVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnotas_creditoVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnotas_creditoVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"notas_creditoVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnotas_creditoVentasCanalesBusqueda.setVisible(false);		}


					
		this.jLabelventa_netaVentasCanales = new JLabelMe();
		this.jLabelventa_netaVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_VENTANETA+" : *");
		this.jLabelventa_netaVentasCanales.setToolTipText("Venta Neta");
		this.jLabelventa_netaVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelventa_netaVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelventa_netaVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelventa_netaVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelventa_netaVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelventa_netaVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_VENTANETA);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPanelventa_netaVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		jTextFieldventa_netaVentasCanales= new JTextFieldMe();
		jTextFieldventa_netaVentasCanales.setEnabled(false);
		jTextFieldventa_netaVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldventa_netaVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldventa_netaVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldventa_netaVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldventa_netaVentasCanales.setText("0.0");

		this.jButtonventa_netaVentasCanalesBusqueda= new JButtonMe();
		this.jButtonventa_netaVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonventa_netaVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonventa_netaVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonventa_netaVentasCanalesBusqueda.setText("U");
		this.jButtonventa_netaVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonventa_netaVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonventa_netaVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldventa_netaVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldventa_netaVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"venta_netaVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonventa_netaVentasCanalesBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeVentasCanales = new JLabelMe();
		this.jLabelporcentajeVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeVentasCanales.setToolTipText("Porcentaje");
		this.jLabelporcentajeVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPanelporcentajeVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		jTextFieldporcentajeVentasCanales= new JTextFieldMe();
		jTextFieldporcentajeVentasCanales.setEnabled(false);
		jTextFieldporcentajeVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeVentasCanales.setText("0.0");

		this.jButtonporcentajeVentasCanalesBusqueda= new JButtonMe();
		this.jButtonporcentajeVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeVentasCanalesBusqueda.setText("U");
		this.jButtonporcentajeVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeVentasCanalesBusqueda.setVisible(false);		}


					
		this.jLabelacumuladoVentasCanales = new JLabelMe();
		this.jLabelacumuladoVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_ACUMULADO+" : *");
		this.jLabelacumuladoVentasCanales.setToolTipText("Acumulado");
		this.jLabelacumuladoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacumuladoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacumuladoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelacumuladoVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelacumuladoVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelacumuladoVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_ACUMULADO);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPanelacumuladoVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		jTextFieldacumuladoVentasCanales= new JTextFieldMe();
		jTextFieldacumuladoVentasCanales.setEnabled(false);
		jTextFieldacumuladoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacumuladoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacumuladoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldacumuladoVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldacumuladoVentasCanales.setText("0.0");

		this.jButtonacumuladoVentasCanalesBusqueda= new JButtonMe();
		this.jButtonacumuladoVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacumuladoVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacumuladoVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonacumuladoVentasCanalesBusqueda.setText("U");
		this.jButtonacumuladoVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonacumuladoVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonacumuladoVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldacumuladoVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldacumuladoVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"acumuladoVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonacumuladoVentasCanalesBusqueda.setVisible(false);		}


					
		this.jLabeltipoVentasCanales = new JLabelMe();
		this.jLabeltipoVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_TIPO+" : *");
		this.jLabeltipoVentasCanales.setToolTipText("Tipo");
		this.jLabeltipoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipoVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipoVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipoVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_TIPO);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPaneltipoVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		jTextFieldtipoVentasCanales= new JTextFieldMe();

		jTextFieldtipoVentasCanales.setEnabled(false);
		jTextFieldtipoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipoVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipoVentasCanalesBusqueda= new JButtonMe();
		this.jButtontipoVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipoVentasCanalesBusqueda.setText("U");
		this.jButtontipoVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipoVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipoVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipoVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipoVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipoVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipoVentasCanalesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVentasCanales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVentasCanales = new JLabelMe();
		this.jLabelid_empresaVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVentasCanales.setToolTipText("Empresa");
		this.jLabelid_empresaVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPanelid_empresaVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		jComboBoxid_empresaVentasCanales= new JComboBoxMe();
		jComboBoxid_empresaVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVentasCanales.setEnabled(false);

		this.jButtonid_empresaVentasCanales= new JButtonMe();
		this.jButtonid_empresaVentasCanales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasCanales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasCanales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasCanales.setText("Buscar");
		this.jButtonid_empresaVentasCanales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVentasCanales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasCanales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasCanales"));

		this.jButtonid_empresaVentasCanalesBusqueda= new JButtonMe();
		this.jButtonid_empresaVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasCanalesBusqueda.setText("U");
		this.jButtonid_empresaVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVentasCanalesBusqueda.setVisible(false);		}

		this.jButtonid_empresaVentasCanalesUpdate= new JButtonMe();
		this.jButtonid_empresaVentasCanalesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasCanalesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasCanalesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasCanalesUpdate.setText("U");
		this.jButtonid_empresaVentasCanalesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVentasCanalesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasCanalesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasCanalesUpdate"));



					
		this.jLabelid_titulo_clienteVentasCanales = new JLabelMe();
		this.jLabelid_titulo_clienteVentasCanales.setText(""+VentasCanalesConstantesFunciones.LABEL_IDTITULOCLIENTE+" : *");
		this.jLabelid_titulo_clienteVentasCanales.setToolTipText("Titulo Cliente");
		this.jLabelid_titulo_clienteVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_titulo_clienteVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_titulo_clienteVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_titulo_clienteVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_titulo_clienteVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_titulo_clienteVentasCanales.setToolTipText(VentasCanalesConstantesFunciones.LABEL_IDTITULOCLIENTE);
		this.gridaBagLayoutVentasCanales = new GridBagLayout();
		this.jPanelid_titulo_clienteVentasCanales.setLayout(this.gridaBagLayoutVentasCanales);


		jComboBoxid_titulo_clienteVentasCanales= new JComboBoxMe();
		jComboBoxid_titulo_clienteVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_titulo_clienteVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_titulo_clienteVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_titulo_clienteVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_titulo_clienteVentasCanales= new JButtonMe();
		this.jButtonid_titulo_clienteVentasCanales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_titulo_clienteVentasCanales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_titulo_clienteVentasCanales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_titulo_clienteVentasCanales.setText("Buscar");
		this.jButtonid_titulo_clienteVentasCanales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_titulo_clienteVentasCanales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_titulo_clienteVentasCanales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_titulo_clienteVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_titulo_clienteVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_titulo_clienteVentasCanales"));

		this.jButtonid_titulo_clienteVentasCanalesBusqueda= new JButtonMe();
		this.jButtonid_titulo_clienteVentasCanalesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_titulo_clienteVentasCanalesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_titulo_clienteVentasCanalesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_titulo_clienteVentasCanalesBusqueda.setText("U");
		this.jButtonid_titulo_clienteVentasCanalesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_titulo_clienteVentasCanalesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_titulo_clienteVentasCanalesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_titulo_clienteVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_titulo_clienteVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_titulo_clienteVentasCanalesBusqueda"));

		if(this.ventascanalesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_titulo_clienteVentasCanalesBusqueda.setVisible(false);		}

		this.jButtonid_titulo_clienteVentasCanalesUpdate= new JButtonMe();
		this.jButtonid_titulo_clienteVentasCanalesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_titulo_clienteVentasCanalesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_titulo_clienteVentasCanalesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_titulo_clienteVentasCanalesUpdate.setText("U");
		this.jButtonid_titulo_clienteVentasCanalesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_titulo_clienteVentasCanalesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_titulo_clienteVentasCanalesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_titulo_clienteVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_titulo_clienteVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_titulo_clienteVentasCanalesUpdate"));



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
		//this.jInternalFrameDetalleVentasCanales = new VentasCanalesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ventas Canales DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasCanales= new GridBagLayout();
		

		
		String sToolTipVentasCanales="";
		sToolTipVentasCanales=VentasCanalesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasCanales+="(Facturacion.VentasCanales)";
		}
		
		if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasCanales+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVentasCanales = new JButtonMe();
		this.jButtonModificarVentasCanales = new JButtonMe();
        this.jButtonActualizarVentasCanales = new JButtonMe();
        this.jButtonEliminarVentasCanales = new JButtonMe();
        this.jButtonCancelarVentasCanales = new JButtonMe();
        this.jButtonGuardarCambiosVentasCanales = new JButtonMe();
		this.jButtonGuardarCambiosTablaVentasCanales = new JButtonMe();
		this.jButtonCerrarVentasCanales = new JButtonMe();
		
		this.jScrollPanelDatosVentasCanales = new JScrollPane();   
        this.jScrollPanelDatosEdicionVentasCanales = new JScrollPane();
		this.jScrollPanelDatosGeneralVentasCanales = new JScrollPane();
				
		
		
		this.jPanelCamposVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Canales";
		
		if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Canaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasCanales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVentasCanales.setName("jPanelCamposVentasCanales"); 

		this.jPanelCamposOcultosVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVentasCanales.setName("jPanelCamposOcultosVentasCanales"); 

        this.jPanelAccionesVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasCanales.setToolTipText("Acciones");
        this.jPanelAccionesVentasCanales.setName("Acciones"); 

		this.jPanelAccionesFormularioVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVentasCanales.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVentasCanales.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVentasCanales.setText("Nuevo");
		this.jButtonModificarVentasCanales.setText("Editar");
        this.jButtonActualizarVentasCanales.setText("Actualizar");
        this.jButtonEliminarVentasCanales.setText("Eliminar");
        this.jButtonCancelarVentasCanales.setText("Cancelar");
        this.jButtonGuardarCambiosVentasCanales.setText("Guardar");
		this.jButtonGuardarCambiosTablaVentasCanales.setText("Guardar");
		this.jButtonCerrarVentasCanales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasCanales,"nuevo_button","Nuevo",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVentasCanales,"modificar_button","Editar",this.ventascanalesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVentasCanales,"actualizar_button","Actualizar",this.ventascanalesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVentasCanales,"eliminar_button","Eliminar",this.ventascanalesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVentasCanales,"cancelar_button","Cancelar",this.ventascanalesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVentasCanales,"guardarcambios_button","Guardar",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasCanales,"guardarcambiostabla_button","Guardar",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasCanales,"cerrar_button","Salir",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVentasCanales.setToolTipText("Nuevo"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVentasCanales.setToolTipText("Editar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVentasCanales.setToolTipText("Actualizar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVentasCanales.setToolTipText("Eliminar)"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVentasCanales.setToolTipText("Cancelar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVentasCanales.setToolTipText("Guardar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVentasCanales.setToolTipText("Guardar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasCanales.setToolTipText("Salir"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasCanales";
		inputMap = this.jButtonNuevoVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasCanales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasCanales"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVentasCanales";
		inputMap = this.jButtonActualizarVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVentasCanales"));
		
		//ELIMINAR
		sMapKey = "EliminarVentasCanales";
		inputMap = this.jButtonEliminarVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVentasCanales"));
		
		//CANCELAR	
		sMapKey = "CancelarVentasCanales";
		inputMap = this.jButtonCancelarVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVentasCanales"));
		
		//CERRAR		
		sMapKey = "CerrarVentasCanales";
		inputMap = this.jButtonCerrarVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasCanales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasCanales";
		inputMap = this.jButtonGuardarCambiosTablaVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasCanales"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVentasCanales = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVentasCanales.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVentasCanales.setToolTipText("Nuevo VentasCanales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVentasCanales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVentasCanales.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVentasCanales.setToolTipText("Sin Cerrar Ventana VentasCanales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVentasCanales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVentasCanales.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVentasCanales.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVentasCanales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasCanales.setText("Accion");
		this.jComboBoxTiposAccionesVentasCanales.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVentasCanales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVentasCanales.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVentasCanales.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVentasCanales = new JLabelMe();
		
		this.jLabelAccionesVentasCanales.setText("Acciones");		
		this.jLabelAccionesVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVentasCanales();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVentasCanales();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVentasCanales=new JTabbedPane();
		this.jTabbedPaneRelacionesVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVentasCanales,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVentasCanales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasCanales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasCanales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVentasCanales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasCanales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasCanales.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVentasCanales = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVentasCanales = new GridBagLayout();
		
		this.jPanelCamposVentasCanales.setLayout(gridaBagLayoutCamposVentasCanales);
		this.jPanelCamposOcultosVentasCanales.setLayout(gridaBagLayoutCamposOcultosVentasCanales);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVentasCanales.add(jLabelIdVentasCanales, this.gridBagConstraintsVentasCanales);



	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVentasCanales.add(jLabelidVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVentasCanales.add(jLabelid_empresaVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasCanales.add(jButtonid_empresaVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 3;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasCanales.add(jButtonid_empresaVentasCanalesUpdate, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVentasCanales.add(jComboBoxid_empresaVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_titulo_clienteVentasCanales.add(jLabelid_titulo_clienteVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_titulo_clienteVentasCanales.add(jButtonid_titulo_clienteVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 3;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_titulo_clienteVentasCanales.add(jButtonid_titulo_clienteVentasCanalesUpdate, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_titulo_clienteVentasCanales.add(jComboBoxid_titulo_clienteVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeVentasCanales.add(jLabelfecha_emision_desdeVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeVentasCanales.add(jButtonfecha_emision_desdeVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeVentasCanales.add(jDateChooserfecha_emision_desdeVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaVentasCanales.add(jLabelfecha_emision_hastaVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaVentasCanales.add(jButtonfecha_emision_hastaVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaVentasCanales.add(jDateChooserfecha_emision_hastaVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_titulo_clienteVentasCanales.add(jLabelnombre_titulo_clienteVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_titulo_clienteVentasCanales.add(jButtonnombre_titulo_clienteVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_titulo_clienteVentasCanales.add(jscrollPanenombre_titulo_clienteVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoVentasCanales.add(jLabelmontoVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoVentasCanales.add(jButtonmontoVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoVentasCanales.add(jTextFieldmontoVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_titulo_clienteVentasCanales.add(jLabelcodigo_titulo_clienteVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_titulo_clienteVentasCanales.add(jButtoncodigo_titulo_clienteVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_titulo_clienteVentasCanales.add(jTextFieldcodigo_titulo_clienteVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnotas_creditoVentasCanales.add(jLabelnotas_creditoVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnotas_creditoVentasCanales.add(jButtonnotas_creditoVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnotas_creditoVentasCanales.add(jTextFieldnotas_creditoVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelventa_netaVentasCanales.add(jLabelventa_netaVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelventa_netaVentasCanales.add(jButtonventa_netaVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelventa_netaVentasCanales.add(jTextFieldventa_netaVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeVentasCanales.add(jLabelporcentajeVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeVentasCanales.add(jButtonporcentajeVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeVentasCanales.add(jTextFieldporcentajeVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelacumuladoVentasCanales.add(jLabelacumuladoVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPanelacumuladoVentasCanales.add(jButtonacumuladoVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelacumuladoVentasCanales.add(jTextFieldacumuladoVentasCanales, this.gridBagConstraintsVentasCanales);


	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 0;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipoVentasCanales.add(jLabeltipoVentasCanales, this.gridBagConstraintsVentasCanales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 2;
		this.gridBagConstraintsVentasCanales.ipadx = 0;
		this.gridBagConstraintsVentasCanales.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipoVentasCanales.add(jButtontipoVentasCanalesBusqueda, this.gridBagConstraintsVentasCanales);
	}

	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCanales.gridy = 0;
	this.gridBagConstraintsVentasCanales.gridx = 1;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipoVentasCanales.add(jTextFieldtipoVentasCanales, this.gridBagConstraintsVentasCanales);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPanelidVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPanelid_titulo_clienteVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPanelfecha_emision_desdeVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPanelfecha_emision_hastaVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPanelnombre_titulo_clienteVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPanelmontoVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPanelcodigo_titulo_clienteVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPanelnotas_creditoVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPanelventa_netaVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPanelporcentajeVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPanelacumuladoVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCanales.add(this.jPaneltipoVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposVentasCanales % 2==0) {
		iXPanelCamposVentasCanales=0;
		iYPanelCamposVentasCanales++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCanales.gridy = iYPanelCamposOcultosVentasCanales;
	this.gridBagConstraintsVentasCanales.gridx = iXPanelCamposOcultosVentasCanales++;
	this.gridBagConstraintsVentasCanales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCanales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasCanales.add(this.jPanelid_empresaVentasCanales, this.gridBagConstraintsVentasCanales);



	if(iXPanelCamposOcultosVentasCanales % 2==0) {
		iXPanelCamposOcultosVentasCanales=0;
		iYPanelCamposOcultosVentasCanales++;
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
			
		GridBagLayout gridaBagLayoutAccionesVentasCanales= new GridBagLayout();
		this.jPanelAccionesVentasCanales.setLayout(gridaBagLayoutAccionesVentasCanales);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVentasCanales= new GridBagLayout();
		this.jPanelAccionesFormularioVentasCanales.setLayout(gridaBagLayoutAccionesFormularioVentasCanales);
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVentasCanales.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVentasCanales.add(this.jComboBoxTiposAccionesFormularioVentasCanales, this.gridBagConstraintsVentasCanales);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = iPosXAccion++;
			
		this.jPanelAccionesVentasCanales.add(this.jButtonModificarVentasCanales, this.gridBagConstraintsVentasCanales);							

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx =iPosXAccion++;
			
		this.jPanelAccionesVentasCanales.add(this.jButtonEliminarVentasCanales, this.gridBagConstraintsVentasCanales);
		
			
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = 0;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasCanales.add(this.jButtonActualizarVentasCanales, this.gridBagConstraintsVentasCanales);


		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = 0;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasCanales.add(this.jButtonGuardarCambiosVentasCanales, this.gridBagConstraintsVentasCanales);	
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = 0;		
		this.gridBagConstraintsVentasCanales.gridx =iPosXAccion++;
		
		this.jPanelAccionesVentasCanales.add(this.jButtonCancelarVentasCanales, this.gridBagConstraintsVentasCanales);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasCanales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasCanales);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();						
			this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasCanales.gridx = 0;		
			//this.gridBagConstraintsVentasCanales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasCanales.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasCanales.gridx =0;
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasCanales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasCanales, this.gridBagConstraintsVentasCanales);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VentasCanalesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVentasCanales = new VentasCanalesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ventas Canales DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ventas Canales DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Canales Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VentasCanalesModel ventascanalesModel=new VentasCanalesModel(this);
			
			//SI USARA CLASE INTERNA
			//VentasCanalesModel.VentasCanalesFocusTraversalPolicy ventascanalesFocusTraversalPolicy = ventascanalesModel.new VentasCanalesFocusTraversalPolicy(this);
			
			//ventascanalesFocusTraversalPolicy.setventascanalesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ventascanalesModel);
			
			
			this.jContentPaneDetalleVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVentasCanales = new GridBagLayout();	
			this.jContentPaneDetalleVentasCanales.setLayout(gridaBagLayoutDetalleVentasCanales);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasCanales = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVentasCanales = new GridBagConstraints();
				this.gridBagConstraintsVentasCanales.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVentasCanales.gridx = 0;
					
				
				this.jContentPaneDetalleVentasCanales.add(jTtoolBarDetalleVentasCanales, gridBagConstraintsVentasCanales);								
				
}
			
			this.jScrollPanelDatosEdicionVentasCanales=   new JScrollPane(jContentPaneDetalleVentasCanales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasCanales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasCanales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasCanales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVentasCanales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasCanales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasCanales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasCanales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVentasCanales.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVentasCanales.gridx = 0;
	        
			this.jContentPaneDetalleVentasCanales.add(jPanelCamposVentasCanales, gridBagConstraintsVentasCanales);
			
			
			
			
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
						//&& ventascanalesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ventascanalesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVentasCanales= new GridBagConstraints();
						this.gridBagConstraintsVentasCanales.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVentasCanales.gridx = 0;
						this.jContentPaneDetalleVentasCanales.add(this.jTabbedPaneRelacionesVentasCanales, this.gridBagConstraintsVentasCanales);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVentasCanales.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVentasCanales.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVentasCanales = new GridBagConstraints();
					this.gridBagConstraintsVentasCanales.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVentasCanales.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVentasCanales.gridx = 0;
					
				
					this.jContentPaneDetalleVentasCanales.add(jPanelCamposOcultosVentasCanales, gridBagConstraintsVentasCanales);
				
					this.jPanelCamposOcultosVentasCanales.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVentasCanales.gridx = 0;
	        this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVentasCanales.add(this.jPanelAccionesFormularioVentasCanales, this.gridBagConstraintsVentasCanales);							
			
			
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
	        this.gridBagConstraintsVentasCanales.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVentasCanales.gridx = 0;
	        
			
			this.jContentPaneDetalleVentasCanales.add(this.jPanelAccionesVentasCanales, this.gridBagConstraintsVentasCanales);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVentasCanales);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVentasCanales=   new JScrollPane(this.jPanelCamposVentasCanales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasCanales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasCanales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasCanales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVentasCanales.gridx = 0;
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVentasCanales.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVentasCanales, this.gridBagConstraintsVentasCanales);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasCanales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVentasCanales, this.gridBagConstraintsVentasCanales);			
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasCanales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVentasCanales, this.gridBagConstraintsVentasCanales);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCanales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasCanales, this.gridBagConstraintsVentasCanales);
			
			
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCanales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasCanales, this.gridBagConstraintsVentasCanales);
		
			
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasCanales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasCanales, this.gridBagConstraintsVentasCanales);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVentasCanales;//jContentPane;
		
		return jScrollPanelDatosEdicionVentasCanales;
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
