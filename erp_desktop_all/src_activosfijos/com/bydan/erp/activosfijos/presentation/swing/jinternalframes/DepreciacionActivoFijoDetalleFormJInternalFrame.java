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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.DepreciacionActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class DepreciacionActivoFijoDetalleFormJInternalFrame extends DepreciacionActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDepreciacionActivoFijo;
	
	protected JMenuBar jmenuBarDetalleDepreciacionActivoFijo;
	
	protected JMenu jmenuDetalleDepreciacionActivoFijo;
	protected JMenu jmenuDetalleArchivoDepreciacionActivoFijo;
	protected JMenu jmenuDetalleAccionesDepreciacionActivoFijo;
	protected JMenu jmenuDetalleDatosDepreciacionActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDepreciacionActivoFijo;	
	protected GridBagConstraints gridBagConstraintsDepreciacionActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DepreciacionActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDepreciacionActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected TipoDepreciacionEmpresaBeanSwingJInternalFrame tipodepreciacionempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodepreciacionempresa="";

	protected EstadoDepreActiBeanSwingJInternalFrame estadodepreactiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodepreacti="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DepreciacionActivoFijoSessionBean depreciacionactivofijoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public TipoDepreciacionEmpresaSessionBean tipodepreciacionempresaSessionBean;
	public EstadoDepreActiSessionBean estadodepreactiSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public DepreciacionActivoFijoLogic depreciacionactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosDepreciacionActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionDepreciacionActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralDepreciacionActivoFijo;
	
	protected JPanel jPanelCamposDepreciacionActivoFijo;    
	protected JPanel jPanelCamposOcultosDepreciacionActivoFijo;    	
	protected JPanel jPanelAccionesDepreciacionActivoFijo;
	protected JPanel jPanelAccionesFormularioDepreciacionActivoFijo;
    
	
	
	protected Integer iXPanelCamposDepreciacionActivoFijo=0;
	protected Integer iYPanelCamposDepreciacionActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosDepreciacionActivoFijo=0;
	protected Integer iYPanelCamposOcultosDepreciacionActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDepreciacionActivoFijo;
	public JButton jButtonModificarDepreciacionActivoFijo;
	public JButton jButtonActualizarDepreciacionActivoFijo;
    public JButton jButtonEliminarDepreciacionActivoFijo;
	public JButton jButtonCancelarDepreciacionActivoFijo;
    public JButton jButtonGuardarCambiosDepreciacionActivoFijo;
	public JButton jButtonGuardarCambiosTablaDepreciacionActivoFijo;
	protected JButton jButtonCerrarDepreciacionActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionDepreciacionActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDepreciacionActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDepreciacionActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDepreciacionActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDepreciacionActivoFijo;
	protected JButton jButtonModificarToolBarDepreciacionActivoFijo;
	protected JButton jButtonActualizarToolBarDepreciacionActivoFijo;
    protected JButton jButtonEliminarToolBarDepreciacionActivoFijo;
	protected JButton jButtonCancelarToolBarDepreciacionActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarDepreciacionActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarDepreciacionActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarDepreciacionActivoFijo;
	protected JButton jButtonCerrarToolBarDepreciacionActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarDepreciacionActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDepreciacionActivoFijo;
	protected JMenuItem jMenuItemModificarDepreciacionActivoFijo;
	protected JMenuItem jMenuItemActualizarDepreciacionActivoFijo;
    protected JMenuItem jMenuItemEliminarDepreciacionActivoFijo;
	protected JMenuItem jMenuItemCancelarDepreciacionActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosDepreciacionActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaDepreciacionActivoFijo;
	protected JMenuItem jMenuItemCerrarDepreciacionActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarDepreciacionActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarDepreciacionActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionDepreciacionActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDepreciacionActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarDepreciacionActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDepreciacionActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDepreciacionActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDepreciacionActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDepreciacionActivoFijo;
	public JLabel jLabelIdDepreciacionActivoFijo;
	public JLabel jLabelidDepreciacionActivoFijo;
	public JButton jButtonidDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_compraDepreciacionActivoFijo;
	public JLabel jLabelfecha_compraDepreciacionActivoFijo;
	//public JFormattedTextField jDateChooserfecha_compraDepreciacionActivoFijo;

	public JDateChooser jDateChooserfecha_compraDepreciacionActivoFijo;
	public JButton jButtonfecha_compraDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_depre_actiDepreciacionActivoFijo;
	public JLabel jLabelfecha_depre_actiDepreciacionActivoFijo;
	//public JFormattedTextField jDateChooserfecha_depre_actiDepreciacionActivoFijo;

	public JDateChooser jDateChooserfecha_depre_actiDepreciacionActivoFijo;
	public JButton jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeDepreciacionActivoFijo;
	public JLabel jLabelporcentajeDepreciacionActivoFijo;
	public JTextField jTextFieldporcentajeDepreciacionActivoFijo;
	public JButton jButtonporcentajeDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcostoDepreciacionActivoFijo;
	public JLabel jLabelcostoDepreciacionActivoFijo;
	public JTextField jTextFieldcostoDepreciacionActivoFijo;
	public JButton jButtoncostoDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_acumuladoDepreciacionActivoFijo;
	public JLabel jLabelvalor_acumuladoDepreciacionActivoFijo;
	public JTextField jTextFieldvalor_acumuladoDepreciacionActivoFijo;
	public JButton jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_totalDepreciacionActivoFijo;
	public JLabel jLabelvalor_totalDepreciacionActivoFijo;
	public JTextField jTextFieldvalor_totalDepreciacionActivoFijo;
	public JButton jButtonvalor_totalDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_gastoDepreciacionActivoFijo;
	public JLabel jLabelvalor_gastoDepreciacionActivoFijo;
	public JTextField jTextFieldvalor_gastoDepreciacionActivoFijo;
	public JButton jButtonvalor_gastoDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfechaDepreciacionActivoFijo;
	public JLabel jLabelfechaDepreciacionActivoFijo;
	//public JFormattedTextField jDateChooserfechaDepreciacionActivoFijo;

	public JDateChooser jDateChooserfechaDepreciacionActivoFijo;
	public JButton jButtonfechaDepreciacionActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDepreciacionActivoFijo;
	public JLabel jLabelid_empresaDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDepreciacionActivoFijo;
	public JButton jButtonid_empresaDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDepreciacionActivoFijo;
	public JLabel jLabelid_sucursalDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDepreciacionActivoFijo;
	public JButton jButtonid_sucursalDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_sucursalDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_activo_fijoDepreciacionActivoFijo;
	public JLabel jLabelid_detalle_activo_fijoDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo;
	public JButton jButtonid_detalle_activo_fijoDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_depreciacion_empresaDepreciacionActivoFijo;
	public JLabel jLabelid_tipo_depreciacion_empresaDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo;
	public JButton jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_depre_actiDepreciacionActivoFijo;
	public JLabel jLabelid_estado_depre_actiDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_depre_actiDepreciacionActivoFijo;
	public JButton jButtonid_estado_depre_actiDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDepreciacionActivoFijo;
	public JLabel jLabelid_anioDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDepreciacionActivoFijo;
	public JButton jButtonid_anioDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_anioDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_anioDepreciacionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDepreciacionActivoFijo;
	public JLabel jLabelid_mesDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDepreciacionActivoFijo;
	public JButton jButtonid_mesDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_mesDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_mesDepreciacionActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDepreciacionActivoFijo;
	
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
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DepreciacionActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDepreciacionActivoFijo=new JPanel();
				this.jPanelAccionesFormularioDepreciacionActivoFijo=new JPanel();
				this.jmenuBarDetalleDepreciacionActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleDepreciacionActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DepreciacionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DepreciacionActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DepreciacionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DepreciacionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DepreciacionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DepreciacionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDepreciacionActivoFijo() {
		return this.jButtonActualizarToolBarDepreciacionActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarDepreciacionActivoFijo() {
		return this.jButtonEliminarToolBarDepreciacionActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarDepreciacionActivoFijo() {
		return this.jButtonCancelarToolBarDepreciacionActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionDepreciacionActivoFijo() {
		return this.jButtonProcesarInformacionDepreciacionActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDepreciacionActivoFijo)	{
		this.jButtonProcesarInformacionDepreciacionActivoFijo = jButtonProcesarInformacionDepreciacionActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDepreciacionActivoFijo() {
		return this.jComboBoxTiposAccionesDepreciacionActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDepreciacionActivoFijo(
			JComboBox jComboBoxTiposRelacionesDepreciacionActivoFijo) {
		this.jComboBoxTiposRelacionesDepreciacionActivoFijo = jComboBoxTiposRelacionesDepreciacionActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDepreciacionActivoFijo(
			JComboBox jComboBoxTiposAccionesDepreciacionActivoFijo) {
		this.jComboBoxTiposAccionesDepreciacionActivoFijo = jComboBoxTiposAccionesDepreciacionActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDepreciacionActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDepreciacionActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioDepreciacionActivoFijo) {
		this.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo = jComboBoxTiposAccionesFormularioDepreciacionActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		
		this.depreciacionactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DepreciacionActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Depreciacion Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDepreciacionActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDepreciacionActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarDepreciacionActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDepreciacionActivoFijo,this.jTtoolBarDetalleDepreciacionActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDepreciacionActivoFijo,this.jTtoolBarDetalleDepreciacionActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDepreciacionActivoFijo,this.jTtoolBarDetalleDepreciacionActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDepreciacionActivoFijo,this.jTtoolBarDetalleDepreciacionActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDepreciacionActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDepreciacionActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDepreciacionActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDepreciacionActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDepreciacionActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDepreciacionActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDepreciacionActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDepreciacionActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDepreciacionActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDepreciacionActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDepreciacionActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDepreciacionActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDepreciacionActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDepreciacionActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDepreciacionActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDepreciacionActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDepreciacionActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDepreciacionActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDepreciacionActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDepreciacionActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDepreciacionActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDepreciacionActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDepreciacionActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDepreciacionActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDepreciacionActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDepreciacionActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDepreciacionActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDepreciacionActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDepreciacionActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDepreciacionActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDepreciacionActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDepreciacionActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDepreciacionActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDepreciacionActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDepreciacionActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDepreciacionActivoFijo.add(this.jMenuItemDetalleCerrarDepreciacionActivoFijo);
		
		this.jmenuDetalleAccionesDepreciacionActivoFijo.add(this.jMenuItemActualizarDepreciacionActivoFijo);
		this.jmenuDetalleAccionesDepreciacionActivoFijo.add(this.jMenuItemEliminarDepreciacionActivoFijo);
		this.jmenuDetalleAccionesDepreciacionActivoFijo.add(this.jMenuItemCancelarDepreciacionActivoFijo);		
		
		//this.jmenuDetalleDatosDepreciacionActivoFijo.add(this.jMenuItemDetalleAbrirOrderByDepreciacionActivoFijo);				
		this.jmenuDetalleDatosDepreciacionActivoFijo.add(this.jMenuItemDetalleMostarOcultarDepreciacionActivoFijo);				
				
		//this.jmenuDetalleAccionesDepreciacionActivoFijo.add(this.jMenuItemGuardarCambiosDepreciacionActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDepreciacionActivoFijo.add(this.jmenuDetalleArchivoDepreciacionActivoFijo);		
		this.jmenuBarDetalleDepreciacionActivoFijo.add(this.jmenuDetalleAccionesDepreciacionActivoFijo);		
		this.jmenuBarDetalleDepreciacionActivoFijo.add(this.jmenuDetalleDatosDepreciacionActivoFijo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDepreciacionActivoFijo);				
	}
	
	
	public void inicializarElementosCamposDepreciacionActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDepreciacionActivoFijo = new JLabelMe();
		jLabelIdDepreciacionActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDepreciacionActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDepreciacionActivoFijo= new GridBagLayout();

		this.jPanelidDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);

		jLabelidDepreciacionActivoFijo = new JLabel();
		jLabelidDepreciacionActivoFijo.setText("Id");

		jLabelidDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_compraDepreciacionActivoFijo = new JLabelMe();
		this.jLabelfecha_compraDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA+" : *");
		this.jLabelfecha_compraDepreciacionActivoFijo.setToolTipText("Fecha Compra");
		this.jLabelfecha_compraDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_compraDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_compraDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelfecha_compraDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		//jFormattedTextFieldfecha_compraDepreciacionActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfecha_compraDepreciacionActivoFijo= new JDateChooser();
		jDateChooserfecha_compraDepreciacionActivoFijo.setEnabled(false);
		jDateChooserfecha_compraDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_compraDepreciacionActivoFijo.setDate(new Date());
		jDateChooserfecha_compraDepreciacionActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_compraDepreciacionActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_compraDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonfecha_compraDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_compraDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonfecha_compraDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_compraDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_compraDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_compraDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_compraDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_compraDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_compraDepreciacionActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_depre_actiDepreciacionActivoFijo = new JLabelMe();
		this.jLabelfecha_depre_actiDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI+" : *");
		this.jLabelfecha_depre_actiDepreciacionActivoFijo.setToolTipText("Fecha Depre Acti");
		this.jLabelfecha_depre_actiDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_depre_actiDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_depre_actiDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_depre_actiDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_depre_actiDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_depre_actiDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelfecha_depre_actiDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		//jFormattedTextFieldfecha_depre_actiDepreciacionActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfecha_depre_actiDepreciacionActivoFijo= new JDateChooser();
		jDateChooserfecha_depre_actiDepreciacionActivoFijo.setEnabled(false);
		jDateChooserfecha_depre_actiDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_depre_actiDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_depre_actiDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_depre_actiDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_depre_actiDepreciacionActivoFijo.setDate(new Date());
		jDateChooserfecha_depre_actiDepreciacionActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_depre_actiDepreciacionActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_depre_actiDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_depre_actiDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_depre_actiDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeDepreciacionActivoFijo = new JLabelMe();
		this.jLabelporcentajeDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeDepreciacionActivoFijo.setToolTipText("Porcentaje");
		this.jLabelporcentajeDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelporcentajeDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jTextFieldporcentajeDepreciacionActivoFijo= new JTextFieldMe();
		jTextFieldporcentajeDepreciacionActivoFijo.setEnabled(false);
		jTextFieldporcentajeDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeDepreciacionActivoFijo.setText("0.0");

		this.jButtonporcentajeDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonporcentajeDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonporcentajeDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeDepreciacionActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcostoDepreciacionActivoFijo = new JLabelMe();
		this.jLabelcostoDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoDepreciacionActivoFijo.setToolTipText("Costo");
		this.jLabelcostoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelcostoDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jTextFieldcostoDepreciacionActivoFijo= new JTextFieldMe();
		jTextFieldcostoDepreciacionActivoFijo.setEnabled(false);
		jTextFieldcostoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoDepreciacionActivoFijo.setText("0.0");

		this.jButtoncostoDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtoncostoDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtoncostoDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoDepreciacionActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_acumuladoDepreciacionActivoFijo = new JLabelMe();
		this.jLabelvalor_acumuladoDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO+" : *");
		this.jLabelvalor_acumuladoDepreciacionActivoFijo.setToolTipText("Valor Acumulado");
		this.jLabelvalor_acumuladoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_acumuladoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_acumuladoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_acumuladoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_acumuladoDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_acumuladoDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelvalor_acumuladoDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jTextFieldvalor_acumuladoDepreciacionActivoFijo= new JTextFieldMe();
		jTextFieldvalor_acumuladoDepreciacionActivoFijo.setEnabled(false);
		jTextFieldvalor_acumuladoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_acumuladoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_acumuladoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_acumuladoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_acumuladoDepreciacionActivoFijo.setText("0.0");

		this.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_acumuladoDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_acumuladoDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_acumuladoDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_totalDepreciacionActivoFijo = new JLabelMe();
		this.jLabelvalor_totalDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL+" : *");
		this.jLabelvalor_totalDepreciacionActivoFijo.setToolTipText("Valor Total");
		this.jLabelvalor_totalDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_totalDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_totalDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_totalDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelvalor_totalDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jTextFieldvalor_totalDepreciacionActivoFijo= new JTextFieldMe();
		jTextFieldvalor_totalDepreciacionActivoFijo.setEnabled(false);
		jTextFieldvalor_totalDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_totalDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_totalDepreciacionActivoFijo.setText("0.0");

		this.jButtonvalor_totalDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonvalor_totalDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_totalDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonvalor_totalDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_totalDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_totalDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_totalDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_totalDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_totalDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_totalDepreciacionActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_gastoDepreciacionActivoFijo = new JLabelMe();
		this.jLabelvalor_gastoDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO+" : *");
		this.jLabelvalor_gastoDepreciacionActivoFijo.setToolTipText("Valor Gasto");
		this.jLabelvalor_gastoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_gastoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_gastoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_gastoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_gastoDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_gastoDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelvalor_gastoDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jTextFieldvalor_gastoDepreciacionActivoFijo= new JTextFieldMe();
		jTextFieldvalor_gastoDepreciacionActivoFijo.setEnabled(false);
		jTextFieldvalor_gastoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_gastoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_gastoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_gastoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_gastoDepreciacionActivoFijo.setText("0.0");

		this.jButtonvalor_gastoDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonvalor_gastoDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_gastoDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_gastoDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_gastoDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonvalor_gastoDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_gastoDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_gastoDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_gastoDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_gastoDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_gastoDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_gastoDepreciacionActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfechaDepreciacionActivoFijo = new JLabelMe();
		this.jLabelfechaDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDepreciacionActivoFijo.setToolTipText("Fecha");
		this.jLabelfechaDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelfechaDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		//jFormattedTextFieldfechaDepreciacionActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfechaDepreciacionActivoFijo= new JDateChooser();
		jDateChooserfechaDepreciacionActivoFijo.setEnabled(false);
		jDateChooserfechaDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDepreciacionActivoFijo.setDate(new Date());
		jDateChooserfechaDepreciacionActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDepreciacionActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonfechaDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonfechaDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDepreciacionActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDepreciacionActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDepreciacionActivoFijo = new JLabelMe();
		this.jLabelid_empresaDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDepreciacionActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelid_empresaDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jComboBoxid_empresaDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDepreciacionActivoFijo.setEnabled(false);

		this.jButtonid_empresaDepreciacionActivoFijo= new JButtonMe();
		this.jButtonid_empresaDepreciacionActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDepreciacionActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDepreciacionActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDepreciacionActivoFijo.setText("Buscar");
		this.jButtonid_empresaDepreciacionActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDepreciacionActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDepreciacionActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDepreciacionActivoFijo"));

		this.jButtonid_empresaDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDepreciacionActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDepreciacionActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaDepreciacionActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepreciacionActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepreciacionActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDepreciacionActivoFijoUpdate.setText("U");
		this.jButtonid_empresaDepreciacionActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDepreciacionActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDepreciacionActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDepreciacionActivoFijoUpdate"));



					
		this.jLabelid_sucursalDepreciacionActivoFijo = new JLabelMe();
		this.jLabelid_sucursalDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDepreciacionActivoFijo.setToolTipText("Sucursal");
		this.jLabelid_sucursalDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelid_sucursalDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jComboBoxid_sucursalDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_sucursalDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDepreciacionActivoFijo.setEnabled(false);

		this.jButtonid_sucursalDepreciacionActivoFijo= new JButtonMe();
		this.jButtonid_sucursalDepreciacionActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDepreciacionActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDepreciacionActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDepreciacionActivoFijo.setText("Buscar");
		this.jButtonid_sucursalDepreciacionActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDepreciacionActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDepreciacionActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDepreciacionActivoFijo"));

		this.jButtonid_sucursalDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_sucursalDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonid_sucursalDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDepreciacionActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDepreciacionActivoFijoUpdate= new JButtonMe();
		this.jButtonid_sucursalDepreciacionActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDepreciacionActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDepreciacionActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDepreciacionActivoFijoUpdate.setText("U");
		this.jButtonid_sucursalDepreciacionActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDepreciacionActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDepreciacionActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDepreciacionActivoFijoUpdate"));



					
		this.jLabelid_detalle_activo_fijoDepreciacionActivoFijo = new JLabelMe();
		this.jLabelid_detalle_activo_fijoDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO+" : *");
		this.jLabelid_detalle_activo_fijoDepreciacionActivoFijo.setToolTipText("Detalle Activo Fijo");
		this.jLabelid_detalle_activo_fijoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_activo_fijoDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_activo_fijoDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelid_detalle_activo_fijoDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijo= new JButtonMe();
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijo.setText("Buscar");
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoDepreciacionActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoDepreciacionActivoFijo"));

		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate= new JButtonMe();
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate.setText("U");
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoDepreciacionActivoFijoUpdate"));



					
		this.jLabelid_tipo_depreciacion_empresaDepreciacionActivoFijo = new JLabelMe();
		this.jLabelid_tipo_depreciacion_empresaDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA+" : *");
		this.jLabelid_tipo_depreciacion_empresaDepreciacionActivoFijo.setToolTipText("Tipo Depreciacion Empresa");
		this.jLabelid_tipo_depreciacion_empresaDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_depreciacion_empresaDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_depreciacion_empresaDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_depreciacion_empresaDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_depreciacion_empresaDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_depreciacion_empresaDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelid_tipo_depreciacion_empresaDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijo= new JButtonMe();
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijo.setText("Buscar");
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_depreciacion_empresaDepreciacionActivoFijo"));

		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate= new JButtonMe();
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate.setText("U");
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate"));



					
		this.jLabelid_estado_depre_actiDepreciacionActivoFijo = new JLabelMe();
		this.jLabelid_estado_depre_actiDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI+" : *");
		this.jLabelid_estado_depre_actiDepreciacionActivoFijo.setToolTipText("Estado Depre Acti");
		this.jLabelid_estado_depre_actiDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_depre_actiDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_depre_actiDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_depre_actiDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_depre_actiDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_depre_actiDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelid_estado_depre_actiDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jComboBoxid_estado_depre_actiDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_depre_actiDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_depre_actiDepreciacionActivoFijo= new JButtonMe();
		this.jButtonid_estado_depre_actiDepreciacionActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_depre_actiDepreciacionActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_depre_actiDepreciacionActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_depre_actiDepreciacionActivoFijo.setText("Buscar");
		this.jButtonid_estado_depre_actiDepreciacionActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_depre_actiDepreciacionActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_depre_actiDepreciacionActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_depre_actiDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_depre_actiDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_depre_actiDepreciacionActivoFijo"));

		this.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_depre_actiDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_depre_actiDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_depre_actiDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate= new JButtonMe();
		this.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate.setText("U");
		this.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_depre_actiDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_depre_actiDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_depre_actiDepreciacionActivoFijoUpdate"));



					
		this.jLabelid_anioDepreciacionActivoFijo = new JLabelMe();
		this.jLabelid_anioDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDepreciacionActivoFijo.setToolTipText("Anio");
		this.jLabelid_anioDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelid_anioDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jComboBoxid_anioDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_anioDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioDepreciacionActivoFijo= new JButtonMe();
		this.jButtonid_anioDepreciacionActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDepreciacionActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDepreciacionActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDepreciacionActivoFijo.setText("Buscar");
		this.jButtonid_anioDepreciacionActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDepreciacionActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDepreciacionActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDepreciacionActivoFijo"));

		this.jButtonid_anioDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_anioDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonid_anioDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDepreciacionActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_anioDepreciacionActivoFijoUpdate= new JButtonMe();
		this.jButtonid_anioDepreciacionActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDepreciacionActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDepreciacionActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDepreciacionActivoFijoUpdate.setText("U");
		this.jButtonid_anioDepreciacionActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDepreciacionActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDepreciacionActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDepreciacionActivoFijoUpdate"));



					
		this.jLabelid_mesDepreciacionActivoFijo = new JLabelMe();
		this.jLabelid_mesDepreciacionActivoFijo.setText(""+DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDepreciacionActivoFijo.setToolTipText("Mes");
		this.jLabelid_mesDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDepreciacionActivoFijo.setToolTipText(DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		this.jPanelid_mesDepreciacionActivoFijo.setLayout(this.gridaBagLayoutDepreciacionActivoFijo);


		jComboBoxid_mesDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_mesDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesDepreciacionActivoFijo= new JButtonMe();
		this.jButtonid_mesDepreciacionActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDepreciacionActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDepreciacionActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDepreciacionActivoFijo.setText("Buscar");
		this.jButtonid_mesDepreciacionActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDepreciacionActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDepreciacionActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDepreciacionActivoFijo"));

		this.jButtonid_mesDepreciacionActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_mesDepreciacionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDepreciacionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDepreciacionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDepreciacionActivoFijoBusqueda.setText("U");
		this.jButtonid_mesDepreciacionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDepreciacionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDepreciacionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDepreciacionActivoFijoBusqueda"));

		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDepreciacionActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_mesDepreciacionActivoFijoUpdate= new JButtonMe();
		this.jButtonid_mesDepreciacionActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDepreciacionActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDepreciacionActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDepreciacionActivoFijoUpdate.setText("U");
		this.jButtonid_mesDepreciacionActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDepreciacionActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDepreciacionActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDepreciacionActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleDepreciacionActivoFijo = new DepreciacionActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Depreciacion Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDepreciacionActivoFijo= new GridBagLayout();
		

		
		String sToolTipDepreciacionActivoFijo="";
		sToolTipDepreciacionActivoFijo=DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDepreciacionActivoFijo+="(ActivosFijos.DepreciacionActivoFijo)";
		}
		
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDepreciacionActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDepreciacionActivoFijo = new JButtonMe();
		this.jButtonModificarDepreciacionActivoFijo = new JButtonMe();
        this.jButtonActualizarDepreciacionActivoFijo = new JButtonMe();
        this.jButtonEliminarDepreciacionActivoFijo = new JButtonMe();
        this.jButtonCancelarDepreciacionActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosDepreciacionActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaDepreciacionActivoFijo = new JButtonMe();
		this.jButtonCerrarDepreciacionActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosDepreciacionActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionDepreciacionActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralDepreciacionActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Depreciacion Activo Fijo";
		
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacion Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosDepreciacionActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDepreciacionActivoFijo.setName("jPanelCamposDepreciacionActivoFijo"); 

		this.jPanelCamposOcultosDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDepreciacionActivoFijo.setName("jPanelCamposOcultosDepreciacionActivoFijo"); 

        this.jPanelAccionesDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDepreciacionActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesDepreciacionActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDepreciacionActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDepreciacionActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDepreciacionActivoFijo.setText("Nuevo");
		this.jButtonModificarDepreciacionActivoFijo.setText("Editar");
        this.jButtonActualizarDepreciacionActivoFijo.setText("Actualizar");
        this.jButtonEliminarDepreciacionActivoFijo.setText("Eliminar");
        this.jButtonCancelarDepreciacionActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosDepreciacionActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.setText("Guardar");
		this.jButtonCerrarDepreciacionActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDepreciacionActivoFijo,"nuevo_button","Nuevo",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDepreciacionActivoFijo,"modificar_button","Editar",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDepreciacionActivoFijo,"actualizar_button","Actualizar",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDepreciacionActivoFijo,"eliminar_button","Eliminar",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDepreciacionActivoFijo,"cancelar_button","Cancelar",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDepreciacionActivoFijo,"guardarcambios_button","Guardar",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDepreciacionActivoFijo,"guardarcambiostabla_button","Guardar",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDepreciacionActivoFijo,"cerrar_button","Salir",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDepreciacionActivoFijo.setToolTipText("Nuevo"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDepreciacionActivoFijo.setToolTipText("Editar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDepreciacionActivoFijo.setToolTipText("Actualizar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDepreciacionActivoFijo.setToolTipText("Eliminar)"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDepreciacionActivoFijo.setToolTipText("Cancelar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDepreciacionActivoFijo.setToolTipText("Guardar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.setToolTipText("Guardar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDepreciacionActivoFijo.setToolTipText("Salir"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDepreciacionActivoFijo";
		inputMap = this.jButtonNuevoDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDepreciacionActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDepreciacionActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDepreciacionActivoFijo";
		inputMap = this.jButtonActualizarDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDepreciacionActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarDepreciacionActivoFijo";
		inputMap = this.jButtonEliminarDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDepreciacionActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarDepreciacionActivoFijo";
		inputMap = this.jButtonCancelarDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDepreciacionActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarDepreciacionActivoFijo";
		inputMap = this.jButtonCerrarDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDepreciacionActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDepreciacionActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDepreciacionActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDepreciacionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDepreciacionActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDepreciacionActivoFijo.setToolTipText("Nuevo DepreciacionActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDepreciacionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDepreciacionActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDepreciacionActivoFijo.setToolTipText("Sin Cerrar Ventana DepreciacionActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDepreciacionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDepreciacionActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDepreciacionActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDepreciacionActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesDepreciacionActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDepreciacionActivoFijo = new JLabelMe();
		
		this.jLabelAccionesDepreciacionActivoFijo.setText("Acciones");		
		this.jLabelAccionesDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDepreciacionActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDepreciacionActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDepreciacionActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDepreciacionActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepreciacionActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepreciacionActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDepreciacionActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDepreciacionActivoFijo = new GridBagLayout();
		
		this.jPanelCamposDepreciacionActivoFijo.setLayout(gridaBagLayoutCamposDepreciacionActivoFijo);
		this.jPanelCamposOcultosDepreciacionActivoFijo.setLayout(gridaBagLayoutCamposOcultosDepreciacionActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDepreciacionActivoFijo.add(jLabelIdDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDepreciacionActivoFijo.add(jLabelidDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDepreciacionActivoFijo.add(jLabelid_empresaDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDepreciacionActivoFijo.add(jButtonid_empresaDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 3;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDepreciacionActivoFijo.add(jButtonid_empresaDepreciacionActivoFijoUpdate, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDepreciacionActivoFijo.add(jComboBoxid_empresaDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDepreciacionActivoFijo.add(jLabelid_sucursalDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDepreciacionActivoFijo.add(jButtonid_sucursalDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 3;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDepreciacionActivoFijo.add(jButtonid_sucursalDepreciacionActivoFijoUpdate, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDepreciacionActivoFijo.add(jComboBoxid_sucursalDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_activo_fijoDepreciacionActivoFijo.add(jLabelid_detalle_activo_fijoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoDepreciacionActivoFijo.add(jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 3;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoDepreciacionActivoFijo.add(jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_activo_fijoDepreciacionActivoFijo.add(jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_depreciacion_empresaDepreciacionActivoFijo.add(jLabelid_tipo_depreciacion_empresaDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_depreciacion_empresaDepreciacionActivoFijo.add(jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 3;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_depreciacion_empresaDepreciacionActivoFijo.add(jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_depreciacion_empresaDepreciacionActivoFijo.add(jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_depre_actiDepreciacionActivoFijo.add(jLabelid_estado_depre_actiDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_depre_actiDepreciacionActivoFijo.add(jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 3;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_depre_actiDepreciacionActivoFijo.add(jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_depre_actiDepreciacionActivoFijo.add(jComboBoxid_estado_depre_actiDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDepreciacionActivoFijo.add(jLabelid_anioDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDepreciacionActivoFijo.add(jButtonid_anioDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 3;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDepreciacionActivoFijo.add(jButtonid_anioDepreciacionActivoFijoUpdate, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDepreciacionActivoFijo.add(jComboBoxid_anioDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDepreciacionActivoFijo.add(jLabelid_mesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDepreciacionActivoFijo.add(jButtonid_mesDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 3;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDepreciacionActivoFijo.add(jButtonid_mesDepreciacionActivoFijoUpdate, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDepreciacionActivoFijo.add(jComboBoxid_mesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_compraDepreciacionActivoFijo.add(jLabelfecha_compraDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_compraDepreciacionActivoFijo.add(jButtonfecha_compraDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_compraDepreciacionActivoFijo.add(jDateChooserfecha_compraDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_depre_actiDepreciacionActivoFijo.add(jLabelfecha_depre_actiDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_depre_actiDepreciacionActivoFijo.add(jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_depre_actiDepreciacionActivoFijo.add(jDateChooserfecha_depre_actiDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeDepreciacionActivoFijo.add(jLabelporcentajeDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeDepreciacionActivoFijo.add(jButtonporcentajeDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeDepreciacionActivoFijo.add(jTextFieldporcentajeDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoDepreciacionActivoFijo.add(jLabelcostoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoDepreciacionActivoFijo.add(jButtoncostoDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoDepreciacionActivoFijo.add(jTextFieldcostoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_acumuladoDepreciacionActivoFijo.add(jLabelvalor_acumuladoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_acumuladoDepreciacionActivoFijo.add(jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_acumuladoDepreciacionActivoFijo.add(jTextFieldvalor_acumuladoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_totalDepreciacionActivoFijo.add(jLabelvalor_totalDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_totalDepreciacionActivoFijo.add(jButtonvalor_totalDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_totalDepreciacionActivoFijo.add(jTextFieldvalor_totalDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_gastoDepreciacionActivoFijo.add(jLabelvalor_gastoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_gastoDepreciacionActivoFijo.add(jButtonvalor_gastoDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_gastoDepreciacionActivoFijo.add(jTextFieldvalor_gastoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaDepreciacionActivoFijo.add(jLabelfechaDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 2;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDepreciacionActivoFijo.add(jButtonfechaDepreciacionActivoFijoBusqueda, this.gridBagConstraintsDepreciacionActivoFijo);
	}

	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaDepreciacionActivoFijo.add(jDateChooserfechaDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelidDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelid_detalle_activo_fijoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelid_tipo_depreciacion_empresaDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelid_estado_depre_actiDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelid_anioDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelid_mesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelfecha_compraDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelfecha_depre_actiDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelporcentajeDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelcostoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelvalor_acumuladoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelvalor_totalDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelvalor_gastoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepreciacionActivoFijo.add(this.jPanelfechaDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposDepreciacionActivoFijo % 2==0) {
		iXPanelCamposDepreciacionActivoFijo=0;
		iYPanelCamposDepreciacionActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposOcultosDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposOcultosDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDepreciacionActivoFijo.add(this.jPanelid_empresaDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposOcultosDepreciacionActivoFijo % 2==0) {
		iXPanelCamposOcultosDepreciacionActivoFijo=0;
		iYPanelCamposOcultosDepreciacionActivoFijo++;
	}
	this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepreciacionActivoFijo.gridy = iYPanelCamposOcultosDepreciacionActivoFijo;
	this.gridBagConstraintsDepreciacionActivoFijo.gridx = iXPanelCamposOcultosDepreciacionActivoFijo++;
	this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepreciacionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDepreciacionActivoFijo.add(this.jPanelid_sucursalDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);



	if(iXPanelCamposOcultosDepreciacionActivoFijo % 2==0) {
		iXPanelCamposOcultosDepreciacionActivoFijo=0;
		iYPanelCamposOcultosDepreciacionActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesDepreciacionActivoFijo= new GridBagLayout();
		this.jPanelAccionesDepreciacionActivoFijo.setLayout(gridaBagLayoutAccionesDepreciacionActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDepreciacionActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioDepreciacionActivoFijo.setLayout(gridaBagLayoutAccionesFormularioDepreciacionActivoFijo);
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDepreciacionActivoFijo.add(this.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDepreciacionActivoFijo.add(this.jCheckBoxPostAccionNuevoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDepreciacionActivoFijo.add(this.jCheckBoxPostAccionSinCerrarDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDepreciacionActivoFijo.add(this.jCheckBoxPostAccionSinMensajeDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesDepreciacionActivoFijo.add(this.jButtonModificarDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);							

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesDepreciacionActivoFijo.add(this.jButtonEliminarDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
			
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesDepreciacionActivoFijo.add(this.jButtonActualizarDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesDepreciacionActivoFijo.add(this.jButtonGuardarCambiosDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);	
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesDepreciacionActivoFijo.add(this.jButtonCancelarDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDepreciacionActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;		
			//this.gridBagConstraintsDepreciacionActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx =0;
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDepreciacionActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DepreciacionActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDepreciacionActivoFijo = new DepreciacionActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Depreciacion Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Depreciacion Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Depreciacion Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DepreciacionActivoFijoModel depreciacionactivofijoModel=new DepreciacionActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//DepreciacionActivoFijoModel.DepreciacionActivoFijoFocusTraversalPolicy depreciacionactivofijoFocusTraversalPolicy = depreciacionactivofijoModel.new DepreciacionActivoFijoFocusTraversalPolicy(this);
			
			//depreciacionactivofijoFocusTraversalPolicy.setdepreciacionactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(depreciacionactivofijoModel);
			
			
			this.jContentPaneDetalleDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDepreciacionActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleDepreciacionActivoFijo.setLayout(gridaBagLayoutDetalleDepreciacionActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDepreciacionActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleDepreciacionActivoFijo.add(jTtoolBarDetalleDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionDepreciacionActivoFijo=   new JScrollPane(jContentPaneDetalleDepreciacionActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDepreciacionActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleDepreciacionActivoFijo.add(jPanelCamposDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);
			
			
			
			
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
						&& depreciacionactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDepreciacionActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
						this.jContentPaneDetalleDepreciacionActivoFijo.add(this.jTabbedPaneRelacionesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDepreciacionActivoFijo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDepreciacionActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsDepreciacionActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleDepreciacionActivoFijo.add(jPanelCamposOcultosDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);
				
					this.jPanelCamposOcultosDepreciacionActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	        this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDepreciacionActivoFijo.add(this.jPanelAccionesFormularioDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);							
			
			
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleDepreciacionActivoFijo.add(this.jPanelAccionesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDepreciacionActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDepreciacionActivoFijo=   new JScrollPane(this.jPanelCamposDepreciacionActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDepreciacionActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);			
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			
			
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
			
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDepreciacionActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionDepreciacionActivoFijo;
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
