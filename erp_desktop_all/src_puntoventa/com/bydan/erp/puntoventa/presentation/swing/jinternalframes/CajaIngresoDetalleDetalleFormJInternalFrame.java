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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.CajaIngresoDetalleConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class CajaIngresoDetalleDetalleFormJInternalFrame extends CajaIngresoDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCajaIngresoDetalle;
	
	protected JMenuBar jmenuBarDetalleCajaIngresoDetalle;
	
	protected JMenu jmenuDetalleCajaIngresoDetalle;
	protected JMenu jmenuDetalleArchivoCajaIngresoDetalle;
	protected JMenu jmenuDetalleAccionesCajaIngresoDetalle;
	protected JMenu jmenuDetalleDatosCajaIngresoDetalle;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaIngresoDetalle;	
	protected GridBagConstraints gridBagConstraintsCajaIngresoDetalle;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CajaIngresoDetalleBeanSwingJInternalFrameAdditional jInternalFrameDetalleCajaIngresoDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cajaingreso="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";
	
	public CajaIngresoDetalleSessionBean cajaingresodetalleSessionBean;
	
	
	
	
	public CajaIngresoSessionBean cajaingresoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;	
	
	public CajaIngresoDetalleLogic cajaingresodetalleLogic;
	
	public JScrollPane jScrollPanelDatosCajaIngresoDetalle;
	public JScrollPane jScrollPanelDatosEdicionCajaIngresoDetalle;
	public JScrollPane jScrollPanelDatosGeneralCajaIngresoDetalle;
	
	protected JPanel jPanelCamposCajaIngresoDetalle;    
	protected JPanel jPanelCamposOcultosCajaIngresoDetalle;    	
	protected JPanel jPanelAccionesCajaIngresoDetalle;
	protected JPanel jPanelAccionesFormularioCajaIngresoDetalle;
    
	
	
	protected Integer iXPanelCamposCajaIngresoDetalle=0;
	protected Integer iYPanelCamposCajaIngresoDetalle=0;
	
	protected Integer iXPanelCamposOcultosCajaIngresoDetalle=0;
	protected Integer iYPanelCamposOcultosCajaIngresoDetalle=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCajaIngresoDetalle;
	public JButton jButtonModificarCajaIngresoDetalle;
	public JButton jButtonActualizarCajaIngresoDetalle;
    public JButton jButtonEliminarCajaIngresoDetalle;
	public JButton jButtonCancelarCajaIngresoDetalle;
    public JButton jButtonGuardarCambiosCajaIngresoDetalle;
	public JButton jButtonGuardarCambiosTablaCajaIngresoDetalle;
	protected JButton jButtonCerrarCajaIngresoDetalle;
	
	
	protected JButton jButtonProcesarInformacionCajaIngresoDetalle;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCajaIngresoDetalle;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCajaIngresoDetalle;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCajaIngresoDetalle;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaIngresoDetalle;
	protected JButton jButtonModificarToolBarCajaIngresoDetalle;
	protected JButton jButtonActualizarToolBarCajaIngresoDetalle;
    protected JButton jButtonEliminarToolBarCajaIngresoDetalle;
	protected JButton jButtonCancelarToolBarCajaIngresoDetalle;
    protected JButton jButtonGuardarCambiosToolBarCajaIngresoDetalle;
	protected JButton jButtonGuardarCambiosTablaToolBarCajaIngresoDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaIngresoDetalle;
	protected JButton jButtonCerrarToolBarCajaIngresoDetalle;
	
	protected JButton jButtonProcesarInformacionToolBarCajaIngresoDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaIngresoDetalle;
	protected JMenuItem jMenuItemModificarCajaIngresoDetalle;
	protected JMenuItem jMenuItemActualizarCajaIngresoDetalle;
    protected JMenuItem jMenuItemEliminarCajaIngresoDetalle;
	protected JMenuItem jMenuItemCancelarCajaIngresoDetalle;
    protected JMenuItem jMenuItemGuardarCambiosCajaIngresoDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaIngresoDetalle;
	protected JMenuItem jMenuItemCerrarCajaIngresoDetalle;
	protected JMenuItem jMenuItemDetalleCerrarCajaIngresoDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaIngresoDetalle;
	
	protected JMenuItem jMenuItemProcesarInformacionCajaIngresoDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaIngresoDetalle;
	protected JMenuItem jMenuItemMostrarOcultarCajaIngresoDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaIngresoDetalle;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaIngresoDetalle;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCajaIngresoDetalle;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCajaIngresoDetalle;
	public JLabel jLabelIdCajaIngresoDetalle;
	public JLabel jLabelidCajaIngresoDetalle;
	public JButton jButtonidCajaIngresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelconceptoCajaIngresoDetalle;
	public JLabel jLabelconceptoCajaIngresoDetalle;
	public JTextArea jTextAreaconceptoCajaIngresoDetalle;
	public JScrollPane jscrollPaneconceptoCajaIngresoDetalle;
	public JButton jButtonconceptoCajaIngresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelvalorCajaIngresoDetalle;
	public JLabel jLabelvalorCajaIngresoDetalle;
	public JTextField jTextFieldvalorCajaIngresoDetalle;
	public JButton jButtonvalorCajaIngresoDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_caja_ingresoCajaIngresoDetalle;
	public JLabel jLabelid_caja_ingresoCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_caja_ingresoCajaIngresoDetalle;
	public JButton jButtonid_caja_ingresoCajaIngresoDetalle= new JButtonMe();
	public JButton jButtonid_caja_ingresoCajaIngresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_caja_ingresoCajaIngresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaCajaIngresoDetalle;
	public JLabel jLabelid_empresaCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCajaIngresoDetalle;
	public JButton jButtonid_empresaCajaIngresoDetalle= new JButtonMe();
	public JButton jButtonid_empresaCajaIngresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_empresaCajaIngresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCajaIngresoDetalle;
	public JLabel jLabelid_sucursalCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCajaIngresoDetalle;
	public JButton jButtonid_sucursalCajaIngresoDetalle= new JButtonMe();
	public JButton jButtonid_sucursalCajaIngresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCajaIngresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteCajaIngresoDetalle;
	public JLabel jLabelid_clienteCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteCajaIngresoDetalle;
	public JButton jButtonid_clienteCajaIngresoDetalle= new JButtonMe();
	public JButton jButtonid_clienteCajaIngresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_clienteCajaIngresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaCajaIngresoDetalle;
	public JLabel jLabelid_facturaCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaCajaIngresoDetalle;
	public JButton jButtonid_facturaCajaIngresoDetalle= new JButtonMe();
	public JButton jButtonid_facturaCajaIngresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_facturaCajaIngresoDetalleBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCajaIngresoDetalle;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CajaIngresoDetalleDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCajaIngresoDetalle=new JPanel();
				this.jPanelAccionesFormularioCajaIngresoDetalle=new JPanel();
				this.jmenuBarDetalleCajaIngresoDetalle=new JMenuBar();
				this.jTtoolBarDetalleCajaIngresoDetalle=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoDetalleDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CajaIngresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CajaIngresoDetalleDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CajaIngresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoDetalleDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaIngresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoDetalleDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaIngresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoDetalleDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaIngresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCajaIngresoDetalle() {
		return this.jButtonActualizarToolBarCajaIngresoDetalle;
	}
	
	public JButton getjButtonEliminarToolBarCajaIngresoDetalle() {
		return this.jButtonEliminarToolBarCajaIngresoDetalle;
	}
	
	public JButton getjButtonCancelarToolBarCajaIngresoDetalle() {
		return this.jButtonCancelarToolBarCajaIngresoDetalle;
	}		
	
	public JButton getjButtonProcesarInformacionCajaIngresoDetalle() {
		return this.jButtonProcesarInformacionCajaIngresoDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaIngresoDetalle)	{
		this.jButtonProcesarInformacionCajaIngresoDetalle = jButtonProcesarInformacionCajaIngresoDetalle;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaIngresoDetalle() {
		return this.jComboBoxTiposAccionesCajaIngresoDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaIngresoDetalle(
			JComboBox jComboBoxTiposRelacionesCajaIngresoDetalle) {
		this.jComboBoxTiposRelacionesCajaIngresoDetalle = jComboBoxTiposRelacionesCajaIngresoDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaIngresoDetalle(
			JComboBox jComboBoxTiposAccionesCajaIngresoDetalle) {
		this.jComboBoxTiposAccionesCajaIngresoDetalle = jComboBoxTiposAccionesCajaIngresoDetalle;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCajaIngresoDetalle() {
		return this.jComboBoxTiposAccionesFormularioCajaIngresoDetalle;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCajaIngresoDetalle(
			JComboBox jComboBoxTiposAccionesFormularioCajaIngresoDetalle) {
		this.jComboBoxTiposAccionesFormularioCajaIngresoDetalle = jComboBoxTiposAccionesFormularioCajaIngresoDetalle;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
		
		this.cajaingresodetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaingresodetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajaingresodetalleSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaIngresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaIngresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaIngresoDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Ingreso Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
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
	
		CajaIngresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCajaIngresoDetalle= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCajaIngresoDetalle=new JButtonMe();
				this.jButtonModificarToolBarCajaIngresoDetalle=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCajaIngresoDetalle,this.jTtoolBarDetalleCajaIngresoDetalle,
							"actualizar","actualizar","Actualizar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCajaIngresoDetalle,this.jTtoolBarDetalleCajaIngresoDetalle,
							"eliminar","eliminar","Eliminar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCajaIngresoDetalle,this.jTtoolBarDetalleCajaIngresoDetalle,
							"cancelar","cancelar","Cancelar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCajaIngresoDetalle,this.jTtoolBarDetalleCajaIngresoDetalle,
							"guardarcambios","guardarcambios","Guardar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCajaIngresoDetalle=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCajaIngresoDetalle=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCajaIngresoDetalle=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCajaIngresoDetalle=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCajaIngresoDetalle=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaIngresoDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaIngresoDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaIngresoDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCajaIngresoDetalle= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCajaIngresoDetalle.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCajaIngresoDetalle,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCajaIngresoDetalle= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCajaIngresoDetalle.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCajaIngresoDetalle,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCajaIngresoDetalle= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCajaIngresoDetalle.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCajaIngresoDetalle,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCajaIngresoDetalle= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCajaIngresoDetalle.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCajaIngresoDetalle,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCajaIngresoDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaIngresoDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaIngresoDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaIngresoDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaIngresoDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaIngresoDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCajaIngresoDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCajaIngresoDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCajaIngresoDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaIngresoDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaIngresoDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaIngresoDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaIngresoDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaIngresoDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaIngresoDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCajaIngresoDetalle.add(this.jMenuItemDetalleCerrarCajaIngresoDetalle);
		
		this.jmenuDetalleAccionesCajaIngresoDetalle.add(this.jMenuItemActualizarCajaIngresoDetalle);
		this.jmenuDetalleAccionesCajaIngresoDetalle.add(this.jMenuItemEliminarCajaIngresoDetalle);
		this.jmenuDetalleAccionesCajaIngresoDetalle.add(this.jMenuItemCancelarCajaIngresoDetalle);		
		
		//this.jmenuDetalleDatosCajaIngresoDetalle.add(this.jMenuItemDetalleAbrirOrderByCajaIngresoDetalle);				
		this.jmenuDetalleDatosCajaIngresoDetalle.add(this.jMenuItemDetalleMostarOcultarCajaIngresoDetalle);				
				
		//this.jmenuDetalleAccionesCajaIngresoDetalle.add(this.jMenuItemGuardarCambiosCajaIngresoDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCajaIngresoDetalle.add(this.jmenuDetalleArchivoCajaIngresoDetalle);		
		this.jmenuBarDetalleCajaIngresoDetalle.add(this.jmenuDetalleAccionesCajaIngresoDetalle);		
		this.jmenuBarDetalleCajaIngresoDetalle.add(this.jmenuDetalleDatosCajaIngresoDetalle);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCajaIngresoDetalle);				
	}
	
	
	public void inicializarElementosCamposCajaIngresoDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCajaIngresoDetalle = new JLabelMe();
		jLabelIdCajaIngresoDetalle.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCajaIngresoDetalle = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCajaIngresoDetalle.setToolTipText(CajaIngresoDetalleConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCajaIngresoDetalle= new GridBagLayout();

		this.jPanelidCajaIngresoDetalle.setLayout(this.gridaBagLayoutCajaIngresoDetalle);

		jLabelidCajaIngresoDetalle = new JLabel();
		jLabelidCajaIngresoDetalle.setText("Id");

		jLabelidCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelconceptoCajaIngresoDetalle = new JLabelMe();
		this.jLabelconceptoCajaIngresoDetalle.setText(""+CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO+" : *");
		this.jLabelconceptoCajaIngresoDetalle.setToolTipText("Concepto");
		this.jLabelconceptoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconceptoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconceptoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelconceptoCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelconceptoCajaIngresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelconceptoCajaIngresoDetalle.setToolTipText(CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO);
		this.gridaBagLayoutCajaIngresoDetalle = new GridBagLayout();
		this.jPanelconceptoCajaIngresoDetalle.setLayout(this.gridaBagLayoutCajaIngresoDetalle);


		jTextAreaconceptoCajaIngresoDetalle= new JTextAreaMe();
		jTextAreaconceptoCajaIngresoDetalle.setEnabled(false);
		jTextAreaconceptoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaconceptoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaconceptoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaconceptoCajaIngresoDetalle.setLineWrap(true);
		jTextAreaconceptoCajaIngresoDetalle.setWrapStyleWord(true);
		jTextAreaconceptoCajaIngresoDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaconceptoCajaIngresoDetalle.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaconceptoCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneconceptoCajaIngresoDetalle = new JScrollPane(jTextAreaconceptoCajaIngresoDetalle);
		jscrollPaneconceptoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneconceptoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneconceptoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonconceptoCajaIngresoDetalleBusqueda= new JButtonMe();
		this.jButtonconceptoCajaIngresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconceptoCajaIngresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconceptoCajaIngresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonconceptoCajaIngresoDetalleBusqueda.setText("U");
		this.jButtonconceptoCajaIngresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonconceptoCajaIngresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonconceptoCajaIngresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaconceptoCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaconceptoCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"conceptoCajaIngresoDetalleBusqueda"));

		if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonconceptoCajaIngresoDetalleBusqueda.setVisible(false);		}


					
		this.jLabelvalorCajaIngresoDetalle = new JLabelMe();
		this.jLabelvalorCajaIngresoDetalle.setText(""+CajaIngresoDetalleConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorCajaIngresoDetalle.setToolTipText("Valor");
		this.jLabelvalorCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorCajaIngresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorCajaIngresoDetalle.setToolTipText(CajaIngresoDetalleConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutCajaIngresoDetalle = new GridBagLayout();
		this.jPanelvalorCajaIngresoDetalle.setLayout(this.gridaBagLayoutCajaIngresoDetalle);


		jTextFieldvalorCajaIngresoDetalle= new JTextFieldMe();
		jTextFieldvalorCajaIngresoDetalle.setEnabled(false);
		jTextFieldvalorCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorCajaIngresoDetalle.setText("0.0");

		this.jButtonvalorCajaIngresoDetalleBusqueda= new JButtonMe();
		this.jButtonvalorCajaIngresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCajaIngresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCajaIngresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorCajaIngresoDetalleBusqueda.setText("U");
		this.jButtonvalorCajaIngresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorCajaIngresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorCajaIngresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorCajaIngresoDetalleBusqueda"));

		if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorCajaIngresoDetalleBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCajaIngresoDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_caja_ingresoCajaIngresoDetalle = new JLabelMe();
		this.jLabelid_caja_ingresoCajaIngresoDetalle.setText(""+CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO+" : *");
		this.jLabelid_caja_ingresoCajaIngresoDetalle.setToolTipText("Caja Ingreso");
		this.jLabelid_caja_ingresoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_caja_ingresoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_caja_ingresoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_caja_ingresoCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_caja_ingresoCajaIngresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_caja_ingresoCajaIngresoDetalle.setToolTipText(CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO);
		this.gridaBagLayoutCajaIngresoDetalle = new GridBagLayout();
		this.jPanelid_caja_ingresoCajaIngresoDetalle.setLayout(this.gridaBagLayoutCajaIngresoDetalle);


		jComboBoxid_caja_ingresoCajaIngresoDetalle= new JComboBoxMe();
		jComboBoxid_caja_ingresoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_caja_ingresoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_caja_ingresoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_caja_ingresoCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_caja_ingresoCajaIngresoDetalle= new JButtonMe();
		this.jButtonid_caja_ingresoCajaIngresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_caja_ingresoCajaIngresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_caja_ingresoCajaIngresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_caja_ingresoCajaIngresoDetalle.setText("Buscar");
		this.jButtonid_caja_ingresoCajaIngresoDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_caja_ingresoCajaIngresoDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_caja_ingresoCajaIngresoDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_caja_ingresoCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_caja_ingresoCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_caja_ingresoCajaIngresoDetalle"));

		this.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda= new JButtonMe();
		this.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda.setText("U");
		this.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_caja_ingresoCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_caja_ingresoCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_caja_ingresoCajaIngresoDetalleBusqueda"));

		if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda.setVisible(false);		}

		this.jButtonid_caja_ingresoCajaIngresoDetalleUpdate= new JButtonMe();
		this.jButtonid_caja_ingresoCajaIngresoDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_caja_ingresoCajaIngresoDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_caja_ingresoCajaIngresoDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_caja_ingresoCajaIngresoDetalleUpdate.setText("U");
		this.jButtonid_caja_ingresoCajaIngresoDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_caja_ingresoCajaIngresoDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_caja_ingresoCajaIngresoDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_caja_ingresoCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_caja_ingresoCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_caja_ingresoCajaIngresoDetalleUpdate"));



					
		this.jLabelid_empresaCajaIngresoDetalle = new JLabelMe();
		this.jLabelid_empresaCajaIngresoDetalle.setText(""+CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCajaIngresoDetalle.setToolTipText("Empresa");
		this.jLabelid_empresaCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCajaIngresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCajaIngresoDetalle.setToolTipText(CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCajaIngresoDetalle = new GridBagLayout();
		this.jPanelid_empresaCajaIngresoDetalle.setLayout(this.gridaBagLayoutCajaIngresoDetalle);


		jComboBoxid_empresaCajaIngresoDetalle= new JComboBoxMe();
		jComboBoxid_empresaCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCajaIngresoDetalle.setEnabled(false);

		this.jButtonid_empresaCajaIngresoDetalle= new JButtonMe();
		this.jButtonid_empresaCajaIngresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaIngresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaIngresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaIngresoDetalle.setText("Buscar");
		this.jButtonid_empresaCajaIngresoDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCajaIngresoDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaIngresoDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaIngresoDetalle"));

		this.jButtonid_empresaCajaIngresoDetalleBusqueda= new JButtonMe();
		this.jButtonid_empresaCajaIngresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaIngresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaIngresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaIngresoDetalleBusqueda.setText("U");
		this.jButtonid_empresaCajaIngresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCajaIngresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaIngresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaIngresoDetalleBusqueda"));

		if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCajaIngresoDetalleBusqueda.setVisible(false);		}

		this.jButtonid_empresaCajaIngresoDetalleUpdate= new JButtonMe();
		this.jButtonid_empresaCajaIngresoDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaIngresoDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaIngresoDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaIngresoDetalleUpdate.setText("U");
		this.jButtonid_empresaCajaIngresoDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCajaIngresoDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaIngresoDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaIngresoDetalleUpdate"));



					
		this.jLabelid_sucursalCajaIngresoDetalle = new JLabelMe();
		this.jLabelid_sucursalCajaIngresoDetalle.setText(""+CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCajaIngresoDetalle.setToolTipText("Sucursal");
		this.jLabelid_sucursalCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCajaIngresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCajaIngresoDetalle.setToolTipText(CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCajaIngresoDetalle = new GridBagLayout();
		this.jPanelid_sucursalCajaIngresoDetalle.setLayout(this.gridaBagLayoutCajaIngresoDetalle);


		jComboBoxid_sucursalCajaIngresoDetalle= new JComboBoxMe();
		jComboBoxid_sucursalCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCajaIngresoDetalle.setEnabled(false);

		this.jButtonid_sucursalCajaIngresoDetalle= new JButtonMe();
		this.jButtonid_sucursalCajaIngresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaIngresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaIngresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaIngresoDetalle.setText("Buscar");
		this.jButtonid_sucursalCajaIngresoDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCajaIngresoDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaIngresoDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaIngresoDetalle"));

		this.jButtonid_sucursalCajaIngresoDetalleBusqueda= new JButtonMe();
		this.jButtonid_sucursalCajaIngresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaIngresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaIngresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaIngresoDetalleBusqueda.setText("U");
		this.jButtonid_sucursalCajaIngresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCajaIngresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaIngresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaIngresoDetalleBusqueda"));

		if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCajaIngresoDetalleBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCajaIngresoDetalleUpdate= new JButtonMe();
		this.jButtonid_sucursalCajaIngresoDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaIngresoDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaIngresoDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaIngresoDetalleUpdate.setText("U");
		this.jButtonid_sucursalCajaIngresoDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCajaIngresoDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaIngresoDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaIngresoDetalleUpdate"));



					
		this.jLabelid_clienteCajaIngresoDetalle = new JLabelMe();
		this.jLabelid_clienteCajaIngresoDetalle.setText(""+CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteCajaIngresoDetalle.setToolTipText("Cliente");
		this.jLabelid_clienteCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteCajaIngresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteCajaIngresoDetalle.setToolTipText(CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutCajaIngresoDetalle = new GridBagLayout();
		this.jPanelid_clienteCajaIngresoDetalle.setLayout(this.gridaBagLayoutCajaIngresoDetalle);


		jComboBoxid_clienteCajaIngresoDetalle= new JComboBoxMe();
		jComboBoxid_clienteCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteCajaIngresoDetalle= new JButtonMe();
		this.jButtonid_clienteCajaIngresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaIngresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaIngresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaIngresoDetalle.setText("Buscar");
		this.jButtonid_clienteCajaIngresoDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteCajaIngresoDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaIngresoDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaIngresoDetalle"));

		this.jButtonid_clienteCajaIngresoDetalleBusqueda= new JButtonMe();
		this.jButtonid_clienteCajaIngresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaIngresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaIngresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCajaIngresoDetalleBusqueda.setText("U");
		this.jButtonid_clienteCajaIngresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteCajaIngresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaIngresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaIngresoDetalleBusqueda"));

		if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteCajaIngresoDetalleBusqueda.setVisible(false);		}

		this.jButtonid_clienteCajaIngresoDetalleUpdate= new JButtonMe();
		this.jButtonid_clienteCajaIngresoDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaIngresoDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaIngresoDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCajaIngresoDetalleUpdate.setText("U");
		this.jButtonid_clienteCajaIngresoDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteCajaIngresoDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaIngresoDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaIngresoDetalleUpdate"));



					
		this.jLabelid_facturaCajaIngresoDetalle = new JLabelMe();
		this.jLabelid_facturaCajaIngresoDetalle.setText(""+CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaCajaIngresoDetalle.setToolTipText("Factura");
		this.jLabelid_facturaCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaCajaIngresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaCajaIngresoDetalle.setToolTipText(CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutCajaIngresoDetalle = new GridBagLayout();
		this.jPanelid_facturaCajaIngresoDetalle.setLayout(this.gridaBagLayoutCajaIngresoDetalle);


		jComboBoxid_facturaCajaIngresoDetalle= new JComboBoxMe();
		jComboBoxid_facturaCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaCajaIngresoDetalle= new JButtonMe();
		this.jButtonid_facturaCajaIngresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaCajaIngresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaCajaIngresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaCajaIngresoDetalle.setText("Buscar");
		this.jButtonid_facturaCajaIngresoDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaCajaIngresoDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaCajaIngresoDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaCajaIngresoDetalle"));

		this.jButtonid_facturaCajaIngresoDetalleBusqueda= new JButtonMe();
		this.jButtonid_facturaCajaIngresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCajaIngresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCajaIngresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaCajaIngresoDetalleBusqueda.setText("U");
		this.jButtonid_facturaCajaIngresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaCajaIngresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaCajaIngresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaCajaIngresoDetalleBusqueda"));

		if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaCajaIngresoDetalleBusqueda.setVisible(false);		}

		this.jButtonid_facturaCajaIngresoDetalleUpdate= new JButtonMe();
		this.jButtonid_facturaCajaIngresoDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCajaIngresoDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCajaIngresoDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaCajaIngresoDetalleUpdate.setText("U");
		this.jButtonid_facturaCajaIngresoDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaCajaIngresoDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaCajaIngresoDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaCajaIngresoDetalleUpdate"));



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
		//this.jInternalFrameDetalleCajaIngresoDetalle = new CajaIngresoDetalleBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Caja Ingreso Detalle DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaIngresoDetalle= new GridBagLayout();
		

		
		String sToolTipCajaIngresoDetalle="";
		sToolTipCajaIngresoDetalle=CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaIngresoDetalle+="(PuntoVenta.CajaIngresoDetalle)";
		}
		
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaIngresoDetalle+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCajaIngresoDetalle = new JButtonMe();
		this.jButtonModificarCajaIngresoDetalle = new JButtonMe();
        this.jButtonActualizarCajaIngresoDetalle = new JButtonMe();
        this.jButtonEliminarCajaIngresoDetalle = new JButtonMe();
        this.jButtonCancelarCajaIngresoDetalle = new JButtonMe();
        this.jButtonGuardarCambiosCajaIngresoDetalle = new JButtonMe();
		this.jButtonGuardarCambiosTablaCajaIngresoDetalle = new JButtonMe();
		this.jButtonCerrarCajaIngresoDetalle = new JButtonMe();
		
		this.jScrollPanelDatosCajaIngresoDetalle = new JScrollPane();   
        this.jScrollPanelDatosEdicionCajaIngresoDetalle = new JScrollPane();
		this.jScrollPanelDatosGeneralCajaIngresoDetalle = new JScrollPane();
				
		
		
		this.jPanelCamposCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Ingreso Detalle";
		
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingreso Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaIngresoDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCajaIngresoDetalle.setName("jPanelCamposCajaIngresoDetalle"); 

		this.jPanelCamposOcultosCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCajaIngresoDetalle.setName("jPanelCamposOcultosCajaIngresoDetalle"); 

        this.jPanelAccionesCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaIngresoDetalle.setToolTipText("Acciones");
        this.jPanelAccionesCajaIngresoDetalle.setName("Acciones"); 

		this.jPanelAccionesFormularioCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCajaIngresoDetalle.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCajaIngresoDetalle.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCajaIngresoDetalle.setText("Nuevo");
		this.jButtonModificarCajaIngresoDetalle.setText("Editar");
        this.jButtonActualizarCajaIngresoDetalle.setText("Actualizar");
        this.jButtonEliminarCajaIngresoDetalle.setText("Eliminar");
        this.jButtonCancelarCajaIngresoDetalle.setText("Cancelar");
        this.jButtonGuardarCambiosCajaIngresoDetalle.setText("Guardar");
		this.jButtonGuardarCambiosTablaCajaIngresoDetalle.setText("Guardar");
		this.jButtonCerrarCajaIngresoDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaIngresoDetalle,"nuevo_button","Nuevo",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCajaIngresoDetalle,"modificar_button","Editar",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCajaIngresoDetalle,"actualizar_button","Actualizar",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCajaIngresoDetalle,"eliminar_button","Eliminar",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCajaIngresoDetalle,"cancelar_button","Cancelar",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCajaIngresoDetalle,"guardarcambios_button","Guardar",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaIngresoDetalle,"guardarcambiostabla_button","Guardar",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaIngresoDetalle,"cerrar_button","Salir",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCajaIngresoDetalle.setToolTipText("Nuevo"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCajaIngresoDetalle.setToolTipText("Editar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCajaIngresoDetalle.setToolTipText("Actualizar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCajaIngresoDetalle.setToolTipText("Eliminar)"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCajaIngresoDetalle.setToolTipText("Cancelar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCajaIngresoDetalle.setToolTipText("Guardar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCajaIngresoDetalle.setToolTipText("Guardar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaIngresoDetalle.setToolTipText("Salir"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaIngresoDetalle";
		inputMap = this.jButtonNuevoCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaIngresoDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaIngresoDetalle"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCajaIngresoDetalle";
		inputMap = this.jButtonActualizarCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCajaIngresoDetalle"));
		
		//ELIMINAR
		sMapKey = "EliminarCajaIngresoDetalle";
		inputMap = this.jButtonEliminarCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCajaIngresoDetalle"));
		
		//CANCELAR	
		sMapKey = "CancelarCajaIngresoDetalle";
		inputMap = this.jButtonCancelarCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCajaIngresoDetalle"));
		
		//CERRAR		
		sMapKey = "CerrarCajaIngresoDetalle";
		inputMap = this.jButtonCerrarCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaIngresoDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaIngresoDetalle";
		inputMap = this.jButtonGuardarCambiosTablaCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaIngresoDetalle"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCajaIngresoDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCajaIngresoDetalle.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCajaIngresoDetalle.setToolTipText("Nuevo CajaIngresoDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCajaIngresoDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCajaIngresoDetalle.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCajaIngresoDetalle.setToolTipText("Sin Cerrar Ventana CajaIngresoDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCajaIngresoDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCajaIngresoDetalle.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCajaIngresoDetalle.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaIngresoDetalle.setText("Accion");
		this.jComboBoxTiposAccionesCajaIngresoDetalle.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCajaIngresoDetalle = new JLabelMe();
		
		this.jLabelAccionesCajaIngresoDetalle.setText("Acciones");		
		this.jLabelAccionesCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCajaIngresoDetalle();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCajaIngresoDetalle();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCajaIngresoDetalle=new JTabbedPane();
		this.jTabbedPaneRelacionesCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCajaIngresoDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaIngresoDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaIngresoDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCajaIngresoDetalle = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCajaIngresoDetalle = new GridBagLayout();
		
		this.jPanelCamposCajaIngresoDetalle.setLayout(gridaBagLayoutCamposCajaIngresoDetalle);
		this.jPanelCamposOcultosCajaIngresoDetalle.setLayout(gridaBagLayoutCamposOcultosCajaIngresoDetalle);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCajaIngresoDetalle.add(jLabelIdCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCajaIngresoDetalle.add(jLabelidCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);


	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_caja_ingresoCajaIngresoDetalle.add(jLabelid_caja_ingresoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 2;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_caja_ingresoCajaIngresoDetalle.add(jButtonid_caja_ingresoCajaIngresoDetalleBusqueda, this.gridBagConstraintsCajaIngresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 3;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_caja_ingresoCajaIngresoDetalle.add(jButtonid_caja_ingresoCajaIngresoDetalleUpdate, this.gridBagConstraintsCajaIngresoDetalle);
	}

	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_caja_ingresoCajaIngresoDetalle.add(jComboBoxid_caja_ingresoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);


	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCajaIngresoDetalle.add(jLabelid_empresaCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 2;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaIngresoDetalle.add(jButtonid_empresaCajaIngresoDetalleBusqueda, this.gridBagConstraintsCajaIngresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 3;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaIngresoDetalle.add(jButtonid_empresaCajaIngresoDetalleUpdate, this.gridBagConstraintsCajaIngresoDetalle);
	}

	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCajaIngresoDetalle.add(jComboBoxid_empresaCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);


	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCajaIngresoDetalle.add(jLabelid_sucursalCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 2;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajaIngresoDetalle.add(jButtonid_sucursalCajaIngresoDetalleBusqueda, this.gridBagConstraintsCajaIngresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 3;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajaIngresoDetalle.add(jButtonid_sucursalCajaIngresoDetalleUpdate, this.gridBagConstraintsCajaIngresoDetalle);
	}

	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCajaIngresoDetalle.add(jComboBoxid_sucursalCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);


	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteCajaIngresoDetalle.add(jLabelid_clienteCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 2;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteCajaIngresoDetalle.add(jButtonid_clienteCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 3;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCajaIngresoDetalle.add(jButtonid_clienteCajaIngresoDetalleBusqueda, this.gridBagConstraintsCajaIngresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 4;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCajaIngresoDetalle.add(jButtonid_clienteCajaIngresoDetalleUpdate, this.gridBagConstraintsCajaIngresoDetalle);
	}

	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteCajaIngresoDetalle.add(jComboBoxid_clienteCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);


	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaCajaIngresoDetalle.add(jLabelid_facturaCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 2;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaCajaIngresoDetalle.add(jButtonid_facturaCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 3;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaCajaIngresoDetalle.add(jButtonid_facturaCajaIngresoDetalleBusqueda, this.gridBagConstraintsCajaIngresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 4;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaCajaIngresoDetalle.add(jButtonid_facturaCajaIngresoDetalleUpdate, this.gridBagConstraintsCajaIngresoDetalle);
	}

	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaCajaIngresoDetalle.add(jComboBoxid_facturaCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);


	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelconceptoCajaIngresoDetalle.add(jLabelconceptoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 2;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelconceptoCajaIngresoDetalle.add(jButtonconceptoCajaIngresoDetalleBusqueda, this.gridBagConstraintsCajaIngresoDetalle);
	}

	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelconceptoCajaIngresoDetalle.add(jscrollPaneconceptoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);


	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorCajaIngresoDetalle.add(jLabelvalorCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 2;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorCajaIngresoDetalle.add(jButtonvalorCajaIngresoDetalleBusqueda, this.gridBagConstraintsCajaIngresoDetalle);
	}

	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorCajaIngresoDetalle.add(jTextFieldvalorCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = iYPanelCamposCajaIngresoDetalle;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = iXPanelCamposCajaIngresoDetalle++;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngresoDetalle.add(this.jPanelidCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(iXPanelCamposCajaIngresoDetalle % 1==0) {
		iXPanelCamposCajaIngresoDetalle=0;
		iYPanelCamposCajaIngresoDetalle++;
	}
	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = iYPanelCamposCajaIngresoDetalle;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = iXPanelCamposCajaIngresoDetalle++;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngresoDetalle.add(this.jPanelid_caja_ingresoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(iXPanelCamposCajaIngresoDetalle % 1==0) {
		iXPanelCamposCajaIngresoDetalle=0;
		iYPanelCamposCajaIngresoDetalle++;
	}
	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = iYPanelCamposCajaIngresoDetalle;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = iXPanelCamposCajaIngresoDetalle++;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngresoDetalle.add(this.jPanelid_clienteCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(iXPanelCamposCajaIngresoDetalle % 1==0) {
		iXPanelCamposCajaIngresoDetalle=0;
		iYPanelCamposCajaIngresoDetalle++;
	}
	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = iYPanelCamposCajaIngresoDetalle;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = iXPanelCamposCajaIngresoDetalle++;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngresoDetalle.add(this.jPanelid_facturaCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(iXPanelCamposCajaIngresoDetalle % 1==0) {
		iXPanelCamposCajaIngresoDetalle=0;
		iYPanelCamposCajaIngresoDetalle++;
	}
	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = iYPanelCamposCajaIngresoDetalle;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = iXPanelCamposCajaIngresoDetalle++;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngresoDetalle.add(this.jPanelconceptoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(iXPanelCamposCajaIngresoDetalle % 1==0) {
		iXPanelCamposCajaIngresoDetalle=0;
		iYPanelCamposCajaIngresoDetalle++;
	}
	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = iYPanelCamposCajaIngresoDetalle;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = iXPanelCamposCajaIngresoDetalle++;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngresoDetalle.add(this.jPanelvalorCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(iXPanelCamposCajaIngresoDetalle % 1==0) {
		iXPanelCamposCajaIngresoDetalle=0;
		iYPanelCamposCajaIngresoDetalle++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = iYPanelCamposOcultosCajaIngresoDetalle;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = iXPanelCamposOcultosCajaIngresoDetalle++;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaIngresoDetalle.add(this.jPanelid_empresaCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(iXPanelCamposOcultosCajaIngresoDetalle % 1==0) {
		iXPanelCamposOcultosCajaIngresoDetalle=0;
		iYPanelCamposOcultosCajaIngresoDetalle++;
	}
	this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngresoDetalle.gridy = iYPanelCamposOcultosCajaIngresoDetalle;
	this.gridBagConstraintsCajaIngresoDetalle.gridx = iXPanelCamposOcultosCajaIngresoDetalle++;
	this.gridBagConstraintsCajaIngresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaIngresoDetalle.add(this.jPanelid_sucursalCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);



	if(iXPanelCamposOcultosCajaIngresoDetalle % 1==0) {
		iXPanelCamposOcultosCajaIngresoDetalle=0;
		iYPanelCamposOcultosCajaIngresoDetalle++;
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
			
		GridBagLayout gridaBagLayoutAccionesCajaIngresoDetalle= new GridBagLayout();
		this.jPanelAccionesCajaIngresoDetalle.setLayout(gridaBagLayoutAccionesCajaIngresoDetalle);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCajaIngresoDetalle= new GridBagLayout();
		this.jPanelAccionesFormularioCajaIngresoDetalle.setLayout(gridaBagLayoutAccionesFormularioCajaIngresoDetalle);
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaIngresoDetalle.add(this.jComboBoxTiposAccionesFormularioCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaIngresoDetalle.add(this.jCheckBoxPostAccionNuevoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajaIngresoDetalle.add(this.jCheckBoxPostAccionSinCerrarCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajaIngresoDetalle.add(this.jCheckBoxPostAccionSinMensajeCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccion++;
			
		this.jPanelAccionesCajaIngresoDetalle.add(this.jButtonModificarCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);							

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx =iPosXAccion++;
			
		this.jPanelAccionesCajaIngresoDetalle.add(this.jButtonEliminarCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
			
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaIngresoDetalle.add(this.jButtonActualizarCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);


		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaIngresoDetalle.add(this.jButtonGuardarCambiosCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);	
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx =iPosXAccion++;
		
		this.jPanelAccionesCajaIngresoDetalle.add(this.jButtonCancelarCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaIngresoDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaIngresoDetalle);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();						
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;		
			//this.gridBagConstraintsCajaIngresoDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaIngresoDetalle.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaIngresoDetalle.gridx =0;
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaIngresoDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CajaIngresoDetalleJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCajaIngresoDetalle = new CajaIngresoDetalleBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Caja Ingreso Detalle DATOS");
			
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
			
	        //this.setTitle("[FOR] - Caja Ingreso Detalle DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Ingreso Detalle Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CajaIngresoDetalleModel cajaingresodetalleModel=new CajaIngresoDetalleModel(this);
			
			//SI USARA CLASE INTERNA
			//CajaIngresoDetalleModel.CajaIngresoDetalleFocusTraversalPolicy cajaingresodetalleFocusTraversalPolicy = cajaingresodetalleModel.new CajaIngresoDetalleFocusTraversalPolicy(this);
			
			//cajaingresodetalleFocusTraversalPolicy.setcajaingresodetalleJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cajaingresodetalleModel);
			
			
			this.jContentPaneDetalleCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCajaIngresoDetalle = new GridBagLayout();	
			this.jContentPaneDetalleCajaIngresoDetalle.setLayout(gridaBagLayoutDetalleCajaIngresoDetalle);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaIngresoDetalle = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
				this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
					
				
				this.jContentPaneDetalleCajaIngresoDetalle.add(jTtoolBarDetalleCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);								
				
}
			
			this.jScrollPanelDatosEdicionCajaIngresoDetalle=   new JScrollPane(jContentPaneDetalleCajaIngresoDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCajaIngresoDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
	        
			this.jContentPaneDetalleCajaIngresoDetalle.add(jPanelCamposCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);
			
			
			
			
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
						&& cajaingresodetalleSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCajaIngresoDetalle= new GridBagConstraints();
						this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
						this.jContentPaneDetalleCajaIngresoDetalle.add(this.jTabbedPaneRelacionesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCajaIngresoDetalle.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCajaIngresoDetalle.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
					this.gridBagConstraintsCajaIngresoDetalle.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
					
				
					this.jContentPaneDetalleCajaIngresoDetalle.add(jPanelCamposOcultosCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);
				
					this.jPanelCamposOcultosCajaIngresoDetalle.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
	        this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCajaIngresoDetalle.add(this.jPanelAccionesFormularioCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);							
			
			
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
	        this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
	        
			
			this.jContentPaneDetalleCajaIngresoDetalle.add(this.jPanelAccionesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCajaIngresoDetalle);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCajaIngresoDetalle=   new JScrollPane(this.jPanelCamposCajaIngresoDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCajaIngresoDetalle.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);			
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			
			
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
			
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCajaIngresoDetalle;//jContentPane;
		
		return jScrollPanelDatosEdicionCajaIngresoDetalle;
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
