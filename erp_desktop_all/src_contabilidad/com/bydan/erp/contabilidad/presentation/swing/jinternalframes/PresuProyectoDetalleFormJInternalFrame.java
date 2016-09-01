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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.PresuProyectoConstantesFunciones;

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
public class PresuProyectoDetalleFormJInternalFrame extends PresuProyectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresuProyecto;
	
	protected JMenuBar jmenuBarDetallePresuProyecto;
	
	protected JMenu jmenuDetallePresuProyecto;
	protected JMenu jmenuDetalleArchivoPresuProyecto;
	protected JMenu jmenuDetalleAccionesPresuProyecto;
	protected JMenu jmenuDetalleDatosPresuProyecto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuProyecto;	
	protected GridBagConstraints gridBagConstraintsPresuProyecto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresuProyectoBeanSwingJInternalFrameAdditional jInternalFrameDetallePresuProyecto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PresuTipoProyectoBeanSwingJInternalFrame presutipoproyectoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presutipoproyecto="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected PresuEstadoBeanSwingJInternalFrame presuestadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuestado="";
	
	public PresuProyectoSessionBean presuproyectoSessionBean;
	
	

	public PresuTransferenciaBeanSwingJInternalFrame presutransferenciaBeanSwingJInternalFrame=null;
	public PresuTransferenciaBeanSwingJInternalFrame presutransferenciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresuTransferencia=false;
	public PresuTransferenciaSessionBean presutransferenciaSessionBean;

	public PresuProyectoCuentaBeanSwingJInternalFrame presuproyectocuentaBeanSwingJInternalFrame=null;
	public PresuProyectoCuentaBeanSwingJInternalFrame presuproyectocuentaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresuProyectoCuenta=false;
	public PresuProyectoCuentaSessionBean presuproyectocuentaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PresuTipoProyectoSessionBean presutipoproyectoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public PresuEstadoSessionBean presuestadoSessionBean;	
	
	public PresuProyectoLogic presuproyectoLogic;
	
	public JScrollPane jScrollPanelDatosPresuProyecto;
	public JScrollPane jScrollPanelDatosEdicionPresuProyecto;
	public JScrollPane jScrollPanelDatosGeneralPresuProyecto;
	
	protected JPanel jPanelCamposPresuProyecto;    
	protected JPanel jPanelCamposOcultosPresuProyecto;    	
	protected JPanel jPanelAccionesPresuProyecto;
	protected JPanel jPanelAccionesFormularioPresuProyecto;
    
	
	
	protected Integer iXPanelCamposPresuProyecto=0;
	protected Integer iYPanelCamposPresuProyecto=0;
	
	protected Integer iXPanelCamposOcultosPresuProyecto=0;
	protected Integer iYPanelCamposOcultosPresuProyecto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresuProyecto;
	public JButton jButtonModificarPresuProyecto;
	public JButton jButtonActualizarPresuProyecto;
    public JButton jButtonEliminarPresuProyecto;
	public JButton jButtonCancelarPresuProyecto;
    public JButton jButtonGuardarCambiosPresuProyecto;
	public JButton jButtonGuardarCambiosTablaPresuProyecto;
	protected JButton jButtonCerrarPresuProyecto;
	
	
	protected JButton jButtonProcesarInformacionPresuProyecto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresuProyecto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresuProyecto;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresuProyecto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuProyecto;
	protected JButton jButtonModificarToolBarPresuProyecto;
	protected JButton jButtonActualizarToolBarPresuProyecto;
    protected JButton jButtonEliminarToolBarPresuProyecto;
	protected JButton jButtonCancelarToolBarPresuProyecto;
    protected JButton jButtonGuardarCambiosToolBarPresuProyecto;
	protected JButton jButtonGuardarCambiosTablaToolBarPresuProyecto;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuProyecto;
	protected JButton jButtonCerrarToolBarPresuProyecto;
	
	protected JButton jButtonProcesarInformacionToolBarPresuProyecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuProyecto;
	protected JMenuItem jMenuItemModificarPresuProyecto;
	protected JMenuItem jMenuItemActualizarPresuProyecto;
    protected JMenuItem jMenuItemEliminarPresuProyecto;
	protected JMenuItem jMenuItemCancelarPresuProyecto;
    protected JMenuItem jMenuItemGuardarCambiosPresuProyecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuProyecto;
	protected JMenuItem jMenuItemCerrarPresuProyecto;
	protected JMenuItem jMenuItemDetalleCerrarPresuProyecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuProyecto;
	
	protected JMenuItem jMenuItemProcesarInformacionPresuProyecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuProyecto;
	protected JMenuItem jMenuItemMostrarOcultarPresuProyecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuProyecto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuProyecto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresuProyecto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresuProyecto;
	public JLabel jLabelIdPresuProyecto;
	public JLabel jLabelidPresuProyecto;
	public JButton jButtonidPresuProyectoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPresuProyecto;
	public JLabel jLabelcodigoPresuProyecto;
	public JTextArea jTextAreacodigoPresuProyecto;
	public JScrollPane jscrollPanecodigoPresuProyecto;
	public JButton jButtoncodigoPresuProyectoBusqueda= new JButtonMe();

	public JPanel jPanelnombrePresuProyecto;
	public JLabel jLabelnombrePresuProyecto;
	public JTextArea jTextAreanombrePresuProyecto;
	public JScrollPane jscrollPanenombrePresuProyecto;
	public JButton jButtonnombrePresuProyectoBusqueda= new JButtonMe();

	public JPanel jPanelfechaPresuProyecto;
	public JLabel jLabelfechaPresuProyecto;
	//public JFormattedTextField jDateChooserfechaPresuProyecto;

	public JDateChooser jDateChooserfechaPresuProyecto;
	public JButton jButtonfechaPresuProyectoBusqueda= new JButtonMe();

	public JPanel jPanelvalorPresuProyecto;
	public JLabel jLabelvalorPresuProyecto;
	public JTextField jTextFieldvalorPresuProyecto;
	public JButton jButtonvalorPresuProyectoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPresuProyecto;
	public JLabel jLabeldescripcionPresuProyecto;
	public JTextArea jTextAreadescripcionPresuProyecto;
	public JScrollPane jscrollPanedescripcionPresuProyecto;
	public JButton jButtondescripcionPresuProyectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPresuProyecto;
	public JLabel jLabelid_empresaPresuProyecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPresuProyecto;
	public JButton jButtonid_empresaPresuProyecto= new JButtonMe();
	public JButton jButtonid_empresaPresuProyectoUpdate= new JButtonMe();
	public JButton jButtonid_empresaPresuProyectoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPresuProyecto;
	public JLabel jLabelid_sucursalPresuProyecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPresuProyecto;
	public JButton jButtonid_sucursalPresuProyecto= new JButtonMe();
	public JButton jButtonid_sucursalPresuProyectoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPresuProyectoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPresuProyecto;
	public JLabel jLabelid_ejercicioPresuProyecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPresuProyecto;
	public JButton jButtonid_ejercicioPresuProyecto= new JButtonMe();
	public JButton jButtonid_ejercicioPresuProyectoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPresuProyectoBusqueda= new JButtonMe();

	public JPanel jPanelid_presu_tipo_proyectoPresuProyecto;
	public JLabel jLabelid_presu_tipo_proyectoPresuProyecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_tipo_proyectoPresuProyecto;
	public JButton jButtonid_presu_tipo_proyectoPresuProyecto= new JButtonMe();
	public JButton jButtonid_presu_tipo_proyectoPresuProyectoUpdate= new JButtonMe();
	public JButton jButtonid_presu_tipo_proyectoPresuProyectoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoPresuProyecto;
	public JLabel jLabelid_centro_costoPresuProyecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoPresuProyecto;
	public JButton jButtonid_centro_costoPresuProyecto= new JButtonMe();
	public JButton jButtonid_centro_costoPresuProyectoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoPresuProyectoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoPresuProyectoArbol= new JButtonMe();

	public JPanel jPanelid_presu_estadoPresuProyecto;
	public JLabel jLabelid_presu_estadoPresuProyecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_estadoPresuProyecto;
	public JButton jButtonid_presu_estadoPresuProyecto= new JButtonMe();
	public JButton jButtonid_presu_estadoPresuProyectoUpdate= new JButtonMe();
	public JButton jButtonid_presu_estadoPresuProyectoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresuProyecto;
	
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
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresuProyectoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresuProyecto=new JPanel();
				this.jPanelAccionesFormularioPresuProyecto=new JPanel();
				this.jmenuBarDetallePresuProyecto=new JMenuBar();
				this.jTtoolBarDetallePresuProyecto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresuProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresuProyectoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresuProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresuProyecto() {
		return this.jButtonActualizarToolBarPresuProyecto;
	}
	
	public JButton getjButtonEliminarToolBarPresuProyecto() {
		return this.jButtonEliminarToolBarPresuProyecto;
	}
	
	public JButton getjButtonCancelarToolBarPresuProyecto() {
		return this.jButtonCancelarToolBarPresuProyecto;
	}		
	
	public JButton getjButtonProcesarInformacionPresuProyecto() {
		return this.jButtonProcesarInformacionPresuProyecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuProyecto)	{
		this.jButtonProcesarInformacionPresuProyecto = jButtonProcesarInformacionPresuProyecto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuProyecto() {
		return this.jComboBoxTiposAccionesPresuProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuProyecto(
			JComboBox jComboBoxTiposRelacionesPresuProyecto) {
		this.jComboBoxTiposRelacionesPresuProyecto = jComboBoxTiposRelacionesPresuProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuProyecto(
			JComboBox jComboBoxTiposAccionesPresuProyecto) {
		this.jComboBoxTiposAccionesPresuProyecto = jComboBoxTiposAccionesPresuProyecto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresuProyecto() {
		return this.jComboBoxTiposAccionesFormularioPresuProyecto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresuProyecto(
			JComboBox jComboBoxTiposAccionesFormularioPresuProyecto) {
		this.jComboBoxTiposAccionesFormularioPresuProyecto = jComboBoxTiposAccionesFormularioPresuProyecto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presuproyectoSessionBean=new PresuProyectoSessionBean();
		
		this.presuproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presuproyectoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
		//this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuProyectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuProyectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuProyectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proyecto MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
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
	
		PresuProyectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresuProyecto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresuProyecto=new JButtonMe();
				this.jButtonModificarToolBarPresuProyecto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresuProyecto,this.jTtoolBarDetallePresuProyecto,
							"actualizar","actualizar","Actualizar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresuProyecto,this.jTtoolBarDetallePresuProyecto,
							"eliminar","eliminar","Eliminar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresuProyecto,this.jTtoolBarDetallePresuProyecto,
							"cancelar","cancelar","Cancelar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresuProyecto,this.jTtoolBarDetallePresuProyecto,
							"guardarcambios","guardarcambios","Guardar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresuProyecto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresuProyecto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresuProyecto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresuProyecto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresuProyecto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuProyecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuProyecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuProyecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresuProyecto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresuProyecto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresuProyecto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresuProyecto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresuProyecto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresuProyecto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresuProyecto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresuProyecto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresuProyecto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresuProyecto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresuProyecto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresuProyecto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresuProyecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuProyecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuProyecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuProyecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuProyecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuProyecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresuProyecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresuProyecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresuProyecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuProyecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuProyecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresuProyecto.add(this.jMenuItemDetalleCerrarPresuProyecto);
		
		this.jmenuDetalleAccionesPresuProyecto.add(this.jMenuItemActualizarPresuProyecto);
		this.jmenuDetalleAccionesPresuProyecto.add(this.jMenuItemEliminarPresuProyecto);
		this.jmenuDetalleAccionesPresuProyecto.add(this.jMenuItemCancelarPresuProyecto);		
		
		//this.jmenuDetalleDatosPresuProyecto.add(this.jMenuItemDetalleAbrirOrderByPresuProyecto);				
		this.jmenuDetalleDatosPresuProyecto.add(this.jMenuItemDetalleMostarOcultarPresuProyecto);				
				
		//this.jmenuDetalleAccionesPresuProyecto.add(this.jMenuItemGuardarCambiosPresuProyecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresuProyecto.add(this.jmenuDetalleArchivoPresuProyecto);		
		this.jmenuBarDetallePresuProyecto.add(this.jmenuDetalleAccionesPresuProyecto);		
		this.jmenuBarDetallePresuProyecto.add(this.jmenuDetalleDatosPresuProyecto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePresuProyecto.add(this.jmenuDetallePresuProyecto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresuProyecto);				
	}
	
	
	public void inicializarElementosCamposPresuProyecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresuProyecto = new JLabelMe();
		jLabelIdPresuProyecto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresuProyecto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresuProyecto= new GridBagLayout();

		this.jPanelidPresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);

		jLabelidPresuProyecto = new JLabel();
		jLabelidPresuProyecto.setText("Id");

		jLabelidPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPresuProyecto = new JLabelMe();
		this.jLabelcodigoPresuProyecto.setText(""+PresuProyectoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPresuProyecto.setToolTipText("Codigo");
		this.jLabelcodigoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPresuProyecto = new GridBagLayout();
		this.jPanelcodigoPresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);


		jTextAreacodigoPresuProyecto= new JTextAreaMe();
		jTextAreacodigoPresuProyecto.setEnabled(false);
		jTextAreacodigoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoPresuProyecto.setLineWrap(true);
		jTextAreacodigoPresuProyecto.setWrapStyleWord(true);
		jTextAreacodigoPresuProyecto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoPresuProyecto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoPresuProyecto = new JScrollPane(jTextAreacodigoPresuProyecto);
		jscrollPanecodigoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoPresuProyectoBusqueda= new JButtonMe();
		this.jButtoncodigoPresuProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresuProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresuProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPresuProyectoBusqueda.setText("U");
		this.jButtoncodigoPresuProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPresuProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPresuProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPresuProyectoBusqueda"));

		if(this.presuproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPresuProyectoBusqueda.setVisible(false);		}


					
		this.jLabelnombrePresuProyecto = new JLabelMe();
		this.jLabelnombrePresuProyecto.setText(""+PresuProyectoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePresuProyecto.setToolTipText("Nombre");
		this.jLabelnombrePresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPresuProyecto = new GridBagLayout();
		this.jPanelnombrePresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);


		jTextAreanombrePresuProyecto= new JTextAreaMe();
		jTextAreanombrePresuProyecto.setEnabled(false);
		jTextAreanombrePresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuProyecto.setLineWrap(true);
		jTextAreanombrePresuProyecto.setWrapStyleWord(true);
		jTextAreanombrePresuProyecto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePresuProyecto.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePresuProyecto = new JScrollPane(jTextAreanombrePresuProyecto);
		jscrollPanenombrePresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrePresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrePresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombrePresuProyectoBusqueda= new JButtonMe();
		this.jButtonnombrePresuProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresuProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresuProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePresuProyectoBusqueda.setText("U");
		this.jButtonnombrePresuProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePresuProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePresuProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePresuProyectoBusqueda"));

		if(this.presuproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePresuProyectoBusqueda.setVisible(false);		}


					
		this.jLabelfechaPresuProyecto = new JLabelMe();
		this.jLabelfechaPresuProyecto.setText(""+PresuProyectoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPresuProyecto.setToolTipText("Fecha");
		this.jLabelfechaPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPresuProyecto = new GridBagLayout();
		this.jPanelfechaPresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);


		//jFormattedTextFieldfechaPresuProyecto= new JFormattedTextFieldMe();

		jDateChooserfechaPresuProyecto= new JDateChooser();
		jDateChooserfechaPresuProyecto.setEnabled(false);
		jDateChooserfechaPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPresuProyecto.setDate(new Date());
		jDateChooserfechaPresuProyecto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPresuProyecto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPresuProyectoBusqueda= new JButtonMe();
		this.jButtonfechaPresuProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPresuProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPresuProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPresuProyectoBusqueda.setText("U");
		this.jButtonfechaPresuProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPresuProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPresuProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPresuProyectoBusqueda"));

		if(this.presuproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPresuProyectoBusqueda.setVisible(false);		}


					
		this.jLabelvalorPresuProyecto = new JLabelMe();
		this.jLabelvalorPresuProyecto.setText(""+PresuProyectoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPresuProyecto.setToolTipText("Valor");
		this.jLabelvalorPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPresuProyecto = new GridBagLayout();
		this.jPanelvalorPresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);


		jTextFieldvalorPresuProyecto= new JTextFieldMe();
		jTextFieldvalorPresuProyecto.setEnabled(false);
		jTextFieldvalorPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPresuProyecto.setText("0.0");

		this.jButtonvalorPresuProyectoBusqueda= new JButtonMe();
		this.jButtonvalorPresuProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresuProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresuProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPresuProyectoBusqueda.setText("U");
		this.jButtonvalorPresuProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPresuProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPresuProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPresuProyectoBusqueda"));

		if(this.presuproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPresuProyectoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPresuProyecto = new JLabelMe();
		this.jLabeldescripcionPresuProyecto.setText(""+PresuProyectoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionPresuProyecto.setToolTipText("Descripcion");
		this.jLabeldescripcionPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPresuProyecto = new GridBagLayout();
		this.jPaneldescripcionPresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);


		jTextAreadescripcionPresuProyecto= new JTextAreaMe();
		jTextAreadescripcionPresuProyecto.setEnabled(false);
		jTextAreadescripcionPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuProyecto.setLineWrap(true);
		jTextAreadescripcionPresuProyecto.setWrapStyleWord(true);
		jTextAreadescripcionPresuProyecto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPresuProyecto.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPresuProyecto = new JScrollPane(jTextAreadescripcionPresuProyecto);
		jscrollPanedescripcionPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPresuProyectoBusqueda= new JButtonMe();
		this.jButtondescripcionPresuProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPresuProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPresuProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPresuProyectoBusqueda.setText("U");
		this.jButtondescripcionPresuProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPresuProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPresuProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPresuProyectoBusqueda"));

		if(this.presuproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPresuProyectoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresuProyecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPresuProyecto = new JLabelMe();
		this.jLabelid_empresaPresuProyecto.setText(""+PresuProyectoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPresuProyecto.setToolTipText("Empresa");
		this.jLabelid_empresaPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPresuProyecto = new GridBagLayout();
		this.jPanelid_empresaPresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);


		jComboBoxid_empresaPresuProyecto= new JComboBoxMe();
		jComboBoxid_empresaPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPresuProyecto.setEnabled(false);

		this.jButtonid_empresaPresuProyecto= new JButtonMe();
		this.jButtonid_empresaPresuProyecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresuProyecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresuProyecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresuProyecto.setText("Buscar");
		this.jButtonid_empresaPresuProyecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPresuProyecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresuProyecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresuProyecto"));

		this.jButtonid_empresaPresuProyectoBusqueda= new JButtonMe();
		this.jButtonid_empresaPresuProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresuProyectoBusqueda.setText("U");
		this.jButtonid_empresaPresuProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPresuProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresuProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresuProyectoBusqueda"));

		if(this.presuproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPresuProyectoBusqueda.setVisible(false);		}

		this.jButtonid_empresaPresuProyectoUpdate= new JButtonMe();
		this.jButtonid_empresaPresuProyectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuProyectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuProyectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresuProyectoUpdate.setText("U");
		this.jButtonid_empresaPresuProyectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPresuProyectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresuProyectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresuProyectoUpdate"));



					
		this.jLabelid_sucursalPresuProyecto = new JLabelMe();
		this.jLabelid_sucursalPresuProyecto.setText(""+PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPresuProyecto.setToolTipText("Sucursal");
		this.jLabelid_sucursalPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPresuProyecto = new GridBagLayout();
		this.jPanelid_sucursalPresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);


		jComboBoxid_sucursalPresuProyecto= new JComboBoxMe();
		jComboBoxid_sucursalPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPresuProyecto.setEnabled(false);

		this.jButtonid_sucursalPresuProyecto= new JButtonMe();
		this.jButtonid_sucursalPresuProyecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresuProyecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresuProyecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresuProyecto.setText("Buscar");
		this.jButtonid_sucursalPresuProyecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPresuProyecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresuProyecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresuProyecto"));

		this.jButtonid_sucursalPresuProyectoBusqueda= new JButtonMe();
		this.jButtonid_sucursalPresuProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresuProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresuProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresuProyectoBusqueda.setText("U");
		this.jButtonid_sucursalPresuProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPresuProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresuProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresuProyectoBusqueda"));

		if(this.presuproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPresuProyectoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPresuProyectoUpdate= new JButtonMe();
		this.jButtonid_sucursalPresuProyectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresuProyectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresuProyectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresuProyectoUpdate.setText("U");
		this.jButtonid_sucursalPresuProyectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPresuProyectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresuProyectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresuProyectoUpdate"));



					
		this.jLabelid_ejercicioPresuProyecto = new JLabelMe();
		this.jLabelid_ejercicioPresuProyecto.setText(""+PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPresuProyecto.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPresuProyecto = new GridBagLayout();
		this.jPanelid_ejercicioPresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);


		jComboBoxid_ejercicioPresuProyecto= new JComboBoxMe();
		jComboBoxid_ejercicioPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ejercicioPresuProyecto= new JButtonMe();
		this.jButtonid_ejercicioPresuProyecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresuProyecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresuProyecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresuProyecto.setText("Buscar");
		this.jButtonid_ejercicioPresuProyecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPresuProyecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresuProyecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresuProyecto"));

		this.jButtonid_ejercicioPresuProyectoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPresuProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresuProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresuProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresuProyectoBusqueda.setText("U");
		this.jButtonid_ejercicioPresuProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPresuProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresuProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresuProyectoBusqueda"));

		if(this.presuproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPresuProyectoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPresuProyectoUpdate= new JButtonMe();
		this.jButtonid_ejercicioPresuProyectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresuProyectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresuProyectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresuProyectoUpdate.setText("U");
		this.jButtonid_ejercicioPresuProyectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPresuProyectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresuProyectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresuProyectoUpdate"));



					
		this.jLabelid_presu_tipo_proyectoPresuProyecto = new JLabelMe();
		this.jLabelid_presu_tipo_proyectoPresuProyecto.setText(""+PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO+" : *");
		this.jLabelid_presu_tipo_proyectoPresuProyecto.setToolTipText("Tipo Proyecto");
		this.jLabelid_presu_tipo_proyectoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_tipo_proyectoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_tipo_proyectoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_presu_tipo_proyectoPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_presu_tipo_proyectoPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_presu_tipo_proyectoPresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO);
		this.gridaBagLayoutPresuProyecto = new GridBagLayout();
		this.jPanelid_presu_tipo_proyectoPresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);


		jComboBoxid_presu_tipo_proyectoPresuProyecto= new JComboBoxMe();
		jComboBoxid_presu_tipo_proyectoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_tipo_proyectoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_tipo_proyectoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_tipo_proyectoPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_presu_tipo_proyectoPresuProyecto= new JButtonMe();
		this.jButtonid_presu_tipo_proyectoPresuProyecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_tipo_proyectoPresuProyecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_tipo_proyectoPresuProyecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_tipo_proyectoPresuProyecto.setText("Buscar");
		this.jButtonid_presu_tipo_proyectoPresuProyecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_presu_tipo_proyectoPresuProyecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_tipo_proyectoPresuProyecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_presu_tipo_proyectoPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_tipo_proyectoPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_tipo_proyectoPresuProyecto"));

		this.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda= new JButtonMe();
		this.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda.setText("U");
		this.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_presu_tipo_proyectoPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_tipo_proyectoPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_tipo_proyectoPresuProyectoBusqueda"));

		if(this.presuproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda.setVisible(false);		}

		this.jButtonid_presu_tipo_proyectoPresuProyectoUpdate= new JButtonMe();
		this.jButtonid_presu_tipo_proyectoPresuProyectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_tipo_proyectoPresuProyectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_tipo_proyectoPresuProyectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_tipo_proyectoPresuProyectoUpdate.setText("U");
		this.jButtonid_presu_tipo_proyectoPresuProyectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_presu_tipo_proyectoPresuProyectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_tipo_proyectoPresuProyectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_presu_tipo_proyectoPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_tipo_proyectoPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_tipo_proyectoPresuProyectoUpdate"));



					
		this.jLabelid_centro_costoPresuProyecto = new JLabelMe();
		this.jLabelid_centro_costoPresuProyecto.setText(""+PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoPresuProyecto.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoPresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutPresuProyecto = new GridBagLayout();
		this.jPanelid_centro_costoPresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);


		jComboBoxid_centro_costoPresuProyecto= new JComboBoxMe();
		jComboBoxid_centro_costoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoPresuProyecto= new JButtonMe();
		this.jButtonid_centro_costoPresuProyecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPresuProyecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPresuProyecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPresuProyecto.setText("Buscar");
		this.jButtonid_centro_costoPresuProyecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoPresuProyecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresuProyecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresuProyecto"));

		this.jButtonid_centro_costoPresuProyectoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoPresuProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresuProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresuProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPresuProyectoBusqueda.setText("U");
		this.jButtonid_centro_costoPresuProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoPresuProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresuProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresuProyectoBusqueda"));

		if(this.presuproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoPresuProyectoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoPresuProyectoUpdate= new JButtonMe();
		this.jButtonid_centro_costoPresuProyectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresuProyectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPresuProyectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPresuProyectoUpdate.setText("U");
		this.jButtonid_centro_costoPresuProyectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoPresuProyectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresuProyectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresuProyectoUpdate"));


		jButtonid_centro_costoPresuProyectoArbol= new JButtonMe();
		jButtonid_centro_costoPresuProyectoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPresuProyectoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPresuProyectoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPresuProyectoArbol.setText("Arbol");
		jButtonid_centro_costoPresuProyectoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoPresuProyectoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPresuProyectoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPresuProyectoArbol"));



					
		this.jLabelid_presu_estadoPresuProyecto = new JLabelMe();
		this.jLabelid_presu_estadoPresuProyecto.setText(""+PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO+" : *");
		this.jLabelid_presu_estadoPresuProyecto.setToolTipText("Estado");
		this.jLabelid_presu_estadoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_estadoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_estadoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_presu_estadoPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_presu_estadoPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_presu_estadoPresuProyecto.setToolTipText(PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO);
		this.gridaBagLayoutPresuProyecto = new GridBagLayout();
		this.jPanelid_presu_estadoPresuProyecto.setLayout(this.gridaBagLayoutPresuProyecto);


		jComboBoxid_presu_estadoPresuProyecto= new JComboBoxMe();
		jComboBoxid_presu_estadoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_estadoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_estadoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_estadoPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_presu_estadoPresuProyecto= new JButtonMe();
		this.jButtonid_presu_estadoPresuProyecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_estadoPresuProyecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_estadoPresuProyecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_estadoPresuProyecto.setText("Buscar");
		this.jButtonid_presu_estadoPresuProyecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_presu_estadoPresuProyecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_estadoPresuProyecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_presu_estadoPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_estadoPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_estadoPresuProyecto"));

		this.jButtonid_presu_estadoPresuProyectoBusqueda= new JButtonMe();
		this.jButtonid_presu_estadoPresuProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_estadoPresuProyectoBusqueda.setText("U");
		this.jButtonid_presu_estadoPresuProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_presu_estadoPresuProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_estadoPresuProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_presu_estadoPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_estadoPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_estadoPresuProyectoBusqueda"));

		if(this.presuproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_presu_estadoPresuProyectoBusqueda.setVisible(false);		}

		this.jButtonid_presu_estadoPresuProyectoUpdate= new JButtonMe();
		this.jButtonid_presu_estadoPresuProyectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuProyectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuProyectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_estadoPresuProyectoUpdate.setText("U");
		this.jButtonid_presu_estadoPresuProyectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_presu_estadoPresuProyectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_estadoPresuProyectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_presu_estadoPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_estadoPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_estadoPresuProyectoUpdate"));



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
		//this.jInternalFrameDetallePresuProyecto = new PresuProyectoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proyecto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuProyecto= new GridBagLayout();
		

		
		String sToolTipPresuProyecto="";
		sToolTipPresuProyecto=PresuProyectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuProyecto+="(Contabilidad.PresuProyecto)";
		}
		
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuProyecto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresuProyecto = new JButtonMe();
		this.jButtonModificarPresuProyecto = new JButtonMe();
        this.jButtonActualizarPresuProyecto = new JButtonMe();
        this.jButtonEliminarPresuProyecto = new JButtonMe();
        this.jButtonCancelarPresuProyecto = new JButtonMe();
        this.jButtonGuardarCambiosPresuProyecto = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresuProyecto = new JButtonMe();
		this.jButtonCerrarPresuProyecto = new JButtonMe();
		
		this.jScrollPanelDatosPresuProyecto = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresuProyecto = new JScrollPane();
		this.jScrollPanelDatosGeneralPresuProyecto = new JScrollPane();
				
		
		
		this.jPanelCamposPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proyecto";
		
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proyectoes" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuProyecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresuProyecto.setName("jPanelCamposPresuProyecto"); 

		this.jPanelCamposOcultosPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresuProyecto.setName("jPanelCamposOcultosPresuProyecto"); 

        this.jPanelAccionesPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuProyecto.setToolTipText("Acciones");
        this.jPanelAccionesPresuProyecto.setName("Acciones"); 

		this.jPanelAccionesFormularioPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresuProyecto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresuProyecto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresuProyecto.setText("Nuevo");
		this.jButtonModificarPresuProyecto.setText("Editar");
        this.jButtonActualizarPresuProyecto.setText("Actualizar");
        this.jButtonEliminarPresuProyecto.setText("Eliminar");
        this.jButtonCancelarPresuProyecto.setText("Cancelar");
        this.jButtonGuardarCambiosPresuProyecto.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresuProyecto.setText("Guardar");
		this.jButtonCerrarPresuProyecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuProyecto,"nuevo_button","Nuevo",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresuProyecto,"modificar_button","Editar",this.presuproyectoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresuProyecto,"actualizar_button","Actualizar",this.presuproyectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresuProyecto,"eliminar_button","Eliminar",this.presuproyectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresuProyecto,"cancelar_button","Cancelar",this.presuproyectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresuProyecto,"guardarcambios_button","Guardar",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuProyecto,"guardarcambiostabla_button","Guardar",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuProyecto,"cerrar_button","Salir",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresuProyecto.setToolTipText("Nuevo"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresuProyecto.setToolTipText("Editar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresuProyecto.setToolTipText("Actualizar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresuProyecto.setToolTipText("Eliminar)"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresuProyecto.setToolTipText("Cancelar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresuProyecto.setToolTipText("Guardar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresuProyecto.setToolTipText("Guardar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuProyecto.setToolTipText("Salir"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuProyecto";
		inputMap = this.jButtonNuevoPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuProyecto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresuProyecto";
		inputMap = this.jButtonActualizarPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresuProyecto"));
		
		//ELIMINAR
		sMapKey = "EliminarPresuProyecto";
		inputMap = this.jButtonEliminarPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresuProyecto"));
		
		//CANCELAR	
		sMapKey = "CancelarPresuProyecto";
		inputMap = this.jButtonCancelarPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresuProyecto"));
		
		//CERRAR		
		sMapKey = "CerrarPresuProyecto";
		inputMap = this.jButtonCerrarPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuProyecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuProyecto";
		inputMap = this.jButtonGuardarCambiosTablaPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuProyecto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresuProyecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresuProyecto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresuProyecto.setToolTipText("Nuevo PresuProyecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresuProyecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresuProyecto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresuProyecto.setToolTipText("Sin Cerrar Ventana PresuProyecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresuProyecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresuProyecto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresuProyecto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresuProyecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuProyecto.setText("Accion");
		this.jComboBoxTiposAccionesPresuProyecto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresuProyecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresuProyecto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresuProyecto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresuProyecto = new JLabelMe();
		
		this.jLabelAccionesPresuProyecto.setText("Acciones");		
		this.jLabelAccionesPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresuProyecto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresuProyecto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresuProyecto=new JTabbedPane();
		this.jTabbedPaneRelacionesPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresuProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresuProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresuProyecto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuProyecto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuProyecto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresuProyecto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresuProyecto = new GridBagLayout();
		
		this.jPanelCamposPresuProyecto.setLayout(gridaBagLayoutCamposPresuProyecto);
		this.jPanelCamposOcultosPresuProyecto.setLayout(gridaBagLayoutCamposOcultosPresuProyecto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresuProyecto.add(jLabelIdPresuProyecto, this.gridBagConstraintsPresuProyecto);



	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresuProyecto.add(jLabelidPresuProyecto, this.gridBagConstraintsPresuProyecto);


	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPresuProyecto.add(jLabelid_empresaPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 2;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresuProyecto.add(jButtonid_empresaPresuProyectoBusqueda, this.gridBagConstraintsPresuProyecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 3;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresuProyecto.add(jButtonid_empresaPresuProyectoUpdate, this.gridBagConstraintsPresuProyecto);
	}

	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPresuProyecto.add(jComboBoxid_empresaPresuProyecto, this.gridBagConstraintsPresuProyecto);


	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPresuProyecto.add(jLabelid_sucursalPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 2;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresuProyecto.add(jButtonid_sucursalPresuProyectoBusqueda, this.gridBagConstraintsPresuProyecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 3;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresuProyecto.add(jButtonid_sucursalPresuProyectoUpdate, this.gridBagConstraintsPresuProyecto);
	}

	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPresuProyecto.add(jComboBoxid_sucursalPresuProyecto, this.gridBagConstraintsPresuProyecto);


	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPresuProyecto.add(jLabelid_ejercicioPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 2;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresuProyecto.add(jButtonid_ejercicioPresuProyectoBusqueda, this.gridBagConstraintsPresuProyecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 3;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresuProyecto.add(jButtonid_ejercicioPresuProyectoUpdate, this.gridBagConstraintsPresuProyecto);
	}

	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPresuProyecto.add(jComboBoxid_ejercicioPresuProyecto, this.gridBagConstraintsPresuProyecto);


	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPresuProyecto.add(jLabelcodigoPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 2;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPresuProyecto.add(jButtoncodigoPresuProyectoBusqueda, this.gridBagConstraintsPresuProyecto);
	}

	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPresuProyecto.add(jscrollPanecodigoPresuProyecto, this.gridBagConstraintsPresuProyecto);


	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePresuProyecto.add(jLabelnombrePresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 2;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePresuProyecto.add(jButtonnombrePresuProyectoBusqueda, this.gridBagConstraintsPresuProyecto);
	}

	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePresuProyecto.add(jscrollPanenombrePresuProyecto, this.gridBagConstraintsPresuProyecto);


	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_presu_tipo_proyectoPresuProyecto.add(jLabelid_presu_tipo_proyectoPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 2;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_tipo_proyectoPresuProyecto.add(jButtonid_presu_tipo_proyectoPresuProyectoBusqueda, this.gridBagConstraintsPresuProyecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 3;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_tipo_proyectoPresuProyecto.add(jButtonid_presu_tipo_proyectoPresuProyectoUpdate, this.gridBagConstraintsPresuProyecto);
	}

	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_presu_tipo_proyectoPresuProyecto.add(jComboBoxid_presu_tipo_proyectoPresuProyecto, this.gridBagConstraintsPresuProyecto);


	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoPresuProyecto.add(jLabelid_centro_costoPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 2;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPresuProyecto.add(jButtonid_centro_costoPresuProyectoBusqueda, this.gridBagConstraintsPresuProyecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 3;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPresuProyecto.add(jButtonid_centro_costoPresuProyectoUpdate, this.gridBagConstraintsPresuProyecto);
	}

	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoPresuProyecto.add(jComboBoxid_centro_costoPresuProyecto, this.gridBagConstraintsPresuProyecto);


	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPresuProyecto.add(jLabelfechaPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 2;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPresuProyecto.add(jButtonfechaPresuProyectoBusqueda, this.gridBagConstraintsPresuProyecto);
	}

	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPresuProyecto.add(jDateChooserfechaPresuProyecto, this.gridBagConstraintsPresuProyecto);


	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPresuProyecto.add(jLabelvalorPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 2;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPresuProyecto.add(jButtonvalorPresuProyectoBusqueda, this.gridBagConstraintsPresuProyecto);
	}

	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPresuProyecto.add(jTextFieldvalorPresuProyecto, this.gridBagConstraintsPresuProyecto);


	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_presu_estadoPresuProyecto.add(jLabelid_presu_estadoPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 2;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_estadoPresuProyecto.add(jButtonid_presu_estadoPresuProyectoBusqueda, this.gridBagConstraintsPresuProyecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 3;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_estadoPresuProyecto.add(jButtonid_presu_estadoPresuProyectoUpdate, this.gridBagConstraintsPresuProyecto);
	}

	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_presu_estadoPresuProyecto.add(jComboBoxid_presu_estadoPresuProyecto, this.gridBagConstraintsPresuProyecto);


	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 0;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPresuProyecto.add(jLabeldescripcionPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 2;
		this.gridBagConstraintsPresuProyecto.ipadx = 0;
		this.gridBagConstraintsPresuProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPresuProyecto.add(jButtondescripcionPresuProyectoBusqueda, this.gridBagConstraintsPresuProyecto);
	}

	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyecto.gridy = 0;
	this.gridBagConstraintsPresuProyecto.gridx = 1;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPresuProyecto.add(jscrollPanedescripcionPresuProyecto, this.gridBagConstraintsPresuProyecto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyecto.add(this.jPanelidPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposPresuProyecto % 1==0) {
		iXPanelCamposPresuProyecto=0;
		iYPanelCamposPresuProyecto++;
	}
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyecto.add(this.jPanelid_ejercicioPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposPresuProyecto % 1==0) {
		iXPanelCamposPresuProyecto=0;
		iYPanelCamposPresuProyecto++;
	}
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyecto.add(this.jPanelcodigoPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposPresuProyecto % 1==0) {
		iXPanelCamposPresuProyecto=0;
		iYPanelCamposPresuProyecto++;
	}
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyecto.add(this.jPanelnombrePresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposPresuProyecto % 1==0) {
		iXPanelCamposPresuProyecto=0;
		iYPanelCamposPresuProyecto++;
	}
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyecto.add(this.jPanelid_presu_tipo_proyectoPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposPresuProyecto % 1==0) {
		iXPanelCamposPresuProyecto=0;
		iYPanelCamposPresuProyecto++;
	}
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyecto.add(this.jPanelid_centro_costoPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposPresuProyecto % 1==0) {
		iXPanelCamposPresuProyecto=0;
		iYPanelCamposPresuProyecto++;
	}
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyecto.add(this.jPanelfechaPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposPresuProyecto % 1==0) {
		iXPanelCamposPresuProyecto=0;
		iYPanelCamposPresuProyecto++;
	}
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyecto.add(this.jPanelvalorPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposPresuProyecto % 1==0) {
		iXPanelCamposPresuProyecto=0;
		iYPanelCamposPresuProyecto++;
	}
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyecto.add(this.jPanelid_presu_estadoPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposPresuProyecto % 1==0) {
		iXPanelCamposPresuProyecto=0;
		iYPanelCamposPresuProyecto++;
	}
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyecto.add(this.jPaneldescripcionPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposPresuProyecto % 1==0) {
		iXPanelCamposPresuProyecto=0;
		iYPanelCamposPresuProyecto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposOcultosPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposOcultosPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresuProyecto.add(this.jPanelid_empresaPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposOcultosPresuProyecto % 1==0) {
		iXPanelCamposOcultosPresuProyecto=0;
		iYPanelCamposOcultosPresuProyecto++;
	}
	this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyecto.gridy = iYPanelCamposOcultosPresuProyecto;
	this.gridBagConstraintsPresuProyecto.gridx = iXPanelCamposOcultosPresuProyecto++;
	this.gridBagConstraintsPresuProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresuProyecto.add(this.jPanelid_sucursalPresuProyecto, this.gridBagConstraintsPresuProyecto);



	if(iXPanelCamposOcultosPresuProyecto % 1==0) {
		iXPanelCamposOcultosPresuProyecto=0;
		iYPanelCamposOcultosPresuProyecto++;
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
			
		GridBagLayout gridaBagLayoutAccionesPresuProyecto= new GridBagLayout();
		this.jPanelAccionesPresuProyecto.setLayout(gridaBagLayoutAccionesPresuProyecto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresuProyecto= new GridBagLayout();
		this.jPanelAccionesFormularioPresuProyecto.setLayout(gridaBagLayoutAccionesFormularioPresuProyecto);
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuProyecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuProyecto.add(this.jComboBoxTiposAccionesFormularioPresuProyecto, this.gridBagConstraintsPresuProyecto);

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuProyecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuProyecto.add(this.jCheckBoxPostAccionNuevoPresuProyecto, this.gridBagConstraintsPresuProyecto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presuproyectoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuProyecto.add(this.jCheckBoxPostAccionSinCerrarPresuProyecto, this.gridBagConstraintsPresuProyecto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presuproyectoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuProyecto.add(this.jCheckBoxPostAccionSinMensajePresuProyecto, this.gridBagConstraintsPresuProyecto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresuProyecto.add(this.jButtonModificarPresuProyecto, this.gridBagConstraintsPresuProyecto);							

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresuProyecto.add(this.jButtonEliminarPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
			
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = 0;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuProyecto.add(this.jButtonActualizarPresuProyecto, this.gridBagConstraintsPresuProyecto);


		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = 0;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuProyecto.add(this.jButtonGuardarCambiosPresuProyecto, this.gridBagConstraintsPresuProyecto);	
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = 0;		
		this.gridBagConstraintsPresuProyecto.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresuProyecto.add(this.jButtonCancelarPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuProyecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuProyecto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();						
			this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuProyecto.gridx = 0;		
			//this.gridBagConstraintsPresuProyecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuProyecto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuProyecto.gridx =0;
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuProyecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuProyecto, this.gridBagConstraintsPresuProyecto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresuProyectoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresuProyecto = new PresuProyectoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proyecto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proyecto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proyecto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresuProyectoModel presuproyectoModel=new PresuProyectoModel(this);
			
			//SI USARA CLASE INTERNA
			//PresuProyectoModel.PresuProyectoFocusTraversalPolicy presuproyectoFocusTraversalPolicy = presuproyectoModel.new PresuProyectoFocusTraversalPolicy(this);
			
			//presuproyectoFocusTraversalPolicy.setpresuproyectoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presuproyectoModel);
			
			
			this.jContentPaneDetallePresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresuProyecto = new GridBagLayout();	
			this.jContentPaneDetallePresuProyecto.setLayout(gridaBagLayoutDetallePresuProyecto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuProyecto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
				this.gridBagConstraintsPresuProyecto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresuProyecto.gridx = 0;
					
				
				this.jContentPaneDetallePresuProyecto.add(jTtoolBarDetallePresuProyecto, gridBagConstraintsPresuProyecto);								
				
}
			
			this.jScrollPanelDatosEdicionPresuProyecto=   new JScrollPane(jContentPaneDetallePresuProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresuProyecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresuProyecto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresuProyecto.gridx = 0;
	        
			this.jContentPaneDetallePresuProyecto.add(jPanelCamposPresuProyecto, gridBagConstraintsPresuProyecto);
			
			
			
			
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
						&& presuproyectoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePresuProyectoCuenta(this.puedeCargarPorPartePresuProyectoCuenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresuTransferencia(this.puedeCargarPorPartePresuTransferencia,false,-1);
					
					if(this.presuproyectoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresuProyecto= new GridBagConstraints();
						this.gridBagConstraintsPresuProyecto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresuProyecto.gridx = 0;
						this.jContentPaneDetallePresuProyecto.add(this.jTabbedPaneRelacionesPresuProyecto, this.gridBagConstraintsPresuProyecto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresuProyecto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePresuProyectoCuenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresuTransferencia(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresuProyecto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
					this.gridBagConstraintsPresuProyecto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresuProyecto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresuProyecto.gridx = 0;
					
				
					this.jContentPaneDetallePresuProyecto.add(jPanelCamposOcultosPresuProyecto, gridBagConstraintsPresuProyecto);
				
					this.jPanelCamposOcultosPresuProyecto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsPresuProyecto.gridx = 0;
	        this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresuProyecto.add(this.jPanelAccionesFormularioPresuProyecto, this.gridBagConstraintsPresuProyecto);							
			
			
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
	        this.gridBagConstraintsPresuProyecto.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsPresuProyecto.gridx = 0;
	        
			
			this.jContentPaneDetallePresuProyecto.add(this.jPanelAccionesPresuProyecto, this.gridBagConstraintsPresuProyecto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresuProyecto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresuProyecto=   new JScrollPane(this.jPanelCamposPresuProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresuProyecto.gridx = 0;
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresuProyecto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresuProyecto, this.gridBagConstraintsPresuProyecto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuProyecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresuProyecto, this.gridBagConstraintsPresuProyecto);			
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuProyecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresuProyecto, this.gridBagConstraintsPresuProyecto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuProyecto, this.gridBagConstraintsPresuProyecto);
			
			
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
			
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuProyecto, this.gridBagConstraintsPresuProyecto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresuProyecto;//jContentPane;
		
		return jScrollPanelDatosEdicionPresuProyecto;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePresuProyectoCuenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
		this.presuproyectocuentaSessionBean.setConGuardarRelaciones(false);
		this.presuproyectocuentaSessionBean.setEsGuardarRelacionado(true);

		this.presuproyectocuentaBeanSwingJInternalFrame=null;//new PresuProyectoCuentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presuproyectocuentaBeanSwingJInternalFramePopup=new PresuProyectoCuentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presuproyectocuentaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {

				PresuProyectoCuentaJInternalFrame.STIPO_TAMANIO_GENERAL=PresuProyectoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresuProyectoCuentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PresuProyectoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presuproyectocuentaSessionBean.setEsGuardarRelacionado(true);

				this.presuproyectocuentaBeanSwingJInternalFrame=new PresuProyectoCuentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presuproyectocuentaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presuproyectocuentaBeanSwingJInternalFrame.setpresuproyectocuentaSessionBean(this.presuproyectocuentaSessionBean);

				//this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
				//this.gridBagConstraintsPresuProyecto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPresuProyecto.gridx = 0;
				//this.jContentPaneDetallePresuProyecto.add(this.presuproyectocuentaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPresuProyecto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPresuProyecto.add("Cuenta Contable Proyectoes",this.presuproyectocuentaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPresuProyecto.setComponentAt(iIndexTab,this.presuproyectocuentaBeanSwingJInternalFrame.getContentPane());
				}

				//PresuProyectoCuentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presuproyectocuentaSessionBean.setEsGuardarRelacionado(false);
				this.presuproyectocuentaBeanSwingJInternalFrame=null;//new PresuProyectoCuentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresuProyectoCuenta) {
					this.jTabbedPaneRelacionesPresuProyecto.add("Cuenta Contable Proyectoes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePresuTransferencia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
		this.presutransferenciaSessionBean.setConGuardarRelaciones(false);
		this.presutransferenciaSessionBean.setEsGuardarRelacionado(true);

		this.presutransferenciaBeanSwingJInternalFrame=null;//new PresuTransferenciaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presutransferenciaBeanSwingJInternalFramePopup=new PresuTransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presutransferenciaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {

				PresuTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=PresuProyectoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresuTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PresuProyectoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presutransferenciaSessionBean.setEsGuardarRelacionado(true);

				this.presutransferenciaBeanSwingJInternalFrame=new PresuTransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presutransferenciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presutransferenciaBeanSwingJInternalFrame.setpresutransferenciaSessionBean(this.presutransferenciaSessionBean);

				//this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
				//this.gridBagConstraintsPresuProyecto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPresuProyecto.gridx = 0;
				//this.jContentPaneDetallePresuProyecto.add(this.presutransferenciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPresuProyecto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPresuProyecto.add("Transferenciaes",this.presutransferenciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPresuProyecto.setComponentAt(iIndexTab,this.presutransferenciaBeanSwingJInternalFrame.getContentPane());
				}

				//PresuTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presutransferenciaSessionBean.setEsGuardarRelacionado(false);
				this.presutransferenciaBeanSwingJInternalFrame=null;//new PresuTransferenciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresuTransferencia) {
					this.jTabbedPaneRelacionesPresuProyecto.add("Transferenciaes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPresuTransferenciaBeanSwingJInternalFrame(List<PresuProyecto> presuproyectos,PresuProyecto presuproyecto,PresuTransferenciaBeanSwingJInternalFrame presutransferenciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presutransferenciaBeanSwingJInternalFrame=new PresuTransferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presutransferenciaBeanSwingJInternalFrame.getPresuTransferenciaLogic().setConnexion(this.presuproyectoLogic.getConnexion());

					presutransferenciaBeanSwingJInternalFrame.setpresuproyectosForeignKey(presuproyectos);
					presutransferenciaBeanSwingJInternalFrame.setpresuproyectoForeignKey(presuproyecto);
					presutransferenciaBeanSwingJInternalFrame.presutransferenciaSessionBean.setisBusquedaDesdeForeignKeySesionPresuProyecto(true);
					presutransferenciaBeanSwingJInternalFrame.presutransferenciaSessionBean.setlidPresuProyectoActual(presuproyecto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presutransferenciaBeanSwingJInternalFrame.cargarCombosForeignKeyPresuTransferencia(presutransferenciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					presutransferenciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaPresuProyecto(true);
					presutransferenciaBeanSwingJInternalFrame.setid_presu_proyectoFK_IdPresuProyecto(presuproyecto.getId());

					if(!this.conCargarFormDetalle) {
						presutransferenciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presutransferenciaBeanSwingJInternalFrame.setSelectedItemCombosFramePresuProyectoForeignKey(presuproyecto,1,false,true,true);
					presutransferenciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presutransferenciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdPresuProyecto");
					presutransferenciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPresuProyecto");
					presutransferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuTransferencia(true);
					presutransferenciaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresuTransferencia("n",presutransferenciaBeanSwingJInternalFrame.isGuardarCambiosEnLote, presutransferenciaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presutransferenciaBeanSwingJInternalFrame.setAutoscrolls(true);
					presutransferenciaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presutransferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsPresuTransferencia("relacionado");
					} else {
						presutransferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsPresuTransferencia("no_relacionado");
					}

					presutransferenciaBeanSwingJInternalFrame.getjButtonRecargarInformacionPresuTransferencia().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPresuProyectoCuentaBeanSwingJInternalFrame(List<PresuProyecto> presuproyectos,PresuProyecto presuproyecto,PresuProyectoCuentaBeanSwingJInternalFrame presuproyectocuentaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presuproyectocuentaBeanSwingJInternalFrame=new PresuProyectoCuentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presuproyectocuentaBeanSwingJInternalFrame.getPresuProyectoCuentaLogic().setConnexion(this.presuproyectoLogic.getConnexion());

					presuproyectocuentaBeanSwingJInternalFrame.setpresuproyectosForeignKey(presuproyectos);
					presuproyectocuentaBeanSwingJInternalFrame.setpresuproyectoForeignKey(presuproyecto);
					presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaSessionBean.setisBusquedaDesdeForeignKeySesionPresuProyecto(true);
					presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaSessionBean.setlidPresuProyectoActual(presuproyecto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presuproyectocuentaBeanSwingJInternalFrame.cargarCombosForeignKeyPresuProyectoCuenta(presuproyectocuentaBeanSwingJInternalFrame.isCargarCombosDependencia);
					presuproyectocuentaBeanSwingJInternalFrame.setVisibilidadBusquedasParaPresuProyecto(true);
					presuproyectocuentaBeanSwingJInternalFrame.setid_presu_proyectoFK_IdPresuProyecto(presuproyecto.getId());

					if(!this.conCargarFormDetalle) {
						presuproyectocuentaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presuproyectocuentaBeanSwingJInternalFrame.setSelectedItemCombosFramePresuProyectoForeignKey(presuproyecto,1,false,true,true);
					presuproyectocuentaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presuproyectocuentaBeanSwingJInternalFrame.procesarBusqueda("FK_IdPresuProyecto");
					presuproyectocuentaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPresuProyecto");
					presuproyectocuentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuProyectoCuenta(true);
					presuproyectocuentaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresuProyectoCuenta("n",presuproyectocuentaBeanSwingJInternalFrame.isGuardarCambiosEnLote, presuproyectocuentaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presuproyectocuentaBeanSwingJInternalFrame.setAutoscrolls(true);
					presuproyectocuentaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presuproyectocuentaBeanSwingJInternalFrame.actualizarEstadoPanelsPresuProyectoCuenta("relacionado");
					} else {
						presuproyectocuentaBeanSwingJInternalFrame.actualizarEstadoPanelsPresuProyectoCuenta("no_relacionado");
					}

					presuproyectocuentaBeanSwingJInternalFrame.getjButtonRecargarInformacionPresuProyectoCuenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
