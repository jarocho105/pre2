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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ProcesoMayorizarDiarioConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ProcesoMayorizarDiarioDetalleFormJInternalFrame extends ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoMayorizarDiario;
	
	protected JMenuBar jmenuBarDetalleProcesoMayorizarDiario;
	
	protected JMenu jmenuDetalleProcesoMayorizarDiario;
	protected JMenu jmenuDetalleArchivoProcesoMayorizarDiario;
	protected JMenu jmenuDetalleAccionesProcesoMayorizarDiario;
	protected JMenu jmenuDetalleDatosProcesoMayorizarDiario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoMayorizarDiario;	
	protected GridBagConstraints gridBagConstraintsProcesoMayorizarDiario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoMayorizarDiario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public ProcesoMayorizarDiarioSessionBean procesomayorizardiarioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;	
	
	public ProcesoMayorizarDiarioLogic procesomayorizardiarioLogic;
	
	public JScrollPane jScrollPanelDatosProcesoMayorizarDiario;
	public JScrollPane jScrollPanelDatosEdicionProcesoMayorizarDiario;
	public JScrollPane jScrollPanelDatosGeneralProcesoMayorizarDiario;
	
	protected JPanel jPanelCamposProcesoMayorizarDiario;    
	protected JPanel jPanelCamposOcultosProcesoMayorizarDiario;    	
	protected JPanel jPanelAccionesProcesoMayorizarDiario;
	protected JPanel jPanelAccionesFormularioProcesoMayorizarDiario;
    
	
	
	protected Integer iXPanelCamposProcesoMayorizarDiario=0;
	protected Integer iYPanelCamposProcesoMayorizarDiario=0;
	
	protected Integer iXPanelCamposOcultosProcesoMayorizarDiario=0;
	protected Integer iYPanelCamposOcultosProcesoMayorizarDiario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoMayorizarDiario;
	public JButton jButtonModificarProcesoMayorizarDiario;
	public JButton jButtonActualizarProcesoMayorizarDiario;
    public JButton jButtonEliminarProcesoMayorizarDiario;
	public JButton jButtonCancelarProcesoMayorizarDiario;
    public JButton jButtonGuardarCambiosProcesoMayorizarDiario;
	public JButton jButtonGuardarCambiosTablaProcesoMayorizarDiario;
	protected JButton jButtonCerrarProcesoMayorizarDiario;
	
	
	protected JButton jButtonProcesarInformacionProcesoMayorizarDiario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoMayorizarDiario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoMayorizarDiario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoMayorizarDiario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoMayorizarDiario;
	protected JButton jButtonModificarToolBarProcesoMayorizarDiario;
	protected JButton jButtonActualizarToolBarProcesoMayorizarDiario;
    protected JButton jButtonEliminarToolBarProcesoMayorizarDiario;
	protected JButton jButtonCancelarToolBarProcesoMayorizarDiario;
    protected JButton jButtonGuardarCambiosToolBarProcesoMayorizarDiario;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoMayorizarDiario;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoMayorizarDiario;
	protected JButton jButtonCerrarToolBarProcesoMayorizarDiario;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoMayorizarDiario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoMayorizarDiario;
	protected JMenuItem jMenuItemModificarProcesoMayorizarDiario;
	protected JMenuItem jMenuItemActualizarProcesoMayorizarDiario;
    protected JMenuItem jMenuItemEliminarProcesoMayorizarDiario;
	protected JMenuItem jMenuItemCancelarProcesoMayorizarDiario;
    protected JMenuItem jMenuItemGuardarCambiosProcesoMayorizarDiario;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoMayorizarDiario;
	protected JMenuItem jMenuItemCerrarProcesoMayorizarDiario;
	protected JMenuItem jMenuItemDetalleCerrarProcesoMayorizarDiario;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoMayorizarDiario;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoMayorizarDiario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoMayorizarDiario;
	protected JMenuItem jMenuItemMostrarOcultarProcesoMayorizarDiario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoMayorizarDiario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoMayorizarDiario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoMayorizarDiario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoMayorizarDiario;
	public JLabel jLabelIdProcesoMayorizarDiario;
	public JLabel jLabelidProcesoMayorizarDiario;
	public JButton jButtonidProcesoMayorizarDiarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioProcesoMayorizarDiario;
	public JLabel jLabelfecha_inicioProcesoMayorizarDiario;
	//public JFormattedTextField jDateChooserfecha_inicioProcesoMayorizarDiario;

	public JDateChooser jDateChooserfecha_inicioProcesoMayorizarDiario;
	public JButton jButtonfecha_inicioProcesoMayorizarDiarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finProcesoMayorizarDiario;
	public JLabel jLabelfecha_finProcesoMayorizarDiario;
	//public JFormattedTextField jDateChooserfecha_finProcesoMayorizarDiario;

	public JDateChooser jDateChooserfecha_finProcesoMayorizarDiario;
	public JButton jButtonfecha_finProcesoMayorizarDiarioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProcesoMayorizarDiario;
	public JLabel jLabelcodigoProcesoMayorizarDiario;
	public JTextField jTextFieldcodigoProcesoMayorizarDiario;
	public JButton jButtoncodigoProcesoMayorizarDiarioBusqueda= new JButtonMe();

	public JPanel jPanelfechaProcesoMayorizarDiario;
	public JLabel jLabelfechaProcesoMayorizarDiario;
	//public JFormattedTextField jDateChooserfechaProcesoMayorizarDiario;

	public JDateChooser jDateChooserfechaProcesoMayorizarDiario;
	public JButton jButtonfechaProcesoMayorizarDiarioBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioProcesoMayorizarDiario;
	public JLabel jLabelbeneficiarioProcesoMayorizarDiario;
	public JTextArea jTextAreabeneficiarioProcesoMayorizarDiario;
	public JScrollPane jscrollPanebeneficiarioProcesoMayorizarDiario;
	public JButton jButtonbeneficiarioProcesoMayorizarDiarioBusqueda= new JButtonMe();

	public JPanel jPanelvalorProcesoMayorizarDiario;
	public JLabel jLabelvalorProcesoMayorizarDiario;
	public JTextField jTextFieldvalorProcesoMayorizarDiario;
	public JButton jButtonvalorProcesoMayorizarDiarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProcesoMayorizarDiario;
	public JLabel jLabelid_empresaProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProcesoMayorizarDiario;
	public JButton jButtonid_empresaProcesoMayorizarDiario= new JButtonMe();
	public JButton jButtonid_empresaProcesoMayorizarDiarioUpdate= new JButtonMe();
	public JButton jButtonid_empresaProcesoMayorizarDiarioBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProcesoMayorizarDiario;
	public JLabel jLabelid_sucursalProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProcesoMayorizarDiario;
	public JButton jButtonid_sucursalProcesoMayorizarDiario= new JButtonMe();
	public JButton jButtonid_sucursalProcesoMayorizarDiarioUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProcesoMayorizarDiarioBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioProcesoMayorizarDiario;
	public JLabel jLabelid_ejercicioProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioProcesoMayorizarDiario;
	public JButton jButtonid_ejercicioProcesoMayorizarDiario= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoMayorizarDiarioUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoMayorizarDiarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoProcesoMayorizarDiario;
	public JLabel jLabelid_tipo_movimientoProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoProcesoMayorizarDiario;
	public JButton jButtonid_tipo_movimientoProcesoMayorizarDiario= new JButtonMe();
	public JButton jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoMayorizarDiario;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoMayorizarDiarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoMayorizarDiario=new JPanel();
				this.jPanelAccionesFormularioProcesoMayorizarDiario=new JPanel();
				this.jmenuBarDetalleProcesoMayorizarDiario=new JMenuBar();
				this.jTtoolBarDetalleProcesoMayorizarDiario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoMayorizarDiarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoMayorizarDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoMayorizarDiarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoMayorizarDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoMayorizarDiarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoMayorizarDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoMayorizarDiarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoMayorizarDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoMayorizarDiarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoMayorizarDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoMayorizarDiario() {
		return this.jButtonActualizarToolBarProcesoMayorizarDiario;
	}
	
	public JButton getjButtonEliminarToolBarProcesoMayorizarDiario() {
		return this.jButtonEliminarToolBarProcesoMayorizarDiario;
	}
	
	public JButton getjButtonCancelarToolBarProcesoMayorizarDiario() {
		return this.jButtonCancelarToolBarProcesoMayorizarDiario;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoMayorizarDiario() {
		return this.jButtonProcesarInformacionProcesoMayorizarDiario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoMayorizarDiario)	{
		this.jButtonProcesarInformacionProcesoMayorizarDiario = jButtonProcesarInformacionProcesoMayorizarDiario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoMayorizarDiario() {
		return this.jComboBoxTiposAccionesProcesoMayorizarDiario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoMayorizarDiario(
			JComboBox jComboBoxTiposRelacionesProcesoMayorizarDiario) {
		this.jComboBoxTiposRelacionesProcesoMayorizarDiario = jComboBoxTiposRelacionesProcesoMayorizarDiario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoMayorizarDiario(
			JComboBox jComboBoxTiposAccionesProcesoMayorizarDiario) {
		this.jComboBoxTiposAccionesProcesoMayorizarDiario = jComboBoxTiposAccionesProcesoMayorizarDiario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoMayorizarDiario() {
		return this.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoMayorizarDiario(
			JComboBox jComboBoxTiposAccionesFormularioProcesoMayorizarDiario) {
		this.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario = jComboBoxTiposAccionesFormularioProcesoMayorizarDiario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesomayorizardiarioSessionBean=new ProcesoMayorizarDiarioSessionBean();
		
		this.procesomayorizardiarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesomayorizardiarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoMayorizarDiarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoMayorizarDiarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoMayorizarDiarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Mayorizar Diario MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoMayorizarDiarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoMayorizarDiario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoMayorizarDiario=new JButtonMe();
				this.jButtonModificarToolBarProcesoMayorizarDiario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoMayorizarDiario,this.jTtoolBarDetalleProcesoMayorizarDiario,
							"actualizar","actualizar","Actualizar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoMayorizarDiario,this.jTtoolBarDetalleProcesoMayorizarDiario,
							"eliminar","eliminar","Eliminar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoMayorizarDiario,this.jTtoolBarDetalleProcesoMayorizarDiario,
							"cancelar","cancelar","Cancelar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoMayorizarDiario,this.jTtoolBarDetalleProcesoMayorizarDiario,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoMayorizarDiario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoMayorizarDiario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoMayorizarDiario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoMayorizarDiario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoMayorizarDiario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoMayorizarDiario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoMayorizarDiario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoMayorizarDiario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoMayorizarDiario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoMayorizarDiario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoMayorizarDiario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoMayorizarDiario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoMayorizarDiario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoMayorizarDiario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoMayorizarDiario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoMayorizarDiario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoMayorizarDiario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoMayorizarDiario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoMayorizarDiario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoMayorizarDiario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoMayorizarDiario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoMayorizarDiario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoMayorizarDiario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoMayorizarDiario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoMayorizarDiario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoMayorizarDiario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoMayorizarDiario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoMayorizarDiario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoMayorizarDiario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoMayorizarDiario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoMayorizarDiario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoMayorizarDiario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoMayorizarDiario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoMayorizarDiario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoMayorizarDiario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoMayorizarDiario.add(this.jMenuItemDetalleCerrarProcesoMayorizarDiario);
		
		this.jmenuDetalleAccionesProcesoMayorizarDiario.add(this.jMenuItemActualizarProcesoMayorizarDiario);
		this.jmenuDetalleAccionesProcesoMayorizarDiario.add(this.jMenuItemEliminarProcesoMayorizarDiario);
		this.jmenuDetalleAccionesProcesoMayorizarDiario.add(this.jMenuItemCancelarProcesoMayorizarDiario);		
		
		//this.jmenuDetalleDatosProcesoMayorizarDiario.add(this.jMenuItemDetalleAbrirOrderByProcesoMayorizarDiario);				
		this.jmenuDetalleDatosProcesoMayorizarDiario.add(this.jMenuItemDetalleMostarOcultarProcesoMayorizarDiario);				
				
		//this.jmenuDetalleAccionesProcesoMayorizarDiario.add(this.jMenuItemGuardarCambiosProcesoMayorizarDiario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoMayorizarDiario.add(this.jmenuDetalleArchivoProcesoMayorizarDiario);		
		this.jmenuBarDetalleProcesoMayorizarDiario.add(this.jmenuDetalleAccionesProcesoMayorizarDiario);		
		this.jmenuBarDetalleProcesoMayorizarDiario.add(this.jmenuDetalleDatosProcesoMayorizarDiario);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoMayorizarDiario);				
	}
	
	
	public void inicializarElementosCamposProcesoMayorizarDiario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoMayorizarDiario = new JLabelMe();
		jLabelIdProcesoMayorizarDiario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoMayorizarDiario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoMayorizarDiario.setToolTipText(ProcesoMayorizarDiarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoMayorizarDiario= new GridBagLayout();

		this.jPanelidProcesoMayorizarDiario.setLayout(this.gridaBagLayoutProcesoMayorizarDiario);

		jLabelidProcesoMayorizarDiario = new JLabel();
		jLabelidProcesoMayorizarDiario.setText("Id");

		jLabelidProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioProcesoMayorizarDiario = new JLabelMe();
		this.jLabelfecha_inicioProcesoMayorizarDiario.setText(""+ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioProcesoMayorizarDiario.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioProcesoMayorizarDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioProcesoMayorizarDiario.setToolTipText(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		this.jPanelfecha_inicioProcesoMayorizarDiario.setLayout(this.gridaBagLayoutProcesoMayorizarDiario);


		//jFormattedTextFieldfecha_inicioProcesoMayorizarDiario= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioProcesoMayorizarDiario= new JDateChooser();
		jDateChooserfecha_inicioProcesoMayorizarDiario.setEnabled(false);
		jDateChooserfecha_inicioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioProcesoMayorizarDiario.setDate(new Date());
		jDateChooserfecha_inicioProcesoMayorizarDiario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioProcesoMayorizarDiario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda= new JButtonMe();
		this.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda.setText("U");
		this.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioProcesoMayorizarDiarioBusqueda"));

		if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finProcesoMayorizarDiario = new JLabelMe();
		this.jLabelfecha_finProcesoMayorizarDiario.setText(""+ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finProcesoMayorizarDiario.setToolTipText("Fecha Fin");
		this.jLabelfecha_finProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finProcesoMayorizarDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finProcesoMayorizarDiario.setToolTipText(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		this.jPanelfecha_finProcesoMayorizarDiario.setLayout(this.gridaBagLayoutProcesoMayorizarDiario);


		//jFormattedTextFieldfecha_finProcesoMayorizarDiario= new JFormattedTextFieldMe();

		jDateChooserfecha_finProcesoMayorizarDiario= new JDateChooser();
		jDateChooserfecha_finProcesoMayorizarDiario.setEnabled(false);
		jDateChooserfecha_finProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finProcesoMayorizarDiario.setDate(new Date());
		jDateChooserfecha_finProcesoMayorizarDiario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finProcesoMayorizarDiario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finProcesoMayorizarDiarioBusqueda= new JButtonMe();
		this.jButtonfecha_finProcesoMayorizarDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finProcesoMayorizarDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finProcesoMayorizarDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finProcesoMayorizarDiarioBusqueda.setText("U");
		this.jButtonfecha_finProcesoMayorizarDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finProcesoMayorizarDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finProcesoMayorizarDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finProcesoMayorizarDiarioBusqueda"));

		if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finProcesoMayorizarDiarioBusqueda.setVisible(false);		}


					
		this.jLabelcodigoProcesoMayorizarDiario = new JLabelMe();
		this.jLabelcodigoProcesoMayorizarDiario.setText(""+ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProcesoMayorizarDiario.setToolTipText("Codigo");
		this.jLabelcodigoProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProcesoMayorizarDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProcesoMayorizarDiario.setToolTipText(ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		this.jPanelcodigoProcesoMayorizarDiario.setLayout(this.gridaBagLayoutProcesoMayorizarDiario);


		jTextFieldcodigoProcesoMayorizarDiario= new JTextFieldMe();

		jTextFieldcodigoProcesoMayorizarDiario.setEnabled(false);
		jTextFieldcodigoProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProcesoMayorizarDiarioBusqueda= new JButtonMe();
		this.jButtoncodigoProcesoMayorizarDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoMayorizarDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoMayorizarDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProcesoMayorizarDiarioBusqueda.setText("U");
		this.jButtoncodigoProcesoMayorizarDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProcesoMayorizarDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProcesoMayorizarDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProcesoMayorizarDiarioBusqueda"));

		if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProcesoMayorizarDiarioBusqueda.setVisible(false);		}


					
		this.jLabelfechaProcesoMayorizarDiario = new JLabelMe();
		this.jLabelfechaProcesoMayorizarDiario.setText(""+ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaProcesoMayorizarDiario.setToolTipText("Fecha");
		this.jLabelfechaProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaProcesoMayorizarDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaProcesoMayorizarDiario.setToolTipText(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		this.jPanelfechaProcesoMayorizarDiario.setLayout(this.gridaBagLayoutProcesoMayorizarDiario);


		//jFormattedTextFieldfechaProcesoMayorizarDiario= new JFormattedTextFieldMe();

		jDateChooserfechaProcesoMayorizarDiario= new JDateChooser();
		jDateChooserfechaProcesoMayorizarDiario.setEnabled(false);
		jDateChooserfechaProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaProcesoMayorizarDiario.setDate(new Date());
		jDateChooserfechaProcesoMayorizarDiario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaProcesoMayorizarDiario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaProcesoMayorizarDiarioBusqueda= new JButtonMe();
		this.jButtonfechaProcesoMayorizarDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoMayorizarDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoMayorizarDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaProcesoMayorizarDiarioBusqueda.setText("U");
		this.jButtonfechaProcesoMayorizarDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaProcesoMayorizarDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaProcesoMayorizarDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaProcesoMayorizarDiarioBusqueda"));

		if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaProcesoMayorizarDiarioBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioProcesoMayorizarDiario = new JLabelMe();
		this.jLabelbeneficiarioProcesoMayorizarDiario.setText(""+ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioProcesoMayorizarDiario.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioProcesoMayorizarDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioProcesoMayorizarDiario.setToolTipText(ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		this.jPanelbeneficiarioProcesoMayorizarDiario.setLayout(this.gridaBagLayoutProcesoMayorizarDiario);


		jTextAreabeneficiarioProcesoMayorizarDiario= new JTextAreaMe();
		jTextAreabeneficiarioProcesoMayorizarDiario.setEnabled(false);
		jTextAreabeneficiarioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioProcesoMayorizarDiario.setLineWrap(true);
		jTextAreabeneficiarioProcesoMayorizarDiario.setWrapStyleWord(true);
		jTextAreabeneficiarioProcesoMayorizarDiario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioProcesoMayorizarDiario.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioProcesoMayorizarDiario = new JScrollPane(jTextAreabeneficiarioProcesoMayorizarDiario);
		jscrollPanebeneficiarioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda= new JButtonMe();
		this.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda.setText("U");
		this.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioProcesoMayorizarDiarioBusqueda"));

		if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda.setVisible(false);		}


					
		this.jLabelvalorProcesoMayorizarDiario = new JLabelMe();
		this.jLabelvalorProcesoMayorizarDiario.setText(""+ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorProcesoMayorizarDiario.setToolTipText("Valor");
		this.jLabelvalorProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorProcesoMayorizarDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorProcesoMayorizarDiario.setToolTipText(ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		this.jPanelvalorProcesoMayorizarDiario.setLayout(this.gridaBagLayoutProcesoMayorizarDiario);


		jTextFieldvalorProcesoMayorizarDiario= new JTextFieldMe();
		jTextFieldvalorProcesoMayorizarDiario.setEnabled(false);
		jTextFieldvalorProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorProcesoMayorizarDiario.setText("0.0");

		this.jButtonvalorProcesoMayorizarDiarioBusqueda= new JButtonMe();
		this.jButtonvalorProcesoMayorizarDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorProcesoMayorizarDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorProcesoMayorizarDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorProcesoMayorizarDiarioBusqueda.setText("U");
		this.jButtonvalorProcesoMayorizarDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorProcesoMayorizarDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorProcesoMayorizarDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorProcesoMayorizarDiarioBusqueda"));

		if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorProcesoMayorizarDiarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoMayorizarDiario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProcesoMayorizarDiario = new JLabelMe();
		this.jLabelid_empresaProcesoMayorizarDiario.setText(""+ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProcesoMayorizarDiario.setToolTipText("Empresa");
		this.jLabelid_empresaProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProcesoMayorizarDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProcesoMayorizarDiario.setToolTipText(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		this.jPanelid_empresaProcesoMayorizarDiario.setLayout(this.gridaBagLayoutProcesoMayorizarDiario);


		jComboBoxid_empresaProcesoMayorizarDiario= new JComboBoxMe();
		jComboBoxid_empresaProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProcesoMayorizarDiario.setEnabled(false);

		this.jButtonid_empresaProcesoMayorizarDiario= new JButtonMe();
		this.jButtonid_empresaProcesoMayorizarDiario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoMayorizarDiario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoMayorizarDiario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoMayorizarDiario.setText("Buscar");
		this.jButtonid_empresaProcesoMayorizarDiario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProcesoMayorizarDiario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoMayorizarDiario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoMayorizarDiario"));

		this.jButtonid_empresaProcesoMayorizarDiarioBusqueda= new JButtonMe();
		this.jButtonid_empresaProcesoMayorizarDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoMayorizarDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoMayorizarDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoMayorizarDiarioBusqueda.setText("U");
		this.jButtonid_empresaProcesoMayorizarDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProcesoMayorizarDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoMayorizarDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoMayorizarDiarioBusqueda"));

		if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProcesoMayorizarDiarioBusqueda.setVisible(false);		}

		this.jButtonid_empresaProcesoMayorizarDiarioUpdate= new JButtonMe();
		this.jButtonid_empresaProcesoMayorizarDiarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoMayorizarDiarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoMayorizarDiarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoMayorizarDiarioUpdate.setText("U");
		this.jButtonid_empresaProcesoMayorizarDiarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProcesoMayorizarDiarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoMayorizarDiarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoMayorizarDiarioUpdate"));



					
		this.jLabelid_sucursalProcesoMayorizarDiario = new JLabelMe();
		this.jLabelid_sucursalProcesoMayorizarDiario.setText(""+ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProcesoMayorizarDiario.setToolTipText("Sucursal");
		this.jLabelid_sucursalProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProcesoMayorizarDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProcesoMayorizarDiario.setToolTipText(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		this.jPanelid_sucursalProcesoMayorizarDiario.setLayout(this.gridaBagLayoutProcesoMayorizarDiario);


		jComboBoxid_sucursalProcesoMayorizarDiario= new JComboBoxMe();
		jComboBoxid_sucursalProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProcesoMayorizarDiario.setEnabled(false);

		this.jButtonid_sucursalProcesoMayorizarDiario= new JButtonMe();
		this.jButtonid_sucursalProcesoMayorizarDiario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoMayorizarDiario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoMayorizarDiario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoMayorizarDiario.setText("Buscar");
		this.jButtonid_sucursalProcesoMayorizarDiario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProcesoMayorizarDiario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoMayorizarDiario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoMayorizarDiario"));

		this.jButtonid_sucursalProcesoMayorizarDiarioBusqueda= new JButtonMe();
		this.jButtonid_sucursalProcesoMayorizarDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoMayorizarDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoMayorizarDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoMayorizarDiarioBusqueda.setText("U");
		this.jButtonid_sucursalProcesoMayorizarDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProcesoMayorizarDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoMayorizarDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoMayorizarDiarioBusqueda"));

		if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProcesoMayorizarDiarioBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProcesoMayorizarDiarioUpdate= new JButtonMe();
		this.jButtonid_sucursalProcesoMayorizarDiarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoMayorizarDiarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoMayorizarDiarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoMayorizarDiarioUpdate.setText("U");
		this.jButtonid_sucursalProcesoMayorizarDiarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProcesoMayorizarDiarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoMayorizarDiarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoMayorizarDiarioUpdate"));



					
		this.jLabelid_ejercicioProcesoMayorizarDiario = new JLabelMe();
		this.jLabelid_ejercicioProcesoMayorizarDiario.setText(""+ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioProcesoMayorizarDiario.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioProcesoMayorizarDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioProcesoMayorizarDiario.setToolTipText(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		this.jPanelid_ejercicioProcesoMayorizarDiario.setLayout(this.gridaBagLayoutProcesoMayorizarDiario);


		jComboBoxid_ejercicioProcesoMayorizarDiario= new JComboBoxMe();
		jComboBoxid_ejercicioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioProcesoMayorizarDiario.setEnabled(false);

		this.jButtonid_ejercicioProcesoMayorizarDiario= new JButtonMe();
		this.jButtonid_ejercicioProcesoMayorizarDiario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoMayorizarDiario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoMayorizarDiario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoMayorizarDiario.setText("Buscar");
		this.jButtonid_ejercicioProcesoMayorizarDiario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioProcesoMayorizarDiario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoMayorizarDiario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoMayorizarDiario"));

		this.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda= new JButtonMe();
		this.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda.setText("U");
		this.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoMayorizarDiarioBusqueda"));

		if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioProcesoMayorizarDiarioUpdate= new JButtonMe();
		this.jButtonid_ejercicioProcesoMayorizarDiarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoMayorizarDiarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoMayorizarDiarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoMayorizarDiarioUpdate.setText("U");
		this.jButtonid_ejercicioProcesoMayorizarDiarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioProcesoMayorizarDiarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoMayorizarDiarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoMayorizarDiarioUpdate"));



					
		this.jLabelid_tipo_movimientoProcesoMayorizarDiario = new JLabelMe();
		this.jLabelid_tipo_movimientoProcesoMayorizarDiario.setText(""+ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoProcesoMayorizarDiario.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoProcesoMayorizarDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoProcesoMayorizarDiario.setToolTipText(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		this.jPanelid_tipo_movimientoProcesoMayorizarDiario.setLayout(this.gridaBagLayoutProcesoMayorizarDiario);


		jComboBoxid_tipo_movimientoProcesoMayorizarDiario= new JComboBoxMe();
		jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoProcesoMayorizarDiario= new JButtonMe();
		this.jButtonid_tipo_movimientoProcesoMayorizarDiario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoProcesoMayorizarDiario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoProcesoMayorizarDiario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoProcesoMayorizarDiario.setText("Buscar");
		this.jButtonid_tipo_movimientoProcesoMayorizarDiario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoProcesoMayorizarDiario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoProcesoMayorizarDiario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoProcesoMayorizarDiario"));

		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda.setText("U");
		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoProcesoMayorizarDiarioBusqueda"));

		if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate.setText("U");
		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoProcesoMayorizarDiarioUpdate"));



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
		//this.jInternalFrameDetalleProcesoMayorizarDiario = new ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Mayorizar Diario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoMayorizarDiario= new GridBagLayout();
		

		
		String sToolTipProcesoMayorizarDiario="";
		sToolTipProcesoMayorizarDiario=ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoMayorizarDiario+="(Contabilidad.ProcesoMayorizarDiario)";
		}
		
		if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoMayorizarDiario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoMayorizarDiario = new JButtonMe();
		this.jButtonModificarProcesoMayorizarDiario = new JButtonMe();
        this.jButtonActualizarProcesoMayorizarDiario = new JButtonMe();
        this.jButtonEliminarProcesoMayorizarDiario = new JButtonMe();
        this.jButtonCancelarProcesoMayorizarDiario = new JButtonMe();
        this.jButtonGuardarCambiosProcesoMayorizarDiario = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoMayorizarDiario = new JButtonMe();
		this.jButtonCerrarProcesoMayorizarDiario = new JButtonMe();
		
		this.jScrollPanelDatosProcesoMayorizarDiario = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoMayorizarDiario = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoMayorizarDiario = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Mayorizar Diario";
		
		if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Mayorizar Diarioes" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoMayorizarDiario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoMayorizarDiario.setName("jPanelCamposProcesoMayorizarDiario"); 

		this.jPanelCamposOcultosProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoMayorizarDiario.setName("jPanelCamposOcultosProcesoMayorizarDiario"); 

        this.jPanelAccionesProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoMayorizarDiario.setToolTipText("Acciones");
        this.jPanelAccionesProcesoMayorizarDiario.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoMayorizarDiario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoMayorizarDiario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoMayorizarDiario.setText("Nuevo");
		this.jButtonModificarProcesoMayorizarDiario.setText("Editar");
        this.jButtonActualizarProcesoMayorizarDiario.setText("Actualizar");
        this.jButtonEliminarProcesoMayorizarDiario.setText("Eliminar");
        this.jButtonCancelarProcesoMayorizarDiario.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoMayorizarDiario.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.setText("Guardar");
		this.jButtonCerrarProcesoMayorizarDiario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoMayorizarDiario,"nuevo_button","Nuevo",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoMayorizarDiario,"modificar_button","Editar",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoMayorizarDiario,"actualizar_button","Actualizar",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoMayorizarDiario,"eliminar_button","Eliminar",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoMayorizarDiario,"cancelar_button","Cancelar",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoMayorizarDiario,"guardarcambios_button","Guardar",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoMayorizarDiario,"guardarcambiostabla_button","Guardar",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoMayorizarDiario,"cerrar_button","Salir",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoMayorizarDiario.setToolTipText("Nuevo"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoMayorizarDiario.setToolTipText("Editar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoMayorizarDiario.setToolTipText("Actualizar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoMayorizarDiario.setToolTipText("Eliminar)"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoMayorizarDiario.setToolTipText("Cancelar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoMayorizarDiario.setToolTipText("Guardar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.setToolTipText("Guardar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoMayorizarDiario.setToolTipText("Salir"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoMayorizarDiario";
		inputMap = this.jButtonNuevoProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoMayorizarDiario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoMayorizarDiario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoMayorizarDiario";
		inputMap = this.jButtonActualizarProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoMayorizarDiario"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoMayorizarDiario";
		inputMap = this.jButtonEliminarProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoMayorizarDiario"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoMayorizarDiario";
		inputMap = this.jButtonCancelarProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoMayorizarDiario"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoMayorizarDiario";
		inputMap = this.jButtonCerrarProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoMayorizarDiario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoMayorizarDiario";
		inputMap = this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoMayorizarDiario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoMayorizarDiario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoMayorizarDiario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoMayorizarDiario.setToolTipText("Nuevo ProcesoMayorizarDiario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoMayorizarDiario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoMayorizarDiario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoMayorizarDiario.setToolTipText("Sin Cerrar Ventana ProcesoMayorizarDiario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoMayorizarDiario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoMayorizarDiario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoMayorizarDiario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoMayorizarDiario.setText("Accion");
		this.jComboBoxTiposAccionesProcesoMayorizarDiario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoMayorizarDiario = new JLabelMe();
		
		this.jLabelAccionesProcesoMayorizarDiario.setText("Acciones");		
		this.jLabelAccionesProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoMayorizarDiario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoMayorizarDiario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoMayorizarDiario=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoMayorizarDiario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoMayorizarDiario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoMayorizarDiario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoMayorizarDiario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoMayorizarDiario = new GridBagLayout();
		
		this.jPanelCamposProcesoMayorizarDiario.setLayout(gridaBagLayoutCamposProcesoMayorizarDiario);
		this.jPanelCamposOcultosProcesoMayorizarDiario.setLayout(gridaBagLayoutCamposOcultosProcesoMayorizarDiario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoMayorizarDiario.add(jLabelIdProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoMayorizarDiario.add(jLabelidProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProcesoMayorizarDiario.add(jLabelid_empresaProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 2;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoMayorizarDiario.add(jButtonid_empresaProcesoMayorizarDiarioBusqueda, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 3;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoMayorizarDiario.add(jButtonid_empresaProcesoMayorizarDiarioUpdate, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProcesoMayorizarDiario.add(jComboBoxid_empresaProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProcesoMayorizarDiario.add(jLabelid_sucursalProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 2;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoMayorizarDiario.add(jButtonid_sucursalProcesoMayorizarDiarioBusqueda, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 3;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoMayorizarDiario.add(jButtonid_sucursalProcesoMayorizarDiarioUpdate, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProcesoMayorizarDiario.add(jComboBoxid_sucursalProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioProcesoMayorizarDiario.add(jLabelid_ejercicioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 2;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoMayorizarDiario.add(jButtonid_ejercicioProcesoMayorizarDiarioBusqueda, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 3;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoMayorizarDiario.add(jButtonid_ejercicioProcesoMayorizarDiarioUpdate, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioProcesoMayorizarDiario.add(jComboBoxid_ejercicioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoProcesoMayorizarDiario.add(jLabelid_tipo_movimientoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 2;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoProcesoMayorizarDiario.add(jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 3;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoProcesoMayorizarDiario.add(jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoProcesoMayorizarDiario.add(jComboBoxid_tipo_movimientoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioProcesoMayorizarDiario.add(jLabelfecha_inicioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 2;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioProcesoMayorizarDiario.add(jButtonfecha_inicioProcesoMayorizarDiarioBusqueda, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioProcesoMayorizarDiario.add(jDateChooserfecha_inicioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finProcesoMayorizarDiario.add(jLabelfecha_finProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 2;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finProcesoMayorizarDiario.add(jButtonfecha_finProcesoMayorizarDiarioBusqueda, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finProcesoMayorizarDiario.add(jDateChooserfecha_finProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProcesoMayorizarDiario.add(jLabelcodigoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 2;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProcesoMayorizarDiario.add(jButtoncodigoProcesoMayorizarDiarioBusqueda, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProcesoMayorizarDiario.add(jTextFieldcodigoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaProcesoMayorizarDiario.add(jLabelfechaProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 2;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaProcesoMayorizarDiario.add(jButtonfechaProcesoMayorizarDiarioBusqueda, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaProcesoMayorizarDiario.add(jDateChooserfechaProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiarioProcesoMayorizarDiario.add(jLabelbeneficiarioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 2;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioProcesoMayorizarDiario.add(jButtonbeneficiarioProcesoMayorizarDiarioBusqueda, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiarioProcesoMayorizarDiario.add(jscrollPanebeneficiarioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorProcesoMayorizarDiario.add(jLabelvalorProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 2;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorProcesoMayorizarDiario.add(jButtonvalorProcesoMayorizarDiarioBusqueda, this.gridBagConstraintsProcesoMayorizarDiario);
	}

	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorProcesoMayorizarDiario.add(jTextFieldvalorProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = iYPanelCamposProcesoMayorizarDiario;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = iXPanelCamposProcesoMayorizarDiario++;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoMayorizarDiario.add(this.jPanelidProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(iXPanelCamposProcesoMayorizarDiario % 1==0) {
		iXPanelCamposProcesoMayorizarDiario=0;
		iYPanelCamposProcesoMayorizarDiario++;
	}
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = iYPanelCamposProcesoMayorizarDiario;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = iXPanelCamposProcesoMayorizarDiario++;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoMayorizarDiario.add(this.jPanelid_tipo_movimientoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(iXPanelCamposProcesoMayorizarDiario % 1==0) {
		iXPanelCamposProcesoMayorizarDiario=0;
		iYPanelCamposProcesoMayorizarDiario++;
	}
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = iYPanelCamposProcesoMayorizarDiario;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = iXPanelCamposProcesoMayorizarDiario++;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoMayorizarDiario.add(this.jPanelfecha_inicioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(iXPanelCamposProcesoMayorizarDiario % 1==0) {
		iXPanelCamposProcesoMayorizarDiario=0;
		iYPanelCamposProcesoMayorizarDiario++;
	}
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = iYPanelCamposProcesoMayorizarDiario;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = iXPanelCamposProcesoMayorizarDiario++;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoMayorizarDiario.add(this.jPanelfecha_finProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(iXPanelCamposProcesoMayorizarDiario % 1==0) {
		iXPanelCamposProcesoMayorizarDiario=0;
		iYPanelCamposProcesoMayorizarDiario++;
	}
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = iYPanelCamposProcesoMayorizarDiario;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = iXPanelCamposProcesoMayorizarDiario++;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoMayorizarDiario.add(this.jPanelcodigoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(iXPanelCamposProcesoMayorizarDiario % 1==0) {
		iXPanelCamposProcesoMayorizarDiario=0;
		iYPanelCamposProcesoMayorizarDiario++;
	}
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = iYPanelCamposProcesoMayorizarDiario;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = iXPanelCamposProcesoMayorizarDiario++;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoMayorizarDiario.add(this.jPanelfechaProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(iXPanelCamposProcesoMayorizarDiario % 1==0) {
		iXPanelCamposProcesoMayorizarDiario=0;
		iYPanelCamposProcesoMayorizarDiario++;
	}
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = iYPanelCamposProcesoMayorizarDiario;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = iXPanelCamposProcesoMayorizarDiario++;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoMayorizarDiario.add(this.jPanelbeneficiarioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(iXPanelCamposProcesoMayorizarDiario % 1==0) {
		iXPanelCamposProcesoMayorizarDiario=0;
		iYPanelCamposProcesoMayorizarDiario++;
	}
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = iYPanelCamposProcesoMayorizarDiario;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = iXPanelCamposProcesoMayorizarDiario++;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoMayorizarDiario.add(this.jPanelvalorProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(iXPanelCamposProcesoMayorizarDiario % 1==0) {
		iXPanelCamposProcesoMayorizarDiario=0;
		iYPanelCamposProcesoMayorizarDiario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = iYPanelCamposOcultosProcesoMayorizarDiario;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = iXPanelCamposOcultosProcesoMayorizarDiario++;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoMayorizarDiario.add(this.jPanelid_empresaProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(iXPanelCamposOcultosProcesoMayorizarDiario % 1==0) {
		iXPanelCamposOcultosProcesoMayorizarDiario=0;
		iYPanelCamposOcultosProcesoMayorizarDiario++;
	}
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = iYPanelCamposOcultosProcesoMayorizarDiario;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = iXPanelCamposOcultosProcesoMayorizarDiario++;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoMayorizarDiario.add(this.jPanelid_sucursalProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(iXPanelCamposOcultosProcesoMayorizarDiario % 1==0) {
		iXPanelCamposOcultosProcesoMayorizarDiario=0;
		iYPanelCamposOcultosProcesoMayorizarDiario++;
	}
	this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoMayorizarDiario.gridy = iYPanelCamposOcultosProcesoMayorizarDiario;
	this.gridBagConstraintsProcesoMayorizarDiario.gridx = iXPanelCamposOcultosProcesoMayorizarDiario++;
	this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoMayorizarDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoMayorizarDiario.add(this.jPanelid_ejercicioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);



	if(iXPanelCamposOcultosProcesoMayorizarDiario % 1==0) {
		iXPanelCamposOcultosProcesoMayorizarDiario=0;
		iYPanelCamposOcultosProcesoMayorizarDiario++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoMayorizarDiario= new GridBagLayout();
		this.jPanelAccionesProcesoMayorizarDiario.setLayout(gridaBagLayoutAccionesProcesoMayorizarDiario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoMayorizarDiario= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoMayorizarDiario.setLayout(gridaBagLayoutAccionesFormularioProcesoMayorizarDiario);
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoMayorizarDiario.add(this.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoMayorizarDiario.add(this.jButtonModificarProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);							

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoMayorizarDiario.add(this.jButtonEliminarProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
			
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoMayorizarDiario.add(this.jButtonActualizarProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoMayorizarDiario.add(this.jButtonGuardarCambiosProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);	
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoMayorizarDiario.add(this.jButtonCancelarProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoMayorizarDiario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();						
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;		
			//this.gridBagConstraintsProcesoMayorizarDiario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx =0;
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoMayorizarDiario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoMayorizarDiarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoMayorizarDiario = new ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Mayorizar Diario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Mayorizar Diario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Mayorizar Diario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoMayorizarDiarioModel procesomayorizardiarioModel=new ProcesoMayorizarDiarioModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoMayorizarDiarioModel.ProcesoMayorizarDiarioFocusTraversalPolicy procesomayorizardiarioFocusTraversalPolicy = procesomayorizardiarioModel.new ProcesoMayorizarDiarioFocusTraversalPolicy(this);
			
			//procesomayorizardiarioFocusTraversalPolicy.setprocesomayorizardiarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesomayorizardiarioModel);
			
			
			this.jContentPaneDetalleProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoMayorizarDiario = new GridBagLayout();	
			this.jContentPaneDetalleProcesoMayorizarDiario.setLayout(gridaBagLayoutDetalleProcesoMayorizarDiario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoMayorizarDiario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
				this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoMayorizarDiario.add(jTtoolBarDetalleProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoMayorizarDiario=   new JScrollPane(jContentPaneDetalleProcesoMayorizarDiario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoMayorizarDiario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	        
			this.jContentPaneDetalleProcesoMayorizarDiario.add(jPanelCamposProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);
			
			
			
			
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
						//&& procesomayorizardiarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoMayorizarDiario= new GridBagConstraints();
						this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
						this.jContentPaneDetalleProcesoMayorizarDiario.add(this.jTabbedPaneRelacionesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoMayorizarDiario.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoMayorizarDiario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
					this.gridBagConstraintsProcesoMayorizarDiario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoMayorizarDiario.add(jPanelCamposOcultosProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);
				
					this.jPanelCamposOcultosProcesoMayorizarDiario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	        this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoMayorizarDiario.add(this.jPanelAccionesFormularioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);							
			
			
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
	        this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoMayorizarDiario.add(this.jPanelAccionesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoMayorizarDiario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoMayorizarDiario=   new JScrollPane(this.jPanelCamposProcesoMayorizarDiario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoMayorizarDiario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);			
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			
			
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
			
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoMayorizarDiario;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoMayorizarDiario;
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
