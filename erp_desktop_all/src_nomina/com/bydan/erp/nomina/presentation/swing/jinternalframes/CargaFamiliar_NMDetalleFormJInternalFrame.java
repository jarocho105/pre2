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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.CargaFamiliar_NMConstantesFunciones;

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
public class CargaFamiliar_NMDetalleFormJInternalFrame extends CargaFamiliar_NMBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCargaFamiliar_NM;
	
	protected JMenuBar jmenuBarDetalleCargaFamiliar_NM;
	
	protected JMenu jmenuDetalleCargaFamiliar_NM;
	protected JMenu jmenuDetalleArchivoCargaFamiliar_NM;
	protected JMenu jmenuDetalleAccionesCargaFamiliar_NM;
	protected JMenu jmenuDetalleDatosCargaFamiliar_NM;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCargaFamiliar_NM;	
	protected GridBagConstraints gridBagConstraintsCargaFamiliar_NM;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CargaFamiliar_NMBeanSwingJInternalFrameAdditional jInternalFrameDetalleCargaFamiliar_NM;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoCargaFamiBeanSwingJInternalFrame tipocargafamiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocargafami="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";
	
	public CargaFamiliar_NMSessionBean cargafamiliar_nmSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoCargaFamiSessionBean tipocargafamiSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;	
	
	public CargaFamiliar_NMLogic cargafamiliar_nmLogic;
	
	public JScrollPane jScrollPanelDatosCargaFamiliar_NM;
	public JScrollPane jScrollPanelDatosEdicionCargaFamiliar_NM;
	public JScrollPane jScrollPanelDatosGeneralCargaFamiliar_NM;
	
	protected JPanel jPanelCamposCargaFamiliar_NM;    
	protected JPanel jPanelCamposOcultosCargaFamiliar_NM;    	
	protected JPanel jPanelAccionesCargaFamiliar_NM;
	protected JPanel jPanelAccionesFormularioCargaFamiliar_NM;
    
	
	
	protected Integer iXPanelCamposCargaFamiliar_NM=0;
	protected Integer iYPanelCamposCargaFamiliar_NM=0;
	
	protected Integer iXPanelCamposOcultosCargaFamiliar_NM=0;
	protected Integer iYPanelCamposOcultosCargaFamiliar_NM=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCargaFamiliar_NM;
	public JButton jButtonModificarCargaFamiliar_NM;
	public JButton jButtonActualizarCargaFamiliar_NM;
    public JButton jButtonEliminarCargaFamiliar_NM;
	public JButton jButtonCancelarCargaFamiliar_NM;
    public JButton jButtonGuardarCambiosCargaFamiliar_NM;
	public JButton jButtonGuardarCambiosTablaCargaFamiliar_NM;
	protected JButton jButtonCerrarCargaFamiliar_NM;
	
	
	protected JButton jButtonProcesarInformacionCargaFamiliar_NM;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCargaFamiliar_NM;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCargaFamiliar_NM;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCargaFamiliar_NM;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCargaFamiliar_NM;
	protected JButton jButtonModificarToolBarCargaFamiliar_NM;
	protected JButton jButtonActualizarToolBarCargaFamiliar_NM;
    protected JButton jButtonEliminarToolBarCargaFamiliar_NM;
	protected JButton jButtonCancelarToolBarCargaFamiliar_NM;
    protected JButton jButtonGuardarCambiosToolBarCargaFamiliar_NM;
	protected JButton jButtonGuardarCambiosTablaToolBarCargaFamiliar_NM;
	protected JButton jButtonMostrarOcultarTablaToolBarCargaFamiliar_NM;
	protected JButton jButtonCerrarToolBarCargaFamiliar_NM;
	
	protected JButton jButtonProcesarInformacionToolBarCargaFamiliar_NM;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCargaFamiliar_NM;
	protected JMenuItem jMenuItemModificarCargaFamiliar_NM;
	protected JMenuItem jMenuItemActualizarCargaFamiliar_NM;
    protected JMenuItem jMenuItemEliminarCargaFamiliar_NM;
	protected JMenuItem jMenuItemCancelarCargaFamiliar_NM;
    protected JMenuItem jMenuItemGuardarCambiosCargaFamiliar_NM;
	protected JMenuItem jMenuItemGuardarCambiosTablaCargaFamiliar_NM;
	protected JMenuItem jMenuItemCerrarCargaFamiliar_NM;
	protected JMenuItem jMenuItemDetalleCerrarCargaFamiliar_NM;
	protected JMenuItem jMenuItemDetalleMostarOcultarCargaFamiliar_NM;
	
	protected JMenuItem jMenuItemProcesarInformacionCargaFamiliar_NM;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCargaFamiliar_NM;
	protected JMenuItem jMenuItemMostrarOcultarCargaFamiliar_NM;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCargaFamiliar_NM;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCargaFamiliar_NM;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCargaFamiliar_NM;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCargaFamiliar_NM;
	public JLabel jLabelIdCargaFamiliar_NM;
	public JLabel jLabelidCargaFamiliar_NM;
	public JButton jButtonidCargaFamiliar_NMBusqueda= new JButtonMe();

	public JPanel jPanelcedulaCargaFamiliar_NM;
	public JLabel jLabelcedulaCargaFamiliar_NM;
	public JTextField jTextFieldcedulaCargaFamiliar_NM;
	public JButton jButtoncedulaCargaFamiliar_NMBusqueda= new JButtonMe();

	public JPanel jPanelapellidoCargaFamiliar_NM;
	public JLabel jLabelapellidoCargaFamiliar_NM;
	public JTextArea jTextAreaapellidoCargaFamiliar_NM;
	public JScrollPane jscrollPaneapellidoCargaFamiliar_NM;
	public JButton jButtonapellidoCargaFamiliar_NMBusqueda= new JButtonMe();

	public JPanel jPanelnombreCargaFamiliar_NM;
	public JLabel jLabelnombreCargaFamiliar_NM;
	public JTextArea jTextAreanombreCargaFamiliar_NM;
	public JScrollPane jscrollPanenombreCargaFamiliar_NM;
	public JButton jButtonnombreCargaFamiliar_NMBusqueda= new JButtonMe();

	public JPanel jPaneldireccionCargaFamiliar_NM;
	public JLabel jLabeldireccionCargaFamiliar_NM;
	public JTextArea jTextAreadireccionCargaFamiliar_NM;
	public JScrollPane jscrollPanedireccionCargaFamiliar_NM;
	public JButton jButtondireccionCargaFamiliar_NMBusqueda= new JButtonMe();

	public JPanel jPanelfecha_nacimientoCargaFamiliar_NM;
	public JLabel jLabelfecha_nacimientoCargaFamiliar_NM;
	//public JFormattedTextField jDateChooserfecha_nacimientoCargaFamiliar_NM;

	public JDateChooser jDateChooserfecha_nacimientoCargaFamiliar_NM;
	public JButton jButtonfecha_nacimientoCargaFamiliar_NMBusqueda= new JButtonMe();

	public JPanel jPanelvalor_cupoCargaFamiliar_NM;
	public JLabel jLabelvalor_cupoCargaFamiliar_NM;
	public JTextField jTextFieldvalor_cupoCargaFamiliar_NM;
	public JButton jButtonvalor_cupoCargaFamiliar_NMBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCargaFamiliar_NM;
	public JLabel jLabelid_empresaCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCargaFamiliar_NM;
	public JButton jButtonid_empresaCargaFamiliar_NM= new JButtonMe();
	public JButton jButtonid_empresaCargaFamiliar_NMUpdate= new JButtonMe();
	public JButton jButtonid_empresaCargaFamiliar_NMBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoCargaFamiliar_NM;
	public JLabel jLabelid_empleadoCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoCargaFamiliar_NM;
	public JButton jButtonid_empleadoCargaFamiliar_NM= new JButtonMe();
	public JButton jButtonid_empleadoCargaFamiliar_NMUpdate= new JButtonMe();
	public JButton jButtonid_empleadoCargaFamiliar_NMBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_carga_famiCargaFamiliar_NM;
	public JLabel jLabelid_tipo_carga_famiCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_carga_famiCargaFamiliar_NM;
	public JButton jButtonid_tipo_carga_famiCargaFamiliar_NM= new JButtonMe();
	public JButton jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate= new JButtonMe();
	public JButton jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_generoCargaFamiliar_NM;
	public JLabel jLabelid_tipo_generoCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_generoCargaFamiliar_NM;
	public JButton jButtonid_tipo_generoCargaFamiliar_NM= new JButtonMe();
	public JButton jButtonid_tipo_generoCargaFamiliar_NMUpdate= new JButtonMe();
	public JButton jButtonid_tipo_generoCargaFamiliar_NMBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_civilCargaFamiliar_NM;
	public JLabel jLabelid_estado_civilCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_civilCargaFamiliar_NM;
	public JButton jButtonid_estado_civilCargaFamiliar_NM= new JButtonMe();
	public JButton jButtonid_estado_civilCargaFamiliar_NMUpdate= new JButtonMe();
	public JButton jButtonid_estado_civilCargaFamiliar_NMBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCargaFamiliar_NM;
	
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CargaFamiliar_NMDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCargaFamiliar_NM=new JPanel();
				this.jPanelAccionesFormularioCargaFamiliar_NM=new JPanel();
				this.jmenuBarDetalleCargaFamiliar_NM=new JMenuBar();
				this.jTtoolBarDetalleCargaFamiliar_NM=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliar_NMDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CargaFamiliar_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CargaFamiliar_NMDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CargaFamiliar_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliar_NMDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargaFamiliar_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliar_NMDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargaFamiliar_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliar_NMDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CargaFamiliar_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCargaFamiliar_NM() {
		return this.jButtonActualizarToolBarCargaFamiliar_NM;
	}
	
	public JButton getjButtonEliminarToolBarCargaFamiliar_NM() {
		return this.jButtonEliminarToolBarCargaFamiliar_NM;
	}
	
	public JButton getjButtonCancelarToolBarCargaFamiliar_NM() {
		return this.jButtonCancelarToolBarCargaFamiliar_NM;
	}		
	
	public JButton getjButtonProcesarInformacionCargaFamiliar_NM() {
		return this.jButtonProcesarInformacionCargaFamiliar_NM;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCargaFamiliar_NM)	{
		this.jButtonProcesarInformacionCargaFamiliar_NM = jButtonProcesarInformacionCargaFamiliar_NM;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCargaFamiliar_NM() {
		return this.jComboBoxTiposAccionesCargaFamiliar_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCargaFamiliar_NM(
			JComboBox jComboBoxTiposRelacionesCargaFamiliar_NM) {
		this.jComboBoxTiposRelacionesCargaFamiliar_NM = jComboBoxTiposRelacionesCargaFamiliar_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCargaFamiliar_NM(
			JComboBox jComboBoxTiposAccionesCargaFamiliar_NM) {
		this.jComboBoxTiposAccionesCargaFamiliar_NM = jComboBoxTiposAccionesCargaFamiliar_NM;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCargaFamiliar_NM() {
		return this.jComboBoxTiposAccionesFormularioCargaFamiliar_NM;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCargaFamiliar_NM(
			JComboBox jComboBoxTiposAccionesFormularioCargaFamiliar_NM) {
		this.jComboBoxTiposAccionesFormularioCargaFamiliar_NM = jComboBoxTiposAccionesFormularioCargaFamiliar_NM;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		
		this.cargafamiliar_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CargaFamiliar_NMJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Carga Familiar_ N M MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
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
	
		CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCargaFamiliar_NM= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCargaFamiliar_NM=new JButtonMe();
				this.jButtonModificarToolBarCargaFamiliar_NM=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCargaFamiliar_NM,this.jTtoolBarDetalleCargaFamiliar_NM,
							"actualizar","actualizar","Actualizar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCargaFamiliar_NM,this.jTtoolBarDetalleCargaFamiliar_NM,
							"eliminar","eliminar","Eliminar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCargaFamiliar_NM,this.jTtoolBarDetalleCargaFamiliar_NM,
							"cancelar","cancelar","Cancelar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCargaFamiliar_NM,this.jTtoolBarDetalleCargaFamiliar_NM,
							"guardarcambios","guardarcambios","Guardar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCargaFamiliar_NM=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCargaFamiliar_NM=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCargaFamiliar_NM=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCargaFamiliar_NM=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCargaFamiliar_NM=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCargaFamiliar_NM= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCargaFamiliar_NM.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCargaFamiliar_NM,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCargaFamiliar_NM= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCargaFamiliar_NM.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCargaFamiliar_NM,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCargaFamiliar_NM= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCargaFamiliar_NM.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCargaFamiliar_NM,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCargaFamiliar_NM= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCargaFamiliar_NM.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCargaFamiliar_NM,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCargaFamiliar_NM= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCargaFamiliar_NM.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCargaFamiliar_NM,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCargaFamiliar_NM= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCargaFamiliar_NM.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCargaFamiliar_NM,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCargaFamiliar_NM= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCargaFamiliar_NM.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCargaFamiliar_NM,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCargaFamiliar_NM= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCargaFamiliar_NM.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCargaFamiliar_NM,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCargaFamiliar_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCargaFamiliar_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCargaFamiliar_NM,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCargaFamiliar_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCargaFamiliar_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCargaFamiliar_NM,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCargaFamiliar_NM.add(this.jMenuItemDetalleCerrarCargaFamiliar_NM);
		
		this.jmenuDetalleAccionesCargaFamiliar_NM.add(this.jMenuItemActualizarCargaFamiliar_NM);
		this.jmenuDetalleAccionesCargaFamiliar_NM.add(this.jMenuItemEliminarCargaFamiliar_NM);
		this.jmenuDetalleAccionesCargaFamiliar_NM.add(this.jMenuItemCancelarCargaFamiliar_NM);		
		
		//this.jmenuDetalleDatosCargaFamiliar_NM.add(this.jMenuItemDetalleAbrirOrderByCargaFamiliar_NM);				
		this.jmenuDetalleDatosCargaFamiliar_NM.add(this.jMenuItemDetalleMostarOcultarCargaFamiliar_NM);				
				
		//this.jmenuDetalleAccionesCargaFamiliar_NM.add(this.jMenuItemGuardarCambiosCargaFamiliar_NM);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCargaFamiliar_NM.add(this.jmenuDetalleArchivoCargaFamiliar_NM);		
		this.jmenuBarDetalleCargaFamiliar_NM.add(this.jmenuDetalleAccionesCargaFamiliar_NM);		
		this.jmenuBarDetalleCargaFamiliar_NM.add(this.jmenuDetalleDatosCargaFamiliar_NM);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCargaFamiliar_NM);				
	}
	
	
	public void inicializarElementosCamposCargaFamiliar_NM() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCargaFamiliar_NM = new JLabelMe();
		jLabelIdCargaFamiliar_NM.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCargaFamiliar_NM = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCargaFamiliar_NM= new GridBagLayout();

		this.jPanelidCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);

		jLabelidCargaFamiliar_NM = new JLabel();
		jLabelidCargaFamiliar_NM.setText("Id");

		jLabelidCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcedulaCargaFamiliar_NM = new JLabelMe();
		this.jLabelcedulaCargaFamiliar_NM.setText(""+CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA+" : *");
		this.jLabelcedulaCargaFamiliar_NM.setToolTipText("Cedula");
		this.jLabelcedulaCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcedulaCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcedulaCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcedulaCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcedulaCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcedulaCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA);
		this.gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		this.jPanelcedulaCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);


		jTextFieldcedulaCargaFamiliar_NM= new JTextFieldMe();

		jTextFieldcedulaCargaFamiliar_NM.setEnabled(false);
		jTextFieldcedulaCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedulaCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedulaCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcedulaCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncedulaCargaFamiliar_NMBusqueda= new JButtonMe();
		this.jButtoncedulaCargaFamiliar_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedulaCargaFamiliar_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedulaCargaFamiliar_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncedulaCargaFamiliar_NMBusqueda.setText("U");
		this.jButtoncedulaCargaFamiliar_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncedulaCargaFamiliar_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncedulaCargaFamiliar_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcedulaCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcedulaCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cedulaCargaFamiliar_NMBusqueda"));

		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncedulaCargaFamiliar_NMBusqueda.setVisible(false);		}


					
		this.jLabelapellidoCargaFamiliar_NM = new JLabelMe();
		this.jLabelapellidoCargaFamiliar_NM.setText(""+CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoCargaFamiliar_NM.setToolTipText("Apellido");
		this.jLabelapellidoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		this.jPanelapellidoCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);


		jTextAreaapellidoCargaFamiliar_NM= new JTextAreaMe();
		jTextAreaapellidoCargaFamiliar_NM.setEnabled(false);
		jTextAreaapellidoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCargaFamiliar_NM.setLineWrap(true);
		jTextAreaapellidoCargaFamiliar_NM.setWrapStyleWord(true);
		jTextAreaapellidoCargaFamiliar_NM.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoCargaFamiliar_NM.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoCargaFamiliar_NM = new JScrollPane(jTextAreaapellidoCargaFamiliar_NM);
		jscrollPaneapellidoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoCargaFamiliar_NMBusqueda= new JButtonMe();
		this.jButtonapellidoCargaFamiliar_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCargaFamiliar_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCargaFamiliar_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoCargaFamiliar_NMBusqueda.setText("U");
		this.jButtonapellidoCargaFamiliar_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoCargaFamiliar_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoCargaFamiliar_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoCargaFamiliar_NMBusqueda"));

		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoCargaFamiliar_NMBusqueda.setVisible(false);		}


					
		this.jLabelnombreCargaFamiliar_NM = new JLabelMe();
		this.jLabelnombreCargaFamiliar_NM.setText(""+CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCargaFamiliar_NM.setToolTipText("Nombre");
		this.jLabelnombreCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		this.jPanelnombreCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);


		jTextAreanombreCargaFamiliar_NM= new JTextAreaMe();
		jTextAreanombreCargaFamiliar_NM.setEnabled(false);
		jTextAreanombreCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargaFamiliar_NM.setLineWrap(true);
		jTextAreanombreCargaFamiliar_NM.setWrapStyleWord(true);
		jTextAreanombreCargaFamiliar_NM.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCargaFamiliar_NM.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCargaFamiliar_NM = new JScrollPane(jTextAreanombreCargaFamiliar_NM);
		jscrollPanenombreCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCargaFamiliar_NMBusqueda= new JButtonMe();
		this.jButtonnombreCargaFamiliar_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCargaFamiliar_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCargaFamiliar_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCargaFamiliar_NMBusqueda.setText("U");
		this.jButtonnombreCargaFamiliar_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCargaFamiliar_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCargaFamiliar_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCargaFamiliar_NMBusqueda"));

		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCargaFamiliar_NMBusqueda.setVisible(false);		}


					
		this.jLabeldireccionCargaFamiliar_NM = new JLabelMe();
		this.jLabeldireccionCargaFamiliar_NM.setText(""+CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionCargaFamiliar_NM.setToolTipText("Direccion");
		this.jLabeldireccionCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		this.jPaneldireccionCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);


		jTextAreadireccionCargaFamiliar_NM= new JTextAreaMe();
		jTextAreadireccionCargaFamiliar_NM.setEnabled(false);
		jTextAreadireccionCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCargaFamiliar_NM.setLineWrap(true);
		jTextAreadireccionCargaFamiliar_NM.setWrapStyleWord(true);
		jTextAreadireccionCargaFamiliar_NM.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionCargaFamiliar_NM.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionCargaFamiliar_NM = new JScrollPane(jTextAreadireccionCargaFamiliar_NM);
		jscrollPanedireccionCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionCargaFamiliar_NMBusqueda= new JButtonMe();
		this.jButtondireccionCargaFamiliar_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionCargaFamiliar_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionCargaFamiliar_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionCargaFamiliar_NMBusqueda.setText("U");
		this.jButtondireccionCargaFamiliar_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionCargaFamiliar_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionCargaFamiliar_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionCargaFamiliar_NMBusqueda"));

		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionCargaFamiliar_NMBusqueda.setVisible(false);		}


					
		this.jLabelfecha_nacimientoCargaFamiliar_NM = new JLabelMe();
		this.jLabelfecha_nacimientoCargaFamiliar_NM.setText(""+CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO+" : *");
		this.jLabelfecha_nacimientoCargaFamiliar_NM.setToolTipText("Fecha Nacimiento");
		this.jLabelfecha_nacimientoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_nacimientoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_nacimientoCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_nacimientoCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO);
		this.gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		this.jPanelfecha_nacimientoCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);


		//jFormattedTextFieldfecha_nacimientoCargaFamiliar_NM= new JFormattedTextFieldMe();

		jDateChooserfecha_nacimientoCargaFamiliar_NM= new JDateChooser();
		jDateChooserfecha_nacimientoCargaFamiliar_NM.setEnabled(false);
		jDateChooserfecha_nacimientoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_nacimientoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_nacimientoCargaFamiliar_NM.setDate(new Date());
		jDateChooserfecha_nacimientoCargaFamiliar_NM.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_nacimientoCargaFamiliar_NM.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda= new JButtonMe();
		this.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda.setText("U");
		this.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_nacimientoCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_nacimientoCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_nacimientoCargaFamiliar_NMBusqueda"));

		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda.setVisible(false);		}


					
		this.jLabelvalor_cupoCargaFamiliar_NM = new JLabelMe();
		this.jLabelvalor_cupoCargaFamiliar_NM.setText(""+CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO+" : *");
		this.jLabelvalor_cupoCargaFamiliar_NM.setToolTipText("Valor Cupo");
		this.jLabelvalor_cupoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_cupoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_cupoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_cupoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_cupoCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_cupoCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO);
		this.gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		this.jPanelvalor_cupoCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);


		jTextFieldvalor_cupoCargaFamiliar_NM= new JTextFieldMe();
		jTextFieldvalor_cupoCargaFamiliar_NM.setEnabled(false);
		jTextFieldvalor_cupoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_cupoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_cupoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_cupoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_cupoCargaFamiliar_NM.setText("0.0");

		this.jButtonvalor_cupoCargaFamiliar_NMBusqueda= new JButtonMe();
		this.jButtonvalor_cupoCargaFamiliar_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_cupoCargaFamiliar_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_cupoCargaFamiliar_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_cupoCargaFamiliar_NMBusqueda.setText("U");
		this.jButtonvalor_cupoCargaFamiliar_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_cupoCargaFamiliar_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_cupoCargaFamiliar_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_cupoCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_cupoCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_cupoCargaFamiliar_NMBusqueda"));

		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_cupoCargaFamiliar_NMBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCargaFamiliar_NM() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCargaFamiliar_NM = new JLabelMe();
		this.jLabelid_empresaCargaFamiliar_NM.setText(""+CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCargaFamiliar_NM.setToolTipText("Empresa");
		this.jLabelid_empresaCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		this.jPanelid_empresaCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);


		jComboBoxid_empresaCargaFamiliar_NM= new JComboBoxMe();
		jComboBoxid_empresaCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCargaFamiliar_NM.setEnabled(false);

		this.jButtonid_empresaCargaFamiliar_NM= new JButtonMe();
		this.jButtonid_empresaCargaFamiliar_NM.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargaFamiliar_NM.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargaFamiliar_NM.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargaFamiliar_NM.setText("Buscar");
		this.jButtonid_empresaCargaFamiliar_NM.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCargaFamiliar_NM.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargaFamiliar_NM,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargaFamiliar_NM"));

		this.jButtonid_empresaCargaFamiliar_NMBusqueda= new JButtonMe();
		this.jButtonid_empresaCargaFamiliar_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargaFamiliar_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargaFamiliar_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCargaFamiliar_NMBusqueda.setText("U");
		this.jButtonid_empresaCargaFamiliar_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCargaFamiliar_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargaFamiliar_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargaFamiliar_NMBusqueda"));

		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCargaFamiliar_NMBusqueda.setVisible(false);		}

		this.jButtonid_empresaCargaFamiliar_NMUpdate= new JButtonMe();
		this.jButtonid_empresaCargaFamiliar_NMUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargaFamiliar_NMUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargaFamiliar_NMUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCargaFamiliar_NMUpdate.setText("U");
		this.jButtonid_empresaCargaFamiliar_NMUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCargaFamiliar_NMUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargaFamiliar_NMUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargaFamiliar_NMUpdate"));



					
		this.jLabelid_empleadoCargaFamiliar_NM = new JLabelMe();
		this.jLabelid_empleadoCargaFamiliar_NM.setText(""+CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoCargaFamiliar_NM.setToolTipText("Empleado");
		this.jLabelid_empleadoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		this.jPanelid_empleadoCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);


		jComboBoxid_empleadoCargaFamiliar_NM= new JComboBoxMe();
		jComboBoxid_empleadoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoCargaFamiliar_NM= new JButtonMe();
		this.jButtonid_empleadoCargaFamiliar_NM.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCargaFamiliar_NM.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCargaFamiliar_NM.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCargaFamiliar_NM.setText("Buscar");
		this.jButtonid_empleadoCargaFamiliar_NM.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoCargaFamiliar_NM.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCargaFamiliar_NM,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCargaFamiliar_NM"));

		this.jButtonid_empleadoCargaFamiliar_NMBusqueda= new JButtonMe();
		this.jButtonid_empleadoCargaFamiliar_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCargaFamiliar_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCargaFamiliar_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCargaFamiliar_NMBusqueda.setText("U");
		this.jButtonid_empleadoCargaFamiliar_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoCargaFamiliar_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCargaFamiliar_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCargaFamiliar_NMBusqueda"));

		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoCargaFamiliar_NMBusqueda.setVisible(false);		}

		this.jButtonid_empleadoCargaFamiliar_NMUpdate= new JButtonMe();
		this.jButtonid_empleadoCargaFamiliar_NMUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCargaFamiliar_NMUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCargaFamiliar_NMUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCargaFamiliar_NMUpdate.setText("U");
		this.jButtonid_empleadoCargaFamiliar_NMUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoCargaFamiliar_NMUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCargaFamiliar_NMUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCargaFamiliar_NMUpdate"));



					
		this.jLabelid_tipo_carga_famiCargaFamiliar_NM = new JLabelMe();
		this.jLabelid_tipo_carga_famiCargaFamiliar_NM.setText(""+CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI+" : *");
		this.jLabelid_tipo_carga_famiCargaFamiliar_NM.setToolTipText("Tipo Carga Fami");
		this.jLabelid_tipo_carga_famiCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_carga_famiCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_carga_famiCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_carga_famiCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_carga_famiCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_carga_famiCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI);
		this.gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		this.jPanelid_tipo_carga_famiCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);


		jComboBoxid_tipo_carga_famiCargaFamiliar_NM= new JComboBoxMe();
		jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_carga_famiCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_carga_famiCargaFamiliar_NM= new JButtonMe();
		this.jButtonid_tipo_carga_famiCargaFamiliar_NM.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_carga_famiCargaFamiliar_NM.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_carga_famiCargaFamiliar_NM.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_carga_famiCargaFamiliar_NM.setText("Buscar");
		this.jButtonid_tipo_carga_famiCargaFamiliar_NM.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_carga_famiCargaFamiliar_NM.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_carga_famiCargaFamiliar_NM,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_carga_famiCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_carga_famiCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_carga_famiCargaFamiliar_NM"));

		this.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda= new JButtonMe();
		this.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda.setText("U");
		this.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_carga_famiCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_carga_famiCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_carga_famiCargaFamiliar_NMBusqueda"));

		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda.setVisible(false);		}

		this.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate= new JButtonMe();
		this.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate.setText("U");
		this.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_carga_famiCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_carga_famiCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_carga_famiCargaFamiliar_NMUpdate"));



					
		this.jLabelid_tipo_generoCargaFamiliar_NM = new JLabelMe();
		this.jLabelid_tipo_generoCargaFamiliar_NM.setText(""+CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO+" : *");
		this.jLabelid_tipo_generoCargaFamiliar_NM.setToolTipText("Tipo Genero");
		this.jLabelid_tipo_generoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_generoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_generoCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_generoCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO);
		this.gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		this.jPanelid_tipo_generoCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);


		jComboBoxid_tipo_generoCargaFamiliar_NM= new JComboBoxMe();
		jComboBoxid_tipo_generoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_generoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_generoCargaFamiliar_NM= new JButtonMe();
		this.jButtonid_tipo_generoCargaFamiliar_NM.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoCargaFamiliar_NM.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoCargaFamiliar_NM.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoCargaFamiliar_NM.setText("Buscar");
		this.jButtonid_tipo_generoCargaFamiliar_NM.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_generoCargaFamiliar_NM.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoCargaFamiliar_NM,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_generoCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoCargaFamiliar_NM"));

		this.jButtonid_tipo_generoCargaFamiliar_NMBusqueda= new JButtonMe();
		this.jButtonid_tipo_generoCargaFamiliar_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoCargaFamiliar_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoCargaFamiliar_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoCargaFamiliar_NMBusqueda.setText("U");
		this.jButtonid_tipo_generoCargaFamiliar_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_generoCargaFamiliar_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoCargaFamiliar_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_generoCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoCargaFamiliar_NMBusqueda"));

		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_generoCargaFamiliar_NMBusqueda.setVisible(false);		}

		this.jButtonid_tipo_generoCargaFamiliar_NMUpdate= new JButtonMe();
		this.jButtonid_tipo_generoCargaFamiliar_NMUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoCargaFamiliar_NMUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoCargaFamiliar_NMUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoCargaFamiliar_NMUpdate.setText("U");
		this.jButtonid_tipo_generoCargaFamiliar_NMUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_generoCargaFamiliar_NMUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoCargaFamiliar_NMUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_generoCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoCargaFamiliar_NMUpdate"));



					
		this.jLabelid_estado_civilCargaFamiliar_NM = new JLabelMe();
		this.jLabelid_estado_civilCargaFamiliar_NM.setText(""+CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL+" : *");
		this.jLabelid_estado_civilCargaFamiliar_NM.setToolTipText("Estado Civil");
		this.jLabelid_estado_civilCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_civilCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_civilCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_civilCargaFamiliar_NM.setToolTipText(CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL);
		this.gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		this.jPanelid_estado_civilCargaFamiliar_NM.setLayout(this.gridaBagLayoutCargaFamiliar_NM);


		jComboBoxid_estado_civilCargaFamiliar_NM= new JComboBoxMe();
		jComboBoxid_estado_civilCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_civilCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_civilCargaFamiliar_NM= new JButtonMe();
		this.jButtonid_estado_civilCargaFamiliar_NM.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilCargaFamiliar_NM.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilCargaFamiliar_NM.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilCargaFamiliar_NM.setText("Buscar");
		this.jButtonid_estado_civilCargaFamiliar_NM.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_civilCargaFamiliar_NM.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilCargaFamiliar_NM,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_civilCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilCargaFamiliar_NM"));

		this.jButtonid_estado_civilCargaFamiliar_NMBusqueda= new JButtonMe();
		this.jButtonid_estado_civilCargaFamiliar_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilCargaFamiliar_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilCargaFamiliar_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilCargaFamiliar_NMBusqueda.setText("U");
		this.jButtonid_estado_civilCargaFamiliar_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_civilCargaFamiliar_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilCargaFamiliar_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_civilCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilCargaFamiliar_NMBusqueda"));

		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_civilCargaFamiliar_NMBusqueda.setVisible(false);		}

		this.jButtonid_estado_civilCargaFamiliar_NMUpdate= new JButtonMe();
		this.jButtonid_estado_civilCargaFamiliar_NMUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilCargaFamiliar_NMUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilCargaFamiliar_NMUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilCargaFamiliar_NMUpdate.setText("U");
		this.jButtonid_estado_civilCargaFamiliar_NMUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_civilCargaFamiliar_NMUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilCargaFamiliar_NMUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_civilCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilCargaFamiliar_NMUpdate"));



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
		//this.jInternalFrameDetalleCargaFamiliar_NM = new CargaFamiliar_NMBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Carga Familiar_ N M DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCargaFamiliar_NM= new GridBagLayout();
		

		
		String sToolTipCargaFamiliar_NM="";
		sToolTipCargaFamiliar_NM=CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCargaFamiliar_NM+="(Nomina.CargaFamiliar_NM)";
		}
		
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
			sToolTipCargaFamiliar_NM+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCargaFamiliar_NM = new JButtonMe();
		this.jButtonModificarCargaFamiliar_NM = new JButtonMe();
        this.jButtonActualizarCargaFamiliar_NM = new JButtonMe();
        this.jButtonEliminarCargaFamiliar_NM = new JButtonMe();
        this.jButtonCancelarCargaFamiliar_NM = new JButtonMe();
        this.jButtonGuardarCambiosCargaFamiliar_NM = new JButtonMe();
		this.jButtonGuardarCambiosTablaCargaFamiliar_NM = new JButtonMe();
		this.jButtonCerrarCargaFamiliar_NM = new JButtonMe();
		
		this.jScrollPanelDatosCargaFamiliar_NM = new JScrollPane();   
        this.jScrollPanelDatosEdicionCargaFamiliar_NM = new JScrollPane();
		this.jScrollPanelDatosGeneralCargaFamiliar_NM = new JScrollPane();
				
		
		
		this.jPanelCamposCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Carga Familiar_ N M";
		
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiar_ N Mes" + this.sPath));
		} else {
			this.jScrollPanelDatosCargaFamiliar_NM.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCargaFamiliar_NM.setName("jPanelCamposCargaFamiliar_NM"); 

		this.jPanelCamposOcultosCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCargaFamiliar_NM.setName("jPanelCamposOcultosCargaFamiliar_NM"); 

        this.jPanelAccionesCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCargaFamiliar_NM.setToolTipText("Acciones");
        this.jPanelAccionesCargaFamiliar_NM.setName("Acciones"); 

		this.jPanelAccionesFormularioCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCargaFamiliar_NM.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCargaFamiliar_NM.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCargaFamiliar_NM.setText("Nuevo");
		this.jButtonModificarCargaFamiliar_NM.setText("Editar");
        this.jButtonActualizarCargaFamiliar_NM.setText("Actualizar");
        this.jButtonEliminarCargaFamiliar_NM.setText("Eliminar");
        this.jButtonCancelarCargaFamiliar_NM.setText("Cancelar");
        this.jButtonGuardarCambiosCargaFamiliar_NM.setText("Guardar");
		this.jButtonGuardarCambiosTablaCargaFamiliar_NM.setText("Guardar");
		this.jButtonCerrarCargaFamiliar_NM.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCargaFamiliar_NM,"nuevo_button","Nuevo",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCargaFamiliar_NM,"modificar_button","Editar",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCargaFamiliar_NM,"actualizar_button","Actualizar",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCargaFamiliar_NM,"eliminar_button","Eliminar",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCargaFamiliar_NM,"cancelar_button","Cancelar",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCargaFamiliar_NM,"guardarcambios_button","Guardar",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCargaFamiliar_NM,"guardarcambiostabla_button","Guardar",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCargaFamiliar_NM,"cerrar_button","Salir",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCargaFamiliar_NM.setToolTipText("Nuevo"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCargaFamiliar_NM.setToolTipText("Editar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCargaFamiliar_NM.setToolTipText("Actualizar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCargaFamiliar_NM.setToolTipText("Eliminar)"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCargaFamiliar_NM.setToolTipText("Cancelar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCargaFamiliar_NM.setToolTipText("Guardar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCargaFamiliar_NM.setToolTipText("Guardar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCargaFamiliar_NM.setToolTipText("Salir"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCargaFamiliar_NM";
		inputMap = this.jButtonNuevoCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCargaFamiliar_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCargaFamiliar_NM"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCargaFamiliar_NM";
		inputMap = this.jButtonActualizarCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCargaFamiliar_NM"));
		
		//ELIMINAR
		sMapKey = "EliminarCargaFamiliar_NM";
		inputMap = this.jButtonEliminarCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCargaFamiliar_NM"));
		
		//CANCELAR	
		sMapKey = "CancelarCargaFamiliar_NM";
		inputMap = this.jButtonCancelarCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCargaFamiliar_NM"));
		
		//CERRAR		
		sMapKey = "CerrarCargaFamiliar_NM";
		inputMap = this.jButtonCerrarCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCargaFamiliar_NM"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCargaFamiliar_NM";
		inputMap = this.jButtonGuardarCambiosTablaCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCargaFamiliar_NM"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCargaFamiliar_NM = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCargaFamiliar_NM.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCargaFamiliar_NM.setToolTipText("Nuevo CargaFamiliar_NM");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCargaFamiliar_NM = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCargaFamiliar_NM.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCargaFamiliar_NM.setToolTipText("Sin Cerrar Ventana CargaFamiliar_NM");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCargaFamiliar_NM = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCargaFamiliar_NM.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCargaFamiliar_NM.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCargaFamiliar_NM.setText("Accion");
		this.jComboBoxTiposAccionesCargaFamiliar_NM.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCargaFamiliar_NM = new JLabelMe();
		
		this.jLabelAccionesCargaFamiliar_NM.setText("Acciones");		
		this.jLabelAccionesCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCargaFamiliar_NM();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCargaFamiliar_NM();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCargaFamiliar_NM=new JTabbedPane();
		this.jTabbedPaneRelacionesCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCargaFamiliar_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargaFamiliar_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargaFamiliar_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCargaFamiliar_NM = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCargaFamiliar_NM = new GridBagLayout();
		
		this.jPanelCamposCargaFamiliar_NM.setLayout(gridaBagLayoutCamposCargaFamiliar_NM);
		this.jPanelCamposOcultosCargaFamiliar_NM.setLayout(gridaBagLayoutCamposOcultosCargaFamiliar_NM);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCargaFamiliar_NM.add(jLabelIdCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCargaFamiliar_NM.add(jLabelidCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCargaFamiliar_NM.add(jLabelid_empresaCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 2;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCargaFamiliar_NM.add(jButtonid_empresaCargaFamiliar_NMBusqueda, this.gridBagConstraintsCargaFamiliar_NM);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 3;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCargaFamiliar_NM.add(jButtonid_empresaCargaFamiliar_NMUpdate, this.gridBagConstraintsCargaFamiliar_NM);
	}

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCargaFamiliar_NM.add(jComboBoxid_empresaCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoCargaFamiliar_NM.add(jLabelid_empleadoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 2;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoCargaFamiliar_NM.add(jButtonid_empleadoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 3;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCargaFamiliar_NM.add(jButtonid_empleadoCargaFamiliar_NMBusqueda, this.gridBagConstraintsCargaFamiliar_NM);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 4;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCargaFamiliar_NM.add(jButtonid_empleadoCargaFamiliar_NMUpdate, this.gridBagConstraintsCargaFamiliar_NM);
	}

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoCargaFamiliar_NM.add(jComboBoxid_empleadoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_carga_famiCargaFamiliar_NM.add(jLabelid_tipo_carga_famiCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 2;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_carga_famiCargaFamiliar_NM.add(jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda, this.gridBagConstraintsCargaFamiliar_NM);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 3;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_carga_famiCargaFamiliar_NM.add(jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate, this.gridBagConstraintsCargaFamiliar_NM);
	}

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_carga_famiCargaFamiliar_NM.add(jComboBoxid_tipo_carga_famiCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_generoCargaFamiliar_NM.add(jLabelid_tipo_generoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 2;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoCargaFamiliar_NM.add(jButtonid_tipo_generoCargaFamiliar_NMBusqueda, this.gridBagConstraintsCargaFamiliar_NM);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 3;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoCargaFamiliar_NM.add(jButtonid_tipo_generoCargaFamiliar_NMUpdate, this.gridBagConstraintsCargaFamiliar_NM);
	}

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_generoCargaFamiliar_NM.add(jComboBoxid_tipo_generoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_civilCargaFamiliar_NM.add(jLabelid_estado_civilCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 2;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilCargaFamiliar_NM.add(jButtonid_estado_civilCargaFamiliar_NMBusqueda, this.gridBagConstraintsCargaFamiliar_NM);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 3;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilCargaFamiliar_NM.add(jButtonid_estado_civilCargaFamiliar_NMUpdate, this.gridBagConstraintsCargaFamiliar_NM);
	}

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_civilCargaFamiliar_NM.add(jComboBoxid_estado_civilCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcedulaCargaFamiliar_NM.add(jLabelcedulaCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 2;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelcedulaCargaFamiliar_NM.add(jButtoncedulaCargaFamiliar_NMBusqueda, this.gridBagConstraintsCargaFamiliar_NM);
	}

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcedulaCargaFamiliar_NM.add(jTextFieldcedulaCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoCargaFamiliar_NM.add(jLabelapellidoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 2;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoCargaFamiliar_NM.add(jButtonapellidoCargaFamiliar_NMBusqueda, this.gridBagConstraintsCargaFamiliar_NM);
	}

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoCargaFamiliar_NM.add(jscrollPaneapellidoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCargaFamiliar_NM.add(jLabelnombreCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 2;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCargaFamiliar_NM.add(jButtonnombreCargaFamiliar_NMBusqueda, this.gridBagConstraintsCargaFamiliar_NM);
	}

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCargaFamiliar_NM.add(jscrollPanenombreCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionCargaFamiliar_NM.add(jLabeldireccionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 2;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionCargaFamiliar_NM.add(jButtondireccionCargaFamiliar_NMBusqueda, this.gridBagConstraintsCargaFamiliar_NM);
	}

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionCargaFamiliar_NM.add(jscrollPanedireccionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_nacimientoCargaFamiliar_NM.add(jLabelfecha_nacimientoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 2;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_nacimientoCargaFamiliar_NM.add(jButtonfecha_nacimientoCargaFamiliar_NMBusqueda, this.gridBagConstraintsCargaFamiliar_NM);
	}

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_nacimientoCargaFamiliar_NM.add(jDateChooserfecha_nacimientoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_cupoCargaFamiliar_NM.add(jLabelvalor_cupoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 2;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_cupoCargaFamiliar_NM.add(jButtonvalor_cupoCargaFamiliar_NMBusqueda, this.gridBagConstraintsCargaFamiliar_NM);
	}

	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = 1;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_cupoCargaFamiliar_NM.add(jTextFieldvalor_cupoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar_NM.add(this.jPanelidCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposCargaFamiliar_NM % 1==0) {
		iXPanelCamposCargaFamiliar_NM=0;
		iYPanelCamposCargaFamiliar_NM++;
	}
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar_NM.add(this.jPanelid_empleadoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposCargaFamiliar_NM % 1==0) {
		iXPanelCamposCargaFamiliar_NM=0;
		iYPanelCamposCargaFamiliar_NM++;
	}
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar_NM.add(this.jPanelid_tipo_carga_famiCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposCargaFamiliar_NM % 1==0) {
		iXPanelCamposCargaFamiliar_NM=0;
		iYPanelCamposCargaFamiliar_NM++;
	}
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar_NM.add(this.jPanelid_tipo_generoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposCargaFamiliar_NM % 1==0) {
		iXPanelCamposCargaFamiliar_NM=0;
		iYPanelCamposCargaFamiliar_NM++;
	}
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar_NM.add(this.jPanelid_estado_civilCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposCargaFamiliar_NM % 1==0) {
		iXPanelCamposCargaFamiliar_NM=0;
		iYPanelCamposCargaFamiliar_NM++;
	}
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar_NM.add(this.jPanelcedulaCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposCargaFamiliar_NM % 1==0) {
		iXPanelCamposCargaFamiliar_NM=0;
		iYPanelCamposCargaFamiliar_NM++;
	}
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar_NM.add(this.jPanelapellidoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposCargaFamiliar_NM % 1==0) {
		iXPanelCamposCargaFamiliar_NM=0;
		iYPanelCamposCargaFamiliar_NM++;
	}
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar_NM.add(this.jPanelnombreCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposCargaFamiliar_NM % 1==0) {
		iXPanelCamposCargaFamiliar_NM=0;
		iYPanelCamposCargaFamiliar_NM++;
	}
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar_NM.add(this.jPaneldireccionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposCargaFamiliar_NM % 1==0) {
		iXPanelCamposCargaFamiliar_NM=0;
		iYPanelCamposCargaFamiliar_NM++;
	}
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar_NM.add(this.jPanelfecha_nacimientoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposCargaFamiliar_NM % 1==0) {
		iXPanelCamposCargaFamiliar_NM=0;
		iYPanelCamposCargaFamiliar_NM++;
	}
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar_NM.add(this.jPanelvalor_cupoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposCargaFamiliar_NM % 1==0) {
		iXPanelCamposCargaFamiliar_NM=0;
		iYPanelCamposCargaFamiliar_NM++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar_NM.gridy = iYPanelCamposOcultosCargaFamiliar_NM;
	this.gridBagConstraintsCargaFamiliar_NM.gridx = iXPanelCamposOcultosCargaFamiliar_NM++;
	this.gridBagConstraintsCargaFamiliar_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCargaFamiliar_NM.add(this.jPanelid_empresaCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);



	if(iXPanelCamposOcultosCargaFamiliar_NM % 1==0) {
		iXPanelCamposOcultosCargaFamiliar_NM=0;
		iYPanelCamposOcultosCargaFamiliar_NM++;
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
			
		GridBagLayout gridaBagLayoutAccionesCargaFamiliar_NM= new GridBagLayout();
		this.jPanelAccionesCargaFamiliar_NM.setLayout(gridaBagLayoutAccionesCargaFamiliar_NM);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCargaFamiliar_NM= new GridBagLayout();
		this.jPanelAccionesFormularioCargaFamiliar_NM.setLayout(gridaBagLayoutAccionesFormularioCargaFamiliar_NM);
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCargaFamiliar_NM.add(this.jComboBoxTiposAccionesFormularioCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCargaFamiliar_NM.add(this.jCheckBoxPostAccionNuevoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCargaFamiliar_NM.add(this.jCheckBoxPostAccionSinCerrarCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCargaFamiliar_NM.add(this.jCheckBoxPostAccionSinMensajeCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccion++;
			
		this.jPanelAccionesCargaFamiliar_NM.add(this.jButtonModificarCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);							

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx =iPosXAccion++;
			
		this.jPanelAccionesCargaFamiliar_NM.add(this.jButtonEliminarCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
			
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccion++;
		
		this.jPanelAccionesCargaFamiliar_NM.add(this.jButtonActualizarCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccion++;
		
		this.jPanelAccionesCargaFamiliar_NM.add(this.jButtonGuardarCambiosCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);	
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx =iPosXAccion++;
		
		this.jPanelAccionesCargaFamiliar_NM.add(this.jButtonCancelarCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCargaFamiliar_NM);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();						
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;		
			//this.gridBagConstraintsCargaFamiliar_NM.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCargaFamiliar_NM.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCargaFamiliar_NM.gridx =0;
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCargaFamiliar_NM.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CargaFamiliar_NMJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCargaFamiliar_NM = new CargaFamiliar_NMBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Carga Familiar_ N M DATOS");
			
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
			
	        //this.setTitle("[FOR] - Carga Familiar_ N M DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Carga Familiar_ N M Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CargaFamiliar_NMModel cargafamiliar_nmModel=new CargaFamiliar_NMModel(this);
			
			//SI USARA CLASE INTERNA
			//CargaFamiliar_NMModel.CargaFamiliar_NMFocusTraversalPolicy cargafamiliar_nmFocusTraversalPolicy = cargafamiliar_nmModel.new CargaFamiliar_NMFocusTraversalPolicy(this);
			
			//cargafamiliar_nmFocusTraversalPolicy.setcargafamiliar_nmJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cargafamiliar_nmModel);
			
			
			this.jContentPaneDetalleCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCargaFamiliar_NM = new GridBagLayout();	
			this.jContentPaneDetalleCargaFamiliar_NM.setLayout(gridaBagLayoutDetalleCargaFamiliar_NM);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCargaFamiliar_NM = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
				this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
					
				
				this.jContentPaneDetalleCargaFamiliar_NM.add(jTtoolBarDetalleCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);								
				
}
			
			this.jScrollPanelDatosEdicionCargaFamiliar_NM=   new JScrollPane(jContentPaneDetalleCargaFamiliar_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCargaFamiliar_NM=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	        
			this.jContentPaneDetalleCargaFamiliar_NM.add(jPanelCamposCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);
			
			
			
			
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
						&& cargafamiliar_nmSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCargaFamiliar_NM= new GridBagConstraints();
						this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
						this.jContentPaneDetalleCargaFamiliar_NM.add(this.jTabbedPaneRelacionesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCargaFamiliar_NM.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCargaFamiliar_NM.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
					this.gridBagConstraintsCargaFamiliar_NM.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
					
				
					this.jContentPaneDetalleCargaFamiliar_NM.add(jPanelCamposOcultosCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);
				
					this.jPanelCamposOcultosCargaFamiliar_NM.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	        this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCargaFamiliar_NM.add(this.jPanelAccionesFormularioCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);							
			
			
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
	        this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
	        
			
			this.jContentPaneDetalleCargaFamiliar_NM.add(this.jPanelAccionesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCargaFamiliar_NM);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCargaFamiliar_NM=   new JScrollPane(this.jPanelCamposCargaFamiliar_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCargaFamiliar_NM.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);			
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			
			
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
			
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCargaFamiliar_NM;//jContentPane;
		
		return jScrollPanelDatosEdicionCargaFamiliar_NM;
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
