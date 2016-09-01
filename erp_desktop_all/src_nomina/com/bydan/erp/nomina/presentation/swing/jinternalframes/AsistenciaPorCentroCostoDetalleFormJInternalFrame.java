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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.AsistenciaPorCentroCostoConstantesFunciones;

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
public class AsistenciaPorCentroCostoDetalleFormJInternalFrame extends AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAsistenciaPorCentroCosto;
	
	protected JMenuBar jmenuBarDetalleAsistenciaPorCentroCosto;
	
	protected JMenu jmenuDetalleAsistenciaPorCentroCosto;
	protected JMenu jmenuDetalleArchivoAsistenciaPorCentroCosto;
	protected JMenu jmenuDetalleAccionesAsistenciaPorCentroCosto;
	protected JMenu jmenuDetalleDatosAsistenciaPorCentroCosto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAsistenciaPorCentroCosto;	
	protected GridBagConstraints gridBagConstraintsAsistenciaPorCentroCosto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional jInternalFrameDetalleAsistenciaPorCentroCosto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public AsistenciaPorCentroCostoSessionBean asistenciaporcentrocostoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public AsistenciaPorCentroCostoLogic asistenciaporcentrocostoLogic;
	
	public JScrollPane jScrollPanelDatosAsistenciaPorCentroCosto;
	public JScrollPane jScrollPanelDatosEdicionAsistenciaPorCentroCosto;
	public JScrollPane jScrollPanelDatosGeneralAsistenciaPorCentroCosto;
	
	protected JPanel jPanelCamposAsistenciaPorCentroCosto;    
	protected JPanel jPanelCamposOcultosAsistenciaPorCentroCosto;    	
	protected JPanel jPanelAccionesAsistenciaPorCentroCosto;
	protected JPanel jPanelAccionesFormularioAsistenciaPorCentroCosto;
    
	
	
	protected Integer iXPanelCamposAsistenciaPorCentroCosto=0;
	protected Integer iYPanelCamposAsistenciaPorCentroCosto=0;
	
	protected Integer iXPanelCamposOcultosAsistenciaPorCentroCosto=0;
	protected Integer iYPanelCamposOcultosAsistenciaPorCentroCosto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAsistenciaPorCentroCosto;
	public JButton jButtonModificarAsistenciaPorCentroCosto;
	public JButton jButtonActualizarAsistenciaPorCentroCosto;
    public JButton jButtonEliminarAsistenciaPorCentroCosto;
	public JButton jButtonCancelarAsistenciaPorCentroCosto;
    public JButton jButtonGuardarCambiosAsistenciaPorCentroCosto;
	public JButton jButtonGuardarCambiosTablaAsistenciaPorCentroCosto;
	protected JButton jButtonCerrarAsistenciaPorCentroCosto;
	
	
	protected JButton jButtonProcesarInformacionAsistenciaPorCentroCosto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAsistenciaPorCentroCosto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAsistenciaPorCentroCosto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAsistenciaPorCentroCosto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonModificarToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonActualizarToolBarAsistenciaPorCentroCosto;
    protected JButton jButtonEliminarToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonCancelarToolBarAsistenciaPorCentroCosto;
    protected JButton jButtonGuardarCambiosToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonGuardarCambiosTablaToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonCerrarToolBarAsistenciaPorCentroCosto;
	
	protected JButton jButtonProcesarInformacionToolBarAsistenciaPorCentroCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemModificarAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemActualizarAsistenciaPorCentroCosto;
    protected JMenuItem jMenuItemEliminarAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemCancelarAsistenciaPorCentroCosto;
    protected JMenuItem jMenuItemGuardarCambiosAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemCerrarAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemDetalleCerrarAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto;
	
	protected JMenuItem jMenuItemProcesarInformacionAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemMostrarOcultarAsistenciaPorCentroCosto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAsistenciaPorCentroCosto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAsistenciaPorCentroCosto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAsistenciaPorCentroCosto;
	public JLabel jLabelIdAsistenciaPorCentroCosto;
	public JLabel jLabelidAsistenciaPorCentroCosto;
	public JButton jButtonidAsistenciaPorCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelfechaAsistenciaPorCentroCosto;
	public JLabel jLabelfechaAsistenciaPorCentroCosto;
	//public JFormattedTextField jDateChooserfechaAsistenciaPorCentroCosto;

	public JDateChooser jDateChooserfechaAsistenciaPorCentroCosto;
	public JButton jButtonfechaAsistenciaPorCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeAsistenciaPorCentroCosto;
	public JLabel jLabelporcentajeAsistenciaPorCentroCosto;
	public JTextField jTextFieldporcentajeAsistenciaPorCentroCosto;
	public JButton jButtonporcentajeAsistenciaPorCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_horaAsistenciaPorCentroCosto;
	public JLabel jLabelvalor_horaAsistenciaPorCentroCosto;
	public JTextField jTextFieldvalor_horaAsistenciaPorCentroCosto;
	public JButton jButtonvalor_horaAsistenciaPorCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelpermisoAsistenciaPorCentroCosto;
	public JLabel jLabelpermisoAsistenciaPorCentroCosto;
	public JTextField jTextFieldpermisoAsistenciaPorCentroCosto;
	public JButton jButtonpermisoAsistenciaPorCentroCostoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAsistenciaPorCentroCosto;
	public JLabel jLabelid_empresaAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAsistenciaPorCentroCosto;
	public JButton jButtonid_empresaAsistenciaPorCentroCosto= new JButtonMe();
	public JButton jButtonid_empresaAsistenciaPorCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_empresaAsistenciaPorCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoAsistenciaPorCentroCosto;
	public JLabel jLabelid_centro_costoAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoAsistenciaPorCentroCosto;
	public JButton jButtonid_centro_costoAsistenciaPorCentroCosto= new JButtonMe();
	public JButton jButtonid_centro_costoAsistenciaPorCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoAsistenciaPorCentroCostoArbol= new JButtonMe();

	public JPanel jPanelid_empleadoAsistenciaPorCentroCosto;
	public JLabel jLabelid_empleadoAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoAsistenciaPorCentroCosto;
	public JButton jButtonid_empleadoAsistenciaPorCentroCosto= new JButtonMe();
	public JButton jButtonid_empleadoAsistenciaPorCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoAsistenciaPorCentroCostoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAsistenciaPorCentroCosto;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AsistenciaPorCentroCostoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAsistenciaPorCentroCosto=new JPanel();
				this.jPanelAccionesFormularioAsistenciaPorCentroCosto=new JPanel();
				this.jmenuBarDetalleAsistenciaPorCentroCosto=new JMenuBar();
				this.jTtoolBarDetalleAsistenciaPorCentroCosto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaPorCentroCostoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AsistenciaPorCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AsistenciaPorCentroCostoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AsistenciaPorCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaPorCentroCostoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaPorCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaPorCentroCostoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaPorCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaPorCentroCostoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AsistenciaPorCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAsistenciaPorCentroCosto() {
		return this.jButtonActualizarToolBarAsistenciaPorCentroCosto;
	}
	
	public JButton getjButtonEliminarToolBarAsistenciaPorCentroCosto() {
		return this.jButtonEliminarToolBarAsistenciaPorCentroCosto;
	}
	
	public JButton getjButtonCancelarToolBarAsistenciaPorCentroCosto() {
		return this.jButtonCancelarToolBarAsistenciaPorCentroCosto;
	}		
	
	public JButton getjButtonProcesarInformacionAsistenciaPorCentroCosto() {
		return this.jButtonProcesarInformacionAsistenciaPorCentroCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAsistenciaPorCentroCosto)	{
		this.jButtonProcesarInformacionAsistenciaPorCentroCosto = jButtonProcesarInformacionAsistenciaPorCentroCosto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAsistenciaPorCentroCosto() {
		return this.jComboBoxTiposAccionesAsistenciaPorCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAsistenciaPorCentroCosto(
			JComboBox jComboBoxTiposRelacionesAsistenciaPorCentroCosto) {
		this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto = jComboBoxTiposRelacionesAsistenciaPorCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAsistenciaPorCentroCosto(
			JComboBox jComboBoxTiposAccionesAsistenciaPorCentroCosto) {
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto = jComboBoxTiposAccionesAsistenciaPorCentroCosto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto() {
		return this.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto(
			JComboBox jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto) {
		this.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto = jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
		
		this.asistenciaporcentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asistenciaporcentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AsistenciaPorCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AsistenciaPorCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AsistenciaPorCentroCostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asistencia Por Centro Costo MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
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
	
		AsistenciaPorCentroCostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAsistenciaPorCentroCosto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAsistenciaPorCentroCosto=new JButtonMe();
				this.jButtonModificarToolBarAsistenciaPorCentroCosto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAsistenciaPorCentroCosto,this.jTtoolBarDetalleAsistenciaPorCentroCosto,
							"actualizar","actualizar","Actualizar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAsistenciaPorCentroCosto,this.jTtoolBarDetalleAsistenciaPorCentroCosto,
							"eliminar","eliminar","Eliminar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAsistenciaPorCentroCosto,this.jTtoolBarDetalleAsistenciaPorCentroCosto,
							"cancelar","cancelar","Cancelar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAsistenciaPorCentroCosto,this.jTtoolBarDetalleAsistenciaPorCentroCosto,
							"guardarcambios","guardarcambios","Guardar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAsistenciaPorCentroCosto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAsistenciaPorCentroCosto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAsistenciaPorCentroCosto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAsistenciaPorCentroCosto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAsistenciaPorCentroCosto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAsistenciaPorCentroCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAsistenciaPorCentroCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAsistenciaPorCentroCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAsistenciaPorCentroCosto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAsistenciaPorCentroCosto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAsistenciaPorCentroCosto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAsistenciaPorCentroCosto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAsistenciaPorCentroCosto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAsistenciaPorCentroCosto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAsistenciaPorCentroCosto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAsistenciaPorCentroCosto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAsistenciaPorCentroCosto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAsistenciaPorCentroCosto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAsistenciaPorCentroCosto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAsistenciaPorCentroCosto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAsistenciaPorCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAsistenciaPorCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAsistenciaPorCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAsistenciaPorCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAsistenciaPorCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAsistenciaPorCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAsistenciaPorCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAsistenciaPorCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAsistenciaPorCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAsistenciaPorCentroCosto.add(this.jMenuItemDetalleCerrarAsistenciaPorCentroCosto);
		
		this.jmenuDetalleAccionesAsistenciaPorCentroCosto.add(this.jMenuItemActualizarAsistenciaPorCentroCosto);
		this.jmenuDetalleAccionesAsistenciaPorCentroCosto.add(this.jMenuItemEliminarAsistenciaPorCentroCosto);
		this.jmenuDetalleAccionesAsistenciaPorCentroCosto.add(this.jMenuItemCancelarAsistenciaPorCentroCosto);		
		
		//this.jmenuDetalleDatosAsistenciaPorCentroCosto.add(this.jMenuItemDetalleAbrirOrderByAsistenciaPorCentroCosto);				
		this.jmenuDetalleDatosAsistenciaPorCentroCosto.add(this.jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto);				
				
		//this.jmenuDetalleAccionesAsistenciaPorCentroCosto.add(this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAsistenciaPorCentroCosto.add(this.jmenuDetalleArchivoAsistenciaPorCentroCosto);		
		this.jmenuBarDetalleAsistenciaPorCentroCosto.add(this.jmenuDetalleAccionesAsistenciaPorCentroCosto);		
		this.jmenuBarDetalleAsistenciaPorCentroCosto.add(this.jmenuDetalleDatosAsistenciaPorCentroCosto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAsistenciaPorCentroCosto);				
	}
	
	
	public void inicializarElementosCamposAsistenciaPorCentroCosto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAsistenciaPorCentroCosto = new JLabelMe();
		jLabelIdAsistenciaPorCentroCosto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAsistenciaPorCentroCosto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAsistenciaPorCentroCosto.setToolTipText(AsistenciaPorCentroCostoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAsistenciaPorCentroCosto= new GridBagLayout();

		this.jPanelidAsistenciaPorCentroCosto.setLayout(this.gridaBagLayoutAsistenciaPorCentroCosto);

		jLabelidAsistenciaPorCentroCosto = new JLabel();
		jLabelidAsistenciaPorCentroCosto.setText("Id");

		jLabelidAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaAsistenciaPorCentroCosto = new JLabelMe();
		this.jLabelfechaAsistenciaPorCentroCosto.setText(""+AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaAsistenciaPorCentroCosto.setToolTipText("Fecha");
		this.jLabelfechaAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaAsistenciaPorCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaAsistenciaPorCentroCosto.setToolTipText(AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutAsistenciaPorCentroCosto = new GridBagLayout();
		this.jPanelfechaAsistenciaPorCentroCosto.setLayout(this.gridaBagLayoutAsistenciaPorCentroCosto);


		//jFormattedTextFieldfechaAsistenciaPorCentroCosto= new JFormattedTextFieldMe();

		jDateChooserfechaAsistenciaPorCentroCosto= new JDateChooser();
		jDateChooserfechaAsistenciaPorCentroCosto.setEnabled(false);
		jDateChooserfechaAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaAsistenciaPorCentroCosto.setDate(new Date());
		jDateChooserfechaAsistenciaPorCentroCosto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaAsistenciaPorCentroCosto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaAsistenciaPorCentroCostoBusqueda= new JButtonMe();
		this.jButtonfechaAsistenciaPorCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAsistenciaPorCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAsistenciaPorCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaAsistenciaPorCentroCostoBusqueda.setText("U");
		this.jButtonfechaAsistenciaPorCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaAsistenciaPorCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaAsistenciaPorCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaAsistenciaPorCentroCostoBusqueda"));

		if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaAsistenciaPorCentroCostoBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeAsistenciaPorCentroCosto = new JLabelMe();
		this.jLabelporcentajeAsistenciaPorCentroCosto.setText(""+AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeAsistenciaPorCentroCosto.setToolTipText("Porcentaje");
		this.jLabelporcentajeAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeAsistenciaPorCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeAsistenciaPorCentroCosto.setToolTipText(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutAsistenciaPorCentroCosto = new GridBagLayout();
		this.jPanelporcentajeAsistenciaPorCentroCosto.setLayout(this.gridaBagLayoutAsistenciaPorCentroCosto);


		jTextFieldporcentajeAsistenciaPorCentroCosto= new JTextFieldMe();
		jTextFieldporcentajeAsistenciaPorCentroCosto.setEnabled(false);
		jTextFieldporcentajeAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeAsistenciaPorCentroCosto.setText("0.0");

		this.jButtonporcentajeAsistenciaPorCentroCostoBusqueda= new JButtonMe();
		this.jButtonporcentajeAsistenciaPorCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeAsistenciaPorCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeAsistenciaPorCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeAsistenciaPorCentroCostoBusqueda.setText("U");
		this.jButtonporcentajeAsistenciaPorCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeAsistenciaPorCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeAsistenciaPorCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeAsistenciaPorCentroCostoBusqueda"));

		if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeAsistenciaPorCentroCostoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_horaAsistenciaPorCentroCosto = new JLabelMe();
		this.jLabelvalor_horaAsistenciaPorCentroCosto.setText(""+AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA+" : *");
		this.jLabelvalor_horaAsistenciaPorCentroCosto.setToolTipText("Valor Hora");
		this.jLabelvalor_horaAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_horaAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_horaAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_horaAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_horaAsistenciaPorCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_horaAsistenciaPorCentroCosto.setToolTipText(AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA);
		this.gridaBagLayoutAsistenciaPorCentroCosto = new GridBagLayout();
		this.jPanelvalor_horaAsistenciaPorCentroCosto.setLayout(this.gridaBagLayoutAsistenciaPorCentroCosto);


		jTextFieldvalor_horaAsistenciaPorCentroCosto= new JTextFieldMe();
		jTextFieldvalor_horaAsistenciaPorCentroCosto.setEnabled(false);
		jTextFieldvalor_horaAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_horaAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_horaAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_horaAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_horaAsistenciaPorCentroCosto.setText("0.0");

		this.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda= new JButtonMe();
		this.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda.setText("U");
		this.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_horaAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_horaAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_horaAsistenciaPorCentroCostoBusqueda"));

		if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda.setVisible(false);		}


					
		this.jLabelpermisoAsistenciaPorCentroCosto = new JLabelMe();
		this.jLabelpermisoAsistenciaPorCentroCosto.setText(""+AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO+" : *");
		this.jLabelpermisoAsistenciaPorCentroCosto.setToolTipText("Permiso");
		this.jLabelpermisoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpermisoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpermisoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpermisoAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpermisoAsistenciaPorCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpermisoAsistenciaPorCentroCosto.setToolTipText(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO);
		this.gridaBagLayoutAsistenciaPorCentroCosto = new GridBagLayout();
		this.jPanelpermisoAsistenciaPorCentroCosto.setLayout(this.gridaBagLayoutAsistenciaPorCentroCosto);


		jTextFieldpermisoAsistenciaPorCentroCosto= new JTextFieldMe();
		jTextFieldpermisoAsistenciaPorCentroCosto.setEnabled(false);
		jTextFieldpermisoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpermisoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpermisoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpermisoAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpermisoAsistenciaPorCentroCosto.setText("0.0");

		this.jButtonpermisoAsistenciaPorCentroCostoBusqueda= new JButtonMe();
		this.jButtonpermisoAsistenciaPorCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpermisoAsistenciaPorCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpermisoAsistenciaPorCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpermisoAsistenciaPorCentroCostoBusqueda.setText("U");
		this.jButtonpermisoAsistenciaPorCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpermisoAsistenciaPorCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpermisoAsistenciaPorCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpermisoAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpermisoAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"permisoAsistenciaPorCentroCostoBusqueda"));

		if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpermisoAsistenciaPorCentroCostoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAsistenciaPorCentroCosto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAsistenciaPorCentroCosto = new JLabelMe();
		this.jLabelid_empresaAsistenciaPorCentroCosto.setText(""+AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAsistenciaPorCentroCosto.setToolTipText("Empresa");
		this.jLabelid_empresaAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAsistenciaPorCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAsistenciaPorCentroCosto.setToolTipText(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAsistenciaPorCentroCosto = new GridBagLayout();
		this.jPanelid_empresaAsistenciaPorCentroCosto.setLayout(this.gridaBagLayoutAsistenciaPorCentroCosto);


		jComboBoxid_empresaAsistenciaPorCentroCosto= new JComboBoxMe();
		jComboBoxid_empresaAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAsistenciaPorCentroCosto.setEnabled(false);

		this.jButtonid_empresaAsistenciaPorCentroCosto= new JButtonMe();
		this.jButtonid_empresaAsistenciaPorCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsistenciaPorCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsistenciaPorCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsistenciaPorCentroCosto.setText("Buscar");
		this.jButtonid_empresaAsistenciaPorCentroCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAsistenciaPorCentroCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsistenciaPorCentroCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsistenciaPorCentroCosto"));

		this.jButtonid_empresaAsistenciaPorCentroCostoBusqueda= new JButtonMe();
		this.jButtonid_empresaAsistenciaPorCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaPorCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaPorCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAsistenciaPorCentroCostoBusqueda.setText("U");
		this.jButtonid_empresaAsistenciaPorCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAsistenciaPorCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsistenciaPorCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsistenciaPorCentroCostoBusqueda"));

		if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAsistenciaPorCentroCostoBusqueda.setVisible(false);		}

		this.jButtonid_empresaAsistenciaPorCentroCostoUpdate= new JButtonMe();
		this.jButtonid_empresaAsistenciaPorCentroCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaPorCentroCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaPorCentroCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAsistenciaPorCentroCostoUpdate.setText("U");
		this.jButtonid_empresaAsistenciaPorCentroCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAsistenciaPorCentroCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsistenciaPorCentroCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsistenciaPorCentroCostoUpdate"));



					
		this.jLabelid_centro_costoAsistenciaPorCentroCosto = new JLabelMe();
		this.jLabelid_centro_costoAsistenciaPorCentroCosto.setText(""+AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoAsistenciaPorCentroCosto.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoAsistenciaPorCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoAsistenciaPorCentroCosto.setToolTipText(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutAsistenciaPorCentroCosto = new GridBagLayout();
		this.jPanelid_centro_costoAsistenciaPorCentroCosto.setLayout(this.gridaBagLayoutAsistenciaPorCentroCosto);


		jComboBoxid_centro_costoAsistenciaPorCentroCosto= new JComboBoxMe();
		jComboBoxid_centro_costoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoAsistenciaPorCentroCosto= new JButtonMe();
		this.jButtonid_centro_costoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoAsistenciaPorCentroCosto.setText("Buscar");
		this.jButtonid_centro_costoAsistenciaPorCentroCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoAsistenciaPorCentroCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoAsistenciaPorCentroCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoAsistenciaPorCentroCosto"));

		this.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda.setText("U");
		this.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoAsistenciaPorCentroCostoBusqueda"));

		if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoAsistenciaPorCentroCostoUpdate= new JButtonMe();
		this.jButtonid_centro_costoAsistenciaPorCentroCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoAsistenciaPorCentroCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoAsistenciaPorCentroCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoAsistenciaPorCentroCostoUpdate.setText("U");
		this.jButtonid_centro_costoAsistenciaPorCentroCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoAsistenciaPorCentroCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoAsistenciaPorCentroCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoAsistenciaPorCentroCostoUpdate"));


		jButtonid_centro_costoAsistenciaPorCentroCostoArbol= new JButtonMe();
		jButtonid_centro_costoAsistenciaPorCentroCostoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoAsistenciaPorCentroCostoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoAsistenciaPorCentroCostoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoAsistenciaPorCentroCostoArbol.setText("Arbol");
		jButtonid_centro_costoAsistenciaPorCentroCostoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoAsistenciaPorCentroCostoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoAsistenciaPorCentroCostoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoAsistenciaPorCentroCostoArbol"));



					
		this.jLabelid_empleadoAsistenciaPorCentroCosto = new JLabelMe();
		this.jLabelid_empleadoAsistenciaPorCentroCosto.setText(""+AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoAsistenciaPorCentroCosto.setToolTipText("Empleado");
		this.jLabelid_empleadoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoAsistenciaPorCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoAsistenciaPorCentroCosto.setToolTipText(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutAsistenciaPorCentroCosto = new GridBagLayout();
		this.jPanelid_empleadoAsistenciaPorCentroCosto.setLayout(this.gridaBagLayoutAsistenciaPorCentroCosto);


		jComboBoxid_empleadoAsistenciaPorCentroCosto= new JComboBoxMe();
		jComboBoxid_empleadoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoAsistenciaPorCentroCosto= new JButtonMe();
		this.jButtonid_empleadoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsistenciaPorCentroCosto.setText("Buscar");
		this.jButtonid_empleadoAsistenciaPorCentroCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoAsistenciaPorCentroCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsistenciaPorCentroCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsistenciaPorCentroCosto"));

		this.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda= new JButtonMe();
		this.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda.setText("U");
		this.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsistenciaPorCentroCostoBusqueda"));

		if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoAsistenciaPorCentroCostoUpdate= new JButtonMe();
		this.jButtonid_empleadoAsistenciaPorCentroCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaPorCentroCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaPorCentroCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAsistenciaPorCentroCostoUpdate.setText("U");
		this.jButtonid_empleadoAsistenciaPorCentroCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoAsistenciaPorCentroCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsistenciaPorCentroCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsistenciaPorCentroCostoUpdate"));



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
		//this.jInternalFrameDetalleAsistenciaPorCentroCosto = new AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Asistencia Por Centro Costo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAsistenciaPorCentroCosto= new GridBagLayout();
		

		
		String sToolTipAsistenciaPorCentroCosto="";
		sToolTipAsistenciaPorCentroCosto=AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAsistenciaPorCentroCosto+="(Nomina.AsistenciaPorCentroCosto)";
		}
		
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
			sToolTipAsistenciaPorCentroCosto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonModificarAsistenciaPorCentroCosto = new JButtonMe();
        this.jButtonActualizarAsistenciaPorCentroCosto = new JButtonMe();
        this.jButtonEliminarAsistenciaPorCentroCosto = new JButtonMe();
        this.jButtonCancelarAsistenciaPorCentroCosto = new JButtonMe();
        this.jButtonGuardarCambiosAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonCerrarAsistenciaPorCentroCosto = new JButtonMe();
		
		this.jScrollPanelDatosAsistenciaPorCentroCosto = new JScrollPane();   
        this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto = new JScrollPane();
		this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto = new JScrollPane();
				
		
		
		this.jPanelCamposAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Asistencia Por Centro Costo";
		
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Por Centro Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosAsistenciaPorCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAsistenciaPorCentroCosto.setName("jPanelCamposAsistenciaPorCentroCosto"); 

		this.jPanelCamposOcultosAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAsistenciaPorCentroCosto.setName("jPanelCamposOcultosAsistenciaPorCentroCosto"); 

        this.jPanelAccionesAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAsistenciaPorCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesAsistenciaPorCentroCosto.setName("Acciones"); 

		this.jPanelAccionesFormularioAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAsistenciaPorCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAsistenciaPorCentroCosto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAsistenciaPorCentroCosto.setText("Nuevo");
		this.jButtonModificarAsistenciaPorCentroCosto.setText("Editar");
        this.jButtonActualizarAsistenciaPorCentroCosto.setText("Actualizar");
        this.jButtonEliminarAsistenciaPorCentroCosto.setText("Eliminar");
        this.jButtonCancelarAsistenciaPorCentroCosto.setText("Cancelar");
        this.jButtonGuardarCambiosAsistenciaPorCentroCosto.setText("Guardar");
		this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.setText("Guardar");
		this.jButtonCerrarAsistenciaPorCentroCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAsistenciaPorCentroCosto,"nuevo_button","Nuevo",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAsistenciaPorCentroCosto,"modificar_button","Editar",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAsistenciaPorCentroCosto,"actualizar_button","Actualizar",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAsistenciaPorCentroCosto,"eliminar_button","Eliminar",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAsistenciaPorCentroCosto,"cancelar_button","Cancelar",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAsistenciaPorCentroCosto,"guardarcambios_button","Guardar",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto,"guardarcambiostabla_button","Guardar",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAsistenciaPorCentroCosto,"cerrar_button","Salir",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAsistenciaPorCentroCosto.setToolTipText("Nuevo"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAsistenciaPorCentroCosto.setToolTipText("Editar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAsistenciaPorCentroCosto.setToolTipText("Actualizar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAsistenciaPorCentroCosto.setToolTipText("Eliminar)"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAsistenciaPorCentroCosto.setToolTipText("Cancelar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAsistenciaPorCentroCosto.setToolTipText("Guardar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.setToolTipText("Guardar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAsistenciaPorCentroCosto.setToolTipText("Salir"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAsistenciaPorCentroCosto";
		inputMap = this.jButtonNuevoAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAsistenciaPorCentroCosto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAsistenciaPorCentroCosto";
		inputMap = this.jButtonActualizarAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAsistenciaPorCentroCosto"));
		
		//ELIMINAR
		sMapKey = "EliminarAsistenciaPorCentroCosto";
		inputMap = this.jButtonEliminarAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAsistenciaPorCentroCosto"));
		
		//CANCELAR	
		sMapKey = "CancelarAsistenciaPorCentroCosto";
		inputMap = this.jButtonCancelarAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAsistenciaPorCentroCosto"));
		
		//CERRAR		
		sMapKey = "CerrarAsistenciaPorCentroCosto";
		inputMap = this.jButtonCerrarAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAsistenciaPorCentroCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAsistenciaPorCentroCosto";
		inputMap = this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAsistenciaPorCentroCosto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAsistenciaPorCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAsistenciaPorCentroCosto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAsistenciaPorCentroCosto.setToolTipText("Nuevo AsistenciaPorCentroCosto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAsistenciaPorCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAsistenciaPorCentroCosto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAsistenciaPorCentroCosto.setToolTipText("Sin Cerrar Ventana AsistenciaPorCentroCosto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAsistenciaPorCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAsistenciaPorCentroCosto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAsistenciaPorCentroCosto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setText("Accion");
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAsistenciaPorCentroCosto = new JLabelMe();
		
		this.jLabelAccionesAsistenciaPorCentroCosto.setText("Acciones");		
		this.jLabelAccionesAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAsistenciaPorCentroCosto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAsistenciaPorCentroCosto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAsistenciaPorCentroCosto=new JTabbedPane();
		this.jTabbedPaneRelacionesAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAsistenciaPorCentroCosto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAsistenciaPorCentroCosto = new GridBagLayout();
		
		this.jPanelCamposAsistenciaPorCentroCosto.setLayout(gridaBagLayoutCamposAsistenciaPorCentroCosto);
		this.jPanelCamposOcultosAsistenciaPorCentroCosto.setLayout(gridaBagLayoutCamposOcultosAsistenciaPorCentroCosto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAsistenciaPorCentroCosto.add(jLabelIdAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 1;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAsistenciaPorCentroCosto.add(jLabelidAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);


	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAsistenciaPorCentroCosto.add(jLabelid_empresaAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 2;
		this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAsistenciaPorCentroCosto.add(jButtonid_empresaAsistenciaPorCentroCostoBusqueda, this.gridBagConstraintsAsistenciaPorCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 3;
		this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAsistenciaPorCentroCosto.add(jButtonid_empresaAsistenciaPorCentroCostoUpdate, this.gridBagConstraintsAsistenciaPorCentroCosto);
	}

	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 1;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAsistenciaPorCentroCosto.add(jComboBoxid_empresaAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);


	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoAsistenciaPorCentroCosto.add(jLabelid_centro_costoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 2;
		this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoAsistenciaPorCentroCosto.add(jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda, this.gridBagConstraintsAsistenciaPorCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 3;
		this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoAsistenciaPorCentroCosto.add(jButtonid_centro_costoAsistenciaPorCentroCostoUpdate, this.gridBagConstraintsAsistenciaPorCentroCosto);
	}

	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 1;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoAsistenciaPorCentroCosto.add(jComboBoxid_centro_costoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);


	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoAsistenciaPorCentroCosto.add(jLabelid_empleadoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 2;
		this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAsistenciaPorCentroCosto.add(jButtonid_empleadoAsistenciaPorCentroCostoBusqueda, this.gridBagConstraintsAsistenciaPorCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 3;
		this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAsistenciaPorCentroCosto.add(jButtonid_empleadoAsistenciaPorCentroCostoUpdate, this.gridBagConstraintsAsistenciaPorCentroCosto);
	}

	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 1;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoAsistenciaPorCentroCosto.add(jComboBoxid_empleadoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);


	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaAsistenciaPorCentroCosto.add(jLabelfechaAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 2;
		this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaAsistenciaPorCentroCosto.add(jButtonfechaAsistenciaPorCentroCostoBusqueda, this.gridBagConstraintsAsistenciaPorCentroCosto);
	}

	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 1;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaAsistenciaPorCentroCosto.add(jDateChooserfechaAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);


	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeAsistenciaPorCentroCosto.add(jLabelporcentajeAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 2;
		this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeAsistenciaPorCentroCosto.add(jButtonporcentajeAsistenciaPorCentroCostoBusqueda, this.gridBagConstraintsAsistenciaPorCentroCosto);
	}

	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 1;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeAsistenciaPorCentroCosto.add(jTextFieldporcentajeAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);


	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_horaAsistenciaPorCentroCosto.add(jLabelvalor_horaAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 2;
		this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_horaAsistenciaPorCentroCosto.add(jButtonvalor_horaAsistenciaPorCentroCostoBusqueda, this.gridBagConstraintsAsistenciaPorCentroCosto);
	}

	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 1;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_horaAsistenciaPorCentroCosto.add(jTextFieldvalor_horaAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);


	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpermisoAsistenciaPorCentroCosto.add(jLabelpermisoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 2;
		this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelpermisoAsistenciaPorCentroCosto.add(jButtonpermisoAsistenciaPorCentroCostoBusqueda, this.gridBagConstraintsAsistenciaPorCentroCosto);
	}

	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 1;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpermisoAsistenciaPorCentroCosto.add(jTextFieldpermisoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iYPanelCamposAsistenciaPorCentroCosto;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iXPanelCamposAsistenciaPorCentroCosto++;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaPorCentroCosto.add(this.jPanelidAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(iXPanelCamposAsistenciaPorCentroCosto % 1==0) {
		iXPanelCamposAsistenciaPorCentroCosto=0;
		iYPanelCamposAsistenciaPorCentroCosto++;
	}
	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iYPanelCamposAsistenciaPorCentroCosto;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iXPanelCamposAsistenciaPorCentroCosto++;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaPorCentroCosto.add(this.jPanelid_centro_costoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(iXPanelCamposAsistenciaPorCentroCosto % 1==0) {
		iXPanelCamposAsistenciaPorCentroCosto=0;
		iYPanelCamposAsistenciaPorCentroCosto++;
	}
	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iYPanelCamposAsistenciaPorCentroCosto;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iXPanelCamposAsistenciaPorCentroCosto++;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaPorCentroCosto.add(this.jPanelid_empleadoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(iXPanelCamposAsistenciaPorCentroCosto % 1==0) {
		iXPanelCamposAsistenciaPorCentroCosto=0;
		iYPanelCamposAsistenciaPorCentroCosto++;
	}
	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iYPanelCamposAsistenciaPorCentroCosto;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iXPanelCamposAsistenciaPorCentroCosto++;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaPorCentroCosto.add(this.jPanelfechaAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(iXPanelCamposAsistenciaPorCentroCosto % 1==0) {
		iXPanelCamposAsistenciaPorCentroCosto=0;
		iYPanelCamposAsistenciaPorCentroCosto++;
	}
	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iYPanelCamposAsistenciaPorCentroCosto;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iXPanelCamposAsistenciaPorCentroCosto++;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaPorCentroCosto.add(this.jPanelporcentajeAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(iXPanelCamposAsistenciaPorCentroCosto % 1==0) {
		iXPanelCamposAsistenciaPorCentroCosto=0;
		iYPanelCamposAsistenciaPorCentroCosto++;
	}
	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iYPanelCamposAsistenciaPorCentroCosto;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iXPanelCamposAsistenciaPorCentroCosto++;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaPorCentroCosto.add(this.jPanelvalor_horaAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(iXPanelCamposAsistenciaPorCentroCosto % 1==0) {
		iXPanelCamposAsistenciaPorCentroCosto=0;
		iYPanelCamposAsistenciaPorCentroCosto++;
	}
	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iYPanelCamposAsistenciaPorCentroCosto;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iXPanelCamposAsistenciaPorCentroCosto++;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaPorCentroCosto.add(this.jPanelpermisoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(iXPanelCamposAsistenciaPorCentroCosto % 1==0) {
		iXPanelCamposAsistenciaPorCentroCosto=0;
		iYPanelCamposAsistenciaPorCentroCosto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iYPanelCamposOcultosAsistenciaPorCentroCosto;
	this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iXPanelCamposOcultosAsistenciaPorCentroCosto++;
	this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaPorCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsistenciaPorCentroCosto.add(this.jPanelid_empresaAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);



	if(iXPanelCamposOcultosAsistenciaPorCentroCosto % 1==0) {
		iXPanelCamposOcultosAsistenciaPorCentroCosto=0;
		iYPanelCamposOcultosAsistenciaPorCentroCosto++;
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
			
		GridBagLayout gridaBagLayoutAccionesAsistenciaPorCentroCosto= new GridBagLayout();
		this.jPanelAccionesAsistenciaPorCentroCosto.setLayout(gridaBagLayoutAccionesAsistenciaPorCentroCosto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAsistenciaPorCentroCosto= new GridBagLayout();
		this.jPanelAccionesFormularioAsistenciaPorCentroCosto.setLayout(gridaBagLayoutAccionesFormularioAsistenciaPorCentroCosto);
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAsistenciaPorCentroCosto.add(this.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAsistenciaPorCentroCosto.add(this.jCheckBoxPostAccionNuevoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAsistenciaPorCentroCosto.add(this.jCheckBoxPostAccionSinCerrarAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAsistenciaPorCentroCosto.add(this.jCheckBoxPostAccionSinMensajeAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccion++;
			
		this.jPanelAccionesAsistenciaPorCentroCosto.add(this.jButtonModificarAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);							

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iPosXAccion++;
			
		this.jPanelAccionesAsistenciaPorCentroCosto.add(this.jButtonEliminarAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
			
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesAsistenciaPorCentroCosto.add(this.jButtonActualizarAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);


		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesAsistenciaPorCentroCosto.add(this.jButtonGuardarCambiosAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);	
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iPosXAccion++;
		
		this.jPanelAccionesAsistenciaPorCentroCosto.add(this.jButtonCancelarAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAsistenciaPorCentroCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAsistenciaPorCentroCosto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();						
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;		
			//this.gridBagConstraintsAsistenciaPorCentroCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAsistenciaPorCentroCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AsistenciaPorCentroCostoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAsistenciaPorCentroCosto = new AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Asistencia Por Centro Costo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Asistencia Por Centro Costo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Asistencia Por Centro Costo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AsistenciaPorCentroCostoModel asistenciaporcentrocostoModel=new AsistenciaPorCentroCostoModel(this);
			
			//SI USARA CLASE INTERNA
			//AsistenciaPorCentroCostoModel.AsistenciaPorCentroCostoFocusTraversalPolicy asistenciaporcentrocostoFocusTraversalPolicy = asistenciaporcentrocostoModel.new AsistenciaPorCentroCostoFocusTraversalPolicy(this);
			
			//asistenciaporcentrocostoFocusTraversalPolicy.setasistenciaporcentrocostoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(asistenciaporcentrocostoModel);
			
			
			this.jContentPaneDetalleAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAsistenciaPorCentroCosto = new GridBagLayout();	
			this.jContentPaneDetalleAsistenciaPorCentroCosto.setLayout(gridaBagLayoutDetalleAsistenciaPorCentroCosto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAsistenciaPorCentroCosto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
					
				
				this.jContentPaneDetalleAsistenciaPorCentroCosto.add(jTtoolBarDetalleAsistenciaPorCentroCosto, gridBagConstraintsAsistenciaPorCentroCosto);								
				
}
			
			this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto=   new JScrollPane(jContentPaneDetalleAsistenciaPorCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
	        
			this.jContentPaneDetalleAsistenciaPorCentroCosto.add(jPanelCamposAsistenciaPorCentroCosto, gridBagConstraintsAsistenciaPorCentroCosto);
			
			
			
			
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
						&& asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAsistenciaPorCentroCosto= new GridBagConstraints();
						this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
						this.jContentPaneDetalleAsistenciaPorCentroCosto.add(this.jTabbedPaneRelacionesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAsistenciaPorCentroCosto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
					this.gridBagConstraintsAsistenciaPorCentroCosto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
					
				
					this.jContentPaneDetalleAsistenciaPorCentroCosto.add(jPanelCamposOcultosAsistenciaPorCentroCosto, gridBagConstraintsAsistenciaPorCentroCosto);
				
					this.jPanelCamposOcultosAsistenciaPorCentroCosto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
	        this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAsistenciaPorCentroCosto.add(this.jPanelAccionesFormularioAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);							
			
			
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
	        this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
	        
			
			this.jContentPaneDetalleAsistenciaPorCentroCosto.add(this.jPanelAccionesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAsistenciaPorCentroCosto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto=   new JScrollPane(this.jPanelCamposAsistenciaPorCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAsistenciaPorCentroCosto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);			
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			
			
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
			
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto;//jContentPane;
		
		return jScrollPanelDatosEdicionAsistenciaPorCentroCosto;
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
