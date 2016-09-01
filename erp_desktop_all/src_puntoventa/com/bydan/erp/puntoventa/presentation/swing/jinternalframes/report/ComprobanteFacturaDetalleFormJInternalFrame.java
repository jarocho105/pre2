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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.ComprobanteFacturaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class ComprobanteFacturaDetalleFormJInternalFrame extends ComprobanteFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComprobanteFactura;
	
	protected JMenuBar jmenuBarDetalleComprobanteFactura;
	
	protected JMenu jmenuDetalleComprobanteFactura;
	protected JMenu jmenuDetalleArchivoComprobanteFactura;
	protected JMenu jmenuDetalleAccionesComprobanteFactura;
	protected JMenu jmenuDetalleDatosComprobanteFactura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComprobanteFactura;	
	protected GridBagConstraints gridBagConstraintsComprobanteFactura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComprobanteFacturaBeanSwingJInternalFrameAdditional jInternalFrameDetalleComprobanteFactura;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public ComprobanteFacturaSessionBean comprobantefacturaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public CajaSessionBean cajaSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public ComprobanteFacturaLogic comprobantefacturaLogic;
	
	public JScrollPane jScrollPanelDatosComprobanteFactura;
	public JScrollPane jScrollPanelDatosEdicionComprobanteFactura;
	public JScrollPane jScrollPanelDatosGeneralComprobanteFactura;
	
	protected JPanel jPanelCamposComprobanteFactura;    
	protected JPanel jPanelCamposOcultosComprobanteFactura;    	
	protected JPanel jPanelAccionesComprobanteFactura;
	protected JPanel jPanelAccionesFormularioComprobanteFactura;
    
	
	
	protected Integer iXPanelCamposComprobanteFactura=0;
	protected Integer iYPanelCamposComprobanteFactura=0;
	
	protected Integer iXPanelCamposOcultosComprobanteFactura=0;
	protected Integer iYPanelCamposOcultosComprobanteFactura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComprobanteFactura;
	public JButton jButtonModificarComprobanteFactura;
	public JButton jButtonActualizarComprobanteFactura;
    public JButton jButtonEliminarComprobanteFactura;
	public JButton jButtonCancelarComprobanteFactura;
    public JButton jButtonGuardarCambiosComprobanteFactura;
	public JButton jButtonGuardarCambiosTablaComprobanteFactura;
	protected JButton jButtonCerrarComprobanteFactura;
	
	
	protected JButton jButtonProcesarInformacionComprobanteFactura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComprobanteFactura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComprobanteFactura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComprobanteFactura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComprobanteFactura;
	protected JButton jButtonModificarToolBarComprobanteFactura;
	protected JButton jButtonActualizarToolBarComprobanteFactura;
    protected JButton jButtonEliminarToolBarComprobanteFactura;
	protected JButton jButtonCancelarToolBarComprobanteFactura;
    protected JButton jButtonGuardarCambiosToolBarComprobanteFactura;
	protected JButton jButtonGuardarCambiosTablaToolBarComprobanteFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarComprobanteFactura;
	protected JButton jButtonCerrarToolBarComprobanteFactura;
	
	protected JButton jButtonProcesarInformacionToolBarComprobanteFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComprobanteFactura;
	protected JMenuItem jMenuItemModificarComprobanteFactura;
	protected JMenuItem jMenuItemActualizarComprobanteFactura;
    protected JMenuItem jMenuItemEliminarComprobanteFactura;
	protected JMenuItem jMenuItemCancelarComprobanteFactura;
    protected JMenuItem jMenuItemGuardarCambiosComprobanteFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaComprobanteFactura;
	protected JMenuItem jMenuItemCerrarComprobanteFactura;
	protected JMenuItem jMenuItemDetalleCerrarComprobanteFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarComprobanteFactura;
	
	protected JMenuItem jMenuItemProcesarInformacionComprobanteFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComprobanteFactura;
	protected JMenuItem jMenuItemMostrarOcultarComprobanteFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComprobanteFactura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComprobanteFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComprobanteFactura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComprobanteFactura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComprobanteFactura;
	public JLabel jLabelIdComprobanteFactura;
	public JLabel jLabelidComprobanteFactura;
	public JButton jButtonidComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioComprobanteFactura;
	public JLabel jLabelfecha_inicioComprobanteFactura;
	//public JFormattedTextField jDateChooserfecha_inicioComprobanteFactura;

	public JDateChooser jDateChooserfecha_inicioComprobanteFactura;
	public JButton jButtonfecha_inicioComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finComprobanteFactura;
	public JLabel jLabelfecha_finComprobanteFactura;
	//public JFormattedTextField jDateChooserfecha_finComprobanteFactura;

	public JDateChooser jDateChooserfecha_finComprobanteFactura;
	public JButton jButtonfecha_finComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cajaComprobanteFactura;
	public JLabel jLabelnombre_cajaComprobanteFactura;
	public JTextArea jTextAreanombre_cajaComprobanteFactura;
	public JScrollPane jscrollPanenombre_cajaComprobanteFactura;
	public JButton jButtonnombre_cajaComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialComprobanteFactura;
	public JLabel jLabelsecuencialComprobanteFactura;
	public JTextField jTextFieldsecuencialComprobanteFactura;
	public JButton jButtonsecuencialComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfechaComprobanteFactura;
	public JLabel jLabelfechaComprobanteFactura;
	//public JFormattedTextField jDateChooserfechaComprobanteFactura;

	public JDateChooser jDateChooserfechaComprobanteFactura;
	public JButton jButtonfechaComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_clienteComprobanteFactura;
	public JLabel jLabelcodigo_clienteComprobanteFactura;
	public JTextField jTextFieldcodigo_clienteComprobanteFactura;
	public JButton jButtoncodigo_clienteComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteComprobanteFactura;
	public JLabel jLabelnombre_clienteComprobanteFactura;
	public JTextArea jTextAreanombre_clienteComprobanteFactura;
	public JScrollPane jscrollPanenombre_clienteComprobanteFactura;
	public JButton jButtonnombre_clienteComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalComprobanteFactura;
	public JLabel jLabelsubtotalComprobanteFactura;
	public JTextField jTextFieldsubtotalComprobanteFactura;
	public JButton jButtonsubtotalComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelivaComprobanteFactura;
	public JLabel jLabelivaComprobanteFactura;
	public JTextField jTextFieldivaComprobanteFactura;
	public JButton jButtonivaComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoComprobanteFactura;
	public JLabel jLabeldescuentoComprobanteFactura;
	public JTextField jTextFielddescuentoComprobanteFactura;
	public JButton jButtondescuentoComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoComprobanteFactura;
	public JLabel jLabelfinanciamientoComprobanteFactura;
	public JTextField jTextFieldfinanciamientoComprobanteFactura;
	public JButton jButtonfinanciamientoComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfleteComprobanteFactura;
	public JLabel jLabelfleteComprobanteFactura;
	public JTextField jTextFieldfleteComprobanteFactura;
	public JButton jButtonfleteComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPaneliceComprobanteFactura;
	public JLabel jLabeliceComprobanteFactura;
	public JTextField jTextFieldiceComprobanteFactura;
	public JButton jButtoniceComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltotalComprobanteFactura;
	public JLabel jLabeltotalComprobanteFactura;
	public JTextField jTextFieldtotalComprobanteFactura;
	public JButton jButtontotalComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_formas_pagoComprobanteFactura;
	public JLabel jLabelcantidad_formas_pagoComprobanteFactura;
	public JTextField jTextFieldcantidad_formas_pagoComprobanteFactura;
	public JButton jButtoncantidad_formas_pagoComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_realComprobanteFactura;
	public JLabel jLabeldescuento_realComprobanteFactura;
	public JTextField jTextFielddescuento_realComprobanteFactura;
	public JButton jButtondescuento_realComprobanteFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComprobanteFactura;
	public JLabel jLabelid_empresaComprobanteFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComprobanteFactura;
	public JButton jButtonid_empresaComprobanteFactura= new JButtonMe();
	public JButton jButtonid_empresaComprobanteFacturaUpdate= new JButtonMe();
	public JButton jButtonid_empresaComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorComprobanteFactura;
	public JLabel jLabelid_vendedorComprobanteFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorComprobanteFactura;
	public JButton jButtonid_vendedorComprobanteFactura= new JButtonMe();
	public JButton jButtonid_vendedorComprobanteFacturaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaComprobanteFactura;
	public JLabel jLabelid_cajaComprobanteFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaComprobanteFactura;
	public JButton jButtonid_cajaComprobanteFactura= new JButtonMe();
	public JButton jButtonid_cajaComprobanteFacturaUpdate= new JButtonMe();
	public JButton jButtonid_cajaComprobanteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteComprobanteFactura;
	public JLabel jLabelid_clienteComprobanteFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteComprobanteFactura;
	public JButton jButtonid_clienteComprobanteFactura= new JButtonMe();
	public JButton jButtonid_clienteComprobanteFacturaUpdate= new JButtonMe();
	public JButton jButtonid_clienteComprobanteFacturaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComprobanteFactura;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ComprobanteFacturaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComprobanteFactura=new JPanel();
				this.jPanelAccionesFormularioComprobanteFactura=new JPanel();
				this.jmenuBarDetalleComprobanteFactura=new JMenuBar();
				this.jTtoolBarDetalleComprobanteFactura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComprobanteFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComprobanteFacturaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComprobanteFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComprobanteFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComprobanteFactura() {
		return this.jButtonActualizarToolBarComprobanteFactura;
	}
	
	public JButton getjButtonEliminarToolBarComprobanteFactura() {
		return this.jButtonEliminarToolBarComprobanteFactura;
	}
	
	public JButton getjButtonCancelarToolBarComprobanteFactura() {
		return this.jButtonCancelarToolBarComprobanteFactura;
	}		
	
	public JButton getjButtonProcesarInformacionComprobanteFactura() {
		return this.jButtonProcesarInformacionComprobanteFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComprobanteFactura)	{
		this.jButtonProcesarInformacionComprobanteFactura = jButtonProcesarInformacionComprobanteFactura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComprobanteFactura() {
		return this.jComboBoxTiposAccionesComprobanteFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComprobanteFactura(
			JComboBox jComboBoxTiposRelacionesComprobanteFactura) {
		this.jComboBoxTiposRelacionesComprobanteFactura = jComboBoxTiposRelacionesComprobanteFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComprobanteFactura(
			JComboBox jComboBoxTiposAccionesComprobanteFactura) {
		this.jComboBoxTiposAccionesComprobanteFactura = jComboBoxTiposAccionesComprobanteFactura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComprobanteFactura() {
		return this.jComboBoxTiposAccionesFormularioComprobanteFactura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComprobanteFactura(
			JComboBox jComboBoxTiposAccionesFormularioComprobanteFactura) {
		this.jComboBoxTiposAccionesFormularioComprobanteFactura = jComboBoxTiposAccionesFormularioComprobanteFactura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comprobantefacturaSessionBean=new ComprobanteFacturaSessionBean();
		
		this.comprobantefacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantefacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comprobantefacturaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComprobanteFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComprobanteFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComprobanteFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comprobante Factura MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
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
	
		ComprobanteFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComprobanteFactura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComprobanteFactura=new JButtonMe();
				this.jButtonModificarToolBarComprobanteFactura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComprobanteFactura,this.jTtoolBarDetalleComprobanteFactura,
							"actualizar","actualizar","Actualizar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComprobanteFactura,this.jTtoolBarDetalleComprobanteFactura,
							"eliminar","eliminar","Eliminar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComprobanteFactura,this.jTtoolBarDetalleComprobanteFactura,
							"cancelar","cancelar","Cancelar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComprobanteFactura,this.jTtoolBarDetalleComprobanteFactura,
							"guardarcambios","guardarcambios","Guardar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComprobanteFactura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComprobanteFactura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComprobanteFactura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComprobanteFactura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComprobanteFactura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComprobanteFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComprobanteFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComprobanteFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComprobanteFactura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComprobanteFactura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComprobanteFactura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComprobanteFactura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComprobanteFactura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComprobanteFactura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComprobanteFactura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComprobanteFactura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComprobanteFactura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComprobanteFactura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComprobanteFactura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComprobanteFactura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComprobanteFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComprobanteFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComprobanteFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComprobanteFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComprobanteFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComprobanteFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComprobanteFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComprobanteFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComprobanteFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComprobanteFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComprobanteFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComprobanteFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComprobanteFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComprobanteFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComprobanteFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComprobanteFactura.add(this.jMenuItemDetalleCerrarComprobanteFactura);
		
		this.jmenuDetalleAccionesComprobanteFactura.add(this.jMenuItemActualizarComprobanteFactura);
		this.jmenuDetalleAccionesComprobanteFactura.add(this.jMenuItemEliminarComprobanteFactura);
		this.jmenuDetalleAccionesComprobanteFactura.add(this.jMenuItemCancelarComprobanteFactura);		
		
		//this.jmenuDetalleDatosComprobanteFactura.add(this.jMenuItemDetalleAbrirOrderByComprobanteFactura);				
		this.jmenuDetalleDatosComprobanteFactura.add(this.jMenuItemDetalleMostarOcultarComprobanteFactura);				
				
		//this.jmenuDetalleAccionesComprobanteFactura.add(this.jMenuItemGuardarCambiosComprobanteFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComprobanteFactura.add(this.jmenuDetalleArchivoComprobanteFactura);		
		this.jmenuBarDetalleComprobanteFactura.add(this.jmenuDetalleAccionesComprobanteFactura);		
		this.jmenuBarDetalleComprobanteFactura.add(this.jmenuDetalleDatosComprobanteFactura);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComprobanteFactura);				
	}
	
	
	public void inicializarElementosCamposComprobanteFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComprobanteFactura = new JLabelMe();
		jLabelIdComprobanteFactura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComprobanteFactura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComprobanteFactura= new GridBagLayout();

		this.jPanelidComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);

		jLabelidComprobanteFactura = new JLabel();
		jLabelidComprobanteFactura.setText("Id");

		jLabelidComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioComprobanteFactura = new JLabelMe();
		this.jLabelfecha_inicioComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioComprobanteFactura.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelfecha_inicioComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		//jFormattedTextFieldfecha_inicioComprobanteFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioComprobanteFactura= new JDateChooser();
		jDateChooserfecha_inicioComprobanteFactura.setEnabled(false);
		jDateChooserfecha_inicioComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioComprobanteFactura.setDate(new Date());
		jDateChooserfecha_inicioComprobanteFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioComprobanteFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_inicioComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioComprobanteFacturaBusqueda.setText("U");
		this.jButtonfecha_inicioComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finComprobanteFactura = new JLabelMe();
		this.jLabelfecha_finComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finComprobanteFactura.setToolTipText("Fecha Fin");
		this.jLabelfecha_finComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelfecha_finComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		//jFormattedTextFieldfecha_finComprobanteFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_finComprobanteFactura= new JDateChooser();
		jDateChooserfecha_finComprobanteFactura.setEnabled(false);
		jDateChooserfecha_finComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finComprobanteFactura.setDate(new Date());
		jDateChooserfecha_finComprobanteFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finComprobanteFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_finComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finComprobanteFacturaBusqueda.setText("U");
		this.jButtonfecha_finComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cajaComprobanteFactura = new JLabelMe();
		this.jLabelnombre_cajaComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA+" : *");
		this.jLabelnombre_cajaComprobanteFactura.setToolTipText("Nombre Caja");
		this.jLabelnombre_cajaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cajaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cajaComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cajaComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelnombre_cajaComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextAreanombre_cajaComprobanteFactura= new JTextAreaMe();
		jTextAreanombre_cajaComprobanteFactura.setEnabled(false);
		jTextAreanombre_cajaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaComprobanteFactura.setLineWrap(true);
		jTextAreanombre_cajaComprobanteFactura.setWrapStyleWord(true);
		jTextAreanombre_cajaComprobanteFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cajaComprobanteFactura.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cajaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cajaComprobanteFactura = new JScrollPane(jTextAreanombre_cajaComprobanteFactura);
		jscrollPanenombre_cajaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cajaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cajaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cajaComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonnombre_cajaComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cajaComprobanteFacturaBusqueda.setText("U");
		this.jButtonnombre_cajaComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cajaComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cajaComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cajaComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cajaComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cajaComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cajaComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialComprobanteFactura = new JLabelMe();
		this.jLabelsecuencialComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialComprobanteFactura.setToolTipText("Secuencial");
		this.jLabelsecuencialComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelsecuencialComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextFieldsecuencialComprobanteFactura= new JTextFieldMe();

		jTextFieldsecuencialComprobanteFactura.setEnabled(false);
		jTextFieldsecuencialComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonsecuencialComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialComprobanteFacturaBusqueda.setText("U");
		this.jButtonsecuencialComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfechaComprobanteFactura = new JLabelMe();
		this.jLabelfechaComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaComprobanteFactura.setToolTipText("Fecha");
		this.jLabelfechaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelfechaComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		//jFormattedTextFieldfechaComprobanteFactura= new JFormattedTextFieldMe();

		jDateChooserfechaComprobanteFactura= new JDateChooser();
		jDateChooserfechaComprobanteFactura.setEnabled(false);
		jDateChooserfechaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaComprobanteFactura.setDate(new Date());
		jDateChooserfechaComprobanteFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaComprobanteFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonfechaComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaComprobanteFacturaBusqueda.setText("U");
		this.jButtonfechaComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_clienteComprobanteFactura = new JLabelMe();
		this.jLabelcodigo_clienteComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE+" : *");
		this.jLabelcodigo_clienteComprobanteFactura.setToolTipText("Codigo Cliente");
		this.jLabelcodigo_clienteComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_clienteComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_clienteComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_clienteComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelcodigo_clienteComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextFieldcodigo_clienteComprobanteFactura= new JTextFieldMe();

		jTextFieldcodigo_clienteComprobanteFactura.setEnabled(false);
		jTextFieldcodigo_clienteComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_clienteComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_clienteComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtoncodigo_clienteComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_clienteComprobanteFacturaBusqueda.setText("U");
		this.jButtoncodigo_clienteComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_clienteComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_clienteComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_clienteComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_clienteComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_clienteComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_clienteComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteComprobanteFactura = new JLabelMe();
		this.jLabelnombre_clienteComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteComprobanteFactura.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelnombre_clienteComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextAreanombre_clienteComprobanteFactura= new JTextAreaMe();
		jTextAreanombre_clienteComprobanteFactura.setEnabled(false);
		jTextAreanombre_clienteComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteFactura.setLineWrap(true);
		jTextAreanombre_clienteComprobanteFactura.setWrapStyleWord(true);
		jTextAreanombre_clienteComprobanteFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteComprobanteFactura.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteComprobanteFactura = new JScrollPane(jTextAreanombre_clienteComprobanteFactura);
		jscrollPanenombre_clienteComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonnombre_clienteComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteComprobanteFacturaBusqueda.setText("U");
		this.jButtonnombre_clienteComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalComprobanteFactura = new JLabelMe();
		this.jLabelsubtotalComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsubtotalComprobanteFactura.setToolTipText("Subtotal");
		this.jLabelsubtotalComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelsubtotalComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextFieldsubtotalComprobanteFactura= new JTextFieldMe();
		jTextFieldsubtotalComprobanteFactura.setEnabled(false);
		jTextFieldsubtotalComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalComprobanteFactura.setText("0.0");

		this.jButtonsubtotalComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonsubtotalComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalComprobanteFacturaBusqueda.setText("U");
		this.jButtonsubtotalComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelivaComprobanteFactura = new JLabelMe();
		this.jLabelivaComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaComprobanteFactura.setToolTipText("Iva");
		this.jLabelivaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelivaComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextFieldivaComprobanteFactura= new JTextFieldMe();
		jTextFieldivaComprobanteFactura.setEnabled(false);
		jTextFieldivaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaComprobanteFactura.setText("0.0");

		this.jButtonivaComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonivaComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaComprobanteFacturaBusqueda.setText("U");
		this.jButtonivaComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoComprobanteFactura = new JLabelMe();
		this.jLabeldescuentoComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoComprobanteFactura.setToolTipText("Descuento");
		this.jLabeldescuentoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPaneldescuentoComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextFielddescuentoComprobanteFactura= new JTextFieldMe();
		jTextFielddescuentoComprobanteFactura.setEnabled(false);
		jTextFielddescuentoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoComprobanteFactura.setText("0.0");

		this.jButtondescuentoComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtondescuentoComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoComprobanteFacturaBusqueda.setText("U");
		this.jButtondescuentoComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoComprobanteFactura = new JLabelMe();
		this.jLabelfinanciamientoComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoComprobanteFactura.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelfinanciamientoComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextFieldfinanciamientoComprobanteFactura= new JTextFieldMe();
		jTextFieldfinanciamientoComprobanteFactura.setEnabled(false);
		jTextFieldfinanciamientoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoComprobanteFactura.setText("0.0");

		this.jButtonfinanciamientoComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonfinanciamientoComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoComprobanteFacturaBusqueda.setText("U");
		this.jButtonfinanciamientoComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfleteComprobanteFactura = new JLabelMe();
		this.jLabelfleteComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteComprobanteFactura.setToolTipText("Flete");
		this.jLabelfleteComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelfleteComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextFieldfleteComprobanteFactura= new JTextFieldMe();
		jTextFieldfleteComprobanteFactura.setEnabled(false);
		jTextFieldfleteComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteComprobanteFactura.setText("0.0");

		this.jButtonfleteComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonfleteComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteComprobanteFacturaBusqueda.setText("U");
		this.jButtonfleteComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabeliceComprobanteFactura = new JLabelMe();
		this.jLabeliceComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceComprobanteFactura.setToolTipText("Ice");
		this.jLabeliceComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPaneliceComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextFieldiceComprobanteFactura= new JTextFieldMe();
		jTextFieldiceComprobanteFactura.setEnabled(false);
		jTextFieldiceComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceComprobanteFactura.setText("0.0");

		this.jButtoniceComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtoniceComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceComprobanteFacturaBusqueda.setText("U");
		this.jButtoniceComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltotalComprobanteFactura = new JLabelMe();
		this.jLabeltotalComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalComprobanteFactura.setToolTipText("Total");
		this.jLabeltotalComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPaneltotalComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextFieldtotalComprobanteFactura= new JTextFieldMe();
		jTextFieldtotalComprobanteFactura.setEnabled(false);
		jTextFieldtotalComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalComprobanteFactura.setText("0.0");

		this.jButtontotalComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtontotalComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalComprobanteFacturaBusqueda.setText("U");
		this.jButtontotalComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_formas_pagoComprobanteFactura = new JLabelMe();
		this.jLabelcantidad_formas_pagoComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO+" : *");
		this.jLabelcantidad_formas_pagoComprobanteFactura.setToolTipText("Cantad Formas Pago");
		this.jLabelcantidad_formas_pagoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_formas_pagoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_formas_pagoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_formas_pagoComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_formas_pagoComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_formas_pagoComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelcantidad_formas_pagoComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextFieldcantidad_formas_pagoComprobanteFactura= new JTextFieldMe();
		jTextFieldcantidad_formas_pagoComprobanteFactura.setEnabled(false);
		jTextFieldcantidad_formas_pagoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_formas_pagoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_formas_pagoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_formas_pagoComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_formas_pagoComprobanteFactura.setText("0");

		this.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda.setText("U");
		this.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_formas_pagoComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_formas_pagoComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_formas_pagoComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_realComprobanteFactura = new JLabelMe();
		this.jLabeldescuento_realComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL+" : *");
		this.jLabeldescuento_realComprobanteFactura.setToolTipText("Descuento Real");
		this.jLabeldescuento_realComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_realComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_realComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_realComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_realComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_realComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPaneldescuento_realComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jTextFielddescuento_realComprobanteFactura= new JTextFieldMe();
		jTextFielddescuento_realComprobanteFactura.setEnabled(false);
		jTextFielddescuento_realComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_realComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_realComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_realComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_realComprobanteFactura.setText("0.0");

		this.jButtondescuento_realComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtondescuento_realComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_realComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_realComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_realComprobanteFacturaBusqueda.setText("U");
		this.jButtondescuento_realComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_realComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_realComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_realComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_realComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_realComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_realComprobanteFacturaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComprobanteFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComprobanteFactura = new JLabelMe();
		this.jLabelid_empresaComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComprobanteFactura.setToolTipText("Empresa");
		this.jLabelid_empresaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelid_empresaComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jComboBoxid_empresaComprobanteFactura= new JComboBoxMe();
		jComboBoxid_empresaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComprobanteFactura.setEnabled(false);

		this.jButtonid_empresaComprobanteFactura= new JButtonMe();
		this.jButtonid_empresaComprobanteFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteFactura.setText("Buscar");
		this.jButtonid_empresaComprobanteFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComprobanteFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteFactura"));

		this.jButtonid_empresaComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonid_empresaComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComprobanteFacturaBusqueda.setText("U");
		this.jButtonid_empresaComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComprobanteFacturaBusqueda.setVisible(false);		}

		this.jButtonid_empresaComprobanteFacturaUpdate= new JButtonMe();
		this.jButtonid_empresaComprobanteFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComprobanteFacturaUpdate.setText("U");
		this.jButtonid_empresaComprobanteFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComprobanteFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteFacturaUpdate"));



					
		this.jLabelid_vendedorComprobanteFactura = new JLabelMe();
		this.jLabelid_vendedorComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorComprobanteFactura.setToolTipText("Vendedor");
		this.jLabelid_vendedorComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelid_vendedorComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jComboBoxid_vendedorComprobanteFactura= new JComboBoxMe();
		jComboBoxid_vendedorComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorComprobanteFactura= new JButtonMe();
		this.jButtonid_vendedorComprobanteFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComprobanteFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComprobanteFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComprobanteFactura.setText("Buscar");
		this.jButtonid_vendedorComprobanteFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorComprobanteFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComprobanteFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComprobanteFactura"));

		this.jButtonid_vendedorComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonid_vendedorComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComprobanteFacturaBusqueda.setText("U");
		this.jButtonid_vendedorComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorComprobanteFacturaBusqueda.setVisible(false);		}

		this.jButtonid_vendedorComprobanteFacturaUpdate= new JButtonMe();
		this.jButtonid_vendedorComprobanteFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComprobanteFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComprobanteFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComprobanteFacturaUpdate.setText("U");
		this.jButtonid_vendedorComprobanteFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorComprobanteFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComprobanteFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComprobanteFacturaUpdate"));



					
		this.jLabelid_cajaComprobanteFactura = new JLabelMe();
		this.jLabelid_cajaComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaComprobanteFactura.setToolTipText("Caja");
		this.jLabelid_cajaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelid_cajaComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jComboBoxid_cajaComprobanteFactura= new JComboBoxMe();
		jComboBoxid_cajaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cajaComprobanteFactura.setEnabled(false);

		this.jButtonid_cajaComprobanteFactura= new JButtonMe();
		this.jButtonid_cajaComprobanteFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaComprobanteFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaComprobanteFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaComprobanteFactura.setText("Buscar");
		this.jButtonid_cajaComprobanteFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaComprobanteFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaComprobanteFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaComprobanteFactura"));

		this.jButtonid_cajaComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonid_cajaComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaComprobanteFacturaBusqueda.setText("U");
		this.jButtonid_cajaComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaComprobanteFacturaBusqueda.setVisible(false);		}

		this.jButtonid_cajaComprobanteFacturaUpdate= new JButtonMe();
		this.jButtonid_cajaComprobanteFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaComprobanteFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaComprobanteFacturaUpdate.setText("U");
		this.jButtonid_cajaComprobanteFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaComprobanteFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaComprobanteFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaComprobanteFacturaUpdate"));



					
		this.jLabelid_clienteComprobanteFactura = new JLabelMe();
		this.jLabelid_clienteComprobanteFactura.setText(""+ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteComprobanteFactura.setToolTipText("Cliente");
		this.jLabelid_clienteComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteComprobanteFactura.setToolTipText(ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutComprobanteFactura = new GridBagLayout();
		this.jPanelid_clienteComprobanteFactura.setLayout(this.gridaBagLayoutComprobanteFactura);


		jComboBoxid_clienteComprobanteFactura= new JComboBoxMe();
		jComboBoxid_clienteComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_clienteComprobanteFactura.setEnabled(false);

		this.jButtonid_clienteComprobanteFactura= new JButtonMe();
		this.jButtonid_clienteComprobanteFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteFactura.setText("Buscar");
		this.jButtonid_clienteComprobanteFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteComprobanteFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteFactura"));

		this.jButtonid_clienteComprobanteFacturaBusqueda= new JButtonMe();
		this.jButtonid_clienteComprobanteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteComprobanteFacturaBusqueda.setText("U");
		this.jButtonid_clienteComprobanteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteComprobanteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteFacturaBusqueda"));

		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteComprobanteFacturaBusqueda.setVisible(false);		}

		this.jButtonid_clienteComprobanteFacturaUpdate= new JButtonMe();
		this.jButtonid_clienteComprobanteFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteComprobanteFacturaUpdate.setText("U");
		this.jButtonid_clienteComprobanteFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteComprobanteFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteFacturaUpdate"));



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
		//this.jInternalFrameDetalleComprobanteFactura = new ComprobanteFacturaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comprobante Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComprobanteFactura= new GridBagLayout();
		

		
		String sToolTipComprobanteFactura="";
		sToolTipComprobanteFactura=ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComprobanteFactura+="(PuntoVenta.ComprobanteFactura)";
		}
		
		if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComprobanteFactura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComprobanteFactura = new JButtonMe();
		this.jButtonModificarComprobanteFactura = new JButtonMe();
        this.jButtonActualizarComprobanteFactura = new JButtonMe();
        this.jButtonEliminarComprobanteFactura = new JButtonMe();
        this.jButtonCancelarComprobanteFactura = new JButtonMe();
        this.jButtonGuardarCambiosComprobanteFactura = new JButtonMe();
		this.jButtonGuardarCambiosTablaComprobanteFactura = new JButtonMe();
		this.jButtonCerrarComprobanteFactura = new JButtonMe();
		
		this.jScrollPanelDatosComprobanteFactura = new JScrollPane();   
        this.jScrollPanelDatosEdicionComprobanteFactura = new JScrollPane();
		this.jScrollPanelDatosGeneralComprobanteFactura = new JScrollPane();
				
		
		
		this.jPanelCamposComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comprobante Factura";
		
		if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosComprobanteFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComprobanteFactura.setName("jPanelCamposComprobanteFactura"); 

		this.jPanelCamposOcultosComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComprobanteFactura.setName("jPanelCamposOcultosComprobanteFactura"); 

        this.jPanelAccionesComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComprobanteFactura.setToolTipText("Acciones");
        this.jPanelAccionesComprobanteFactura.setName("Acciones"); 

		this.jPanelAccionesFormularioComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComprobanteFactura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComprobanteFactura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComprobanteFactura.setText("Nuevo");
		this.jButtonModificarComprobanteFactura.setText("Editar");
        this.jButtonActualizarComprobanteFactura.setText("Actualizar");
        this.jButtonEliminarComprobanteFactura.setText("Eliminar");
        this.jButtonCancelarComprobanteFactura.setText("Cancelar");
        this.jButtonGuardarCambiosComprobanteFactura.setText("Guardar");
		this.jButtonGuardarCambiosTablaComprobanteFactura.setText("Guardar");
		this.jButtonCerrarComprobanteFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComprobanteFactura,"nuevo_button","Nuevo",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComprobanteFactura,"modificar_button","Editar",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComprobanteFactura,"actualizar_button","Actualizar",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComprobanteFactura,"eliminar_button","Eliminar",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComprobanteFactura,"cancelar_button","Cancelar",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComprobanteFactura,"guardarcambios_button","Guardar",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComprobanteFactura,"guardarcambiostabla_button","Guardar",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComprobanteFactura,"cerrar_button","Salir",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComprobanteFactura.setToolTipText("Nuevo"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComprobanteFactura.setToolTipText("Editar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComprobanteFactura.setToolTipText("Actualizar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComprobanteFactura.setToolTipText("Eliminar)"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComprobanteFactura.setToolTipText("Cancelar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComprobanteFactura.setToolTipText("Guardar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComprobanteFactura.setToolTipText("Guardar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComprobanteFactura.setToolTipText("Salir"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComprobanteFactura";
		inputMap = this.jButtonNuevoComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComprobanteFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComprobanteFactura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComprobanteFactura";
		inputMap = this.jButtonActualizarComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComprobanteFactura"));
		
		//ELIMINAR
		sMapKey = "EliminarComprobanteFactura";
		inputMap = this.jButtonEliminarComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComprobanteFactura"));
		
		//CANCELAR	
		sMapKey = "CancelarComprobanteFactura";
		inputMap = this.jButtonCancelarComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComprobanteFactura"));
		
		//CERRAR		
		sMapKey = "CerrarComprobanteFactura";
		inputMap = this.jButtonCerrarComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComprobanteFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComprobanteFactura";
		inputMap = this.jButtonGuardarCambiosTablaComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComprobanteFactura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComprobanteFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComprobanteFactura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComprobanteFactura.setToolTipText("Nuevo ComprobanteFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComprobanteFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComprobanteFactura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComprobanteFactura.setToolTipText("Sin Cerrar Ventana ComprobanteFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComprobanteFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComprobanteFactura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComprobanteFactura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComprobanteFactura.setText("Accion");
		this.jComboBoxTiposAccionesComprobanteFactura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComprobanteFactura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComprobanteFactura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComprobanteFactura = new JLabelMe();
		
		this.jLabelAccionesComprobanteFactura.setText("Acciones");		
		this.jLabelAccionesComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComprobanteFactura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComprobanteFactura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComprobanteFactura=new JTabbedPane();
		this.jTabbedPaneRelacionesComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComprobanteFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComprobanteFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComprobanteFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComprobanteFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComprobanteFactura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComprobanteFactura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComprobanteFactura = new GridBagLayout();
		
		this.jPanelCamposComprobanteFactura.setLayout(gridaBagLayoutCamposComprobanteFactura);
		this.jPanelCamposOcultosComprobanteFactura.setLayout(gridaBagLayoutCamposOcultosComprobanteFactura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComprobanteFactura.add(jLabelIdComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComprobanteFactura.add(jLabelidComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComprobanteFactura.add(jLabelid_empresaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComprobanteFactura.add(jButtonid_empresaComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 3;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComprobanteFactura.add(jButtonid_empresaComprobanteFacturaUpdate, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComprobanteFactura.add(jComboBoxid_empresaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorComprobanteFactura.add(jLabelid_vendedorComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComprobanteFactura.add(jButtonid_vendedorComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 3;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComprobanteFactura.add(jButtonid_vendedorComprobanteFacturaUpdate, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorComprobanteFactura.add(jComboBoxid_vendedorComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioComprobanteFactura.add(jLabelfecha_inicioComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioComprobanteFactura.add(jButtonfecha_inicioComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioComprobanteFactura.add(jDateChooserfecha_inicioComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finComprobanteFactura.add(jLabelfecha_finComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finComprobanteFactura.add(jButtonfecha_finComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finComprobanteFactura.add(jDateChooserfecha_finComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaComprobanteFactura.add(jLabelid_cajaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaComprobanteFactura.add(jButtonid_cajaComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 3;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaComprobanteFactura.add(jButtonid_cajaComprobanteFacturaUpdate, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaComprobanteFactura.add(jComboBoxid_cajaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteComprobanteFactura.add(jLabelid_clienteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteComprobanteFactura.add(jButtonid_clienteComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 3;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteComprobanteFactura.add(jButtonid_clienteComprobanteFacturaUpdate, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteComprobanteFactura.add(jComboBoxid_clienteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cajaComprobanteFactura.add(jLabelnombre_cajaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cajaComprobanteFactura.add(jButtonnombre_cajaComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cajaComprobanteFactura.add(jscrollPanenombre_cajaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialComprobanteFactura.add(jLabelsecuencialComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialComprobanteFactura.add(jButtonsecuencialComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialComprobanteFactura.add(jTextFieldsecuencialComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaComprobanteFactura.add(jLabelfechaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaComprobanteFactura.add(jButtonfechaComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaComprobanteFactura.add(jDateChooserfechaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_clienteComprobanteFactura.add(jLabelcodigo_clienteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_clienteComprobanteFactura.add(jButtoncodigo_clienteComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_clienteComprobanteFactura.add(jTextFieldcodigo_clienteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteComprobanteFactura.add(jLabelnombre_clienteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteComprobanteFactura.add(jButtonnombre_clienteComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteComprobanteFactura.add(jscrollPanenombre_clienteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsubtotalComprobanteFactura.add(jLabelsubtotalComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalComprobanteFactura.add(jButtonsubtotalComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsubtotalComprobanteFactura.add(jTextFieldsubtotalComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaComprobanteFactura.add(jLabelivaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaComprobanteFactura.add(jButtonivaComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaComprobanteFactura.add(jTextFieldivaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoComprobanteFactura.add(jLabeldescuentoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoComprobanteFactura.add(jButtondescuentoComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoComprobanteFactura.add(jTextFielddescuentoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoComprobanteFactura.add(jLabelfinanciamientoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoComprobanteFactura.add(jButtonfinanciamientoComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoComprobanteFactura.add(jTextFieldfinanciamientoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteComprobanteFactura.add(jLabelfleteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteComprobanteFactura.add(jButtonfleteComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteComprobanteFactura.add(jTextFieldfleteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceComprobanteFactura.add(jLabeliceComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceComprobanteFactura.add(jButtoniceComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceComprobanteFactura.add(jTextFieldiceComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalComprobanteFactura.add(jLabeltotalComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalComprobanteFactura.add(jButtontotalComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalComprobanteFactura.add(jTextFieldtotalComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_formas_pagoComprobanteFactura.add(jLabelcantidad_formas_pagoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_formas_pagoComprobanteFactura.add(jButtoncantidad_formas_pagoComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_formas_pagoComprobanteFactura.add(jTextFieldcantidad_formas_pagoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 0;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_realComprobanteFactura.add(jLabeldescuento_realComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 2;
		this.gridBagConstraintsComprobanteFactura.ipadx = 0;
		this.gridBagConstraintsComprobanteFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_realComprobanteFactura.add(jButtondescuento_realComprobanteFacturaBusqueda, this.gridBagConstraintsComprobanteFactura);
	}

	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFactura.gridy = 0;
	this.gridBagConstraintsComprobanteFactura.gridx = 1;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_realComprobanteFactura.add(jTextFielddescuento_realComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelidComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelid_vendedorComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelfecha_inicioComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelfecha_finComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelnombre_cajaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelsecuencialComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelfechaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelcodigo_clienteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelnombre_clienteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelsubtotalComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelivaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPaneldescuentoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelfinanciamientoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelfleteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPaneliceComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPaneltotalComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPanelcantidad_formas_pagoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFactura.add(this.jPaneldescuento_realComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposComprobanteFactura % 2==0) {
		iXPanelCamposComprobanteFactura=0;
		iYPanelCamposComprobanteFactura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposOcultosComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposOcultosComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteFactura.add(this.jPanelid_empresaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposOcultosComprobanteFactura % 2==0) {
		iXPanelCamposOcultosComprobanteFactura=0;
		iYPanelCamposOcultosComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposOcultosComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposOcultosComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteFactura.add(this.jPanelid_cajaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposOcultosComprobanteFactura % 2==0) {
		iXPanelCamposOcultosComprobanteFactura=0;
		iYPanelCamposOcultosComprobanteFactura++;
	}
	this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFactura.gridy = iYPanelCamposOcultosComprobanteFactura;
	this.gridBagConstraintsComprobanteFactura.gridx = iXPanelCamposOcultosComprobanteFactura++;
	this.gridBagConstraintsComprobanteFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteFactura.add(this.jPanelid_clienteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);



	if(iXPanelCamposOcultosComprobanteFactura % 2==0) {
		iXPanelCamposOcultosComprobanteFactura=0;
		iYPanelCamposOcultosComprobanteFactura++;
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
			
		GridBagLayout gridaBagLayoutAccionesComprobanteFactura= new GridBagLayout();
		this.jPanelAccionesComprobanteFactura.setLayout(gridaBagLayoutAccionesComprobanteFactura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComprobanteFactura= new GridBagLayout();
		this.jPanelAccionesFormularioComprobanteFactura.setLayout(gridaBagLayoutAccionesFormularioComprobanteFactura);
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComprobanteFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComprobanteFactura.add(this.jComboBoxTiposAccionesFormularioComprobanteFactura, this.gridBagConstraintsComprobanteFactura);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccion++;
			
		this.jPanelAccionesComprobanteFactura.add(this.jButtonModificarComprobanteFactura, this.gridBagConstraintsComprobanteFactura);							

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx =iPosXAccion++;
			
		this.jPanelAccionesComprobanteFactura.add(this.jButtonEliminarComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
			
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = 0;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesComprobanteFactura.add(this.jButtonActualizarComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = 0;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesComprobanteFactura.add(this.jButtonGuardarCambiosComprobanteFactura, this.gridBagConstraintsComprobanteFactura);	
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = 0;		
		this.gridBagConstraintsComprobanteFactura.gridx =iPosXAccion++;
		
		this.jPanelAccionesComprobanteFactura.add(this.jButtonCancelarComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComprobanteFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComprobanteFactura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();						
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteFactura.gridx = 0;		
			//this.gridBagConstraintsComprobanteFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComprobanteFactura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComprobanteFactura.gridx =0;
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComprobanteFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComprobanteFacturaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComprobanteFactura = new ComprobanteFacturaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comprobante Factura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comprobante Factura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comprobante Factura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComprobanteFacturaModel comprobantefacturaModel=new ComprobanteFacturaModel(this);
			
			//SI USARA CLASE INTERNA
			//ComprobanteFacturaModel.ComprobanteFacturaFocusTraversalPolicy comprobantefacturaFocusTraversalPolicy = comprobantefacturaModel.new ComprobanteFacturaFocusTraversalPolicy(this);
			
			//comprobantefacturaFocusTraversalPolicy.setcomprobantefacturaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comprobantefacturaModel);
			
			
			this.jContentPaneDetalleComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComprobanteFactura = new GridBagLayout();	
			this.jContentPaneDetalleComprobanteFactura.setLayout(gridaBagLayoutDetalleComprobanteFactura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComprobanteFactura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
				this.gridBagConstraintsComprobanteFactura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComprobanteFactura.gridx = 0;
					
				
				this.jContentPaneDetalleComprobanteFactura.add(jTtoolBarDetalleComprobanteFactura, gridBagConstraintsComprobanteFactura);								
				
}
			
			this.jScrollPanelDatosEdicionComprobanteFactura=   new JScrollPane(jContentPaneDetalleComprobanteFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComprobanteFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComprobanteFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComprobanteFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComprobanteFactura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComprobanteFactura.gridx = 0;
	        
			this.jContentPaneDetalleComprobanteFactura.add(jPanelCamposComprobanteFactura, gridBagConstraintsComprobanteFactura);
			
			
			
			
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
						//&& comprobantefacturaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comprobantefacturaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComprobanteFactura= new GridBagConstraints();
						this.gridBagConstraintsComprobanteFactura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComprobanteFactura.gridx = 0;
						this.jContentPaneDetalleComprobanteFactura.add(this.jTabbedPaneRelacionesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComprobanteFactura.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComprobanteFactura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
					this.gridBagConstraintsComprobanteFactura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComprobanteFactura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComprobanteFactura.gridx = 0;
					
				
					this.jContentPaneDetalleComprobanteFactura.add(jPanelCamposOcultosComprobanteFactura, gridBagConstraintsComprobanteFactura);
				
					this.jPanelCamposOcultosComprobanteFactura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComprobanteFactura.gridx = 0;
	        this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComprobanteFactura.add(this.jPanelAccionesFormularioComprobanteFactura, this.gridBagConstraintsComprobanteFactura);							
			
			
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
	        this.gridBagConstraintsComprobanteFactura.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComprobanteFactura.gridx = 0;
	        
			
			this.jContentPaneDetalleComprobanteFactura.add(this.jPanelAccionesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComprobanteFactura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComprobanteFactura=   new JScrollPane(this.jPanelCamposComprobanteFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComprobanteFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteFactura.gridx = 0;
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComprobanteFactura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComprobanteFactura, this.gridBagConstraintsComprobanteFactura);			
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			
			
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
			
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComprobanteFactura;//jContentPane;
		
		return jScrollPanelDatosEdicionComprobanteFactura;
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
