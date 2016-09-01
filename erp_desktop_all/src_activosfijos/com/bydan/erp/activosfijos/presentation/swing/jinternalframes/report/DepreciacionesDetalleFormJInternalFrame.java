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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.DepreciacionesConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class DepreciacionesDetalleFormJInternalFrame extends DepreciacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDepreciaciones;
	
	protected JMenuBar jmenuBarDetalleDepreciaciones;
	
	protected JMenu jmenuDetalleDepreciaciones;
	protected JMenu jmenuDetalleArchivoDepreciaciones;
	protected JMenu jmenuDetalleAccionesDepreciaciones;
	protected JMenu jmenuDetalleDatosDepreciaciones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDepreciaciones;	
	protected GridBagConstraints gridBagConstraintsDepreciaciones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DepreciacionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleDepreciaciones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected AnioBeanSwingJInternalFrame anioinicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anioinicio="";

	protected AnioBeanSwingJInternalFrame aniofinBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_aniofin="";

	protected MesBeanSwingJInternalFrame mesinicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesinicio="";

	protected MesBeanSwingJInternalFrame mesfinBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesfin="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DepreciacionesSessionBean depreciacionesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public AnioSessionBean anioinicioSessionBean;
	public AnioSessionBean aniofinSessionBean;
	public MesSessionBean mesinicioSessionBean;
	public MesSessionBean mesfinSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public DepreciacionesLogic depreciacionesLogic;
	
	public JScrollPane jScrollPanelDatosDepreciaciones;
	public JScrollPane jScrollPanelDatosEdicionDepreciaciones;
	public JScrollPane jScrollPanelDatosGeneralDepreciaciones;
	
	protected JPanel jPanelCamposDepreciaciones;    
	protected JPanel jPanelCamposOcultosDepreciaciones;    	
	protected JPanel jPanelAccionesDepreciaciones;
	protected JPanel jPanelAccionesFormularioDepreciaciones;
    
	
	
	protected Integer iXPanelCamposDepreciaciones=0;
	protected Integer iYPanelCamposDepreciaciones=0;
	
	protected Integer iXPanelCamposOcultosDepreciaciones=0;
	protected Integer iYPanelCamposOcultosDepreciaciones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDepreciaciones;
	public JButton jButtonModificarDepreciaciones;
	public JButton jButtonActualizarDepreciaciones;
    public JButton jButtonEliminarDepreciaciones;
	public JButton jButtonCancelarDepreciaciones;
    public JButton jButtonGuardarCambiosDepreciaciones;
	public JButton jButtonGuardarCambiosTablaDepreciaciones;
	protected JButton jButtonCerrarDepreciaciones;
	
	
	protected JButton jButtonProcesarInformacionDepreciaciones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDepreciaciones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDepreciaciones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDepreciaciones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDepreciaciones;
	protected JButton jButtonModificarToolBarDepreciaciones;
	protected JButton jButtonActualizarToolBarDepreciaciones;
    protected JButton jButtonEliminarToolBarDepreciaciones;
	protected JButton jButtonCancelarToolBarDepreciaciones;
    protected JButton jButtonGuardarCambiosToolBarDepreciaciones;
	protected JButton jButtonGuardarCambiosTablaToolBarDepreciaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarDepreciaciones;
	protected JButton jButtonCerrarToolBarDepreciaciones;
	
	protected JButton jButtonProcesarInformacionToolBarDepreciaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDepreciaciones;
	protected JMenuItem jMenuItemModificarDepreciaciones;
	protected JMenuItem jMenuItemActualizarDepreciaciones;
    protected JMenuItem jMenuItemEliminarDepreciaciones;
	protected JMenuItem jMenuItemCancelarDepreciaciones;
    protected JMenuItem jMenuItemGuardarCambiosDepreciaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaDepreciaciones;
	protected JMenuItem jMenuItemCerrarDepreciaciones;
	protected JMenuItem jMenuItemDetalleCerrarDepreciaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarDepreciaciones;
	
	protected JMenuItem jMenuItemProcesarInformacionDepreciaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDepreciaciones;
	protected JMenuItem jMenuItemMostrarOcultarDepreciaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDepreciaciones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDepreciaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDepreciaciones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDepreciaciones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDepreciaciones;
	public JLabel jLabelIdDepreciaciones;
	public JLabel jLabelidDepreciaciones;
	public JButton jButtonidDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sub_grupoDepreciaciones;
	public JLabel jLabelcodigo_sub_grupoDepreciaciones;
	public JTextField jTextFieldcodigo_sub_grupoDepreciaciones;
	public JButton jButtoncodigo_sub_grupoDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sub_grupoDepreciaciones;
	public JLabel jLabelnombre_sub_grupoDepreciaciones;
	public JTextArea jTextAreanombre_sub_grupoDepreciaciones;
	public JScrollPane jscrollPanenombre_sub_grupoDepreciaciones;
	public JButton jButtonnombre_sub_grupoDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_detalle_grupoDepreciaciones;
	public JLabel jLabelcodigo_detalle_grupoDepreciaciones;
	public JTextField jTextFieldcodigo_detalle_grupoDepreciaciones;
	public JButton jButtoncodigo_detalle_grupoDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_detalle_grupoDepreciaciones;
	public JLabel jLabelnombre_detalle_grupoDepreciaciones;
	public JTextArea jTextAreanombre_detalle_grupoDepreciaciones;
	public JScrollPane jscrollPanenombre_detalle_grupoDepreciaciones;
	public JButton jButtonnombre_detalle_grupoDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelclaveDepreciaciones;
	public JLabel jLabelclaveDepreciaciones;
	public JTextField jTextFieldclaveDepreciaciones;
	public JButton jButtonclaveDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelnombreDepreciaciones;
	public JLabel jLabelnombreDepreciaciones;
	public JTextArea jTextAreanombreDepreciaciones;
	public JScrollPane jscrollPanenombreDepreciaciones;
	public JButton jButtonnombreDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_compraDepreciaciones;
	public JLabel jLabelfecha_compraDepreciaciones;
	//public JFormattedTextField jDateChooserfecha_compraDepreciaciones;

	public JDateChooser jDateChooserfecha_compraDepreciaciones;
	public JButton jButtonfecha_compraDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelvida_utilDepreciaciones;
	public JLabel jLabelvida_utilDepreciaciones;
	public JTextField jTextFieldvida_utilDepreciaciones;
	public JButton jButtonvida_utilDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelcosto_de_compraDepreciaciones;
	public JLabel jLabelcosto_de_compraDepreciaciones;
	public JTextField jTextFieldcosto_de_compraDepreciaciones;
	public JButton jButtoncosto_de_compraDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_mantenimientoDepreciaciones;
	public JLabel jLabelfecha_mantenimientoDepreciaciones;
	//public JFormattedTextField jDateChooserfecha_mantenimientoDepreciaciones;

	public JDateChooser jDateChooserfecha_mantenimientoDepreciaciones;
	public JButton jButtonfecha_mantenimientoDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_depreciacionDepreciaciones;
	public JLabel jLabelfecha_depreciacionDepreciaciones;
	//public JFormattedTextField jDateChooserfecha_depreciacionDepreciaciones;

	public JDateChooser jDateChooserfecha_depreciacionDepreciaciones;
	public JButton jButtonfecha_depreciacionDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelvalor_acumuladoDepreciaciones;
	public JLabel jLabelvalor_acumuladoDepreciaciones;
	public JTextField jTextFieldvalor_acumuladoDepreciaciones;
	public JButton jButtonvalor_acumuladoDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelvalor_gastoDepreciaciones;
	public JLabel jLabelvalor_gastoDepreciaciones;
	public JTextField jTextFieldvalor_gastoDepreciaciones;
	public JButton jButtonvalor_gastoDepreciacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDepreciaciones;
	public JLabel jLabelid_empresaDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDepreciaciones;
	public JButton jButtonid_empresaDepreciaciones= new JButtonMe();
	public JButton jButtonid_empresaDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_empresaDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_anio_inicioDepreciaciones;
	public JLabel jLabelid_anio_inicioDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anio_inicioDepreciaciones;
	public JButton jButtonid_anio_inicioDepreciaciones= new JButtonMe();
	public JButton jButtonid_anio_inicioDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_anio_inicioDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_anio_finDepreciaciones;
	public JLabel jLabelid_anio_finDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anio_finDepreciaciones;
	public JButton jButtonid_anio_finDepreciaciones= new JButtonMe();
	public JButton jButtonid_anio_finDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_anio_finDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_mes_inicioDepreciaciones;
	public JLabel jLabelid_mes_inicioDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_inicioDepreciaciones;
	public JButton jButtonid_mes_inicioDepreciaciones= new JButtonMe();
	public JButton jButtonid_mes_inicioDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_mes_inicioDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_mes_finDepreciaciones;
	public JLabel jLabelid_mes_finDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_finDepreciaciones;
	public JButton jButtonid_mes_finDepreciaciones= new JButtonMe();
	public JButton jButtonid_mes_finDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_mes_finDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDepreciaciones;
	public JLabel jLabelid_anioDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDepreciaciones;
	public JButton jButtonid_anioDepreciaciones= new JButtonMe();
	public JButton jButtonid_anioDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_anioDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDepreciaciones;
	public JLabel jLabelid_mesDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDepreciaciones;
	public JButton jButtonid_mesDepreciaciones= new JButtonMe();
	public JButton jButtonid_mesDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_mesDepreciacionesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDepreciaciones;
	
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
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DepreciacionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDepreciaciones=new JPanel();
				this.jPanelAccionesFormularioDepreciaciones=new JPanel();
				this.jmenuBarDetalleDepreciaciones=new JMenuBar();
				this.jTtoolBarDetalleDepreciaciones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Depreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DepreciacionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Depreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Depreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Depreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Depreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDepreciaciones() {
		return this.jButtonActualizarToolBarDepreciaciones;
	}
	
	public JButton getjButtonEliminarToolBarDepreciaciones() {
		return this.jButtonEliminarToolBarDepreciaciones;
	}
	
	public JButton getjButtonCancelarToolBarDepreciaciones() {
		return this.jButtonCancelarToolBarDepreciaciones;
	}		
	
	public JButton getjButtonProcesarInformacionDepreciaciones() {
		return this.jButtonProcesarInformacionDepreciaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDepreciaciones)	{
		this.jButtonProcesarInformacionDepreciaciones = jButtonProcesarInformacionDepreciaciones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDepreciaciones() {
		return this.jComboBoxTiposAccionesDepreciaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDepreciaciones(
			JComboBox jComboBoxTiposRelacionesDepreciaciones) {
		this.jComboBoxTiposRelacionesDepreciaciones = jComboBoxTiposRelacionesDepreciaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDepreciaciones(
			JComboBox jComboBoxTiposAccionesDepreciaciones) {
		this.jComboBoxTiposAccionesDepreciaciones = jComboBoxTiposAccionesDepreciaciones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDepreciaciones() {
		return this.jComboBoxTiposAccionesFormularioDepreciaciones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDepreciaciones(
			JComboBox jComboBoxTiposAccionesFormularioDepreciaciones) {
		this.jComboBoxTiposAccionesFormularioDepreciaciones = jComboBoxTiposAccionesFormularioDepreciaciones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.depreciacionesSessionBean=new DepreciacionesSessionBean();
		
		this.depreciacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.depreciacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.depreciacionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DepreciacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Depreciaciones MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
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
	
		DepreciacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDepreciaciones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDepreciaciones=new JButtonMe();
				this.jButtonModificarToolBarDepreciaciones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDepreciaciones,this.jTtoolBarDetalleDepreciaciones,
							"actualizar","actualizar","Actualizar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDepreciaciones,this.jTtoolBarDetalleDepreciaciones,
							"eliminar","eliminar","Eliminar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDepreciaciones,this.jTtoolBarDetalleDepreciaciones,
							"cancelar","cancelar","Cancelar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDepreciaciones,this.jTtoolBarDetalleDepreciaciones,
							"guardarcambios","guardarcambios","Guardar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDepreciaciones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDepreciaciones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDepreciaciones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDepreciaciones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDepreciaciones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDepreciaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDepreciaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDepreciaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDepreciaciones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDepreciaciones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDepreciaciones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDepreciaciones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDepreciaciones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDepreciaciones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDepreciaciones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDepreciaciones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDepreciaciones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDepreciaciones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDepreciaciones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDepreciaciones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDepreciaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDepreciaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDepreciaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDepreciaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDepreciaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDepreciaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDepreciaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDepreciaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDepreciaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDepreciaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDepreciaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDepreciaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDepreciaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDepreciaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDepreciaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDepreciaciones.add(this.jMenuItemDetalleCerrarDepreciaciones);
		
		this.jmenuDetalleAccionesDepreciaciones.add(this.jMenuItemActualizarDepreciaciones);
		this.jmenuDetalleAccionesDepreciaciones.add(this.jMenuItemEliminarDepreciaciones);
		this.jmenuDetalleAccionesDepreciaciones.add(this.jMenuItemCancelarDepreciaciones);		
		
		//this.jmenuDetalleDatosDepreciaciones.add(this.jMenuItemDetalleAbrirOrderByDepreciaciones);				
		this.jmenuDetalleDatosDepreciaciones.add(this.jMenuItemDetalleMostarOcultarDepreciaciones);				
				
		//this.jmenuDetalleAccionesDepreciaciones.add(this.jMenuItemGuardarCambiosDepreciaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDepreciaciones.add(this.jmenuDetalleArchivoDepreciaciones);		
		this.jmenuBarDetalleDepreciaciones.add(this.jmenuDetalleAccionesDepreciaciones);		
		this.jmenuBarDetalleDepreciaciones.add(this.jmenuDetalleDatosDepreciaciones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDepreciaciones);				
	}
	
	
	public void inicializarElementosCamposDepreciaciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDepreciaciones = new JLabelMe();
		jLabelIdDepreciaciones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDepreciaciones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDepreciaciones= new GridBagLayout();

		this.jPanelidDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);

		jLabelidDepreciaciones = new JLabel();
		jLabelidDepreciaciones.setText("Id");

		jLabelidDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigo_sub_grupoDepreciaciones = new JLabelMe();
		this.jLabelcodigo_sub_grupoDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO+" : *");
		this.jLabelcodigo_sub_grupoDepreciaciones.setToolTipText("Codigo Sub Grupo");
		this.jLabelcodigo_sub_grupoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sub_grupoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sub_grupoDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sub_grupoDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelcodigo_sub_grupoDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jTextFieldcodigo_sub_grupoDepreciaciones= new JTextFieldMe();

		jTextFieldcodigo_sub_grupoDepreciaciones.setEnabled(false);
		jTextFieldcodigo_sub_grupoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sub_grupoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sub_grupoDepreciacionesBusqueda= new JButtonMe();
		this.jButtoncodigo_sub_grupoDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sub_grupoDepreciacionesBusqueda.setText("U");
		this.jButtoncodigo_sub_grupoDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sub_grupoDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sub_grupoDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sub_grupoDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sub_grupoDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sub_grupoDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sub_grupoDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sub_grupoDepreciaciones = new JLabelMe();
		this.jLabelnombre_sub_grupoDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO+" : *");
		this.jLabelnombre_sub_grupoDepreciaciones.setToolTipText("Nombre Sub Grupo");
		this.jLabelnombre_sub_grupoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sub_grupoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sub_grupoDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sub_grupoDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelnombre_sub_grupoDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jTextAreanombre_sub_grupoDepreciaciones= new JTextAreaMe();
		jTextAreanombre_sub_grupoDepreciaciones.setEnabled(false);
		jTextAreanombre_sub_grupoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoDepreciaciones.setLineWrap(true);
		jTextAreanombre_sub_grupoDepreciaciones.setWrapStyleWord(true);
		jTextAreanombre_sub_grupoDepreciaciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sub_grupoDepreciaciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sub_grupoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sub_grupoDepreciaciones = new JScrollPane(jTextAreanombre_sub_grupoDepreciaciones);
		jscrollPanenombre_sub_grupoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sub_grupoDepreciacionesBusqueda= new JButtonMe();
		this.jButtonnombre_sub_grupoDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sub_grupoDepreciacionesBusqueda.setText("U");
		this.jButtonnombre_sub_grupoDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sub_grupoDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sub_grupoDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sub_grupoDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sub_grupoDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sub_grupoDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sub_grupoDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_detalle_grupoDepreciaciones = new JLabelMe();
		this.jLabelcodigo_detalle_grupoDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO+" : *");
		this.jLabelcodigo_detalle_grupoDepreciaciones.setToolTipText("Codigo Detalle Grupo");
		this.jLabelcodigo_detalle_grupoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_detalle_grupoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_detalle_grupoDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_detalle_grupoDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelcodigo_detalle_grupoDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jTextFieldcodigo_detalle_grupoDepreciaciones= new JTextFieldMe();

		jTextFieldcodigo_detalle_grupoDepreciaciones.setEnabled(false);
		jTextFieldcodigo_detalle_grupoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_detalle_grupoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_detalle_grupoDepreciacionesBusqueda= new JButtonMe();
		this.jButtoncodigo_detalle_grupoDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_detalle_grupoDepreciacionesBusqueda.setText("U");
		this.jButtoncodigo_detalle_grupoDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_detalle_grupoDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_detalle_grupoDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_detalle_grupoDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_detalle_grupoDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_detalle_grupoDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_detalle_grupoDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_detalle_grupoDepreciaciones = new JLabelMe();
		this.jLabelnombre_detalle_grupoDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+" : *");
		this.jLabelnombre_detalle_grupoDepreciaciones.setToolTipText("Nombre Detalle Grupo");
		this.jLabelnombre_detalle_grupoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_detalle_grupoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_detalle_grupoDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_detalle_grupoDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelnombre_detalle_grupoDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jTextAreanombre_detalle_grupoDepreciaciones= new JTextAreaMe();
		jTextAreanombre_detalle_grupoDepreciaciones.setEnabled(false);
		jTextAreanombre_detalle_grupoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoDepreciaciones.setLineWrap(true);
		jTextAreanombre_detalle_grupoDepreciaciones.setWrapStyleWord(true);
		jTextAreanombre_detalle_grupoDepreciaciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_detalle_grupoDepreciaciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_detalle_grupoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_detalle_grupoDepreciaciones = new JScrollPane(jTextAreanombre_detalle_grupoDepreciaciones);
		jscrollPanenombre_detalle_grupoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_detalle_grupoDepreciacionesBusqueda= new JButtonMe();
		this.jButtonnombre_detalle_grupoDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_detalle_grupoDepreciacionesBusqueda.setText("U");
		this.jButtonnombre_detalle_grupoDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_detalle_grupoDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_detalle_grupoDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_detalle_grupoDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_detalle_grupoDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_detalle_grupoDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_detalle_grupoDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelclaveDepreciaciones = new JLabelMe();
		this.jLabelclaveDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveDepreciaciones.setToolTipText("Clave");
		this.jLabelclaveDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelclaveDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jTextFieldclaveDepreciaciones= new JTextFieldMe();

		jTextFieldclaveDepreciaciones.setEnabled(false);
		jTextFieldclaveDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldclaveDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonclaveDepreciacionesBusqueda= new JButtonMe();
		this.jButtonclaveDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveDepreciacionesBusqueda.setText("U");
		this.jButtonclaveDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldclaveDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldclaveDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelnombreDepreciaciones = new JLabelMe();
		this.jLabelnombreDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDepreciaciones.setToolTipText("Nombre");
		this.jLabelnombreDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelnombreDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jTextAreanombreDepreciaciones= new JTextAreaMe();
		jTextAreanombreDepreciaciones.setEnabled(false);
		jTextAreanombreDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDepreciaciones.setLineWrap(true);
		jTextAreanombreDepreciaciones.setWrapStyleWord(true);
		jTextAreanombreDepreciaciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDepreciaciones.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDepreciaciones = new JScrollPane(jTextAreanombreDepreciaciones);
		jscrollPanenombreDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreDepreciacionesBusqueda= new JButtonMe();
		this.jButtonnombreDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDepreciacionesBusqueda.setText("U");
		this.jButtonnombreDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_compraDepreciaciones = new JLabelMe();
		this.jLabelfecha_compraDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA+" : *");
		this.jLabelfecha_compraDepreciaciones.setToolTipText("Fecha Compra");
		this.jLabelfecha_compraDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_compraDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_compraDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelfecha_compraDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		//jFormattedTextFieldfecha_compraDepreciaciones= new JFormattedTextFieldMe();

		jDateChooserfecha_compraDepreciaciones= new JDateChooser();
		jDateChooserfecha_compraDepreciaciones.setEnabled(false);
		jDateChooserfecha_compraDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_compraDepreciaciones.setDate(new Date());
		jDateChooserfecha_compraDepreciaciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_compraDepreciaciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_compraDepreciacionesBusqueda= new JButtonMe();
		this.jButtonfecha_compraDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_compraDepreciacionesBusqueda.setText("U");
		this.jButtonfecha_compraDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_compraDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_compraDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_compraDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_compraDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_compraDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_compraDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelvida_utilDepreciaciones = new JLabelMe();
		this.jLabelvida_utilDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_VIDAUTIL+" : *");
		this.jLabelvida_utilDepreciaciones.setToolTipText("Va Util");
		this.jLabelvida_utilDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvida_utilDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvida_utilDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvida_utilDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_VIDAUTIL);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelvida_utilDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jTextFieldvida_utilDepreciaciones= new JTextFieldMe();
		jTextFieldvida_utilDepreciaciones.setEnabled(false);
		jTextFieldvida_utilDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvida_utilDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvida_utilDepreciaciones.setText("0.0");

		this.jButtonvida_utilDepreciacionesBusqueda= new JButtonMe();
		this.jButtonvida_utilDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvida_utilDepreciacionesBusqueda.setText("U");
		this.jButtonvida_utilDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvida_utilDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvida_utilDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvida_utilDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvida_utilDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"vida_utilDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvida_utilDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelcosto_de_compraDepreciaciones = new JLabelMe();
		this.jLabelcosto_de_compraDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA+" : *");
		this.jLabelcosto_de_compraDepreciaciones.setToolTipText("Costo Compra");
		this.jLabelcosto_de_compraDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_de_compraDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_de_compraDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_de_compraDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelcosto_de_compraDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jTextFieldcosto_de_compraDepreciaciones= new JTextFieldMe();
		jTextFieldcosto_de_compraDepreciaciones.setEnabled(false);
		jTextFieldcosto_de_compraDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_de_compraDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_de_compraDepreciaciones.setText("0.0");

		this.jButtoncosto_de_compraDepreciacionesBusqueda= new JButtonMe();
		this.jButtoncosto_de_compraDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_de_compraDepreciacionesBusqueda.setText("U");
		this.jButtoncosto_de_compraDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_de_compraDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_de_compraDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_de_compraDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_de_compraDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_de_compraDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_de_compraDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_mantenimientoDepreciaciones = new JLabelMe();
		this.jLabelfecha_mantenimientoDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO+" : *");
		this.jLabelfecha_mantenimientoDepreciaciones.setToolTipText("Fecha Mantenimiento");
		this.jLabelfecha_mantenimientoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_mantenimientoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_mantenimientoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_mantenimientoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_mantenimientoDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_mantenimientoDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelfecha_mantenimientoDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		//jFormattedTextFieldfecha_mantenimientoDepreciaciones= new JFormattedTextFieldMe();

		jDateChooserfecha_mantenimientoDepreciaciones= new JDateChooser();
		jDateChooserfecha_mantenimientoDepreciaciones.setEnabled(false);
		jDateChooserfecha_mantenimientoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_mantenimientoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_mantenimientoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_mantenimientoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_mantenimientoDepreciaciones.setDate(new Date());
		jDateChooserfecha_mantenimientoDepreciaciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_mantenimientoDepreciaciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_mantenimientoDepreciacionesBusqueda= new JButtonMe();
		this.jButtonfecha_mantenimientoDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_mantenimientoDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_mantenimientoDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_mantenimientoDepreciacionesBusqueda.setText("U");
		this.jButtonfecha_mantenimientoDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_mantenimientoDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_mantenimientoDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_mantenimientoDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_mantenimientoDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_mantenimientoDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_mantenimientoDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_depreciacionDepreciaciones = new JLabelMe();
		this.jLabelfecha_depreciacionDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION+" : *");
		this.jLabelfecha_depreciacionDepreciaciones.setToolTipText("Fecha Depreciacion");
		this.jLabelfecha_depreciacionDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_depreciacionDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_depreciacionDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_depreciacionDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_depreciacionDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_depreciacionDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelfecha_depreciacionDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		//jFormattedTextFieldfecha_depreciacionDepreciaciones= new JFormattedTextFieldMe();

		jDateChooserfecha_depreciacionDepreciaciones= new JDateChooser();
		jDateChooserfecha_depreciacionDepreciaciones.setEnabled(false);
		jDateChooserfecha_depreciacionDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_depreciacionDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_depreciacionDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_depreciacionDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_depreciacionDepreciaciones.setDate(new Date());
		jDateChooserfecha_depreciacionDepreciaciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_depreciacionDepreciaciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_depreciacionDepreciacionesBusqueda= new JButtonMe();
		this.jButtonfecha_depreciacionDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_depreciacionDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_depreciacionDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_depreciacionDepreciacionesBusqueda.setText("U");
		this.jButtonfecha_depreciacionDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_depreciacionDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_depreciacionDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_depreciacionDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_depreciacionDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_depreciacionDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_depreciacionDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelvalor_acumuladoDepreciaciones = new JLabelMe();
		this.jLabelvalor_acumuladoDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO+" : *");
		this.jLabelvalor_acumuladoDepreciaciones.setToolTipText("Valor Acumulado");
		this.jLabelvalor_acumuladoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_acumuladoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_acumuladoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_acumuladoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_acumuladoDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_acumuladoDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelvalor_acumuladoDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jTextFieldvalor_acumuladoDepreciaciones= new JTextFieldMe();
		jTextFieldvalor_acumuladoDepreciaciones.setEnabled(false);
		jTextFieldvalor_acumuladoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_acumuladoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_acumuladoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_acumuladoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_acumuladoDepreciaciones.setText("0.0");

		this.jButtonvalor_acumuladoDepreciacionesBusqueda= new JButtonMe();
		this.jButtonvalor_acumuladoDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_acumuladoDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_acumuladoDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_acumuladoDepreciacionesBusqueda.setText("U");
		this.jButtonvalor_acumuladoDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_acumuladoDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_acumuladoDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_acumuladoDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_acumuladoDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_acumuladoDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_acumuladoDepreciacionesBusqueda.setVisible(false);		}


					
		this.jLabelvalor_gastoDepreciaciones = new JLabelMe();
		this.jLabelvalor_gastoDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_VALORGASTO+" : *");
		this.jLabelvalor_gastoDepreciaciones.setToolTipText("Valor Gasto");
		this.jLabelvalor_gastoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_gastoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_gastoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_gastoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_gastoDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_gastoDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_VALORGASTO);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelvalor_gastoDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jTextFieldvalor_gastoDepreciaciones= new JTextFieldMe();
		jTextFieldvalor_gastoDepreciaciones.setEnabled(false);
		jTextFieldvalor_gastoDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_gastoDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_gastoDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_gastoDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_gastoDepreciaciones.setText("0.0");

		this.jButtonvalor_gastoDepreciacionesBusqueda= new JButtonMe();
		this.jButtonvalor_gastoDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_gastoDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_gastoDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_gastoDepreciacionesBusqueda.setText("U");
		this.jButtonvalor_gastoDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_gastoDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_gastoDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_gastoDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_gastoDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_gastoDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_gastoDepreciacionesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDepreciaciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDepreciaciones = new JLabelMe();
		this.jLabelid_empresaDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDepreciaciones.setToolTipText("Empresa");
		this.jLabelid_empresaDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelid_empresaDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jComboBoxid_empresaDepreciaciones= new JComboBoxMe();
		jComboBoxid_empresaDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDepreciaciones.setEnabled(false);

		this.jButtonid_empresaDepreciaciones= new JButtonMe();
		this.jButtonid_empresaDepreciaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDepreciaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDepreciaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDepreciaciones.setText("Buscar");
		this.jButtonid_empresaDepreciaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDepreciaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDepreciaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDepreciaciones"));

		this.jButtonid_empresaDepreciacionesBusqueda= new JButtonMe();
		this.jButtonid_empresaDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDepreciacionesBusqueda.setText("U");
		this.jButtonid_empresaDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDepreciacionesBusqueda.setVisible(false);		}

		this.jButtonid_empresaDepreciacionesUpdate= new JButtonMe();
		this.jButtonid_empresaDepreciacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepreciacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepreciacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDepreciacionesUpdate.setText("U");
		this.jButtonid_empresaDepreciacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDepreciacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDepreciacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDepreciacionesUpdate"));



					
		this.jLabelid_anio_inicioDepreciaciones = new JLabelMe();
		this.jLabelid_anio_inicioDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_IDANIOINICIO+" : *");
		this.jLabelid_anio_inicioDepreciaciones.setToolTipText("Anio Inicio");
		this.jLabelid_anio_inicioDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anio_inicioDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anio_inicioDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anio_inicioDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anio_inicioDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anio_inicioDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_IDANIOINICIO);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelid_anio_inicioDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jComboBoxid_anio_inicioDepreciaciones= new JComboBoxMe();
		jComboBoxid_anio_inicioDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_inicioDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_inicioDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anio_inicioDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anio_inicioDepreciaciones= new JButtonMe();
		this.jButtonid_anio_inicioDepreciaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_inicioDepreciaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_inicioDepreciaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_inicioDepreciaciones.setText("Buscar");
		this.jButtonid_anio_inicioDepreciaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anio_inicioDepreciaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_inicioDepreciaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anio_inicioDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_inicioDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_inicioDepreciaciones"));

		this.jButtonid_anio_inicioDepreciacionesBusqueda= new JButtonMe();
		this.jButtonid_anio_inicioDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_inicioDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_inicioDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anio_inicioDepreciacionesBusqueda.setText("U");
		this.jButtonid_anio_inicioDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anio_inicioDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_inicioDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anio_inicioDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_inicioDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_inicioDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anio_inicioDepreciacionesBusqueda.setVisible(false);		}

		this.jButtonid_anio_inicioDepreciacionesUpdate= new JButtonMe();
		this.jButtonid_anio_inicioDepreciacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_inicioDepreciacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_inicioDepreciacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anio_inicioDepreciacionesUpdate.setText("U");
		this.jButtonid_anio_inicioDepreciacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anio_inicioDepreciacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_inicioDepreciacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anio_inicioDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_inicioDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_inicioDepreciacionesUpdate"));



					
		this.jLabelid_anio_finDepreciaciones = new JLabelMe();
		this.jLabelid_anio_finDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_IDANIOFIN+" : *");
		this.jLabelid_anio_finDepreciaciones.setToolTipText("Anio Fin");
		this.jLabelid_anio_finDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anio_finDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anio_finDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anio_finDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anio_finDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anio_finDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_IDANIOFIN);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelid_anio_finDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jComboBoxid_anio_finDepreciaciones= new JComboBoxMe();
		jComboBoxid_anio_finDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_finDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_finDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anio_finDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anio_finDepreciaciones= new JButtonMe();
		this.jButtonid_anio_finDepreciaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_finDepreciaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_finDepreciaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_finDepreciaciones.setText("Buscar");
		this.jButtonid_anio_finDepreciaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anio_finDepreciaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_finDepreciaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anio_finDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_finDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_finDepreciaciones"));

		this.jButtonid_anio_finDepreciacionesBusqueda= new JButtonMe();
		this.jButtonid_anio_finDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_finDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_finDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anio_finDepreciacionesBusqueda.setText("U");
		this.jButtonid_anio_finDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anio_finDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_finDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anio_finDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_finDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_finDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anio_finDepreciacionesBusqueda.setVisible(false);		}

		this.jButtonid_anio_finDepreciacionesUpdate= new JButtonMe();
		this.jButtonid_anio_finDepreciacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_finDepreciacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_finDepreciacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anio_finDepreciacionesUpdate.setText("U");
		this.jButtonid_anio_finDepreciacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anio_finDepreciacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_finDepreciacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anio_finDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_finDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_finDepreciacionesUpdate"));



					
		this.jLabelid_mes_inicioDepreciaciones = new JLabelMe();
		this.jLabelid_mes_inicioDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_IDMESINICIO+" : *");
		this.jLabelid_mes_inicioDepreciaciones.setToolTipText("Mes Inicio");
		this.jLabelid_mes_inicioDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_inicioDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_inicioDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mes_inicioDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mes_inicioDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mes_inicioDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_IDMESINICIO);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelid_mes_inicioDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jComboBoxid_mes_inicioDepreciaciones= new JComboBoxMe();
		jComboBoxid_mes_inicioDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicioDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicioDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_inicioDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mes_inicioDepreciaciones= new JButtonMe();
		this.jButtonid_mes_inicioDepreciaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_inicioDepreciaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_inicioDepreciaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_inicioDepreciaciones.setText("Buscar");
		this.jButtonid_mes_inicioDepreciaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mes_inicioDepreciaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_inicioDepreciaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mes_inicioDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_inicioDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_inicioDepreciaciones"));

		this.jButtonid_mes_inicioDepreciacionesBusqueda= new JButtonMe();
		this.jButtonid_mes_inicioDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicioDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicioDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_inicioDepreciacionesBusqueda.setText("U");
		this.jButtonid_mes_inicioDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mes_inicioDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_inicioDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mes_inicioDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_inicioDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_inicioDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mes_inicioDepreciacionesBusqueda.setVisible(false);		}

		this.jButtonid_mes_inicioDepreciacionesUpdate= new JButtonMe();
		this.jButtonid_mes_inicioDepreciacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicioDepreciacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicioDepreciacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_inicioDepreciacionesUpdate.setText("U");
		this.jButtonid_mes_inicioDepreciacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mes_inicioDepreciacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_inicioDepreciacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mes_inicioDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_inicioDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_inicioDepreciacionesUpdate"));



					
		this.jLabelid_mes_finDepreciaciones = new JLabelMe();
		this.jLabelid_mes_finDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_IDMESFIN+" : *");
		this.jLabelid_mes_finDepreciaciones.setToolTipText("Mes Fin");
		this.jLabelid_mes_finDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_finDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_finDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mes_finDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mes_finDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mes_finDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_IDMESFIN);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelid_mes_finDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jComboBoxid_mes_finDepreciaciones= new JComboBoxMe();
		jComboBoxid_mes_finDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_finDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mes_finDepreciaciones= new JButtonMe();
		this.jButtonid_mes_finDepreciaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_finDepreciaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_finDepreciaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_finDepreciaciones.setText("Buscar");
		this.jButtonid_mes_finDepreciaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mes_finDepreciaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_finDepreciaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mes_finDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_finDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_finDepreciaciones"));

		this.jButtonid_mes_finDepreciacionesBusqueda= new JButtonMe();
		this.jButtonid_mes_finDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_finDepreciacionesBusqueda.setText("U");
		this.jButtonid_mes_finDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mes_finDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_finDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mes_finDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_finDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_finDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mes_finDepreciacionesBusqueda.setVisible(false);		}

		this.jButtonid_mes_finDepreciacionesUpdate= new JButtonMe();
		this.jButtonid_mes_finDepreciacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finDepreciacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finDepreciacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_finDepreciacionesUpdate.setText("U");
		this.jButtonid_mes_finDepreciacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mes_finDepreciacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_finDepreciacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mes_finDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_finDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_finDepreciacionesUpdate"));



					
		this.jLabelid_anioDepreciaciones = new JLabelMe();
		this.jLabelid_anioDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDepreciaciones.setToolTipText("Anio");
		this.jLabelid_anioDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelid_anioDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jComboBoxid_anioDepreciaciones= new JComboBoxMe();
		jComboBoxid_anioDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioDepreciaciones= new JButtonMe();
		this.jButtonid_anioDepreciaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDepreciaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDepreciaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDepreciaciones.setText("Buscar");
		this.jButtonid_anioDepreciaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDepreciaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDepreciaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDepreciaciones"));

		this.jButtonid_anioDepreciacionesBusqueda= new JButtonMe();
		this.jButtonid_anioDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDepreciacionesBusqueda.setText("U");
		this.jButtonid_anioDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDepreciacionesBusqueda.setVisible(false);		}

		this.jButtonid_anioDepreciacionesUpdate= new JButtonMe();
		this.jButtonid_anioDepreciacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDepreciacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDepreciacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDepreciacionesUpdate.setText("U");
		this.jButtonid_anioDepreciacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDepreciacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDepreciacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDepreciacionesUpdate"));



					
		this.jLabelid_mesDepreciaciones = new JLabelMe();
		this.jLabelid_mesDepreciaciones.setText(""+DepreciacionesConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDepreciaciones.setToolTipText("Mes");
		this.jLabelid_mesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDepreciaciones.setToolTipText(DepreciacionesConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDepreciaciones = new GridBagLayout();
		this.jPanelid_mesDepreciaciones.setLayout(this.gridaBagLayoutDepreciaciones);


		jComboBoxid_mesDepreciaciones= new JComboBoxMe();
		jComboBoxid_mesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesDepreciaciones= new JButtonMe();
		this.jButtonid_mesDepreciaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDepreciaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDepreciaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDepreciaciones.setText("Buscar");
		this.jButtonid_mesDepreciaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDepreciaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDepreciaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDepreciaciones"));

		this.jButtonid_mesDepreciacionesBusqueda= new JButtonMe();
		this.jButtonid_mesDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDepreciacionesBusqueda.setText("U");
		this.jButtonid_mesDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDepreciacionesBusqueda"));

		if(this.depreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDepreciacionesBusqueda.setVisible(false);		}

		this.jButtonid_mesDepreciacionesUpdate= new JButtonMe();
		this.jButtonid_mesDepreciacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDepreciacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDepreciacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDepreciacionesUpdate.setText("U");
		this.jButtonid_mesDepreciacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDepreciacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDepreciacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDepreciacionesUpdate"));



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
		//this.jInternalFrameDetalleDepreciaciones = new DepreciacionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Depreciaciones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDepreciaciones= new GridBagLayout();
		

		
		String sToolTipDepreciaciones="";
		sToolTipDepreciaciones=DepreciacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDepreciaciones+="(ActivosFijos.Depreciaciones)";
		}
		
		if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipDepreciaciones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDepreciaciones = new JButtonMe();
		this.jButtonModificarDepreciaciones = new JButtonMe();
        this.jButtonActualizarDepreciaciones = new JButtonMe();
        this.jButtonEliminarDepreciaciones = new JButtonMe();
        this.jButtonCancelarDepreciaciones = new JButtonMe();
        this.jButtonGuardarCambiosDepreciaciones = new JButtonMe();
		this.jButtonGuardarCambiosTablaDepreciaciones = new JButtonMe();
		this.jButtonCerrarDepreciaciones = new JButtonMe();
		
		this.jScrollPanelDatosDepreciaciones = new JScrollPane();   
        this.jScrollPanelDatosEdicionDepreciaciones = new JScrollPane();
		this.jScrollPanelDatosGeneralDepreciaciones = new JScrollPane();
				
		
		
		this.jPanelCamposDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Depreciaciones";
		
		if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosDepreciaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDepreciaciones.setName("jPanelCamposDepreciaciones"); 

		this.jPanelCamposOcultosDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDepreciaciones.setName("jPanelCamposOcultosDepreciaciones"); 

        this.jPanelAccionesDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDepreciaciones.setToolTipText("Acciones");
        this.jPanelAccionesDepreciaciones.setName("Acciones"); 

		this.jPanelAccionesFormularioDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDepreciaciones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDepreciaciones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDepreciaciones.setText("Nuevo");
		this.jButtonModificarDepreciaciones.setText("Editar");
        this.jButtonActualizarDepreciaciones.setText("Actualizar");
        this.jButtonEliminarDepreciaciones.setText("Eliminar");
        this.jButtonCancelarDepreciaciones.setText("Cancelar");
        this.jButtonGuardarCambiosDepreciaciones.setText("Guardar");
		this.jButtonGuardarCambiosTablaDepreciaciones.setText("Guardar");
		this.jButtonCerrarDepreciaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDepreciaciones,"nuevo_button","Nuevo",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDepreciaciones,"modificar_button","Editar",this.depreciacionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDepreciaciones,"actualizar_button","Actualizar",this.depreciacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDepreciaciones,"eliminar_button","Eliminar",this.depreciacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDepreciaciones,"cancelar_button","Cancelar",this.depreciacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDepreciaciones,"guardarcambios_button","Guardar",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDepreciaciones,"guardarcambiostabla_button","Guardar",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDepreciaciones,"cerrar_button","Salir",this.depreciacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDepreciaciones.setToolTipText("Nuevo"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDepreciaciones.setToolTipText("Editar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDepreciaciones.setToolTipText("Actualizar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDepreciaciones.setToolTipText("Eliminar)"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDepreciaciones.setToolTipText("Cancelar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDepreciaciones.setToolTipText("Guardar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDepreciaciones.setToolTipText("Guardar"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDepreciaciones.setToolTipText("Salir"+" "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDepreciaciones";
		inputMap = this.jButtonNuevoDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDepreciaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDepreciaciones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDepreciaciones";
		inputMap = this.jButtonActualizarDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDepreciaciones"));
		
		//ELIMINAR
		sMapKey = "EliminarDepreciaciones";
		inputMap = this.jButtonEliminarDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDepreciaciones"));
		
		//CANCELAR	
		sMapKey = "CancelarDepreciaciones";
		inputMap = this.jButtonCancelarDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDepreciaciones"));
		
		//CERRAR		
		sMapKey = "CerrarDepreciaciones";
		inputMap = this.jButtonCerrarDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDepreciaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDepreciaciones";
		inputMap = this.jButtonGuardarCambiosTablaDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDepreciaciones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDepreciaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDepreciaciones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDepreciaciones.setToolTipText("Nuevo Depreciaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDepreciaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDepreciaciones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDepreciaciones.setToolTipText("Sin Cerrar Ventana Depreciaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDepreciaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDepreciaciones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDepreciaciones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDepreciaciones.setText("Accion");
		this.jComboBoxTiposAccionesDepreciaciones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDepreciaciones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDepreciaciones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDepreciaciones = new JLabelMe();
		
		this.jLabelAccionesDepreciaciones.setText("Acciones");		
		this.jLabelAccionesDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDepreciaciones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDepreciaciones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDepreciaciones=new JTabbedPane();
		this.jTabbedPaneRelacionesDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDepreciaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepreciaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepreciaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDepreciaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDepreciaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDepreciaciones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDepreciaciones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDepreciaciones = new GridBagLayout();
		
		this.jPanelCamposDepreciaciones.setLayout(gridaBagLayoutCamposDepreciaciones);
		this.jPanelCamposOcultosDepreciaciones.setLayout(gridaBagLayoutCamposOcultosDepreciaciones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDepreciaciones.add(jLabelIdDepreciaciones, this.gridBagConstraintsDepreciaciones);



	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDepreciaciones.add(jLabelidDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDepreciaciones.add(jLabelid_empresaDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDepreciaciones.add(jButtonid_empresaDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 3;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDepreciaciones.add(jButtonid_empresaDepreciacionesUpdate, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDepreciaciones.add(jComboBoxid_empresaDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anio_inicioDepreciaciones.add(jLabelid_anio_inicioDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anio_inicioDepreciaciones.add(jButtonid_anio_inicioDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 3;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anio_inicioDepreciaciones.add(jButtonid_anio_inicioDepreciacionesUpdate, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anio_inicioDepreciaciones.add(jComboBoxid_anio_inicioDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anio_finDepreciaciones.add(jLabelid_anio_finDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anio_finDepreciaciones.add(jButtonid_anio_finDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 3;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anio_finDepreciaciones.add(jButtonid_anio_finDepreciacionesUpdate, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anio_finDepreciaciones.add(jComboBoxid_anio_finDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mes_inicioDepreciaciones.add(jLabelid_mes_inicioDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_inicioDepreciaciones.add(jButtonid_mes_inicioDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 3;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_inicioDepreciaciones.add(jButtonid_mes_inicioDepreciacionesUpdate, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mes_inicioDepreciaciones.add(jComboBoxid_mes_inicioDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mes_finDepreciaciones.add(jLabelid_mes_finDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_finDepreciaciones.add(jButtonid_mes_finDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 3;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_finDepreciaciones.add(jButtonid_mes_finDepreciacionesUpdate, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mes_finDepreciaciones.add(jComboBoxid_mes_finDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sub_grupoDepreciaciones.add(jLabelcodigo_sub_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sub_grupoDepreciaciones.add(jButtoncodigo_sub_grupoDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sub_grupoDepreciaciones.add(jTextFieldcodigo_sub_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sub_grupoDepreciaciones.add(jLabelnombre_sub_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sub_grupoDepreciaciones.add(jButtonnombre_sub_grupoDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sub_grupoDepreciaciones.add(jscrollPanenombre_sub_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_detalle_grupoDepreciaciones.add(jLabelcodigo_detalle_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_detalle_grupoDepreciaciones.add(jButtoncodigo_detalle_grupoDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_detalle_grupoDepreciaciones.add(jTextFieldcodigo_detalle_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_detalle_grupoDepreciaciones.add(jLabelnombre_detalle_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_detalle_grupoDepreciaciones.add(jButtonnombre_detalle_grupoDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_detalle_grupoDepreciaciones.add(jscrollPanenombre_detalle_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveDepreciaciones.add(jLabelclaveDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveDepreciaciones.add(jButtonclaveDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveDepreciaciones.add(jTextFieldclaveDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDepreciaciones.add(jLabelnombreDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDepreciaciones.add(jButtonnombreDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDepreciaciones.add(jscrollPanenombreDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_compraDepreciaciones.add(jLabelfecha_compraDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_compraDepreciaciones.add(jButtonfecha_compraDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_compraDepreciaciones.add(jDateChooserfecha_compraDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvida_utilDepreciaciones.add(jLabelvida_utilDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelvida_utilDepreciaciones.add(jButtonvida_utilDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvida_utilDepreciaciones.add(jTextFieldvida_utilDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_de_compraDepreciaciones.add(jLabelcosto_de_compraDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_de_compraDepreciaciones.add(jButtoncosto_de_compraDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_de_compraDepreciaciones.add(jTextFieldcosto_de_compraDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_mantenimientoDepreciaciones.add(jLabelfecha_mantenimientoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_mantenimientoDepreciaciones.add(jButtonfecha_mantenimientoDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_mantenimientoDepreciaciones.add(jDateChooserfecha_mantenimientoDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_depreciacionDepreciaciones.add(jLabelfecha_depreciacionDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_depreciacionDepreciaciones.add(jButtonfecha_depreciacionDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_depreciacionDepreciaciones.add(jDateChooserfecha_depreciacionDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDepreciaciones.add(jLabelid_anioDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDepreciaciones.add(jButtonid_anioDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 3;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDepreciaciones.add(jButtonid_anioDepreciacionesUpdate, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDepreciaciones.add(jComboBoxid_anioDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDepreciaciones.add(jLabelid_mesDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDepreciaciones.add(jButtonid_mesDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 3;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDepreciaciones.add(jButtonid_mesDepreciacionesUpdate, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDepreciaciones.add(jComboBoxid_mesDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_acumuladoDepreciaciones.add(jLabelvalor_acumuladoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_acumuladoDepreciaciones.add(jButtonvalor_acumuladoDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_acumuladoDepreciaciones.add(jTextFieldvalor_acumuladoDepreciaciones, this.gridBagConstraintsDepreciaciones);


	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 0;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_gastoDepreciaciones.add(jLabelvalor_gastoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = 2;
		this.gridBagConstraintsDepreciaciones.ipadx = 0;
		this.gridBagConstraintsDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_gastoDepreciaciones.add(jButtonvalor_gastoDepreciacionesBusqueda, this.gridBagConstraintsDepreciaciones);
	}

	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciaciones.gridy = 0;
	this.gridBagConstraintsDepreciaciones.gridx = 1;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_gastoDepreciaciones.add(jTextFieldvalor_gastoDepreciaciones, this.gridBagConstraintsDepreciaciones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelidDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelid_anio_inicioDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelid_anio_finDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelid_mes_inicioDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelid_mes_finDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelcodigo_sub_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelnombre_sub_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelcodigo_detalle_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelnombre_detalle_grupoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelclaveDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelnombreDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelfecha_compraDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelvida_utilDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelcosto_de_compraDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelfecha_mantenimientoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelfecha_depreciacionDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelid_anioDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelid_mesDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelvalor_acumuladoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciaciones.add(this.jPanelvalor_gastoDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposDepreciaciones % 2==0) {
		iXPanelCamposDepreciaciones=0;
		iYPanelCamposDepreciaciones++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciaciones.gridy = iYPanelCamposOcultosDepreciaciones;
	this.gridBagConstraintsDepreciaciones.gridx = iXPanelCamposOcultosDepreciaciones++;
	this.gridBagConstraintsDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDepreciaciones.add(this.jPanelid_empresaDepreciaciones, this.gridBagConstraintsDepreciaciones);



	if(iXPanelCamposOcultosDepreciaciones % 2==0) {
		iXPanelCamposOcultosDepreciaciones=0;
		iYPanelCamposOcultosDepreciaciones++;
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
			
		GridBagLayout gridaBagLayoutAccionesDepreciaciones= new GridBagLayout();
		this.jPanelAccionesDepreciaciones.setLayout(gridaBagLayoutAccionesDepreciaciones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDepreciaciones= new GridBagLayout();
		this.jPanelAccionesFormularioDepreciaciones.setLayout(gridaBagLayoutAccionesFormularioDepreciaciones);
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDepreciaciones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDepreciaciones.add(this.jComboBoxTiposAccionesFormularioDepreciaciones, this.gridBagConstraintsDepreciaciones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx = iPosXAccion++;
			
		this.jPanelAccionesDepreciaciones.add(this.jButtonModificarDepreciaciones, this.gridBagConstraintsDepreciaciones);							

		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciaciones.gridy = 0;
		this.gridBagConstraintsDepreciaciones.gridx =iPosXAccion++;
			
		this.jPanelAccionesDepreciaciones.add(this.jButtonEliminarDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
			
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = 0;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesDepreciaciones.add(this.jButtonActualizarDepreciaciones, this.gridBagConstraintsDepreciaciones);


		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = 0;		
		this.gridBagConstraintsDepreciaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesDepreciaciones.add(this.jButtonGuardarCambiosDepreciaciones, this.gridBagConstraintsDepreciaciones);	
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = 0;		
		this.gridBagConstraintsDepreciaciones.gridx =iPosXAccion++;
		
		this.jPanelAccionesDepreciaciones.add(this.jButtonCancelarDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDepreciaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDepreciaciones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();						
			this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDepreciaciones.gridx = 0;		
			//this.gridBagConstraintsDepreciaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDepreciaciones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDepreciaciones.gridx =0;
		this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDepreciaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDepreciaciones, this.gridBagConstraintsDepreciaciones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DepreciacionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDepreciaciones = new DepreciacionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Depreciaciones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Depreciaciones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Depreciaciones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DepreciacionesModel depreciacionesModel=new DepreciacionesModel(this);
			
			//SI USARA CLASE INTERNA
			//DepreciacionesModel.DepreciacionesFocusTraversalPolicy depreciacionesFocusTraversalPolicy = depreciacionesModel.new DepreciacionesFocusTraversalPolicy(this);
			
			//depreciacionesFocusTraversalPolicy.setdepreciacionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(depreciacionesModel);
			
			
			this.jContentPaneDetalleDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDepreciaciones = new GridBagLayout();	
			this.jContentPaneDetalleDepreciaciones.setLayout(gridaBagLayoutDetalleDepreciaciones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDepreciaciones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
				this.gridBagConstraintsDepreciaciones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDepreciaciones.gridx = 0;
					
				
				this.jContentPaneDetalleDepreciaciones.add(jTtoolBarDetalleDepreciaciones, gridBagConstraintsDepreciaciones);								
				
}
			
			this.jScrollPanelDatosEdicionDepreciaciones=   new JScrollPane(jContentPaneDetalleDepreciaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDepreciaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepreciaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepreciaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDepreciaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDepreciaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepreciaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepreciaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDepreciaciones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDepreciaciones.gridx = 0;
	        
			this.jContentPaneDetalleDepreciaciones.add(jPanelCamposDepreciaciones, gridBagConstraintsDepreciaciones);
			
			
			
			
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
						//&& depreciacionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.depreciacionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDepreciaciones= new GridBagConstraints();
						this.gridBagConstraintsDepreciaciones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDepreciaciones.gridx = 0;
						this.jContentPaneDetalleDepreciaciones.add(this.jTabbedPaneRelacionesDepreciaciones, this.gridBagConstraintsDepreciaciones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDepreciaciones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDepreciaciones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
					this.gridBagConstraintsDepreciaciones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDepreciaciones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDepreciaciones.gridx = 0;
					
				
					this.jContentPaneDetalleDepreciaciones.add(jPanelCamposOcultosDepreciaciones, gridBagConstraintsDepreciaciones);
				
					this.jPanelCamposOcultosDepreciaciones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDepreciaciones.gridx = 0;
	        this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDepreciaciones.add(this.jPanelAccionesFormularioDepreciaciones, this.gridBagConstraintsDepreciaciones);							
			
			
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
	        this.gridBagConstraintsDepreciaciones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDepreciaciones.gridx = 0;
	        
			
			this.jContentPaneDetalleDepreciaciones.add(this.jPanelAccionesDepreciaciones, this.gridBagConstraintsDepreciaciones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDepreciaciones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDepreciaciones=   new JScrollPane(this.jPanelCamposDepreciaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDepreciaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepreciaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepreciaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDepreciaciones.gridx = 0;
			this.gridBagConstraintsDepreciaciones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDepreciaciones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDepreciaciones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDepreciaciones, this.gridBagConstraintsDepreciaciones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDepreciaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDepreciaciones, this.gridBagConstraintsDepreciaciones);			
			
			this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsDepreciaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDepreciaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDepreciaciones, this.gridBagConstraintsDepreciaciones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDepreciaciones, this.gridBagConstraintsDepreciaciones);
			
			
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDepreciaciones, this.gridBagConstraintsDepreciaciones);
		
			
		this.gridBagConstraintsDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsDepreciaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDepreciaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDepreciaciones, this.gridBagConstraintsDepreciaciones);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDepreciaciones;//jContentPane;
		
		return jScrollPanelDatosEdicionDepreciaciones;
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
