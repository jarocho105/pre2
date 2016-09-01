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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.ComisionVentaCobroConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class ComisionVentaCobroDetalleFormJInternalFrame extends ComisionVentaCobroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComisionVentaCobro;
	
	protected JMenuBar jmenuBarDetalleComisionVentaCobro;
	
	protected JMenu jmenuDetalleComisionVentaCobro;
	protected JMenu jmenuDetalleArchivoComisionVentaCobro;
	protected JMenu jmenuDetalleAccionesComisionVentaCobro;
	protected JMenu jmenuDetalleDatosComisionVentaCobro;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionVentaCobro;	
	protected GridBagConstraints gridBagConstraintsComisionVentaCobro;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComisionVentaCobroBeanSwingJInternalFrameAdditional jInternalFrameDetalleComisionVentaCobro;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";
	
	public ComisionVentaCobroSessionBean comisionventacobroSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public FacturaSessionBean facturaSessionBean;	
	
	public ComisionVentaCobroLogic comisionventacobroLogic;
	
	public JScrollPane jScrollPanelDatosComisionVentaCobro;
	public JScrollPane jScrollPanelDatosEdicionComisionVentaCobro;
	public JScrollPane jScrollPanelDatosGeneralComisionVentaCobro;
	
	protected JPanel jPanelCamposComisionVentaCobro;    
	protected JPanel jPanelCamposOcultosComisionVentaCobro;    	
	protected JPanel jPanelAccionesComisionVentaCobro;
	protected JPanel jPanelAccionesFormularioComisionVentaCobro;
    
	
	
	protected Integer iXPanelCamposComisionVentaCobro=0;
	protected Integer iYPanelCamposComisionVentaCobro=0;
	
	protected Integer iXPanelCamposOcultosComisionVentaCobro=0;
	protected Integer iYPanelCamposOcultosComisionVentaCobro=0;
	
	

	protected JPanel jPanelCamposIniciogeneralComisionVentaCobro;
	protected Integer iXPanelCamposIniciogeneralComisionVentaCobro=0;
	protected Integer iYPanelCamposIniciogeneralComisionVentaCobro=0;

	protected JPanel jPanelCamposIniciovaloresComisionVentaCobro;
	protected Integer iXPanelCamposIniciovaloresComisionVentaCobro=0;
	protected Integer iYPanelCamposIniciovaloresComisionVentaCobro=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComisionVentaCobro;
	public JButton jButtonModificarComisionVentaCobro;
	public JButton jButtonActualizarComisionVentaCobro;
    public JButton jButtonEliminarComisionVentaCobro;
	public JButton jButtonCancelarComisionVentaCobro;
    public JButton jButtonGuardarCambiosComisionVentaCobro;
	public JButton jButtonGuardarCambiosTablaComisionVentaCobro;
	protected JButton jButtonCerrarComisionVentaCobro;
	
	
	protected JButton jButtonProcesarInformacionComisionVentaCobro;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComisionVentaCobro;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComisionVentaCobro;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComisionVentaCobro;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionVentaCobro;
	protected JButton jButtonModificarToolBarComisionVentaCobro;
	protected JButton jButtonActualizarToolBarComisionVentaCobro;
    protected JButton jButtonEliminarToolBarComisionVentaCobro;
	protected JButton jButtonCancelarToolBarComisionVentaCobro;
    protected JButton jButtonGuardarCambiosToolBarComisionVentaCobro;
	protected JButton jButtonGuardarCambiosTablaToolBarComisionVentaCobro;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionVentaCobro;
	protected JButton jButtonCerrarToolBarComisionVentaCobro;
	
	protected JButton jButtonProcesarInformacionToolBarComisionVentaCobro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionVentaCobro;
	protected JMenuItem jMenuItemModificarComisionVentaCobro;
	protected JMenuItem jMenuItemActualizarComisionVentaCobro;
    protected JMenuItem jMenuItemEliminarComisionVentaCobro;
	protected JMenuItem jMenuItemCancelarComisionVentaCobro;
    protected JMenuItem jMenuItemGuardarCambiosComisionVentaCobro;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionVentaCobro;
	protected JMenuItem jMenuItemCerrarComisionVentaCobro;
	protected JMenuItem jMenuItemDetalleCerrarComisionVentaCobro;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionVentaCobro;
	
	protected JMenuItem jMenuItemProcesarInformacionComisionVentaCobro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionVentaCobro;
	protected JMenuItem jMenuItemMostrarOcultarComisionVentaCobro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionVentaCobro;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionVentaCobro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionVentaCobro;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComisionVentaCobro;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComisionVentaCobro;
	public JLabel jLabelIdComisionVentaCobro;
	public JLabel jLabelidComisionVentaCobro;
	public JButton jButtonidComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaComisionVentaCobro;
	public JLabel jLabelnumero_facturaComisionVentaCobro;
	public JTextField jTextFieldnumero_facturaComisionVentaCobro;
	public JButton jButtonnumero_facturaComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPanelfecha_pagoComisionVentaCobro;
	public JLabel jLabelfecha_pagoComisionVentaCobro;
	//public JFormattedTextField jDateChooserfecha_pagoComisionVentaCobro;

	public JDateChooser jDateChooserfecha_pagoComisionVentaCobro;
	public JButton jButtonfecha_pagoComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteComisionVentaCobro;
	public JLabel jLabelnombre_clienteComisionVentaCobro;
	public JTextArea jTextAreanombre_clienteComisionVentaCobro;
	public JScrollPane jscrollPanenombre_clienteComisionVentaCobro;
	public JButton jButtonnombre_clienteComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteComisionVentaCobro;
	public JLabel jLabelnumero_comprobanteComisionVentaCobro;
	public JTextField jTextFieldnumero_comprobanteComisionVentaCobro;
	public JButton jButtonnumero_comprobanteComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPanelestadoComisionVentaCobro;
	public JLabel jLabelestadoComisionVentaCobro;
	public JTextField jTextFieldestadoComisionVentaCobro;
	public JButton jButtonestadoComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPaneltotal_facturaComisionVentaCobro;
	public JLabel jLabeltotal_facturaComisionVentaCobro;
	public JTextField jTextFieldtotal_facturaComisionVentaCobro;
	public JButton jButtontotal_facturaComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPaneltotal_abonoComisionVentaCobro;
	public JLabel jLabeltotal_abonoComisionVentaCobro;
	public JTextField jTextFieldtotal_abonoComisionVentaCobro;
	public JButton jButtontotal_abonoComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_comisionComisionVentaCobro;
	public JLabel jLabelporcentaje_comisionComisionVentaCobro;
	public JTextField jTextFieldporcentaje_comisionComisionVentaCobro;
	public JButton jButtonporcentaje_comisionComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPaneltotal_comision_cobroComisionVentaCobro;
	public JLabel jLabeltotal_comision_cobroComisionVentaCobro;
	public JTextField jTextFieldtotal_comision_cobroComisionVentaCobro;
	public JButton jButtontotal_comision_cobroComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasComisionVentaCobro;
	public JLabel jLabelnumero_diasComisionVentaCobro;
	public JTextField jTextFieldnumero_diasComisionVentaCobro;
	public JButton jButtonnumero_diasComisionVentaCobroBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComisionVentaCobro;
	public JLabel jLabelid_empresaComisionVentaCobro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComisionVentaCobro;
	public JButton jButtonid_empresaComisionVentaCobro= new JButtonMe();
	public JButton jButtonid_empresaComisionVentaCobroUpdate= new JButtonMe();
	public JButton jButtonid_empresaComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioComisionVentaCobro;
	public JLabel jLabelid_ejercicioComisionVentaCobro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioComisionVentaCobro;
	public JButton jButtonid_ejercicioComisionVentaCobro= new JButtonMe();
	public JButton jButtonid_ejercicioComisionVentaCobroUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoComisionVentaCobro;
	public JLabel jLabelid_periodoComisionVentaCobro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoComisionVentaCobro;
	public JButton jButtonid_periodoComisionVentaCobro= new JButtonMe();
	public JButton jButtonid_periodoComisionVentaCobroUpdate= new JButtonMe();
	public JButton jButtonid_periodoComisionVentaCobroBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorComisionVentaCobro;
	public JLabel jLabelid_vendedorComisionVentaCobro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorComisionVentaCobro;
	public JButton jButtonid_vendedorComisionVentaCobro= new JButtonMe();
	public JButton jButtonid_vendedorComisionVentaCobroUpdate= new JButtonMe();
	public JButton jButtonid_vendedorComisionVentaCobroBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorComisionVentaCobroArbol= new JButtonMe();

	public JPanel jPanelid_facturaComisionVentaCobro;
	public JLabel jLabelid_facturaComisionVentaCobro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaComisionVentaCobro;
	public JButton jButtonid_facturaComisionVentaCobro= new JButtonMe();
	public JButton jButtonid_facturaComisionVentaCobroUpdate= new JButtonMe();
	public JButton jButtonid_facturaComisionVentaCobroBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComisionVentaCobro;
	
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
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ComisionVentaCobroDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComisionVentaCobro=new JPanel();
				this.jPanelAccionesFormularioComisionVentaCobro=new JPanel();
				this.jmenuBarDetalleComisionVentaCobro=new JMenuBar();
				this.jTtoolBarDetalleComisionVentaCobro=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionVentaCobroDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComisionVentaCobro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComisionVentaCobroDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComisionVentaCobro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionVentaCobroDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionVentaCobro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionVentaCobroDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionVentaCobro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionVentaCobroDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionVentaCobro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComisionVentaCobro() {
		return this.jButtonActualizarToolBarComisionVentaCobro;
	}
	
	public JButton getjButtonEliminarToolBarComisionVentaCobro() {
		return this.jButtonEliminarToolBarComisionVentaCobro;
	}
	
	public JButton getjButtonCancelarToolBarComisionVentaCobro() {
		return this.jButtonCancelarToolBarComisionVentaCobro;
	}		
	
	public JButton getjButtonProcesarInformacionComisionVentaCobro() {
		return this.jButtonProcesarInformacionComisionVentaCobro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionVentaCobro)	{
		this.jButtonProcesarInformacionComisionVentaCobro = jButtonProcesarInformacionComisionVentaCobro;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionVentaCobro() {
		return this.jComboBoxTiposAccionesComisionVentaCobro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionVentaCobro(
			JComboBox jComboBoxTiposRelacionesComisionVentaCobro) {
		this.jComboBoxTiposRelacionesComisionVentaCobro = jComboBoxTiposRelacionesComisionVentaCobro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionVentaCobro(
			JComboBox jComboBoxTiposAccionesComisionVentaCobro) {
		this.jComboBoxTiposAccionesComisionVentaCobro = jComboBoxTiposAccionesComisionVentaCobro;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComisionVentaCobro() {
		return this.jComboBoxTiposAccionesFormularioComisionVentaCobro;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComisionVentaCobro(
			JComboBox jComboBoxTiposAccionesFormularioComisionVentaCobro) {
		this.jComboBoxTiposAccionesFormularioComisionVentaCobro = jComboBoxTiposAccionesFormularioComisionVentaCobro;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
		
		this.comisionventacobroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionventacobroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionventacobroSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionVentaCobroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionVentaCobroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionVentaCobroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Venta Cobro MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
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
	
		ComisionVentaCobroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComisionVentaCobro= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComisionVentaCobro=new JButtonMe();
				this.jButtonModificarToolBarComisionVentaCobro=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComisionVentaCobro,this.jTtoolBarDetalleComisionVentaCobro,
							"actualizar","actualizar","Actualizar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComisionVentaCobro,this.jTtoolBarDetalleComisionVentaCobro,
							"eliminar","eliminar","Eliminar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComisionVentaCobro,this.jTtoolBarDetalleComisionVentaCobro,
							"cancelar","cancelar","Cancelar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComisionVentaCobro,this.jTtoolBarDetalleComisionVentaCobro,
							"guardarcambios","guardarcambios","Guardar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComisionVentaCobro=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComisionVentaCobro=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComisionVentaCobro=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComisionVentaCobro=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComisionVentaCobro=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionVentaCobro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionVentaCobro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionVentaCobro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComisionVentaCobro= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComisionVentaCobro.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComisionVentaCobro,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComisionVentaCobro= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComisionVentaCobro.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComisionVentaCobro,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComisionVentaCobro= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComisionVentaCobro.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComisionVentaCobro,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComisionVentaCobro= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComisionVentaCobro.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComisionVentaCobro,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComisionVentaCobro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionVentaCobro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionVentaCobro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionVentaCobro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionVentaCobro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionVentaCobro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComisionVentaCobro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComisionVentaCobro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComisionVentaCobro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionVentaCobro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionVentaCobro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionVentaCobro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionVentaCobro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionVentaCobro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionVentaCobro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComisionVentaCobro.add(this.jMenuItemDetalleCerrarComisionVentaCobro);
		
		this.jmenuDetalleAccionesComisionVentaCobro.add(this.jMenuItemActualizarComisionVentaCobro);
		this.jmenuDetalleAccionesComisionVentaCobro.add(this.jMenuItemEliminarComisionVentaCobro);
		this.jmenuDetalleAccionesComisionVentaCobro.add(this.jMenuItemCancelarComisionVentaCobro);		
		
		//this.jmenuDetalleDatosComisionVentaCobro.add(this.jMenuItemDetalleAbrirOrderByComisionVentaCobro);				
		this.jmenuDetalleDatosComisionVentaCobro.add(this.jMenuItemDetalleMostarOcultarComisionVentaCobro);				
				
		//this.jmenuDetalleAccionesComisionVentaCobro.add(this.jMenuItemGuardarCambiosComisionVentaCobro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComisionVentaCobro.add(this.jmenuDetalleArchivoComisionVentaCobro);		
		this.jmenuBarDetalleComisionVentaCobro.add(this.jmenuDetalleAccionesComisionVentaCobro);		
		this.jmenuBarDetalleComisionVentaCobro.add(this.jmenuDetalleDatosComisionVentaCobro);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComisionVentaCobro);				
	}
	
	
	public void inicializarElementosCamposComisionVentaCobro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComisionVentaCobro = new JLabelMe();
		jLabelIdComisionVentaCobro.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComisionVentaCobro = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComisionVentaCobro= new GridBagLayout();

		this.jPanelidComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);

		jLabelidComisionVentaCobro = new JLabel();
		jLabelidComisionVentaCobro.setText("Id");

		jLabelidComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_facturaComisionVentaCobro = new JLabelMe();
		this.jLabelnumero_facturaComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaComisionVentaCobro.setToolTipText("Nro Factura");
		this.jLabelnumero_facturaComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelnumero_facturaComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jTextFieldnumero_facturaComisionVentaCobro= new JTextFieldMe();

		jTextFieldnumero_facturaComisionVentaCobro.setEnabled(false);
		jTextFieldnumero_facturaComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonnumero_facturaComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaComisionVentaCobroBusqueda.setText("U");
		this.jButtonnumero_facturaComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaComisionVentaCobroBusqueda.setVisible(false);		}


					
		this.jLabelfecha_pagoComisionVentaCobro = new JLabelMe();
		this.jLabelfecha_pagoComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO+" : *");
		this.jLabelfecha_pagoComisionVentaCobro.setToolTipText("Fecha Pago");
		this.jLabelfecha_pagoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_pagoComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_pagoComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_pagoComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelfecha_pagoComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		//jFormattedTextFieldfecha_pagoComisionVentaCobro= new JFormattedTextFieldMe();

		jDateChooserfecha_pagoComisionVentaCobro= new JDateChooser();
		jDateChooserfecha_pagoComisionVentaCobro.setEnabled(false);
		jDateChooserfecha_pagoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pagoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pagoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_pagoComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_pagoComisionVentaCobro.setDate(new Date());
		jDateChooserfecha_pagoComisionVentaCobro.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_pagoComisionVentaCobro.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_pagoComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonfecha_pagoComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_pagoComisionVentaCobroBusqueda.setText("U");
		this.jButtonfecha_pagoComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_pagoComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_pagoComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_pagoComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_pagoComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_pagoComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_pagoComisionVentaCobroBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteComisionVentaCobro = new JLabelMe();
		this.jLabelnombre_clienteComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteComisionVentaCobro.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelnombre_clienteComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jTextAreanombre_clienteComisionVentaCobro= new JTextAreaMe();
		jTextAreanombre_clienteComisionVentaCobro.setEnabled(false);
		jTextAreanombre_clienteComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComisionVentaCobro.setLineWrap(true);
		jTextAreanombre_clienteComisionVentaCobro.setWrapStyleWord(true);
		jTextAreanombre_clienteComisionVentaCobro.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteComisionVentaCobro.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteComisionVentaCobro = new JScrollPane(jTextAreanombre_clienteComisionVentaCobro);
		jscrollPanenombre_clienteComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_clienteComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_clienteComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_clienteComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonnombre_clienteComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteComisionVentaCobroBusqueda.setText("U");
		this.jButtonnombre_clienteComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteComisionVentaCobroBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteComisionVentaCobro = new JLabelMe();
		this.jLabelnumero_comprobanteComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteComisionVentaCobro.setToolTipText("Nro Comprobante");
		this.jLabelnumero_comprobanteComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelnumero_comprobanteComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jTextFieldnumero_comprobanteComisionVentaCobro= new JTextFieldMe();

		jTextFieldnumero_comprobanteComisionVentaCobro.setEnabled(false);
		jTextFieldnumero_comprobanteComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteComisionVentaCobroBusqueda.setText("U");
		this.jButtonnumero_comprobanteComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteComisionVentaCobroBusqueda.setVisible(false);		}


					
		this.jLabelestadoComisionVentaCobro = new JLabelMe();
		this.jLabelestadoComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoComisionVentaCobro.setToolTipText("Estado");
		this.jLabelestadoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelestadoComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jTextFieldestadoComisionVentaCobro= new JTextFieldMe();

		jTextFieldestadoComisionVentaCobro.setEnabled(false);
		jTextFieldestadoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldestadoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldestadoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldestadoComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonestadoComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoComisionVentaCobroBusqueda.setText("U");
		this.jButtonestadoComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldestadoComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldestadoComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoComisionVentaCobroBusqueda.setVisible(false);		}


					
		this.jLabeltotal_facturaComisionVentaCobro = new JLabelMe();
		this.jLabeltotal_facturaComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA+" : *");
		this.jLabeltotal_facturaComisionVentaCobro.setToolTipText("Total Factura");
		this.jLabeltotal_facturaComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_facturaComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_facturaComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_facturaComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_facturaComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_facturaComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPaneltotal_facturaComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jTextFieldtotal_facturaComisionVentaCobro= new JTextFieldMe();
		jTextFieldtotal_facturaComisionVentaCobro.setEnabled(false);
		jTextFieldtotal_facturaComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_facturaComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_facturaComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_facturaComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_facturaComisionVentaCobro.setText("0.0");

		this.jButtontotal_facturaComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtontotal_facturaComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_facturaComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_facturaComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_facturaComisionVentaCobroBusqueda.setText("U");
		this.jButtontotal_facturaComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_facturaComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_facturaComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_facturaComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_facturaComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_facturaComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_facturaComisionVentaCobroBusqueda.setVisible(false);		}


					
		this.jLabeltotal_abonoComisionVentaCobro = new JLabelMe();
		this.jLabeltotal_abonoComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO+" : *");
		this.jLabeltotal_abonoComisionVentaCobro.setToolTipText("Total Abono");
		this.jLabeltotal_abonoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_abonoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_abonoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_abonoComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_abonoComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_abonoComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPaneltotal_abonoComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jTextFieldtotal_abonoComisionVentaCobro= new JTextFieldMe();
		jTextFieldtotal_abonoComisionVentaCobro.setEnabled(false);
		jTextFieldtotal_abonoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_abonoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_abonoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_abonoComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_abonoComisionVentaCobro.setText("0.0");

		this.jButtontotal_abonoComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtontotal_abonoComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_abonoComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_abonoComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_abonoComisionVentaCobroBusqueda.setText("U");
		this.jButtontotal_abonoComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_abonoComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_abonoComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_abonoComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_abonoComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_abonoComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_abonoComisionVentaCobroBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_comisionComisionVentaCobro = new JLabelMe();
		this.jLabelporcentaje_comisionComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION+" : *");
		this.jLabelporcentaje_comisionComisionVentaCobro.setToolTipText("% Comision");
		this.jLabelporcentaje_comisionComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_comisionComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_comisionComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_comisionComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_comisionComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_comisionComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelporcentaje_comisionComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jTextFieldporcentaje_comisionComisionVentaCobro= new JTextFieldMe();
		jTextFieldporcentaje_comisionComisionVentaCobro.setEnabled(false);
		jTextFieldporcentaje_comisionComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_comisionComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_comisionComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_comisionComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_comisionComisionVentaCobro.setText("0.0");

		this.jButtonporcentaje_comisionComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonporcentaje_comisionComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_comisionComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_comisionComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_comisionComisionVentaCobroBusqueda.setText("U");
		this.jButtonporcentaje_comisionComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_comisionComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_comisionComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_comisionComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_comisionComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_comisionComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_comisionComisionVentaCobroBusqueda.setVisible(false);		}


					
		this.jLabeltotal_comision_cobroComisionVentaCobro = new JLabelMe();
		this.jLabeltotal_comision_cobroComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO+" : *");
		this.jLabeltotal_comision_cobroComisionVentaCobro.setToolTipText("Total Comision Cobro");
		this.jLabeltotal_comision_cobroComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_comision_cobroComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_comision_cobroComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_comision_cobroComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_comision_cobroComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_comision_cobroComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPaneltotal_comision_cobroComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jTextFieldtotal_comision_cobroComisionVentaCobro= new JTextFieldMe();
		jTextFieldtotal_comision_cobroComisionVentaCobro.setEnabled(false);
		jTextFieldtotal_comision_cobroComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_comision_cobroComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_comision_cobroComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_comision_cobroComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_comision_cobroComisionVentaCobro.setText("0.0");

		this.jButtontotal_comision_cobroComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtontotal_comision_cobroComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_comision_cobroComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_comision_cobroComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_comision_cobroComisionVentaCobroBusqueda.setText("U");
		this.jButtontotal_comision_cobroComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_comision_cobroComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_comision_cobroComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_comision_cobroComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_comision_cobroComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_comision_cobroComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_comision_cobroComisionVentaCobroBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasComisionVentaCobro = new JLabelMe();
		this.jLabelnumero_diasComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasComisionVentaCobro.setToolTipText("Nro Dias");
		this.jLabelnumero_diasComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelnumero_diasComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jTextFieldnumero_diasComisionVentaCobro= new JTextFieldMe();
		jTextFieldnumero_diasComisionVentaCobro.setEnabled(false);
		jTextFieldnumero_diasComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasComisionVentaCobro.setText("0");

		this.jButtonnumero_diasComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonnumero_diasComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasComisionVentaCobroBusqueda.setText("U");
		this.jButtonnumero_diasComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasComisionVentaCobroBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComisionVentaCobro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComisionVentaCobro = new JLabelMe();
		this.jLabelid_empresaComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComisionVentaCobro.setToolTipText("Empresa");
		this.jLabelid_empresaComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelid_empresaComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jComboBoxid_empresaComisionVentaCobro= new JComboBoxMe();
		jComboBoxid_empresaComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComisionVentaCobro.setEnabled(false);

		this.jButtonid_empresaComisionVentaCobro= new JButtonMe();
		this.jButtonid_empresaComisionVentaCobro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionVentaCobro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionVentaCobro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionVentaCobro.setText("Buscar");
		this.jButtonid_empresaComisionVentaCobro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComisionVentaCobro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionVentaCobro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionVentaCobro"));

		this.jButtonid_empresaComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonid_empresaComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionVentaCobroBusqueda.setText("U");
		this.jButtonid_empresaComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComisionVentaCobroBusqueda.setVisible(false);		}

		this.jButtonid_empresaComisionVentaCobroUpdate= new JButtonMe();
		this.jButtonid_empresaComisionVentaCobroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionVentaCobroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionVentaCobroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionVentaCobroUpdate.setText("U");
		this.jButtonid_empresaComisionVentaCobroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComisionVentaCobroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionVentaCobroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionVentaCobroUpdate"));



					
		this.jLabelid_ejercicioComisionVentaCobro = new JLabelMe();
		this.jLabelid_ejercicioComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioComisionVentaCobro.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelid_ejercicioComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jComboBoxid_ejercicioComisionVentaCobro= new JComboBoxMe();
		jComboBoxid_ejercicioComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ejercicioComisionVentaCobro= new JButtonMe();
		this.jButtonid_ejercicioComisionVentaCobro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioComisionVentaCobro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioComisionVentaCobro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioComisionVentaCobro.setText("Buscar");
		this.jButtonid_ejercicioComisionVentaCobro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioComisionVentaCobro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioComisionVentaCobro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioComisionVentaCobro"));

		this.jButtonid_ejercicioComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonid_ejercicioComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioComisionVentaCobroBusqueda.setText("U");
		this.jButtonid_ejercicioComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioComisionVentaCobroBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioComisionVentaCobroUpdate= new JButtonMe();
		this.jButtonid_ejercicioComisionVentaCobroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComisionVentaCobroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComisionVentaCobroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioComisionVentaCobroUpdate.setText("U");
		this.jButtonid_ejercicioComisionVentaCobroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioComisionVentaCobroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioComisionVentaCobroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioComisionVentaCobroUpdate"));



					
		this.jLabelid_periodoComisionVentaCobro = new JLabelMe();
		this.jLabelid_periodoComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoComisionVentaCobro.setToolTipText("Periodo");
		this.jLabelid_periodoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelid_periodoComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jComboBoxid_periodoComisionVentaCobro= new JComboBoxMe();
		jComboBoxid_periodoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodoComisionVentaCobro= new JButtonMe();
		this.jButtonid_periodoComisionVentaCobro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoComisionVentaCobro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoComisionVentaCobro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoComisionVentaCobro.setText("Buscar");
		this.jButtonid_periodoComisionVentaCobro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoComisionVentaCobro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoComisionVentaCobro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoComisionVentaCobro"));

		this.jButtonid_periodoComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonid_periodoComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoComisionVentaCobroBusqueda.setText("U");
		this.jButtonid_periodoComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoComisionVentaCobroBusqueda.setVisible(false);		}

		this.jButtonid_periodoComisionVentaCobroUpdate= new JButtonMe();
		this.jButtonid_periodoComisionVentaCobroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoComisionVentaCobroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoComisionVentaCobroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoComisionVentaCobroUpdate.setText("U");
		this.jButtonid_periodoComisionVentaCobroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoComisionVentaCobroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoComisionVentaCobroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoComisionVentaCobroUpdate"));



					
		this.jLabelid_vendedorComisionVentaCobro = new JLabelMe();
		this.jLabelid_vendedorComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorComisionVentaCobro.setToolTipText("Vendedor");
		this.jLabelid_vendedorComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelid_vendedorComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jComboBoxid_vendedorComisionVentaCobro= new JComboBoxMe();
		jComboBoxid_vendedorComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorComisionVentaCobro= new JButtonMe();
		this.jButtonid_vendedorComisionVentaCobro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionVentaCobro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionVentaCobro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionVentaCobro.setText("Buscar");
		this.jButtonid_vendedorComisionVentaCobro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorComisionVentaCobro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionVentaCobro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionVentaCobro"));

		this.jButtonid_vendedorComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonid_vendedorComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComisionVentaCobroBusqueda.setText("U");
		this.jButtonid_vendedorComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorComisionVentaCobroBusqueda.setVisible(false);		}

		this.jButtonid_vendedorComisionVentaCobroUpdate= new JButtonMe();
		this.jButtonid_vendedorComisionVentaCobroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionVentaCobroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionVentaCobroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComisionVentaCobroUpdate.setText("U");
		this.jButtonid_vendedorComisionVentaCobroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorComisionVentaCobroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionVentaCobroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionVentaCobroUpdate"));


		jButtonid_vendedorComisionVentaCobroArbol= new JButtonMe();
		jButtonid_vendedorComisionVentaCobroArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionVentaCobroArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionVentaCobroArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionVentaCobroArbol.setText("Arbol");
		jButtonid_vendedorComisionVentaCobroArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorComisionVentaCobroArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionVentaCobroArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionVentaCobroArbol"));



					
		this.jLabelid_facturaComisionVentaCobro = new JLabelMe();
		this.jLabelid_facturaComisionVentaCobro.setText(""+ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaComisionVentaCobro.setToolTipText("Factura");
		this.jLabelid_facturaComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaComisionVentaCobro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaComisionVentaCobro.setToolTipText(ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		this.jPanelid_facturaComisionVentaCobro.setLayout(this.gridaBagLayoutComisionVentaCobro);


		jComboBoxid_facturaComisionVentaCobro= new JComboBoxMe();
		jComboBoxid_facturaComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaComisionVentaCobro= new JButtonMe();
		this.jButtonid_facturaComisionVentaCobro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaComisionVentaCobro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaComisionVentaCobro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaComisionVentaCobro.setText("Buscar");
		this.jButtonid_facturaComisionVentaCobro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaComisionVentaCobro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaComisionVentaCobro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaComisionVentaCobro"));

		this.jButtonid_facturaComisionVentaCobroBusqueda= new JButtonMe();
		this.jButtonid_facturaComisionVentaCobroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaComisionVentaCobroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaComisionVentaCobroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaComisionVentaCobroBusqueda.setText("U");
		this.jButtonid_facturaComisionVentaCobroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaComisionVentaCobroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaComisionVentaCobroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaComisionVentaCobroBusqueda"));

		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaComisionVentaCobroBusqueda.setVisible(false);		}

		this.jButtonid_facturaComisionVentaCobroUpdate= new JButtonMe();
		this.jButtonid_facturaComisionVentaCobroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaComisionVentaCobroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaComisionVentaCobroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaComisionVentaCobroUpdate.setText("U");
		this.jButtonid_facturaComisionVentaCobroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaComisionVentaCobroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaComisionVentaCobroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaComisionVentaCobroUpdate"));



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
		//this.jInternalFrameDetalleComisionVentaCobro = new ComisionVentaCobroBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comision Venta Cobro DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionVentaCobro= new GridBagLayout();
		

		
		String sToolTipComisionVentaCobro="";
		sToolTipComisionVentaCobro=ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionVentaCobro+="(Comisiones.ComisionVentaCobro)";
		}
		
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionVentaCobro+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComisionVentaCobro = new JButtonMe();
		this.jButtonModificarComisionVentaCobro = new JButtonMe();
        this.jButtonActualizarComisionVentaCobro = new JButtonMe();
        this.jButtonEliminarComisionVentaCobro = new JButtonMe();
        this.jButtonCancelarComisionVentaCobro = new JButtonMe();
        this.jButtonGuardarCambiosComisionVentaCobro = new JButtonMe();
		this.jButtonGuardarCambiosTablaComisionVentaCobro = new JButtonMe();
		this.jButtonCerrarComisionVentaCobro = new JButtonMe();
		
		this.jScrollPanelDatosComisionVentaCobro = new JScrollPane();   
        this.jScrollPanelDatosEdicionComisionVentaCobro = new JScrollPane();
		this.jScrollPanelDatosGeneralComisionVentaCobro = new JScrollPane();
				
		
		
		this.jPanelCamposComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Comision Venta Cobro";
		
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Venta Cobroes" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionVentaCobro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComisionVentaCobro.setName("jPanelCamposComisionVentaCobro"); 

		this.jPanelCamposOcultosComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComisionVentaCobro.setName("jPanelCamposOcultosComisionVentaCobro"); 

        this.jPanelAccionesComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionVentaCobro.setToolTipText("Acciones");
        this.jPanelAccionesComisionVentaCobro.setName("Acciones"); 

		this.jPanelAccionesFormularioComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComisionVentaCobro.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComisionVentaCobro.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralComisionVentaCobro.setName("jPanelCamposFingeneralComisionVentaCobro");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresComisionVentaCobro.setName("jPanelCamposFinvaloresComisionVentaCobro");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComisionVentaCobro.setText("Nuevo");
		this.jButtonModificarComisionVentaCobro.setText("Editar");
        this.jButtonActualizarComisionVentaCobro.setText("Actualizar");
        this.jButtonEliminarComisionVentaCobro.setText("Eliminar");
        this.jButtonCancelarComisionVentaCobro.setText("Cancelar");
        this.jButtonGuardarCambiosComisionVentaCobro.setText("Guardar");
		this.jButtonGuardarCambiosTablaComisionVentaCobro.setText("Guardar");
		this.jButtonCerrarComisionVentaCobro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionVentaCobro,"nuevo_button","Nuevo",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComisionVentaCobro,"modificar_button","Editar",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComisionVentaCobro,"actualizar_button","Actualizar",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComisionVentaCobro,"eliminar_button","Eliminar",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComisionVentaCobro,"cancelar_button","Cancelar",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComisionVentaCobro,"guardarcambios_button","Guardar",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionVentaCobro,"guardarcambiostabla_button","Guardar",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionVentaCobro,"cerrar_button","Salir",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComisionVentaCobro.setToolTipText("Nuevo"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComisionVentaCobro.setToolTipText("Editar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComisionVentaCobro.setToolTipText("Actualizar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComisionVentaCobro.setToolTipText("Eliminar)"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComisionVentaCobro.setToolTipText("Cancelar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComisionVentaCobro.setToolTipText("Guardar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComisionVentaCobro.setToolTipText("Guardar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionVentaCobro.setToolTipText("Salir"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionVentaCobro";
		inputMap = this.jButtonNuevoComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionVentaCobro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionVentaCobro"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComisionVentaCobro";
		inputMap = this.jButtonActualizarComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComisionVentaCobro"));
		
		//ELIMINAR
		sMapKey = "EliminarComisionVentaCobro";
		inputMap = this.jButtonEliminarComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComisionVentaCobro"));
		
		//CANCELAR	
		sMapKey = "CancelarComisionVentaCobro";
		inputMap = this.jButtonCancelarComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComisionVentaCobro"));
		
		//CERRAR		
		sMapKey = "CerrarComisionVentaCobro";
		inputMap = this.jButtonCerrarComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionVentaCobro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionVentaCobro";
		inputMap = this.jButtonGuardarCambiosTablaComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionVentaCobro"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComisionVentaCobro = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComisionVentaCobro.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComisionVentaCobro.setToolTipText("Nuevo ComisionVentaCobro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComisionVentaCobro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComisionVentaCobro.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComisionVentaCobro.setToolTipText("Sin Cerrar Ventana ComisionVentaCobro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComisionVentaCobro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComisionVentaCobro.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComisionVentaCobro.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionVentaCobro.setText("Accion");
		this.jComboBoxTiposAccionesComisionVentaCobro.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComisionVentaCobro.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComisionVentaCobro.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComisionVentaCobro = new JLabelMe();
		
		this.jLabelAccionesComisionVentaCobro.setText("Acciones");		
		this.jLabelAccionesComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComisionVentaCobro();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComisionVentaCobro();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComisionVentaCobro=new JTabbedPane();
		this.jTabbedPaneRelacionesComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComisionVentaCobro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionVentaCobro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionVentaCobro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComisionVentaCobro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionVentaCobro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionVentaCobro.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComisionVentaCobro = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComisionVentaCobro = new GridBagLayout();
		
		this.jPanelCamposComisionVentaCobro.setLayout(gridaBagLayoutCamposComisionVentaCobro);
		this.jPanelCamposOcultosComisionVentaCobro.setLayout(gridaBagLayoutCamposOcultosComisionVentaCobro);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralComisionVentaCobro= new GridBagLayout();
		this.jPanelCamposIniciogeneralComisionVentaCobro.setLayout(gridaBagLayoutCamposIniciogeneralComisionVentaCobro);

		GridBagLayout gridaBagLayoutCamposIniciovaloresComisionVentaCobro= new GridBagLayout();
		this.jPanelCamposIniciovaloresComisionVentaCobro.setLayout(gridaBagLayoutCamposIniciovaloresComisionVentaCobro);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComisionVentaCobro.add(jLabelIdComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComisionVentaCobro.add(jLabelidComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComisionVentaCobro.add(jLabelid_empresaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionVentaCobro.add(jButtonid_empresaComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 3;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionVentaCobro.add(jButtonid_empresaComisionVentaCobroUpdate, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComisionVentaCobro.add(jComboBoxid_empresaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioComisionVentaCobro.add(jLabelid_ejercicioComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioComisionVentaCobro.add(jButtonid_ejercicioComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 3;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioComisionVentaCobro.add(jButtonid_ejercicioComisionVentaCobroUpdate, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioComisionVentaCobro.add(jComboBoxid_ejercicioComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoComisionVentaCobro.add(jLabelid_periodoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoComisionVentaCobro.add(jButtonid_periodoComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 3;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoComisionVentaCobro.add(jButtonid_periodoComisionVentaCobroUpdate, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoComisionVentaCobro.add(jComboBoxid_periodoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorComisionVentaCobro.add(jLabelid_vendedorComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComisionVentaCobro.add(jButtonid_vendedorComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 3;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComisionVentaCobro.add(jButtonid_vendedorComisionVentaCobroUpdate, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorComisionVentaCobro.add(jComboBoxid_vendedorComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaComisionVentaCobro.add(jLabelid_facturaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 2;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaComisionVentaCobro.add(jButtonid_facturaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 3;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaComisionVentaCobro.add(jButtonid_facturaComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 4;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaComisionVentaCobro.add(jButtonid_facturaComisionVentaCobroUpdate, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaComisionVentaCobro.add(jComboBoxid_facturaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaComisionVentaCobro.add(jLabelnumero_facturaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaComisionVentaCobro.add(jButtonnumero_facturaComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaComisionVentaCobro.add(jTextFieldnumero_facturaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_pagoComisionVentaCobro.add(jLabelfecha_pagoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_pagoComisionVentaCobro.add(jButtonfecha_pagoComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_pagoComisionVentaCobro.add(jDateChooserfecha_pagoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteComisionVentaCobro.add(jLabelnombre_clienteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteComisionVentaCobro.add(jButtonnombre_clienteComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteComisionVentaCobro.add(jscrollPanenombre_clienteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteComisionVentaCobro.add(jLabelnumero_comprobanteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteComisionVentaCobro.add(jButtonnumero_comprobanteComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteComisionVentaCobro.add(jTextFieldnumero_comprobanteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoComisionVentaCobro.add(jLabelestadoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoComisionVentaCobro.add(jButtonestadoComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoComisionVentaCobro.add(jTextFieldestadoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_facturaComisionVentaCobro.add(jLabeltotal_facturaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_facturaComisionVentaCobro.add(jButtontotal_facturaComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_facturaComisionVentaCobro.add(jTextFieldtotal_facturaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_abonoComisionVentaCobro.add(jLabeltotal_abonoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_abonoComisionVentaCobro.add(jButtontotal_abonoComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_abonoComisionVentaCobro.add(jTextFieldtotal_abonoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_comisionComisionVentaCobro.add(jLabelporcentaje_comisionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_comisionComisionVentaCobro.add(jButtonporcentaje_comisionComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_comisionComisionVentaCobro.add(jTextFieldporcentaje_comisionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_comision_cobroComisionVentaCobro.add(jLabeltotal_comision_cobroComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_comision_cobroComisionVentaCobro.add(jButtontotal_comision_cobroComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_comision_cobroComisionVentaCobro.add(jTextFieldtotal_comision_cobroComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasComisionVentaCobro.add(jLabelnumero_diasComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 2;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
		this.gridBagConstraintsComisionVentaCobro.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasComisionVentaCobro.add(jButtonnumero_diasComisionVentaCobroBusqueda, this.gridBagConstraintsComisionVentaCobro);
	}

	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionVentaCobro.gridy = 0;
	this.gridBagConstraintsComisionVentaCobro.gridx = 1;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasComisionVentaCobro.add(jTextFieldnumero_diasComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposOcultosComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposOcultosComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComisionVentaCobro.add(this.jPanelid_empresaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposOcultosComisionVentaCobro % 2==0) {
		iXPanelCamposOcultosComisionVentaCobro=0;
		iYPanelCamposOcultosComisionVentaCobro++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciogeneralComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciogeneralComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralComisionVentaCobro.add(this.jPanelidComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciogeneralComisionVentaCobro % 2==0) {
		iXPanelCamposIniciogeneralComisionVentaCobro=0;
		iYPanelCamposIniciogeneralComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciogeneralComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciogeneralComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralComisionVentaCobro.add(this.jPanelid_ejercicioComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciogeneralComisionVentaCobro % 2==0) {
		iXPanelCamposIniciogeneralComisionVentaCobro=0;
		iYPanelCamposIniciogeneralComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciogeneralComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciogeneralComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralComisionVentaCobro.add(this.jPanelid_periodoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciogeneralComisionVentaCobro % 2==0) {
		iXPanelCamposIniciogeneralComisionVentaCobro=0;
		iYPanelCamposIniciogeneralComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciogeneralComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciogeneralComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralComisionVentaCobro.add(this.jPanelid_vendedorComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciogeneralComisionVentaCobro % 2==0) {
		iXPanelCamposIniciogeneralComisionVentaCobro=0;
		iYPanelCamposIniciogeneralComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciogeneralComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciogeneralComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralComisionVentaCobro.add(this.jPanelid_facturaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciogeneralComisionVentaCobro % 2==0) {
		iXPanelCamposIniciogeneralComisionVentaCobro=0;
		iYPanelCamposIniciogeneralComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciogeneralComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciogeneralComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralComisionVentaCobro.add(this.jPanelnumero_facturaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciogeneralComisionVentaCobro % 2==0) {
		iXPanelCamposIniciogeneralComisionVentaCobro=0;
		iYPanelCamposIniciogeneralComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciogeneralComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciogeneralComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralComisionVentaCobro.add(this.jPanelfecha_pagoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciogeneralComisionVentaCobro % 2==0) {
		iXPanelCamposIniciogeneralComisionVentaCobro=0;
		iYPanelCamposIniciogeneralComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciogeneralComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciogeneralComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralComisionVentaCobro.add(this.jPanelnombre_clienteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciogeneralComisionVentaCobro % 2==0) {
		iXPanelCamposIniciogeneralComisionVentaCobro=0;
		iYPanelCamposIniciogeneralComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciogeneralComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciogeneralComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralComisionVentaCobro.add(this.jPanelnumero_comprobanteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciogeneralComisionVentaCobro % 2==0) {
		iXPanelCamposIniciogeneralComisionVentaCobro=0;
		iYPanelCamposIniciogeneralComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciogeneralComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciogeneralComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralComisionVentaCobro.add(this.jPanelestadoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciogeneralComisionVentaCobro % 2==0) {
		iXPanelCamposIniciogeneralComisionVentaCobro=0;
		iYPanelCamposIniciogeneralComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciovaloresComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciovaloresComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresComisionVentaCobro.add(this.jPaneltotal_facturaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciovaloresComisionVentaCobro % 1==0) {
		iXPanelCamposIniciovaloresComisionVentaCobro=0;
		iYPanelCamposIniciovaloresComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciovaloresComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciovaloresComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresComisionVentaCobro.add(this.jPaneltotal_abonoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciovaloresComisionVentaCobro % 1==0) {
		iXPanelCamposIniciovaloresComisionVentaCobro=0;
		iYPanelCamposIniciovaloresComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciovaloresComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciovaloresComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresComisionVentaCobro.add(this.jPanelporcentaje_comisionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciovaloresComisionVentaCobro % 1==0) {
		iXPanelCamposIniciovaloresComisionVentaCobro=0;
		iYPanelCamposIniciovaloresComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciovaloresComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciovaloresComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresComisionVentaCobro.add(this.jPaneltotal_comision_cobroComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciovaloresComisionVentaCobro % 1==0) {
		iXPanelCamposIniciovaloresComisionVentaCobro=0;
		iYPanelCamposIniciovaloresComisionVentaCobro++;
	}
	this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionVentaCobro.gridy = iYPanelCamposIniciovaloresComisionVentaCobro;
	this.gridBagConstraintsComisionVentaCobro.gridx = iXPanelCamposIniciovaloresComisionVentaCobro++;
	this.gridBagConstraintsComisionVentaCobro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionVentaCobro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresComisionVentaCobro.add(this.jPanelnumero_diasComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);



	if(iXPanelCamposIniciovaloresComisionVentaCobro % 1==0) {
		iXPanelCamposIniciovaloresComisionVentaCobro=0;
		iYPanelCamposIniciovaloresComisionVentaCobro++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesComisionVentaCobro= new GridBagLayout();
		this.jPanelAccionesComisionVentaCobro.setLayout(gridaBagLayoutAccionesComisionVentaCobro);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComisionVentaCobro= new GridBagLayout();
		this.jPanelAccionesFormularioComisionVentaCobro.setLayout(gridaBagLayoutAccionesFormularioComisionVentaCobro);
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionVentaCobro.add(this.jComboBoxTiposAccionesFormularioComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionVentaCobro.add(this.jCheckBoxPostAccionNuevoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionVentaCobro.add(this.jCheckBoxPostAccionSinCerrarComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionVentaCobro.add(this.jCheckBoxPostAccionSinMensajeComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccion++;
			
		this.jPanelAccionesComisionVentaCobro.add(this.jButtonModificarComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);							

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx =iPosXAccion++;
			
		this.jPanelAccionesComisionVentaCobro.add(this.jButtonEliminarComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
			
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionVentaCobro.add(this.jButtonActualizarComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionVentaCobro.add(this.jButtonGuardarCambiosComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);	
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;		
		this.gridBagConstraintsComisionVentaCobro.gridx =iPosXAccion++;
		
		this.jPanelAccionesComisionVentaCobro.add(this.jButtonCancelarComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionVentaCobro);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();						
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionVentaCobro.gridx = 0;		
			//this.gridBagConstraintsComisionVentaCobro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionVentaCobro.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionVentaCobro.gridx =0;
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionVentaCobro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComisionVentaCobroJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComisionVentaCobro = new ComisionVentaCobroBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comision Venta Cobro DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comision Venta Cobro DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Venta Cobro Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComisionVentaCobroModel comisionventacobroModel=new ComisionVentaCobroModel(this);
			
			//SI USARA CLASE INTERNA
			//ComisionVentaCobroModel.ComisionVentaCobroFocusTraversalPolicy comisionventacobroFocusTraversalPolicy = comisionventacobroModel.new ComisionVentaCobroFocusTraversalPolicy(this);
			
			//comisionventacobroFocusTraversalPolicy.setcomisionventacobroJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comisionventacobroModel);
			
			
			this.jContentPaneDetalleComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComisionVentaCobro = new GridBagLayout();	
			this.jContentPaneDetalleComisionVentaCobro.setLayout(gridaBagLayoutDetalleComisionVentaCobro);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionVentaCobro = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
				this.gridBagConstraintsComisionVentaCobro.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComisionVentaCobro.gridx = 0;
					
				
				this.jContentPaneDetalleComisionVentaCobro.add(jTtoolBarDetalleComisionVentaCobro, gridBagConstraintsComisionVentaCobro);								
				
}
			
			this.jScrollPanelDatosEdicionComisionVentaCobro=   new JScrollPane(jContentPaneDetalleComisionVentaCobro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionVentaCobro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionVentaCobro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionVentaCobro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComisionVentaCobro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionVentaCobro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionVentaCobro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionVentaCobro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsComisionVentaCobro.gridy = iGridyRelaciones++;
		this.gridBagConstraintsComisionVentaCobro.gridx = 0;

		this.jContentPaneDetalleComisionVentaCobro.add(jPanelCamposIniciogeneralComisionVentaCobro, gridBagConstraintsComisionVentaCobro);


		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsComisionVentaCobro.gridy = iGridyRelaciones++;
		this.gridBagConstraintsComisionVentaCobro.gridx = 0;

		this.jContentPaneDetalleComisionVentaCobro.add(jPanelCamposIniciovaloresComisionVentaCobro, gridBagConstraintsComisionVentaCobro);
			
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
						&& comisionventacobroSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comisionventacobroSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComisionVentaCobro= new GridBagConstraints();
						this.gridBagConstraintsComisionVentaCobro.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComisionVentaCobro.gridx = 0;
						this.jContentPaneDetalleComisionVentaCobro.add(this.jTabbedPaneRelacionesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComisionVentaCobro.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComisionVentaCobro.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
					this.gridBagConstraintsComisionVentaCobro.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComisionVentaCobro.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComisionVentaCobro.gridx = 0;
					
				
					this.jContentPaneDetalleComisionVentaCobro.add(jPanelCamposOcultosComisionVentaCobro, gridBagConstraintsComisionVentaCobro);
				
					this.jPanelCamposOcultosComisionVentaCobro.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	        this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComisionVentaCobro.add(this.jPanelAccionesFormularioComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);							
			
			
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
	        this.gridBagConstraintsComisionVentaCobro.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComisionVentaCobro.gridx = 0;
	        
			
			this.jContentPaneDetalleComisionVentaCobro.add(this.jPanelAccionesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComisionVentaCobro);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComisionVentaCobro=   new JScrollPane(this.jPanelCamposComisionVentaCobro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionVentaCobro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionVentaCobro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionVentaCobro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComisionVentaCobro.gridx = 0;
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComisionVentaCobro.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionVentaCobro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);			
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionVentaCobro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionVentaCobro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			
			
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionVentaCobro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
			
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionVentaCobro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComisionVentaCobro;//jContentPane;
		
		return jScrollPanelDatosEdicionComisionVentaCobro;
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
