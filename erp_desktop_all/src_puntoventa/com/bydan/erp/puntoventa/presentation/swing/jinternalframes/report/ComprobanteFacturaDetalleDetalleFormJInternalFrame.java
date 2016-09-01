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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.puntoventa.util.report.ComprobanteFacturaDetalleConstantesFunciones;

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
public class ComprobanteFacturaDetalleDetalleFormJInternalFrame extends ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComprobanteFacturaDetalle;
	
	protected JMenuBar jmenuBarDetalleComprobanteFacturaDetalle;
	
	protected JMenu jmenuDetalleComprobanteFacturaDetalle;
	protected JMenu jmenuDetalleArchivoComprobanteFacturaDetalle;
	protected JMenu jmenuDetalleAccionesComprobanteFacturaDetalle;
	protected JMenu jmenuDetalleDatosComprobanteFacturaDetalle;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComprobanteFacturaDetalle;	
	protected GridBagConstraints gridBagConstraintsComprobanteFacturaDetalle;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional jInternalFrameDetalleComprobanteFacturaDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public ComprobanteFacturaDetalleSessionBean comprobantefacturadetalleSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public ComprobanteFacturaDetalleLogic comprobantefacturadetalleLogic;
	
	public JScrollPane jScrollPanelDatosComprobanteFacturaDetalle;
	public JScrollPane jScrollPanelDatosEdicionComprobanteFacturaDetalle;
	public JScrollPane jScrollPanelDatosGeneralComprobanteFacturaDetalle;
	
	protected JPanel jPanelCamposComprobanteFacturaDetalle;    
	protected JPanel jPanelCamposOcultosComprobanteFacturaDetalle;    	
	protected JPanel jPanelAccionesComprobanteFacturaDetalle;
	protected JPanel jPanelAccionesFormularioComprobanteFacturaDetalle;
    
	
	
	protected Integer iXPanelCamposComprobanteFacturaDetalle=0;
	protected Integer iYPanelCamposComprobanteFacturaDetalle=0;
	
	protected Integer iXPanelCamposOcultosComprobanteFacturaDetalle=0;
	protected Integer iYPanelCamposOcultosComprobanteFacturaDetalle=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComprobanteFacturaDetalle;
	public JButton jButtonModificarComprobanteFacturaDetalle;
	public JButton jButtonActualizarComprobanteFacturaDetalle;
    public JButton jButtonEliminarComprobanteFacturaDetalle;
	public JButton jButtonCancelarComprobanteFacturaDetalle;
    public JButton jButtonGuardarCambiosComprobanteFacturaDetalle;
	public JButton jButtonGuardarCambiosTablaComprobanteFacturaDetalle;
	protected JButton jButtonCerrarComprobanteFacturaDetalle;
	
	
	protected JButton jButtonProcesarInformacionComprobanteFacturaDetalle;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComprobanteFacturaDetalle;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComprobanteFacturaDetalle;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComprobanteFacturaDetalle;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComprobanteFacturaDetalle;
	protected JButton jButtonModificarToolBarComprobanteFacturaDetalle;
	protected JButton jButtonActualizarToolBarComprobanteFacturaDetalle;
    protected JButton jButtonEliminarToolBarComprobanteFacturaDetalle;
	protected JButton jButtonCancelarToolBarComprobanteFacturaDetalle;
    protected JButton jButtonGuardarCambiosToolBarComprobanteFacturaDetalle;
	protected JButton jButtonGuardarCambiosTablaToolBarComprobanteFacturaDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarComprobanteFacturaDetalle;
	protected JButton jButtonCerrarToolBarComprobanteFacturaDetalle;
	
	protected JButton jButtonProcesarInformacionToolBarComprobanteFacturaDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemModificarComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemActualizarComprobanteFacturaDetalle;
    protected JMenuItem jMenuItemEliminarComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemCancelarComprobanteFacturaDetalle;
    protected JMenuItem jMenuItemGuardarCambiosComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemCerrarComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemDetalleCerrarComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle;
	
	protected JMenuItem jMenuItemProcesarInformacionComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemMostrarOcultarComprobanteFacturaDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComprobanteFacturaDetalle;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComprobanteFacturaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComprobanteFacturaDetalle;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComprobanteFacturaDetalle;
	public JLabel jLabelIdComprobanteFacturaDetalle;
	public JLabel jLabelidComprobanteFacturaDetalle;
	public JButton jButtonidComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioComprobanteFacturaDetalle;
	public JLabel jLabelfecha_inicioComprobanteFacturaDetalle;
	//public JFormattedTextField jDateChooserfecha_inicioComprobanteFacturaDetalle;

	public JDateChooser jDateChooserfecha_inicioComprobanteFacturaDetalle;
	public JButton jButtonfecha_inicioComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finComprobanteFacturaDetalle;
	public JLabel jLabelfecha_finComprobanteFacturaDetalle;
	//public JFormattedTextField jDateChooserfecha_finComprobanteFacturaDetalle;

	public JDateChooser jDateChooserfecha_finComprobanteFacturaDetalle;
	public JButton jButtonfecha_finComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialComprobanteFacturaDetalle;
	public JLabel jLabelsecuencialComprobanteFacturaDetalle;
	public JTextField jTextFieldsecuencialComprobanteFacturaDetalle;
	public JButton jButtonsecuencialComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelfechaComprobanteFacturaDetalle;
	public JLabel jLabelfechaComprobanteFacturaDetalle;
	//public JFormattedTextField jDateChooserfechaComprobanteFacturaDetalle;

	public JDateChooser jDateChooserfechaComprobanteFacturaDetalle;
	public JButton jButtonfechaComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteComprobanteFacturaDetalle;
	public JLabel jLabelnombre_clienteComprobanteFacturaDetalle;
	public JTextArea jTextAreanombre_clienteComprobanteFacturaDetalle;
	public JScrollPane jscrollPanenombre_clienteComprobanteFacturaDetalle;
	public JButton jButtonnombre_clienteComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoComprobanteFacturaDetalle;
	public JLabel jLabeldescuentoComprobanteFacturaDetalle;
	public JTextField jTextFielddescuentoComprobanteFacturaDetalle;
	public JButton jButtondescuentoComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalComprobanteFacturaDetalle;
	public JLabel jLabelsubtotalComprobanteFacturaDetalle;
	public JTextField jTextFieldsubtotalComprobanteFacturaDetalle;
	public JButton jButtonsubtotalComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPaneltotalComprobanteFacturaDetalle;
	public JLabel jLabeltotalComprobanteFacturaDetalle;
	public JTextField jTextFieldtotalComprobanteFacturaDetalle;
	public JButton jButtontotalComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaComprobanteFacturaDetalle;
	public JLabel jLabelnombre_bodegaComprobanteFacturaDetalle;
	public JTextArea jTextAreanombre_bodegaComprobanteFacturaDetalle;
	public JScrollPane jscrollPanenombre_bodegaComprobanteFacturaDetalle;
	public JButton jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoComprobanteFacturaDetalle;
	public JLabel jLabelnombre_productoComprobanteFacturaDetalle;
	public JTextArea jTextAreanombre_productoComprobanteFacturaDetalle;
	public JScrollPane jscrollPanenombre_productoComprobanteFacturaDetalle;
	public JButton jButtonnombre_productoComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelcantidadComprobanteFacturaDetalle;
	public JLabel jLabelcantidadComprobanteFacturaDetalle;
	public JTextField jTextFieldcantidadComprobanteFacturaDetalle;
	public JButton jButtoncantidadComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelprecioComprobanteFacturaDetalle;
	public JLabel jLabelprecioComprobanteFacturaDetalle;
	public JTextField jTextFieldprecioComprobanteFacturaDetalle;
	public JButton jButtonprecioComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_productoComprobanteFacturaDetalle;
	public JLabel jLabeldescuento_productoComprobanteFacturaDetalle;
	public JTextField jTextFielddescuento_productoComprobanteFacturaDetalle;
	public JButton jButtondescuento_productoComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelivaComprobanteFacturaDetalle;
	public JLabel jLabelivaComprobanteFacturaDetalle;
	public JTextField jTextFieldivaComprobanteFacturaDetalle;
	public JButton jButtonivaComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelserieComprobanteFacturaDetalle;
	public JLabel jLabelserieComprobanteFacturaDetalle;
	public JTextField jTextFieldserieComprobanteFacturaDetalle;
	public JButton jButtonserieComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionComprobanteFacturaDetalle;
	public JLabel jLabeldescripcionComprobanteFacturaDetalle;
	public JTextArea jTextAreadescripcionComprobanteFacturaDetalle;
	public JScrollPane jscrollPanedescripcionComprobanteFacturaDetalle;
	public JButton jButtondescripcionComprobanteFacturaDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComprobanteFacturaDetalle;
	public JLabel jLabelid_empresaComprobanteFacturaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComprobanteFacturaDetalle;
	public JButton jButtonid_empresaComprobanteFacturaDetalle= new JButtonMe();
	public JButton jButtonid_empresaComprobanteFacturaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_empresaComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalComprobanteFacturaDetalle;
	public JLabel jLabelid_sucursalComprobanteFacturaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalComprobanteFacturaDetalle;
	public JButton jButtonid_sucursalComprobanteFacturaDetalle= new JButtonMe();
	public JButton jButtonid_sucursalComprobanteFacturaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_sucursalComprobanteFacturaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteComprobanteFacturaDetalle;
	public JLabel jLabelid_clienteComprobanteFacturaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteComprobanteFacturaDetalle;
	public JButton jButtonid_clienteComprobanteFacturaDetalle= new JButtonMe();
	public JButton jButtonid_clienteComprobanteFacturaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_clienteComprobanteFacturaDetalleBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComprobanteFacturaDetalle;
	
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
	
	public ComprobanteFacturaDetalleDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComprobanteFacturaDetalle=new JPanel();
				this.jPanelAccionesFormularioComprobanteFacturaDetalle=new JPanel();
				this.jmenuBarDetalleComprobanteFacturaDetalle=new JMenuBar();
				this.jTtoolBarDetalleComprobanteFacturaDetalle=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaDetalleDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComprobanteFacturaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComprobanteFacturaDetalleDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComprobanteFacturaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaDetalleDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFacturaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaDetalleDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFacturaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaDetalleDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComprobanteFacturaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComprobanteFacturaDetalle() {
		return this.jButtonActualizarToolBarComprobanteFacturaDetalle;
	}
	
	public JButton getjButtonEliminarToolBarComprobanteFacturaDetalle() {
		return this.jButtonEliminarToolBarComprobanteFacturaDetalle;
	}
	
	public JButton getjButtonCancelarToolBarComprobanteFacturaDetalle() {
		return this.jButtonCancelarToolBarComprobanteFacturaDetalle;
	}		
	
	public JButton getjButtonProcesarInformacionComprobanteFacturaDetalle() {
		return this.jButtonProcesarInformacionComprobanteFacturaDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComprobanteFacturaDetalle)	{
		this.jButtonProcesarInformacionComprobanteFacturaDetalle = jButtonProcesarInformacionComprobanteFacturaDetalle;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComprobanteFacturaDetalle() {
		return this.jComboBoxTiposAccionesComprobanteFacturaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComprobanteFacturaDetalle(
			JComboBox jComboBoxTiposRelacionesComprobanteFacturaDetalle) {
		this.jComboBoxTiposRelacionesComprobanteFacturaDetalle = jComboBoxTiposRelacionesComprobanteFacturaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComprobanteFacturaDetalle(
			JComboBox jComboBoxTiposAccionesComprobanteFacturaDetalle) {
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle = jComboBoxTiposAccionesComprobanteFacturaDetalle;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComprobanteFacturaDetalle() {
		return this.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComprobanteFacturaDetalle(
			JComboBox jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle) {
		this.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle = jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comprobantefacturadetalleSessionBean=new ComprobanteFacturaDetalleSessionBean();
		
		this.comprobantefacturadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantefacturadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComprobanteFacturaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComprobanteFacturaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComprobanteFacturaDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comprobante Factura Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
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
	
		ComprobanteFacturaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComprobanteFacturaDetalle= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComprobanteFacturaDetalle=new JButtonMe();
				this.jButtonModificarToolBarComprobanteFacturaDetalle=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComprobanteFacturaDetalle,this.jTtoolBarDetalleComprobanteFacturaDetalle,
							"actualizar","actualizar","Actualizar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComprobanteFacturaDetalle,this.jTtoolBarDetalleComprobanteFacturaDetalle,
							"eliminar","eliminar","Eliminar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComprobanteFacturaDetalle,this.jTtoolBarDetalleComprobanteFacturaDetalle,
							"cancelar","cancelar","Cancelar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComprobanteFacturaDetalle,this.jTtoolBarDetalleComprobanteFacturaDetalle,
							"guardarcambios","guardarcambios","Guardar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComprobanteFacturaDetalle=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComprobanteFacturaDetalle=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComprobanteFacturaDetalle=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComprobanteFacturaDetalle=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComprobanteFacturaDetalle=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComprobanteFacturaDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComprobanteFacturaDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComprobanteFacturaDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComprobanteFacturaDetalle= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComprobanteFacturaDetalle.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComprobanteFacturaDetalle,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComprobanteFacturaDetalle= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComprobanteFacturaDetalle.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComprobanteFacturaDetalle,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComprobanteFacturaDetalle= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComprobanteFacturaDetalle.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComprobanteFacturaDetalle,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComprobanteFacturaDetalle= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComprobanteFacturaDetalle.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComprobanteFacturaDetalle,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComprobanteFacturaDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComprobanteFacturaDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComprobanteFacturaDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComprobanteFacturaDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComprobanteFacturaDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComprobanteFacturaDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComprobanteFacturaDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComprobanteFacturaDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComprobanteFacturaDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComprobanteFacturaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComprobanteFacturaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComprobanteFacturaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComprobanteFacturaDetalle.add(this.jMenuItemDetalleCerrarComprobanteFacturaDetalle);
		
		this.jmenuDetalleAccionesComprobanteFacturaDetalle.add(this.jMenuItemActualizarComprobanteFacturaDetalle);
		this.jmenuDetalleAccionesComprobanteFacturaDetalle.add(this.jMenuItemEliminarComprobanteFacturaDetalle);
		this.jmenuDetalleAccionesComprobanteFacturaDetalle.add(this.jMenuItemCancelarComprobanteFacturaDetalle);		
		
		//this.jmenuDetalleDatosComprobanteFacturaDetalle.add(this.jMenuItemDetalleAbrirOrderByComprobanteFacturaDetalle);				
		this.jmenuDetalleDatosComprobanteFacturaDetalle.add(this.jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle);				
				
		//this.jmenuDetalleAccionesComprobanteFacturaDetalle.add(this.jMenuItemGuardarCambiosComprobanteFacturaDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComprobanteFacturaDetalle.add(this.jmenuDetalleArchivoComprobanteFacturaDetalle);		
		this.jmenuBarDetalleComprobanteFacturaDetalle.add(this.jmenuDetalleAccionesComprobanteFacturaDetalle);		
		this.jmenuBarDetalleComprobanteFacturaDetalle.add(this.jmenuDetalleDatosComprobanteFacturaDetalle);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComprobanteFacturaDetalle);				
	}
	
	
	public void inicializarElementosCamposComprobanteFacturaDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComprobanteFacturaDetalle = new JLabelMe();
		jLabelIdComprobanteFacturaDetalle.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComprobanteFacturaDetalle = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComprobanteFacturaDetalle= new GridBagLayout();

		this.jPanelidComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);

		jLabelidComprobanteFacturaDetalle = new JLabel();
		jLabelidComprobanteFacturaDetalle.setText("Id");

		jLabelidComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelfecha_inicioComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioComprobanteFacturaDetalle.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelfecha_inicioComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		//jFormattedTextFieldfecha_inicioComprobanteFacturaDetalle= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioComprobanteFacturaDetalle= new JDateChooser();
		jDateChooserfecha_inicioComprobanteFacturaDetalle.setEnabled(false);
		jDateChooserfecha_inicioComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioComprobanteFacturaDetalle.setDate(new Date());
		jDateChooserfecha_inicioComprobanteFacturaDetalle.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioComprobanteFacturaDetalle.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelfecha_finComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finComprobanteFacturaDetalle.setToolTipText("Fecha Fin");
		this.jLabelfecha_finComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelfecha_finComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		//jFormattedTextFieldfecha_finComprobanteFacturaDetalle= new JFormattedTextFieldMe();

		jDateChooserfecha_finComprobanteFacturaDetalle= new JDateChooser();
		jDateChooserfecha_finComprobanteFacturaDetalle.setEnabled(false);
		jDateChooserfecha_finComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finComprobanteFacturaDetalle.setDate(new Date());
		jDateChooserfecha_finComprobanteFacturaDetalle.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finComprobanteFacturaDetalle.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonfecha_finComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonfecha_finComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelsecuencialComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialComprobanteFacturaDetalle.setToolTipText("Secuencial");
		this.jLabelsecuencialComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelsecuencialComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextFieldsecuencialComprobanteFacturaDetalle= new JTextFieldMe();

		jTextFieldsecuencialComprobanteFacturaDetalle.setEnabled(false);
		jTextFieldsecuencialComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonsecuencialComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonsecuencialComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelfechaComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelfechaComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaComprobanteFacturaDetalle.setToolTipText("Fecha");
		this.jLabelfechaComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelfechaComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		//jFormattedTextFieldfechaComprobanteFacturaDetalle= new JFormattedTextFieldMe();

		jDateChooserfechaComprobanteFacturaDetalle= new JDateChooser();
		jDateChooserfechaComprobanteFacturaDetalle.setEnabled(false);
		jDateChooserfechaComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaComprobanteFacturaDetalle.setDate(new Date());
		jDateChooserfechaComprobanteFacturaDetalle.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaComprobanteFacturaDetalle.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonfechaComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonfechaComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelnombre_clienteComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteComprobanteFacturaDetalle.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelnombre_clienteComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextAreanombre_clienteComprobanteFacturaDetalle= new JTextAreaMe();
		jTextAreanombre_clienteComprobanteFacturaDetalle.setEnabled(false);
		jTextAreanombre_clienteComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteComprobanteFacturaDetalle.setLineWrap(true);
		jTextAreanombre_clienteComprobanteFacturaDetalle.setWrapStyleWord(true);
		jTextAreanombre_clienteComprobanteFacturaDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteComprobanteFacturaDetalle.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteComprobanteFacturaDetalle = new JScrollPane(jTextAreanombre_clienteComprobanteFacturaDetalle);
		jscrollPanenombre_clienteComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoComprobanteFacturaDetalle = new JLabelMe();
		this.jLabeldescuentoComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoComprobanteFacturaDetalle.setToolTipText("Descuento");
		this.jLabeldescuentoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPaneldescuentoComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextFielddescuentoComprobanteFacturaDetalle= new JTextFieldMe();
		jTextFielddescuentoComprobanteFacturaDetalle.setEnabled(false);
		jTextFielddescuentoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoComprobanteFacturaDetalle.setText("0.0");

		this.jButtondescuentoComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtondescuentoComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtondescuentoComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelsubtotalComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsubtotalComprobanteFacturaDetalle.setToolTipText("Subtotal");
		this.jLabelsubtotalComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelsubtotalComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextFieldsubtotalComprobanteFacturaDetalle= new JTextFieldMe();
		jTextFieldsubtotalComprobanteFacturaDetalle.setEnabled(false);
		jTextFieldsubtotalComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalComprobanteFacturaDetalle.setText("0.0");

		this.jButtonsubtotalComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonsubtotalComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonsubtotalComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabeltotalComprobanteFacturaDetalle = new JLabelMe();
		this.jLabeltotalComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalComprobanteFacturaDetalle.setToolTipText("Total");
		this.jLabeltotalComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPaneltotalComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextFieldtotalComprobanteFacturaDetalle= new JTextFieldMe();
		jTextFieldtotalComprobanteFacturaDetalle.setEnabled(false);
		jTextFieldtotalComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalComprobanteFacturaDetalle.setText("0.0");

		this.jButtontotalComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtontotalComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtontotalComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelnombre_bodegaComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaComprobanteFacturaDetalle.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelnombre_bodegaComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextAreanombre_bodegaComprobanteFacturaDetalle= new JTextAreaMe();
		jTextAreanombre_bodegaComprobanteFacturaDetalle.setEnabled(false);
		jTextAreanombre_bodegaComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaComprobanteFacturaDetalle.setLineWrap(true);
		jTextAreanombre_bodegaComprobanteFacturaDetalle.setWrapStyleWord(true);
		jTextAreanombre_bodegaComprobanteFacturaDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaComprobanteFacturaDetalle.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaComprobanteFacturaDetalle = new JScrollPane(jTextAreanombre_bodegaComprobanteFacturaDetalle);
		jscrollPanenombre_bodegaComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelnombre_productoComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoComprobanteFacturaDetalle.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelnombre_productoComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextAreanombre_productoComprobanteFacturaDetalle= new JTextAreaMe();
		jTextAreanombre_productoComprobanteFacturaDetalle.setEnabled(false);
		jTextAreanombre_productoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoComprobanteFacturaDetalle.setLineWrap(true);
		jTextAreanombre_productoComprobanteFacturaDetalle.setWrapStyleWord(true);
		jTextAreanombre_productoComprobanteFacturaDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoComprobanteFacturaDetalle.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoComprobanteFacturaDetalle = new JScrollPane(jTextAreanombre_productoComprobanteFacturaDetalle);
		jscrollPanenombre_productoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonnombre_productoComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonnombre_productoComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelcantidadComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelcantidadComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadComprobanteFacturaDetalle.setToolTipText("Cantad");
		this.jLabelcantidadComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelcantidadComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextFieldcantidadComprobanteFacturaDetalle= new JTextFieldMe();
		jTextFieldcantidadComprobanteFacturaDetalle.setEnabled(false);
		jTextFieldcantidadComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadComprobanteFacturaDetalle.setText("0");

		this.jButtoncantidadComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtoncantidadComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtoncantidadComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelprecioComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelprecioComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioComprobanteFacturaDetalle.setToolTipText("Precio");
		this.jLabelprecioComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelprecioComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextFieldprecioComprobanteFacturaDetalle= new JTextFieldMe();
		jTextFieldprecioComprobanteFacturaDetalle.setEnabled(false);
		jTextFieldprecioComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioComprobanteFacturaDetalle.setText("0.0");

		this.jButtonprecioComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonprecioComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonprecioComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_productoComprobanteFacturaDetalle = new JLabelMe();
		this.jLabeldescuento_productoComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO+" : *");
		this.jLabeldescuento_productoComprobanteFacturaDetalle.setToolTipText("Descuento Producto");
		this.jLabeldescuento_productoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_productoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_productoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_productoComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_productoComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_productoComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPaneldescuento_productoComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextFielddescuento_productoComprobanteFacturaDetalle= new JTextFieldMe();
		jTextFielddescuento_productoComprobanteFacturaDetalle.setEnabled(false);
		jTextFielddescuento_productoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_productoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_productoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_productoComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_productoComprobanteFacturaDetalle.setText("0.0");

		this.jButtondescuento_productoComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtondescuento_productoComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_productoComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_productoComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_productoComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtondescuento_productoComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_productoComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_productoComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_productoComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_productoComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_productoComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_productoComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelivaComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelivaComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaComprobanteFacturaDetalle.setToolTipText("Iva");
		this.jLabelivaComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelivaComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextFieldivaComprobanteFacturaDetalle= new JTextFieldMe();
		jTextFieldivaComprobanteFacturaDetalle.setEnabled(false);
		jTextFieldivaComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaComprobanteFacturaDetalle.setText("0.0");

		this.jButtonivaComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonivaComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonivaComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelserieComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelserieComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE+" : *");
		this.jLabelserieComprobanteFacturaDetalle.setToolTipText("Serie");
		this.jLabelserieComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelserieComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextFieldserieComprobanteFacturaDetalle= new JTextFieldMe();

		jTextFieldserieComprobanteFacturaDetalle.setEnabled(false);
		jTextFieldserieComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonserieComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonserieComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieComprobanteFacturaDetalleBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionComprobanteFacturaDetalle = new JLabelMe();
		this.jLabeldescripcionComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionComprobanteFacturaDetalle.setToolTipText("Descripcion");
		this.jLabeldescripcionComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPaneldescripcionComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jTextAreadescripcionComprobanteFacturaDetalle= new JTextAreaMe();
		jTextAreadescripcionComprobanteFacturaDetalle.setEnabled(false);
		jTextAreadescripcionComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComprobanteFacturaDetalle.setLineWrap(true);
		jTextAreadescripcionComprobanteFacturaDetalle.setWrapStyleWord(true);
		jTextAreadescripcionComprobanteFacturaDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionComprobanteFacturaDetalle.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionComprobanteFacturaDetalle = new JScrollPane(jTextAreadescripcionComprobanteFacturaDetalle);
		jscrollPanedescripcionComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtondescripcionComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtondescripcionComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionComprobanteFacturaDetalleBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComprobanteFacturaDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelid_empresaComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComprobanteFacturaDetalle.setToolTipText("Empresa");
		this.jLabelid_empresaComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelid_empresaComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jComboBoxid_empresaComprobanteFacturaDetalle= new JComboBoxMe();
		jComboBoxid_empresaComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComprobanteFacturaDetalle.setEnabled(false);

		this.jButtonid_empresaComprobanteFacturaDetalle= new JButtonMe();
		this.jButtonid_empresaComprobanteFacturaDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteFacturaDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteFacturaDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobanteFacturaDetalle.setText("Buscar");
		this.jButtonid_empresaComprobanteFacturaDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComprobanteFacturaDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteFacturaDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteFacturaDetalle"));

		this.jButtonid_empresaComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonid_empresaComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonid_empresaComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComprobanteFacturaDetalleBusqueda.setVisible(false);		}

		this.jButtonid_empresaComprobanteFacturaDetalleUpdate= new JButtonMe();
		this.jButtonid_empresaComprobanteFacturaDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFacturaDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobanteFacturaDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComprobanteFacturaDetalleUpdate.setText("U");
		this.jButtonid_empresaComprobanteFacturaDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComprobanteFacturaDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobanteFacturaDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobanteFacturaDetalleUpdate"));



					
		this.jLabelid_sucursalComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelid_sucursalComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalComprobanteFacturaDetalle.setToolTipText("Sucursal");
		this.jLabelid_sucursalComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelid_sucursalComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jComboBoxid_sucursalComprobanteFacturaDetalle= new JComboBoxMe();
		jComboBoxid_sucursalComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalComprobanteFacturaDetalle.setEnabled(false);

		this.jButtonid_sucursalComprobanteFacturaDetalle= new JButtonMe();
		this.jButtonid_sucursalComprobanteFacturaDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobanteFacturaDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobanteFacturaDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobanteFacturaDetalle.setText("Buscar");
		this.jButtonid_sucursalComprobanteFacturaDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalComprobanteFacturaDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobanteFacturaDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobanteFacturaDetalle"));

		this.jButtonid_sucursalComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonid_sucursalComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonid_sucursalComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalComprobanteFacturaDetalleBusqueda.setVisible(false);		}

		this.jButtonid_sucursalComprobanteFacturaDetalleUpdate= new JButtonMe();
		this.jButtonid_sucursalComprobanteFacturaDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteFacturaDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobanteFacturaDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalComprobanteFacturaDetalleUpdate.setText("U");
		this.jButtonid_sucursalComprobanteFacturaDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalComprobanteFacturaDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobanteFacturaDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobanteFacturaDetalleUpdate"));



					
		this.jLabelid_clienteComprobanteFacturaDetalle = new JLabelMe();
		this.jLabelid_clienteComprobanteFacturaDetalle.setText(""+ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteComprobanteFacturaDetalle.setToolTipText("Cliente");
		this.jLabelid_clienteComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteComprobanteFacturaDetalle.setToolTipText(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		this.jPanelid_clienteComprobanteFacturaDetalle.setLayout(this.gridaBagLayoutComprobanteFacturaDetalle);


		jComboBoxid_clienteComprobanteFacturaDetalle= new JComboBoxMe();
		jComboBoxid_clienteComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_clienteComprobanteFacturaDetalle.setEnabled(false);

		this.jButtonid_clienteComprobanteFacturaDetalle= new JButtonMe();
		this.jButtonid_clienteComprobanteFacturaDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteFacturaDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteFacturaDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteComprobanteFacturaDetalle.setText("Buscar");
		this.jButtonid_clienteComprobanteFacturaDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteComprobanteFacturaDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteFacturaDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteFacturaDetalle"));

		this.jButtonid_clienteComprobanteFacturaDetalleBusqueda= new JButtonMe();
		this.jButtonid_clienteComprobanteFacturaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFacturaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFacturaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteComprobanteFacturaDetalleBusqueda.setText("U");
		this.jButtonid_clienteComprobanteFacturaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteComprobanteFacturaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteFacturaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteFacturaDetalleBusqueda"));

		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteComprobanteFacturaDetalleBusqueda.setVisible(false);		}

		this.jButtonid_clienteComprobanteFacturaDetalleUpdate= new JButtonMe();
		this.jButtonid_clienteComprobanteFacturaDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFacturaDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteComprobanteFacturaDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteComprobanteFacturaDetalleUpdate.setText("U");
		this.jButtonid_clienteComprobanteFacturaDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteComprobanteFacturaDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteComprobanteFacturaDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteComprobanteFacturaDetalleUpdate"));



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
		//this.jInternalFrameDetalleComprobanteFacturaDetalle = new ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comprobante Factura Detalle DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComprobanteFacturaDetalle= new GridBagLayout();
		

		
		String sToolTipComprobanteFacturaDetalle="";
		sToolTipComprobanteFacturaDetalle=ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComprobanteFacturaDetalle+="(PuntoVenta.ComprobanteFacturaDetalle)";
		}
		
		if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipComprobanteFacturaDetalle+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonModificarComprobanteFacturaDetalle = new JButtonMe();
        this.jButtonActualizarComprobanteFacturaDetalle = new JButtonMe();
        this.jButtonEliminarComprobanteFacturaDetalle = new JButtonMe();
        this.jButtonCancelarComprobanteFacturaDetalle = new JButtonMe();
        this.jButtonGuardarCambiosComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonCerrarComprobanteFacturaDetalle = new JButtonMe();
		
		this.jScrollPanelDatosComprobanteFacturaDetalle = new JScrollPane();   
        this.jScrollPanelDatosEdicionComprobanteFacturaDetalle = new JScrollPane();
		this.jScrollPanelDatosGeneralComprobanteFacturaDetalle = new JScrollPane();
				
		
		
		this.jPanelCamposComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comprobante Factura Detalle";
		
		if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Factura Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosComprobanteFacturaDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComprobanteFacturaDetalle.setName("jPanelCamposComprobanteFacturaDetalle"); 

		this.jPanelCamposOcultosComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComprobanteFacturaDetalle.setName("jPanelCamposOcultosComprobanteFacturaDetalle"); 

        this.jPanelAccionesComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComprobanteFacturaDetalle.setToolTipText("Acciones");
        this.jPanelAccionesComprobanteFacturaDetalle.setName("Acciones"); 

		this.jPanelAccionesFormularioComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComprobanteFacturaDetalle.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComprobanteFacturaDetalle.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComprobanteFacturaDetalle.setText("Nuevo");
		this.jButtonModificarComprobanteFacturaDetalle.setText("Editar");
        this.jButtonActualizarComprobanteFacturaDetalle.setText("Actualizar");
        this.jButtonEliminarComprobanteFacturaDetalle.setText("Eliminar");
        this.jButtonCancelarComprobanteFacturaDetalle.setText("Cancelar");
        this.jButtonGuardarCambiosComprobanteFacturaDetalle.setText("Guardar");
		this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.setText("Guardar");
		this.jButtonCerrarComprobanteFacturaDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComprobanteFacturaDetalle,"nuevo_button","Nuevo",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComprobanteFacturaDetalle,"modificar_button","Editar",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComprobanteFacturaDetalle,"actualizar_button","Actualizar",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComprobanteFacturaDetalle,"eliminar_button","Eliminar",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComprobanteFacturaDetalle,"cancelar_button","Cancelar",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComprobanteFacturaDetalle,"guardarcambios_button","Guardar",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle,"guardarcambiostabla_button","Guardar",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComprobanteFacturaDetalle,"cerrar_button","Salir",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComprobanteFacturaDetalle.setToolTipText("Nuevo"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComprobanteFacturaDetalle.setToolTipText("Editar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComprobanteFacturaDetalle.setToolTipText("Actualizar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComprobanteFacturaDetalle.setToolTipText("Eliminar)"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComprobanteFacturaDetalle.setToolTipText("Cancelar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComprobanteFacturaDetalle.setToolTipText("Guardar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.setToolTipText("Guardar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComprobanteFacturaDetalle.setToolTipText("Salir"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComprobanteFacturaDetalle";
		inputMap = this.jButtonNuevoComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComprobanteFacturaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComprobanteFacturaDetalle"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComprobanteFacturaDetalle";
		inputMap = this.jButtonActualizarComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComprobanteFacturaDetalle"));
		
		//ELIMINAR
		sMapKey = "EliminarComprobanteFacturaDetalle";
		inputMap = this.jButtonEliminarComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComprobanteFacturaDetalle"));
		
		//CANCELAR	
		sMapKey = "CancelarComprobanteFacturaDetalle";
		inputMap = this.jButtonCancelarComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComprobanteFacturaDetalle"));
		
		//CERRAR		
		sMapKey = "CerrarComprobanteFacturaDetalle";
		inputMap = this.jButtonCerrarComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComprobanteFacturaDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComprobanteFacturaDetalle";
		inputMap = this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComprobanteFacturaDetalle"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComprobanteFacturaDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComprobanteFacturaDetalle.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComprobanteFacturaDetalle.setToolTipText("Nuevo ComprobanteFacturaDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComprobanteFacturaDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComprobanteFacturaDetalle.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComprobanteFacturaDetalle.setToolTipText("Sin Cerrar Ventana ComprobanteFacturaDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComprobanteFacturaDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComprobanteFacturaDetalle.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComprobanteFacturaDetalle.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setText("Accion");
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComprobanteFacturaDetalle = new JLabelMe();
		
		this.jLabelAccionesComprobanteFacturaDetalle.setText("Acciones");		
		this.jLabelAccionesComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComprobanteFacturaDetalle();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComprobanteFacturaDetalle();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComprobanteFacturaDetalle=new JTabbedPane();
		this.jTabbedPaneRelacionesComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComprobanteFacturaDetalle = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComprobanteFacturaDetalle = new GridBagLayout();
		
		this.jPanelCamposComprobanteFacturaDetalle.setLayout(gridaBagLayoutCamposComprobanteFacturaDetalle);
		this.jPanelCamposOcultosComprobanteFacturaDetalle.setLayout(gridaBagLayoutCamposOcultosComprobanteFacturaDetalle);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComprobanteFacturaDetalle.add(jLabelIdComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComprobanteFacturaDetalle.add(jLabelidComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComprobanteFacturaDetalle.add(jLabelid_empresaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComprobanteFacturaDetalle.add(jButtonid_empresaComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 3;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComprobanteFacturaDetalle.add(jButtonid_empresaComprobanteFacturaDetalleUpdate, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComprobanteFacturaDetalle.add(jComboBoxid_empresaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalComprobanteFacturaDetalle.add(jLabelid_sucursalComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalComprobanteFacturaDetalle.add(jButtonid_sucursalComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 3;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalComprobanteFacturaDetalle.add(jButtonid_sucursalComprobanteFacturaDetalleUpdate, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalComprobanteFacturaDetalle.add(jComboBoxid_sucursalComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteComprobanteFacturaDetalle.add(jLabelid_clienteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteComprobanteFacturaDetalle.add(jButtonid_clienteComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 3;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteComprobanteFacturaDetalle.add(jButtonid_clienteComprobanteFacturaDetalleUpdate, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteComprobanteFacturaDetalle.add(jComboBoxid_clienteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioComprobanteFacturaDetalle.add(jLabelfecha_inicioComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioComprobanteFacturaDetalle.add(jButtonfecha_inicioComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioComprobanteFacturaDetalle.add(jDateChooserfecha_inicioComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finComprobanteFacturaDetalle.add(jLabelfecha_finComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finComprobanteFacturaDetalle.add(jButtonfecha_finComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finComprobanteFacturaDetalle.add(jDateChooserfecha_finComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialComprobanteFacturaDetalle.add(jLabelsecuencialComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialComprobanteFacturaDetalle.add(jButtonsecuencialComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialComprobanteFacturaDetalle.add(jTextFieldsecuencialComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaComprobanteFacturaDetalle.add(jLabelfechaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaComprobanteFacturaDetalle.add(jButtonfechaComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaComprobanteFacturaDetalle.add(jDateChooserfechaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteComprobanteFacturaDetalle.add(jLabelnombre_clienteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteComprobanteFacturaDetalle.add(jButtonnombre_clienteComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteComprobanteFacturaDetalle.add(jscrollPanenombre_clienteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoComprobanteFacturaDetalle.add(jLabeldescuentoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoComprobanteFacturaDetalle.add(jButtondescuentoComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoComprobanteFacturaDetalle.add(jTextFielddescuentoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsubtotalComprobanteFacturaDetalle.add(jLabelsubtotalComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalComprobanteFacturaDetalle.add(jButtonsubtotalComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsubtotalComprobanteFacturaDetalle.add(jTextFieldsubtotalComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalComprobanteFacturaDetalle.add(jLabeltotalComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalComprobanteFacturaDetalle.add(jButtontotalComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalComprobanteFacturaDetalle.add(jTextFieldtotalComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaComprobanteFacturaDetalle.add(jLabelnombre_bodegaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaComprobanteFacturaDetalle.add(jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaComprobanteFacturaDetalle.add(jscrollPanenombre_bodegaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoComprobanteFacturaDetalle.add(jLabelnombre_productoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoComprobanteFacturaDetalle.add(jButtonnombre_productoComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoComprobanteFacturaDetalle.add(jscrollPanenombre_productoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadComprobanteFacturaDetalle.add(jLabelcantidadComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadComprobanteFacturaDetalle.add(jButtoncantidadComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadComprobanteFacturaDetalle.add(jTextFieldcantidadComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioComprobanteFacturaDetalle.add(jLabelprecioComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioComprobanteFacturaDetalle.add(jButtonprecioComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioComprobanteFacturaDetalle.add(jTextFieldprecioComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_productoComprobanteFacturaDetalle.add(jLabeldescuento_productoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_productoComprobanteFacturaDetalle.add(jButtondescuento_productoComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_productoComprobanteFacturaDetalle.add(jTextFielddescuento_productoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaComprobanteFacturaDetalle.add(jLabelivaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaComprobanteFacturaDetalle.add(jButtonivaComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaComprobanteFacturaDetalle.add(jTextFieldivaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieComprobanteFacturaDetalle.add(jLabelserieComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieComprobanteFacturaDetalle.add(jButtonserieComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieComprobanteFacturaDetalle.add(jTextFieldserieComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionComprobanteFacturaDetalle.add(jLabeldescripcionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 2;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionComprobanteFacturaDetalle.add(jButtondescripcionComprobanteFacturaDetalleBusqueda, this.gridBagConstraintsComprobanteFacturaDetalle);
	}

	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionComprobanteFacturaDetalle.add(jscrollPanedescripcionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelidComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelfecha_inicioComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelfecha_finComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelsecuencialComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelfechaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelnombre_clienteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPaneldescuentoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelsubtotalComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPaneltotalComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelnombre_bodegaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelnombre_productoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelcantidadComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelprecioComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPaneldescuento_productoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelivaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPanelserieComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobanteFacturaDetalle.add(this.jPaneldescripcionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposComprobanteFacturaDetalle=0;
		iYPanelCamposComprobanteFacturaDetalle++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposOcultosComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposOcultosComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteFacturaDetalle.add(this.jPanelid_empresaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposOcultosComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposOcultosComprobanteFacturaDetalle=0;
		iYPanelCamposOcultosComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposOcultosComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposOcultosComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteFacturaDetalle.add(this.jPanelid_sucursalComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposOcultosComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposOcultosComprobanteFacturaDetalle=0;
		iYPanelCamposOcultosComprobanteFacturaDetalle++;
	}
	this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iYPanelCamposOcultosComprobanteFacturaDetalle;
	this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iXPanelCamposOcultosComprobanteFacturaDetalle++;
	this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobanteFacturaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobanteFacturaDetalle.add(this.jPanelid_clienteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);



	if(iXPanelCamposOcultosComprobanteFacturaDetalle % 2==0) {
		iXPanelCamposOcultosComprobanteFacturaDetalle=0;
		iYPanelCamposOcultosComprobanteFacturaDetalle++;
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
			
		GridBagLayout gridaBagLayoutAccionesComprobanteFacturaDetalle= new GridBagLayout();
		this.jPanelAccionesComprobanteFacturaDetalle.setLayout(gridaBagLayoutAccionesComprobanteFacturaDetalle);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComprobanteFacturaDetalle= new GridBagLayout();
		this.jPanelAccionesFormularioComprobanteFacturaDetalle.setLayout(gridaBagLayoutAccionesFormularioComprobanteFacturaDetalle);
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComprobanteFacturaDetalle.add(this.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccion++;
			
		this.jPanelAccionesComprobanteFacturaDetalle.add(this.jButtonModificarComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);							

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iPosXAccion++;
			
		this.jPanelAccionesComprobanteFacturaDetalle.add(this.jButtonEliminarComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
			
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesComprobanteFacturaDetalle.add(this.jButtonActualizarComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesComprobanteFacturaDetalle.add(this.jButtonGuardarCambiosComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);	
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iPosXAccion++;
		
		this.jPanelAccionesComprobanteFacturaDetalle.add(this.jButtonCancelarComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComprobanteFacturaDetalle);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();						
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;		
			//this.gridBagConstraintsComprobanteFacturaDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx =0;
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComprobanteFacturaDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComprobanteFacturaDetalleJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComprobanteFacturaDetalle = new ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comprobante Factura Detalle DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comprobante Factura Detalle DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comprobante Factura Detalle Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComprobanteFacturaDetalleModel comprobantefacturadetalleModel=new ComprobanteFacturaDetalleModel(this);
			
			//SI USARA CLASE INTERNA
			//ComprobanteFacturaDetalleModel.ComprobanteFacturaDetalleFocusTraversalPolicy comprobantefacturadetalleFocusTraversalPolicy = comprobantefacturadetalleModel.new ComprobanteFacturaDetalleFocusTraversalPolicy(this);
			
			//comprobantefacturadetalleFocusTraversalPolicy.setcomprobantefacturadetalleJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comprobantefacturadetalleModel);
			
			
			this.jContentPaneDetalleComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComprobanteFacturaDetalle = new GridBagLayout();	
			this.jContentPaneDetalleComprobanteFacturaDetalle.setLayout(gridaBagLayoutDetalleComprobanteFacturaDetalle);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComprobanteFacturaDetalle = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
				this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
					
				
				this.jContentPaneDetalleComprobanteFacturaDetalle.add(jTtoolBarDetalleComprobanteFacturaDetalle, gridBagConstraintsComprobanteFacturaDetalle);								
				
}
			
			this.jScrollPanelDatosEdicionComprobanteFacturaDetalle=   new JScrollPane(jContentPaneDetalleComprobanteFacturaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComprobanteFacturaDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	        
			this.jContentPaneDetalleComprobanteFacturaDetalle.add(jPanelCamposComprobanteFacturaDetalle, gridBagConstraintsComprobanteFacturaDetalle);
			
			
			
			
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
						//&& comprobantefacturadetalleSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComprobanteFacturaDetalle= new GridBagConstraints();
						this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
						this.jContentPaneDetalleComprobanteFacturaDetalle.add(this.jTabbedPaneRelacionesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComprobanteFacturaDetalle.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComprobanteFacturaDetalle.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
					this.gridBagConstraintsComprobanteFacturaDetalle.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
					
				
					this.jContentPaneDetalleComprobanteFacturaDetalle.add(jPanelCamposOcultosComprobanteFacturaDetalle, gridBagConstraintsComprobanteFacturaDetalle);
				
					this.jPanelCamposOcultosComprobanteFacturaDetalle.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	        this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComprobanteFacturaDetalle.add(this.jPanelAccionesFormularioComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);							
			
			
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
	        this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
	        
			
			this.jContentPaneDetalleComprobanteFacturaDetalle.add(this.jPanelAccionesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComprobanteFacturaDetalle);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComprobanteFacturaDetalle=   new JScrollPane(this.jPanelCamposComprobanteFacturaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComprobanteFacturaDetalle.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);			
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			
			
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
			
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComprobanteFacturaDetalle;//jContentPane;
		
		return jScrollPanelDatosEdicionComprobanteFacturaDetalle;
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
