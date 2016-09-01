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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.DetalleLiquidacionImpuestoImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class DetalleLiquidacionImpuestoImporDetalleFormJInternalFrame extends DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleLiquidacionImpuestoImpor;
	
	protected JMenuBar jmenuBarDetalleDetalleLiquidacionImpuestoImpor;
	
	protected JMenu jmenuDetalleDetalleLiquidacionImpuestoImpor;
	protected JMenu jmenuDetalleArchivoDetalleLiquidacionImpuestoImpor;
	protected JMenu jmenuDetalleAccionesDetalleLiquidacionImpuestoImpor;
	protected JMenu jmenuDetalleDatosDetalleLiquidacionImpuestoImpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleLiquidacionImpuestoImpor;	
	protected GridBagConstraints gridBagConstraintsDetalleLiquidacionImpuestoImpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleLiquidacionImpuestoImpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected LiquidacionImpuestoImporBeanSwingJInternalFrame liquidacionimpuestoimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_liquidacionimpuestoimpor="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public DetalleLiquidacionImpuestoImporSessionBean detalleliquidacionimpuestoimporSessionBean;
	
	
	
	
	public LiquidacionImpuestoImporSessionBean liquidacionimpuestoimporSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public DetalleLiquidacionImpuestoImporLogic detalleliquidacionimpuestoimporLogic;
	
	public JScrollPane jScrollPanelDatosDetalleLiquidacionImpuestoImpor;
	public JScrollPane jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor;
	public JScrollPane jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor;
	
	protected JPanel jPanelCamposDetalleLiquidacionImpuestoImpor;    
	protected JPanel jPanelCamposOcultosDetalleLiquidacionImpuestoImpor;    	
	protected JPanel jPanelAccionesDetalleLiquidacionImpuestoImpor;
	protected JPanel jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor;
    
	
	
	protected Integer iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
	protected Integer iYPanelCamposDetalleLiquidacionImpuestoImpor=0;
	
	protected Integer iXPanelCamposOcultosDetalleLiquidacionImpuestoImpor=0;
	protected Integer iYPanelCamposOcultosDetalleLiquidacionImpuestoImpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleLiquidacionImpuestoImpor;
	public JButton jButtonModificarDetalleLiquidacionImpuestoImpor;
	public JButton jButtonActualizarDetalleLiquidacionImpuestoImpor;
    public JButton jButtonEliminarDetalleLiquidacionImpuestoImpor;
	public JButton jButtonCancelarDetalleLiquidacionImpuestoImpor;
    public JButton jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor;
	public JButton jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonCerrarDetalleLiquidacionImpuestoImpor;
	
	
	protected JButton jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleLiquidacionImpuestoImpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpuestoImpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpuestoImpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonModificarToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonActualizarToolBarDetalleLiquidacionImpuestoImpor;
    protected JButton jButtonEliminarToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonCancelarToolBarDetalleLiquidacionImpuestoImpor;
    protected JButton jButtonGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonCerrarToolBarDetalleLiquidacionImpuestoImpor;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleLiquidacionImpuestoImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemModificarDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemActualizarDetalleLiquidacionImpuestoImpor;
    protected JMenuItem jMenuItemEliminarDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemCancelarDetalleLiquidacionImpuestoImpor;
    protected JMenuItem jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemCerrarDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleLiquidacionImpuestoImpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelIdDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelidDetalleLiquidacionImpuestoImpor;
	public JButton jButtonidDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelcantidadDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldcantidadDetalleLiquidacionImpuestoImpor;
	public JButton jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelvalorDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelvalorDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldvalorDetalleLiquidacionImpuestoImpor;
	public JButton jButtonvalorDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelfobDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelfobDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldfobDetalleLiquidacionImpuestoImpor;
	public JButton jButtonfobDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_ivaDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor;
	public JButton jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_arancelDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor;
	public JButton jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_aplicarDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor;
	public JButton jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelfleteDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelfleteDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldfleteDetalleLiquidacionImpuestoImpor;
	public JButton jButtonfleteDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelseguroDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelseguroDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldseguroDetalleLiquidacionImpuestoImpor;
	public JButton jButtonseguroDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelbase_imponibleDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelbase_imponibleDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor;
	public JButton jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelvalor_arancelDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelvalor_arancelDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor;
	public JButton jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelvalor_fodiDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelvalor_fodiDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor;
	public JButton jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelvalor_ivaDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelvalor_ivaDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor;
	public JButton jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor;
	public JButton jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_fodiDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor;
	public JButton jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelvalor_imponibleDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor;
	public JTextField jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor;
	public JButton jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor;
	public JButton jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelid_empresaDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleLiquidacionImpuestoImpor;
	public JButton jButtonid_empresaDetalleLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelid_sucursalDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor;
	public JButton jButtonid_sucursalDetalleLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor;
	
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
	public int iHeightFormulario=484;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleLiquidacionImpuestoImporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleLiquidacionImpuestoImpor=new JPanel();
				this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor=new JPanel();
				this.jmenuBarDetalleDetalleLiquidacionImpuestoImpor=new JMenuBar();
				this.jTtoolBarDetalleDetalleLiquidacionImpuestoImpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImpuestoImporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleLiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleLiquidacionImpuestoImporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleLiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImpuestoImporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleLiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImpuestoImporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleLiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImpuestoImporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleLiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleLiquidacionImpuestoImpor() {
		return this.jButtonActualizarToolBarDetalleLiquidacionImpuestoImpor;
	}
	
	public JButton getjButtonEliminarToolBarDetalleLiquidacionImpuestoImpor() {
		return this.jButtonEliminarToolBarDetalleLiquidacionImpuestoImpor;
	}
	
	public JButton getjButtonCancelarToolBarDetalleLiquidacionImpuestoImpor() {
		return this.jButtonCancelarToolBarDetalleLiquidacionImpuestoImpor;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleLiquidacionImpuestoImpor() {
		return this.jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor)	{
		this.jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor = jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor) {
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor = jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor) {
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor = jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor) {
		this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor = jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
		
		this.detalleliquidacionimpuestoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleliquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleLiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleLiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleLiquidacionImpuestoImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Liquidacion Impuesto Impor MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleLiquidacionImpuestoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleLiquidacionImpuestoImpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleLiquidacionImpuestoImpor=new JButtonMe();
				this.jButtonModificarToolBarDetalleLiquidacionImpuestoImpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleDetalleLiquidacionImpuestoImpor,
							"actualizar","actualizar","Actualizar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleDetalleLiquidacionImpuestoImpor,
							"eliminar","eliminar","Eliminar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleDetalleLiquidacionImpuestoImpor,
							"cancelar","cancelar","Cancelar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleDetalleLiquidacionImpuestoImpor,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleLiquidacionImpuestoImpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleLiquidacionImpuestoImpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleLiquidacionImpuestoImpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleLiquidacionImpuestoImpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleLiquidacionImpuestoImpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleLiquidacionImpuestoImpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleLiquidacionImpuestoImpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleLiquidacionImpuestoImpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleLiquidacionImpuestoImpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleLiquidacionImpuestoImpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleLiquidacionImpuestoImpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleLiquidacionImpuestoImpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleLiquidacionImpuestoImpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleLiquidacionImpuestoImpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleLiquidacionImpuestoImpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleLiquidacionImpuestoImpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleLiquidacionImpuestoImpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleLiquidacionImpuestoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleLiquidacionImpuestoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleLiquidacionImpuestoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleLiquidacionImpuestoImpor.add(this.jMenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor);
		
		this.jmenuDetalleAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemActualizarDetalleLiquidacionImpuestoImpor);
		this.jmenuDetalleAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemEliminarDetalleLiquidacionImpuestoImpor);
		this.jmenuDetalleAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemCancelarDetalleLiquidacionImpuestoImpor);		
		
		//this.jmenuDetalleDatosDetalleLiquidacionImpuestoImpor.add(this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpuestoImpor);				
		this.jmenuDetalleDatosDetalleLiquidacionImpuestoImpor.add(this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor);				
				
		//this.jmenuDetalleAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleLiquidacionImpuestoImpor.add(this.jmenuDetalleArchivoDetalleLiquidacionImpuestoImpor);		
		this.jmenuBarDetalleDetalleLiquidacionImpuestoImpor.add(this.jmenuDetalleAccionesDetalleLiquidacionImpuestoImpor);		
		this.jmenuBarDetalleDetalleLiquidacionImpuestoImpor.add(this.jmenuDetalleDatosDetalleLiquidacionImpuestoImpor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleLiquidacionImpuestoImpor);				
	}
	
	
	public void inicializarElementosCamposDetalleLiquidacionImpuestoImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleLiquidacionImpuestoImpor = new JLabelMe();
		jLabelIdDetalleLiquidacionImpuestoImpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleLiquidacionImpuestoImpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor= new GridBagLayout();

		this.jPanelidDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);

		jLabelidDetalleLiquidacionImpuestoImpor = new JLabel();
		jLabelidDetalleLiquidacionImpuestoImpor.setText("Id");

		jLabelidDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelcantidadDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleLiquidacionImpuestoImpor.setToolTipText("Cantad");
		this.jLabelcantidadDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelcantidadDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldcantidadDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setText("0");

		this.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelvalorDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelvalorDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorDetalleLiquidacionImpuestoImpor.setToolTipText("Valor");
		this.jLabelvalorDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelvalorDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldvalorDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldvalorDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldvalorDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelfobDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelfobDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB+" : *");
		this.jLabelfobDetalleLiquidacionImpuestoImpor.setToolTipText("Fob");
		this.jLabelfobDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfobDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfobDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfobDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfobDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfobDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelfobDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldfobDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldfobDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldfobDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfobDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfobDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfobDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfobDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonfobDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonfobDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfobDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfobDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfobDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonfobDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfobDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfobDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfobDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfobDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fobDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfobDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA+" : *");
		this.jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor.setToolTipText("Porcentaje Iva");
		this.jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_ivaDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_ivaDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelporcentaje_ivaDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL+" : *");
		this.jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor.setToolTipText("Porcentaje Arancel");
		this.jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_arancelDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_arancelDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelporcentaje_arancelDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR+" : *");
		this.jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setToolTipText("Porcentaje Aplicar");
		this.jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_aplicarDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelfleteDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelfleteDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteDetalleLiquidacionImpuestoImpor.setToolTipText("Flete");
		this.jLabelfleteDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelfleteDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldfleteDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldfleteDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldfleteDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelseguroDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelseguroDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO+" : *");
		this.jLabelseguroDetalleLiquidacionImpuestoImpor.setToolTipText("Seguro");
		this.jLabelseguroDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelseguroDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelseguroDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelseguroDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelseguroDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelseguroDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelseguroDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldseguroDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldseguroDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldseguroDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldseguroDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldseguroDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldseguroDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldseguroDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldseguroDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldseguroDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"seguroDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelbase_imponibleDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelbase_imponibleDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE+" : *");
		this.jLabelbase_imponibleDetalleLiquidacionImpuestoImpor.setToolTipText("Base Imponible");
		this.jLabelbase_imponibleDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_imponibleDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_imponibleDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_imponibleDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelbase_imponibleDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_imponibleDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelvalor_arancelDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelvalor_arancelDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL+" : *");
		this.jLabelvalor_arancelDetalleLiquidacionImpuestoImpor.setToolTipText("Valor Arancel");
		this.jLabelvalor_arancelDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_arancelDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_arancelDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_arancelDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_arancelDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_arancelDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelvalor_arancelDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_arancelDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelvalor_fodiDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelvalor_fodiDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI+" : *");
		this.jLabelvalor_fodiDetalleLiquidacionImpuestoImpor.setToolTipText("Valor Fodi");
		this.jLabelvalor_fodiDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_fodiDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_fodiDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_fodiDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_fodiDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_fodiDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelvalor_fodiDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_fodiDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelvalor_ivaDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelvalor_ivaDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA+" : *");
		this.jLabelvalor_ivaDetalleLiquidacionImpuestoImpor.setToolTipText("Valor Iva");
		this.jLabelvalor_ivaDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ivaDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ivaDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_ivaDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_ivaDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_ivaDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelvalor_ivaDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_ivaDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelnumero_comprobanteDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setText("0");

		this.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI+" : *");
		this.jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor.setToolTipText("Porcentaje Fodi");
		this.jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_fodiDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_fodiDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelporcentaje_fodiDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE+" : *");
		this.jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor.setToolTipText("Valor Imponible");
		this.jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_imponibleDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_imponibleDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelvalor_imponibleDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_imponibleDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleLiquidacionImpuestoImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR+" : *");
		this.jLabelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setToolTipText("Liquacion Impuesto Impor");
		this.jLabelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor"));

		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}

		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate= new JButtonMe();
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate.setText("U");
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate"));



					
		this.jLabelid_empresaDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelid_empresaDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleLiquidacionImpuestoImpor.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelid_empresaDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jComboBoxid_empresaDetalleLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setEnabled(false);

		this.jButtonid_empresaDetalleLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonid_empresaDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonid_empresaDetalleLiquidacionImpuestoImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleLiquidacionImpuestoImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleLiquidacionImpuestoImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleLiquidacionImpuestoImpor"));

		this.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate.setText("U");
		this.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleLiquidacionImpuestoImporUpdate"));



					
		this.jLabelid_sucursalDetalleLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelid_sucursalDetalleLiquidacionImpuestoImpor.setText(""+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleLiquidacionImpuestoImpor.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleLiquidacionImpuestoImpor.setToolTipText(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelid_sucursalDetalleLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpuestoImpor);


		jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setEnabled(false);

		this.jButtonid_sucursalDetalleLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleLiquidacionImpuestoImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleLiquidacionImpuestoImpor"));

		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleLiquidacionImpuestoImporBusqueda"));

		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate.setText("U");
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleLiquidacionImpuestoImporUpdate"));



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
		//this.jInternalFrameDetalleDetalleLiquidacionImpuestoImpor = new DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Liquidacion Impuesto Impor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor= new GridBagLayout();
		

		
		String sToolTipDetalleLiquidacionImpuestoImpor="";
		sToolTipDetalleLiquidacionImpuestoImpor=DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleLiquidacionImpuestoImpor+="(Importaciones.DetalleLiquidacionImpuestoImpor)";
		}
		
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleLiquidacionImpuestoImpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonModificarDetalleLiquidacionImpuestoImpor = new JButtonMe();
        this.jButtonActualizarDetalleLiquidacionImpuestoImpor = new JButtonMe();
        this.jButtonEliminarDetalleLiquidacionImpuestoImpor = new JButtonMe();
        this.jButtonCancelarDetalleLiquidacionImpuestoImpor = new JButtonMe();
        this.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonCerrarDetalleLiquidacionImpuestoImpor = new JButtonMe();
		
		this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Liquidacion Impuesto Impor";
		
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impuesto Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleLiquidacionImpuestoImpor.setName("jPanelCamposDetalleLiquidacionImpuestoImpor"); 

		this.jPanelCamposOcultosDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleLiquidacionImpuestoImpor.setName("jPanelCamposOcultosDetalleLiquidacionImpuestoImpor"); 

        this.jPanelAccionesDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleLiquidacionImpuestoImpor.setToolTipText("Acciones");
        this.jPanelAccionesDetalleLiquidacionImpuestoImpor.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleLiquidacionImpuestoImpor.setText("Nuevo");
		this.jButtonModificarDetalleLiquidacionImpuestoImpor.setText("Editar");
        this.jButtonActualizarDetalleLiquidacionImpuestoImpor.setText("Actualizar");
        this.jButtonEliminarDetalleLiquidacionImpuestoImpor.setText("Eliminar");
        this.jButtonCancelarDetalleLiquidacionImpuestoImpor.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.setText("Guardar");
		this.jButtonCerrarDetalleLiquidacionImpuestoImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleLiquidacionImpuestoImpor,"nuevo_button","Nuevo",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleLiquidacionImpuestoImpor,"modificar_button","Editar",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleLiquidacionImpuestoImpor,"actualizar_button","Actualizar",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleLiquidacionImpuestoImpor,"eliminar_button","Eliminar",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleLiquidacionImpuestoImpor,"cancelar_button","Cancelar",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor,"guardarcambios_button","Guardar",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor,"guardarcambiostabla_button","Guardar",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleLiquidacionImpuestoImpor,"cerrar_button","Salir",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleLiquidacionImpuestoImpor.setToolTipText("Nuevo"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleLiquidacionImpuestoImpor.setToolTipText("Editar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleLiquidacionImpuestoImpor.setToolTipText("Actualizar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleLiquidacionImpuestoImpor.setToolTipText("Eliminar)"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleLiquidacionImpuestoImpor.setToolTipText("Cancelar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor.setToolTipText("Guardar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.setToolTipText("Guardar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleLiquidacionImpuestoImpor.setToolTipText("Salir"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleLiquidacionImpuestoImpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonActualizarDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleLiquidacionImpuestoImpor"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonEliminarDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleLiquidacionImpuestoImpor"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonCancelarDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleLiquidacionImpuestoImpor"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonCerrarDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleLiquidacionImpuestoImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleLiquidacionImpuestoImpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleLiquidacionImpuestoImpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleLiquidacionImpuestoImpor.setToolTipText("Nuevo DetalleLiquidacionImpuestoImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpuestoImpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpuestoImpor.setToolTipText("Sin Cerrar Ventana DetalleLiquidacionImpuestoImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpuestoImpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpuestoImpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setText("Accion");
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleLiquidacionImpuestoImpor = new JLabelMe();
		
		this.jLabelAccionesDetalleLiquidacionImpuestoImpor.setText("Acciones");		
		this.jLabelAccionesDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleLiquidacionImpuestoImpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleLiquidacionImpuestoImpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		
		this.jPanelCamposDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutCamposDetalleLiquidacionImpuestoImpor);
		this.jPanelCamposOcultosDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutCamposOcultosDetalleLiquidacionImpuestoImpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleLiquidacionImpuestoImpor.add(jLabelIdDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleLiquidacionImpuestoImpor.add(jLabelidDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.add(jLabelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.add(jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 3;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.add(jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.add(jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleLiquidacionImpuestoImpor.add(jLabelid_empresaDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleLiquidacionImpuestoImpor.add(jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 3;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleLiquidacionImpuestoImpor.add(jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleLiquidacionImpuestoImpor.add(jComboBoxid_empresaDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleLiquidacionImpuestoImpor.add(jLabelid_sucursalDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleLiquidacionImpuestoImpor.add(jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 3;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleLiquidacionImpuestoImpor.add(jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleLiquidacionImpuestoImpor.add(jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleLiquidacionImpuestoImpor.add(jLabelcantidadDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleLiquidacionImpuestoImpor.add(jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleLiquidacionImpuestoImpor.add(jTextFieldcantidadDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorDetalleLiquidacionImpuestoImpor.add(jLabelvalorDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorDetalleLiquidacionImpuestoImpor.add(jButtonvalorDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorDetalleLiquidacionImpuestoImpor.add(jTextFieldvalorDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfobDetalleLiquidacionImpuestoImpor.add(jLabelfobDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfobDetalleLiquidacionImpuestoImpor.add(jButtonfobDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfobDetalleLiquidacionImpuestoImpor.add(jTextFieldfobDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_ivaDetalleLiquidacionImpuestoImpor.add(jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_ivaDetalleLiquidacionImpuestoImpor.add(jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_ivaDetalleLiquidacionImpuestoImpor.add(jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_arancelDetalleLiquidacionImpuestoImpor.add(jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_arancelDetalleLiquidacionImpuestoImpor.add(jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_arancelDetalleLiquidacionImpuestoImpor.add(jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_aplicarDetalleLiquidacionImpuestoImpor.add(jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_aplicarDetalleLiquidacionImpuestoImpor.add(jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_aplicarDetalleLiquidacionImpuestoImpor.add(jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteDetalleLiquidacionImpuestoImpor.add(jLabelfleteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteDetalleLiquidacionImpuestoImpor.add(jButtonfleteDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteDetalleLiquidacionImpuestoImpor.add(jTextFieldfleteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelseguroDetalleLiquidacionImpuestoImpor.add(jLabelseguroDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelseguroDetalleLiquidacionImpuestoImpor.add(jButtonseguroDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelseguroDetalleLiquidacionImpuestoImpor.add(jTextFieldseguroDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_imponibleDetalleLiquidacionImpuestoImpor.add(jLabelbase_imponibleDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_imponibleDetalleLiquidacionImpuestoImpor.add(jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_imponibleDetalleLiquidacionImpuestoImpor.add(jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_arancelDetalleLiquidacionImpuestoImpor.add(jLabelvalor_arancelDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_arancelDetalleLiquidacionImpuestoImpor.add(jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_arancelDetalleLiquidacionImpuestoImpor.add(jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_fodiDetalleLiquidacionImpuestoImpor.add(jLabelvalor_fodiDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_fodiDetalleLiquidacionImpuestoImpor.add(jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_fodiDetalleLiquidacionImpuestoImpor.add(jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_ivaDetalleLiquidacionImpuestoImpor.add(jLabelvalor_ivaDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_ivaDetalleLiquidacionImpuestoImpor.add(jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_ivaDetalleLiquidacionImpuestoImpor.add(jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteDetalleLiquidacionImpuestoImpor.add(jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteDetalleLiquidacionImpuestoImpor.add(jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteDetalleLiquidacionImpuestoImpor.add(jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_fodiDetalleLiquidacionImpuestoImpor.add(jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_fodiDetalleLiquidacionImpuestoImpor.add(jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_fodiDetalleLiquidacionImpuestoImpor.add(jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_imponibleDetalleLiquidacionImpuestoImpor.add(jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_imponibleDetalleLiquidacionImpuestoImpor.add(jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_imponibleDetalleLiquidacionImpuestoImpor.add(jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelidDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelcantidadDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelvalorDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelfobDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelporcentaje_ivaDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelporcentaje_arancelDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelporcentaje_aplicarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelfleteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelseguroDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelbase_imponibleDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelvalor_arancelDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelvalor_fodiDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelvalor_ivaDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelnumero_comprobanteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelporcentaje_fodiDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpuestoImpor.add(this.jPanelvalor_imponibleDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposDetalleLiquidacionImpuestoImpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposOcultosDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposOcultosDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleLiquidacionImpuestoImpor.add(this.jPanelid_empresaDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposOcultosDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposOcultosDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposOcultosDetalleLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iYPanelCamposOcultosDetalleLiquidacionImpuestoImpor;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iXPanelCamposOcultosDetalleLiquidacionImpuestoImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleLiquidacionImpuestoImpor.add(this.jPanelid_sucursalDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);



	if(iXPanelCamposOcultosDetalleLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposOcultosDetalleLiquidacionImpuestoImpor=0;
		iYPanelCamposOcultosDetalleLiquidacionImpuestoImpor++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleLiquidacionImpuestoImpor= new GridBagLayout();
		this.jPanelAccionesDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutAccionesDetalleLiquidacionImpuestoImpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleLiquidacionImpuestoImpor= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutAccionesFormularioDetalleLiquidacionImpuestoImpor);
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor.add(this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor.add(this.jCheckBoxPostAccionNuevoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor.add(this.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor.add(this.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleLiquidacionImpuestoImpor.add(this.jButtonModificarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);							

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleLiquidacionImpuestoImpor.add(this.jButtonEliminarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
			
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleLiquidacionImpuestoImpor.add(this.jButtonActualizarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleLiquidacionImpuestoImpor.add(this.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);	
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleLiquidacionImpuestoImpor.add(this.jButtonCancelarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleLiquidacionImpuestoImpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();						
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;		
			//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleLiquidacionImpuestoImpor = new DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Liquidacion Impuesto Impor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Liquidacion Impuesto Impor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Liquidacion Impuesto Impor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleLiquidacionImpuestoImporModel detalleliquidacionimpuestoimporModel=new DetalleLiquidacionImpuestoImporModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleLiquidacionImpuestoImporModel.DetalleLiquidacionImpuestoImporFocusTraversalPolicy detalleliquidacionimpuestoimporFocusTraversalPolicy = detalleliquidacionimpuestoimporModel.new DetalleLiquidacionImpuestoImporFocusTraversalPolicy(this);
			
			//detalleliquidacionimpuestoimporFocusTraversalPolicy.setdetalleliquidacionimpuestoimporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleliquidacionimpuestoimporModel);
			
			
			this.jContentPaneDetalleDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleLiquidacionImpuestoImpor = new GridBagLayout();	
			this.jContentPaneDetalleDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutDetalleDetalleLiquidacionImpuestoImpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleLiquidacionImpuestoImpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
				this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleLiquidacionImpuestoImpor.add(jTtoolBarDetalleDetalleLiquidacionImpuestoImpor, gridBagConstraintsDetalleLiquidacionImpuestoImpor);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor=   new JScrollPane(jContentPaneDetalleDetalleLiquidacionImpuestoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	        
			this.jContentPaneDetalleDetalleLiquidacionImpuestoImpor.add(jPanelCamposDetalleLiquidacionImpuestoImpor, gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			
			
			
			
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
						&& detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleLiquidacionImpuestoImpor= new GridBagConstraints();
						this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
						this.jContentPaneDetalleDetalleLiquidacionImpuestoImpor.add(this.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleLiquidacionImpuestoImpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
					this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleLiquidacionImpuestoImpor.add(jPanelCamposOcultosDetalleLiquidacionImpuestoImpor, gridBagConstraintsDetalleLiquidacionImpuestoImpor);
				
					this.jPanelCamposOcultosDetalleLiquidacionImpuestoImpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	        this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleLiquidacionImpuestoImpor.add(this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);							
			
			
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
	        this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleLiquidacionImpuestoImpor.add(this.jPanelAccionesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor=   new JScrollPane(this.jPanelCamposDetalleLiquidacionImpuestoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);			
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			
			
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
			
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor;
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
