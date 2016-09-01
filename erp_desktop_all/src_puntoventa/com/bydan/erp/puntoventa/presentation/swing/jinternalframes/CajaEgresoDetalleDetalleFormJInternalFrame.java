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
import com.bydan.erp.puntoventa.util.CajaEgresoDetalleConstantesFunciones;

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
public class CajaEgresoDetalleDetalleFormJInternalFrame extends CajaEgresoDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCajaEgresoDetalle;
	
	protected JMenuBar jmenuBarDetalleCajaEgresoDetalle;
	
	protected JMenu jmenuDetalleCajaEgresoDetalle;
	protected JMenu jmenuDetalleArchivoCajaEgresoDetalle;
	protected JMenu jmenuDetalleAccionesCajaEgresoDetalle;
	protected JMenu jmenuDetalleDatosCajaEgresoDetalle;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaEgresoDetalle;	
	protected GridBagConstraints gridBagConstraintsCajaEgresoDetalle;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CajaEgresoDetalleBeanSwingJInternalFrameAdditional jInternalFrameDetalleCajaEgresoDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cajaegreso="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";
	
	public CajaEgresoDetalleSessionBean cajaegresodetalleSessionBean;
	
	
	
	
	public CajaEgresoSessionBean cajaegresoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;	
	
	public CajaEgresoDetalleLogic cajaegresodetalleLogic;
	
	public JScrollPane jScrollPanelDatosCajaEgresoDetalle;
	public JScrollPane jScrollPanelDatosEdicionCajaEgresoDetalle;
	public JScrollPane jScrollPanelDatosGeneralCajaEgresoDetalle;
	
	protected JPanel jPanelCamposCajaEgresoDetalle;    
	protected JPanel jPanelCamposOcultosCajaEgresoDetalle;    	
	protected JPanel jPanelAccionesCajaEgresoDetalle;
	protected JPanel jPanelAccionesFormularioCajaEgresoDetalle;
    
	
	
	protected Integer iXPanelCamposCajaEgresoDetalle=0;
	protected Integer iYPanelCamposCajaEgresoDetalle=0;
	
	protected Integer iXPanelCamposOcultosCajaEgresoDetalle=0;
	protected Integer iYPanelCamposOcultosCajaEgresoDetalle=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCajaEgresoDetalle;
	public JButton jButtonModificarCajaEgresoDetalle;
	public JButton jButtonActualizarCajaEgresoDetalle;
    public JButton jButtonEliminarCajaEgresoDetalle;
	public JButton jButtonCancelarCajaEgresoDetalle;
    public JButton jButtonGuardarCambiosCajaEgresoDetalle;
	public JButton jButtonGuardarCambiosTablaCajaEgresoDetalle;
	protected JButton jButtonCerrarCajaEgresoDetalle;
	
	
	protected JButton jButtonProcesarInformacionCajaEgresoDetalle;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCajaEgresoDetalle;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCajaEgresoDetalle;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCajaEgresoDetalle;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaEgresoDetalle;
	protected JButton jButtonModificarToolBarCajaEgresoDetalle;
	protected JButton jButtonActualizarToolBarCajaEgresoDetalle;
    protected JButton jButtonEliminarToolBarCajaEgresoDetalle;
	protected JButton jButtonCancelarToolBarCajaEgresoDetalle;
    protected JButton jButtonGuardarCambiosToolBarCajaEgresoDetalle;
	protected JButton jButtonGuardarCambiosTablaToolBarCajaEgresoDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaEgresoDetalle;
	protected JButton jButtonCerrarToolBarCajaEgresoDetalle;
	
	protected JButton jButtonProcesarInformacionToolBarCajaEgresoDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaEgresoDetalle;
	protected JMenuItem jMenuItemModificarCajaEgresoDetalle;
	protected JMenuItem jMenuItemActualizarCajaEgresoDetalle;
    protected JMenuItem jMenuItemEliminarCajaEgresoDetalle;
	protected JMenuItem jMenuItemCancelarCajaEgresoDetalle;
    protected JMenuItem jMenuItemGuardarCambiosCajaEgresoDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaEgresoDetalle;
	protected JMenuItem jMenuItemCerrarCajaEgresoDetalle;
	protected JMenuItem jMenuItemDetalleCerrarCajaEgresoDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaEgresoDetalle;
	
	protected JMenuItem jMenuItemProcesarInformacionCajaEgresoDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaEgresoDetalle;
	protected JMenuItem jMenuItemMostrarOcultarCajaEgresoDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaEgresoDetalle;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaEgresoDetalle;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCajaEgresoDetalle;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCajaEgresoDetalle;
	public JLabel jLabelIdCajaEgresoDetalle;
	public JLabel jLabelidCajaEgresoDetalle;
	public JButton jButtonidCajaEgresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelconceptoCajaEgresoDetalle;
	public JLabel jLabelconceptoCajaEgresoDetalle;
	public JTextArea jTextAreaconceptoCajaEgresoDetalle;
	public JScrollPane jscrollPaneconceptoCajaEgresoDetalle;
	public JButton jButtonconceptoCajaEgresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelvalorCajaEgresoDetalle;
	public JLabel jLabelvalorCajaEgresoDetalle;
	public JTextField jTextFieldvalorCajaEgresoDetalle;
	public JButton jButtonvalorCajaEgresoDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_caja_egresoCajaEgresoDetalle;
	public JLabel jLabelid_caja_egresoCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_caja_egresoCajaEgresoDetalle;
	public JButton jButtonid_caja_egresoCajaEgresoDetalle= new JButtonMe();
	public JButton jButtonid_caja_egresoCajaEgresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_caja_egresoCajaEgresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaCajaEgresoDetalle;
	public JLabel jLabelid_empresaCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCajaEgresoDetalle;
	public JButton jButtonid_empresaCajaEgresoDetalle= new JButtonMe();
	public JButton jButtonid_empresaCajaEgresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_empresaCajaEgresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCajaEgresoDetalle;
	public JLabel jLabelid_sucursalCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCajaEgresoDetalle;
	public JButton jButtonid_sucursalCajaEgresoDetalle= new JButtonMe();
	public JButton jButtonid_sucursalCajaEgresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCajaEgresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteCajaEgresoDetalle;
	public JLabel jLabelid_clienteCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteCajaEgresoDetalle;
	public JButton jButtonid_clienteCajaEgresoDetalle= new JButtonMe();
	public JButton jButtonid_clienteCajaEgresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_clienteCajaEgresoDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaCajaEgresoDetalle;
	public JLabel jLabelid_facturaCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaCajaEgresoDetalle;
	public JButton jButtonid_facturaCajaEgresoDetalle= new JButtonMe();
	public JButton jButtonid_facturaCajaEgresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_facturaCajaEgresoDetalleBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCajaEgresoDetalle;
	
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
	
	public CajaEgresoDetalleDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCajaEgresoDetalle=new JPanel();
				this.jPanelAccionesFormularioCajaEgresoDetalle=new JPanel();
				this.jmenuBarDetalleCajaEgresoDetalle=new JMenuBar();
				this.jTtoolBarDetalleCajaEgresoDetalle=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoDetalleDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CajaEgresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CajaEgresoDetalleDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CajaEgresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoDetalleDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaEgresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoDetalleDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaEgresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoDetalleDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaEgresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCajaEgresoDetalle() {
		return this.jButtonActualizarToolBarCajaEgresoDetalle;
	}
	
	public JButton getjButtonEliminarToolBarCajaEgresoDetalle() {
		return this.jButtonEliminarToolBarCajaEgresoDetalle;
	}
	
	public JButton getjButtonCancelarToolBarCajaEgresoDetalle() {
		return this.jButtonCancelarToolBarCajaEgresoDetalle;
	}		
	
	public JButton getjButtonProcesarInformacionCajaEgresoDetalle() {
		return this.jButtonProcesarInformacionCajaEgresoDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaEgresoDetalle)	{
		this.jButtonProcesarInformacionCajaEgresoDetalle = jButtonProcesarInformacionCajaEgresoDetalle;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaEgresoDetalle() {
		return this.jComboBoxTiposAccionesCajaEgresoDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaEgresoDetalle(
			JComboBox jComboBoxTiposRelacionesCajaEgresoDetalle) {
		this.jComboBoxTiposRelacionesCajaEgresoDetalle = jComboBoxTiposRelacionesCajaEgresoDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaEgresoDetalle(
			JComboBox jComboBoxTiposAccionesCajaEgresoDetalle) {
		this.jComboBoxTiposAccionesCajaEgresoDetalle = jComboBoxTiposAccionesCajaEgresoDetalle;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCajaEgresoDetalle() {
		return this.jComboBoxTiposAccionesFormularioCajaEgresoDetalle;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCajaEgresoDetalle(
			JComboBox jComboBoxTiposAccionesFormularioCajaEgresoDetalle) {
		this.jComboBoxTiposAccionesFormularioCajaEgresoDetalle = jComboBoxTiposAccionesFormularioCajaEgresoDetalle;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
		
		this.cajaegresodetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaegresodetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajaegresodetalleSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaEgresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaEgresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaEgresoDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Egreso Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
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
	
		CajaEgresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCajaEgresoDetalle= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCajaEgresoDetalle=new JButtonMe();
				this.jButtonModificarToolBarCajaEgresoDetalle=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCajaEgresoDetalle,this.jTtoolBarDetalleCajaEgresoDetalle,
							"actualizar","actualizar","Actualizar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCajaEgresoDetalle,this.jTtoolBarDetalleCajaEgresoDetalle,
							"eliminar","eliminar","Eliminar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCajaEgresoDetalle,this.jTtoolBarDetalleCajaEgresoDetalle,
							"cancelar","cancelar","Cancelar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCajaEgresoDetalle,this.jTtoolBarDetalleCajaEgresoDetalle,
							"guardarcambios","guardarcambios","Guardar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCajaEgresoDetalle=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCajaEgresoDetalle=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCajaEgresoDetalle=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCajaEgresoDetalle=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCajaEgresoDetalle=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaEgresoDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaEgresoDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaEgresoDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCajaEgresoDetalle= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCajaEgresoDetalle.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCajaEgresoDetalle,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCajaEgresoDetalle= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCajaEgresoDetalle.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCajaEgresoDetalle,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCajaEgresoDetalle= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCajaEgresoDetalle.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCajaEgresoDetalle,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCajaEgresoDetalle= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCajaEgresoDetalle.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCajaEgresoDetalle,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCajaEgresoDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaEgresoDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaEgresoDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaEgresoDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaEgresoDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaEgresoDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCajaEgresoDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCajaEgresoDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCajaEgresoDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaEgresoDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaEgresoDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaEgresoDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaEgresoDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaEgresoDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaEgresoDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCajaEgresoDetalle.add(this.jMenuItemDetalleCerrarCajaEgresoDetalle);
		
		this.jmenuDetalleAccionesCajaEgresoDetalle.add(this.jMenuItemActualizarCajaEgresoDetalle);
		this.jmenuDetalleAccionesCajaEgresoDetalle.add(this.jMenuItemEliminarCajaEgresoDetalle);
		this.jmenuDetalleAccionesCajaEgresoDetalle.add(this.jMenuItemCancelarCajaEgresoDetalle);		
		
		//this.jmenuDetalleDatosCajaEgresoDetalle.add(this.jMenuItemDetalleAbrirOrderByCajaEgresoDetalle);				
		this.jmenuDetalleDatosCajaEgresoDetalle.add(this.jMenuItemDetalleMostarOcultarCajaEgresoDetalle);				
				
		//this.jmenuDetalleAccionesCajaEgresoDetalle.add(this.jMenuItemGuardarCambiosCajaEgresoDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCajaEgresoDetalle.add(this.jmenuDetalleArchivoCajaEgresoDetalle);		
		this.jmenuBarDetalleCajaEgresoDetalle.add(this.jmenuDetalleAccionesCajaEgresoDetalle);		
		this.jmenuBarDetalleCajaEgresoDetalle.add(this.jmenuDetalleDatosCajaEgresoDetalle);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCajaEgresoDetalle);				
	}
	
	
	public void inicializarElementosCamposCajaEgresoDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCajaEgresoDetalle = new JLabelMe();
		jLabelIdCajaEgresoDetalle.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCajaEgresoDetalle = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCajaEgresoDetalle.setToolTipText(CajaEgresoDetalleConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCajaEgresoDetalle= new GridBagLayout();

		this.jPanelidCajaEgresoDetalle.setLayout(this.gridaBagLayoutCajaEgresoDetalle);

		jLabelidCajaEgresoDetalle = new JLabel();
		jLabelidCajaEgresoDetalle.setText("Id");

		jLabelidCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelconceptoCajaEgresoDetalle = new JLabelMe();
		this.jLabelconceptoCajaEgresoDetalle.setText(""+CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO+" : *");
		this.jLabelconceptoCajaEgresoDetalle.setToolTipText("Concepto");
		this.jLabelconceptoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconceptoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconceptoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelconceptoCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelconceptoCajaEgresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelconceptoCajaEgresoDetalle.setToolTipText(CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO);
		this.gridaBagLayoutCajaEgresoDetalle = new GridBagLayout();
		this.jPanelconceptoCajaEgresoDetalle.setLayout(this.gridaBagLayoutCajaEgresoDetalle);


		jTextAreaconceptoCajaEgresoDetalle= new JTextAreaMe();
		jTextAreaconceptoCajaEgresoDetalle.setEnabled(false);
		jTextAreaconceptoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaconceptoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaconceptoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaconceptoCajaEgresoDetalle.setLineWrap(true);
		jTextAreaconceptoCajaEgresoDetalle.setWrapStyleWord(true);
		jTextAreaconceptoCajaEgresoDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaconceptoCajaEgresoDetalle.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaconceptoCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneconceptoCajaEgresoDetalle = new JScrollPane(jTextAreaconceptoCajaEgresoDetalle);
		jscrollPaneconceptoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneconceptoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneconceptoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonconceptoCajaEgresoDetalleBusqueda= new JButtonMe();
		this.jButtonconceptoCajaEgresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconceptoCajaEgresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconceptoCajaEgresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonconceptoCajaEgresoDetalleBusqueda.setText("U");
		this.jButtonconceptoCajaEgresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonconceptoCajaEgresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonconceptoCajaEgresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaconceptoCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaconceptoCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"conceptoCajaEgresoDetalleBusqueda"));

		if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonconceptoCajaEgresoDetalleBusqueda.setVisible(false);		}


					
		this.jLabelvalorCajaEgresoDetalle = new JLabelMe();
		this.jLabelvalorCajaEgresoDetalle.setText(""+CajaEgresoDetalleConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorCajaEgresoDetalle.setToolTipText("Valor");
		this.jLabelvalorCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorCajaEgresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorCajaEgresoDetalle.setToolTipText(CajaEgresoDetalleConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutCajaEgresoDetalle = new GridBagLayout();
		this.jPanelvalorCajaEgresoDetalle.setLayout(this.gridaBagLayoutCajaEgresoDetalle);


		jTextFieldvalorCajaEgresoDetalle= new JTextFieldMe();
		jTextFieldvalorCajaEgresoDetalle.setEnabled(false);
		jTextFieldvalorCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorCajaEgresoDetalle.setText("0.0");

		this.jButtonvalorCajaEgresoDetalleBusqueda= new JButtonMe();
		this.jButtonvalorCajaEgresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCajaEgresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCajaEgresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorCajaEgresoDetalleBusqueda.setText("U");
		this.jButtonvalorCajaEgresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorCajaEgresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorCajaEgresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorCajaEgresoDetalleBusqueda"));

		if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorCajaEgresoDetalleBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCajaEgresoDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_caja_egresoCajaEgresoDetalle = new JLabelMe();
		this.jLabelid_caja_egresoCajaEgresoDetalle.setText(""+CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO+" : *");
		this.jLabelid_caja_egresoCajaEgresoDetalle.setToolTipText("Caja Egreso");
		this.jLabelid_caja_egresoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_caja_egresoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_caja_egresoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_caja_egresoCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_caja_egresoCajaEgresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_caja_egresoCajaEgresoDetalle.setToolTipText(CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO);
		this.gridaBagLayoutCajaEgresoDetalle = new GridBagLayout();
		this.jPanelid_caja_egresoCajaEgresoDetalle.setLayout(this.gridaBagLayoutCajaEgresoDetalle);


		jComboBoxid_caja_egresoCajaEgresoDetalle= new JComboBoxMe();
		jComboBoxid_caja_egresoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_caja_egresoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_caja_egresoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_caja_egresoCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_caja_egresoCajaEgresoDetalle= new JButtonMe();
		this.jButtonid_caja_egresoCajaEgresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_caja_egresoCajaEgresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_caja_egresoCajaEgresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_caja_egresoCajaEgresoDetalle.setText("Buscar");
		this.jButtonid_caja_egresoCajaEgresoDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_caja_egresoCajaEgresoDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_caja_egresoCajaEgresoDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_caja_egresoCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_caja_egresoCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_caja_egresoCajaEgresoDetalle"));

		this.jButtonid_caja_egresoCajaEgresoDetalleBusqueda= new JButtonMe();
		this.jButtonid_caja_egresoCajaEgresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_caja_egresoCajaEgresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_caja_egresoCajaEgresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_caja_egresoCajaEgresoDetalleBusqueda.setText("U");
		this.jButtonid_caja_egresoCajaEgresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_caja_egresoCajaEgresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_caja_egresoCajaEgresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_caja_egresoCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_caja_egresoCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_caja_egresoCajaEgresoDetalleBusqueda"));

		if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_caja_egresoCajaEgresoDetalleBusqueda.setVisible(false);		}

		this.jButtonid_caja_egresoCajaEgresoDetalleUpdate= new JButtonMe();
		this.jButtonid_caja_egresoCajaEgresoDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_caja_egresoCajaEgresoDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_caja_egresoCajaEgresoDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_caja_egresoCajaEgresoDetalleUpdate.setText("U");
		this.jButtonid_caja_egresoCajaEgresoDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_caja_egresoCajaEgresoDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_caja_egresoCajaEgresoDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_caja_egresoCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_caja_egresoCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_caja_egresoCajaEgresoDetalleUpdate"));



					
		this.jLabelid_empresaCajaEgresoDetalle = new JLabelMe();
		this.jLabelid_empresaCajaEgresoDetalle.setText(""+CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCajaEgresoDetalle.setToolTipText("Empresa");
		this.jLabelid_empresaCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCajaEgresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCajaEgresoDetalle.setToolTipText(CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCajaEgresoDetalle = new GridBagLayout();
		this.jPanelid_empresaCajaEgresoDetalle.setLayout(this.gridaBagLayoutCajaEgresoDetalle);


		jComboBoxid_empresaCajaEgresoDetalle= new JComboBoxMe();
		jComboBoxid_empresaCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCajaEgresoDetalle.setEnabled(false);

		this.jButtonid_empresaCajaEgresoDetalle= new JButtonMe();
		this.jButtonid_empresaCajaEgresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaEgresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaEgresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaEgresoDetalle.setText("Buscar");
		this.jButtonid_empresaCajaEgresoDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCajaEgresoDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaEgresoDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaEgresoDetalle"));

		this.jButtonid_empresaCajaEgresoDetalleBusqueda= new JButtonMe();
		this.jButtonid_empresaCajaEgresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaEgresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaEgresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaEgresoDetalleBusqueda.setText("U");
		this.jButtonid_empresaCajaEgresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCajaEgresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaEgresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaEgresoDetalleBusqueda"));

		if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCajaEgresoDetalleBusqueda.setVisible(false);		}

		this.jButtonid_empresaCajaEgresoDetalleUpdate= new JButtonMe();
		this.jButtonid_empresaCajaEgresoDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaEgresoDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaEgresoDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaEgresoDetalleUpdate.setText("U");
		this.jButtonid_empresaCajaEgresoDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCajaEgresoDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaEgresoDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaEgresoDetalleUpdate"));



					
		this.jLabelid_sucursalCajaEgresoDetalle = new JLabelMe();
		this.jLabelid_sucursalCajaEgresoDetalle.setText(""+CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCajaEgresoDetalle.setToolTipText("Sucursal");
		this.jLabelid_sucursalCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCajaEgresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCajaEgresoDetalle.setToolTipText(CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCajaEgresoDetalle = new GridBagLayout();
		this.jPanelid_sucursalCajaEgresoDetalle.setLayout(this.gridaBagLayoutCajaEgresoDetalle);


		jComboBoxid_sucursalCajaEgresoDetalle= new JComboBoxMe();
		jComboBoxid_sucursalCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCajaEgresoDetalle.setEnabled(false);

		this.jButtonid_sucursalCajaEgresoDetalle= new JButtonMe();
		this.jButtonid_sucursalCajaEgresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaEgresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaEgresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaEgresoDetalle.setText("Buscar");
		this.jButtonid_sucursalCajaEgresoDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCajaEgresoDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaEgresoDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaEgresoDetalle"));

		this.jButtonid_sucursalCajaEgresoDetalleBusqueda= new JButtonMe();
		this.jButtonid_sucursalCajaEgresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaEgresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaEgresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaEgresoDetalleBusqueda.setText("U");
		this.jButtonid_sucursalCajaEgresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCajaEgresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaEgresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaEgresoDetalleBusqueda"));

		if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCajaEgresoDetalleBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCajaEgresoDetalleUpdate= new JButtonMe();
		this.jButtonid_sucursalCajaEgresoDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaEgresoDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaEgresoDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaEgresoDetalleUpdate.setText("U");
		this.jButtonid_sucursalCajaEgresoDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCajaEgresoDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaEgresoDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaEgresoDetalleUpdate"));



					
		this.jLabelid_clienteCajaEgresoDetalle = new JLabelMe();
		this.jLabelid_clienteCajaEgresoDetalle.setText(""+CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteCajaEgresoDetalle.setToolTipText("Cliente");
		this.jLabelid_clienteCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteCajaEgresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteCajaEgresoDetalle.setToolTipText(CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutCajaEgresoDetalle = new GridBagLayout();
		this.jPanelid_clienteCajaEgresoDetalle.setLayout(this.gridaBagLayoutCajaEgresoDetalle);


		jComboBoxid_clienteCajaEgresoDetalle= new JComboBoxMe();
		jComboBoxid_clienteCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteCajaEgresoDetalle= new JButtonMe();
		this.jButtonid_clienteCajaEgresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaEgresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaEgresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaEgresoDetalle.setText("Buscar");
		this.jButtonid_clienteCajaEgresoDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteCajaEgresoDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaEgresoDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaEgresoDetalle"));

		this.jButtonid_clienteCajaEgresoDetalleBusqueda= new JButtonMe();
		this.jButtonid_clienteCajaEgresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaEgresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaEgresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCajaEgresoDetalleBusqueda.setText("U");
		this.jButtonid_clienteCajaEgresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteCajaEgresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaEgresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaEgresoDetalleBusqueda"));

		if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteCajaEgresoDetalleBusqueda.setVisible(false);		}

		this.jButtonid_clienteCajaEgresoDetalleUpdate= new JButtonMe();
		this.jButtonid_clienteCajaEgresoDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaEgresoDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaEgresoDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCajaEgresoDetalleUpdate.setText("U");
		this.jButtonid_clienteCajaEgresoDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteCajaEgresoDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaEgresoDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaEgresoDetalleUpdate"));



					
		this.jLabelid_facturaCajaEgresoDetalle = new JLabelMe();
		this.jLabelid_facturaCajaEgresoDetalle.setText(""+CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaCajaEgresoDetalle.setToolTipText("Factura");
		this.jLabelid_facturaCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaCajaEgresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaCajaEgresoDetalle.setToolTipText(CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutCajaEgresoDetalle = new GridBagLayout();
		this.jPanelid_facturaCajaEgresoDetalle.setLayout(this.gridaBagLayoutCajaEgresoDetalle);


		jComboBoxid_facturaCajaEgresoDetalle= new JComboBoxMe();
		jComboBoxid_facturaCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaCajaEgresoDetalle= new JButtonMe();
		this.jButtonid_facturaCajaEgresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaCajaEgresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaCajaEgresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaCajaEgresoDetalle.setText("Buscar");
		this.jButtonid_facturaCajaEgresoDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaCajaEgresoDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaCajaEgresoDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaCajaEgresoDetalle"));

		this.jButtonid_facturaCajaEgresoDetalleBusqueda= new JButtonMe();
		this.jButtonid_facturaCajaEgresoDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCajaEgresoDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCajaEgresoDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaCajaEgresoDetalleBusqueda.setText("U");
		this.jButtonid_facturaCajaEgresoDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaCajaEgresoDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaCajaEgresoDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaCajaEgresoDetalleBusqueda"));

		if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaCajaEgresoDetalleBusqueda.setVisible(false);		}

		this.jButtonid_facturaCajaEgresoDetalleUpdate= new JButtonMe();
		this.jButtonid_facturaCajaEgresoDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCajaEgresoDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCajaEgresoDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaCajaEgresoDetalleUpdate.setText("U");
		this.jButtonid_facturaCajaEgresoDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaCajaEgresoDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaCajaEgresoDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaCajaEgresoDetalleUpdate"));



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
		//this.jInternalFrameDetalleCajaEgresoDetalle = new CajaEgresoDetalleBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Caja Egreso Detalle DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaEgresoDetalle= new GridBagLayout();
		

		
		String sToolTipCajaEgresoDetalle="";
		sToolTipCajaEgresoDetalle=CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaEgresoDetalle+="(PuntoVenta.CajaEgresoDetalle)";
		}
		
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaEgresoDetalle+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCajaEgresoDetalle = new JButtonMe();
		this.jButtonModificarCajaEgresoDetalle = new JButtonMe();
        this.jButtonActualizarCajaEgresoDetalle = new JButtonMe();
        this.jButtonEliminarCajaEgresoDetalle = new JButtonMe();
        this.jButtonCancelarCajaEgresoDetalle = new JButtonMe();
        this.jButtonGuardarCambiosCajaEgresoDetalle = new JButtonMe();
		this.jButtonGuardarCambiosTablaCajaEgresoDetalle = new JButtonMe();
		this.jButtonCerrarCajaEgresoDetalle = new JButtonMe();
		
		this.jScrollPanelDatosCajaEgresoDetalle = new JScrollPane();   
        this.jScrollPanelDatosEdicionCajaEgresoDetalle = new JScrollPane();
		this.jScrollPanelDatosGeneralCajaEgresoDetalle = new JScrollPane();
				
		
		
		this.jPanelCamposCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Egreso Detalle";
		
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egreso Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaEgresoDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCajaEgresoDetalle.setName("jPanelCamposCajaEgresoDetalle"); 

		this.jPanelCamposOcultosCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCajaEgresoDetalle.setName("jPanelCamposOcultosCajaEgresoDetalle"); 

        this.jPanelAccionesCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaEgresoDetalle.setToolTipText("Acciones");
        this.jPanelAccionesCajaEgresoDetalle.setName("Acciones"); 

		this.jPanelAccionesFormularioCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCajaEgresoDetalle.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCajaEgresoDetalle.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCajaEgresoDetalle.setText("Nuevo");
		this.jButtonModificarCajaEgresoDetalle.setText("Editar");
        this.jButtonActualizarCajaEgresoDetalle.setText("Actualizar");
        this.jButtonEliminarCajaEgresoDetalle.setText("Eliminar");
        this.jButtonCancelarCajaEgresoDetalle.setText("Cancelar");
        this.jButtonGuardarCambiosCajaEgresoDetalle.setText("Guardar");
		this.jButtonGuardarCambiosTablaCajaEgresoDetalle.setText("Guardar");
		this.jButtonCerrarCajaEgresoDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaEgresoDetalle,"nuevo_button","Nuevo",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCajaEgresoDetalle,"modificar_button","Editar",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCajaEgresoDetalle,"actualizar_button","Actualizar",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCajaEgresoDetalle,"eliminar_button","Eliminar",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCajaEgresoDetalle,"cancelar_button","Cancelar",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCajaEgresoDetalle,"guardarcambios_button","Guardar",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaEgresoDetalle,"guardarcambiostabla_button","Guardar",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaEgresoDetalle,"cerrar_button","Salir",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCajaEgresoDetalle.setToolTipText("Nuevo"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCajaEgresoDetalle.setToolTipText("Editar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCajaEgresoDetalle.setToolTipText("Actualizar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCajaEgresoDetalle.setToolTipText("Eliminar)"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCajaEgresoDetalle.setToolTipText("Cancelar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCajaEgresoDetalle.setToolTipText("Guardar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCajaEgresoDetalle.setToolTipText("Guardar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaEgresoDetalle.setToolTipText("Salir"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaEgresoDetalle";
		inputMap = this.jButtonNuevoCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaEgresoDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaEgresoDetalle"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCajaEgresoDetalle";
		inputMap = this.jButtonActualizarCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCajaEgresoDetalle"));
		
		//ELIMINAR
		sMapKey = "EliminarCajaEgresoDetalle";
		inputMap = this.jButtonEliminarCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCajaEgresoDetalle"));
		
		//CANCELAR	
		sMapKey = "CancelarCajaEgresoDetalle";
		inputMap = this.jButtonCancelarCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCajaEgresoDetalle"));
		
		//CERRAR		
		sMapKey = "CerrarCajaEgresoDetalle";
		inputMap = this.jButtonCerrarCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaEgresoDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaEgresoDetalle";
		inputMap = this.jButtonGuardarCambiosTablaCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaEgresoDetalle"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCajaEgresoDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCajaEgresoDetalle.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCajaEgresoDetalle.setToolTipText("Nuevo CajaEgresoDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCajaEgresoDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCajaEgresoDetalle.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCajaEgresoDetalle.setToolTipText("Sin Cerrar Ventana CajaEgresoDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCajaEgresoDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCajaEgresoDetalle.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCajaEgresoDetalle.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaEgresoDetalle.setText("Accion");
		this.jComboBoxTiposAccionesCajaEgresoDetalle.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCajaEgresoDetalle = new JLabelMe();
		
		this.jLabelAccionesCajaEgresoDetalle.setText("Acciones");		
		this.jLabelAccionesCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCajaEgresoDetalle();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCajaEgresoDetalle();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCajaEgresoDetalle=new JTabbedPane();
		this.jTabbedPaneRelacionesCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCajaEgresoDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaEgresoDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaEgresoDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCajaEgresoDetalle = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCajaEgresoDetalle = new GridBagLayout();
		
		this.jPanelCamposCajaEgresoDetalle.setLayout(gridaBagLayoutCamposCajaEgresoDetalle);
		this.jPanelCamposOcultosCajaEgresoDetalle.setLayout(gridaBagLayoutCamposOcultosCajaEgresoDetalle);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCajaEgresoDetalle.add(jLabelIdCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCajaEgresoDetalle.add(jLabelidCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);


	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_caja_egresoCajaEgresoDetalle.add(jLabelid_caja_egresoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 2;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_caja_egresoCajaEgresoDetalle.add(jButtonid_caja_egresoCajaEgresoDetalleBusqueda, this.gridBagConstraintsCajaEgresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 3;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_caja_egresoCajaEgresoDetalle.add(jButtonid_caja_egresoCajaEgresoDetalleUpdate, this.gridBagConstraintsCajaEgresoDetalle);
	}

	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_caja_egresoCajaEgresoDetalle.add(jComboBoxid_caja_egresoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);


	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCajaEgresoDetalle.add(jLabelid_empresaCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 2;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaEgresoDetalle.add(jButtonid_empresaCajaEgresoDetalleBusqueda, this.gridBagConstraintsCajaEgresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 3;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaEgresoDetalle.add(jButtonid_empresaCajaEgresoDetalleUpdate, this.gridBagConstraintsCajaEgresoDetalle);
	}

	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCajaEgresoDetalle.add(jComboBoxid_empresaCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);


	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCajaEgresoDetalle.add(jLabelid_sucursalCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 2;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajaEgresoDetalle.add(jButtonid_sucursalCajaEgresoDetalleBusqueda, this.gridBagConstraintsCajaEgresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 3;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajaEgresoDetalle.add(jButtonid_sucursalCajaEgresoDetalleUpdate, this.gridBagConstraintsCajaEgresoDetalle);
	}

	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCajaEgresoDetalle.add(jComboBoxid_sucursalCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);


	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteCajaEgresoDetalle.add(jLabelid_clienteCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 2;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteCajaEgresoDetalle.add(jButtonid_clienteCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 3;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCajaEgresoDetalle.add(jButtonid_clienteCajaEgresoDetalleBusqueda, this.gridBagConstraintsCajaEgresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 4;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCajaEgresoDetalle.add(jButtonid_clienteCajaEgresoDetalleUpdate, this.gridBagConstraintsCajaEgresoDetalle);
	}

	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteCajaEgresoDetalle.add(jComboBoxid_clienteCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);


	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaCajaEgresoDetalle.add(jLabelid_facturaCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 2;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaCajaEgresoDetalle.add(jButtonid_facturaCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 3;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaCajaEgresoDetalle.add(jButtonid_facturaCajaEgresoDetalleBusqueda, this.gridBagConstraintsCajaEgresoDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 4;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaCajaEgresoDetalle.add(jButtonid_facturaCajaEgresoDetalleUpdate, this.gridBagConstraintsCajaEgresoDetalle);
	}

	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaCajaEgresoDetalle.add(jComboBoxid_facturaCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);


	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelconceptoCajaEgresoDetalle.add(jLabelconceptoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 2;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelconceptoCajaEgresoDetalle.add(jButtonconceptoCajaEgresoDetalleBusqueda, this.gridBagConstraintsCajaEgresoDetalle);
	}

	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelconceptoCajaEgresoDetalle.add(jscrollPaneconceptoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);


	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorCajaEgresoDetalle.add(jLabelvalorCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 2;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
		this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorCajaEgresoDetalle.add(jButtonvalorCajaEgresoDetalleBusqueda, this.gridBagConstraintsCajaEgresoDetalle);
	}

	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = 1;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorCajaEgresoDetalle.add(jTextFieldvalorCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = iYPanelCamposCajaEgresoDetalle;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = iXPanelCamposCajaEgresoDetalle++;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgresoDetalle.add(this.jPanelidCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(iXPanelCamposCajaEgresoDetalle % 1==0) {
		iXPanelCamposCajaEgresoDetalle=0;
		iYPanelCamposCajaEgresoDetalle++;
	}
	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = iYPanelCamposCajaEgresoDetalle;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = iXPanelCamposCajaEgresoDetalle++;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgresoDetalle.add(this.jPanelid_caja_egresoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(iXPanelCamposCajaEgresoDetalle % 1==0) {
		iXPanelCamposCajaEgresoDetalle=0;
		iYPanelCamposCajaEgresoDetalle++;
	}
	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = iYPanelCamposCajaEgresoDetalle;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = iXPanelCamposCajaEgresoDetalle++;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgresoDetalle.add(this.jPanelid_clienteCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(iXPanelCamposCajaEgresoDetalle % 1==0) {
		iXPanelCamposCajaEgresoDetalle=0;
		iYPanelCamposCajaEgresoDetalle++;
	}
	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = iYPanelCamposCajaEgresoDetalle;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = iXPanelCamposCajaEgresoDetalle++;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgresoDetalle.add(this.jPanelid_facturaCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(iXPanelCamposCajaEgresoDetalle % 1==0) {
		iXPanelCamposCajaEgresoDetalle=0;
		iYPanelCamposCajaEgresoDetalle++;
	}
	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = iYPanelCamposCajaEgresoDetalle;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = iXPanelCamposCajaEgresoDetalle++;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgresoDetalle.add(this.jPanelconceptoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(iXPanelCamposCajaEgresoDetalle % 1==0) {
		iXPanelCamposCajaEgresoDetalle=0;
		iYPanelCamposCajaEgresoDetalle++;
	}
	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = iYPanelCamposCajaEgresoDetalle;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = iXPanelCamposCajaEgresoDetalle++;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgresoDetalle.add(this.jPanelvalorCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(iXPanelCamposCajaEgresoDetalle % 1==0) {
		iXPanelCamposCajaEgresoDetalle=0;
		iYPanelCamposCajaEgresoDetalle++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = iYPanelCamposOcultosCajaEgresoDetalle;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = iXPanelCamposOcultosCajaEgresoDetalle++;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaEgresoDetalle.add(this.jPanelid_empresaCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(iXPanelCamposOcultosCajaEgresoDetalle % 1==0) {
		iXPanelCamposOcultosCajaEgresoDetalle=0;
		iYPanelCamposOcultosCajaEgresoDetalle++;
	}
	this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgresoDetalle.gridy = iYPanelCamposOcultosCajaEgresoDetalle;
	this.gridBagConstraintsCajaEgresoDetalle.gridx = iXPanelCamposOcultosCajaEgresoDetalle++;
	this.gridBagConstraintsCajaEgresoDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgresoDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaEgresoDetalle.add(this.jPanelid_sucursalCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);



	if(iXPanelCamposOcultosCajaEgresoDetalle % 1==0) {
		iXPanelCamposOcultosCajaEgresoDetalle=0;
		iYPanelCamposOcultosCajaEgresoDetalle++;
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
			
		GridBagLayout gridaBagLayoutAccionesCajaEgresoDetalle= new GridBagLayout();
		this.jPanelAccionesCajaEgresoDetalle.setLayout(gridaBagLayoutAccionesCajaEgresoDetalle);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCajaEgresoDetalle= new GridBagLayout();
		this.jPanelAccionesFormularioCajaEgresoDetalle.setLayout(gridaBagLayoutAccionesFormularioCajaEgresoDetalle);
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaEgresoDetalle.add(this.jComboBoxTiposAccionesFormularioCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaEgresoDetalle.add(this.jCheckBoxPostAccionNuevoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajaEgresoDetalle.add(this.jCheckBoxPostAccionSinCerrarCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajaEgresoDetalle.add(this.jCheckBoxPostAccionSinMensajeCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccion++;
			
		this.jPanelAccionesCajaEgresoDetalle.add(this.jButtonModificarCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);							

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx =iPosXAccion++;
			
		this.jPanelAccionesCajaEgresoDetalle.add(this.jButtonEliminarCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
			
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaEgresoDetalle.add(this.jButtonActualizarCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);


		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaEgresoDetalle.add(this.jButtonGuardarCambiosCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);	
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx =iPosXAccion++;
		
		this.jPanelAccionesCajaEgresoDetalle.add(this.jButtonCancelarCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaEgresoDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaEgresoDetalle);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();						
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;		
			//this.gridBagConstraintsCajaEgresoDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaEgresoDetalle.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaEgresoDetalle.gridx =0;
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaEgresoDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CajaEgresoDetalleJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCajaEgresoDetalle = new CajaEgresoDetalleBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Caja Egreso Detalle DATOS");
			
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
			
	        //this.setTitle("[FOR] - Caja Egreso Detalle DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Egreso Detalle Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CajaEgresoDetalleModel cajaegresodetalleModel=new CajaEgresoDetalleModel(this);
			
			//SI USARA CLASE INTERNA
			//CajaEgresoDetalleModel.CajaEgresoDetalleFocusTraversalPolicy cajaegresodetalleFocusTraversalPolicy = cajaegresodetalleModel.new CajaEgresoDetalleFocusTraversalPolicy(this);
			
			//cajaegresodetalleFocusTraversalPolicy.setcajaegresodetalleJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cajaegresodetalleModel);
			
			
			this.jContentPaneDetalleCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCajaEgresoDetalle = new GridBagLayout();	
			this.jContentPaneDetalleCajaEgresoDetalle.setLayout(gridaBagLayoutDetalleCajaEgresoDetalle);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaEgresoDetalle = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
				this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
					
				
				this.jContentPaneDetalleCajaEgresoDetalle.add(jTtoolBarDetalleCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);								
				
}
			
			this.jScrollPanelDatosEdicionCajaEgresoDetalle=   new JScrollPane(jContentPaneDetalleCajaEgresoDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCajaEgresoDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
	        
			this.jContentPaneDetalleCajaEgresoDetalle.add(jPanelCamposCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);
			
			
			
			
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
						&& cajaegresodetalleSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCajaEgresoDetalle= new GridBagConstraints();
						this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
						this.jContentPaneDetalleCajaEgresoDetalle.add(this.jTabbedPaneRelacionesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCajaEgresoDetalle.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCajaEgresoDetalle.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
					this.gridBagConstraintsCajaEgresoDetalle.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
					
				
					this.jContentPaneDetalleCajaEgresoDetalle.add(jPanelCamposOcultosCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);
				
					this.jPanelCamposOcultosCajaEgresoDetalle.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
	        this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCajaEgresoDetalle.add(this.jPanelAccionesFormularioCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);							
			
			
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
	        this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
	        
			
			this.jContentPaneDetalleCajaEgresoDetalle.add(this.jPanelAccionesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCajaEgresoDetalle);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCajaEgresoDetalle=   new JScrollPane(this.jPanelCamposCajaEgresoDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCajaEgresoDetalle.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);			
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			
			
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
			
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCajaEgresoDetalle;//jContentPane;
		
		return jScrollPanelDatosEdicionCajaEgresoDetalle;
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
