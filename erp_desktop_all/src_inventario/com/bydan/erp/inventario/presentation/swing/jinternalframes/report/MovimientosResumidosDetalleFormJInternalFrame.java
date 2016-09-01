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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.MovimientosResumidosConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class MovimientosResumidosDetalleFormJInternalFrame extends MovimientosResumidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMovimientosResumidos;
	
	protected JMenuBar jmenuBarDetalleMovimientosResumidos;
	
	protected JMenu jmenuDetalleMovimientosResumidos;
	protected JMenu jmenuDetalleArchivoMovimientosResumidos;
	protected JMenu jmenuDetalleAccionesMovimientosResumidos;
	protected JMenu jmenuDetalleDatosMovimientosResumidos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMovimientosResumidos;	
	protected GridBagConstraints gridBagConstraintsMovimientosResumidos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MovimientosResumidosBeanSwingJInternalFrameAdditional jInternalFrameDetalleMovimientosResumidos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";
	
	public MovimientosResumidosSessionBean movimientosresumidosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TransaccionSessionBean transaccionSessionBean;	
	
	public MovimientosResumidosLogic movimientosresumidosLogic;
	
	public JScrollPane jScrollPanelDatosMovimientosResumidos;
	public JScrollPane jScrollPanelDatosEdicionMovimientosResumidos;
	public JScrollPane jScrollPanelDatosGeneralMovimientosResumidos;
	
	protected JPanel jPanelCamposMovimientosResumidos;    
	protected JPanel jPanelCamposOcultosMovimientosResumidos;    	
	protected JPanel jPanelAccionesMovimientosResumidos;
	protected JPanel jPanelAccionesFormularioMovimientosResumidos;
    
	
	
	protected Integer iXPanelCamposMovimientosResumidos=0;
	protected Integer iYPanelCamposMovimientosResumidos=0;
	
	protected Integer iXPanelCamposOcultosMovimientosResumidos=0;
	protected Integer iYPanelCamposOcultosMovimientosResumidos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMovimientosResumidos;
	public JButton jButtonModificarMovimientosResumidos;
	public JButton jButtonActualizarMovimientosResumidos;
    public JButton jButtonEliminarMovimientosResumidos;
	public JButton jButtonCancelarMovimientosResumidos;
    public JButton jButtonGuardarCambiosMovimientosResumidos;
	public JButton jButtonGuardarCambiosTablaMovimientosResumidos;
	protected JButton jButtonCerrarMovimientosResumidos;
	
	
	protected JButton jButtonProcesarInformacionMovimientosResumidos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMovimientosResumidos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMovimientosResumidos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMovimientosResumidos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMovimientosResumidos;
	protected JButton jButtonModificarToolBarMovimientosResumidos;
	protected JButton jButtonActualizarToolBarMovimientosResumidos;
    protected JButton jButtonEliminarToolBarMovimientosResumidos;
	protected JButton jButtonCancelarToolBarMovimientosResumidos;
    protected JButton jButtonGuardarCambiosToolBarMovimientosResumidos;
	protected JButton jButtonGuardarCambiosTablaToolBarMovimientosResumidos;
	protected JButton jButtonMostrarOcultarTablaToolBarMovimientosResumidos;
	protected JButton jButtonCerrarToolBarMovimientosResumidos;
	
	protected JButton jButtonProcesarInformacionToolBarMovimientosResumidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMovimientosResumidos;
	protected JMenuItem jMenuItemModificarMovimientosResumidos;
	protected JMenuItem jMenuItemActualizarMovimientosResumidos;
    protected JMenuItem jMenuItemEliminarMovimientosResumidos;
	protected JMenuItem jMenuItemCancelarMovimientosResumidos;
    protected JMenuItem jMenuItemGuardarCambiosMovimientosResumidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaMovimientosResumidos;
	protected JMenuItem jMenuItemCerrarMovimientosResumidos;
	protected JMenuItem jMenuItemDetalleCerrarMovimientosResumidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarMovimientosResumidos;
	
	protected JMenuItem jMenuItemProcesarInformacionMovimientosResumidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMovimientosResumidos;
	protected JMenuItem jMenuItemMostrarOcultarMovimientosResumidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMovimientosResumidos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMovimientosResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMovimientosResumidos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMovimientosResumidos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMovimientosResumidos;
	public JLabel jLabelIdMovimientosResumidos;
	public JLabel jLabelidMovimientosResumidos;
	public JButton jButtonidMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeMovimientosResumidos;
	public JLabel jLabelfecha_emision_desdeMovimientosResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeMovimientosResumidos;

	public JDateChooser jDateChooserfecha_emision_desdeMovimientosResumidos;
	public JButton jButtonfecha_emision_desdeMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaMovimientosResumidos;
	public JLabel jLabelfecha_emision_hastaMovimientosResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaMovimientosResumidos;

	public JDateChooser jDateChooserfecha_emision_hastaMovimientosResumidos;
	public JButton jButtonfecha_emision_hastaMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalMovimientosResumidos;
	public JLabel jLabelnombre_sucursalMovimientosResumidos;
	public JTextArea jTextAreanombre_sucursalMovimientosResumidos;
	public JScrollPane jscrollPanenombre_sucursalMovimientosResumidos;
	public JButton jButtonnombre_sucursalMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteMovimientosResumidos;
	public JLabel jLabelnombre_completo_clienteMovimientosResumidos;
	public JTextArea jTextAreanombre_completo_clienteMovimientosResumidos;
	public JScrollPane jscrollPanenombre_completo_clienteMovimientosResumidos;
	public JButton jButtonnombre_completo_clienteMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_transaccionMovimientosResumidos;
	public JLabel jLabelnombre_transaccionMovimientosResumidos;
	public JTextArea jTextAreanombre_transaccionMovimientosResumidos;
	public JScrollPane jscrollPanenombre_transaccionMovimientosResumidos;
	public JButton jButtonnombre_transaccionMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteMovimientosResumidos;
	public JLabel jLabelnumero_comprobanteMovimientosResumidos;
	public JTextField jTextFieldnumero_comprobanteMovimientosResumidos;
	public JButton jButtonnumero_comprobanteMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaMovimientosResumidos;
	public JLabel jLabelnumero_facturaMovimientosResumidos;
	public JTextField jTextFieldnumero_facturaMovimientosResumidos;
	public JButton jButtonnumero_facturaMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPaneltotalMovimientosResumidos;
	public JLabel jLabeltotalMovimientosResumidos;
	public JTextField jTextFieldtotalMovimientosResumidos;
	public JButton jButtontotalMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelivaMovimientosResumidos;
	public JLabel jLabelivaMovimientosResumidos;
	public JTextField jTextFieldivaMovimientosResumidos;
	public JButton jButtonivaMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialMovimientosResumidos;
	public JLabel jLabelnumero_secuencialMovimientosResumidos;
	public JTextField jTextFieldnumero_secuencialMovimientosResumidos;
	public JButton jButtonnumero_secuencialMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionMovimientosResumidos;
	public JLabel jLabelfecha_emisionMovimientosResumidos;
	//public JFormattedTextField jDateChooserfecha_emisionMovimientosResumidos;

	public JDateChooser jDateChooserfecha_emisionMovimientosResumidos;
	public JButton jButtonfecha_emisionMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoMovimientosResumidos;
	public JLabel jLabeltotal_descuentoMovimientosResumidos;
	public JTextField jTextFieldtotal_descuentoMovimientosResumidos;
	public JButton jButtontotal_descuentoMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPaneliceMovimientosResumidos;
	public JLabel jLabeliceMovimientosResumidos;
	public JTextField jTextFieldiceMovimientosResumidos;
	public JButton jButtoniceMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelretencionMovimientosResumidos;
	public JLabel jLabelretencionMovimientosResumidos;
	public JTextField jTextFieldretencionMovimientosResumidos;
	public JButton jButtonretencionMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_otroMovimientosResumidos;
	public JLabel jLabeltotal_otroMovimientosResumidos;
	public JTextField jTextFieldtotal_otroMovimientosResumidos;
	public JButton jButtontotal_otroMovimientosResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMovimientosResumidos;
	public JLabel jLabelid_empresaMovimientosResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMovimientosResumidos;
	public JButton jButtonid_empresaMovimientosResumidos= new JButtonMe();
	public JButton jButtonid_empresaMovimientosResumidosUpdate= new JButtonMe();
	public JButton jButtonid_empresaMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalMovimientosResumidos;
	public JLabel jLabelid_sucursalMovimientosResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalMovimientosResumidos;
	public JButton jButtonid_sucursalMovimientosResumidos= new JButtonMe();
	public JButton jButtonid_sucursalMovimientosResumidosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalMovimientosResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionMovimientosResumidos;
	public JLabel jLabelid_transaccionMovimientosResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionMovimientosResumidos;
	public JButton jButtonid_transaccionMovimientosResumidos= new JButtonMe();
	public JButton jButtonid_transaccionMovimientosResumidosUpdate= new JButtonMe();
	public JButton jButtonid_transaccionMovimientosResumidosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMovimientosResumidos;
	
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
	public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MovimientosResumidosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMovimientosResumidos=new JPanel();
				this.jPanelAccionesFormularioMovimientosResumidos=new JPanel();
				this.jmenuBarDetalleMovimientosResumidos=new JMenuBar();
				this.jTtoolBarDetalleMovimientosResumidos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosResumidosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MovimientosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MovimientosResumidosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MovimientosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosResumidosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosResumidosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosResumidosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MovimientosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMovimientosResumidos() {
		return this.jButtonActualizarToolBarMovimientosResumidos;
	}
	
	public JButton getjButtonEliminarToolBarMovimientosResumidos() {
		return this.jButtonEliminarToolBarMovimientosResumidos;
	}
	
	public JButton getjButtonCancelarToolBarMovimientosResumidos() {
		return this.jButtonCancelarToolBarMovimientosResumidos;
	}		
	
	public JButton getjButtonProcesarInformacionMovimientosResumidos() {
		return this.jButtonProcesarInformacionMovimientosResumidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMovimientosResumidos)	{
		this.jButtonProcesarInformacionMovimientosResumidos = jButtonProcesarInformacionMovimientosResumidos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMovimientosResumidos() {
		return this.jComboBoxTiposAccionesMovimientosResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMovimientosResumidos(
			JComboBox jComboBoxTiposRelacionesMovimientosResumidos) {
		this.jComboBoxTiposRelacionesMovimientosResumidos = jComboBoxTiposRelacionesMovimientosResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMovimientosResumidos(
			JComboBox jComboBoxTiposAccionesMovimientosResumidos) {
		this.jComboBoxTiposAccionesMovimientosResumidos = jComboBoxTiposAccionesMovimientosResumidos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMovimientosResumidos() {
		return this.jComboBoxTiposAccionesFormularioMovimientosResumidos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMovimientosResumidos(
			JComboBox jComboBoxTiposAccionesFormularioMovimientosResumidos) {
		this.jComboBoxTiposAccionesFormularioMovimientosResumidos = jComboBoxTiposAccionesFormularioMovimientosResumidos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.movimientosresumidosSessionBean=new MovimientosResumidosSessionBean();
		
		this.movimientosresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.movimientosresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.movimientosresumidosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MovimientosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MovimientosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MovimientosResumidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Movimientos Resumidos MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
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
	
		MovimientosResumidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMovimientosResumidos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMovimientosResumidos=new JButtonMe();
				this.jButtonModificarToolBarMovimientosResumidos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMovimientosResumidos,this.jTtoolBarDetalleMovimientosResumidos,
							"actualizar","actualizar","Actualizar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMovimientosResumidos,this.jTtoolBarDetalleMovimientosResumidos,
							"eliminar","eliminar","Eliminar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMovimientosResumidos,this.jTtoolBarDetalleMovimientosResumidos,
							"cancelar","cancelar","Cancelar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMovimientosResumidos,this.jTtoolBarDetalleMovimientosResumidos,
							"guardarcambios","guardarcambios","Guardar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMovimientosResumidos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMovimientosResumidos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMovimientosResumidos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMovimientosResumidos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMovimientosResumidos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMovimientosResumidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMovimientosResumidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMovimientosResumidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMovimientosResumidos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMovimientosResumidos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMovimientosResumidos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMovimientosResumidos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMovimientosResumidos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMovimientosResumidos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMovimientosResumidos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMovimientosResumidos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMovimientosResumidos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMovimientosResumidos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMovimientosResumidos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMovimientosResumidos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMovimientosResumidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMovimientosResumidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMovimientosResumidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMovimientosResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMovimientosResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMovimientosResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMovimientosResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMovimientosResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMovimientosResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMovimientosResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMovimientosResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMovimientosResumidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMovimientosResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMovimientosResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMovimientosResumidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMovimientosResumidos.add(this.jMenuItemDetalleCerrarMovimientosResumidos);
		
		this.jmenuDetalleAccionesMovimientosResumidos.add(this.jMenuItemActualizarMovimientosResumidos);
		this.jmenuDetalleAccionesMovimientosResumidos.add(this.jMenuItemEliminarMovimientosResumidos);
		this.jmenuDetalleAccionesMovimientosResumidos.add(this.jMenuItemCancelarMovimientosResumidos);		
		
		//this.jmenuDetalleDatosMovimientosResumidos.add(this.jMenuItemDetalleAbrirOrderByMovimientosResumidos);				
		this.jmenuDetalleDatosMovimientosResumidos.add(this.jMenuItemDetalleMostarOcultarMovimientosResumidos);				
				
		//this.jmenuDetalleAccionesMovimientosResumidos.add(this.jMenuItemGuardarCambiosMovimientosResumidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMovimientosResumidos.add(this.jmenuDetalleArchivoMovimientosResumidos);		
		this.jmenuBarDetalleMovimientosResumidos.add(this.jmenuDetalleAccionesMovimientosResumidos);		
		this.jmenuBarDetalleMovimientosResumidos.add(this.jmenuDetalleDatosMovimientosResumidos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMovimientosResumidos);				
	}
	
	
	public void inicializarElementosCamposMovimientosResumidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMovimientosResumidos = new JLabelMe();
		jLabelIdMovimientosResumidos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMovimientosResumidos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMovimientosResumidos= new GridBagLayout();

		this.jPanelidMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);

		jLabelidMovimientosResumidos = new JLabel();
		jLabelidMovimientosResumidos.setText("Id");

		jLabelidMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeMovimientosResumidos = new JLabelMe();
		this.jLabelfecha_emision_desdeMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeMovimientosResumidos.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelfecha_emision_desdeMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		//jFormattedTextFieldfecha_emision_desdeMovimientosResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeMovimientosResumidos= new JDateChooser();
		jDateChooserfecha_emision_desdeMovimientosResumidos.setEnabled(false);
		jDateChooserfecha_emision_desdeMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeMovimientosResumidos.setDate(new Date());
		jDateChooserfecha_emision_desdeMovimientosResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeMovimientosResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeMovimientosResumidosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaMovimientosResumidos = new JLabelMe();
		this.jLabelfecha_emision_hastaMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaMovimientosResumidos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelfecha_emision_hastaMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		//jFormattedTextFieldfecha_emision_hastaMovimientosResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaMovimientosResumidos= new JDateChooser();
		jDateChooserfecha_emision_hastaMovimientosResumidos.setEnabled(false);
		jDateChooserfecha_emision_hastaMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaMovimientosResumidos.setDate(new Date());
		jDateChooserfecha_emision_hastaMovimientosResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaMovimientosResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaMovimientosResumidosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sucursalMovimientosResumidos = new JLabelMe();
		this.jLabelnombre_sucursalMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalMovimientosResumidos.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelnombre_sucursalMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextAreanombre_sucursalMovimientosResumidos= new JTextAreaMe();
		jTextAreanombre_sucursalMovimientosResumidos.setEnabled(false);
		jTextAreanombre_sucursalMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalMovimientosResumidos.setLineWrap(true);
		jTextAreanombre_sucursalMovimientosResumidos.setWrapStyleWord(true);
		jTextAreanombre_sucursalMovimientosResumidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalMovimientosResumidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalMovimientosResumidos = new JScrollPane(jTextAreanombre_sucursalMovimientosResumidos);
		jscrollPanenombre_sucursalMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sucursalMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalMovimientosResumidosBusqueda.setText("U");
		this.jButtonnombre_sucursalMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteMovimientosResumidos = new JLabelMe();
		this.jLabelnombre_completo_clienteMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteMovimientosResumidos.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelnombre_completo_clienteMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextAreanombre_completo_clienteMovimientosResumidos= new JTextAreaMe();
		jTextAreanombre_completo_clienteMovimientosResumidos.setEnabled(false);
		jTextAreanombre_completo_clienteMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteMovimientosResumidos.setLineWrap(true);
		jTextAreanombre_completo_clienteMovimientosResumidos.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteMovimientosResumidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteMovimientosResumidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteMovimientosResumidos = new JScrollPane(jTextAreanombre_completo_clienteMovimientosResumidos);
		jscrollPanenombre_completo_clienteMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteMovimientosResumidosBusqueda.setText("U");
		this.jButtonnombre_completo_clienteMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_transaccionMovimientosResumidos = new JLabelMe();
		this.jLabelnombre_transaccionMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION+" : *");
		this.jLabelnombre_transaccionMovimientosResumidos.setToolTipText("Nombre Transaccion");
		this.jLabelnombre_transaccionMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_transaccionMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_transaccionMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_transaccionMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelnombre_transaccionMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextAreanombre_transaccionMovimientosResumidos= new JTextAreaMe();
		jTextAreanombre_transaccionMovimientosResumidos.setEnabled(false);
		jTextAreanombre_transaccionMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionMovimientosResumidos.setLineWrap(true);
		jTextAreanombre_transaccionMovimientosResumidos.setWrapStyleWord(true);
		jTextAreanombre_transaccionMovimientosResumidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_transaccionMovimientosResumidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_transaccionMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_transaccionMovimientosResumidos = new JScrollPane(jTextAreanombre_transaccionMovimientosResumidos);
		jscrollPanenombre_transaccionMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_transaccionMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_transaccionMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_transaccionMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_transaccionMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_transaccionMovimientosResumidosBusqueda.setText("U");
		this.jButtonnombre_transaccionMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_transaccionMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_transaccionMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_transaccionMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_transaccionMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_transaccionMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_transaccionMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteMovimientosResumidos = new JLabelMe();
		this.jLabelnumero_comprobanteMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteMovimientosResumidos.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelnumero_comprobanteMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextFieldnumero_comprobanteMovimientosResumidos= new JTextFieldMe();

		jTextFieldnumero_comprobanteMovimientosResumidos.setEnabled(false);
		jTextFieldnumero_comprobanteMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteMovimientosResumidosBusqueda.setText("U");
		this.jButtonnumero_comprobanteMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaMovimientosResumidos = new JLabelMe();
		this.jLabelnumero_facturaMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaMovimientosResumidos.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelnumero_facturaMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextFieldnumero_facturaMovimientosResumidos= new JTextFieldMe();

		jTextFieldnumero_facturaMovimientosResumidos.setEnabled(false);
		jTextFieldnumero_facturaMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonnumero_facturaMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaMovimientosResumidosBusqueda.setText("U");
		this.jButtonnumero_facturaMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabeltotalMovimientosResumidos = new JLabelMe();
		this.jLabeltotalMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalMovimientosResumidos.setToolTipText("Total");
		this.jLabeltotalMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPaneltotalMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextFieldtotalMovimientosResumidos= new JTextFieldMe();
		jTextFieldtotalMovimientosResumidos.setEnabled(false);
		jTextFieldtotalMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalMovimientosResumidos.setText("0.0");

		this.jButtontotalMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtontotalMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalMovimientosResumidosBusqueda.setText("U");
		this.jButtontotalMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelivaMovimientosResumidos = new JLabelMe();
		this.jLabelivaMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaMovimientosResumidos.setToolTipText("Iva");
		this.jLabelivaMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelivaMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextFieldivaMovimientosResumidos= new JTextFieldMe();
		jTextFieldivaMovimientosResumidos.setEnabled(false);
		jTextFieldivaMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaMovimientosResumidos.setText("0.0");

		this.jButtonivaMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonivaMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaMovimientosResumidosBusqueda.setText("U");
		this.jButtonivaMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_secuencialMovimientosResumidos = new JLabelMe();
		this.jLabelnumero_secuencialMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialMovimientosResumidos.setToolTipText("Numero Secuencial");
		this.jLabelnumero_secuencialMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_secuencialMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_secuencialMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelnumero_secuencialMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextFieldnumero_secuencialMovimientosResumidos= new JTextFieldMe();

		jTextFieldnumero_secuencialMovimientosResumidos.setEnabled(false);
		jTextFieldnumero_secuencialMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencialMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialMovimientosResumidosBusqueda.setText("U");
		this.jButtonnumero_secuencialMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionMovimientosResumidos = new JLabelMe();
		this.jLabelfecha_emisionMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionMovimientosResumidos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelfecha_emisionMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		//jFormattedTextFieldfecha_emisionMovimientosResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionMovimientosResumidos= new JDateChooser();
		jDateChooserfecha_emisionMovimientosResumidos.setEnabled(false);
		jDateChooserfecha_emisionMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionMovimientosResumidos.setDate(new Date());
		jDateChooserfecha_emisionMovimientosResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionMovimientosResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionMovimientosResumidosBusqueda.setText("U");
		this.jButtonfecha_emisionMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoMovimientosResumidos = new JLabelMe();
		this.jLabeltotal_descuentoMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoMovimientosResumidos.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPaneltotal_descuentoMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextFieldtotal_descuentoMovimientosResumidos= new JTextFieldMe();
		jTextFieldtotal_descuentoMovimientosResumidos.setEnabled(false);
		jTextFieldtotal_descuentoMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoMovimientosResumidos.setText("0.0");

		this.jButtontotal_descuentoMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtontotal_descuentoMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoMovimientosResumidosBusqueda.setText("U");
		this.jButtontotal_descuentoMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabeliceMovimientosResumidos = new JLabelMe();
		this.jLabeliceMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceMovimientosResumidos.setToolTipText("Ice");
		this.jLabeliceMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPaneliceMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextFieldiceMovimientosResumidos= new JTextFieldMe();
		jTextFieldiceMovimientosResumidos.setEnabled(false);
		jTextFieldiceMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceMovimientosResumidos.setText("0.0");

		this.jButtoniceMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtoniceMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceMovimientosResumidosBusqueda.setText("U");
		this.jButtoniceMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabelretencionMovimientosResumidos = new JLabelMe();
		this.jLabelretencionMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_RETENCION+" : *");
		this.jLabelretencionMovimientosResumidos.setToolTipText("Retencion");
		this.jLabelretencionMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencionMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencionMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencionMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_RETENCION);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelretencionMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextFieldretencionMovimientosResumidos= new JTextFieldMe();
		jTextFieldretencionMovimientosResumidos.setEnabled(false);
		jTextFieldretencionMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencionMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencionMovimientosResumidos.setText("0.0");

		this.jButtonretencionMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonretencionMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencionMovimientosResumidosBusqueda.setText("U");
		this.jButtonretencionMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencionMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencionMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencionMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencionMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencionMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencionMovimientosResumidosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_otroMovimientosResumidos = new JLabelMe();
		this.jLabeltotal_otroMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO+" : *");
		this.jLabeltotal_otroMovimientosResumidos.setToolTipText("Total Otro");
		this.jLabeltotal_otroMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_otroMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_otroMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_otroMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPaneltotal_otroMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jTextFieldtotal_otroMovimientosResumidos= new JTextFieldMe();
		jTextFieldtotal_otroMovimientosResumidos.setEnabled(false);
		jTextFieldtotal_otroMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_otroMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_otroMovimientosResumidos.setText("0.0");

		this.jButtontotal_otroMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtontotal_otroMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_otroMovimientosResumidosBusqueda.setText("U");
		this.jButtontotal_otroMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_otroMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_otroMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_otroMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_otroMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_otroMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_otroMovimientosResumidosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMovimientosResumidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMovimientosResumidos = new JLabelMe();
		this.jLabelid_empresaMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMovimientosResumidos.setToolTipText("Empresa");
		this.jLabelid_empresaMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelid_empresaMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jComboBoxid_empresaMovimientosResumidos= new JComboBoxMe();
		jComboBoxid_empresaMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMovimientosResumidos.setEnabled(false);

		this.jButtonid_empresaMovimientosResumidos= new JButtonMe();
		this.jButtonid_empresaMovimientosResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientosResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientosResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientosResumidos.setText("Buscar");
		this.jButtonid_empresaMovimientosResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMovimientosResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientosResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientosResumidos"));

		this.jButtonid_empresaMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonid_empresaMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMovimientosResumidosBusqueda.setText("U");
		this.jButtonid_empresaMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMovimientosResumidosBusqueda.setVisible(false);		}

		this.jButtonid_empresaMovimientosResumidosUpdate= new JButtonMe();
		this.jButtonid_empresaMovimientosResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientosResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientosResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMovimientosResumidosUpdate.setText("U");
		this.jButtonid_empresaMovimientosResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMovimientosResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientosResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientosResumidosUpdate"));



					
		this.jLabelid_sucursalMovimientosResumidos = new JLabelMe();
		this.jLabelid_sucursalMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalMovimientosResumidos.setToolTipText("Sucursal");
		this.jLabelid_sucursalMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelid_sucursalMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jComboBoxid_sucursalMovimientosResumidos= new JComboBoxMe();
		jComboBoxid_sucursalMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalMovimientosResumidos.setEnabled(false);

		this.jButtonid_sucursalMovimientosResumidos= new JButtonMe();
		this.jButtonid_sucursalMovimientosResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientosResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientosResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientosResumidos.setText("Buscar");
		this.jButtonid_sucursalMovimientosResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalMovimientosResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientosResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientosResumidos"));

		this.jButtonid_sucursalMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonid_sucursalMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMovimientosResumidosBusqueda.setText("U");
		this.jButtonid_sucursalMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalMovimientosResumidosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalMovimientosResumidosUpdate= new JButtonMe();
		this.jButtonid_sucursalMovimientosResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientosResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientosResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMovimientosResumidosUpdate.setText("U");
		this.jButtonid_sucursalMovimientosResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalMovimientosResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientosResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientosResumidosUpdate"));



					
		this.jLabelid_transaccionMovimientosResumidos = new JLabelMe();
		this.jLabelid_transaccionMovimientosResumidos.setText(""+MovimientosResumidosConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionMovimientosResumidos.setToolTipText("Transaccion");
		this.jLabelid_transaccionMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionMovimientosResumidos.setToolTipText(MovimientosResumidosConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		this.jPanelid_transaccionMovimientosResumidos.setLayout(this.gridaBagLayoutMovimientosResumidos);


		jComboBoxid_transaccionMovimientosResumidos= new JComboBoxMe();
		jComboBoxid_transaccionMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionMovimientosResumidos= new JButtonMe();
		this.jButtonid_transaccionMovimientosResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionMovimientosResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionMovimientosResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionMovimientosResumidos.setText("Buscar");
		this.jButtonid_transaccionMovimientosResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionMovimientosResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionMovimientosResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionMovimientosResumidos"));

		this.jButtonid_transaccionMovimientosResumidosBusqueda= new JButtonMe();
		this.jButtonid_transaccionMovimientosResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientosResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientosResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionMovimientosResumidosBusqueda.setText("U");
		this.jButtonid_transaccionMovimientosResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionMovimientosResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionMovimientosResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionMovimientosResumidosBusqueda"));

		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionMovimientosResumidosBusqueda.setVisible(false);		}

		this.jButtonid_transaccionMovimientosResumidosUpdate= new JButtonMe();
		this.jButtonid_transaccionMovimientosResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientosResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientosResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionMovimientosResumidosUpdate.setText("U");
		this.jButtonid_transaccionMovimientosResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionMovimientosResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionMovimientosResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionMovimientosResumidosUpdate"));



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
		//this.jInternalFrameDetalleMovimientosResumidos = new MovimientosResumidosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Movimientos Resumidos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMovimientosResumidos= new GridBagLayout();
		

		
		String sToolTipMovimientosResumidos="";
		sToolTipMovimientosResumidos=MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMovimientosResumidos+="(Inventario.MovimientosResumidos)";
		}
		
		if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipMovimientosResumidos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMovimientosResumidos = new JButtonMe();
		this.jButtonModificarMovimientosResumidos = new JButtonMe();
        this.jButtonActualizarMovimientosResumidos = new JButtonMe();
        this.jButtonEliminarMovimientosResumidos = new JButtonMe();
        this.jButtonCancelarMovimientosResumidos = new JButtonMe();
        this.jButtonGuardarCambiosMovimientosResumidos = new JButtonMe();
		this.jButtonGuardarCambiosTablaMovimientosResumidos = new JButtonMe();
		this.jButtonCerrarMovimientosResumidos = new JButtonMe();
		
		this.jScrollPanelDatosMovimientosResumidos = new JScrollPane();   
        this.jScrollPanelDatosEdicionMovimientosResumidos = new JScrollPane();
		this.jScrollPanelDatosGeneralMovimientosResumidos = new JScrollPane();
				
		
		
		this.jPanelCamposMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Movimientos Resumidos";
		
		if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Resumidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosMovimientosResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMovimientosResumidos.setName("jPanelCamposMovimientosResumidos"); 

		this.jPanelCamposOcultosMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMovimientosResumidos.setName("jPanelCamposOcultosMovimientosResumidos"); 

        this.jPanelAccionesMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMovimientosResumidos.setToolTipText("Acciones");
        this.jPanelAccionesMovimientosResumidos.setName("Acciones"); 

		this.jPanelAccionesFormularioMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMovimientosResumidos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMovimientosResumidos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMovimientosResumidos.setText("Nuevo");
		this.jButtonModificarMovimientosResumidos.setText("Editar");
        this.jButtonActualizarMovimientosResumidos.setText("Actualizar");
        this.jButtonEliminarMovimientosResumidos.setText("Eliminar");
        this.jButtonCancelarMovimientosResumidos.setText("Cancelar");
        this.jButtonGuardarCambiosMovimientosResumidos.setText("Guardar");
		this.jButtonGuardarCambiosTablaMovimientosResumidos.setText("Guardar");
		this.jButtonCerrarMovimientosResumidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMovimientosResumidos,"nuevo_button","Nuevo",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMovimientosResumidos,"modificar_button","Editar",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMovimientosResumidos,"actualizar_button","Actualizar",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMovimientosResumidos,"eliminar_button","Eliminar",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMovimientosResumidos,"cancelar_button","Cancelar",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMovimientosResumidos,"guardarcambios_button","Guardar",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMovimientosResumidos,"guardarcambiostabla_button","Guardar",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMovimientosResumidos,"cerrar_button","Salir",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMovimientosResumidos.setToolTipText("Nuevo"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMovimientosResumidos.setToolTipText("Editar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMovimientosResumidos.setToolTipText("Actualizar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMovimientosResumidos.setToolTipText("Eliminar)"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMovimientosResumidos.setToolTipText("Cancelar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMovimientosResumidos.setToolTipText("Guardar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMovimientosResumidos.setToolTipText("Guardar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMovimientosResumidos.setToolTipText("Salir"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMovimientosResumidos";
		inputMap = this.jButtonNuevoMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMovimientosResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMovimientosResumidos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMovimientosResumidos";
		inputMap = this.jButtonActualizarMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMovimientosResumidos"));
		
		//ELIMINAR
		sMapKey = "EliminarMovimientosResumidos";
		inputMap = this.jButtonEliminarMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMovimientosResumidos"));
		
		//CANCELAR	
		sMapKey = "CancelarMovimientosResumidos";
		inputMap = this.jButtonCancelarMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMovimientosResumidos"));
		
		//CERRAR		
		sMapKey = "CerrarMovimientosResumidos";
		inputMap = this.jButtonCerrarMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMovimientosResumidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMovimientosResumidos";
		inputMap = this.jButtonGuardarCambiosTablaMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMovimientosResumidos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMovimientosResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMovimientosResumidos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMovimientosResumidos.setToolTipText("Nuevo MovimientosResumidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMovimientosResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMovimientosResumidos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMovimientosResumidos.setToolTipText("Sin Cerrar Ventana MovimientosResumidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMovimientosResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMovimientosResumidos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMovimientosResumidos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMovimientosResumidos.setText("Accion");
		this.jComboBoxTiposAccionesMovimientosResumidos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMovimientosResumidos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMovimientosResumidos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMovimientosResumidos = new JLabelMe();
		
		this.jLabelAccionesMovimientosResumidos.setText("Acciones");		
		this.jLabelAccionesMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMovimientosResumidos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMovimientosResumidos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMovimientosResumidos=new JTabbedPane();
		this.jTabbedPaneRelacionesMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMovimientosResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientosResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientosResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMovimientosResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMovimientosResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMovimientosResumidos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMovimientosResumidos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMovimientosResumidos = new GridBagLayout();
		
		this.jPanelCamposMovimientosResumidos.setLayout(gridaBagLayoutCamposMovimientosResumidos);
		this.jPanelCamposOcultosMovimientosResumidos.setLayout(gridaBagLayoutCamposOcultosMovimientosResumidos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMovimientosResumidos.add(jLabelIdMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMovimientosResumidos.add(jLabelidMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMovimientosResumidos.add(jLabelid_empresaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMovimientosResumidos.add(jButtonid_empresaMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 3;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMovimientosResumidos.add(jButtonid_empresaMovimientosResumidosUpdate, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMovimientosResumidos.add(jComboBoxid_empresaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalMovimientosResumidos.add(jLabelid_sucursalMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMovimientosResumidos.add(jButtonid_sucursalMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 3;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMovimientosResumidos.add(jButtonid_sucursalMovimientosResumidosUpdate, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalMovimientosResumidos.add(jComboBoxid_sucursalMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionMovimientosResumidos.add(jLabelid_transaccionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionMovimientosResumidos.add(jButtonid_transaccionMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 3;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionMovimientosResumidos.add(jButtonid_transaccionMovimientosResumidosUpdate, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionMovimientosResumidos.add(jComboBoxid_transaccionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeMovimientosResumidos.add(jLabelfecha_emision_desdeMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeMovimientosResumidos.add(jButtonfecha_emision_desdeMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeMovimientosResumidos.add(jDateChooserfecha_emision_desdeMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaMovimientosResumidos.add(jLabelfecha_emision_hastaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaMovimientosResumidos.add(jButtonfecha_emision_hastaMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaMovimientosResumidos.add(jDateChooserfecha_emision_hastaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalMovimientosResumidos.add(jLabelnombre_sucursalMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalMovimientosResumidos.add(jButtonnombre_sucursalMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalMovimientosResumidos.add(jscrollPanenombre_sucursalMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteMovimientosResumidos.add(jLabelnombre_completo_clienteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteMovimientosResumidos.add(jButtonnombre_completo_clienteMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteMovimientosResumidos.add(jscrollPanenombre_completo_clienteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_transaccionMovimientosResumidos.add(jLabelnombre_transaccionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_transaccionMovimientosResumidos.add(jButtonnombre_transaccionMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_transaccionMovimientosResumidos.add(jscrollPanenombre_transaccionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteMovimientosResumidos.add(jLabelnumero_comprobanteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteMovimientosResumidos.add(jButtonnumero_comprobanteMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteMovimientosResumidos.add(jTextFieldnumero_comprobanteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaMovimientosResumidos.add(jLabelnumero_facturaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaMovimientosResumidos.add(jButtonnumero_facturaMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaMovimientosResumidos.add(jTextFieldnumero_facturaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalMovimientosResumidos.add(jLabeltotalMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalMovimientosResumidos.add(jButtontotalMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalMovimientosResumidos.add(jTextFieldtotalMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaMovimientosResumidos.add(jLabelivaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaMovimientosResumidos.add(jButtonivaMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaMovimientosResumidos.add(jTextFieldivaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_secuencialMovimientosResumidos.add(jLabelnumero_secuencialMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialMovimientosResumidos.add(jButtonnumero_secuencialMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_secuencialMovimientosResumidos.add(jTextFieldnumero_secuencialMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionMovimientosResumidos.add(jLabelfecha_emisionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionMovimientosResumidos.add(jButtonfecha_emisionMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionMovimientosResumidos.add(jDateChooserfecha_emisionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_descuentoMovimientosResumidos.add(jLabeltotal_descuentoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoMovimientosResumidos.add(jButtontotal_descuentoMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_descuentoMovimientosResumidos.add(jTextFieldtotal_descuentoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceMovimientosResumidos.add(jLabeliceMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceMovimientosResumidos.add(jButtoniceMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceMovimientosResumidos.add(jTextFieldiceMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelretencionMovimientosResumidos.add(jLabelretencionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencionMovimientosResumidos.add(jButtonretencionMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelretencionMovimientosResumidos.add(jTextFieldretencionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_otroMovimientosResumidos.add(jLabeltotal_otroMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 2;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
		this.gridBagConstraintsMovimientosResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_otroMovimientosResumidos.add(jButtontotal_otroMovimientosResumidosBusqueda, this.gridBagConstraintsMovimientosResumidos);
	}

	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosResumidos.gridy = 0;
	this.gridBagConstraintsMovimientosResumidos.gridx = 1;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_otroMovimientosResumidos.add(jTextFieldtotal_otroMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelidMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelid_transaccionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelfecha_emision_desdeMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelfecha_emision_hastaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelnombre_sucursalMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelnombre_completo_clienteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelnombre_transaccionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelnumero_comprobanteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelnumero_facturaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPaneltotalMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelivaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelnumero_secuencialMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelfecha_emisionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPaneltotal_descuentoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPaneliceMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPanelretencionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosResumidos.add(this.jPaneltotal_otroMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposMovimientosResumidos % 2==0) {
		iXPanelCamposMovimientosResumidos=0;
		iYPanelCamposMovimientosResumidos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposOcultosMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposOcultosMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMovimientosResumidos.add(this.jPanelid_empresaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposOcultosMovimientosResumidos % 2==0) {
		iXPanelCamposOcultosMovimientosResumidos=0;
		iYPanelCamposOcultosMovimientosResumidos++;
	}
	this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosResumidos.gridy = iYPanelCamposOcultosMovimientosResumidos;
	this.gridBagConstraintsMovimientosResumidos.gridx = iXPanelCamposOcultosMovimientosResumidos++;
	this.gridBagConstraintsMovimientosResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMovimientosResumidos.add(this.jPanelid_sucursalMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);



	if(iXPanelCamposOcultosMovimientosResumidos % 2==0) {
		iXPanelCamposOcultosMovimientosResumidos=0;
		iYPanelCamposOcultosMovimientosResumidos++;
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
			
		GridBagLayout gridaBagLayoutAccionesMovimientosResumidos= new GridBagLayout();
		this.jPanelAccionesMovimientosResumidos.setLayout(gridaBagLayoutAccionesMovimientosResumidos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMovimientosResumidos= new GridBagLayout();
		this.jPanelAccionesFormularioMovimientosResumidos.setLayout(gridaBagLayoutAccionesFormularioMovimientosResumidos);
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMovimientosResumidos.add(this.jComboBoxTiposAccionesFormularioMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccion++;
			
		this.jPanelAccionesMovimientosResumidos.add(this.jButtonModificarMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);							

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx =iPosXAccion++;
			
		this.jPanelAccionesMovimientosResumidos.add(this.jButtonEliminarMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
			
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesMovimientosResumidos.add(this.jButtonActualizarMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesMovimientosResumidos.add(this.jButtonGuardarCambiosMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);	
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;		
		this.gridBagConstraintsMovimientosResumidos.gridx =iPosXAccion++;
		
		this.jPanelAccionesMovimientosResumidos.add(this.jButtonCancelarMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMovimientosResumidos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();						
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientosResumidos.gridx = 0;		
			//this.gridBagConstraintsMovimientosResumidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMovimientosResumidos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMovimientosResumidos.gridx =0;
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMovimientosResumidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MovimientosResumidosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMovimientosResumidos = new MovimientosResumidosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Movimientos Resumidos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Movimientos Resumidos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Movimientos Resumidos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MovimientosResumidosModel movimientosresumidosModel=new MovimientosResumidosModel(this);
			
			//SI USARA CLASE INTERNA
			//MovimientosResumidosModel.MovimientosResumidosFocusTraversalPolicy movimientosresumidosFocusTraversalPolicy = movimientosresumidosModel.new MovimientosResumidosFocusTraversalPolicy(this);
			
			//movimientosresumidosFocusTraversalPolicy.setmovimientosresumidosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(movimientosresumidosModel);
			
			
			this.jContentPaneDetalleMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMovimientosResumidos = new GridBagLayout();	
			this.jContentPaneDetalleMovimientosResumidos.setLayout(gridaBagLayoutDetalleMovimientosResumidos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMovimientosResumidos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
				this.gridBagConstraintsMovimientosResumidos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMovimientosResumidos.gridx = 0;
					
				
				this.jContentPaneDetalleMovimientosResumidos.add(jTtoolBarDetalleMovimientosResumidos, gridBagConstraintsMovimientosResumidos);								
				
}
			
			this.jScrollPanelDatosEdicionMovimientosResumidos=   new JScrollPane(jContentPaneDetalleMovimientosResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMovimientosResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientosResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientosResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMovimientosResumidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMovimientosResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientosResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientosResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMovimientosResumidos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	        
			this.jContentPaneDetalleMovimientosResumidos.add(jPanelCamposMovimientosResumidos, gridBagConstraintsMovimientosResumidos);
			
			
			
			
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
						//&& movimientosresumidosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.movimientosresumidosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMovimientosResumidos= new GridBagConstraints();
						this.gridBagConstraintsMovimientosResumidos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMovimientosResumidos.gridx = 0;
						this.jContentPaneDetalleMovimientosResumidos.add(this.jTabbedPaneRelacionesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMovimientosResumidos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMovimientosResumidos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
					this.gridBagConstraintsMovimientosResumidos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMovimientosResumidos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMovimientosResumidos.gridx = 0;
					
				
					this.jContentPaneDetalleMovimientosResumidos.add(jPanelCamposOcultosMovimientosResumidos, gridBagConstraintsMovimientosResumidos);
				
					this.jPanelCamposOcultosMovimientosResumidos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	        this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMovimientosResumidos.add(this.jPanelAccionesFormularioMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);							
			
			
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
	        this.gridBagConstraintsMovimientosResumidos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMovimientosResumidos.gridx = 0;
	        
			
			this.jContentPaneDetalleMovimientosResumidos.add(this.jPanelAccionesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMovimientosResumidos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMovimientosResumidos=   new JScrollPane(this.jPanelCamposMovimientosResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMovimientosResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientosResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientosResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMovimientosResumidos.gridx = 0;
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMovimientosResumidos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMovimientosResumidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);			
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMovimientosResumidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			
			
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
			
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosResumidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMovimientosResumidos;//jContentPane;
		
		return jScrollPanelDatosEdicionMovimientosResumidos;
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
