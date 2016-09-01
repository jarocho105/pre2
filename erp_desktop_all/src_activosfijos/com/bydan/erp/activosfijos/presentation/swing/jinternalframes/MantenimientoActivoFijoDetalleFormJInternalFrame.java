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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.activosfijos.util.MantenimientoActivoFijoConstantesFunciones;

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
public class MantenimientoActivoFijoDetalleFormJInternalFrame extends MantenimientoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMantenimientoActivoFijo;
	
	protected JMenuBar jmenuBarDetalleMantenimientoActivoFijo;
	
	protected JMenu jmenuDetalleMantenimientoActivoFijo;
	protected JMenu jmenuDetalleArchivoMantenimientoActivoFijo;
	protected JMenu jmenuDetalleAccionesMantenimientoActivoFijo;
	protected JMenu jmenuDetalleDatosMantenimientoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMantenimientoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsMantenimientoActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MantenimientoActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleMantenimientoActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public MantenimientoActivoFijoSessionBean mantenimientoactivofijoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;	
	
	public MantenimientoActivoFijoLogic mantenimientoactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosMantenimientoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionMantenimientoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralMantenimientoActivoFijo;
	
	protected JPanel jPanelCamposMantenimientoActivoFijo;    
	protected JPanel jPanelCamposOcultosMantenimientoActivoFijo;    	
	protected JPanel jPanelAccionesMantenimientoActivoFijo;
	protected JPanel jPanelAccionesFormularioMantenimientoActivoFijo;
    
	
	
	protected Integer iXPanelCamposMantenimientoActivoFijo=0;
	protected Integer iYPanelCamposMantenimientoActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosMantenimientoActivoFijo=0;
	protected Integer iYPanelCamposOcultosMantenimientoActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMantenimientoActivoFijo;
	public JButton jButtonModificarMantenimientoActivoFijo;
	public JButton jButtonActualizarMantenimientoActivoFijo;
    public JButton jButtonEliminarMantenimientoActivoFijo;
	public JButton jButtonCancelarMantenimientoActivoFijo;
    public JButton jButtonGuardarCambiosMantenimientoActivoFijo;
	public JButton jButtonGuardarCambiosTablaMantenimientoActivoFijo;
	protected JButton jButtonCerrarMantenimientoActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionMantenimientoActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMantenimientoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMantenimientoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMantenimientoActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMantenimientoActivoFijo;
	protected JButton jButtonModificarToolBarMantenimientoActivoFijo;
	protected JButton jButtonActualizarToolBarMantenimientoActivoFijo;
    protected JButton jButtonEliminarToolBarMantenimientoActivoFijo;
	protected JButton jButtonCancelarToolBarMantenimientoActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarMantenimientoActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarMantenimientoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarMantenimientoActivoFijo;
	protected JButton jButtonCerrarToolBarMantenimientoActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarMantenimientoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMantenimientoActivoFijo;
	protected JMenuItem jMenuItemModificarMantenimientoActivoFijo;
	protected JMenuItem jMenuItemActualizarMantenimientoActivoFijo;
    protected JMenuItem jMenuItemEliminarMantenimientoActivoFijo;
	protected JMenuItem jMenuItemCancelarMantenimientoActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosMantenimientoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaMantenimientoActivoFijo;
	protected JMenuItem jMenuItemCerrarMantenimientoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarMantenimientoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarMantenimientoActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionMantenimientoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMantenimientoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarMantenimientoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMantenimientoActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMantenimientoActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMantenimientoActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMantenimientoActivoFijo;
	public JLabel jLabelIdMantenimientoActivoFijo;
	public JLabel jLabelidMantenimientoActivoFijo;
	public JButton jButtonidMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoMantenimientoActivoFijo;
	public JLabel jLabelnumero_documentoMantenimientoActivoFijo;
	public JTextField jTextFieldnumero_documentoMantenimientoActivoFijo;
	public JButton jButtonnumero_documentoMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcausaMantenimientoActivoFijo;
	public JLabel jLabelcausaMantenimientoActivoFijo;
	public JTextArea jTextAreacausaMantenimientoActivoFijo;
	public JScrollPane jscrollPanecausaMantenimientoActivoFijo;
	public JButton jButtoncausaMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelreferenciaMantenimientoActivoFijo;
	public JLabel jLabelreferenciaMantenimientoActivoFijo;
	public JTextArea jTextAreareferenciaMantenimientoActivoFijo;
	public JScrollPane jscrollPanereferenciaMantenimientoActivoFijo;
	public JButton jButtonreferenciaMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPaneltallerMantenimientoActivoFijo;
	public JLabel jLabeltallerMantenimientoActivoFijo;
	public JTextArea jTextAreatallerMantenimientoActivoFijo;
	public JScrollPane jscrollPanetallerMantenimientoActivoFijo;
	public JButton jButtontallerMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoMantenimientoActivoFijo;
	public JLabel jLabeltelefonoMantenimientoActivoFijo;
	public JTextArea jTextAreatelefonoMantenimientoActivoFijo;
	public JScrollPane jscrollPanetelefonoMantenimientoActivoFijo;
	public JButton jButtontelefonoMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioMantenimientoActivoFijo;
	public JLabel jLabelfecha_inicioMantenimientoActivoFijo;
	//public JFormattedTextField jDateChooserfecha_inicioMantenimientoActivoFijo;

	public JDateChooser jDateChooserfecha_inicioMantenimientoActivoFijo;
	public JButton jButtonfecha_inicioMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaMantenimientoActivoFijo;
	public JLabel jLabelfecha_entregaMantenimientoActivoFijo;
	//public JFormattedTextField jDateChooserfecha_entregaMantenimientoActivoFijo;

	public JDateChooser jDateChooserfecha_entregaMantenimientoActivoFijo;
	public JButton jButtonfecha_entregaMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcostoMantenimientoActivoFijo;
	public JLabel jLabelcostoMantenimientoActivoFijo;
	public JTextField jTextFieldcostoMantenimientoActivoFijo;
	public JButton jButtoncostoMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelresponsableMantenimientoActivoFijo;
	public JLabel jLabelresponsableMantenimientoActivoFijo;
	public JTextArea jTextArearesponsableMantenimientoActivoFijo;
	public JScrollPane jscrollPaneresponsableMantenimientoActivoFijo;
	public JButton jButtonresponsableMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelobservacionMantenimientoActivoFijo;
	public JLabel jLabelobservacionMantenimientoActivoFijo;
	public JTextArea jTextAreaobservacionMantenimientoActivoFijo;
	public JScrollPane jscrollPaneobservacionMantenimientoActivoFijo;
	public JButton jButtonobservacionMantenimientoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMantenimientoActivoFijo;
	public JLabel jLabelid_empresaMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMantenimientoActivoFijo;
	public JButton jButtonid_empresaMantenimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaMantenimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalMantenimientoActivoFijo;
	public JLabel jLabelid_sucursalMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalMantenimientoActivoFijo;
	public JButton jButtonid_sucursalMantenimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_sucursalMantenimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_activo_fijoMantenimientoActivoFijo;
	public JLabel jLabelid_detalle_activo_fijoMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo;
	public JButton jButtonid_detalle_activo_fijoMantenimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoMantenimientoActivoFijo;
	public JLabel jLabelid_tipo_movimientoMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoMantenimientoActivoFijo;
	public JButton jButtonid_tipo_movimientoMantenimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMantenimientoActivoFijo;
	
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
	public int iHeightFormulario=704;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MantenimientoActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMantenimientoActivoFijo=new JPanel();
				this.jPanelAccionesFormularioMantenimientoActivoFijo=new JPanel();
				this.jmenuBarDetalleMantenimientoActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleMantenimientoActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MantenimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MantenimientoActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MantenimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MantenimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MantenimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MantenimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMantenimientoActivoFijo() {
		return this.jButtonActualizarToolBarMantenimientoActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarMantenimientoActivoFijo() {
		return this.jButtonEliminarToolBarMantenimientoActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarMantenimientoActivoFijo() {
		return this.jButtonCancelarToolBarMantenimientoActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionMantenimientoActivoFijo() {
		return this.jButtonProcesarInformacionMantenimientoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMantenimientoActivoFijo)	{
		this.jButtonProcesarInformacionMantenimientoActivoFijo = jButtonProcesarInformacionMantenimientoActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMantenimientoActivoFijo() {
		return this.jComboBoxTiposAccionesMantenimientoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMantenimientoActivoFijo(
			JComboBox jComboBoxTiposRelacionesMantenimientoActivoFijo) {
		this.jComboBoxTiposRelacionesMantenimientoActivoFijo = jComboBoxTiposRelacionesMantenimientoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMantenimientoActivoFijo(
			JComboBox jComboBoxTiposAccionesMantenimientoActivoFijo) {
		this.jComboBoxTiposAccionesMantenimientoActivoFijo = jComboBoxTiposAccionesMantenimientoActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMantenimientoActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMantenimientoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioMantenimientoActivoFijo) {
		this.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo = jComboBoxTiposAccionesFormularioMantenimientoActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
		
		this.mantenimientoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mantenimientoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MantenimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MantenimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MantenimientoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mantenimiento Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		MantenimientoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMantenimientoActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMantenimientoActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarMantenimientoActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMantenimientoActivoFijo,this.jTtoolBarDetalleMantenimientoActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMantenimientoActivoFijo,this.jTtoolBarDetalleMantenimientoActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMantenimientoActivoFijo,this.jTtoolBarDetalleMantenimientoActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMantenimientoActivoFijo,this.jTtoolBarDetalleMantenimientoActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMantenimientoActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMantenimientoActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMantenimientoActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMantenimientoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMantenimientoActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMantenimientoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMantenimientoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMantenimientoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMantenimientoActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMantenimientoActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMantenimientoActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMantenimientoActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMantenimientoActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMantenimientoActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMantenimientoActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMantenimientoActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMantenimientoActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMantenimientoActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMantenimientoActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMantenimientoActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMantenimientoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMantenimientoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMantenimientoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMantenimientoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMantenimientoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMantenimientoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMantenimientoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMantenimientoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMantenimientoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMantenimientoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMantenimientoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMantenimientoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMantenimientoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMantenimientoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMantenimientoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMantenimientoActivoFijo.add(this.jMenuItemDetalleCerrarMantenimientoActivoFijo);
		
		this.jmenuDetalleAccionesMantenimientoActivoFijo.add(this.jMenuItemActualizarMantenimientoActivoFijo);
		this.jmenuDetalleAccionesMantenimientoActivoFijo.add(this.jMenuItemEliminarMantenimientoActivoFijo);
		this.jmenuDetalleAccionesMantenimientoActivoFijo.add(this.jMenuItemCancelarMantenimientoActivoFijo);		
		
		//this.jmenuDetalleDatosMantenimientoActivoFijo.add(this.jMenuItemDetalleAbrirOrderByMantenimientoActivoFijo);				
		this.jmenuDetalleDatosMantenimientoActivoFijo.add(this.jMenuItemDetalleMostarOcultarMantenimientoActivoFijo);				
				
		//this.jmenuDetalleAccionesMantenimientoActivoFijo.add(this.jMenuItemGuardarCambiosMantenimientoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMantenimientoActivoFijo.add(this.jmenuDetalleArchivoMantenimientoActivoFijo);		
		this.jmenuBarDetalleMantenimientoActivoFijo.add(this.jmenuDetalleAccionesMantenimientoActivoFijo);		
		this.jmenuBarDetalleMantenimientoActivoFijo.add(this.jmenuDetalleDatosMantenimientoActivoFijo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMantenimientoActivoFijo);				
	}
	
	
	public void inicializarElementosCamposMantenimientoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMantenimientoActivoFijo = new JLabelMe();
		jLabelIdMantenimientoActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMantenimientoActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMantenimientoActivoFijo= new GridBagLayout();

		this.jPanelidMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);

		jLabelidMantenimientoActivoFijo = new JLabel();
		jLabelidMantenimientoActivoFijo.setText("Id");

		jLabelidMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_documentoMantenimientoActivoFijo = new JLabelMe();
		this.jLabelnumero_documentoMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoMantenimientoActivoFijo.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelnumero_documentoMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jTextFieldnumero_documentoMantenimientoActivoFijo= new JTextFieldMe();

		jTextFieldnumero_documentoMantenimientoActivoFijo.setEnabled(false);
		jTextFieldnumero_documentoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonnumero_documentoMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtonnumero_documentoMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoMantenimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcausaMantenimientoActivoFijo = new JLabelMe();
		this.jLabelcausaMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA+" : *");
		this.jLabelcausaMantenimientoActivoFijo.setToolTipText("Causa");
		this.jLabelcausaMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcausaMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcausaMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcausaMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcausaMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcausaMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelcausaMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jTextAreacausaMantenimientoActivoFijo= new JTextAreaMe();
		jTextAreacausaMantenimientoActivoFijo.setEnabled(false);
		jTextAreacausaMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacausaMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacausaMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacausaMantenimientoActivoFijo.setLineWrap(true);
		jTextAreacausaMantenimientoActivoFijo.setWrapStyleWord(true);
		jTextAreacausaMantenimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacausaMantenimientoActivoFijo.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreacausaMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecausaMantenimientoActivoFijo = new JScrollPane(jTextAreacausaMantenimientoActivoFijo);
		jscrollPanecausaMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanecausaMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanecausaMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtoncausaMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtoncausaMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncausaMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncausaMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncausaMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtoncausaMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncausaMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncausaMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacausaMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacausaMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"causaMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncausaMantenimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelreferenciaMantenimientoActivoFijo = new JLabelMe();
		this.jLabelreferenciaMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA+" : *");
		this.jLabelreferenciaMantenimientoActivoFijo.setToolTipText("Referencia");
		this.jLabelreferenciaMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelreferenciaMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelreferenciaMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelreferenciaMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelreferenciaMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jTextAreareferenciaMantenimientoActivoFijo= new JTextAreaMe();
		jTextAreareferenciaMantenimientoActivoFijo.setEnabled(false);
		jTextAreareferenciaMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaMantenimientoActivoFijo.setLineWrap(true);
		jTextAreareferenciaMantenimientoActivoFijo.setWrapStyleWord(true);
		jTextAreareferenciaMantenimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreareferenciaMantenimientoActivoFijo.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreareferenciaMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanereferenciaMantenimientoActivoFijo = new JScrollPane(jTextAreareferenciaMantenimientoActivoFijo);
		jscrollPanereferenciaMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanereferenciaMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanereferenciaMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonreferenciaMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonreferenciaMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonreferenciaMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtonreferenciaMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonreferenciaMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonreferenciaMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreareferenciaMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreareferenciaMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"referenciaMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonreferenciaMantenimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabeltallerMantenimientoActivoFijo = new JLabelMe();
		this.jLabeltallerMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER+" : *");
		this.jLabeltallerMantenimientoActivoFijo.setToolTipText("Taller");
		this.jLabeltallerMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltallerMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltallerMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltallerMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltallerMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltallerMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPaneltallerMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jTextAreatallerMantenimientoActivoFijo= new JTextAreaMe();
		jTextAreatallerMantenimientoActivoFijo.setEnabled(false);
		jTextAreatallerMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatallerMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatallerMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatallerMantenimientoActivoFijo.setLineWrap(true);
		jTextAreatallerMantenimientoActivoFijo.setWrapStyleWord(true);
		jTextAreatallerMantenimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatallerMantenimientoActivoFijo.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatallerMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetallerMantenimientoActivoFijo = new JScrollPane(jTextAreatallerMantenimientoActivoFijo);
		jscrollPanetallerMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetallerMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetallerMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontallerMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtontallerMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontallerMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontallerMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontallerMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtontallerMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontallerMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontallerMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatallerMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatallerMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tallerMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontallerMantenimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoMantenimientoActivoFijo = new JLabelMe();
		this.jLabeltelefonoMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoMantenimientoActivoFijo.setToolTipText("Telefono");
		this.jLabeltelefonoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPaneltelefonoMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jTextAreatelefonoMantenimientoActivoFijo= new JTextAreaMe();
		jTextAreatelefonoMantenimientoActivoFijo.setEnabled(false);
		jTextAreatelefonoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoMantenimientoActivoFijo.setLineWrap(true);
		jTextAreatelefonoMantenimientoActivoFijo.setWrapStyleWord(true);
		jTextAreatelefonoMantenimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoMantenimientoActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoMantenimientoActivoFijo = new JScrollPane(jTextAreatelefonoMantenimientoActivoFijo);
		jscrollPanetelefonoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefonoMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtontelefonoMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtontelefonoMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoMantenimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioMantenimientoActivoFijo = new JLabelMe();
		this.jLabelfecha_inicioMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioMantenimientoActivoFijo.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelfecha_inicioMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		//jFormattedTextFieldfecha_inicioMantenimientoActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioMantenimientoActivoFijo= new JDateChooser();
		jDateChooserfecha_inicioMantenimientoActivoFijo.setEnabled(false);
		jDateChooserfecha_inicioMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioMantenimientoActivoFijo.setDate(new Date());
		jDateChooserfecha_inicioMantenimientoActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioMantenimientoActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonfecha_inicioMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtonfecha_inicioMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioMantenimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaMantenimientoActivoFijo = new JLabelMe();
		this.jLabelfecha_entregaMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaMantenimientoActivoFijo.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelfecha_entregaMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		//jFormattedTextFieldfecha_entregaMantenimientoActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaMantenimientoActivoFijo= new JDateChooser();
		jDateChooserfecha_entregaMantenimientoActivoFijo.setEnabled(false);
		jDateChooserfecha_entregaMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaMantenimientoActivoFijo.setDate(new Date());
		jDateChooserfecha_entregaMantenimientoActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaMantenimientoActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonfecha_entregaMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtonfecha_entregaMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaMantenimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcostoMantenimientoActivoFijo = new JLabelMe();
		this.jLabelcostoMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoMantenimientoActivoFijo.setToolTipText("Costo");
		this.jLabelcostoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelcostoMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jTextFieldcostoMantenimientoActivoFijo= new JTextFieldMe();
		jTextFieldcostoMantenimientoActivoFijo.setEnabled(false);
		jTextFieldcostoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoMantenimientoActivoFijo.setText("0.0");

		this.jButtoncostoMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtoncostoMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtoncostoMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoMantenimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelresponsableMantenimientoActivoFijo = new JLabelMe();
		this.jLabelresponsableMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE+" : *");
		this.jLabelresponsableMantenimientoActivoFijo.setToolTipText("Responsable");
		this.jLabelresponsableMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelresponsableMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresponsableMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresponsableMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelresponsableMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jTextArearesponsableMantenimientoActivoFijo= new JTextAreaMe();
		jTextArearesponsableMantenimientoActivoFijo.setEnabled(false);
		jTextArearesponsableMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableMantenimientoActivoFijo.setLineWrap(true);
		jTextArearesponsableMantenimientoActivoFijo.setWrapStyleWord(true);
		jTextArearesponsableMantenimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesponsableMantenimientoActivoFijo.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextArearesponsableMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresponsableMantenimientoActivoFijo = new JScrollPane(jTextArearesponsableMantenimientoActivoFijo);
		jscrollPaneresponsableMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneresponsableMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneresponsableMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonresponsableMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonresponsableMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresponsableMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtonresponsableMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresponsableMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresponsableMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesponsableMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesponsableMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"responsableMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresponsableMantenimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelobservacionMantenimientoActivoFijo = new JLabelMe();
		this.jLabelobservacionMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION+" : *");
		this.jLabelobservacionMantenimientoActivoFijo.setToolTipText("Observacion");
		this.jLabelobservacionMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelobservacionMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jTextAreaobservacionMantenimientoActivoFijo= new JTextAreaMe();
		jTextAreaobservacionMantenimientoActivoFijo.setEnabled(false);
		jTextAreaobservacionMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionMantenimientoActivoFijo.setLineWrap(true);
		jTextAreaobservacionMantenimientoActivoFijo.setWrapStyleWord(true);
		jTextAreaobservacionMantenimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionMantenimientoActivoFijo.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionMantenimientoActivoFijo = new JScrollPane(jTextAreaobservacionMantenimientoActivoFijo);
		jscrollPaneobservacionMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonobservacionMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtonobservacionMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionMantenimientoActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMantenimientoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMantenimientoActivoFijo = new JLabelMe();
		this.jLabelid_empresaMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMantenimientoActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelid_empresaMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jComboBoxid_empresaMantenimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMantenimientoActivoFijo.setEnabled(false);

		this.jButtonid_empresaMantenimientoActivoFijo= new JButtonMe();
		this.jButtonid_empresaMantenimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMantenimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMantenimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMantenimientoActivoFijo.setText("Buscar");
		this.jButtonid_empresaMantenimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMantenimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMantenimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMantenimientoActivoFijo"));

		this.jButtonid_empresaMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMantenimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaMantenimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaMantenimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMantenimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMantenimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMantenimientoActivoFijoUpdate.setText("U");
		this.jButtonid_empresaMantenimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMantenimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMantenimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMantenimientoActivoFijoUpdate"));



					
		this.jLabelid_sucursalMantenimientoActivoFijo = new JLabelMe();
		this.jLabelid_sucursalMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalMantenimientoActivoFijo.setToolTipText("Sucursal");
		this.jLabelid_sucursalMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelid_sucursalMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jComboBoxid_sucursalMantenimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_sucursalMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalMantenimientoActivoFijo.setEnabled(false);

		this.jButtonid_sucursalMantenimientoActivoFijo= new JButtonMe();
		this.jButtonid_sucursalMantenimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMantenimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMantenimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMantenimientoActivoFijo.setText("Buscar");
		this.jButtonid_sucursalMantenimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalMantenimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMantenimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMantenimientoActivoFijo"));

		this.jButtonid_sucursalMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_sucursalMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_sucursalMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalMantenimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalMantenimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_sucursalMantenimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMantenimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMantenimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMantenimientoActivoFijoUpdate.setText("U");
		this.jButtonid_sucursalMantenimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalMantenimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMantenimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMantenimientoActivoFijoUpdate"));



					
		this.jLabelid_detalle_activo_fijoMantenimientoActivoFijo = new JLabelMe();
		this.jLabelid_detalle_activo_fijoMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO+" : *");
		this.jLabelid_detalle_activo_fijoMantenimientoActivoFijo.setToolTipText("Detalle Activo Fijo");
		this.jLabelid_detalle_activo_fijoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_activo_fijoMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_activo_fijoMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelid_detalle_activo_fijoMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijo= new JButtonMe();
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijo.setText("Buscar");
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoMantenimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoMantenimientoActivoFijo"));

		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate.setText("U");
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoMantenimientoActivoFijoUpdate"));



					
		this.jLabelid_tipo_movimientoMantenimientoActivoFijo = new JLabelMe();
		this.jLabelid_tipo_movimientoMantenimientoActivoFijo.setText(""+MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoMantenimientoActivoFijo.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoMantenimientoActivoFijo.setToolTipText(MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		this.jPanelid_tipo_movimientoMantenimientoActivoFijo.setLayout(this.gridaBagLayoutMantenimientoActivoFijo);


		jComboBoxid_tipo_movimientoMantenimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoMantenimientoActivoFijo= new JButtonMe();
		this.jButtonid_tipo_movimientoMantenimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoMantenimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoMantenimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoMantenimientoActivoFijo.setText("Buscar");
		this.jButtonid_tipo_movimientoMantenimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoMantenimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoMantenimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoMantenimientoActivoFijo"));

		this.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoMantenimientoActivoFijoBusqueda"));

		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate.setText("U");
		this.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoMantenimientoActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleMantenimientoActivoFijo = new MantenimientoActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Mantenimiento Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMantenimientoActivoFijo= new GridBagLayout();
		

		
		String sToolTipMantenimientoActivoFijo="";
		sToolTipMantenimientoActivoFijo=MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMantenimientoActivoFijo+="(ActivosFijos.MantenimientoActivoFijo)";
		}
		
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipMantenimientoActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMantenimientoActivoFijo = new JButtonMe();
		this.jButtonModificarMantenimientoActivoFijo = new JButtonMe();
        this.jButtonActualizarMantenimientoActivoFijo = new JButtonMe();
        this.jButtonEliminarMantenimientoActivoFijo = new JButtonMe();
        this.jButtonCancelarMantenimientoActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosMantenimientoActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaMantenimientoActivoFijo = new JButtonMe();
		this.jButtonCerrarMantenimientoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosMantenimientoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionMantenimientoActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralMantenimientoActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Mantenimiento Activo Fijo";
		
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimiento Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosMantenimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMantenimientoActivoFijo.setName("jPanelCamposMantenimientoActivoFijo"); 

		this.jPanelCamposOcultosMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMantenimientoActivoFijo.setName("jPanelCamposOcultosMantenimientoActivoFijo"); 

        this.jPanelAccionesMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMantenimientoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesMantenimientoActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMantenimientoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMantenimientoActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMantenimientoActivoFijo.setText("Nuevo");
		this.jButtonModificarMantenimientoActivoFijo.setText("Editar");
        this.jButtonActualizarMantenimientoActivoFijo.setText("Actualizar");
        this.jButtonEliminarMantenimientoActivoFijo.setText("Eliminar");
        this.jButtonCancelarMantenimientoActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosMantenimientoActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.setText("Guardar");
		this.jButtonCerrarMantenimientoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMantenimientoActivoFijo,"nuevo_button","Nuevo",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMantenimientoActivoFijo,"modificar_button","Editar",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMantenimientoActivoFijo,"actualizar_button","Actualizar",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMantenimientoActivoFijo,"eliminar_button","Eliminar",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMantenimientoActivoFijo,"cancelar_button","Cancelar",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMantenimientoActivoFijo,"guardarcambios_button","Guardar",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMantenimientoActivoFijo,"guardarcambiostabla_button","Guardar",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMantenimientoActivoFijo,"cerrar_button","Salir",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMantenimientoActivoFijo.setToolTipText("Nuevo"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMantenimientoActivoFijo.setToolTipText("Editar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMantenimientoActivoFijo.setToolTipText("Actualizar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMantenimientoActivoFijo.setToolTipText("Eliminar)"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMantenimientoActivoFijo.setToolTipText("Cancelar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMantenimientoActivoFijo.setToolTipText("Guardar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.setToolTipText("Guardar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMantenimientoActivoFijo.setToolTipText("Salir"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMantenimientoActivoFijo";
		inputMap = this.jButtonNuevoMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMantenimientoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMantenimientoActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMantenimientoActivoFijo";
		inputMap = this.jButtonActualizarMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMantenimientoActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarMantenimientoActivoFijo";
		inputMap = this.jButtonEliminarMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMantenimientoActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarMantenimientoActivoFijo";
		inputMap = this.jButtonCancelarMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMantenimientoActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarMantenimientoActivoFijo";
		inputMap = this.jButtonCerrarMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMantenimientoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMantenimientoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMantenimientoActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMantenimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMantenimientoActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMantenimientoActivoFijo.setToolTipText("Nuevo MantenimientoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMantenimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMantenimientoActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMantenimientoActivoFijo.setToolTipText("Sin Cerrar Ventana MantenimientoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMantenimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMantenimientoActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMantenimientoActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMantenimientoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesMantenimientoActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMantenimientoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesMantenimientoActivoFijo.setText("Acciones");		
		this.jLabelAccionesMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMantenimientoActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMantenimientoActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMantenimientoActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMantenimientoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMantenimientoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMantenimientoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMantenimientoActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMantenimientoActivoFijo = new GridBagLayout();
		
		this.jPanelCamposMantenimientoActivoFijo.setLayout(gridaBagLayoutCamposMantenimientoActivoFijo);
		this.jPanelCamposOcultosMantenimientoActivoFijo.setLayout(gridaBagLayoutCamposOcultosMantenimientoActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMantenimientoActivoFijo.add(jLabelIdMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMantenimientoActivoFijo.add(jLabelidMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMantenimientoActivoFijo.add(jLabelid_empresaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMantenimientoActivoFijo.add(jButtonid_empresaMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMantenimientoActivoFijo.add(jButtonid_empresaMantenimientoActivoFijoUpdate, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMantenimientoActivoFijo.add(jComboBoxid_empresaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalMantenimientoActivoFijo.add(jLabelid_sucursalMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMantenimientoActivoFijo.add(jButtonid_sucursalMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMantenimientoActivoFijo.add(jButtonid_sucursalMantenimientoActivoFijoUpdate, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalMantenimientoActivoFijo.add(jComboBoxid_sucursalMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_activo_fijoMantenimientoActivoFijo.add(jLabelid_detalle_activo_fijoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoMantenimientoActivoFijo.add(jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoMantenimientoActivoFijo.add(jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_activo_fijoMantenimientoActivoFijo.add(jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoMantenimientoActivoFijo.add(jLabelid_tipo_movimientoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoMantenimientoActivoFijo.add(jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoMantenimientoActivoFijo.add(jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoMantenimientoActivoFijo.add(jComboBoxid_tipo_movimientoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoMantenimientoActivoFijo.add(jLabelnumero_documentoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoMantenimientoActivoFijo.add(jButtonnumero_documentoMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoMantenimientoActivoFijo.add(jTextFieldnumero_documentoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcausaMantenimientoActivoFijo.add(jLabelcausaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcausaMantenimientoActivoFijo.add(jButtoncausaMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcausaMantenimientoActivoFijo.add(jscrollPanecausaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelreferenciaMantenimientoActivoFijo.add(jLabelreferenciaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelreferenciaMantenimientoActivoFijo.add(jButtonreferenciaMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelreferenciaMantenimientoActivoFijo.add(jscrollPanereferenciaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltallerMantenimientoActivoFijo.add(jLabeltallerMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPaneltallerMantenimientoActivoFijo.add(jButtontallerMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltallerMantenimientoActivoFijo.add(jscrollPanetallerMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoMantenimientoActivoFijo.add(jLabeltelefonoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoMantenimientoActivoFijo.add(jButtontelefonoMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoMantenimientoActivoFijo.add(jscrollPanetelefonoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioMantenimientoActivoFijo.add(jLabelfecha_inicioMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioMantenimientoActivoFijo.add(jButtonfecha_inicioMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioMantenimientoActivoFijo.add(jDateChooserfecha_inicioMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaMantenimientoActivoFijo.add(jLabelfecha_entregaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaMantenimientoActivoFijo.add(jButtonfecha_entregaMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaMantenimientoActivoFijo.add(jDateChooserfecha_entregaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoMantenimientoActivoFijo.add(jLabelcostoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoMantenimientoActivoFijo.add(jButtoncostoMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoMantenimientoActivoFijo.add(jTextFieldcostoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresponsableMantenimientoActivoFijo.add(jLabelresponsableMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelresponsableMantenimientoActivoFijo.add(jButtonresponsableMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresponsableMantenimientoActivoFijo.add(jscrollPaneresponsableMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionMantenimientoActivoFijo.add(jLabelobservacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionMantenimientoActivoFijo.add(jButtonobservacionMantenimientoActivoFijoBusqueda, this.gridBagConstraintsMantenimientoActivoFijo);
	}

	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionMantenimientoActivoFijo.add(jscrollPaneobservacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPanelidMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPanelid_detalle_activo_fijoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPanelid_tipo_movimientoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPanelnumero_documentoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPanelcausaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPanelreferenciaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPaneltallerMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPaneltelefonoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPanelfecha_inicioMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPanelfecha_entregaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPanelcostoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPanelresponsableMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoActivoFijo.add(this.jPanelobservacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposMantenimientoActivoFijo % 2==0) {
		iXPanelCamposMantenimientoActivoFijo=0;
		iYPanelCamposMantenimientoActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposOcultosMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposOcultosMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMantenimientoActivoFijo.add(this.jPanelid_empresaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposOcultosMantenimientoActivoFijo % 2==0) {
		iXPanelCamposOcultosMantenimientoActivoFijo=0;
		iYPanelCamposOcultosMantenimientoActivoFijo++;
	}
	this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoActivoFijo.gridy = iYPanelCamposOcultosMantenimientoActivoFijo;
	this.gridBagConstraintsMantenimientoActivoFijo.gridx = iXPanelCamposOcultosMantenimientoActivoFijo++;
	this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMantenimientoActivoFijo.add(this.jPanelid_sucursalMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);



	if(iXPanelCamposOcultosMantenimientoActivoFijo % 2==0) {
		iXPanelCamposOcultosMantenimientoActivoFijo=0;
		iYPanelCamposOcultosMantenimientoActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesMantenimientoActivoFijo= new GridBagLayout();
		this.jPanelAccionesMantenimientoActivoFijo.setLayout(gridaBagLayoutAccionesMantenimientoActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMantenimientoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioMantenimientoActivoFijo.setLayout(gridaBagLayoutAccionesFormularioMantenimientoActivoFijo);
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMantenimientoActivoFijo.add(this.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMantenimientoActivoFijo.add(this.jCheckBoxPostAccionNuevoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMantenimientoActivoFijo.add(this.jCheckBoxPostAccionSinCerrarMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMantenimientoActivoFijo.add(this.jCheckBoxPostAccionSinMensajeMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesMantenimientoActivoFijo.add(this.jButtonModificarMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);							

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesMantenimientoActivoFijo.add(this.jButtonEliminarMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
			
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesMantenimientoActivoFijo.add(this.jButtonActualizarMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesMantenimientoActivoFijo.add(this.jButtonGuardarCambiosMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);	
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesMantenimientoActivoFijo.add(this.jButtonCancelarMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMantenimientoActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsMantenimientoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx =0;
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMantenimientoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MantenimientoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMantenimientoActivoFijo = new MantenimientoActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Mantenimiento Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Mantenimiento Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mantenimiento Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MantenimientoActivoFijoModel mantenimientoactivofijoModel=new MantenimientoActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//MantenimientoActivoFijoModel.MantenimientoActivoFijoFocusTraversalPolicy mantenimientoactivofijoFocusTraversalPolicy = mantenimientoactivofijoModel.new MantenimientoActivoFijoFocusTraversalPolicy(this);
			
			//mantenimientoactivofijoFocusTraversalPolicy.setmantenimientoactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(mantenimientoactivofijoModel);
			
			
			this.jContentPaneDetalleMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMantenimientoActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleMantenimientoActivoFijo.setLayout(gridaBagLayoutDetalleMantenimientoActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMantenimientoActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleMantenimientoActivoFijo.add(jTtoolBarDetalleMantenimientoActivoFijo, gridBagConstraintsMantenimientoActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionMantenimientoActivoFijo=   new JScrollPane(jContentPaneDetalleMantenimientoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMantenimientoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleMantenimientoActivoFijo.add(jPanelCamposMantenimientoActivoFijo, gridBagConstraintsMantenimientoActivoFijo);
			
			
			
			
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
						&& mantenimientoactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMantenimientoActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
						this.jContentPaneDetalleMantenimientoActivoFijo.add(this.jTabbedPaneRelacionesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMantenimientoActivoFijo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMantenimientoActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsMantenimientoActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleMantenimientoActivoFijo.add(jPanelCamposOcultosMantenimientoActivoFijo, gridBagConstraintsMantenimientoActivoFijo);
				
					this.jPanelCamposOcultosMantenimientoActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	        this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMantenimientoActivoFijo.add(this.jPanelAccionesFormularioMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);							
			
			
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleMantenimientoActivoFijo.add(this.jPanelAccionesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMantenimientoActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMantenimientoActivoFijo=   new JScrollPane(this.jPanelCamposMantenimientoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMantenimientoActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);			
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			
			
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
			
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMantenimientoActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionMantenimientoActivoFijo;
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
