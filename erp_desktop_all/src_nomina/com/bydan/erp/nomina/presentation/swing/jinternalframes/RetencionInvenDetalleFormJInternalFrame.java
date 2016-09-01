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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.RetencionInvenConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class RetencionInvenDetalleFormJInternalFrame extends RetencionInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRetencionInven;
	
	protected JMenuBar jmenuBarDetalleRetencionInven;
	
	protected JMenu jmenuDetalleRetencionInven;
	protected JMenu jmenuDetalleArchivoRetencionInven;
	protected JMenu jmenuDetalleAccionesRetencionInven;
	protected JMenu jmenuDetalleDatosRetencionInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRetencionInven;	
	protected GridBagConstraints gridBagConstraintsRetencionInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RetencionInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleRetencionInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_compra="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public RetencionInvenSessionBean retencioninvenSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public CompraSessionBean compraSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public RetencionInvenLogic retencioninvenLogic;
	
	public JScrollPane jScrollPanelDatosRetencionInven;
	public JScrollPane jScrollPanelDatosEdicionRetencionInven;
	public JScrollPane jScrollPanelDatosGeneralRetencionInven;
	
	protected JPanel jPanelCamposRetencionInven;    
	protected JPanel jPanelCamposOcultosRetencionInven;    	
	protected JPanel jPanelAccionesRetencionInven;
	protected JPanel jPanelAccionesFormularioRetencionInven;
    
	
	
	protected Integer iXPanelCamposRetencionInven=0;
	protected Integer iYPanelCamposRetencionInven=0;
	
	protected Integer iXPanelCamposOcultosRetencionInven=0;
	protected Integer iYPanelCamposOcultosRetencionInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRetencionInven;
	public JButton jButtonModificarRetencionInven;
	public JButton jButtonActualizarRetencionInven;
    public JButton jButtonEliminarRetencionInven;
	public JButton jButtonCancelarRetencionInven;
    public JButton jButtonGuardarCambiosRetencionInven;
	public JButton jButtonGuardarCambiosTablaRetencionInven;
	protected JButton jButtonCerrarRetencionInven;
	
	
	protected JButton jButtonProcesarInformacionRetencionInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRetencionInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRetencionInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRetencionInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRetencionInven;
	protected JButton jButtonModificarToolBarRetencionInven;
	protected JButton jButtonActualizarToolBarRetencionInven;
    protected JButton jButtonEliminarToolBarRetencionInven;
	protected JButton jButtonCancelarToolBarRetencionInven;
    protected JButton jButtonGuardarCambiosToolBarRetencionInven;
	protected JButton jButtonGuardarCambiosTablaToolBarRetencionInven;
	protected JButton jButtonMostrarOcultarTablaToolBarRetencionInven;
	protected JButton jButtonCerrarToolBarRetencionInven;
	
	protected JButton jButtonProcesarInformacionToolBarRetencionInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRetencionInven;
	protected JMenuItem jMenuItemModificarRetencionInven;
	protected JMenuItem jMenuItemActualizarRetencionInven;
    protected JMenuItem jMenuItemEliminarRetencionInven;
	protected JMenuItem jMenuItemCancelarRetencionInven;
    protected JMenuItem jMenuItemGuardarCambiosRetencionInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaRetencionInven;
	protected JMenuItem jMenuItemCerrarRetencionInven;
	protected JMenuItem jMenuItemDetalleCerrarRetencionInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarRetencionInven;
	
	protected JMenuItem jMenuItemProcesarInformacionRetencionInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRetencionInven;
	protected JMenuItem jMenuItemMostrarOcultarRetencionInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRetencionInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRetencionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRetencionInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRetencionInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRetencionInven;
	public JLabel jLabelIdRetencionInven;
	public JLabel jLabelidRetencionInven;
	public JButton jButtonidRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeRetencionInven;
	public JLabel jLabelporcentajeRetencionInven;
	public JTextField jTextFieldporcentajeRetencionInven;
	public JButton jButtonporcentajeRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelbase_imponibleRetencionInven;
	public JLabel jLabelbase_imponibleRetencionInven;
	public JTextField jTextFieldbase_imponibleRetencionInven;
	public JButton jButtonbase_imponibleRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelretencionRetencionInven;
	public JLabel jLabelretencionRetencionInven;
	public JTextField jTextFieldretencionRetencionInven;
	public JButton jButtonretencionRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencionRetencionInven;
	public JLabel jLabelnumero_retencionRetencionInven;
	public JTextField jTextFieldnumero_retencionRetencionInven;
	public JButton jButtonnumero_retencionRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serie_retencionRetencionInven;
	public JLabel jLabelnumero_serie_retencionRetencionInven;
	public JTextField jTextFieldnumero_serie_retencionRetencionInven;
	public JButton jButtonnumero_serie_retencionRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelcodigoRetencionInven;
	public JLabel jLabelcodigoRetencionInven;
	public JTextField jTextFieldcodigoRetencionInven;
	public JButton jButtoncodigoRetencionInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRetencionInven;
	public JLabel jLabelid_empresaRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRetencionInven;
	public JButton jButtonid_empresaRetencionInven= new JButtonMe();
	public JButton jButtonid_empresaRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalRetencionInven;
	public JLabel jLabelid_sucursalRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalRetencionInven;
	public JButton jButtonid_sucursalRetencionInven= new JButtonMe();
	public JButton jButtonid_sucursalRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_sucursalRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioRetencionInven;
	public JLabel jLabelid_ejercicioRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioRetencionInven;
	public JButton jButtonid_ejercicioRetencionInven= new JButtonMe();
	public JButton jButtonid_ejercicioRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoRetencionInven;
	public JLabel jLabelid_periodoRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoRetencionInven;
	public JButton jButtonid_periodoRetencionInven= new JButtonMe();
	public JButton jButtonid_periodoRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_periodoRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_compraRetencionInven;
	public JLabel jLabelid_compraRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_compraRetencionInven;
	public JButton jButtonid_compraRetencionInven= new JButtonMe();
	public JButton jButtonid_compraRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_compraRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencionRetencionInven;
	public JLabel jLabelid_tipo_retencionRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionRetencionInven;
	public JButton jButtonid_tipo_retencionRetencionInven= new JButtonMe();
	public JButton jButtonid_tipo_retencionRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableRetencionInven;
	public JLabel jLabelid_cuenta_contableRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableRetencionInven;
	public JButton jButtonid_cuenta_contableRetencionInven= new JButtonMe();
	public JButton jButtonid_cuenta_contableRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableRetencionInvenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableRetencionInvenArbol= new JButtonMe();

	public JPanel jPanelid_anioRetencionInven;
	public JLabel jLabelid_anioRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioRetencionInven;
	public JButton jButtonid_anioRetencionInven= new JButtonMe();
	public JButton jButtonid_anioRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_anioRetencionInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_mesRetencionInven;
	public JLabel jLabelid_mesRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesRetencionInven;
	public JButton jButtonid_mesRetencionInven= new JButtonMe();
	public JButton jButtonid_mesRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_mesRetencionInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRetencionInven;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RetencionInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRetencionInven=new JPanel();
				this.jPanelAccionesFormularioRetencionInven=new JPanel();
				this.jmenuBarDetalleRetencionInven=new JMenuBar();
				this.jTtoolBarDetalleRetencionInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RetencionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RetencionInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RetencionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RetencionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRetencionInven() {
		return this.jButtonActualizarToolBarRetencionInven;
	}
	
	public JButton getjButtonEliminarToolBarRetencionInven() {
		return this.jButtonEliminarToolBarRetencionInven;
	}
	
	public JButton getjButtonCancelarToolBarRetencionInven() {
		return this.jButtonCancelarToolBarRetencionInven;
	}		
	
	public JButton getjButtonProcesarInformacionRetencionInven() {
		return this.jButtonProcesarInformacionRetencionInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRetencionInven)	{
		this.jButtonProcesarInformacionRetencionInven = jButtonProcesarInformacionRetencionInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRetencionInven() {
		return this.jComboBoxTiposAccionesRetencionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRetencionInven(
			JComboBox jComboBoxTiposRelacionesRetencionInven) {
		this.jComboBoxTiposRelacionesRetencionInven = jComboBoxTiposRelacionesRetencionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRetencionInven(
			JComboBox jComboBoxTiposAccionesRetencionInven) {
		this.jComboBoxTiposAccionesRetencionInven = jComboBoxTiposAccionesRetencionInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRetencionInven() {
		return this.jComboBoxTiposAccionesFormularioRetencionInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRetencionInven(
			JComboBox jComboBoxTiposAccionesFormularioRetencionInven) {
		this.jComboBoxTiposAccionesFormularioRetencionInven = jComboBoxTiposAccionesFormularioRetencionInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.retencioninvenSessionBean=new RetencionInvenSessionBean();
		
		this.retencioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.retencioninvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RetencionInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RetencionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RetencionInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
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
	
		RetencionInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRetencionInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRetencionInven=new JButtonMe();
				this.jButtonModificarToolBarRetencionInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRetencionInven,this.jTtoolBarDetalleRetencionInven,
							"actualizar","actualizar","Actualizar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRetencionInven,this.jTtoolBarDetalleRetencionInven,
							"eliminar","eliminar","Eliminar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRetencionInven,this.jTtoolBarDetalleRetencionInven,
							"cancelar","cancelar","Cancelar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRetencionInven,this.jTtoolBarDetalleRetencionInven,
							"guardarcambios","guardarcambios","Guardar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRetencionInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRetencionInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRetencionInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRetencionInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRetencionInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRetencionInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRetencionInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRetencionInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRetencionInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRetencionInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRetencionInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRetencionInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRetencionInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRetencionInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRetencionInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRetencionInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRetencionInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRetencionInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRetencionInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRetencionInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRetencionInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRetencionInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRetencionInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRetencionInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRetencionInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRetencionInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRetencionInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRetencionInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRetencionInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRetencionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRetencionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRetencionInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRetencionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRetencionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRetencionInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRetencionInven.add(this.jMenuItemDetalleCerrarRetencionInven);
		
		this.jmenuDetalleAccionesRetencionInven.add(this.jMenuItemActualizarRetencionInven);
		this.jmenuDetalleAccionesRetencionInven.add(this.jMenuItemEliminarRetencionInven);
		this.jmenuDetalleAccionesRetencionInven.add(this.jMenuItemCancelarRetencionInven);		
		
		//this.jmenuDetalleDatosRetencionInven.add(this.jMenuItemDetalleAbrirOrderByRetencionInven);				
		this.jmenuDetalleDatosRetencionInven.add(this.jMenuItemDetalleMostarOcultarRetencionInven);				
				
		//this.jmenuDetalleAccionesRetencionInven.add(this.jMenuItemGuardarCambiosRetencionInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRetencionInven.add(this.jmenuDetalleArchivoRetencionInven);		
		this.jmenuBarDetalleRetencionInven.add(this.jmenuDetalleAccionesRetencionInven);		
		this.jmenuBarDetalleRetencionInven.add(this.jmenuDetalleDatosRetencionInven);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRetencionInven);				
	}
	
	
	public void inicializarElementosCamposRetencionInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRetencionInven = new JLabelMe();
		jLabelIdRetencionInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRetencionInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRetencionInven= new GridBagLayout();

		this.jPanelidRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);

		jLabelidRetencionInven = new JLabel();
		jLabelidRetencionInven.setText("Id");

		jLabelidRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeRetencionInven = new JLabelMe();
		this.jLabelporcentajeRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeRetencionInven.setToolTipText("Porcentaje");
		this.jLabelporcentajeRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelporcentajeRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jTextFieldporcentajeRetencionInven= new JTextFieldMe();
		jTextFieldporcentajeRetencionInven.setEnabled(false);
		jTextFieldporcentajeRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeRetencionInven.setText("0.0");

		this.jButtonporcentajeRetencionInvenBusqueda= new JButtonMe();
		this.jButtonporcentajeRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeRetencionInvenBusqueda.setText("U");
		this.jButtonporcentajeRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeRetencionInvenBusqueda.setVisible(false);		}


					
		this.jLabelbase_imponibleRetencionInven = new JLabelMe();
		this.jLabelbase_imponibleRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE+" : *");
		this.jLabelbase_imponibleRetencionInven.setToolTipText("Base Imponible");
		this.jLabelbase_imponibleRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_imponibleRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_imponibleRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_imponibleRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelbase_imponibleRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jTextFieldbase_imponibleRetencionInven= new JTextFieldMe();
		jTextFieldbase_imponibleRetencionInven.setEnabled(false);
		jTextFieldbase_imponibleRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_imponibleRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_imponibleRetencionInven.setText("0.0");

		this.jButtonbase_imponibleRetencionInvenBusqueda= new JButtonMe();
		this.jButtonbase_imponibleRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_imponibleRetencionInvenBusqueda.setText("U");
		this.jButtonbase_imponibleRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_imponibleRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_imponibleRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_imponibleRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_imponibleRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_imponibleRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_imponibleRetencionInvenBusqueda.setVisible(false);		}


					
		this.jLabelretencionRetencionInven = new JLabelMe();
		this.jLabelretencionRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_RETENCION+" : *");
		this.jLabelretencionRetencionInven.setToolTipText("Retencion");
		this.jLabelretencionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencionRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencionRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencionRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_RETENCION);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelretencionRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jTextFieldretencionRetencionInven= new JTextFieldMe();
		jTextFieldretencionRetencionInven.setEnabled(false);
		jTextFieldretencionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencionRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencionRetencionInven.setText("0.0");

		this.jButtonretencionRetencionInvenBusqueda= new JButtonMe();
		this.jButtonretencionRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencionRetencionInvenBusqueda.setText("U");
		this.jButtonretencionRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencionRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencionRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencionRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencionRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencionRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencionRetencionInvenBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencionRetencionInven = new JLabelMe();
		this.jLabelnumero_retencionRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION+" : *");
		this.jLabelnumero_retencionRetencionInven.setToolTipText("Numero Retencion");
		this.jLabelnumero_retencionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencionRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencionRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelnumero_retencionRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jTextFieldnumero_retencionRetencionInven= new JTextFieldMe();

		jTextFieldnumero_retencionRetencionInven.setEnabled(false);
		jTextFieldnumero_retencionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_retencionRetencionInvenBusqueda= new JButtonMe();
		this.jButtonnumero_retencionRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencionRetencionInvenBusqueda.setText("U");
		this.jButtonnumero_retencionRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencionRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencionRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencionRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencionRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencionRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencionRetencionInvenBusqueda.setVisible(false);		}


					
		this.jLabelnumero_serie_retencionRetencionInven = new JLabelMe();
		this.jLabelnumero_serie_retencionRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION+" :");
		this.jLabelnumero_serie_retencionRetencionInven.setToolTipText("Numero Serie Retencion");
		this.jLabelnumero_serie_retencionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_serie_retencionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_serie_retencionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serie_retencionRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serie_retencionRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serie_retencionRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelnumero_serie_retencionRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jTextFieldnumero_serie_retencionRetencionInven= new JTextFieldMe();
		jTextFieldnumero_serie_retencionRetencionInven.setEnabled(false);
		jTextFieldnumero_serie_retencionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serie_retencionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serie_retencionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serie_retencionRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_serie_retencionRetencionInven.setText("0.0");

		this.jButtonnumero_serie_retencionRetencionInvenBusqueda= new JButtonMe();
		this.jButtonnumero_serie_retencionRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serie_retencionRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serie_retencionRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serie_retencionRetencionInvenBusqueda.setText("U");
		this.jButtonnumero_serie_retencionRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serie_retencionRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serie_retencionRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serie_retencionRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serie_retencionRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serie_retencionRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serie_retencionRetencionInvenBusqueda.setVisible(false);		}


					
		this.jLabelcodigoRetencionInven = new JLabelMe();
		this.jLabelcodigoRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_CODIGO+" :");
		this.jLabelcodigoRetencionInven.setToolTipText("Codigo");
		this.jLabelcodigoRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelcodigoRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jTextFieldcodigoRetencionInven= new JTextFieldMe();

		jTextFieldcodigoRetencionInven.setEnabled(false);
		jTextFieldcodigoRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoRetencionInvenBusqueda= new JButtonMe();
		this.jButtoncodigoRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoRetencionInvenBusqueda.setText("U");
		this.jButtoncodigoRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoRetencionInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRetencionInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRetencionInven = new JLabelMe();
		this.jLabelid_empresaRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRetencionInven.setToolTipText("Empresa");
		this.jLabelid_empresaRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelid_empresaRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jComboBoxid_empresaRetencionInven= new JComboBoxMe();
		jComboBoxid_empresaRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRetencionInven.setEnabled(false);

		this.jButtonid_empresaRetencionInven= new JButtonMe();
		this.jButtonid_empresaRetencionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionInven.setText("Buscar");
		this.jButtonid_empresaRetencionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRetencionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionInven"));

		this.jButtonid_empresaRetencionInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRetencionInvenBusqueda.setText("U");
		this.jButtonid_empresaRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRetencionInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaRetencionInvenUpdate= new JButtonMe();
		this.jButtonid_empresaRetencionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRetencionInvenUpdate.setText("U");
		this.jButtonid_empresaRetencionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRetencionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionInvenUpdate"));



					
		this.jLabelid_sucursalRetencionInven = new JLabelMe();
		this.jLabelid_sucursalRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalRetencionInven.setToolTipText("Sucursal");
		this.jLabelid_sucursalRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelid_sucursalRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jComboBoxid_sucursalRetencionInven= new JComboBoxMe();
		jComboBoxid_sucursalRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalRetencionInven.setEnabled(false);

		this.jButtonid_sucursalRetencionInven= new JButtonMe();
		this.jButtonid_sucursalRetencionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencionInven.setText("Buscar");
		this.jButtonid_sucursalRetencionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalRetencionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencionInven"));

		this.jButtonid_sucursalRetencionInvenBusqueda= new JButtonMe();
		this.jButtonid_sucursalRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRetencionInvenBusqueda.setText("U");
		this.jButtonid_sucursalRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalRetencionInvenBusqueda.setVisible(false);		}

		this.jButtonid_sucursalRetencionInvenUpdate= new JButtonMe();
		this.jButtonid_sucursalRetencionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRetencionInvenUpdate.setText("U");
		this.jButtonid_sucursalRetencionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalRetencionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencionInvenUpdate"));



					
		this.jLabelid_ejercicioRetencionInven = new JLabelMe();
		this.jLabelid_ejercicioRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioRetencionInven.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelid_ejercicioRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jComboBoxid_ejercicioRetencionInven= new JComboBoxMe();
		jComboBoxid_ejercicioRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioRetencionInven.setEnabled(false);

		this.jButtonid_ejercicioRetencionInven= new JButtonMe();
		this.jButtonid_ejercicioRetencionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencionInven.setText("Buscar");
		this.jButtonid_ejercicioRetencionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioRetencionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencionInven"));

		this.jButtonid_ejercicioRetencionInvenBusqueda= new JButtonMe();
		this.jButtonid_ejercicioRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRetencionInvenBusqueda.setText("U");
		this.jButtonid_ejercicioRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioRetencionInvenBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioRetencionInvenUpdate= new JButtonMe();
		this.jButtonid_ejercicioRetencionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRetencionInvenUpdate.setText("U");
		this.jButtonid_ejercicioRetencionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioRetencionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencionInvenUpdate"));



					
		this.jLabelid_periodoRetencionInven = new JLabelMe();
		this.jLabelid_periodoRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoRetencionInven.setToolTipText("Periodo");
		this.jLabelid_periodoRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelid_periodoRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jComboBoxid_periodoRetencionInven= new JComboBoxMe();
		jComboBoxid_periodoRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoRetencionInven.setEnabled(false);

		this.jButtonid_periodoRetencionInven= new JButtonMe();
		this.jButtonid_periodoRetencionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencionInven.setText("Buscar");
		this.jButtonid_periodoRetencionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoRetencionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencionInven"));

		this.jButtonid_periodoRetencionInvenBusqueda= new JButtonMe();
		this.jButtonid_periodoRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRetencionInvenBusqueda.setText("U");
		this.jButtonid_periodoRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoRetencionInvenBusqueda.setVisible(false);		}

		this.jButtonid_periodoRetencionInvenUpdate= new JButtonMe();
		this.jButtonid_periodoRetencionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRetencionInvenUpdate.setText("U");
		this.jButtonid_periodoRetencionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoRetencionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencionInvenUpdate"));



					
		this.jLabelid_compraRetencionInven = new JLabelMe();
		this.jLabelid_compraRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_IDCOMPRA+" : *");
		this.jLabelid_compraRetencionInven.setToolTipText("Compra");
		this.jLabelid_compraRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_compraRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_compraRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_compraRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_compraRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_compraRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_IDCOMPRA);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelid_compraRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jComboBoxid_compraRetencionInven= new JComboBoxMe();
		jComboBoxid_compraRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_compraRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_compraRetencionInven= new JButtonMe();
		this.jButtonid_compraRetencionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraRetencionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraRetencionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraRetencionInven.setText("Buscar");
		this.jButtonid_compraRetencionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_compraRetencionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraRetencionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_compraRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraRetencionInven"));

		this.jButtonid_compraRetencionInvenBusqueda= new JButtonMe();
		this.jButtonid_compraRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_compraRetencionInvenBusqueda.setText("U");
		this.jButtonid_compraRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_compraRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_compraRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_compraRetencionInvenBusqueda.setVisible(false);		}

		this.jButtonid_compraRetencionInvenUpdate= new JButtonMe();
		this.jButtonid_compraRetencionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraRetencionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraRetencionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_compraRetencionInvenUpdate.setText("U");
		this.jButtonid_compraRetencionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_compraRetencionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraRetencionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_compraRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraRetencionInvenUpdate"));



					
		this.jLabelid_tipo_retencionRetencionInven = new JLabelMe();
		this.jLabelid_tipo_retencionRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION+" : *");
		this.jLabelid_tipo_retencionRetencionInven.setToolTipText("Tipo Retencion");
		this.jLabelid_tipo_retencionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencionRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencionRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelid_tipo_retencionRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jComboBoxid_tipo_retencionRetencionInven= new JComboBoxMe();
		jComboBoxid_tipo_retencionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencionRetencionInven= new JButtonMe();
		this.jButtonid_tipo_retencionRetencionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencionInven.setText("Buscar");
		this.jButtonid_tipo_retencionRetencionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencionRetencionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencionRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencionInven"));

		this.jButtonid_tipo_retencionRetencionInvenBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencionRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionRetencionInvenBusqueda.setText("U");
		this.jButtonid_tipo_retencionRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencionRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencionRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencionRetencionInvenBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencionRetencionInvenUpdate= new JButtonMe();
		this.jButtonid_tipo_retencionRetencionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionRetencionInvenUpdate.setText("U");
		this.jButtonid_tipo_retencionRetencionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencionRetencionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencionRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencionInvenUpdate"));



					
		this.jLabelid_cuenta_contableRetencionInven = new JLabelMe();
		this.jLabelid_cuenta_contableRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE+" :");
		this.jLabelid_cuenta_contableRetencionInven.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelid_cuenta_contableRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jComboBoxid_cuenta_contableRetencionInven= new JComboBoxMe();
		jComboBoxid_cuenta_contableRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableRetencionInven= new JButtonMe();
		this.jButtonid_cuenta_contableRetencionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableRetencionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableRetencionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableRetencionInven.setText("Buscar");
		this.jButtonid_cuenta_contableRetencionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableRetencionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableRetencionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableRetencionInven"));

		this.jButtonid_cuenta_contableRetencionInvenBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableRetencionInvenBusqueda.setText("U");
		this.jButtonid_cuenta_contableRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableRetencionInvenBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableRetencionInvenUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableRetencionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableRetencionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableRetencionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableRetencionInvenUpdate.setText("U");
		this.jButtonid_cuenta_contableRetencionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableRetencionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableRetencionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableRetencionInvenUpdate"));


		jButtonid_cuenta_contableRetencionInvenArbol= new JButtonMe();
		jButtonid_cuenta_contableRetencionInvenArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableRetencionInvenArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableRetencionInvenArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableRetencionInvenArbol.setText("Arbol");
		jButtonid_cuenta_contableRetencionInvenArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableRetencionInvenArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableRetencionInvenArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableRetencionInvenArbol"));



					
		this.jLabelid_anioRetencionInven = new JLabelMe();
		this.jLabelid_anioRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioRetencionInven.setToolTipText("Anio");
		this.jLabelid_anioRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelid_anioRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jComboBoxid_anioRetencionInven= new JComboBoxMe();
		jComboBoxid_anioRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioRetencionInven.setEnabled(false);

		this.jButtonid_anioRetencionInven= new JButtonMe();
		this.jButtonid_anioRetencionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRetencionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRetencionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRetencionInven.setText("Buscar");
		this.jButtonid_anioRetencionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioRetencionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRetencionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRetencionInven"));

		this.jButtonid_anioRetencionInvenBusqueda= new JButtonMe();
		this.jButtonid_anioRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioRetencionInvenBusqueda.setText("U");
		this.jButtonid_anioRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioRetencionInvenBusqueda.setVisible(false);		}

		this.jButtonid_anioRetencionInvenUpdate= new JButtonMe();
		this.jButtonid_anioRetencionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRetencionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRetencionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioRetencionInvenUpdate.setText("U");
		this.jButtonid_anioRetencionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioRetencionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRetencionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRetencionInvenUpdate"));



					
		this.jLabelid_mesRetencionInven = new JLabelMe();
		this.jLabelid_mesRetencionInven.setText(""+RetencionInvenConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesRetencionInven.setToolTipText("Mes");
		this.jLabelid_mesRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesRetencionInven.setToolTipText(RetencionInvenConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutRetencionInven = new GridBagLayout();
		this.jPanelid_mesRetencionInven.setLayout(this.gridaBagLayoutRetencionInven);


		jComboBoxid_mesRetencionInven= new JComboBoxMe();
		jComboBoxid_mesRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesRetencionInven.setEnabled(false);

		this.jButtonid_mesRetencionInven= new JButtonMe();
		this.jButtonid_mesRetencionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRetencionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRetencionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRetencionInven.setText("Buscar");
		this.jButtonid_mesRetencionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesRetencionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRetencionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRetencionInven"));

		this.jButtonid_mesRetencionInvenBusqueda= new JButtonMe();
		this.jButtonid_mesRetencionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRetencionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRetencionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesRetencionInvenBusqueda.setText("U");
		this.jButtonid_mesRetencionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesRetencionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRetencionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRetencionInvenBusqueda"));

		if(this.retencioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesRetencionInvenBusqueda.setVisible(false);		}

		this.jButtonid_mesRetencionInvenUpdate= new JButtonMe();
		this.jButtonid_mesRetencionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRetencionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRetencionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesRetencionInvenUpdate.setText("U");
		this.jButtonid_mesRetencionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesRetencionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRetencionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRetencionInvenUpdate"));



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
		//this.jInternalFrameDetalleRetencionInven = new RetencionInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Retencion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRetencionInven= new GridBagLayout();
		

		
		String sToolTipRetencionInven="";
		sToolTipRetencionInven=RetencionInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRetencionInven+="(Nomina.RetencionInven)";
		}
		
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipRetencionInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRetencionInven = new JButtonMe();
		this.jButtonModificarRetencionInven = new JButtonMe();
        this.jButtonActualizarRetencionInven = new JButtonMe();
        this.jButtonEliminarRetencionInven = new JButtonMe();
        this.jButtonCancelarRetencionInven = new JButtonMe();
        this.jButtonGuardarCambiosRetencionInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaRetencionInven = new JButtonMe();
		this.jButtonCerrarRetencionInven = new JButtonMe();
		
		this.jScrollPanelDatosRetencionInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionRetencionInven = new JScrollPane();
		this.jScrollPanelDatosGeneralRetencionInven = new JScrollPane();
				
		
		
		this.jPanelCamposRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Retencion";
		
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosRetencionInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRetencionInven.setName("jPanelCamposRetencionInven"); 

		this.jPanelCamposOcultosRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRetencionInven.setName("jPanelCamposOcultosRetencionInven"); 

        this.jPanelAccionesRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRetencionInven.setToolTipText("Acciones");
        this.jPanelAccionesRetencionInven.setName("Acciones"); 

		this.jPanelAccionesFormularioRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRetencionInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRetencionInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRetencionInven.setText("Nuevo");
		this.jButtonModificarRetencionInven.setText("Editar");
        this.jButtonActualizarRetencionInven.setText("Actualizar");
        this.jButtonEliminarRetencionInven.setText("Eliminar");
        this.jButtonCancelarRetencionInven.setText("Cancelar");
        this.jButtonGuardarCambiosRetencionInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaRetencionInven.setText("Guardar");
		this.jButtonCerrarRetencionInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRetencionInven,"nuevo_button","Nuevo",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRetencionInven,"modificar_button","Editar",this.retencioninvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRetencionInven,"actualizar_button","Actualizar",this.retencioninvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRetencionInven,"eliminar_button","Eliminar",this.retencioninvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRetencionInven,"cancelar_button","Cancelar",this.retencioninvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRetencionInven,"guardarcambios_button","Guardar",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRetencionInven,"guardarcambiostabla_button","Guardar",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRetencionInven,"cerrar_button","Salir",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRetencionInven.setToolTipText("Nuevo"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRetencionInven.setToolTipText("Editar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRetencionInven.setToolTipText("Actualizar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRetencionInven.setToolTipText("Eliminar)"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRetencionInven.setToolTipText("Cancelar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRetencionInven.setToolTipText("Guardar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRetencionInven.setToolTipText("Guardar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRetencionInven.setToolTipText("Salir"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRetencionInven";
		inputMap = this.jButtonNuevoRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRetencionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRetencionInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRetencionInven";
		inputMap = this.jButtonActualizarRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRetencionInven"));
		
		//ELIMINAR
		sMapKey = "EliminarRetencionInven";
		inputMap = this.jButtonEliminarRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRetencionInven"));
		
		//CANCELAR	
		sMapKey = "CancelarRetencionInven";
		inputMap = this.jButtonCancelarRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRetencionInven"));
		
		//CERRAR		
		sMapKey = "CerrarRetencionInven";
		inputMap = this.jButtonCerrarRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRetencionInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRetencionInven";
		inputMap = this.jButtonGuardarCambiosTablaRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRetencionInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRetencionInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRetencionInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRetencionInven.setToolTipText("Nuevo RetencionInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRetencionInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRetencionInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRetencionInven.setToolTipText("Sin Cerrar Ventana RetencionInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRetencionInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRetencionInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRetencionInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRetencionInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRetencionInven.setText("Accion");
		this.jComboBoxTiposAccionesRetencionInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRetencionInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRetencionInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRetencionInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRetencionInven = new JLabelMe();
		
		this.jLabelAccionesRetencionInven.setText("Acciones");		
		this.jLabelAccionesRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRetencionInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRetencionInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRetencionInven=new JTabbedPane();
		this.jTabbedPaneRelacionesRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRetencionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRetencionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRetencionInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRetencionInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRetencionInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRetencionInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRetencionInven = new GridBagLayout();
		
		this.jPanelCamposRetencionInven.setLayout(gridaBagLayoutCamposRetencionInven);
		this.jPanelCamposOcultosRetencionInven.setLayout(gridaBagLayoutCamposOcultosRetencionInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRetencionInven.add(jLabelIdRetencionInven, this.gridBagConstraintsRetencionInven);



	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRetencionInven.add(jLabelidRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRetencionInven.add(jLabelid_empresaRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRetencionInven.add(jButtonid_empresaRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 3;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRetencionInven.add(jButtonid_empresaRetencionInvenUpdate, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRetencionInven.add(jComboBoxid_empresaRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalRetencionInven.add(jLabelid_sucursalRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRetencionInven.add(jButtonid_sucursalRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 3;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRetencionInven.add(jButtonid_sucursalRetencionInvenUpdate, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalRetencionInven.add(jComboBoxid_sucursalRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioRetencionInven.add(jLabelid_ejercicioRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRetencionInven.add(jButtonid_ejercicioRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 3;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRetencionInven.add(jButtonid_ejercicioRetencionInvenUpdate, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioRetencionInven.add(jComboBoxid_ejercicioRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoRetencionInven.add(jLabelid_periodoRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRetencionInven.add(jButtonid_periodoRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 3;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRetencionInven.add(jButtonid_periodoRetencionInvenUpdate, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoRetencionInven.add(jComboBoxid_periodoRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_compraRetencionInven.add(jLabelid_compraRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_compraRetencionInven.add(jButtonid_compraRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 3;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_compraRetencionInven.add(jButtonid_compraRetencionInvenUpdate, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_compraRetencionInven.add(jComboBoxid_compraRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencionRetencionInven.add(jLabelid_tipo_retencionRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionRetencionInven.add(jButtonid_tipo_retencionRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 3;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionRetencionInven.add(jButtonid_tipo_retencionRetencionInvenUpdate, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencionRetencionInven.add(jComboBoxid_tipo_retencionRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeRetencionInven.add(jLabelporcentajeRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeRetencionInven.add(jButtonporcentajeRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeRetencionInven.add(jTextFieldporcentajeRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_imponibleRetencionInven.add(jLabelbase_imponibleRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_imponibleRetencionInven.add(jButtonbase_imponibleRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_imponibleRetencionInven.add(jTextFieldbase_imponibleRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelretencionRetencionInven.add(jLabelretencionRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencionRetencionInven.add(jButtonretencionRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelretencionRetencionInven.add(jTextFieldretencionRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_retencionRetencionInven.add(jLabelnumero_retencionRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencionRetencionInven.add(jButtonnumero_retencionRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_retencionRetencionInven.add(jTextFieldnumero_retencionRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableRetencionInven.add(jLabelid_cuenta_contableRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 2;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableRetencionInven.add(jButtonid_cuenta_contableRetencionInven, this.gridBagConstraintsRetencionInven);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 3;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableRetencionInven.add(jButtonid_cuenta_contableRetencionInvenArbol, this.gridBagConstraintsRetencionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 4;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableRetencionInven.add(jButtonid_cuenta_contableRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 5;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableRetencionInven.add(jButtonid_cuenta_contableRetencionInvenUpdate, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableRetencionInven.add(jComboBoxid_cuenta_contableRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioRetencionInven.add(jLabelid_anioRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioRetencionInven.add(jButtonid_anioRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 3;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioRetencionInven.add(jButtonid_anioRetencionInvenUpdate, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioRetencionInven.add(jComboBoxid_anioRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesRetencionInven.add(jLabelid_mesRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesRetencionInven.add(jButtonid_mesRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 3;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesRetencionInven.add(jButtonid_mesRetencionInvenUpdate, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesRetencionInven.add(jComboBoxid_mesRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_serie_retencionRetencionInven.add(jLabelnumero_serie_retencionRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serie_retencionRetencionInven.add(jButtonnumero_serie_retencionRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_serie_retencionRetencionInven.add(jTextFieldnumero_serie_retencionRetencionInven, this.gridBagConstraintsRetencionInven);


	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 0;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoRetencionInven.add(jLabelcodigoRetencionInven, this.gridBagConstraintsRetencionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 2;
		this.gridBagConstraintsRetencionInven.ipadx = 0;
		this.gridBagConstraintsRetencionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoRetencionInven.add(jButtoncodigoRetencionInvenBusqueda, this.gridBagConstraintsRetencionInven);
	}

	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionInven.gridy = 0;
	this.gridBagConstraintsRetencionInven.gridx = 1;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoRetencionInven.add(jTextFieldcodigoRetencionInven, this.gridBagConstraintsRetencionInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionInven.add(this.jPanelidRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposRetencionInven % 1==0) {
		iXPanelCamposRetencionInven=0;
		iYPanelCamposRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionInven.add(this.jPanelid_compraRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposRetencionInven % 1==0) {
		iXPanelCamposRetencionInven=0;
		iYPanelCamposRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionInven.add(this.jPanelid_tipo_retencionRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposRetencionInven % 1==0) {
		iXPanelCamposRetencionInven=0;
		iYPanelCamposRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionInven.add(this.jPanelporcentajeRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposRetencionInven % 1==0) {
		iXPanelCamposRetencionInven=0;
		iYPanelCamposRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionInven.add(this.jPanelbase_imponibleRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposRetencionInven % 1==0) {
		iXPanelCamposRetencionInven=0;
		iYPanelCamposRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionInven.add(this.jPanelretencionRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposRetencionInven % 1==0) {
		iXPanelCamposRetencionInven=0;
		iYPanelCamposRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionInven.add(this.jPanelnumero_retencionRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposRetencionInven % 1==0) {
		iXPanelCamposRetencionInven=0;
		iYPanelCamposRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionInven.add(this.jPanelid_cuenta_contableRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposRetencionInven % 1==0) {
		iXPanelCamposRetencionInven=0;
		iYPanelCamposRetencionInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposOcultosRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposOcultosRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionInven.add(this.jPanelid_empresaRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposOcultosRetencionInven % 1==0) {
		iXPanelCamposOcultosRetencionInven=0;
		iYPanelCamposOcultosRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposOcultosRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposOcultosRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionInven.add(this.jPanelid_sucursalRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposOcultosRetencionInven % 1==0) {
		iXPanelCamposOcultosRetencionInven=0;
		iYPanelCamposOcultosRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposOcultosRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposOcultosRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionInven.add(this.jPanelid_ejercicioRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposOcultosRetencionInven % 1==0) {
		iXPanelCamposOcultosRetencionInven=0;
		iYPanelCamposOcultosRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposOcultosRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposOcultosRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionInven.add(this.jPanelid_periodoRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposOcultosRetencionInven % 1==0) {
		iXPanelCamposOcultosRetencionInven=0;
		iYPanelCamposOcultosRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposOcultosRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposOcultosRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionInven.add(this.jPanelid_anioRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposOcultosRetencionInven % 1==0) {
		iXPanelCamposOcultosRetencionInven=0;
		iYPanelCamposOcultosRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposOcultosRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposOcultosRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionInven.add(this.jPanelid_mesRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposOcultosRetencionInven % 1==0) {
		iXPanelCamposOcultosRetencionInven=0;
		iYPanelCamposOcultosRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposOcultosRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposOcultosRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionInven.add(this.jPanelnumero_serie_retencionRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposOcultosRetencionInven % 1==0) {
		iXPanelCamposOcultosRetencionInven=0;
		iYPanelCamposOcultosRetencionInven++;
	}
	this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionInven.gridy = iYPanelCamposOcultosRetencionInven;
	this.gridBagConstraintsRetencionInven.gridx = iXPanelCamposOcultosRetencionInven++;
	this.gridBagConstraintsRetencionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionInven.add(this.jPanelcodigoRetencionInven, this.gridBagConstraintsRetencionInven);



	if(iXPanelCamposOcultosRetencionInven % 1==0) {
		iXPanelCamposOcultosRetencionInven=0;
		iYPanelCamposOcultosRetencionInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesRetencionInven= new GridBagLayout();
		this.jPanelAccionesRetencionInven.setLayout(gridaBagLayoutAccionesRetencionInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRetencionInven= new GridBagLayout();
		this.jPanelAccionesFormularioRetencionInven.setLayout(gridaBagLayoutAccionesFormularioRetencionInven);
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRetencionInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRetencionInven.add(this.jComboBoxTiposAccionesFormularioRetencionInven, this.gridBagConstraintsRetencionInven);

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRetencionInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRetencionInven.add(this.jCheckBoxPostAccionNuevoRetencionInven, this.gridBagConstraintsRetencionInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.retencioninvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRetencionInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRetencionInven.add(this.jCheckBoxPostAccionSinCerrarRetencionInven, this.gridBagConstraintsRetencionInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.retencioninvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRetencionInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRetencionInven.add(this.jCheckBoxPostAccionSinMensajeRetencionInven, this.gridBagConstraintsRetencionInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesRetencionInven.add(this.jButtonModificarRetencionInven, this.gridBagConstraintsRetencionInven);							

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesRetencionInven.add(this.jButtonEliminarRetencionInven, this.gridBagConstraintsRetencionInven);
		
			
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = 0;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesRetencionInven.add(this.jButtonActualizarRetencionInven, this.gridBagConstraintsRetencionInven);


		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = 0;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesRetencionInven.add(this.jButtonGuardarCambiosRetencionInven, this.gridBagConstraintsRetencionInven);	
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = 0;		
		this.gridBagConstraintsRetencionInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesRetencionInven.add(this.jButtonCancelarRetencionInven, this.gridBagConstraintsRetencionInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRetencionInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRetencionInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();						
			this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionInven.gridx = 0;		
			//this.gridBagConstraintsRetencionInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRetencionInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRetencionInven.gridx =0;
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRetencionInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRetencionInven, this.gridBagConstraintsRetencionInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RetencionInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRetencionInven = new RetencionInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Retencion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Retencion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Retencion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RetencionInvenModel retencioninvenModel=new RetencionInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//RetencionInvenModel.RetencionInvenFocusTraversalPolicy retencioninvenFocusTraversalPolicy = retencioninvenModel.new RetencionInvenFocusTraversalPolicy(this);
			
			//retencioninvenFocusTraversalPolicy.setretencioninvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(retencioninvenModel);
			
			
			this.jContentPaneDetalleRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRetencionInven = new GridBagLayout();	
			this.jContentPaneDetalleRetencionInven.setLayout(gridaBagLayoutDetalleRetencionInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRetencionInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRetencionInven = new GridBagConstraints();
				this.gridBagConstraintsRetencionInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRetencionInven.gridx = 0;
					
				
				this.jContentPaneDetalleRetencionInven.add(jTtoolBarDetalleRetencionInven, gridBagConstraintsRetencionInven);								
				
}
			
			this.jScrollPanelDatosEdicionRetencionInven=   new JScrollPane(jContentPaneDetalleRetencionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRetencionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRetencionInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRetencionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRetencionInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRetencionInven.gridx = 0;
	        
			this.jContentPaneDetalleRetencionInven.add(jPanelCamposRetencionInven, gridBagConstraintsRetencionInven);
			
			
			
			
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
						&& retencioninvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRetencionInven= new GridBagConstraints();
						this.gridBagConstraintsRetencionInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRetencionInven.gridx = 0;
						this.jContentPaneDetalleRetencionInven.add(this.jTabbedPaneRelacionesRetencionInven, this.gridBagConstraintsRetencionInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRetencionInven.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRetencionInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRetencionInven = new GridBagConstraints();
					this.gridBagConstraintsRetencionInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRetencionInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRetencionInven.gridx = 0;
					
				
					this.jContentPaneDetalleRetencionInven.add(jPanelCamposOcultosRetencionInven, gridBagConstraintsRetencionInven);
				
					this.jPanelCamposOcultosRetencionInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRetencionInven.gridx = 0;
	        this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRetencionInven.add(this.jPanelAccionesFormularioRetencionInven, this.gridBagConstraintsRetencionInven);							
			
			
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
	        this.gridBagConstraintsRetencionInven.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRetencionInven.gridx = 0;
	        
			
			this.jContentPaneDetalleRetencionInven.add(this.jPanelAccionesRetencionInven, this.gridBagConstraintsRetencionInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRetencionInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRetencionInven=   new JScrollPane(this.jPanelCamposRetencionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRetencionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRetencionInven.gridx = 0;
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRetencionInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRetencionInven, this.gridBagConstraintsRetencionInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRetencionInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRetencionInven, this.gridBagConstraintsRetencionInven);			
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRetencionInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRetencionInven, this.gridBagConstraintsRetencionInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRetencionInven, this.gridBagConstraintsRetencionInven);
			
			
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRetencionInven, this.gridBagConstraintsRetencionInven);
		
			
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRetencionInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRetencionInven, this.gridBagConstraintsRetencionInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRetencionInven;//jContentPane;
		
		return jScrollPanelDatosEdicionRetencionInven;
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
