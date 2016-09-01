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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.ParametroContabilidadDefectoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class ParametroContabilidadDefectoDetalleFormJInternalFrame extends ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroContabilidadDefecto;
	
	protected JMenuBar jmenuBarDetalleParametroContabilidadDefecto;
	
	protected JMenu jmenuDetalleParametroContabilidadDefecto;
	protected JMenu jmenuDetalleArchivoParametroContabilidadDefecto;
	protected JMenu jmenuDetalleAccionesParametroContabilidadDefecto;
	protected JMenu jmenuDetalleDatosParametroContabilidadDefecto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroContabilidadDefecto;	
	protected GridBagConstraints gridBagConstraintsParametroContabilidadDefecto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroContabilidadDefecto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoMonedaBeanSwingJInternalFrame tipomonedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomoneda="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoIntervaloBeanSwingJInternalFrame tipointervaloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipointervalo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected EstadoAsientoContableBeanSwingJInternalFrame estadoasientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoasientocontable="";
	
	public ParametroContabilidadDefectoSessionBean parametrocontabilidaddefectoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoMonedaSessionBean tipomonedaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoIntervaloSessionBean tipointervaloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public EstadoAsientoContableSessionBean estadoasientocontableSessionBean;	
	
	public ParametroContabilidadDefectoLogic parametrocontabilidaddefectoLogic;
	
	public JScrollPane jScrollPanelDatosParametroContabilidadDefecto;
	public JScrollPane jScrollPanelDatosEdicionParametroContabilidadDefecto;
	public JScrollPane jScrollPanelDatosGeneralParametroContabilidadDefecto;
	
	protected JPanel jPanelCamposParametroContabilidadDefecto;    
	protected JPanel jPanelCamposOcultosParametroContabilidadDefecto;    	
	protected JPanel jPanelAccionesParametroContabilidadDefecto;
	protected JPanel jPanelAccionesFormularioParametroContabilidadDefecto;
    
	
	
	protected Integer iXPanelCamposParametroContabilidadDefecto=0;
	protected Integer iYPanelCamposParametroContabilidadDefecto=0;
	
	protected Integer iXPanelCamposOcultosParametroContabilidadDefecto=0;
	protected Integer iYPanelCamposOcultosParametroContabilidadDefecto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroContabilidadDefecto;
	public JButton jButtonModificarParametroContabilidadDefecto;
	public JButton jButtonActualizarParametroContabilidadDefecto;
    public JButton jButtonEliminarParametroContabilidadDefecto;
	public JButton jButtonCancelarParametroContabilidadDefecto;
    public JButton jButtonGuardarCambiosParametroContabilidadDefecto;
	public JButton jButtonGuardarCambiosTablaParametroContabilidadDefecto;
	protected JButton jButtonCerrarParametroContabilidadDefecto;
	
	
	protected JButton jButtonProcesarInformacionParametroContabilidadDefecto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroContabilidadDefecto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroContabilidadDefecto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroContabilidadDefecto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroContabilidadDefecto;
	protected JButton jButtonModificarToolBarParametroContabilidadDefecto;
	protected JButton jButtonActualizarToolBarParametroContabilidadDefecto;
    protected JButton jButtonEliminarToolBarParametroContabilidadDefecto;
	protected JButton jButtonCancelarToolBarParametroContabilidadDefecto;
    protected JButton jButtonGuardarCambiosToolBarParametroContabilidadDefecto;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroContabilidadDefecto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroContabilidadDefecto;
	protected JButton jButtonCerrarToolBarParametroContabilidadDefecto;
	
	protected JButton jButtonProcesarInformacionToolBarParametroContabilidadDefecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroContabilidadDefecto;
	protected JMenuItem jMenuItemModificarParametroContabilidadDefecto;
	protected JMenuItem jMenuItemActualizarParametroContabilidadDefecto;
    protected JMenuItem jMenuItemEliminarParametroContabilidadDefecto;
	protected JMenuItem jMenuItemCancelarParametroContabilidadDefecto;
    protected JMenuItem jMenuItemGuardarCambiosParametroContabilidadDefecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroContabilidadDefecto;
	protected JMenuItem jMenuItemCerrarParametroContabilidadDefecto;
	protected JMenuItem jMenuItemDetalleCerrarParametroContabilidadDefecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroContabilidadDefecto;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroContabilidadDefecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroContabilidadDefecto;
	protected JMenuItem jMenuItemMostrarOcultarParametroContabilidadDefecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroContabilidadDefecto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroContabilidadDefecto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroContabilidadDefecto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroContabilidadDefecto;
	public JLabel jLabelIdParametroContabilidadDefecto;
	public JLabel jLabelidParametroContabilidadDefecto;
	public JButton jButtonidParametroContabilidadDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroContabilidadDefecto;
	public JLabel jLabelid_empresaParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroContabilidadDefecto;
	public JButton jButtonid_empresaParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_empresaParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroContabilidadDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroContabilidadDefecto;
	public JLabel jLabelid_sucursalParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroContabilidadDefecto;
	public JButton jButtonid_sucursalParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_sucursalParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroContabilidadDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_monedaParametroContabilidadDefecto;
	public JLabel jLabelid_tipo_monedaParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_monedaParametroContabilidadDefecto;
	public JButton jButtonid_tipo_monedaParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_tipo_monedaParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaParametroContabilidadDefecto;
	public JLabel jLabelid_monedaParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaParametroContabilidadDefecto;
	public JButton jButtonid_monedaParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_monedaParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_monedaParametroContabilidadDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloParametroContabilidadDefecto;
	public JLabel jLabelid_moduloParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloParametroContabilidadDefecto;
	public JButton jButtonid_moduloParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_moduloParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_moduloParametroContabilidadDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_intervaloParametroContabilidadDefecto;
	public JLabel jLabelid_tipo_intervaloParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_intervaloParametroContabilidadDefecto;
	public JButton jButtonid_tipo_intervaloParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoParametroContabilidadDefecto;
	public JLabel jLabelid_tipo_movimientoParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoParametroContabilidadDefecto;
	public JButton jButtonid_tipo_movimientoParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documentoParametroContabilidadDefecto;
	public JLabel jLabelid_tipo_documentoParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoParametroContabilidadDefecto;
	public JButton jButtonid_tipo_documentoParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_tipo_documentoParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_asiento_contableParametroContabilidadDefecto;
	public JLabel jLabelid_estado_asiento_contableParametroContabilidadDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_asiento_contableParametroContabilidadDefecto;
	public JButton jButtonid_estado_asiento_contableParametroContabilidadDefecto= new JButtonMe();
	public JButton jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate= new JButtonMe();
	public JButton jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroContabilidadDefecto;
	
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
	
	public ParametroContabilidadDefectoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroContabilidadDefecto=new JPanel();
				this.jPanelAccionesFormularioParametroContabilidadDefecto=new JPanel();
				this.jmenuBarDetalleParametroContabilidadDefecto=new JMenuBar();
				this.jTtoolBarDetalleParametroContabilidadDefecto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContabilidadDefectoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroContabilidadDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroContabilidadDefectoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroContabilidadDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContabilidadDefectoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroContabilidadDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContabilidadDefectoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroContabilidadDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContabilidadDefectoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroContabilidadDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroContabilidadDefecto() {
		return this.jButtonActualizarToolBarParametroContabilidadDefecto;
	}
	
	public JButton getjButtonEliminarToolBarParametroContabilidadDefecto() {
		return this.jButtonEliminarToolBarParametroContabilidadDefecto;
	}
	
	public JButton getjButtonCancelarToolBarParametroContabilidadDefecto() {
		return this.jButtonCancelarToolBarParametroContabilidadDefecto;
	}		
	
	public JButton getjButtonProcesarInformacionParametroContabilidadDefecto() {
		return this.jButtonProcesarInformacionParametroContabilidadDefecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroContabilidadDefecto)	{
		this.jButtonProcesarInformacionParametroContabilidadDefecto = jButtonProcesarInformacionParametroContabilidadDefecto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroContabilidadDefecto() {
		return this.jComboBoxTiposAccionesParametroContabilidadDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroContabilidadDefecto(
			JComboBox jComboBoxTiposRelacionesParametroContabilidadDefecto) {
		this.jComboBoxTiposRelacionesParametroContabilidadDefecto = jComboBoxTiposRelacionesParametroContabilidadDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroContabilidadDefecto(
			JComboBox jComboBoxTiposAccionesParametroContabilidadDefecto) {
		this.jComboBoxTiposAccionesParametroContabilidadDefecto = jComboBoxTiposAccionesParametroContabilidadDefecto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroContabilidadDefecto() {
		return this.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroContabilidadDefecto(
			JComboBox jComboBoxTiposAccionesFormularioParametroContabilidadDefecto) {
		this.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto = jComboBoxTiposAccionesFormularioParametroContabilidadDefecto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		
		this.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroContabilidadDefectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Contabilidad Defecto MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroContabilidadDefecto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroContabilidadDefecto=new JButtonMe();
				this.jButtonModificarToolBarParametroContabilidadDefecto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroContabilidadDefecto,this.jTtoolBarDetalleParametroContabilidadDefecto,
							"actualizar","actualizar","Actualizar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroContabilidadDefecto,this.jTtoolBarDetalleParametroContabilidadDefecto,
							"eliminar","eliminar","Eliminar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroContabilidadDefecto,this.jTtoolBarDetalleParametroContabilidadDefecto,
							"cancelar","cancelar","Cancelar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroContabilidadDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroContabilidadDefecto,this.jTtoolBarDetalleParametroContabilidadDefecto,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroContabilidadDefecto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroContabilidadDefecto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroContabilidadDefecto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroContabilidadDefecto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroContabilidadDefecto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroContabilidadDefecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroContabilidadDefecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroContabilidadDefecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroContabilidadDefecto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroContabilidadDefecto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroContabilidadDefecto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroContabilidadDefecto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroContabilidadDefecto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroContabilidadDefecto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroContabilidadDefecto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroContabilidadDefecto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroContabilidadDefecto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroContabilidadDefecto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroContabilidadDefecto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroContabilidadDefecto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroContabilidadDefecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroContabilidadDefecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroContabilidadDefecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroContabilidadDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroContabilidadDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroContabilidadDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroContabilidadDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroContabilidadDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroContabilidadDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroContabilidadDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroContabilidadDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroContabilidadDefecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroContabilidadDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroContabilidadDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroContabilidadDefecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroContabilidadDefecto.add(this.jMenuItemDetalleCerrarParametroContabilidadDefecto);
		
		this.jmenuDetalleAccionesParametroContabilidadDefecto.add(this.jMenuItemActualizarParametroContabilidadDefecto);
		this.jmenuDetalleAccionesParametroContabilidadDefecto.add(this.jMenuItemEliminarParametroContabilidadDefecto);
		this.jmenuDetalleAccionesParametroContabilidadDefecto.add(this.jMenuItemCancelarParametroContabilidadDefecto);		
		
		//this.jmenuDetalleDatosParametroContabilidadDefecto.add(this.jMenuItemDetalleAbrirOrderByParametroContabilidadDefecto);				
		this.jmenuDetalleDatosParametroContabilidadDefecto.add(this.jMenuItemDetalleMostarOcultarParametroContabilidadDefecto);				
				
		//this.jmenuDetalleAccionesParametroContabilidadDefecto.add(this.jMenuItemGuardarCambiosParametroContabilidadDefecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroContabilidadDefecto.add(this.jmenuDetalleArchivoParametroContabilidadDefecto);		
		this.jmenuBarDetalleParametroContabilidadDefecto.add(this.jmenuDetalleAccionesParametroContabilidadDefecto);		
		this.jmenuBarDetalleParametroContabilidadDefecto.add(this.jmenuDetalleDatosParametroContabilidadDefecto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroContabilidadDefecto);				
	}
	
	
	public void inicializarElementosCamposParametroContabilidadDefecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroContabilidadDefecto = new JLabelMe();
		jLabelIdParametroContabilidadDefecto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroContabilidadDefecto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroContabilidadDefecto.setToolTipText(ParametroContabilidadDefectoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroContabilidadDefecto= new GridBagLayout();

		this.jPanelidParametroContabilidadDefecto.setLayout(this.gridaBagLayoutParametroContabilidadDefecto);

		jLabelidParametroContabilidadDefecto = new JLabel();
		jLabelidParametroContabilidadDefecto.setText("Id");

		jLabelidParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysParametroContabilidadDefecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroContabilidadDefecto = new JLabelMe();
		this.jLabelid_empresaParametroContabilidadDefecto.setText(""+ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroContabilidadDefecto.setToolTipText("Empresa");
		this.jLabelid_empresaParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroContabilidadDefecto.setToolTipText(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroContabilidadDefecto = new GridBagLayout();
		this.jPanelid_empresaParametroContabilidadDefecto.setLayout(this.gridaBagLayoutParametroContabilidadDefecto);


		jComboBoxid_empresaParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_empresaParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroContabilidadDefecto.setEnabled(false);

		this.jButtonid_empresaParametroContabilidadDefecto= new JButtonMe();
		this.jButtonid_empresaParametroContabilidadDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroContabilidadDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroContabilidadDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroContabilidadDefecto.setText("Buscar");
		this.jButtonid_empresaParametroContabilidadDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroContabilidadDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroContabilidadDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroContabilidadDefecto"));

		this.jButtonid_empresaParametroContabilidadDefectoBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroContabilidadDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroContabilidadDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroContabilidadDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroContabilidadDefectoBusqueda.setText("U");
		this.jButtonid_empresaParametroContabilidadDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroContabilidadDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroContabilidadDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroContabilidadDefectoBusqueda"));

		if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroContabilidadDefectoBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroContabilidadDefectoUpdate= new JButtonMe();
		this.jButtonid_empresaParametroContabilidadDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroContabilidadDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroContabilidadDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroContabilidadDefectoUpdate.setText("U");
		this.jButtonid_empresaParametroContabilidadDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroContabilidadDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroContabilidadDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroContabilidadDefectoUpdate"));



					
		this.jLabelid_sucursalParametroContabilidadDefecto = new JLabelMe();
		this.jLabelid_sucursalParametroContabilidadDefecto.setText(""+ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroContabilidadDefecto.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroContabilidadDefecto.setToolTipText(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroContabilidadDefecto = new GridBagLayout();
		this.jPanelid_sucursalParametroContabilidadDefecto.setLayout(this.gridaBagLayoutParametroContabilidadDefecto);


		jComboBoxid_sucursalParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_sucursalParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroContabilidadDefecto.setEnabled(false);

		this.jButtonid_sucursalParametroContabilidadDefecto= new JButtonMe();
		this.jButtonid_sucursalParametroContabilidadDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroContabilidadDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroContabilidadDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroContabilidadDefecto.setText("Buscar");
		this.jButtonid_sucursalParametroContabilidadDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroContabilidadDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroContabilidadDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroContabilidadDefecto"));

		this.jButtonid_sucursalParametroContabilidadDefectoBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroContabilidadDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroContabilidadDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroContabilidadDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroContabilidadDefectoBusqueda.setText("U");
		this.jButtonid_sucursalParametroContabilidadDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroContabilidadDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroContabilidadDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroContabilidadDefectoBusqueda"));

		if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroContabilidadDefectoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroContabilidadDefectoUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroContabilidadDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroContabilidadDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroContabilidadDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroContabilidadDefectoUpdate.setText("U");
		this.jButtonid_sucursalParametroContabilidadDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroContabilidadDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroContabilidadDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroContabilidadDefectoUpdate"));



					
		this.jLabelid_tipo_monedaParametroContabilidadDefecto = new JLabelMe();
		this.jLabelid_tipo_monedaParametroContabilidadDefecto.setText(""+ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA+" : *");
		this.jLabelid_tipo_monedaParametroContabilidadDefecto.setToolTipText("Tipo Moneda");
		this.jLabelid_tipo_monedaParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_monedaParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_monedaParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_monedaParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_monedaParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_monedaParametroContabilidadDefecto.setToolTipText(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA);
		this.gridaBagLayoutParametroContabilidadDefecto = new GridBagLayout();
		this.jPanelid_tipo_monedaParametroContabilidadDefecto.setLayout(this.gridaBagLayoutParametroContabilidadDefecto);


		jComboBoxid_tipo_monedaParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_tipo_monedaParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_monedaParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_monedaParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_monedaParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_monedaParametroContabilidadDefecto= new JButtonMe();
		this.jButtonid_tipo_monedaParametroContabilidadDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_monedaParametroContabilidadDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_monedaParametroContabilidadDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_monedaParametroContabilidadDefecto.setText("Buscar");
		this.jButtonid_tipo_monedaParametroContabilidadDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_monedaParametroContabilidadDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_monedaParametroContabilidadDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_monedaParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_monedaParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_monedaParametroContabilidadDefecto"));

		this.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda.setText("U");
		this.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_monedaParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_monedaParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_monedaParametroContabilidadDefectoBusqueda"));

		if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_monedaParametroContabilidadDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_monedaParametroContabilidadDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_monedaParametroContabilidadDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_monedaParametroContabilidadDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_monedaParametroContabilidadDefectoUpdate.setText("U");
		this.jButtonid_tipo_monedaParametroContabilidadDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_monedaParametroContabilidadDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_monedaParametroContabilidadDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_monedaParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_monedaParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_monedaParametroContabilidadDefectoUpdate"));



					
		this.jLabelid_monedaParametroContabilidadDefecto = new JLabelMe();
		this.jLabelid_monedaParametroContabilidadDefecto.setText(""+ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaParametroContabilidadDefecto.setToolTipText("Moneda");
		this.jLabelid_monedaParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaParametroContabilidadDefecto.setToolTipText(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutParametroContabilidadDefecto = new GridBagLayout();
		this.jPanelid_monedaParametroContabilidadDefecto.setLayout(this.gridaBagLayoutParametroContabilidadDefecto);


		jComboBoxid_monedaParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_monedaParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaParametroContabilidadDefecto= new JButtonMe();
		this.jButtonid_monedaParametroContabilidadDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroContabilidadDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroContabilidadDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroContabilidadDefecto.setText("Buscar");
		this.jButtonid_monedaParametroContabilidadDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaParametroContabilidadDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroContabilidadDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroContabilidadDefecto"));

		this.jButtonid_monedaParametroContabilidadDefectoBusqueda= new JButtonMe();
		this.jButtonid_monedaParametroContabilidadDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroContabilidadDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroContabilidadDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaParametroContabilidadDefectoBusqueda.setText("U");
		this.jButtonid_monedaParametroContabilidadDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaParametroContabilidadDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroContabilidadDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroContabilidadDefectoBusqueda"));

		if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaParametroContabilidadDefectoBusqueda.setVisible(false);		}

		this.jButtonid_monedaParametroContabilidadDefectoUpdate= new JButtonMe();
		this.jButtonid_monedaParametroContabilidadDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroContabilidadDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroContabilidadDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaParametroContabilidadDefectoUpdate.setText("U");
		this.jButtonid_monedaParametroContabilidadDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaParametroContabilidadDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroContabilidadDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroContabilidadDefectoUpdate"));



					
		this.jLabelid_moduloParametroContabilidadDefecto = new JLabelMe();
		this.jLabelid_moduloParametroContabilidadDefecto.setText(""+ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloParametroContabilidadDefecto.setToolTipText("Modulo");
		this.jLabelid_moduloParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloParametroContabilidadDefecto.setToolTipText(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutParametroContabilidadDefecto = new GridBagLayout();
		this.jPanelid_moduloParametroContabilidadDefecto.setLayout(this.gridaBagLayoutParametroContabilidadDefecto);


		jComboBoxid_moduloParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_moduloParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloParametroContabilidadDefecto= new JButtonMe();
		this.jButtonid_moduloParametroContabilidadDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroContabilidadDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroContabilidadDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroContabilidadDefecto.setText("Buscar");
		this.jButtonid_moduloParametroContabilidadDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloParametroContabilidadDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroContabilidadDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroContabilidadDefecto"));

		this.jButtonid_moduloParametroContabilidadDefectoBusqueda= new JButtonMe();
		this.jButtonid_moduloParametroContabilidadDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroContabilidadDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroContabilidadDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloParametroContabilidadDefectoBusqueda.setText("U");
		this.jButtonid_moduloParametroContabilidadDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloParametroContabilidadDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroContabilidadDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroContabilidadDefectoBusqueda"));

		if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloParametroContabilidadDefectoBusqueda.setVisible(false);		}

		this.jButtonid_moduloParametroContabilidadDefectoUpdate= new JButtonMe();
		this.jButtonid_moduloParametroContabilidadDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroContabilidadDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroContabilidadDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloParametroContabilidadDefectoUpdate.setText("U");
		this.jButtonid_moduloParametroContabilidadDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloParametroContabilidadDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroContabilidadDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroContabilidadDefectoUpdate"));



					
		this.jLabelid_tipo_intervaloParametroContabilidadDefecto = new JLabelMe();
		this.jLabelid_tipo_intervaloParametroContabilidadDefecto.setText(""+ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO+" : *");
		this.jLabelid_tipo_intervaloParametroContabilidadDefecto.setToolTipText("Tipo Intervalo");
		this.jLabelid_tipo_intervaloParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_intervaloParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_intervaloParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_intervaloParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_intervaloParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_intervaloParametroContabilidadDefecto.setToolTipText(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO);
		this.gridaBagLayoutParametroContabilidadDefecto = new GridBagLayout();
		this.jPanelid_tipo_intervaloParametroContabilidadDefecto.setLayout(this.gridaBagLayoutParametroContabilidadDefecto);


		jComboBoxid_tipo_intervaloParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_intervaloParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_intervaloParametroContabilidadDefecto= new JButtonMe();
		this.jButtonid_tipo_intervaloParametroContabilidadDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_intervaloParametroContabilidadDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_intervaloParametroContabilidadDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_intervaloParametroContabilidadDefecto.setText("Buscar");
		this.jButtonid_tipo_intervaloParametroContabilidadDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_intervaloParametroContabilidadDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_intervaloParametroContabilidadDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_intervaloParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_intervaloParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_intervaloParametroContabilidadDefecto"));

		this.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda.setText("U");
		this.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_intervaloParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_intervaloParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_intervaloParametroContabilidadDefectoBusqueda"));

		if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate.setText("U");
		this.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_intervaloParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_intervaloParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_intervaloParametroContabilidadDefectoUpdate"));



					
		this.jLabelid_tipo_movimientoParametroContabilidadDefecto = new JLabelMe();
		this.jLabelid_tipo_movimientoParametroContabilidadDefecto.setText(""+ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoParametroContabilidadDefecto.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoParametroContabilidadDefecto.setToolTipText(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutParametroContabilidadDefecto = new GridBagLayout();
		this.jPanelid_tipo_movimientoParametroContabilidadDefecto.setLayout(this.gridaBagLayoutParametroContabilidadDefecto);


		jComboBoxid_tipo_movimientoParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoParametroContabilidadDefecto= new JButtonMe();
		this.jButtonid_tipo_movimientoParametroContabilidadDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoParametroContabilidadDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoParametroContabilidadDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoParametroContabilidadDefecto.setText("Buscar");
		this.jButtonid_tipo_movimientoParametroContabilidadDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoParametroContabilidadDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoParametroContabilidadDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoParametroContabilidadDefecto"));

		this.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda.setText("U");
		this.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoParametroContabilidadDefectoBusqueda"));

		if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate.setText("U");
		this.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoParametroContabilidadDefectoUpdate"));



					
		this.jLabelid_tipo_documentoParametroContabilidadDefecto = new JLabelMe();
		this.jLabelid_tipo_documentoParametroContabilidadDefecto.setText(""+ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoParametroContabilidadDefecto.setToolTipText("Tipo Documento");
		this.jLabelid_tipo_documentoParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoParametroContabilidadDefecto.setToolTipText(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutParametroContabilidadDefecto = new GridBagLayout();
		this.jPanelid_tipo_documentoParametroContabilidadDefecto.setLayout(this.gridaBagLayoutParametroContabilidadDefecto);


		jComboBoxid_tipo_documentoParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_tipo_documentoParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoParametroContabilidadDefecto= new JButtonMe();
		this.jButtonid_tipo_documentoParametroContabilidadDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoParametroContabilidadDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoParametroContabilidadDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoParametroContabilidadDefecto.setText("Buscar");
		this.jButtonid_tipo_documentoParametroContabilidadDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoParametroContabilidadDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoParametroContabilidadDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoParametroContabilidadDefecto"));

		this.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda.setText("U");
		this.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoParametroContabilidadDefectoBusqueda"));

		if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoParametroContabilidadDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoParametroContabilidadDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoParametroContabilidadDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoParametroContabilidadDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoParametroContabilidadDefectoUpdate.setText("U");
		this.jButtonid_tipo_documentoParametroContabilidadDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoParametroContabilidadDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoParametroContabilidadDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoParametroContabilidadDefectoUpdate"));



					
		this.jLabelid_estado_asiento_contableParametroContabilidadDefecto = new JLabelMe();
		this.jLabelid_estado_asiento_contableParametroContabilidadDefecto.setText(""+ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE+" : *");
		this.jLabelid_estado_asiento_contableParametroContabilidadDefecto.setToolTipText("Estado Asiento C.");
		this.jLabelid_estado_asiento_contableParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_asiento_contableParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_asiento_contableParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_asiento_contableParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_asiento_contableParametroContabilidadDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_asiento_contableParametroContabilidadDefecto.setToolTipText(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE);
		this.gridaBagLayoutParametroContabilidadDefecto = new GridBagLayout();
		this.jPanelid_estado_asiento_contableParametroContabilidadDefecto.setLayout(this.gridaBagLayoutParametroContabilidadDefecto);


		jComboBoxid_estado_asiento_contableParametroContabilidadDefecto= new JComboBoxMe();
		jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_asiento_contableParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_asiento_contableParametroContabilidadDefecto= new JButtonMe();
		this.jButtonid_estado_asiento_contableParametroContabilidadDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_asiento_contableParametroContabilidadDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_asiento_contableParametroContabilidadDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_asiento_contableParametroContabilidadDefecto.setText("Buscar");
		this.jButtonid_estado_asiento_contableParametroContabilidadDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_asiento_contableParametroContabilidadDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_asiento_contableParametroContabilidadDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_asiento_contableParametroContabilidadDefecto"));

		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda= new JButtonMe();
		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda.setText("U");
		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_asiento_contableParametroContabilidadDefectoBusqueda"));

		if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda.setVisible(false);		}

		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate= new JButtonMe();
		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate.setText("U");
		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_asiento_contableParametroContabilidadDefectoUpdate"));



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
		//this.jInternalFrameDetalleParametroContabilidadDefecto = new ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Contabilidad Defecto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroContabilidadDefecto= new GridBagLayout();
		

		
		String sToolTipParametroContabilidadDefecto="";
		sToolTipParametroContabilidadDefecto=ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroContabilidadDefecto+="(Contabilidad.ParametroContabilidadDefecto)";
		}
		
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroContabilidadDefecto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroContabilidadDefecto = new JButtonMe();
		this.jButtonModificarParametroContabilidadDefecto = new JButtonMe();
        this.jButtonActualizarParametroContabilidadDefecto = new JButtonMe();
        this.jButtonEliminarParametroContabilidadDefecto = new JButtonMe();
        this.jButtonCancelarParametroContabilidadDefecto = new JButtonMe();
        this.jButtonGuardarCambiosParametroContabilidadDefecto = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroContabilidadDefecto = new JButtonMe();
		this.jButtonCerrarParametroContabilidadDefecto = new JButtonMe();
		
		this.jScrollPanelDatosParametroContabilidadDefecto = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroContabilidadDefecto = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroContabilidadDefecto = new JScrollPane();
				
		
		
		this.jPanelCamposParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Contabilidad Defecto";
		
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidad Defectos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroContabilidadDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroContabilidadDefecto.setName("jPanelCamposParametroContabilidadDefecto"); 

		this.jPanelCamposOcultosParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroContabilidadDefecto.setName("jPanelCamposOcultosParametroContabilidadDefecto"); 

        this.jPanelAccionesParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroContabilidadDefecto.setToolTipText("Acciones");
        this.jPanelAccionesParametroContabilidadDefecto.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroContabilidadDefecto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroContabilidadDefecto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroContabilidadDefecto.setText("Nuevo");
		this.jButtonModificarParametroContabilidadDefecto.setText("Editar");
        this.jButtonActualizarParametroContabilidadDefecto.setText("Actualizar");
        this.jButtonEliminarParametroContabilidadDefecto.setText("Eliminar");
        this.jButtonCancelarParametroContabilidadDefecto.setText("Cancelar");
        this.jButtonGuardarCambiosParametroContabilidadDefecto.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.setText("Guardar");
		this.jButtonCerrarParametroContabilidadDefecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroContabilidadDefecto,"nuevo_button","Nuevo",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroContabilidadDefecto,"modificar_button","Editar",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroContabilidadDefecto,"actualizar_button","Actualizar",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroContabilidadDefecto,"eliminar_button","Eliminar",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroContabilidadDefecto,"cancelar_button","Cancelar",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroContabilidadDefecto,"guardarcambios_button","Guardar",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroContabilidadDefecto,"guardarcambiostabla_button","Guardar",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroContabilidadDefecto,"cerrar_button","Salir",this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroContabilidadDefecto.setToolTipText("Nuevo"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroContabilidadDefecto.setToolTipText("Editar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroContabilidadDefecto.setToolTipText("Actualizar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroContabilidadDefecto.setToolTipText("Eliminar)"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroContabilidadDefecto.setToolTipText("Cancelar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroContabilidadDefecto.setToolTipText("Guardar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.setToolTipText("Guardar"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroContabilidadDefecto.setToolTipText("Salir"+" "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroContabilidadDefecto";
		inputMap = this.jButtonNuevoParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroContabilidadDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroContabilidadDefecto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroContabilidadDefecto";
		inputMap = this.jButtonActualizarParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroContabilidadDefecto"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroContabilidadDefecto";
		inputMap = this.jButtonEliminarParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroContabilidadDefecto"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroContabilidadDefecto";
		inputMap = this.jButtonCancelarParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroContabilidadDefecto"));
		
		//CERRAR		
		sMapKey = "CerrarParametroContabilidadDefecto";
		inputMap = this.jButtonCerrarParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroContabilidadDefecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroContabilidadDefecto";
		inputMap = this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroContabilidadDefecto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroContabilidadDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroContabilidadDefecto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroContabilidadDefecto.setToolTipText("Nuevo ParametroContabilidadDefecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroContabilidadDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroContabilidadDefecto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroContabilidadDefecto.setToolTipText("Sin Cerrar Ventana ParametroContabilidadDefecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroContabilidadDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroContabilidadDefecto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroContabilidadDefecto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroContabilidadDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroContabilidadDefecto.setText("Accion");
		this.jComboBoxTiposAccionesParametroContabilidadDefecto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroContabilidadDefecto = new JLabelMe();
		
		this.jLabelAccionesParametroContabilidadDefecto.setText("Acciones");		
		this.jLabelAccionesParametroContabilidadDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroContabilidadDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroContabilidadDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroContabilidadDefecto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroContabilidadDefecto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroContabilidadDefecto=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroContabilidadDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroContabilidadDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroContabilidadDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroContabilidadDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroContabilidadDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroContabilidadDefecto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroContabilidadDefecto = new GridBagLayout();
		
		this.jPanelCamposParametroContabilidadDefecto.setLayout(gridaBagLayoutCamposParametroContabilidadDefecto);
		this.jPanelCamposOcultosParametroContabilidadDefecto.setLayout(gridaBagLayoutCamposOcultosParametroContabilidadDefecto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroContabilidadDefecto.add(jLabelIdParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroContabilidadDefecto.add(jLabelidParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);


	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroContabilidadDefecto.add(jLabelid_empresaParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 2;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroContabilidadDefecto.add(jButtonid_empresaParametroContabilidadDefectoBusqueda, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 3;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroContabilidadDefecto.add(jButtonid_empresaParametroContabilidadDefectoUpdate, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroContabilidadDefecto.add(jComboBoxid_empresaParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);


	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroContabilidadDefecto.add(jLabelid_sucursalParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 2;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroContabilidadDefecto.add(jButtonid_sucursalParametroContabilidadDefectoBusqueda, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 3;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroContabilidadDefecto.add(jButtonid_sucursalParametroContabilidadDefectoUpdate, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroContabilidadDefecto.add(jComboBoxid_sucursalParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);


	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_monedaParametroContabilidadDefecto.add(jLabelid_tipo_monedaParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 2;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_monedaParametroContabilidadDefecto.add(jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 3;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_monedaParametroContabilidadDefecto.add(jButtonid_tipo_monedaParametroContabilidadDefectoUpdate, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_monedaParametroContabilidadDefecto.add(jComboBoxid_tipo_monedaParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);


	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaParametroContabilidadDefecto.add(jLabelid_monedaParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 2;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaParametroContabilidadDefecto.add(jButtonid_monedaParametroContabilidadDefectoBusqueda, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 3;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaParametroContabilidadDefecto.add(jButtonid_monedaParametroContabilidadDefectoUpdate, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaParametroContabilidadDefecto.add(jComboBoxid_monedaParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);


	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloParametroContabilidadDefecto.add(jLabelid_moduloParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 2;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloParametroContabilidadDefecto.add(jButtonid_moduloParametroContabilidadDefectoBusqueda, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 3;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloParametroContabilidadDefecto.add(jButtonid_moduloParametroContabilidadDefectoUpdate, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloParametroContabilidadDefecto.add(jComboBoxid_moduloParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);


	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_intervaloParametroContabilidadDefecto.add(jLabelid_tipo_intervaloParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 2;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_intervaloParametroContabilidadDefecto.add(jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 3;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_intervaloParametroContabilidadDefecto.add(jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_intervaloParametroContabilidadDefecto.add(jComboBoxid_tipo_intervaloParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);


	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoParametroContabilidadDefecto.add(jLabelid_tipo_movimientoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 2;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoParametroContabilidadDefecto.add(jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 3;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoParametroContabilidadDefecto.add(jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoParametroContabilidadDefecto.add(jComboBoxid_tipo_movimientoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);


	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documentoParametroContabilidadDefecto.add(jLabelid_tipo_documentoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 2;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoParametroContabilidadDefecto.add(jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 3;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoParametroContabilidadDefecto.add(jButtonid_tipo_documentoParametroContabilidadDefectoUpdate, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documentoParametroContabilidadDefecto.add(jComboBoxid_tipo_documentoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);


	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_asiento_contableParametroContabilidadDefecto.add(jLabelid_estado_asiento_contableParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 2;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_asiento_contableParametroContabilidadDefecto.add(jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 3;
		this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_asiento_contableParametroContabilidadDefecto.add(jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate, this.gridBagConstraintsParametroContabilidadDefecto);
	}

	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = 1;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_asiento_contableParametroContabilidadDefecto.add(jComboBoxid_estado_asiento_contableParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = iYPanelCamposParametroContabilidadDefecto;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = iXPanelCamposParametroContabilidadDefecto++;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContabilidadDefecto.add(this.jPanelidParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(iXPanelCamposParametroContabilidadDefecto % 1==0) {
		iXPanelCamposParametroContabilidadDefecto=0;
		iYPanelCamposParametroContabilidadDefecto++;
	}
	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = iYPanelCamposParametroContabilidadDefecto;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = iXPanelCamposParametroContabilidadDefecto++;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContabilidadDefecto.add(this.jPanelid_tipo_monedaParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(iXPanelCamposParametroContabilidadDefecto % 1==0) {
		iXPanelCamposParametroContabilidadDefecto=0;
		iYPanelCamposParametroContabilidadDefecto++;
	}
	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = iYPanelCamposParametroContabilidadDefecto;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = iXPanelCamposParametroContabilidadDefecto++;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContabilidadDefecto.add(this.jPanelid_monedaParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(iXPanelCamposParametroContabilidadDefecto % 1==0) {
		iXPanelCamposParametroContabilidadDefecto=0;
		iYPanelCamposParametroContabilidadDefecto++;
	}
	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = iYPanelCamposParametroContabilidadDefecto;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = iXPanelCamposParametroContabilidadDefecto++;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContabilidadDefecto.add(this.jPanelid_moduloParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(iXPanelCamposParametroContabilidadDefecto % 1==0) {
		iXPanelCamposParametroContabilidadDefecto=0;
		iYPanelCamposParametroContabilidadDefecto++;
	}
	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = iYPanelCamposParametroContabilidadDefecto;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = iXPanelCamposParametroContabilidadDefecto++;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContabilidadDefecto.add(this.jPanelid_tipo_intervaloParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(iXPanelCamposParametroContabilidadDefecto % 1==0) {
		iXPanelCamposParametroContabilidadDefecto=0;
		iYPanelCamposParametroContabilidadDefecto++;
	}
	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = iYPanelCamposParametroContabilidadDefecto;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = iXPanelCamposParametroContabilidadDefecto++;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContabilidadDefecto.add(this.jPanelid_tipo_movimientoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(iXPanelCamposParametroContabilidadDefecto % 1==0) {
		iXPanelCamposParametroContabilidadDefecto=0;
		iYPanelCamposParametroContabilidadDefecto++;
	}
	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = iYPanelCamposParametroContabilidadDefecto;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = iXPanelCamposParametroContabilidadDefecto++;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContabilidadDefecto.add(this.jPanelid_tipo_documentoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(iXPanelCamposParametroContabilidadDefecto % 1==0) {
		iXPanelCamposParametroContabilidadDefecto=0;
		iYPanelCamposParametroContabilidadDefecto++;
	}
	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = iYPanelCamposParametroContabilidadDefecto;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = iXPanelCamposParametroContabilidadDefecto++;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContabilidadDefecto.add(this.jPanelid_estado_asiento_contableParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(iXPanelCamposParametroContabilidadDefecto % 1==0) {
		iXPanelCamposParametroContabilidadDefecto=0;
		iYPanelCamposParametroContabilidadDefecto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = iYPanelCamposOcultosParametroContabilidadDefecto;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = iXPanelCamposOcultosParametroContabilidadDefecto++;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroContabilidadDefecto.add(this.jPanelid_empresaParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(iXPanelCamposOcultosParametroContabilidadDefecto % 1==0) {
		iXPanelCamposOcultosParametroContabilidadDefecto=0;
		iYPanelCamposOcultosParametroContabilidadDefecto++;
	}
	this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContabilidadDefecto.gridy = iYPanelCamposOcultosParametroContabilidadDefecto;
	this.gridBagConstraintsParametroContabilidadDefecto.gridx = iXPanelCamposOcultosParametroContabilidadDefecto++;
	this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContabilidadDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroContabilidadDefecto.add(this.jPanelid_sucursalParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);



	if(iXPanelCamposOcultosParametroContabilidadDefecto % 1==0) {
		iXPanelCamposOcultosParametroContabilidadDefecto=0;
		iYPanelCamposOcultosParametroContabilidadDefecto++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroContabilidadDefecto= new GridBagLayout();
		this.jPanelAccionesParametroContabilidadDefecto.setLayout(gridaBagLayoutAccionesParametroContabilidadDefecto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroContabilidadDefecto= new GridBagLayout();
		this.jPanelAccionesFormularioParametroContabilidadDefecto.setLayout(gridaBagLayoutAccionesFormularioParametroContabilidadDefecto);
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroContabilidadDefecto.add(this.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroContabilidadDefecto.add(this.jCheckBoxPostAccionNuevoParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroContabilidadDefecto.add(this.jCheckBoxPostAccionSinCerrarParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroContabilidadDefecto.add(this.jCheckBoxPostAccionSinMensajeParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroContabilidadDefecto.add(this.jButtonModificarParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);							

		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroContabilidadDefecto.add(this.jButtonEliminarParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		
			
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroContabilidadDefecto.add(this.jButtonActualizarParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);


		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroContabilidadDefecto.add(this.jButtonGuardarCambiosParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);	
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = 0;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroContabilidadDefecto.add(this.jButtonCancelarParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroContabilidadDefecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroContabilidadDefecto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();						
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;		
			//this.gridBagConstraintsParametroContabilidadDefecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroContabilidadDefecto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroContabilidadDefecto.gridx =0;
		this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroContabilidadDefecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroContabilidadDefectoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroContabilidadDefecto = new ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Contabilidad Defecto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Contabilidad Defecto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Contabilidad Defecto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroContabilidadDefectoModel parametrocontabilidaddefectoModel=new ParametroContabilidadDefectoModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroContabilidadDefectoModel.ParametroContabilidadDefectoFocusTraversalPolicy parametrocontabilidaddefectoFocusTraversalPolicy = parametrocontabilidaddefectoModel.new ParametroContabilidadDefectoFocusTraversalPolicy(this);
			
			//parametrocontabilidaddefectoFocusTraversalPolicy.setparametrocontabilidaddefectoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrocontabilidaddefectoModel);
			
			
			this.jContentPaneDetalleParametroContabilidadDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroContabilidadDefecto = new GridBagLayout();	
			this.jContentPaneDetalleParametroContabilidadDefecto.setLayout(gridaBagLayoutDetalleParametroContabilidadDefecto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroContabilidadDefecto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
					
				
				this.jContentPaneDetalleParametroContabilidadDefecto.add(jTtoolBarDetalleParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);								
				
}
			
			this.jScrollPanelDatosEdicionParametroContabilidadDefecto=   new JScrollPane(jContentPaneDetalleParametroContabilidadDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroContabilidadDefecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	        
			this.jContentPaneDetalleParametroContabilidadDefecto.add(jPanelCamposParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);
			
			
			
			
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
						&& parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroContabilidadDefecto= new GridBagConstraints();
						this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
						this.jContentPaneDetalleParametroContabilidadDefecto.add(this.jTabbedPaneRelacionesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroContabilidadDefecto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroContabilidadDefecto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
					this.gridBagConstraintsParametroContabilidadDefecto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
					
				
					this.jContentPaneDetalleParametroContabilidadDefecto.add(jPanelCamposOcultosParametroContabilidadDefecto, gridBagConstraintsParametroContabilidadDefecto);
				
					this.jPanelCamposOcultosParametroContabilidadDefecto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	        this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroContabilidadDefecto.add(this.jPanelAccionesFormularioParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);							
			
			
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
	        this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroContabilidadDefecto.add(this.jPanelAccionesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroContabilidadDefecto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroContabilidadDefecto=   new JScrollPane(this.jPanelCamposParametroContabilidadDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
			this.gridBagConstraintsParametroContabilidadDefecto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroContabilidadDefecto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroContabilidadDefecto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);			
			
			this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroContabilidadDefecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
			
			
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		
			
		this.gridBagConstraintsParametroContabilidadDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroContabilidadDefecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroContabilidadDefecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroContabilidadDefecto, this.gridBagConstraintsParametroContabilidadDefecto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroContabilidadDefecto;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroContabilidadDefecto;
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
