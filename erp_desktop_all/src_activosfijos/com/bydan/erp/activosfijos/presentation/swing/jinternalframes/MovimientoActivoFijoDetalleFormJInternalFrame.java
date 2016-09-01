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
import com.bydan.erp.activosfijos.util.MovimientoActivoFijoConstantesFunciones;

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
public class MovimientoActivoFijoDetalleFormJInternalFrame extends MovimientoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMovimientoActivoFijo;
	
	protected JMenuBar jmenuBarDetalleMovimientoActivoFijo;
	
	protected JMenu jmenuDetalleMovimientoActivoFijo;
	protected JMenu jmenuDetalleArchivoMovimientoActivoFijo;
	protected JMenu jmenuDetalleAccionesMovimientoActivoFijo;
	protected JMenu jmenuDetalleDatosMovimientoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMovimientoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsMovimientoActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MovimientoActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleMovimientoActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected EmpresaBeanSwingJInternalFrame empresaorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresaorigen="";

	protected SucursalBeanSwingJInternalFrame sucursalorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursalorigen="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijoorigen="";

	protected EmpresaBeanSwingJInternalFrame empresadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresadestino="";

	protected SucursalBeanSwingJInternalFrame sucursaldestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursaldestino="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijodestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijodestino="";
	
	public MovimientoActivoFijoSessionBean movimientoactivofijoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public EmpresaSessionBean empresaorigenSessionBean;
	public SucursalSessionBean sucursalorigenSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoorigenSessionBean;
	public EmpresaSessionBean empresadestinoSessionBean;
	public SucursalSessionBean sucursaldestinoSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijodestinoSessionBean;	
	
	public MovimientoActivoFijoLogic movimientoactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosMovimientoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionMovimientoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralMovimientoActivoFijo;
	
	protected JPanel jPanelCamposMovimientoActivoFijo;    
	protected JPanel jPanelCamposOcultosMovimientoActivoFijo;    	
	protected JPanel jPanelAccionesMovimientoActivoFijo;
	protected JPanel jPanelAccionesFormularioMovimientoActivoFijo;
    
	
	
	protected Integer iXPanelCamposMovimientoActivoFijo=0;
	protected Integer iYPanelCamposMovimientoActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosMovimientoActivoFijo=0;
	protected Integer iYPanelCamposOcultosMovimientoActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMovimientoActivoFijo;
	public JButton jButtonModificarMovimientoActivoFijo;
	public JButton jButtonActualizarMovimientoActivoFijo;
    public JButton jButtonEliminarMovimientoActivoFijo;
	public JButton jButtonCancelarMovimientoActivoFijo;
    public JButton jButtonGuardarCambiosMovimientoActivoFijo;
	public JButton jButtonGuardarCambiosTablaMovimientoActivoFijo;
	protected JButton jButtonCerrarMovimientoActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionMovimientoActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMovimientoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMovimientoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMovimientoActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMovimientoActivoFijo;
	protected JButton jButtonModificarToolBarMovimientoActivoFijo;
	protected JButton jButtonActualizarToolBarMovimientoActivoFijo;
    protected JButton jButtonEliminarToolBarMovimientoActivoFijo;
	protected JButton jButtonCancelarToolBarMovimientoActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarMovimientoActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarMovimientoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarMovimientoActivoFijo;
	protected JButton jButtonCerrarToolBarMovimientoActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarMovimientoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMovimientoActivoFijo;
	protected JMenuItem jMenuItemModificarMovimientoActivoFijo;
	protected JMenuItem jMenuItemActualizarMovimientoActivoFijo;
    protected JMenuItem jMenuItemEliminarMovimientoActivoFijo;
	protected JMenuItem jMenuItemCancelarMovimientoActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosMovimientoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaMovimientoActivoFijo;
	protected JMenuItem jMenuItemCerrarMovimientoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarMovimientoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarMovimientoActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionMovimientoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMovimientoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarMovimientoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMovimientoActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMovimientoActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMovimientoActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMovimientoActivoFijo;
	public JLabel jLabelIdMovimientoActivoFijo;
	public JLabel jLabelidMovimientoActivoFijo;
	public JButton jButtonidMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialMovimientoActivoFijo;
	public JLabel jLabelsecuencialMovimientoActivoFijo;
	public JTextField jTextFieldsecuencialMovimientoActivoFijo;
	public JButton jButtonsecuencialMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfechaMovimientoActivoFijo;
	public JLabel jLabelfechaMovimientoActivoFijo;
	//public JFormattedTextField jDateChooserfechaMovimientoActivoFijo;

	public JDateChooser jDateChooserfechaMovimientoActivoFijo;
	public JButton jButtonfechaMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoMovimientoActivoFijo;
	public JLabel jLabelnumero_documentoMovimientoActivoFijo;
	public JTextField jTextFieldnumero_documentoMovimientoActivoFijo;
	public JButton jButtonnumero_documentoMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcostoMovimientoActivoFijo;
	public JLabel jLabelcostoMovimientoActivoFijo;
	public JTextField jTextFieldcostoMovimientoActivoFijo;
	public JButton jButtoncostoMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPaneldepreciacionMovimientoActivoFijo;
	public JLabel jLabeldepreciacionMovimientoActivoFijo;
	public JTextField jTextFielddepreciacionMovimientoActivoFijo;
	public JButton jButtondepreciacionMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcosto_origenMovimientoActivoFijo;
	public JLabel jLabelcosto_origenMovimientoActivoFijo;
	public JTextField jTextFieldcosto_origenMovimientoActivoFijo;
	public JButton jButtoncosto_origenMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPaneldepreciacion_origenMovimientoActivoFijo;
	public JLabel jLabeldepreciacion_origenMovimientoActivoFijo;
	public JTextField jTextFielddepreciacion_origenMovimientoActivoFijo;
	public JButton jButtondepreciacion_origenMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelrazonMovimientoActivoFijo;
	public JLabel jLabelrazonMovimientoActivoFijo;
	public JTextArea jTextArearazonMovimientoActivoFijo;
	public JScrollPane jscrollPanerazonMovimientoActivoFijo;
	public JButton jButtonrazonMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionMovimientoActivoFijo;
	public JLabel jLabeldescripcionMovimientoActivoFijo;
	public JTextArea jTextAreadescripcionMovimientoActivoFijo;
	public JScrollPane jscrollPanedescripcionMovimientoActivoFijo;
	public JButton jButtondescripcionMovimientoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMovimientoActivoFijo;
	public JLabel jLabelid_empresaMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMovimientoActivoFijo;
	public JButton jButtonid_empresaMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalMovimientoActivoFijo;
	public JLabel jLabelid_sucursalMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalMovimientoActivoFijo;
	public JButton jButtonid_sucursalMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_sucursalMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioMovimientoActivoFijo;
	public JLabel jLabelid_usuarioMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioMovimientoActivoFijo;
	public JButton jButtonid_usuarioMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_usuarioMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_usuarioMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_empresa_origenMovimientoActivoFijo;
	public JLabel jLabelid_empresa_origenMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_origenMovimientoActivoFijo;
	public JButton jButtonid_empresa_origenMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_empresa_origenMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresa_origenMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursal_origenMovimientoActivoFijo;
	public JLabel jLabelid_sucursal_origenMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_origenMovimientoActivoFijo;
	public JButton jButtonid_sucursal_origenMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_sucursal_origenMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_origenMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_activo_fijo_origenMovimientoActivoFijo;
	public JLabel jLabelid_detalle_activo_fijo_origenMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo;
	public JButton jButtonid_detalle_activo_fijo_origenMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_empresa_destinoMovimientoActivoFijo;
	public JLabel jLabelid_empresa_destinoMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_destinoMovimientoActivoFijo;
	public JButton jButtonid_empresa_destinoMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_empresa_destinoMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresa_destinoMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursal_destinoMovimientoActivoFijo;
	public JLabel jLabelid_sucursal_destinoMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_destinoMovimientoActivoFijo;
	public JButton jButtonid_sucursal_destinoMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_sucursal_destinoMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_destinoMovimientoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_activo_fijo_destinoMovimientoActivoFijo;
	public JLabel jLabelid_detalle_activo_fijo_destinoMovimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo;
	public JButton jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMovimientoActivoFijo;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MovimientoActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMovimientoActivoFijo=new JPanel();
				this.jPanelAccionesFormularioMovimientoActivoFijo=new JPanel();
				this.jmenuBarDetalleMovimientoActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleMovimientoActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MovimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MovimientoActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MovimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MovimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMovimientoActivoFijo() {
		return this.jButtonActualizarToolBarMovimientoActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarMovimientoActivoFijo() {
		return this.jButtonEliminarToolBarMovimientoActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarMovimientoActivoFijo() {
		return this.jButtonCancelarToolBarMovimientoActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionMovimientoActivoFijo() {
		return this.jButtonProcesarInformacionMovimientoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMovimientoActivoFijo)	{
		this.jButtonProcesarInformacionMovimientoActivoFijo = jButtonProcesarInformacionMovimientoActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMovimientoActivoFijo() {
		return this.jComboBoxTiposAccionesMovimientoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMovimientoActivoFijo(
			JComboBox jComboBoxTiposRelacionesMovimientoActivoFijo) {
		this.jComboBoxTiposRelacionesMovimientoActivoFijo = jComboBoxTiposRelacionesMovimientoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMovimientoActivoFijo(
			JComboBox jComboBoxTiposAccionesMovimientoActivoFijo) {
		this.jComboBoxTiposAccionesMovimientoActivoFijo = jComboBoxTiposAccionesMovimientoActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMovimientoActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioMovimientoActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMovimientoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioMovimientoActivoFijo) {
		this.jComboBoxTiposAccionesFormularioMovimientoActivoFijo = jComboBoxTiposAccionesFormularioMovimientoActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.movimientoactivofijoSessionBean=new MovimientoActivoFijoSessionBean();
		
		this.movimientoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.movimientoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.movimientoactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MovimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MovimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MovimientoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Movimiento Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		MovimientoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMovimientoActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMovimientoActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarMovimientoActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMovimientoActivoFijo,this.jTtoolBarDetalleMovimientoActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMovimientoActivoFijo,this.jTtoolBarDetalleMovimientoActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMovimientoActivoFijo,this.jTtoolBarDetalleMovimientoActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMovimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMovimientoActivoFijo,this.jTtoolBarDetalleMovimientoActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMovimientoActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMovimientoActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMovimientoActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMovimientoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMovimientoActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMovimientoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMovimientoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMovimientoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMovimientoActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMovimientoActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMovimientoActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMovimientoActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMovimientoActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMovimientoActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMovimientoActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMovimientoActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMovimientoActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMovimientoActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMovimientoActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMovimientoActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMovimientoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMovimientoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMovimientoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMovimientoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMovimientoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMovimientoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMovimientoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMovimientoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMovimientoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMovimientoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMovimientoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMovimientoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMovimientoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMovimientoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMovimientoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMovimientoActivoFijo.add(this.jMenuItemDetalleCerrarMovimientoActivoFijo);
		
		this.jmenuDetalleAccionesMovimientoActivoFijo.add(this.jMenuItemActualizarMovimientoActivoFijo);
		this.jmenuDetalleAccionesMovimientoActivoFijo.add(this.jMenuItemEliminarMovimientoActivoFijo);
		this.jmenuDetalleAccionesMovimientoActivoFijo.add(this.jMenuItemCancelarMovimientoActivoFijo);		
		
		//this.jmenuDetalleDatosMovimientoActivoFijo.add(this.jMenuItemDetalleAbrirOrderByMovimientoActivoFijo);				
		this.jmenuDetalleDatosMovimientoActivoFijo.add(this.jMenuItemDetalleMostarOcultarMovimientoActivoFijo);				
				
		//this.jmenuDetalleAccionesMovimientoActivoFijo.add(this.jMenuItemGuardarCambiosMovimientoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMovimientoActivoFijo.add(this.jmenuDetalleArchivoMovimientoActivoFijo);		
		this.jmenuBarDetalleMovimientoActivoFijo.add(this.jmenuDetalleAccionesMovimientoActivoFijo);		
		this.jmenuBarDetalleMovimientoActivoFijo.add(this.jmenuDetalleDatosMovimientoActivoFijo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMovimientoActivoFijo);				
	}
	
	
	public void inicializarElementosCamposMovimientoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMovimientoActivoFijo = new JLabelMe();
		jLabelIdMovimientoActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMovimientoActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMovimientoActivoFijo= new GridBagLayout();

		this.jPanelidMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);

		jLabelidMovimientoActivoFijo = new JLabel();
		jLabelidMovimientoActivoFijo.setText("Id");

		jLabelidMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialMovimientoActivoFijo = new JLabelMe();
		this.jLabelsecuencialMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialMovimientoActivoFijo.setToolTipText("Secuencial");
		this.jLabelsecuencialMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelsecuencialMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jTextFieldsecuencialMovimientoActivoFijo= new JTextFieldMe();

		jTextFieldsecuencialMovimientoActivoFijo.setEnabled(false);
		jTextFieldsecuencialMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonsecuencialMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonsecuencialMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialMovimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfechaMovimientoActivoFijo = new JLabelMe();
		this.jLabelfechaMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaMovimientoActivoFijo.setToolTipText("Fecha");
		this.jLabelfechaMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelfechaMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		//jFormattedTextFieldfechaMovimientoActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfechaMovimientoActivoFijo= new JDateChooser();
		jDateChooserfechaMovimientoActivoFijo.setEnabled(false);
		jDateChooserfechaMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaMovimientoActivoFijo.setDate(new Date());
		jDateChooserfechaMovimientoActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaMovimientoActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonfechaMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonfechaMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaMovimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documentoMovimientoActivoFijo = new JLabelMe();
		this.jLabelnumero_documentoMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoMovimientoActivoFijo.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelnumero_documentoMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jTextFieldnumero_documentoMovimientoActivoFijo= new JTextFieldMe();

		jTextFieldnumero_documentoMovimientoActivoFijo.setEnabled(false);
		jTextFieldnumero_documentoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonnumero_documentoMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonnumero_documentoMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoMovimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcostoMovimientoActivoFijo = new JLabelMe();
		this.jLabelcostoMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoMovimientoActivoFijo.setToolTipText("Costo");
		this.jLabelcostoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelcostoMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jTextFieldcostoMovimientoActivoFijo= new JTextFieldMe();
		jTextFieldcostoMovimientoActivoFijo.setEnabled(false);
		jTextFieldcostoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoMovimientoActivoFijo.setText("0.0");

		this.jButtoncostoMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtoncostoMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoMovimientoActivoFijoBusqueda.setText("U");
		this.jButtoncostoMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoMovimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabeldepreciacionMovimientoActivoFijo = new JLabelMe();
		this.jLabeldepreciacionMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_DEPRECIACION+" : *");
		this.jLabeldepreciacionMovimientoActivoFijo.setToolTipText("Depreciacion");
		this.jLabeldepreciacionMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldepreciacionMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldepreciacionMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldepreciacionMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldepreciacionMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldepreciacionMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_DEPRECIACION);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPaneldepreciacionMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jTextFielddepreciacionMovimientoActivoFijo= new JTextFieldMe();
		jTextFielddepreciacionMovimientoActivoFijo.setEnabled(false);
		jTextFielddepreciacionMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddepreciacionMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddepreciacionMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddepreciacionMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddepreciacionMovimientoActivoFijo.setText("0.0");

		this.jButtondepreciacionMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtondepreciacionMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondepreciacionMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondepreciacionMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondepreciacionMovimientoActivoFijoBusqueda.setText("U");
		this.jButtondepreciacionMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondepreciacionMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondepreciacionMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddepreciacionMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddepreciacionMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"depreciacionMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondepreciacionMovimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcosto_origenMovimientoActivoFijo = new JLabelMe();
		this.jLabelcosto_origenMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_COSTOORIGEN+" : *");
		this.jLabelcosto_origenMovimientoActivoFijo.setToolTipText("Costo Origen");
		this.jLabelcosto_origenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_origenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_origenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_origenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_origenMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_origenMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_COSTOORIGEN);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelcosto_origenMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jTextFieldcosto_origenMovimientoActivoFijo= new JTextFieldMe();
		jTextFieldcosto_origenMovimientoActivoFijo.setEnabled(false);
		jTextFieldcosto_origenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_origenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_origenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_origenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_origenMovimientoActivoFijo.setText("0.0");

		this.jButtoncosto_origenMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtoncosto_origenMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_origenMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_origenMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_origenMovimientoActivoFijoBusqueda.setText("U");
		this.jButtoncosto_origenMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_origenMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_origenMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_origenMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_origenMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_origenMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_origenMovimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabeldepreciacion_origenMovimientoActivoFijo = new JLabelMe();
		this.jLabeldepreciacion_origenMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_DEPRECIACIONORIGEN+" : *");
		this.jLabeldepreciacion_origenMovimientoActivoFijo.setToolTipText("Depreciacion Origen");
		this.jLabeldepreciacion_origenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldepreciacion_origenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldepreciacion_origenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldepreciacion_origenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldepreciacion_origenMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldepreciacion_origenMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_DEPRECIACIONORIGEN);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPaneldepreciacion_origenMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jTextFielddepreciacion_origenMovimientoActivoFijo= new JTextFieldMe();
		jTextFielddepreciacion_origenMovimientoActivoFijo.setEnabled(false);
		jTextFielddepreciacion_origenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddepreciacion_origenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddepreciacion_origenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddepreciacion_origenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddepreciacion_origenMovimientoActivoFijo.setText("0.0");

		this.jButtondepreciacion_origenMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtondepreciacion_origenMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondepreciacion_origenMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondepreciacion_origenMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondepreciacion_origenMovimientoActivoFijoBusqueda.setText("U");
		this.jButtondepreciacion_origenMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondepreciacion_origenMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondepreciacion_origenMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddepreciacion_origenMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddepreciacion_origenMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"depreciacion_origenMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondepreciacion_origenMovimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelrazonMovimientoActivoFijo = new JLabelMe();
		this.jLabelrazonMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_RAZON+" : *");
		this.jLabelrazonMovimientoActivoFijo.setToolTipText("Razon");
		this.jLabelrazonMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrazonMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrazonMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrazonMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrazonMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrazonMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_RAZON);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelrazonMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jTextArearazonMovimientoActivoFijo= new JTextAreaMe();
		jTextArearazonMovimientoActivoFijo.setEnabled(false);
		jTextArearazonMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazonMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazonMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazonMovimientoActivoFijo.setLineWrap(true);
		jTextArearazonMovimientoActivoFijo.setWrapStyleWord(true);
		jTextArearazonMovimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearazonMovimientoActivoFijo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearazonMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanerazonMovimientoActivoFijo = new JScrollPane(jTextArearazonMovimientoActivoFijo);
		jscrollPanerazonMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerazonMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerazonMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonrazonMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonrazonMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrazonMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrazonMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrazonMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonrazonMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrazonMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrazonMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearazonMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearazonMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"razonMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrazonMovimientoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionMovimientoActivoFijo = new JLabelMe();
		this.jLabeldescripcionMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionMovimientoActivoFijo.setToolTipText("Descripcion");
		this.jLabeldescripcionMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPaneldescripcionMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jTextAreadescripcionMovimientoActivoFijo= new JTextAreaMe();
		jTextAreadescripcionMovimientoActivoFijo.setEnabled(false);
		jTextAreadescripcionMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionMovimientoActivoFijo.setLineWrap(true);
		jTextAreadescripcionMovimientoActivoFijo.setWrapStyleWord(true);
		jTextAreadescripcionMovimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionMovimientoActivoFijo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionMovimientoActivoFijo = new JScrollPane(jTextAreadescripcionMovimientoActivoFijo);
		jscrollPanedescripcionMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtondescripcionMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionMovimientoActivoFijoBusqueda.setText("U");
		this.jButtondescripcionMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionMovimientoActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMovimientoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMovimientoActivoFijo = new JLabelMe();
		this.jLabelid_empresaMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMovimientoActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelid_empresaMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jComboBoxid_empresaMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMovimientoActivoFijo.setEnabled(false);

		this.jButtonid_empresaMovimientoActivoFijo= new JButtonMe();
		this.jButtonid_empresaMovimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientoActivoFijo.setText("Buscar");
		this.jButtonid_empresaMovimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMovimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientoActivoFijo"));

		this.jButtonid_empresaMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMovimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaMovimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaMovimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMovimientoActivoFijoUpdate.setText("U");
		this.jButtonid_empresaMovimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMovimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientoActivoFijoUpdate"));



					
		this.jLabelid_sucursalMovimientoActivoFijo = new JLabelMe();
		this.jLabelid_sucursalMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalMovimientoActivoFijo.setToolTipText("Sucursal");
		this.jLabelid_sucursalMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelid_sucursalMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jComboBoxid_sucursalMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_sucursalMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalMovimientoActivoFijo.setEnabled(false);

		this.jButtonid_sucursalMovimientoActivoFijo= new JButtonMe();
		this.jButtonid_sucursalMovimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientoActivoFijo.setText("Buscar");
		this.jButtonid_sucursalMovimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalMovimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientoActivoFijo"));

		this.jButtonid_sucursalMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_sucursalMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_sucursalMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalMovimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalMovimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_sucursalMovimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMovimientoActivoFijoUpdate.setText("U");
		this.jButtonid_sucursalMovimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalMovimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientoActivoFijoUpdate"));



					
		this.jLabelid_usuarioMovimientoActivoFijo = new JLabelMe();
		this.jLabelid_usuarioMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioMovimientoActivoFijo.setToolTipText("Usuario");
		this.jLabelid_usuarioMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelid_usuarioMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jComboBoxid_usuarioMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_usuarioMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioMovimientoActivoFijo.setEnabled(false);

		this.jButtonid_usuarioMovimientoActivoFijo= new JButtonMe();
		this.jButtonid_usuarioMovimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioMovimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioMovimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioMovimientoActivoFijo.setText("Buscar");
		this.jButtonid_usuarioMovimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioMovimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioMovimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioMovimientoActivoFijo"));

		this.jButtonid_usuarioMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_usuarioMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_usuarioMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioMovimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_usuarioMovimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_usuarioMovimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioMovimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioMovimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioMovimientoActivoFijoUpdate.setText("U");
		this.jButtonid_usuarioMovimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioMovimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioMovimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioMovimientoActivoFijoUpdate"));



					
		this.jLabelid_empresa_origenMovimientoActivoFijo = new JLabelMe();
		this.jLabelid_empresa_origenMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESAORIGEN+" : *");
		this.jLabelid_empresa_origenMovimientoActivoFijo.setToolTipText("Empresa Origen");
		this.jLabelid_empresa_origenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresa_origenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresa_origenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_origenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresa_origenMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresa_origenMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESAORIGEN);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelid_empresa_origenMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jComboBoxid_empresa_origenMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_empresa_origenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_origenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_origenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_origenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empresa_origenMovimientoActivoFijo= new JButtonMe();
		this.jButtonid_empresa_origenMovimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_origenMovimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_origenMovimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_origenMovimientoActivoFijo.setText("Buscar");
		this.jButtonid_empresa_origenMovimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresa_origenMovimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_origenMovimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresa_origenMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_origenMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_origenMovimientoActivoFijo"));

		this.jButtonid_empresa_origenMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresa_origenMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_origenMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_origenMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_origenMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_empresa_origenMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresa_origenMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_origenMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresa_origenMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_origenMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_origenMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresa_origenMovimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresa_origenMovimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresa_origenMovimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_origenMovimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_origenMovimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_origenMovimientoActivoFijoUpdate.setText("U");
		this.jButtonid_empresa_origenMovimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresa_origenMovimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_origenMovimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresa_origenMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_origenMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_origenMovimientoActivoFijoUpdate"));



					
		this.jLabelid_sucursal_origenMovimientoActivoFijo = new JLabelMe();
		this.jLabelid_sucursal_origenMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSALORIGEN+" : *");
		this.jLabelid_sucursal_origenMovimientoActivoFijo.setToolTipText("Sucursal Origen");
		this.jLabelid_sucursal_origenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_origenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_origenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_origenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursal_origenMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursal_origenMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSALORIGEN);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelid_sucursal_origenMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jComboBoxid_sucursal_origenMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_sucursal_origenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_origenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_origenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_origenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sucursal_origenMovimientoActivoFijo= new JButtonMe();
		this.jButtonid_sucursal_origenMovimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_origenMovimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_origenMovimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_origenMovimientoActivoFijo.setText("Buscar");
		this.jButtonid_sucursal_origenMovimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursal_origenMovimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_origenMovimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursal_origenMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_origenMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_origenMovimientoActivoFijo"));

		this.jButtonid_sucursal_origenMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_sucursal_origenMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_origenMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_origenMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_origenMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_sucursal_origenMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursal_origenMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_origenMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursal_origenMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_origenMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_origenMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursal_origenMovimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_sucursal_origenMovimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_sucursal_origenMovimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_origenMovimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_origenMovimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_origenMovimientoActivoFijoUpdate.setText("U");
		this.jButtonid_sucursal_origenMovimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursal_origenMovimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_origenMovimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursal_origenMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_origenMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_origenMovimientoActivoFijoUpdate"));



					
		this.jLabelid_detalle_activo_fijo_origenMovimientoActivoFijo = new JLabelMe();
		this.jLabelid_detalle_activo_fijo_origenMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJOORIGEN+" : *");
		this.jLabelid_detalle_activo_fijo_origenMovimientoActivoFijo.setToolTipText("Detalle Activo Fijo Origen");
		this.jLabelid_detalle_activo_fijo_origenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_activo_fijo_origenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_activo_fijo_origenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijo_origenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_activo_fijo_origenMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_activo_fijo_origenMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJOORIGEN);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelid_detalle_activo_fijo_origenMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijo= new JButtonMe();
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijo.setText("Buscar");
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijo_origenMovimientoActivoFijo"));

		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoUpdate.setText("U");
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijo_origenMovimientoActivoFijoUpdate"));



					
		this.jLabelid_empresa_destinoMovimientoActivoFijo = new JLabelMe();
		this.jLabelid_empresa_destinoMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESADESTINO+" : *");
		this.jLabelid_empresa_destinoMovimientoActivoFijo.setToolTipText("Empresa Destino");
		this.jLabelid_empresa_destinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empresa_destinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empresa_destinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_destinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresa_destinoMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresa_destinoMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESADESTINO);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelid_empresa_destinoMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jComboBoxid_empresa_destinoMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_empresa_destinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_destinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empresa_destinoMovimientoActivoFijo= new JButtonMe();
		this.jButtonid_empresa_destinoMovimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_destinoMovimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_destinoMovimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_destinoMovimientoActivoFijo.setText("Buscar");
		this.jButtonid_empresa_destinoMovimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresa_destinoMovimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_destinoMovimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresa_destinoMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_destinoMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_destinoMovimientoActivoFijo"));

		this.jButtonid_empresa_destinoMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresa_destinoMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_destinoMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_empresa_destinoMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresa_destinoMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_destinoMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresa_destinoMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_destinoMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_destinoMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresa_destinoMovimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresa_destinoMovimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresa_destinoMovimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoMovimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoMovimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_destinoMovimientoActivoFijoUpdate.setText("U");
		this.jButtonid_empresa_destinoMovimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresa_destinoMovimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_destinoMovimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresa_destinoMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_destinoMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_destinoMovimientoActivoFijoUpdate"));



					
		this.jLabelid_sucursal_destinoMovimientoActivoFijo = new JLabelMe();
		this.jLabelid_sucursal_destinoMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSALDESTINO+" : *");
		this.jLabelid_sucursal_destinoMovimientoActivoFijo.setToolTipText("Sucursal Destino");
		this.jLabelid_sucursal_destinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_destinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_destinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_destinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursal_destinoMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursal_destinoMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSALDESTINO);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelid_sucursal_destinoMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jComboBoxid_sucursal_destinoMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_sucursal_destinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_destinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_destinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_destinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sucursal_destinoMovimientoActivoFijo= new JButtonMe();
		this.jButtonid_sucursal_destinoMovimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_destinoMovimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_destinoMovimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_destinoMovimientoActivoFijo.setText("Buscar");
		this.jButtonid_sucursal_destinoMovimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursal_destinoMovimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_destinoMovimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursal_destinoMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_destinoMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_destinoMovimientoActivoFijo"));

		this.jButtonid_sucursal_destinoMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_sucursal_destinoMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_destinoMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_destinoMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_destinoMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_sucursal_destinoMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursal_destinoMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_destinoMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursal_destinoMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_destinoMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_destinoMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursal_destinoMovimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_sucursal_destinoMovimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_sucursal_destinoMovimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_destinoMovimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_destinoMovimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_destinoMovimientoActivoFijoUpdate.setText("U");
		this.jButtonid_sucursal_destinoMovimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursal_destinoMovimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_destinoMovimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursal_destinoMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_destinoMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_destinoMovimientoActivoFijoUpdate"));



					
		this.jLabelid_detalle_activo_fijo_destinoMovimientoActivoFijo = new JLabelMe();
		this.jLabelid_detalle_activo_fijo_destinoMovimientoActivoFijo.setText(""+MovimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJODESTINO+" : *");
		this.jLabelid_detalle_activo_fijo_destinoMovimientoActivoFijo.setToolTipText("Detalle Activo Fijo Destino");
		this.jLabelid_detalle_activo_fijo_destinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_activo_fijo_destinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_activo_fijo_destinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijo_destinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_activo_fijo_destinoMovimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_activo_fijo_destinoMovimientoActivoFijo.setToolTipText(MovimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJODESTINO);
		this.gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		this.jPanelid_detalle_activo_fijo_destinoMovimientoActivoFijo.setLayout(this.gridaBagLayoutMovimientoActivoFijo);


		jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijo= new JButtonMe();
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijo.setText("Buscar");
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijo_destinoMovimientoActivoFijo"));

		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda.setText("U");
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda"));

		if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoUpdate.setText("U");
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijo_destinoMovimientoActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleMovimientoActivoFijo = new MovimientoActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Movimiento Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMovimientoActivoFijo= new GridBagLayout();
		

		
		String sToolTipMovimientoActivoFijo="";
		sToolTipMovimientoActivoFijo=MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMovimientoActivoFijo+="(ActivosFijos.MovimientoActivoFijo)";
		}
		
		if(!this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipMovimientoActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMovimientoActivoFijo = new JButtonMe();
		this.jButtonModificarMovimientoActivoFijo = new JButtonMe();
        this.jButtonActualizarMovimientoActivoFijo = new JButtonMe();
        this.jButtonEliminarMovimientoActivoFijo = new JButtonMe();
        this.jButtonCancelarMovimientoActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosMovimientoActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaMovimientoActivoFijo = new JButtonMe();
		this.jButtonCerrarMovimientoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosMovimientoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionMovimientoActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralMovimientoActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Movimiento Activo Fijo";
		
		if(!this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosMovimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMovimientoActivoFijo.setName("jPanelCamposMovimientoActivoFijo"); 

		this.jPanelCamposOcultosMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMovimientoActivoFijo.setName("jPanelCamposOcultosMovimientoActivoFijo"); 

        this.jPanelAccionesMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMovimientoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesMovimientoActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMovimientoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMovimientoActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMovimientoActivoFijo.setText("Nuevo");
		this.jButtonModificarMovimientoActivoFijo.setText("Editar");
        this.jButtonActualizarMovimientoActivoFijo.setText("Actualizar");
        this.jButtonEliminarMovimientoActivoFijo.setText("Eliminar");
        this.jButtonCancelarMovimientoActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosMovimientoActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaMovimientoActivoFijo.setText("Guardar");
		this.jButtonCerrarMovimientoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMovimientoActivoFijo,"nuevo_button","Nuevo",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMovimientoActivoFijo,"modificar_button","Editar",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMovimientoActivoFijo,"actualizar_button","Actualizar",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMovimientoActivoFijo,"eliminar_button","Eliminar",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMovimientoActivoFijo,"cancelar_button","Cancelar",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMovimientoActivoFijo,"guardarcambios_button","Guardar",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMovimientoActivoFijo,"guardarcambiostabla_button","Guardar",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMovimientoActivoFijo,"cerrar_button","Salir",this.movimientoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMovimientoActivoFijo.setToolTipText("Nuevo"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMovimientoActivoFijo.setToolTipText("Editar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMovimientoActivoFijo.setToolTipText("Actualizar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMovimientoActivoFijo.setToolTipText("Eliminar)"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMovimientoActivoFijo.setToolTipText("Cancelar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMovimientoActivoFijo.setToolTipText("Guardar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMovimientoActivoFijo.setToolTipText("Guardar"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMovimientoActivoFijo.setToolTipText("Salir"+" "+MovimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMovimientoActivoFijo";
		inputMap = this.jButtonNuevoMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMovimientoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMovimientoActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMovimientoActivoFijo";
		inputMap = this.jButtonActualizarMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMovimientoActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarMovimientoActivoFijo";
		inputMap = this.jButtonEliminarMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMovimientoActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarMovimientoActivoFijo";
		inputMap = this.jButtonCancelarMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMovimientoActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarMovimientoActivoFijo";
		inputMap = this.jButtonCerrarMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMovimientoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMovimientoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaMovimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMovimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMovimientoActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMovimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMovimientoActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMovimientoActivoFijo.setToolTipText("Nuevo MovimientoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMovimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMovimientoActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMovimientoActivoFijo.setToolTipText("Sin Cerrar Ventana MovimientoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMovimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMovimientoActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMovimientoActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMovimientoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesMovimientoActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMovimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMovimientoActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMovimientoActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMovimientoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesMovimientoActivoFijo.setText("Acciones");		
		this.jLabelAccionesMovimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMovimientoActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMovimientoActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMovimientoActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesMovimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMovimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMovimientoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMovimientoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMovimientoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMovimientoActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMovimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMovimientoActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMovimientoActivoFijo = new GridBagLayout();
		
		this.jPanelCamposMovimientoActivoFijo.setLayout(gridaBagLayoutCamposMovimientoActivoFijo);
		this.jPanelCamposOcultosMovimientoActivoFijo.setLayout(gridaBagLayoutCamposOcultosMovimientoActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMovimientoActivoFijo.add(jLabelIdMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMovimientoActivoFijo.add(jLabelidMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMovimientoActivoFijo.add(jLabelid_empresaMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMovimientoActivoFijo.add(jButtonid_empresaMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMovimientoActivoFijo.add(jButtonid_empresaMovimientoActivoFijoUpdate, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMovimientoActivoFijo.add(jComboBoxid_empresaMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalMovimientoActivoFijo.add(jLabelid_sucursalMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMovimientoActivoFijo.add(jButtonid_sucursalMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMovimientoActivoFijo.add(jButtonid_sucursalMovimientoActivoFijoUpdate, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalMovimientoActivoFijo.add(jComboBoxid_sucursalMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioMovimientoActivoFijo.add(jLabelid_usuarioMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioMovimientoActivoFijo.add(jButtonid_usuarioMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioMovimientoActivoFijo.add(jButtonid_usuarioMovimientoActivoFijoUpdate, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioMovimientoActivoFijo.add(jComboBoxid_usuarioMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialMovimientoActivoFijo.add(jLabelsecuencialMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialMovimientoActivoFijo.add(jButtonsecuencialMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialMovimientoActivoFijo.add(jTextFieldsecuencialMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresa_origenMovimientoActivoFijo.add(jLabelid_empresa_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_origenMovimientoActivoFijo.add(jButtonid_empresa_origenMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_origenMovimientoActivoFijo.add(jButtonid_empresa_origenMovimientoActivoFijoUpdate, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresa_origenMovimientoActivoFijo.add(jComboBoxid_empresa_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursal_origenMovimientoActivoFijo.add(jLabelid_sucursal_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_origenMovimientoActivoFijo.add(jButtonid_sucursal_origenMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_origenMovimientoActivoFijo.add(jButtonid_sucursal_origenMovimientoActivoFijoUpdate, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursal_origenMovimientoActivoFijo.add(jComboBoxid_sucursal_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_activo_fijo_origenMovimientoActivoFijo.add(jLabelid_detalle_activo_fijo_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijo_origenMovimientoActivoFijo.add(jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijo_origenMovimientoActivoFijo.add(jButtonid_detalle_activo_fijo_origenMovimientoActivoFijoUpdate, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_activo_fijo_origenMovimientoActivoFijo.add(jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresa_destinoMovimientoActivoFijo.add(jLabelid_empresa_destinoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_destinoMovimientoActivoFijo.add(jButtonid_empresa_destinoMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_destinoMovimientoActivoFijo.add(jButtonid_empresa_destinoMovimientoActivoFijoUpdate, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresa_destinoMovimientoActivoFijo.add(jComboBoxid_empresa_destinoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursal_destinoMovimientoActivoFijo.add(jLabelid_sucursal_destinoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_destinoMovimientoActivoFijo.add(jButtonid_sucursal_destinoMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_destinoMovimientoActivoFijo.add(jButtonid_sucursal_destinoMovimientoActivoFijoUpdate, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursal_destinoMovimientoActivoFijo.add(jComboBoxid_sucursal_destinoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_activo_fijo_destinoMovimientoActivoFijo.add(jLabelid_detalle_activo_fijo_destinoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijo_destinoMovimientoActivoFijo.add(jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 3;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijo_destinoMovimientoActivoFijo.add(jButtonid_detalle_activo_fijo_destinoMovimientoActivoFijoUpdate, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_activo_fijo_destinoMovimientoActivoFijo.add(jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaMovimientoActivoFijo.add(jLabelfechaMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaMovimientoActivoFijo.add(jButtonfechaMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaMovimientoActivoFijo.add(jDateChooserfechaMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoMovimientoActivoFijo.add(jLabelnumero_documentoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoMovimientoActivoFijo.add(jButtonnumero_documentoMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoMovimientoActivoFijo.add(jTextFieldnumero_documentoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoMovimientoActivoFijo.add(jLabelcostoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoMovimientoActivoFijo.add(jButtoncostoMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoMovimientoActivoFijo.add(jTextFieldcostoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldepreciacionMovimientoActivoFijo.add(jLabeldepreciacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldepreciacionMovimientoActivoFijo.add(jButtondepreciacionMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldepreciacionMovimientoActivoFijo.add(jTextFielddepreciacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_origenMovimientoActivoFijo.add(jLabelcosto_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_origenMovimientoActivoFijo.add(jButtoncosto_origenMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_origenMovimientoActivoFijo.add(jTextFieldcosto_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldepreciacion_origenMovimientoActivoFijo.add(jLabeldepreciacion_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldepreciacion_origenMovimientoActivoFijo.add(jButtondepreciacion_origenMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldepreciacion_origenMovimientoActivoFijo.add(jTextFielddepreciacion_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrazonMovimientoActivoFijo.add(jLabelrazonMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelrazonMovimientoActivoFijo.add(jButtonrazonMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrazonMovimientoActivoFijo.add(jscrollPanerazonMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionMovimientoActivoFijo.add(jLabeldescripcionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 2;
		this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
		this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionMovimientoActivoFijo.add(jButtondescripcionMovimientoActivoFijoBusqueda, this.gridBagConstraintsMovimientoActivoFijo);
	}

	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = 1;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionMovimientoActivoFijo.add(jscrollPanedescripcionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelidMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelsecuencialMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelid_empresa_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelid_sucursal_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelid_detalle_activo_fijo_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelid_empresa_destinoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelid_sucursal_destinoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelid_detalle_activo_fijo_destinoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelfechaMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelnumero_documentoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelcostoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPaneldepreciacionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelcosto_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPaneldepreciacion_origenMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPanelrazonMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientoActivoFijo.add(this.jPaneldescripcionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposMovimientoActivoFijo % 2==0) {
		iXPanelCamposMovimientoActivoFijo=0;
		iYPanelCamposMovimientoActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposOcultosMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposOcultosMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMovimientoActivoFijo.add(this.jPanelid_empresaMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposOcultosMovimientoActivoFijo % 2==0) {
		iXPanelCamposOcultosMovimientoActivoFijo=0;
		iYPanelCamposOcultosMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposOcultosMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposOcultosMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMovimientoActivoFijo.add(this.jPanelid_sucursalMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposOcultosMovimientoActivoFijo % 2==0) {
		iXPanelCamposOcultosMovimientoActivoFijo=0;
		iYPanelCamposOcultosMovimientoActivoFijo++;
	}
	this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoActivoFijo.gridy = iYPanelCamposOcultosMovimientoActivoFijo;
	this.gridBagConstraintsMovimientoActivoFijo.gridx = iXPanelCamposOcultosMovimientoActivoFijo++;
	this.gridBagConstraintsMovimientoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMovimientoActivoFijo.add(this.jPanelid_usuarioMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);



	if(iXPanelCamposOcultosMovimientoActivoFijo % 2==0) {
		iXPanelCamposOcultosMovimientoActivoFijo=0;
		iYPanelCamposOcultosMovimientoActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesMovimientoActivoFijo= new GridBagLayout();
		this.jPanelAccionesMovimientoActivoFijo.setLayout(gridaBagLayoutAccionesMovimientoActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMovimientoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioMovimientoActivoFijo.setLayout(gridaBagLayoutAccionesFormularioMovimientoActivoFijo);
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMovimientoActivoFijo.add(this.jComboBoxTiposAccionesFormularioMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMovimientoActivoFijo.add(this.jCheckBoxPostAccionNuevoMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.movimientoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMovimientoActivoFijo.add(this.jCheckBoxPostAccionSinCerrarMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.movimientoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMovimientoActivoFijo.add(this.jCheckBoxPostAccionSinMensajeMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesMovimientoActivoFijo.add(this.jButtonModificarMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);							

		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMovimientoActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesMovimientoActivoFijo.add(this.jButtonEliminarMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
			
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesMovimientoActivoFijo.add(this.jButtonActualizarMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);


		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesMovimientoActivoFijo.add(this.jButtonGuardarCambiosMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);	
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = 0;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesMovimientoActivoFijo.add(this.jButtonCancelarMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMovimientoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMovimientoActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsMovimientoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMovimientoActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMovimientoActivoFijo.gridx =0;
		this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMovimientoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MovimientoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMovimientoActivoFijo = new MovimientoActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Movimiento Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Movimiento Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Movimiento Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MovimientoActivoFijoModel movimientoactivofijoModel=new MovimientoActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//MovimientoActivoFijoModel.MovimientoActivoFijoFocusTraversalPolicy movimientoactivofijoFocusTraversalPolicy = movimientoactivofijoModel.new MovimientoActivoFijoFocusTraversalPolicy(this);
			
			//movimientoactivofijoFocusTraversalPolicy.setmovimientoactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(movimientoactivofijoModel);
			
			
			this.jContentPaneDetalleMovimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMovimientoActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleMovimientoActivoFijo.setLayout(gridaBagLayoutDetalleMovimientoActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMovimientoActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleMovimientoActivoFijo.add(jTtoolBarDetalleMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionMovimientoActivoFijo=   new JScrollPane(jContentPaneDetalleMovimientoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMovimientoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleMovimientoActivoFijo.add(jPanelCamposMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);
			
			
			
			
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
						&& movimientoactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.movimientoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMovimientoActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
						this.jContentPaneDetalleMovimientoActivoFijo.add(this.jTabbedPaneRelacionesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMovimientoActivoFijo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMovimientoActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsMovimientoActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleMovimientoActivoFijo.add(jPanelCamposOcultosMovimientoActivoFijo, gridBagConstraintsMovimientoActivoFijo);
				
					this.jPanelCamposOcultosMovimientoActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	        this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMovimientoActivoFijo.add(this.jPanelAccionesFormularioMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);							
			
			
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleMovimientoActivoFijo.add(this.jPanelAccionesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMovimientoActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMovimientoActivoFijo=   new JScrollPane(this.jPanelCamposMovimientoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMovimientoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
			this.gridBagConstraintsMovimientoActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMovimientoActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMovimientoActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);			
			
			this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMovimientoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
			
			
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		
			
		this.gridBagConstraintsMovimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMovimientoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMovimientoActivoFijo, this.gridBagConstraintsMovimientoActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMovimientoActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionMovimientoActivoFijo;
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
