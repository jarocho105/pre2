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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.CobrarDetalleCobrosConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class CobrarDetalleCobrosDetalleFormJInternalFrame extends CobrarDetalleCobrosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarDetalleCobros;
	
	protected JMenuBar jmenuBarDetalleCobrarDetalleCobros;
	
	protected JMenu jmenuDetalleCobrarDetalleCobros;
	protected JMenu jmenuDetalleArchivoCobrarDetalleCobros;
	protected JMenu jmenuDetalleAccionesCobrarDetalleCobros;
	protected JMenu jmenuDetalleDatosCobrarDetalleCobros;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarDetalleCobros;	
	protected GridBagConstraints gridBagConstraintsCobrarDetalleCobros;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarDetalleCobrosBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarDetalleCobros;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public CobrarDetalleCobrosSessionBean cobrardetallecobrosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;	
	
	public CobrarDetalleCobrosLogic cobrardetallecobrosLogic;
	
	public JScrollPane jScrollPanelDatosCobrarDetalleCobros;
	public JScrollPane jScrollPanelDatosEdicionCobrarDetalleCobros;
	public JScrollPane jScrollPanelDatosGeneralCobrarDetalleCobros;
	
	protected JPanel jPanelCamposCobrarDetalleCobros;    
	protected JPanel jPanelCamposOcultosCobrarDetalleCobros;    	
	protected JPanel jPanelAccionesCobrarDetalleCobros;
	protected JPanel jPanelAccionesFormularioCobrarDetalleCobros;
    
	
	
	protected Integer iXPanelCamposCobrarDetalleCobros=0;
	protected Integer iYPanelCamposCobrarDetalleCobros=0;
	
	protected Integer iXPanelCamposOcultosCobrarDetalleCobros=0;
	protected Integer iYPanelCamposOcultosCobrarDetalleCobros=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarDetalleCobros;
	public JButton jButtonModificarCobrarDetalleCobros;
	public JButton jButtonActualizarCobrarDetalleCobros;
    public JButton jButtonEliminarCobrarDetalleCobros;
	public JButton jButtonCancelarCobrarDetalleCobros;
    public JButton jButtonGuardarCambiosCobrarDetalleCobros;
	public JButton jButtonGuardarCambiosTablaCobrarDetalleCobros;
	protected JButton jButtonCerrarCobrarDetalleCobros;
	
	
	protected JButton jButtonProcesarInformacionCobrarDetalleCobros;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarDetalleCobros;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarDetalleCobros;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarDetalleCobros;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarDetalleCobros;
	protected JButton jButtonModificarToolBarCobrarDetalleCobros;
	protected JButton jButtonActualizarToolBarCobrarDetalleCobros;
    protected JButton jButtonEliminarToolBarCobrarDetalleCobros;
	protected JButton jButtonCancelarToolBarCobrarDetalleCobros;
    protected JButton jButtonGuardarCambiosToolBarCobrarDetalleCobros;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarDetalleCobros;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarDetalleCobros;
	protected JButton jButtonCerrarToolBarCobrarDetalleCobros;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarDetalleCobros;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarDetalleCobros;
	protected JMenuItem jMenuItemModificarCobrarDetalleCobros;
	protected JMenuItem jMenuItemActualizarCobrarDetalleCobros;
    protected JMenuItem jMenuItemEliminarCobrarDetalleCobros;
	protected JMenuItem jMenuItemCancelarCobrarDetalleCobros;
    protected JMenuItem jMenuItemGuardarCambiosCobrarDetalleCobros;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarDetalleCobros;
	protected JMenuItem jMenuItemCerrarCobrarDetalleCobros;
	protected JMenuItem jMenuItemDetalleCerrarCobrarDetalleCobros;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarDetalleCobros;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarDetalleCobros;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarDetalleCobros;
	protected JMenuItem jMenuItemMostrarOcultarCobrarDetalleCobros;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarDetalleCobros;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarDetalleCobros;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarDetalleCobros;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarDetalleCobros;
	public JLabel jLabelIdCobrarDetalleCobros;
	public JLabel jLabelidCobrarDetalleCobros;
	public JButton jButtonidCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionCobrarDetalleCobros;
	public JLabel jLabelfecha_emisionCobrarDetalleCobros;
	//public JFormattedTextField jDateChooserfecha_emisionCobrarDetalleCobros;

	public JDateChooser jDateChooserfecha_emisionCobrarDetalleCobros;
	public JButton jButtonfecha_emisionCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaCobrarDetalleCobros;
	public JLabel jLabelfecha_emision_hastaCobrarDetalleCobros;
	//public JFormattedTextField jDateChooserfecha_emision_hastaCobrarDetalleCobros;

	public JDateChooser jDateChooserfecha_emision_hastaCobrarDetalleCobros;
	public JButton jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_vendedorCobrarDetalleCobros;
	public JLabel jLabelnombre_vendedorCobrarDetalleCobros;
	public JTextArea jTextAreanombre_vendedorCobrarDetalleCobros;
	public JScrollPane jscrollPanenombre_vendedorCobrarDetalleCobros;
	public JButton jButtonnombre_vendedorCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarDetalleCobros;
	public JLabel jLabelcodigoCobrarDetalleCobros;
	public JTextField jTextFieldcodigoCobrarDetalleCobros;
	public JButton jButtoncodigoCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelnombreCobrarDetalleCobros;
	public JLabel jLabelnombreCobrarDetalleCobros;
	public JTextArea jTextAreanombreCobrarDetalleCobros;
	public JScrollPane jscrollPanenombreCobrarDetalleCobros;
	public JButton jButtonnombreCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelapellidoCobrarDetalleCobros;
	public JLabel jLabelapellidoCobrarDetalleCobros;
	public JTextArea jTextAreaapellidoCobrarDetalleCobros;
	public JScrollPane jscrollPaneapellidoCobrarDetalleCobros;
	public JButton jButtonapellidoCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_facturasCobrarDetalleCobros;
	public JLabel jLabeltotal_facturasCobrarDetalleCobros;
	public JTextField jTextFieldtotal_facturasCobrarDetalleCobros;
	public JButton jButtontotal_facturasCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_abonosCobrarDetalleCobros;
	public JLabel jLabeltotal_abonosCobrarDetalleCobros;
	public JTextField jTextFieldtotal_abonosCobrarDetalleCobros;
	public JButton jButtontotal_abonosCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_facturas_actualCobrarDetalleCobros;
	public JLabel jLabeltotal_facturas_actualCobrarDetalleCobros;
	public JTextField jTextFieldtotal_facturas_actualCobrarDetalleCobros;
	public JButton jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelabonos_anteriorCobrarDetalleCobros;
	public JLabel jLabelabonos_anteriorCobrarDetalleCobros;
	public JTextField jTextFieldabonos_anteriorCobrarDetalleCobros;
	public JButton jButtonabonos_anteriorCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelabonos_actualCobrarDetalleCobros;
	public JLabel jLabelabonos_actualCobrarDetalleCobros;
	public JTextField jTextFieldabonos_actualCobrarDetalleCobros;
	public JButton jButtonabonos_actualCobrarDetalleCobrosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarDetalleCobros;
	public JLabel jLabelid_empresaCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarDetalleCobros;
	public JButton jButtonid_empresaCobrarDetalleCobros= new JButtonMe();
	public JButton jButtonid_empresaCobrarDetalleCobrosUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelid_paisCobrarDetalleCobros;
	public JLabel jLabelid_paisCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisCobrarDetalleCobros;
	public JButton jButtonid_paisCobrarDetalleCobros= new JButtonMe();
	public JButton jButtonid_paisCobrarDetalleCobrosUpdate= new JButtonMe();
	public JButton jButtonid_paisCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadCobrarDetalleCobros;
	public JLabel jLabelid_ciudadCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadCobrarDetalleCobros;
	public JButton jButtonid_ciudadCobrarDetalleCobros= new JButtonMe();
	public JButton jButtonid_ciudadCobrarDetalleCobrosUpdate= new JButtonMe();
	public JButton jButtonid_ciudadCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaCobrarDetalleCobros;
	public JLabel jLabelid_zonaCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaCobrarDetalleCobros;
	public JButton jButtonid_zonaCobrarDetalleCobros= new JButtonMe();
	public JButton jButtonid_zonaCobrarDetalleCobrosUpdate= new JButtonMe();
	public JButton jButtonid_zonaCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_clienteCobrarDetalleCobros;
	public JLabel jLabelid_grupo_clienteCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteCobrarDetalleCobros;
	public JButton jButtonid_grupo_clienteCobrarDetalleCobros= new JButtonMe();
	public JButton jButtonid_grupo_clienteCobrarDetalleCobrosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorCobrarDetalleCobros;
	public JLabel jLabelid_vendedorCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorCobrarDetalleCobros;
	public JButton jButtonid_vendedorCobrarDetalleCobros= new JButtonMe();
	public JButton jButtonid_vendedorCobrarDetalleCobrosUpdate= new JButtonMe();
	public JButton jButtonid_vendedorCobrarDetalleCobrosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarDetalleCobros;
	
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
	public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarDetalleCobrosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarDetalleCobros=new JPanel();
				this.jPanelAccionesFormularioCobrarDetalleCobros=new JPanel();
				this.jmenuBarDetalleCobrarDetalleCobros=new JMenuBar();
				this.jTtoolBarDetalleCobrarDetalleCobros=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarDetalleCobrosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarDetalleCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarDetalleCobrosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarDetalleCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarDetalleCobrosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarDetalleCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarDetalleCobrosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarDetalleCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarDetalleCobrosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarDetalleCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarDetalleCobros() {
		return this.jButtonActualizarToolBarCobrarDetalleCobros;
	}
	
	public JButton getjButtonEliminarToolBarCobrarDetalleCobros() {
		return this.jButtonEliminarToolBarCobrarDetalleCobros;
	}
	
	public JButton getjButtonCancelarToolBarCobrarDetalleCobros() {
		return this.jButtonCancelarToolBarCobrarDetalleCobros;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarDetalleCobros() {
		return this.jButtonProcesarInformacionCobrarDetalleCobros;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarDetalleCobros)	{
		this.jButtonProcesarInformacionCobrarDetalleCobros = jButtonProcesarInformacionCobrarDetalleCobros;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarDetalleCobros() {
		return this.jComboBoxTiposAccionesCobrarDetalleCobros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarDetalleCobros(
			JComboBox jComboBoxTiposRelacionesCobrarDetalleCobros) {
		this.jComboBoxTiposRelacionesCobrarDetalleCobros = jComboBoxTiposRelacionesCobrarDetalleCobros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarDetalleCobros(
			JComboBox jComboBoxTiposAccionesCobrarDetalleCobros) {
		this.jComboBoxTiposAccionesCobrarDetalleCobros = jComboBoxTiposAccionesCobrarDetalleCobros;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarDetalleCobros() {
		return this.jComboBoxTiposAccionesFormularioCobrarDetalleCobros;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarDetalleCobros(
			JComboBox jComboBoxTiposAccionesFormularioCobrarDetalleCobros) {
		this.jComboBoxTiposAccionesFormularioCobrarDetalleCobros = jComboBoxTiposAccionesFormularioCobrarDetalleCobros;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean();
		
		this.cobrardetallecobrosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrardetallecobrosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarDetalleCobrosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarDetalleCobrosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarDetalleCobrosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Detalle Cobros MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarDetalleCobrosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarDetalleCobros= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarDetalleCobros=new JButtonMe();
				this.jButtonModificarToolBarCobrarDetalleCobros=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarDetalleCobros,this.jTtoolBarDetalleCobrarDetalleCobros,
							"actualizar","actualizar","Actualizar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarDetalleCobros,this.jTtoolBarDetalleCobrarDetalleCobros,
							"eliminar","eliminar","Eliminar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarDetalleCobros,this.jTtoolBarDetalleCobrarDetalleCobros,
							"cancelar","cancelar","Cancelar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarDetalleCobros,this.jTtoolBarDetalleCobrarDetalleCobros,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarDetalleCobros=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarDetalleCobros=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarDetalleCobros=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarDetalleCobros=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarDetalleCobros=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarDetalleCobros= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarDetalleCobros.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarDetalleCobros,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarDetalleCobros= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarDetalleCobros.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarDetalleCobros,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarDetalleCobros= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarDetalleCobros.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarDetalleCobros,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarDetalleCobros= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarDetalleCobros.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarDetalleCobros,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarDetalleCobros= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarDetalleCobros.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarDetalleCobros,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarDetalleCobros= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarDetalleCobros.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarDetalleCobros,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarDetalleCobros= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarDetalleCobros.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarDetalleCobros,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarDetalleCobros= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarDetalleCobros.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarDetalleCobros,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarDetalleCobros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarDetalleCobros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarDetalleCobros,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarDetalleCobros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarDetalleCobros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarDetalleCobros,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarDetalleCobros.add(this.jMenuItemDetalleCerrarCobrarDetalleCobros);
		
		this.jmenuDetalleAccionesCobrarDetalleCobros.add(this.jMenuItemActualizarCobrarDetalleCobros);
		this.jmenuDetalleAccionesCobrarDetalleCobros.add(this.jMenuItemEliminarCobrarDetalleCobros);
		this.jmenuDetalleAccionesCobrarDetalleCobros.add(this.jMenuItemCancelarCobrarDetalleCobros);		
		
		//this.jmenuDetalleDatosCobrarDetalleCobros.add(this.jMenuItemDetalleAbrirOrderByCobrarDetalleCobros);				
		this.jmenuDetalleDatosCobrarDetalleCobros.add(this.jMenuItemDetalleMostarOcultarCobrarDetalleCobros);				
				
		//this.jmenuDetalleAccionesCobrarDetalleCobros.add(this.jMenuItemGuardarCambiosCobrarDetalleCobros);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarDetalleCobros.add(this.jmenuDetalleArchivoCobrarDetalleCobros);		
		this.jmenuBarDetalleCobrarDetalleCobros.add(this.jmenuDetalleAccionesCobrarDetalleCobros);		
		this.jmenuBarDetalleCobrarDetalleCobros.add(this.jmenuDetalleDatosCobrarDetalleCobros);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarDetalleCobros);				
	}
	
	
	public void inicializarElementosCamposCobrarDetalleCobros() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarDetalleCobros = new JLabelMe();
		jLabelIdCobrarDetalleCobros.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarDetalleCobros = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarDetalleCobros= new GridBagLayout();

		this.jPanelidCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);

		jLabelidCobrarDetalleCobros = new JLabel();
		jLabelidCobrarDetalleCobros.setText("Id");

		jLabelidCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emisionCobrarDetalleCobros = new JLabelMe();
		this.jLabelfecha_emisionCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emisionCobrarDetalleCobros.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelfecha_emisionCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		//jFormattedTextFieldfecha_emisionCobrarDetalleCobros= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionCobrarDetalleCobros= new JDateChooser();
		jDateChooserfecha_emisionCobrarDetalleCobros.setEnabled(false);
		jDateChooserfecha_emisionCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionCobrarDetalleCobros.setDate(new Date());
		jDateChooserfecha_emisionCobrarDetalleCobros.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionCobrarDetalleCobros.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonfecha_emisionCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionCobrarDetalleCobrosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaCobrarDetalleCobros = new JLabelMe();
		this.jLabelfecha_emision_hastaCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaCobrarDetalleCobros.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelfecha_emision_hastaCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		//jFormattedTextFieldfecha_emision_hastaCobrarDetalleCobros= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaCobrarDetalleCobros= new JDateChooser();
		jDateChooserfecha_emision_hastaCobrarDetalleCobros.setEnabled(false);
		jDateChooserfecha_emision_hastaCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaCobrarDetalleCobros.setDate(new Date());
		jDateChooserfecha_emision_hastaCobrarDetalleCobros.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaCobrarDetalleCobros.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_vendedorCobrarDetalleCobros = new JLabelMe();
		this.jLabelnombre_vendedorCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR+" : *");
		this.jLabelnombre_vendedorCobrarDetalleCobros.setToolTipText("Nombre Vendedor");
		this.jLabelnombre_vendedorCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_vendedorCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_vendedorCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_vendedorCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBREVENDEDOR);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelnombre_vendedorCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jTextAreanombre_vendedorCobrarDetalleCobros= new JTextAreaMe();
		jTextAreanombre_vendedorCobrarDetalleCobros.setEnabled(false);
		jTextAreanombre_vendedorCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarDetalleCobros.setLineWrap(true);
		jTextAreanombre_vendedorCobrarDetalleCobros.setWrapStyleWord(true);
		jTextAreanombre_vendedorCobrarDetalleCobros.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_vendedorCobrarDetalleCobros.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_vendedorCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_vendedorCobrarDetalleCobros = new JScrollPane(jTextAreanombre_vendedorCobrarDetalleCobros);
		jscrollPanenombre_vendedorCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_vendedorCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_vendedorCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_vendedorCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_vendedorCobrarDetalleCobrosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarDetalleCobros = new JLabelMe();
		this.jLabelcodigoCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarDetalleCobros.setToolTipText("Codigo");
		this.jLabelcodigoCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelcodigoCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jTextFieldcodigoCobrarDetalleCobros= new JTextFieldMe();

		jTextFieldcodigoCobrarDetalleCobros.setEnabled(false);
		jTextFieldcodigoCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtoncodigoCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarDetalleCobrosBusqueda.setVisible(false);		}


					
		this.jLabelnombreCobrarDetalleCobros = new JLabelMe();
		this.jLabelnombreCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCobrarDetalleCobros.setToolTipText("Nombre");
		this.jLabelnombreCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelnombreCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jTextAreanombreCobrarDetalleCobros= new JTextAreaMe();
		jTextAreanombreCobrarDetalleCobros.setEnabled(false);
		jTextAreanombreCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarDetalleCobros.setLineWrap(true);
		jTextAreanombreCobrarDetalleCobros.setWrapStyleWord(true);
		jTextAreanombreCobrarDetalleCobros.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCobrarDetalleCobros.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCobrarDetalleCobros = new JScrollPane(jTextAreanombreCobrarDetalleCobros);
		jscrollPanenombreCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonnombreCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonnombreCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCobrarDetalleCobrosBusqueda.setVisible(false);		}


					
		this.jLabelapellidoCobrarDetalleCobros = new JLabelMe();
		this.jLabelapellidoCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoCobrarDetalleCobros.setToolTipText("Apello");
		this.jLabelapellidoCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelapellidoCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jTextAreaapellidoCobrarDetalleCobros= new JTextAreaMe();
		jTextAreaapellidoCobrarDetalleCobros.setEnabled(false);
		jTextAreaapellidoCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarDetalleCobros.setLineWrap(true);
		jTextAreaapellidoCobrarDetalleCobros.setWrapStyleWord(true);
		jTextAreaapellidoCobrarDetalleCobros.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoCobrarDetalleCobros.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoCobrarDetalleCobros = new JScrollPane(jTextAreaapellidoCobrarDetalleCobros);
		jscrollPaneapellidoCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonapellidoCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonapellidoCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoCobrarDetalleCobrosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_facturasCobrarDetalleCobros = new JLabelMe();
		this.jLabeltotal_facturasCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS+" : *");
		this.jLabeltotal_facturasCobrarDetalleCobros.setToolTipText("Total Facturas");
		this.jLabeltotal_facturasCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_facturasCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_facturasCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_facturasCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_facturasCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_facturasCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURAS);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPaneltotal_facturasCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jTextFieldtotal_facturasCobrarDetalleCobros= new JTextFieldMe();
		jTextFieldtotal_facturasCobrarDetalleCobros.setEnabled(false);
		jTextFieldtotal_facturasCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_facturasCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_facturasCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_facturasCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_facturasCobrarDetalleCobros.setText("0.0");

		this.jButtontotal_facturasCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtontotal_facturasCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_facturasCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_facturasCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_facturasCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtontotal_facturasCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_facturasCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_facturasCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_facturasCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_facturasCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_facturasCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_facturasCobrarDetalleCobrosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_abonosCobrarDetalleCobros = new JLabelMe();
		this.jLabeltotal_abonosCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS+" : *");
		this.jLabeltotal_abonosCobrarDetalleCobros.setToolTipText("Total Abonos");
		this.jLabeltotal_abonosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_abonosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_abonosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_abonosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_abonosCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_abonosCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALABONOS);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPaneltotal_abonosCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jTextFieldtotal_abonosCobrarDetalleCobros= new JTextFieldMe();
		jTextFieldtotal_abonosCobrarDetalleCobros.setEnabled(false);
		jTextFieldtotal_abonosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_abonosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_abonosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_abonosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_abonosCobrarDetalleCobros.setText("0.0");

		this.jButtontotal_abonosCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtontotal_abonosCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_abonosCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_abonosCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_abonosCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtontotal_abonosCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_abonosCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_abonosCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_abonosCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_abonosCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_abonosCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_abonosCobrarDetalleCobrosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_facturas_actualCobrarDetalleCobros = new JLabelMe();
		this.jLabeltotal_facturas_actualCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL+" : *");
		this.jLabeltotal_facturas_actualCobrarDetalleCobros.setToolTipText("Total Facturas Actual");
		this.jLabeltotal_facturas_actualCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_facturas_actualCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_facturas_actualCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_facturas_actualCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_facturas_actualCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_facturas_actualCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_TOTALFACTURASACTUAL);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPaneltotal_facturas_actualCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jTextFieldtotal_facturas_actualCobrarDetalleCobros= new JTextFieldMe();
		jTextFieldtotal_facturas_actualCobrarDetalleCobros.setEnabled(false);
		jTextFieldtotal_facturas_actualCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_facturas_actualCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_facturas_actualCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_facturas_actualCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_facturas_actualCobrarDetalleCobros.setText("0.0");

		this.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_facturas_actualCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_facturas_actualCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_facturas_actualCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda.setVisible(false);		}


					
		this.jLabelabonos_anteriorCobrarDetalleCobros = new JLabelMe();
		this.jLabelabonos_anteriorCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR+" : *");
		this.jLabelabonos_anteriorCobrarDetalleCobros.setToolTipText("Abonos Anterior");
		this.jLabelabonos_anteriorCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelabonos_anteriorCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelabonos_anteriorCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelabonos_anteriorCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelabonos_anteriorCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelabonos_anteriorCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSANTERIOR);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelabonos_anteriorCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jTextFieldabonos_anteriorCobrarDetalleCobros= new JTextFieldMe();
		jTextFieldabonos_anteriorCobrarDetalleCobros.setEnabled(false);
		jTextFieldabonos_anteriorCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldabonos_anteriorCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldabonos_anteriorCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldabonos_anteriorCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldabonos_anteriorCobrarDetalleCobros.setText("0.0");

		this.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldabonos_anteriorCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldabonos_anteriorCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"abonos_anteriorCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonabonos_anteriorCobrarDetalleCobrosBusqueda.setVisible(false);		}


					
		this.jLabelabonos_actualCobrarDetalleCobros = new JLabelMe();
		this.jLabelabonos_actualCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL+" : *");
		this.jLabelabonos_actualCobrarDetalleCobros.setToolTipText("Abonos Actual");
		this.jLabelabonos_actualCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelabonos_actualCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelabonos_actualCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelabonos_actualCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelabonos_actualCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelabonos_actualCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_ABONOSACTUAL);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelabonos_actualCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jTextFieldabonos_actualCobrarDetalleCobros= new JTextFieldMe();
		jTextFieldabonos_actualCobrarDetalleCobros.setEnabled(false);
		jTextFieldabonos_actualCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldabonos_actualCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldabonos_actualCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldabonos_actualCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldabonos_actualCobrarDetalleCobros.setText("0.0");

		this.jButtonabonos_actualCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonabonos_actualCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonabonos_actualCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonabonos_actualCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonabonos_actualCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonabonos_actualCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonabonos_actualCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonabonos_actualCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldabonos_actualCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldabonos_actualCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"abonos_actualCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonabonos_actualCobrarDetalleCobrosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarDetalleCobros() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarDetalleCobros = new JLabelMe();
		this.jLabelid_empresaCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarDetalleCobros.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelid_empresaCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jComboBoxid_empresaCobrarDetalleCobros= new JComboBoxMe();
		jComboBoxid_empresaCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarDetalleCobros.setEnabled(false);

		this.jButtonid_empresaCobrarDetalleCobros= new JButtonMe();
		this.jButtonid_empresaCobrarDetalleCobros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarDetalleCobros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarDetalleCobros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarDetalleCobros.setText("Buscar");
		this.jButtonid_empresaCobrarDetalleCobros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarDetalleCobros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarDetalleCobros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarDetalleCobros"));

		this.jButtonid_empresaCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonid_empresaCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarDetalleCobrosBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarDetalleCobrosUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarDetalleCobrosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarDetalleCobrosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarDetalleCobrosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarDetalleCobrosUpdate.setText("U");
		this.jButtonid_empresaCobrarDetalleCobrosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarDetalleCobrosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarDetalleCobrosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarDetalleCobrosUpdate"));



					
		this.jLabelid_paisCobrarDetalleCobros = new JLabelMe();
		this.jLabelid_paisCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisCobrarDetalleCobros.setToolTipText("Pais");
		this.jLabelid_paisCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelid_paisCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jComboBoxid_paisCobrarDetalleCobros= new JComboBoxMe();
		jComboBoxid_paisCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisCobrarDetalleCobros= new JButtonMe();
		this.jButtonid_paisCobrarDetalleCobros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCobrarDetalleCobros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCobrarDetalleCobros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCobrarDetalleCobros.setText("Buscar");
		this.jButtonid_paisCobrarDetalleCobros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisCobrarDetalleCobros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCobrarDetalleCobros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCobrarDetalleCobros"));

		this.jButtonid_paisCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonid_paisCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonid_paisCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisCobrarDetalleCobrosBusqueda.setVisible(false);		}

		this.jButtonid_paisCobrarDetalleCobrosUpdate= new JButtonMe();
		this.jButtonid_paisCobrarDetalleCobrosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarDetalleCobrosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCobrarDetalleCobrosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisCobrarDetalleCobrosUpdate.setText("U");
		this.jButtonid_paisCobrarDetalleCobrosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisCobrarDetalleCobrosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCobrarDetalleCobrosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCobrarDetalleCobrosUpdate"));



					
		this.jLabelid_ciudadCobrarDetalleCobros = new JLabelMe();
		this.jLabelid_ciudadCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadCobrarDetalleCobros.setToolTipText("Ciudad");
		this.jLabelid_ciudadCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelid_ciudadCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jComboBoxid_ciudadCobrarDetalleCobros= new JComboBoxMe();
		jComboBoxid_ciudadCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadCobrarDetalleCobros= new JButtonMe();
		this.jButtonid_ciudadCobrarDetalleCobros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCobrarDetalleCobros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCobrarDetalleCobros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCobrarDetalleCobros.setText("Buscar");
		this.jButtonid_ciudadCobrarDetalleCobros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadCobrarDetalleCobros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCobrarDetalleCobros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCobrarDetalleCobros"));

		this.jButtonid_ciudadCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonid_ciudadCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonid_ciudadCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadCobrarDetalleCobrosBusqueda.setVisible(false);		}

		this.jButtonid_ciudadCobrarDetalleCobrosUpdate= new JButtonMe();
		this.jButtonid_ciudadCobrarDetalleCobrosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarDetalleCobrosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCobrarDetalleCobrosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadCobrarDetalleCobrosUpdate.setText("U");
		this.jButtonid_ciudadCobrarDetalleCobrosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadCobrarDetalleCobrosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCobrarDetalleCobrosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCobrarDetalleCobrosUpdate"));



					
		this.jLabelid_zonaCobrarDetalleCobros = new JLabelMe();
		this.jLabelid_zonaCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaCobrarDetalleCobros.setToolTipText("Zona");
		this.jLabelid_zonaCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelid_zonaCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jComboBoxid_zonaCobrarDetalleCobros= new JComboBoxMe();
		jComboBoxid_zonaCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaCobrarDetalleCobros= new JButtonMe();
		this.jButtonid_zonaCobrarDetalleCobros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaCobrarDetalleCobros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaCobrarDetalleCobros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaCobrarDetalleCobros.setText("Buscar");
		this.jButtonid_zonaCobrarDetalleCobros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaCobrarDetalleCobros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaCobrarDetalleCobros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaCobrarDetalleCobros"));

		this.jButtonid_zonaCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonid_zonaCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonid_zonaCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaCobrarDetalleCobrosBusqueda.setVisible(false);		}

		this.jButtonid_zonaCobrarDetalleCobrosUpdate= new JButtonMe();
		this.jButtonid_zonaCobrarDetalleCobrosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaCobrarDetalleCobrosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaCobrarDetalleCobrosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaCobrarDetalleCobrosUpdate.setText("U");
		this.jButtonid_zonaCobrarDetalleCobrosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaCobrarDetalleCobrosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaCobrarDetalleCobrosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaCobrarDetalleCobrosUpdate"));



					
		this.jLabelid_grupo_clienteCobrarDetalleCobros = new JLabelMe();
		this.jLabelid_grupo_clienteCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clienteCobrarDetalleCobros.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clienteCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clienteCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clienteCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelid_grupo_clienteCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jComboBoxid_grupo_clienteCobrarDetalleCobros= new JComboBoxMe();
		jComboBoxid_grupo_clienteCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clienteCobrarDetalleCobros= new JButtonMe();
		this.jButtonid_grupo_clienteCobrarDetalleCobros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteCobrarDetalleCobros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteCobrarDetalleCobros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteCobrarDetalleCobros.setText("Buscar");
		this.jButtonid_grupo_clienteCobrarDetalleCobros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clienteCobrarDetalleCobros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteCobrarDetalleCobros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clienteCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteCobrarDetalleCobros"));

		this.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clienteCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clienteCobrarDetalleCobrosUpdate= new JButtonMe();
		this.jButtonid_grupo_clienteCobrarDetalleCobrosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteCobrarDetalleCobrosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteCobrarDetalleCobrosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteCobrarDetalleCobrosUpdate.setText("U");
		this.jButtonid_grupo_clienteCobrarDetalleCobrosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clienteCobrarDetalleCobrosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteCobrarDetalleCobrosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clienteCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteCobrarDetalleCobrosUpdate"));



					
		this.jLabelid_vendedorCobrarDetalleCobros = new JLabelMe();
		this.jLabelid_vendedorCobrarDetalleCobros.setText(""+CobrarDetalleCobrosConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorCobrarDetalleCobros.setToolTipText("Vendedor");
		this.jLabelid_vendedorCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorCobrarDetalleCobros.setToolTipText(CobrarDetalleCobrosConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		this.jPanelid_vendedorCobrarDetalleCobros.setLayout(this.gridaBagLayoutCobrarDetalleCobros);


		jComboBoxid_vendedorCobrarDetalleCobros= new JComboBoxMe();
		jComboBoxid_vendedorCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorCobrarDetalleCobros= new JButtonMe();
		this.jButtonid_vendedorCobrarDetalleCobros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCobrarDetalleCobros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCobrarDetalleCobros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCobrarDetalleCobros.setText("Buscar");
		this.jButtonid_vendedorCobrarDetalleCobros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorCobrarDetalleCobros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorCobrarDetalleCobros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorCobrarDetalleCobros"));

		this.jButtonid_vendedorCobrarDetalleCobrosBusqueda= new JButtonMe();
		this.jButtonid_vendedorCobrarDetalleCobrosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCobrarDetalleCobrosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCobrarDetalleCobrosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorCobrarDetalleCobrosBusqueda.setText("U");
		this.jButtonid_vendedorCobrarDetalleCobrosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorCobrarDetalleCobrosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorCobrarDetalleCobrosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorCobrarDetalleCobrosBusqueda"));

		if(this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorCobrarDetalleCobrosBusqueda.setVisible(false);		}

		this.jButtonid_vendedorCobrarDetalleCobrosUpdate= new JButtonMe();
		this.jButtonid_vendedorCobrarDetalleCobrosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCobrarDetalleCobrosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCobrarDetalleCobrosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorCobrarDetalleCobrosUpdate.setText("U");
		this.jButtonid_vendedorCobrarDetalleCobrosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorCobrarDetalleCobrosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorCobrarDetalleCobrosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorCobrarDetalleCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCobrarDetalleCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorCobrarDetalleCobrosUpdate"));



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
		//this.jInternalFrameDetalleCobrarDetalleCobros = new CobrarDetalleCobrosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Detalle Cobros DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarDetalleCobros= new GridBagLayout();
		

		
		String sToolTipCobrarDetalleCobros="";
		sToolTipCobrarDetalleCobros=CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarDetalleCobros+="(Cartera.CobrarDetalleCobros)";
		}
		
		if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarDetalleCobros+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarDetalleCobros = new JButtonMe();
		this.jButtonModificarCobrarDetalleCobros = new JButtonMe();
        this.jButtonActualizarCobrarDetalleCobros = new JButtonMe();
        this.jButtonEliminarCobrarDetalleCobros = new JButtonMe();
        this.jButtonCancelarCobrarDetalleCobros = new JButtonMe();
        this.jButtonGuardarCambiosCobrarDetalleCobros = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarDetalleCobros = new JButtonMe();
		this.jButtonCerrarCobrarDetalleCobros = new JButtonMe();
		
		this.jScrollPanelDatosCobrarDetalleCobros = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarDetalleCobros = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarDetalleCobros = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Detalle Cobros";
		
		if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Detalle Cobroses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarDetalleCobros.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarDetalleCobros.setName("jPanelCamposCobrarDetalleCobros"); 

		this.jPanelCamposOcultosCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarDetalleCobros.setName("jPanelCamposOcultosCobrarDetalleCobros"); 

        this.jPanelAccionesCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarDetalleCobros.setToolTipText("Acciones");
        this.jPanelAccionesCobrarDetalleCobros.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarDetalleCobros.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarDetalleCobros.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarDetalleCobros.setText("Nuevo");
		this.jButtonModificarCobrarDetalleCobros.setText("Editar");
        this.jButtonActualizarCobrarDetalleCobros.setText("Actualizar");
        this.jButtonEliminarCobrarDetalleCobros.setText("Eliminar");
        this.jButtonCancelarCobrarDetalleCobros.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarDetalleCobros.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarDetalleCobros.setText("Guardar");
		this.jButtonCerrarCobrarDetalleCobros.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarDetalleCobros,"nuevo_button","Nuevo",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarDetalleCobros,"modificar_button","Editar",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarDetalleCobros,"actualizar_button","Actualizar",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarDetalleCobros,"eliminar_button","Eliminar",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarDetalleCobros,"cancelar_button","Cancelar",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarDetalleCobros,"guardarcambios_button","Guardar",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarDetalleCobros,"guardarcambiostabla_button","Guardar",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarDetalleCobros,"cerrar_button","Salir",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarDetalleCobros.setToolTipText("Nuevo"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarDetalleCobros.setToolTipText("Editar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarDetalleCobros.setToolTipText("Actualizar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarDetalleCobros.setToolTipText("Eliminar)"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarDetalleCobros.setToolTipText("Cancelar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarDetalleCobros.setToolTipText("Guardar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarDetalleCobros.setToolTipText("Guardar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarDetalleCobros.setToolTipText("Salir"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarDetalleCobros";
		inputMap = this.jButtonNuevoCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarDetalleCobros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarDetalleCobros"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarDetalleCobros";
		inputMap = this.jButtonActualizarCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarDetalleCobros"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarDetalleCobros";
		inputMap = this.jButtonEliminarCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarDetalleCobros"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarDetalleCobros";
		inputMap = this.jButtonCancelarCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarDetalleCobros"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarDetalleCobros";
		inputMap = this.jButtonCerrarCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarDetalleCobros"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarDetalleCobros";
		inputMap = this.jButtonGuardarCambiosTablaCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarDetalleCobros"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarDetalleCobros = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarDetalleCobros.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarDetalleCobros.setToolTipText("Nuevo CobrarDetalleCobros");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarDetalleCobros = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarDetalleCobros.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarDetalleCobros.setToolTipText("Sin Cerrar Ventana CobrarDetalleCobros");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarDetalleCobros = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarDetalleCobros.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarDetalleCobros.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarDetalleCobros.setText("Accion");
		this.jComboBoxTiposAccionesCobrarDetalleCobros.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarDetalleCobros = new JLabelMe();
		
		this.jLabelAccionesCobrarDetalleCobros.setText("Acciones");		
		this.jLabelAccionesCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarDetalleCobros();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarDetalleCobros();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarDetalleCobros=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarDetalleCobros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarDetalleCobros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarDetalleCobros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarDetalleCobros.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarDetalleCobros = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarDetalleCobros = new GridBagLayout();
		
		this.jPanelCamposCobrarDetalleCobros.setLayout(gridaBagLayoutCamposCobrarDetalleCobros);
		this.jPanelCamposOcultosCobrarDetalleCobros.setLayout(gridaBagLayoutCamposOcultosCobrarDetalleCobros);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarDetalleCobros.add(jLabelIdCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarDetalleCobros.add(jLabelidCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarDetalleCobros.add(jLabelid_empresaCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarDetalleCobros.add(jButtonid_empresaCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 3;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarDetalleCobros.add(jButtonid_empresaCobrarDetalleCobrosUpdate, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarDetalleCobros.add(jComboBoxid_empresaCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisCobrarDetalleCobros.add(jLabelid_paisCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCobrarDetalleCobros.add(jButtonid_paisCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 3;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCobrarDetalleCobros.add(jButtonid_paisCobrarDetalleCobrosUpdate, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisCobrarDetalleCobros.add(jComboBoxid_paisCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadCobrarDetalleCobros.add(jLabelid_ciudadCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadCobrarDetalleCobros.add(jButtonid_ciudadCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 3;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadCobrarDetalleCobros.add(jButtonid_ciudadCobrarDetalleCobrosUpdate, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadCobrarDetalleCobros.add(jComboBoxid_ciudadCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaCobrarDetalleCobros.add(jLabelid_zonaCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaCobrarDetalleCobros.add(jButtonid_zonaCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 3;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaCobrarDetalleCobros.add(jButtonid_zonaCobrarDetalleCobrosUpdate, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaCobrarDetalleCobros.add(jComboBoxid_zonaCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clienteCobrarDetalleCobros.add(jLabelid_grupo_clienteCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteCobrarDetalleCobros.add(jButtonid_grupo_clienteCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 3;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteCobrarDetalleCobros.add(jButtonid_grupo_clienteCobrarDetalleCobrosUpdate, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clienteCobrarDetalleCobros.add(jComboBoxid_grupo_clienteCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorCobrarDetalleCobros.add(jLabelid_vendedorCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorCobrarDetalleCobros.add(jButtonid_vendedorCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 3;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorCobrarDetalleCobros.add(jButtonid_vendedorCobrarDetalleCobrosUpdate, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorCobrarDetalleCobros.add(jComboBoxid_vendedorCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionCobrarDetalleCobros.add(jLabelfecha_emisionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionCobrarDetalleCobros.add(jButtonfecha_emisionCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionCobrarDetalleCobros.add(jDateChooserfecha_emisionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaCobrarDetalleCobros.add(jLabelfecha_emision_hastaCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaCobrarDetalleCobros.add(jButtonfecha_emision_hastaCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaCobrarDetalleCobros.add(jDateChooserfecha_emision_hastaCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_vendedorCobrarDetalleCobros.add(jLabelnombre_vendedorCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_vendedorCobrarDetalleCobros.add(jButtonnombre_vendedorCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_vendedorCobrarDetalleCobros.add(jscrollPanenombre_vendedorCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarDetalleCobros.add(jLabelcodigoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarDetalleCobros.add(jButtoncodigoCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarDetalleCobros.add(jTextFieldcodigoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCobrarDetalleCobros.add(jLabelnombreCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCobrarDetalleCobros.add(jButtonnombreCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCobrarDetalleCobros.add(jscrollPanenombreCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoCobrarDetalleCobros.add(jLabelapellidoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoCobrarDetalleCobros.add(jButtonapellidoCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoCobrarDetalleCobros.add(jscrollPaneapellidoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_facturasCobrarDetalleCobros.add(jLabeltotal_facturasCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_facturasCobrarDetalleCobros.add(jButtontotal_facturasCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_facturasCobrarDetalleCobros.add(jTextFieldtotal_facturasCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_abonosCobrarDetalleCobros.add(jLabeltotal_abonosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_abonosCobrarDetalleCobros.add(jButtontotal_abonosCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_abonosCobrarDetalleCobros.add(jTextFieldtotal_abonosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_facturas_actualCobrarDetalleCobros.add(jLabeltotal_facturas_actualCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_facturas_actualCobrarDetalleCobros.add(jButtontotal_facturas_actualCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_facturas_actualCobrarDetalleCobros.add(jTextFieldtotal_facturas_actualCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelabonos_anteriorCobrarDetalleCobros.add(jLabelabonos_anteriorCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelabonos_anteriorCobrarDetalleCobros.add(jButtonabonos_anteriorCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelabonos_anteriorCobrarDetalleCobros.add(jTextFieldabonos_anteriorCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelabonos_actualCobrarDetalleCobros.add(jLabelabonos_actualCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 2;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
		this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(0, 0, 0, 0);
		this.jPanelabonos_actualCobrarDetalleCobros.add(jButtonabonos_actualCobrarDetalleCobrosBusqueda, this.gridBagConstraintsCobrarDetalleCobros);
	}

	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = 1;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelabonos_actualCobrarDetalleCobros.add(jTextFieldabonos_actualCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelidCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelid_paisCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelid_ciudadCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelid_zonaCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelid_grupo_clienteCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelid_vendedorCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelfecha_emisionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelfecha_emision_hastaCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelnombre_vendedorCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelcodigoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelnombreCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelapellidoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPaneltotal_facturasCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPaneltotal_abonosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPaneltotal_facturas_actualCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelabonos_anteriorCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarDetalleCobros.add(this.jPanelabonos_actualCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposCobrarDetalleCobros % 2==0) {
		iXPanelCamposCobrarDetalleCobros=0;
		iYPanelCamposCobrarDetalleCobros++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarDetalleCobros.gridy = iYPanelCamposOcultosCobrarDetalleCobros;
	this.gridBagConstraintsCobrarDetalleCobros.gridx = iXPanelCamposOcultosCobrarDetalleCobros++;
	this.gridBagConstraintsCobrarDetalleCobros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarDetalleCobros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarDetalleCobros.add(this.jPanelid_empresaCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);



	if(iXPanelCamposOcultosCobrarDetalleCobros % 2==0) {
		iXPanelCamposOcultosCobrarDetalleCobros=0;
		iYPanelCamposOcultosCobrarDetalleCobros++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarDetalleCobros= new GridBagLayout();
		this.jPanelAccionesCobrarDetalleCobros.setLayout(gridaBagLayoutAccionesCobrarDetalleCobros);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarDetalleCobros= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarDetalleCobros.setLayout(gridaBagLayoutAccionesFormularioCobrarDetalleCobros);
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarDetalleCobros.add(this.jComboBoxTiposAccionesFormularioCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarDetalleCobros.add(this.jButtonModificarCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);							

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarDetalleCobros.add(this.jButtonEliminarCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
			
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarDetalleCobros.add(this.jButtonActualizarCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarDetalleCobros.add(this.jButtonGuardarCambiosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);	
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarDetalleCobros.add(this.jButtonCancelarCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarDetalleCobros);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();						
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;		
			//this.gridBagConstraintsCobrarDetalleCobros.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarDetalleCobros.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarDetalleCobros.gridx =0;
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarDetalleCobros.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarDetalleCobrosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarDetalleCobros = new CobrarDetalleCobrosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Detalle Cobros DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Detalle Cobros DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Detalle Cobros Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarDetalleCobrosModel cobrardetallecobrosModel=new CobrarDetalleCobrosModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarDetalleCobrosModel.CobrarDetalleCobrosFocusTraversalPolicy cobrardetallecobrosFocusTraversalPolicy = cobrardetallecobrosModel.new CobrarDetalleCobrosFocusTraversalPolicy(this);
			
			//cobrardetallecobrosFocusTraversalPolicy.setcobrardetallecobrosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrardetallecobrosModel);
			
			
			this.jContentPaneDetalleCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarDetalleCobros = new GridBagLayout();	
			this.jContentPaneDetalleCobrarDetalleCobros.setLayout(gridaBagLayoutDetalleCobrarDetalleCobros);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarDetalleCobros = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
				this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarDetalleCobros.add(jTtoolBarDetalleCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarDetalleCobros=   new JScrollPane(jContentPaneDetalleCobrarDetalleCobros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarDetalleCobros=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	        
			this.jContentPaneDetalleCobrarDetalleCobros.add(jPanelCamposCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);
			
			
			
			
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
						//&& cobrardetallecobrosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrardetallecobrosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarDetalleCobros= new GridBagConstraints();
						this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
						this.jContentPaneDetalleCobrarDetalleCobros.add(this.jTabbedPaneRelacionesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarDetalleCobros.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarDetalleCobros.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
					this.gridBagConstraintsCobrarDetalleCobros.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarDetalleCobros.add(jPanelCamposOcultosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);
				
					this.jPanelCamposOcultosCobrarDetalleCobros.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	        this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarDetalleCobros.add(this.jPanelAccionesFormularioCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);							
			
			
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
	        this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarDetalleCobros.add(this.jPanelAccionesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarDetalleCobros);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarDetalleCobros=   new JScrollPane(this.jPanelCamposCobrarDetalleCobros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarDetalleCobros.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);			
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			
			
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
			
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarDetalleCobros;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarDetalleCobros;
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
