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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.FacturasPuntoVentaConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class FacturasPuntoVentaDetalleFormJInternalFrame extends FacturasPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturasPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleFacturasPuntoVenta;
	
	protected JMenu jmenuDetalleFacturasPuntoVenta;
	protected JMenu jmenuDetalleArchivoFacturasPuntoVenta;
	protected JMenu jmenuDetalleAccionesFacturasPuntoVenta;
	protected JMenu jmenuDetalleDatosFacturasPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturasPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsFacturasPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturasPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturasPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public FacturasPuntoVentaSessionBean facturaspuntoventaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public FacturasPuntoVentaLogic facturaspuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosFacturasPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionFacturasPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralFacturasPuntoVenta;
	
	protected JPanel jPanelCamposFacturasPuntoVenta;    
	protected JPanel jPanelCamposOcultosFacturasPuntoVenta;    	
	protected JPanel jPanelAccionesFacturasPuntoVenta;
	protected JPanel jPanelAccionesFormularioFacturasPuntoVenta;
    
	
	
	protected Integer iXPanelCamposFacturasPuntoVenta=0;
	protected Integer iYPanelCamposFacturasPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosFacturasPuntoVenta=0;
	protected Integer iYPanelCamposOcultosFacturasPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturasPuntoVenta;
	public JButton jButtonModificarFacturasPuntoVenta;
	public JButton jButtonActualizarFacturasPuntoVenta;
    public JButton jButtonEliminarFacturasPuntoVenta;
	public JButton jButtonCancelarFacturasPuntoVenta;
    public JButton jButtonGuardarCambiosFacturasPuntoVenta;
	public JButton jButtonGuardarCambiosTablaFacturasPuntoVenta;
	protected JButton jButtonCerrarFacturasPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionFacturasPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturasPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturasPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturasPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturasPuntoVenta;
	protected JButton jButtonModificarToolBarFacturasPuntoVenta;
	protected JButton jButtonActualizarToolBarFacturasPuntoVenta;
    protected JButton jButtonEliminarToolBarFacturasPuntoVenta;
	protected JButton jButtonCancelarToolBarFacturasPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarFacturasPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturasPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturasPuntoVenta;
	protected JButton jButtonCerrarToolBarFacturasPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarFacturasPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturasPuntoVenta;
	protected JMenuItem jMenuItemModificarFacturasPuntoVenta;
	protected JMenuItem jMenuItemActualizarFacturasPuntoVenta;
    protected JMenuItem jMenuItemEliminarFacturasPuntoVenta;
	protected JMenuItem jMenuItemCancelarFacturasPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosFacturasPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturasPuntoVenta;
	protected JMenuItem jMenuItemCerrarFacturasPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarFacturasPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturasPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturasPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturasPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarFacturasPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturasPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturasPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturasPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturasPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturasPuntoVenta;
	public JLabel jLabelIdFacturasPuntoVenta;
	public JLabel jLabelidFacturasPuntoVenta;
	public JButton jButtonidFacturasPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeFacturasPuntoVenta;
	public JLabel jLabelfecha_desdeFacturasPuntoVenta;
	//public JFormattedTextField jDateChooserfecha_desdeFacturasPuntoVenta;

	public JDateChooser jDateChooserfecha_desdeFacturasPuntoVenta;
	public JButton jButtonfecha_desdeFacturasPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaFacturasPuntoVenta;
	public JLabel jLabelfecha_hastaFacturasPuntoVenta;
	//public JFormattedTextField jDateChooserfecha_hastaFacturasPuntoVenta;

	public JDateChooser jDateChooserfecha_hastaFacturasPuntoVenta;
	public JButton jButtonfecha_hastaFacturasPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteFacturasPuntoVenta;
	public JLabel jLabelnombre_completo_clienteFacturasPuntoVenta;
	public JTextArea jTextAreanombre_completo_clienteFacturasPuntoVenta;
	public JScrollPane jscrollPanenombre_completo_clienteFacturasPuntoVenta;
	public JButton jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaFacturasPuntoVenta;
	public JLabel jLabeltotal_ivaFacturasPuntoVenta;
	public JTextField jTextFieldtotal_ivaFacturasPuntoVenta;
	public JButton jButtontotal_ivaFacturasPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaFacturasPuntoVenta;
	public JLabel jLabeltotal_sin_ivaFacturasPuntoVenta;
	public JTextField jTextFieldtotal_sin_ivaFacturasPuntoVenta;
	public JButton jButtontotal_sin_ivaFacturasPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelivaFacturasPuntoVenta;
	public JLabel jLabelivaFacturasPuntoVenta;
	public JTextField jTextFieldivaFacturasPuntoVenta;
	public JButton jButtonivaFacturasPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoFacturasPuntoVenta;
	public JLabel jLabeldescuentoFacturasPuntoVenta;
	public JTextField jTextFielddescuentoFacturasPuntoVenta;
	public JButton jButtondescuentoFacturasPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotalFacturasPuntoVenta;
	public JLabel jLabeltotalFacturasPuntoVenta;
	public JTextField jTextFieldtotalFacturasPuntoVenta;
	public JButton jButtontotalFacturasPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelruc_clienteFacturasPuntoVenta;
	public JLabel jLabelruc_clienteFacturasPuntoVenta;
	public JTextField jTextFieldruc_clienteFacturasPuntoVenta;
	public JButton jButtonruc_clienteFacturasPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFacturasPuntoVenta;
	public JLabel jLabelid_empresaFacturasPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFacturasPuntoVenta;
	public JButton jButtonid_empresaFacturasPuntoVenta= new JButtonMe();
	public JButton jButtonid_empresaFacturasPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturasPuntoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturasPuntoVenta;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FacturasPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturasPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioFacturasPuntoVenta=new JPanel();
				this.jmenuBarDetalleFacturasPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleFacturasPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FacturasPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturasPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FacturasPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturasPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturasPuntoVenta() {
		return this.jButtonActualizarToolBarFacturasPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarFacturasPuntoVenta() {
		return this.jButtonEliminarToolBarFacturasPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarFacturasPuntoVenta() {
		return this.jButtonCancelarToolBarFacturasPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionFacturasPuntoVenta() {
		return this.jButtonProcesarInformacionFacturasPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturasPuntoVenta)	{
		this.jButtonProcesarInformacionFacturasPuntoVenta = jButtonProcesarInformacionFacturasPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturasPuntoVenta() {
		return this.jComboBoxTiposAccionesFacturasPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturasPuntoVenta(
			JComboBox jComboBoxTiposRelacionesFacturasPuntoVenta) {
		this.jComboBoxTiposRelacionesFacturasPuntoVenta = jComboBoxTiposRelacionesFacturasPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturasPuntoVenta(
			JComboBox jComboBoxTiposAccionesFacturasPuntoVenta) {
		this.jComboBoxTiposAccionesFacturasPuntoVenta = jComboBoxTiposAccionesFacturasPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturasPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioFacturasPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturasPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioFacturasPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioFacturasPuntoVenta = jComboBoxTiposAccionesFormularioFacturasPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturaspuntoventaSessionBean=new FacturasPuntoVentaSessionBean();
		
		this.facturaspuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaspuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturaspuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturasPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturasPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturasPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturas Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturasPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturasPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturasPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarFacturasPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturasPuntoVenta,this.jTtoolBarDetalleFacturasPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturasPuntoVenta,this.jTtoolBarDetalleFacturasPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturasPuntoVenta,this.jTtoolBarDetalleFacturasPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturasPuntoVenta,this.jTtoolBarDetalleFacturasPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturasPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturasPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturasPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturasPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturasPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturasPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturasPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturasPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturasPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturasPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturasPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturasPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturasPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturasPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturasPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturasPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturasPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturasPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturasPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturasPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturasPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturasPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturasPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturasPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturasPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturasPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturasPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturasPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturasPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturasPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturasPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturasPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturasPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturasPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturasPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturasPuntoVenta.add(this.jMenuItemDetalleCerrarFacturasPuntoVenta);
		
		this.jmenuDetalleAccionesFacturasPuntoVenta.add(this.jMenuItemActualizarFacturasPuntoVenta);
		this.jmenuDetalleAccionesFacturasPuntoVenta.add(this.jMenuItemEliminarFacturasPuntoVenta);
		this.jmenuDetalleAccionesFacturasPuntoVenta.add(this.jMenuItemCancelarFacturasPuntoVenta);		
		
		//this.jmenuDetalleDatosFacturasPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByFacturasPuntoVenta);				
		this.jmenuDetalleDatosFacturasPuntoVenta.add(this.jMenuItemDetalleMostarOcultarFacturasPuntoVenta);				
				
		//this.jmenuDetalleAccionesFacturasPuntoVenta.add(this.jMenuItemGuardarCambiosFacturasPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturasPuntoVenta.add(this.jmenuDetalleArchivoFacturasPuntoVenta);		
		this.jmenuBarDetalleFacturasPuntoVenta.add(this.jmenuDetalleAccionesFacturasPuntoVenta);		
		this.jmenuBarDetalleFacturasPuntoVenta.add(this.jmenuDetalleDatosFacturasPuntoVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFacturasPuntoVenta);				
	}
	
	
	public void inicializarElementosCamposFacturasPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturasPuntoVenta = new JLabelMe();
		jLabelIdFacturasPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturasPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturasPuntoVenta.setToolTipText(FacturasPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturasPuntoVenta= new GridBagLayout();

		this.jPanelidFacturasPuntoVenta.setLayout(this.gridaBagLayoutFacturasPuntoVenta);

		jLabelidFacturasPuntoVenta = new JLabel();
		jLabelidFacturasPuntoVenta.setText("Id");

		jLabelidFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeFacturasPuntoVenta = new JLabelMe();
		this.jLabelfecha_desdeFacturasPuntoVenta.setText(""+FacturasPuntoVentaConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeFacturasPuntoVenta.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeFacturasPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeFacturasPuntoVenta.setToolTipText(FacturasPuntoVentaConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		this.jPanelfecha_desdeFacturasPuntoVenta.setLayout(this.gridaBagLayoutFacturasPuntoVenta);


		//jFormattedTextFieldfecha_desdeFacturasPuntoVenta= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeFacturasPuntoVenta= new JDateChooser();
		jDateChooserfecha_desdeFacturasPuntoVenta.setEnabled(false);
		jDateChooserfecha_desdeFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeFacturasPuntoVenta.setDate(new Date());
		jDateChooserfecha_desdeFacturasPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeFacturasPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeFacturasPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfecha_desdeFacturasPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeFacturasPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeFacturasPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeFacturasPuntoVentaBusqueda.setText("U");
		this.jButtonfecha_desdeFacturasPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeFacturasPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeFacturasPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeFacturasPuntoVentaBusqueda"));

		if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeFacturasPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaFacturasPuntoVenta = new JLabelMe();
		this.jLabelfecha_hastaFacturasPuntoVenta.setText(""+FacturasPuntoVentaConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaFacturasPuntoVenta.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaFacturasPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaFacturasPuntoVenta.setToolTipText(FacturasPuntoVentaConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		this.jPanelfecha_hastaFacturasPuntoVenta.setLayout(this.gridaBagLayoutFacturasPuntoVenta);


		//jFormattedTextFieldfecha_hastaFacturasPuntoVenta= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaFacturasPuntoVenta= new JDateChooser();
		jDateChooserfecha_hastaFacturasPuntoVenta.setEnabled(false);
		jDateChooserfecha_hastaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaFacturasPuntoVenta.setDate(new Date());
		jDateChooserfecha_hastaFacturasPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaFacturasPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaFacturasPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfecha_hastaFacturasPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaFacturasPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaFacturasPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaFacturasPuntoVentaBusqueda.setText("U");
		this.jButtonfecha_hastaFacturasPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaFacturasPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaFacturasPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaFacturasPuntoVentaBusqueda"));

		if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaFacturasPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteFacturasPuntoVenta = new JLabelMe();
		this.jLabelnombre_completo_clienteFacturasPuntoVenta.setText(""+FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteFacturasPuntoVenta.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteFacturasPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteFacturasPuntoVenta.setToolTipText(FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		this.jPanelnombre_completo_clienteFacturasPuntoVenta.setLayout(this.gridaBagLayoutFacturasPuntoVenta);


		jTextAreanombre_completo_clienteFacturasPuntoVenta= new JTextAreaMe();
		jTextAreanombre_completo_clienteFacturasPuntoVenta.setEnabled(false);
		jTextAreanombre_completo_clienteFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturasPuntoVenta.setLineWrap(true);
		jTextAreanombre_completo_clienteFacturasPuntoVenta.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteFacturasPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteFacturasPuntoVenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteFacturasPuntoVenta = new JScrollPane(jTextAreanombre_completo_clienteFacturasPuntoVenta);
		jscrollPanenombre_completo_clienteFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda.setText("U");
		this.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteFacturasPuntoVentaBusqueda"));

		if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaFacturasPuntoVenta = new JLabelMe();
		this.jLabeltotal_ivaFacturasPuntoVenta.setText(""+FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaFacturasPuntoVenta.setToolTipText("Total Iva");
		this.jLabeltotal_ivaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaFacturasPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaFacturasPuntoVenta.setToolTipText(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		this.jPaneltotal_ivaFacturasPuntoVenta.setLayout(this.gridaBagLayoutFacturasPuntoVenta);


		jTextFieldtotal_ivaFacturasPuntoVenta= new JTextFieldMe();
		jTextFieldtotal_ivaFacturasPuntoVenta.setEnabled(false);
		jTextFieldtotal_ivaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaFacturasPuntoVenta.setText("0.0");

		this.jButtontotal_ivaFacturasPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotal_ivaFacturasPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaFacturasPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaFacturasPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaFacturasPuntoVentaBusqueda.setText("U");
		this.jButtontotal_ivaFacturasPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaFacturasPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaFacturasPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaFacturasPuntoVentaBusqueda"));

		if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaFacturasPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaFacturasPuntoVenta = new JLabelMe();
		this.jLabeltotal_sin_ivaFacturasPuntoVenta.setText(""+FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaFacturasPuntoVenta.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaFacturasPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaFacturasPuntoVenta.setToolTipText(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		this.jPaneltotal_sin_ivaFacturasPuntoVenta.setLayout(this.gridaBagLayoutFacturasPuntoVenta);


		jTextFieldtotal_sin_ivaFacturasPuntoVenta= new JTextFieldMe();
		jTextFieldtotal_sin_ivaFacturasPuntoVenta.setEnabled(false);
		jTextFieldtotal_sin_ivaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaFacturasPuntoVenta.setText("0.0");

		this.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda.setText("U");
		this.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaFacturasPuntoVentaBusqueda"));

		if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelivaFacturasPuntoVenta = new JLabelMe();
		this.jLabelivaFacturasPuntoVenta.setText(""+FacturasPuntoVentaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaFacturasPuntoVenta.setToolTipText("Iva");
		this.jLabelivaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaFacturasPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaFacturasPuntoVenta.setToolTipText(FacturasPuntoVentaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		this.jPanelivaFacturasPuntoVenta.setLayout(this.gridaBagLayoutFacturasPuntoVenta);


		jTextFieldivaFacturasPuntoVenta= new JTextFieldMe();
		jTextFieldivaFacturasPuntoVenta.setEnabled(false);
		jTextFieldivaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaFacturasPuntoVenta.setText("0.0");

		this.jButtonivaFacturasPuntoVentaBusqueda= new JButtonMe();
		this.jButtonivaFacturasPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturasPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturasPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaFacturasPuntoVentaBusqueda.setText("U");
		this.jButtonivaFacturasPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaFacturasPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaFacturasPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaFacturasPuntoVentaBusqueda"));

		if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaFacturasPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoFacturasPuntoVenta = new JLabelMe();
		this.jLabeldescuentoFacturasPuntoVenta.setText(""+FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoFacturasPuntoVenta.setToolTipText("Descuento");
		this.jLabeldescuentoFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoFacturasPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoFacturasPuntoVenta.setToolTipText(FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		this.jPaneldescuentoFacturasPuntoVenta.setLayout(this.gridaBagLayoutFacturasPuntoVenta);


		jTextFielddescuentoFacturasPuntoVenta= new JTextFieldMe();
		jTextFielddescuentoFacturasPuntoVenta.setEnabled(false);
		jTextFielddescuentoFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoFacturasPuntoVenta.setText("0.0");

		this.jButtondescuentoFacturasPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescuentoFacturasPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoFacturasPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoFacturasPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoFacturasPuntoVentaBusqueda.setText("U");
		this.jButtondescuentoFacturasPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoFacturasPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoFacturasPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoFacturasPuntoVentaBusqueda"));

		if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoFacturasPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotalFacturasPuntoVenta = new JLabelMe();
		this.jLabeltotalFacturasPuntoVenta.setText(""+FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalFacturasPuntoVenta.setToolTipText("Total");
		this.jLabeltotalFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalFacturasPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalFacturasPuntoVenta.setToolTipText(FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		this.jPaneltotalFacturasPuntoVenta.setLayout(this.gridaBagLayoutFacturasPuntoVenta);


		jTextFieldtotalFacturasPuntoVenta= new JTextFieldMe();
		jTextFieldtotalFacturasPuntoVenta.setEnabled(false);
		jTextFieldtotalFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalFacturasPuntoVenta.setText("0.0");

		this.jButtontotalFacturasPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotalFacturasPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturasPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturasPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalFacturasPuntoVentaBusqueda.setText("U");
		this.jButtontotalFacturasPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalFacturasPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalFacturasPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalFacturasPuntoVentaBusqueda"));

		if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalFacturasPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelruc_clienteFacturasPuntoVenta = new JLabelMe();
		this.jLabelruc_clienteFacturasPuntoVenta.setText(""+FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE+" : *");
		this.jLabelruc_clienteFacturasPuntoVenta.setToolTipText("Ruc Cliente");
		this.jLabelruc_clienteFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_clienteFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_clienteFacturasPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_clienteFacturasPuntoVenta.setToolTipText(FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE);
		this.gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		this.jPanelruc_clienteFacturasPuntoVenta.setLayout(this.gridaBagLayoutFacturasPuntoVenta);


		jTextFieldruc_clienteFacturasPuntoVenta= new JTextFieldMe();

		jTextFieldruc_clienteFacturasPuntoVenta.setEnabled(false);
		jTextFieldruc_clienteFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_clienteFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_clienteFacturasPuntoVentaBusqueda= new JButtonMe();
		this.jButtonruc_clienteFacturasPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteFacturasPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteFacturasPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_clienteFacturasPuntoVentaBusqueda.setText("U");
		this.jButtonruc_clienteFacturasPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_clienteFacturasPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_clienteFacturasPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_clienteFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_clienteFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_clienteFacturasPuntoVentaBusqueda"));

		if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_clienteFacturasPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFacturasPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFacturasPuntoVenta = new JLabelMe();
		this.jLabelid_empresaFacturasPuntoVenta.setText(""+FacturasPuntoVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFacturasPuntoVenta.setToolTipText("Empresa");
		this.jLabelid_empresaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFacturasPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFacturasPuntoVenta.setToolTipText(FacturasPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		this.jPanelid_empresaFacturasPuntoVenta.setLayout(this.gridaBagLayoutFacturasPuntoVenta);


		jComboBoxid_empresaFacturasPuntoVenta= new JComboBoxMe();
		jComboBoxid_empresaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFacturasPuntoVenta.setEnabled(false);

		this.jButtonid_empresaFacturasPuntoVenta= new JButtonMe();
		this.jButtonid_empresaFacturasPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasPuntoVenta.setText("Buscar");
		this.jButtonid_empresaFacturasPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFacturasPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasPuntoVenta"));

		this.jButtonid_empresaFacturasPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturasPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturasPuntoVentaBusqueda.setText("U");
		this.jButtonid_empresaFacturasPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturasPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasPuntoVentaBusqueda"));

		if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturasPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturasPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_empresaFacturasPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturasPuntoVentaUpdate.setText("U");
		this.jButtonid_empresaFacturasPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturasPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasPuntoVentaUpdate"));



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
		//this.jInternalFrameDetalleFacturasPuntoVenta = new FacturasPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Facturas Punto Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturasPuntoVenta= new GridBagLayout();
		

		
		String sToolTipFacturasPuntoVenta="";
		sToolTipFacturasPuntoVenta=FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturasPuntoVenta+="(Sris.FacturasPuntoVenta)";
		}
		
		if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturasPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturasPuntoVenta = new JButtonMe();
		this.jButtonModificarFacturasPuntoVenta = new JButtonMe();
        this.jButtonActualizarFacturasPuntoVenta = new JButtonMe();
        this.jButtonEliminarFacturasPuntoVenta = new JButtonMe();
        this.jButtonCancelarFacturasPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosFacturasPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturasPuntoVenta = new JButtonMe();
		this.jButtonCerrarFacturasPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosFacturasPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturasPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturasPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Facturas Punto Venta";
		
		if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturasPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFacturasPuntoVenta.setName("jPanelCamposFacturasPuntoVenta"); 

		this.jPanelCamposOcultosFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturasPuntoVenta.setName("jPanelCamposOcultosFacturasPuntoVenta"); 

        this.jPanelAccionesFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturasPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFacturasPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturasPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturasPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturasPuntoVenta.setText("Nuevo");
		this.jButtonModificarFacturasPuntoVenta.setText("Editar");
        this.jButtonActualizarFacturasPuntoVenta.setText("Actualizar");
        this.jButtonEliminarFacturasPuntoVenta.setText("Eliminar");
        this.jButtonCancelarFacturasPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosFacturasPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturasPuntoVenta.setText("Guardar");
		this.jButtonCerrarFacturasPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturasPuntoVenta,"nuevo_button","Nuevo",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturasPuntoVenta,"modificar_button","Editar",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturasPuntoVenta,"actualizar_button","Actualizar",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturasPuntoVenta,"eliminar_button","Eliminar",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturasPuntoVenta,"cancelar_button","Cancelar",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturasPuntoVenta,"guardarcambios_button","Guardar",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturasPuntoVenta,"guardarcambiostabla_button","Guardar",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturasPuntoVenta,"cerrar_button","Salir",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturasPuntoVenta.setToolTipText("Nuevo"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturasPuntoVenta.setToolTipText("Editar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturasPuntoVenta.setToolTipText("Actualizar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturasPuntoVenta.setToolTipText("Eliminar)"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturasPuntoVenta.setToolTipText("Cancelar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturasPuntoVenta.setToolTipText("Guardar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturasPuntoVenta.setToolTipText("Guardar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturasPuntoVenta.setToolTipText("Salir"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturasPuntoVenta";
		inputMap = this.jButtonNuevoFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturasPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturasPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturasPuntoVenta";
		inputMap = this.jButtonActualizarFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturasPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturasPuntoVenta";
		inputMap = this.jButtonEliminarFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturasPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturasPuntoVenta";
		inputMap = this.jButtonCancelarFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturasPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarFacturasPuntoVenta";
		inputMap = this.jButtonCerrarFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturasPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturasPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturasPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturasPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturasPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturasPuntoVenta.setToolTipText("Nuevo FacturasPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturasPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturasPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturasPuntoVenta.setToolTipText("Sin Cerrar Ventana FacturasPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturasPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturasPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturasPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturasPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesFacturasPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturasPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesFacturasPuntoVenta.setText("Acciones");		
		this.jLabelAccionesFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturasPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturasPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturasPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturasPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturasPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturasPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposFacturasPuntoVenta.setLayout(gridaBagLayoutCamposFacturasPuntoVenta);
		this.jPanelCamposOcultosFacturasPuntoVenta.setLayout(gridaBagLayoutCamposOcultosFacturasPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFacturasPuntoVenta.add(jLabelIdFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFacturasPuntoVenta.add(jLabelidFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFacturasPuntoVenta.add(jLabelid_empresaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturasPuntoVenta.add(jButtonid_empresaFacturasPuntoVentaBusqueda, this.gridBagConstraintsFacturasPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturasPuntoVenta.add(jButtonid_empresaFacturasPuntoVentaUpdate, this.gridBagConstraintsFacturasPuntoVenta);
	}

	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFacturasPuntoVenta.add(jComboBoxid_empresaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeFacturasPuntoVenta.add(jLabelfecha_desdeFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeFacturasPuntoVenta.add(jButtonfecha_desdeFacturasPuntoVentaBusqueda, this.gridBagConstraintsFacturasPuntoVenta);
	}

	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeFacturasPuntoVenta.add(jDateChooserfecha_desdeFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaFacturasPuntoVenta.add(jLabelfecha_hastaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaFacturasPuntoVenta.add(jButtonfecha_hastaFacturasPuntoVentaBusqueda, this.gridBagConstraintsFacturasPuntoVenta);
	}

	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaFacturasPuntoVenta.add(jDateChooserfecha_hastaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteFacturasPuntoVenta.add(jLabelnombre_completo_clienteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteFacturasPuntoVenta.add(jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda, this.gridBagConstraintsFacturasPuntoVenta);
	}

	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteFacturasPuntoVenta.add(jscrollPanenombre_completo_clienteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaFacturasPuntoVenta.add(jLabeltotal_ivaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaFacturasPuntoVenta.add(jButtontotal_ivaFacturasPuntoVentaBusqueda, this.gridBagConstraintsFacturasPuntoVenta);
	}

	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaFacturasPuntoVenta.add(jTextFieldtotal_ivaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaFacturasPuntoVenta.add(jLabeltotal_sin_ivaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaFacturasPuntoVenta.add(jButtontotal_sin_ivaFacturasPuntoVentaBusqueda, this.gridBagConstraintsFacturasPuntoVenta);
	}

	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaFacturasPuntoVenta.add(jTextFieldtotal_sin_ivaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaFacturasPuntoVenta.add(jLabelivaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaFacturasPuntoVenta.add(jButtonivaFacturasPuntoVentaBusqueda, this.gridBagConstraintsFacturasPuntoVenta);
	}

	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaFacturasPuntoVenta.add(jTextFieldivaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoFacturasPuntoVenta.add(jLabeldescuentoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoFacturasPuntoVenta.add(jButtondescuentoFacturasPuntoVentaBusqueda, this.gridBagConstraintsFacturasPuntoVenta);
	}

	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoFacturasPuntoVenta.add(jTextFielddescuentoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalFacturasPuntoVenta.add(jLabeltotalFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalFacturasPuntoVenta.add(jButtontotalFacturasPuntoVentaBusqueda, this.gridBagConstraintsFacturasPuntoVenta);
	}

	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalFacturasPuntoVenta.add(jTextFieldtotalFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_clienteFacturasPuntoVenta.add(jLabelruc_clienteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_clienteFacturasPuntoVenta.add(jButtonruc_clienteFacturasPuntoVentaBusqueda, this.gridBagConstraintsFacturasPuntoVenta);
	}

	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_clienteFacturasPuntoVenta.add(jTextFieldruc_clienteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = iYPanelCamposFacturasPuntoVenta;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = iXPanelCamposFacturasPuntoVenta++;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasPuntoVenta.add(this.jPanelidFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(iXPanelCamposFacturasPuntoVenta % 1==0) {
		iXPanelCamposFacturasPuntoVenta=0;
		iYPanelCamposFacturasPuntoVenta++;
	}
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = iYPanelCamposFacturasPuntoVenta;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = iXPanelCamposFacturasPuntoVenta++;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasPuntoVenta.add(this.jPanelfecha_desdeFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(iXPanelCamposFacturasPuntoVenta % 1==0) {
		iXPanelCamposFacturasPuntoVenta=0;
		iYPanelCamposFacturasPuntoVenta++;
	}
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = iYPanelCamposFacturasPuntoVenta;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = iXPanelCamposFacturasPuntoVenta++;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasPuntoVenta.add(this.jPanelfecha_hastaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(iXPanelCamposFacturasPuntoVenta % 1==0) {
		iXPanelCamposFacturasPuntoVenta=0;
		iYPanelCamposFacturasPuntoVenta++;
	}
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = iYPanelCamposFacturasPuntoVenta;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = iXPanelCamposFacturasPuntoVenta++;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasPuntoVenta.add(this.jPanelnombre_completo_clienteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(iXPanelCamposFacturasPuntoVenta % 1==0) {
		iXPanelCamposFacturasPuntoVenta=0;
		iYPanelCamposFacturasPuntoVenta++;
	}
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = iYPanelCamposFacturasPuntoVenta;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = iXPanelCamposFacturasPuntoVenta++;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasPuntoVenta.add(this.jPaneltotal_ivaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(iXPanelCamposFacturasPuntoVenta % 1==0) {
		iXPanelCamposFacturasPuntoVenta=0;
		iYPanelCamposFacturasPuntoVenta++;
	}
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = iYPanelCamposFacturasPuntoVenta;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = iXPanelCamposFacturasPuntoVenta++;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasPuntoVenta.add(this.jPaneltotal_sin_ivaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(iXPanelCamposFacturasPuntoVenta % 1==0) {
		iXPanelCamposFacturasPuntoVenta=0;
		iYPanelCamposFacturasPuntoVenta++;
	}
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = iYPanelCamposFacturasPuntoVenta;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = iXPanelCamposFacturasPuntoVenta++;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasPuntoVenta.add(this.jPanelivaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(iXPanelCamposFacturasPuntoVenta % 1==0) {
		iXPanelCamposFacturasPuntoVenta=0;
		iYPanelCamposFacturasPuntoVenta++;
	}
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = iYPanelCamposFacturasPuntoVenta;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = iXPanelCamposFacturasPuntoVenta++;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasPuntoVenta.add(this.jPaneldescuentoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(iXPanelCamposFacturasPuntoVenta % 1==0) {
		iXPanelCamposFacturasPuntoVenta=0;
		iYPanelCamposFacturasPuntoVenta++;
	}
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = iYPanelCamposFacturasPuntoVenta;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = iXPanelCamposFacturasPuntoVenta++;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasPuntoVenta.add(this.jPaneltotalFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(iXPanelCamposFacturasPuntoVenta % 1==0) {
		iXPanelCamposFacturasPuntoVenta=0;
		iYPanelCamposFacturasPuntoVenta++;
	}
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = iYPanelCamposFacturasPuntoVenta;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = iXPanelCamposFacturasPuntoVenta++;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasPuntoVenta.add(this.jPanelruc_clienteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(iXPanelCamposFacturasPuntoVenta % 1==0) {
		iXPanelCamposFacturasPuntoVenta=0;
		iYPanelCamposFacturasPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasPuntoVenta.gridy = iYPanelCamposOcultosFacturasPuntoVenta;
	this.gridBagConstraintsFacturasPuntoVenta.gridx = iXPanelCamposOcultosFacturasPuntoVenta++;
	this.gridBagConstraintsFacturasPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturasPuntoVenta.add(this.jPanelid_empresaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);



	if(iXPanelCamposOcultosFacturasPuntoVenta % 1==0) {
		iXPanelCamposOcultosFacturasPuntoVenta=0;
		iYPanelCamposOcultosFacturasPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesFacturasPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFacturasPuntoVenta.setLayout(gridaBagLayoutAccionesFacturasPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturasPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioFacturasPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioFacturasPuntoVenta);
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturasPuntoVenta.add(this.jComboBoxTiposAccionesFormularioFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturasPuntoVenta.add(this.jButtonModificarFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);							

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturasPuntoVenta.add(this.jButtonEliminarFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
			
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturasPuntoVenta.add(this.jButtonActualizarFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturasPuntoVenta.add(this.jButtonGuardarCambiosFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);	
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturasPuntoVenta.add(this.jButtonCancelarFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturasPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsFacturasPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturasPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturasPuntoVenta.gridx =0;
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturasPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturasPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturasPuntoVenta = new FacturasPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Facturas Punto Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Facturas Punto Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturas Punto Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturasPuntoVentaModel facturaspuntoventaModel=new FacturasPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturasPuntoVentaModel.FacturasPuntoVentaFocusTraversalPolicy facturaspuntoventaFocusTraversalPolicy = facturaspuntoventaModel.new FacturasPuntoVentaFocusTraversalPolicy(this);
			
			//facturaspuntoventaFocusTraversalPolicy.setfacturaspuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturaspuntoventaModel);
			
			
			this.jContentPaneDetalleFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturasPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleFacturasPuntoVenta.setLayout(gridaBagLayoutDetalleFacturasPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturasPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleFacturasPuntoVenta.add(jTtoolBarDetalleFacturasPuntoVenta, gridBagConstraintsFacturasPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionFacturasPuntoVenta=   new JScrollPane(jContentPaneDetalleFacturasPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturasPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleFacturasPuntoVenta.add(jPanelCamposFacturasPuntoVenta, gridBagConstraintsFacturasPuntoVenta);
			
			
			
			
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
						//&& facturaspuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturasPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
						this.jContentPaneDetalleFacturasPuntoVenta.add(this.jTabbedPaneRelacionesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturasPuntoVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturasPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsFacturasPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleFacturasPuntoVenta.add(jPanelCamposOcultosFacturasPuntoVenta, gridBagConstraintsFacturasPuntoVenta);
				
					this.jPanelCamposOcultosFacturasPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	        this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFacturasPuntoVenta.add(this.jPanelAccionesFormularioFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);							
			
			
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleFacturasPuntoVenta.add(this.jPanelAccionesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturasPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturasPuntoVenta=   new JScrollPane(this.jPanelCamposFacturasPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturasPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);			
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			
			
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
			
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturasPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturasPuntoVenta;
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
