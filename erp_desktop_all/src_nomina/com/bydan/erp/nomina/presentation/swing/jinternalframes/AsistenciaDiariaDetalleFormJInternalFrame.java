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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.AsistenciaDiariaConstantesFunciones;

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
public class AsistenciaDiariaDetalleFormJInternalFrame extends AsistenciaDiariaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAsistenciaDiaria;
	
	protected JMenuBar jmenuBarDetalleAsistenciaDiaria;
	
	protected JMenu jmenuDetalleAsistenciaDiaria;
	protected JMenu jmenuDetalleArchivoAsistenciaDiaria;
	protected JMenu jmenuDetalleAccionesAsistenciaDiaria;
	protected JMenu jmenuDetalleDatosAsistenciaDiaria;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAsistenciaDiaria;	
	protected GridBagConstraints gridBagConstraintsAsistenciaDiaria;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AsistenciaDiariaBeanSwingJInternalFrameAdditional jInternalFrameDetalleAsistenciaDiaria;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstructuraBeanSwingJInternalFrame estructuraseccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructuraseccion="";
	
	public AsistenciaDiariaSessionBean asistenciadiariaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstructuraSessionBean estructuraseccionSessionBean;	
	
	public AsistenciaDiariaLogic asistenciadiariaLogic;
	
	public JScrollPane jScrollPanelDatosAsistenciaDiaria;
	public JScrollPane jScrollPanelDatosEdicionAsistenciaDiaria;
	public JScrollPane jScrollPanelDatosGeneralAsistenciaDiaria;
	
	protected JPanel jPanelCamposAsistenciaDiaria;    
	protected JPanel jPanelCamposOcultosAsistenciaDiaria;    	
	protected JPanel jPanelAccionesAsistenciaDiaria;
	protected JPanel jPanelAccionesFormularioAsistenciaDiaria;
    
	
	
	protected Integer iXPanelCamposAsistenciaDiaria=0;
	protected Integer iYPanelCamposAsistenciaDiaria=0;
	
	protected Integer iXPanelCamposOcultosAsistenciaDiaria=0;
	protected Integer iYPanelCamposOcultosAsistenciaDiaria=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAsistenciaDiaria;
	public JButton jButtonModificarAsistenciaDiaria;
	public JButton jButtonActualizarAsistenciaDiaria;
    public JButton jButtonEliminarAsistenciaDiaria;
	public JButton jButtonCancelarAsistenciaDiaria;
    public JButton jButtonGuardarCambiosAsistenciaDiaria;
	public JButton jButtonGuardarCambiosTablaAsistenciaDiaria;
	protected JButton jButtonCerrarAsistenciaDiaria;
	
	
	protected JButton jButtonProcesarInformacionAsistenciaDiaria;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAsistenciaDiaria;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAsistenciaDiaria;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAsistenciaDiaria;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAsistenciaDiaria;
	protected JButton jButtonModificarToolBarAsistenciaDiaria;
	protected JButton jButtonActualizarToolBarAsistenciaDiaria;
    protected JButton jButtonEliminarToolBarAsistenciaDiaria;
	protected JButton jButtonCancelarToolBarAsistenciaDiaria;
    protected JButton jButtonGuardarCambiosToolBarAsistenciaDiaria;
	protected JButton jButtonGuardarCambiosTablaToolBarAsistenciaDiaria;
	protected JButton jButtonMostrarOcultarTablaToolBarAsistenciaDiaria;
	protected JButton jButtonCerrarToolBarAsistenciaDiaria;
	
	protected JButton jButtonProcesarInformacionToolBarAsistenciaDiaria;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAsistenciaDiaria;
	protected JMenuItem jMenuItemModificarAsistenciaDiaria;
	protected JMenuItem jMenuItemActualizarAsistenciaDiaria;
    protected JMenuItem jMenuItemEliminarAsistenciaDiaria;
	protected JMenuItem jMenuItemCancelarAsistenciaDiaria;
    protected JMenuItem jMenuItemGuardarCambiosAsistenciaDiaria;
	protected JMenuItem jMenuItemGuardarCambiosTablaAsistenciaDiaria;
	protected JMenuItem jMenuItemCerrarAsistenciaDiaria;
	protected JMenuItem jMenuItemDetalleCerrarAsistenciaDiaria;
	protected JMenuItem jMenuItemDetalleMostarOcultarAsistenciaDiaria;
	
	protected JMenuItem jMenuItemProcesarInformacionAsistenciaDiaria;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAsistenciaDiaria;
	protected JMenuItem jMenuItemMostrarOcultarAsistenciaDiaria;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAsistenciaDiaria;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAsistenciaDiaria;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAsistenciaDiaria;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAsistenciaDiaria;
	public JLabel jLabelIdAsistenciaDiaria;
	public JLabel jLabelidAsistenciaDiaria;
	public JButton jButtonidAsistenciaDiariaBusqueda= new JButtonMe();

	public JPanel jPanelfechaAsistenciaDiaria;
	public JLabel jLabelfechaAsistenciaDiaria;
	//public JFormattedTextField jDateChooserfechaAsistenciaDiaria;

	public JDateChooser jDateChooserfechaAsistenciaDiaria;
	public JButton jButtonfechaAsistenciaDiariaBusqueda= new JButtonMe();

	public JPanel jPanelhoraAsistenciaDiaria;
	public JLabel jLabelhoraAsistenciaDiaria;
	public JSpinner jSpinnerhoraAsistenciaDiaria= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhoraAsistenciaDiariaBusqueda= new JButtonMe();

	public JPanel jPanelhoras_atrasoAsistenciaDiaria;
	public JLabel jLabelhoras_atrasoAsistenciaDiaria;
	public JTextField jTextFieldhoras_atrasoAsistenciaDiaria;
	public JButton jButtonhoras_atrasoAsistenciaDiariaBusqueda= new JButtonMe();

	public JPanel jPanelhoras_faltaAsistenciaDiaria;
	public JLabel jLabelhoras_faltaAsistenciaDiaria;
	public JTextField jTextFieldhoras_faltaAsistenciaDiaria;
	public JButton jButtonhoras_faltaAsistenciaDiariaBusqueda= new JButtonMe();

	public JPanel jPanelhoras_permisoAsistenciaDiaria;
	public JLabel jLabelhoras_permisoAsistenciaDiaria;
	public JTextField jTextFieldhoras_permisoAsistenciaDiaria;
	public JButton jButtonhoras_permisoAsistenciaDiariaBusqueda= new JButtonMe();

	public JPanel jPanelhoras_extra25AsistenciaDiaria;
	public JLabel jLabelhoras_extra25AsistenciaDiaria;
	public JTextField jTextFieldhoras_extra25AsistenciaDiaria;
	public JButton jButtonhoras_extra25AsistenciaDiariaBusqueda= new JButtonMe();

	public JPanel jPanelhoras_extra50AsistenciaDiaria;
	public JLabel jLabelhoras_extra50AsistenciaDiaria;
	public JTextField jTextFieldhoras_extra50AsistenciaDiaria;
	public JButton jButtonhoras_extra50AsistenciaDiariaBusqueda= new JButtonMe();

	public JPanel jPanelhoras_extra100AsistenciaDiaria;
	public JLabel jLabelhoras_extra100AsistenciaDiaria;
	public JTextField jTextFieldhoras_extra100AsistenciaDiaria;
	public JButton jButtonhoras_extra100AsistenciaDiariaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionAsistenciaDiaria;
	public JLabel jLabeldescripcionAsistenciaDiaria;
	public JTextField jTextFielddescripcionAsistenciaDiaria;
	public JButton jButtondescripcionAsistenciaDiariaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAsistenciaDiaria;
	public JLabel jLabelid_empresaAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAsistenciaDiaria;
	public JButton jButtonid_empresaAsistenciaDiaria= new JButtonMe();
	public JButton jButtonid_empresaAsistenciaDiariaUpdate= new JButtonMe();
	public JButton jButtonid_empresaAsistenciaDiariaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoAsistenciaDiaria;
	public JLabel jLabelid_empleadoAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoAsistenciaDiaria;
	public JButton jButtonid_empleadoAsistenciaDiaria= new JButtonMe();
	public JButton jButtonid_empleadoAsistenciaDiariaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoAsistenciaDiariaBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraAsistenciaDiaria;
	public JLabel jLabelid_estructuraAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraAsistenciaDiaria;
	public JButton jButtonid_estructuraAsistenciaDiaria= new JButtonMe();
	public JButton jButtonid_estructuraAsistenciaDiariaUpdate= new JButtonMe();
	public JButton jButtonid_estructuraAsistenciaDiariaBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraAsistenciaDiariaArbol= new JButtonMe();

	public JPanel jPanelid_estructura_seccionAsistenciaDiaria;
	public JLabel jLabelid_estructura_seccionAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructura_seccionAsistenciaDiaria;
	public JButton jButtonid_estructura_seccionAsistenciaDiaria= new JButtonMe();
	public JButton jButtonid_estructura_seccionAsistenciaDiariaUpdate= new JButtonMe();
	public JButton jButtonid_estructura_seccionAsistenciaDiariaBusqueda= new JButtonMe();
	public JButton jButtonid_estructura_seccionAsistenciaDiariaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAsistenciaDiaria;
	
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
		
	public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AsistenciaDiariaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAsistenciaDiaria=new JPanel();
				this.jPanelAccionesFormularioAsistenciaDiaria=new JPanel();
				this.jmenuBarDetalleAsistenciaDiaria=new JMenuBar();
				this.jTtoolBarDetalleAsistenciaDiaria=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaDiariaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AsistenciaDiaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AsistenciaDiariaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AsistenciaDiaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaDiariaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaDiaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaDiariaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaDiaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaDiariaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AsistenciaDiaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAsistenciaDiaria() {
		return this.jButtonActualizarToolBarAsistenciaDiaria;
	}
	
	public JButton getjButtonEliminarToolBarAsistenciaDiaria() {
		return this.jButtonEliminarToolBarAsistenciaDiaria;
	}
	
	public JButton getjButtonCancelarToolBarAsistenciaDiaria() {
		return this.jButtonCancelarToolBarAsistenciaDiaria;
	}		
	
	public JButton getjButtonProcesarInformacionAsistenciaDiaria() {
		return this.jButtonProcesarInformacionAsistenciaDiaria;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAsistenciaDiaria)	{
		this.jButtonProcesarInformacionAsistenciaDiaria = jButtonProcesarInformacionAsistenciaDiaria;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAsistenciaDiaria() {
		return this.jComboBoxTiposAccionesAsistenciaDiaria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAsistenciaDiaria(
			JComboBox jComboBoxTiposRelacionesAsistenciaDiaria) {
		this.jComboBoxTiposRelacionesAsistenciaDiaria = jComboBoxTiposRelacionesAsistenciaDiaria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAsistenciaDiaria(
			JComboBox jComboBoxTiposAccionesAsistenciaDiaria) {
		this.jComboBoxTiposAccionesAsistenciaDiaria = jComboBoxTiposAccionesAsistenciaDiaria;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAsistenciaDiaria() {
		return this.jComboBoxTiposAccionesFormularioAsistenciaDiaria;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAsistenciaDiaria(
			JComboBox jComboBoxTiposAccionesFormularioAsistenciaDiaria) {
		this.jComboBoxTiposAccionesFormularioAsistenciaDiaria = jComboBoxTiposAccionesFormularioAsistenciaDiaria;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
		
		this.asistenciadiariaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asistenciadiariaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.asistenciadiariaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AsistenciaDiariaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AsistenciaDiariaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AsistenciaDiariaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asistencia Diaria MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
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
	
		AsistenciaDiariaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAsistenciaDiaria= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAsistenciaDiaria=new JButtonMe();
				this.jButtonModificarToolBarAsistenciaDiaria=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAsistenciaDiaria,this.jTtoolBarDetalleAsistenciaDiaria,
							"actualizar","actualizar","Actualizar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAsistenciaDiaria,this.jTtoolBarDetalleAsistenciaDiaria,
							"eliminar","eliminar","Eliminar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAsistenciaDiaria,this.jTtoolBarDetalleAsistenciaDiaria,
							"cancelar","cancelar","Cancelar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAsistenciaDiaria,this.jTtoolBarDetalleAsistenciaDiaria,
							"guardarcambios","guardarcambios","Guardar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAsistenciaDiaria=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAsistenciaDiaria=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAsistenciaDiaria=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAsistenciaDiaria=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAsistenciaDiaria=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAsistenciaDiaria= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAsistenciaDiaria.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAsistenciaDiaria,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAsistenciaDiaria= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAsistenciaDiaria.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAsistenciaDiaria,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAsistenciaDiaria= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAsistenciaDiaria.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAsistenciaDiaria,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAsistenciaDiaria= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAsistenciaDiaria.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAsistenciaDiaria,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAsistenciaDiaria= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAsistenciaDiaria.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAsistenciaDiaria,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAsistenciaDiaria= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAsistenciaDiaria.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAsistenciaDiaria,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAsistenciaDiaria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAsistenciaDiaria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAsistenciaDiaria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAsistenciaDiaria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAsistenciaDiaria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAsistenciaDiaria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAsistenciaDiaria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAsistenciaDiaria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAsistenciaDiaria,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAsistenciaDiaria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAsistenciaDiaria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAsistenciaDiaria,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAsistenciaDiaria.add(this.jMenuItemDetalleCerrarAsistenciaDiaria);
		
		this.jmenuDetalleAccionesAsistenciaDiaria.add(this.jMenuItemActualizarAsistenciaDiaria);
		this.jmenuDetalleAccionesAsistenciaDiaria.add(this.jMenuItemEliminarAsistenciaDiaria);
		this.jmenuDetalleAccionesAsistenciaDiaria.add(this.jMenuItemCancelarAsistenciaDiaria);		
		
		//this.jmenuDetalleDatosAsistenciaDiaria.add(this.jMenuItemDetalleAbrirOrderByAsistenciaDiaria);				
		this.jmenuDetalleDatosAsistenciaDiaria.add(this.jMenuItemDetalleMostarOcultarAsistenciaDiaria);				
				
		//this.jmenuDetalleAccionesAsistenciaDiaria.add(this.jMenuItemGuardarCambiosAsistenciaDiaria);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAsistenciaDiaria.add(this.jmenuDetalleArchivoAsistenciaDiaria);		
		this.jmenuBarDetalleAsistenciaDiaria.add(this.jmenuDetalleAccionesAsistenciaDiaria);		
		this.jmenuBarDetalleAsistenciaDiaria.add(this.jmenuDetalleDatosAsistenciaDiaria);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAsistenciaDiaria);				
	}
	
	
	public void inicializarElementosCamposAsistenciaDiaria() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAsistenciaDiaria = new JLabelMe();
		jLabelIdAsistenciaDiaria.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAsistenciaDiaria = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAsistenciaDiaria= new GridBagLayout();

		this.jPanelidAsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);

		jLabelidAsistenciaDiaria = new JLabel();
		jLabelidAsistenciaDiaria.setText("Id");

		jLabelidAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaAsistenciaDiaria = new JLabelMe();
		this.jLabelfechaAsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaAsistenciaDiaria.setToolTipText("Fecha");
		this.jLabelfechaAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaAsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelfechaAsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		//jFormattedTextFieldfechaAsistenciaDiaria= new JFormattedTextFieldMe();

		jDateChooserfechaAsistenciaDiaria= new JDateChooser();
		jDateChooserfechaAsistenciaDiaria.setEnabled(false);
		jDateChooserfechaAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaAsistenciaDiaria.setDate(new Date());
		jDateChooserfechaAsistenciaDiaria.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaAsistenciaDiaria.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaAsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonfechaAsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaAsistenciaDiariaBusqueda.setText("U");
		this.jButtonfechaAsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaAsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaAsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaAsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaAsistenciaDiariaBusqueda.setVisible(false);		}


					
		this.jLabelhoraAsistenciaDiaria = new JLabelMe();
		this.jLabelhoraAsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_HORA+" : *");
		this.jLabelhoraAsistenciaDiaria.setToolTipText("Hora");
		this.jLabelhoraAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoraAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoraAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoraAsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_HORA);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelhoraAsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		//jFormattedTextFieldhoraAsistenciaDiaria= new JFormattedTextFieldMe();

		jSpinnerhoraAsistenciaDiaria= new JSpinner(new SpinnerDateModel());;
		jSpinnerhoraAsistenciaDiaria.setEnabled(false);
		JSpinner.DateEditor timeEditorhoraAsistenciaDiaria = new JSpinner.DateEditor(jSpinnerhoraAsistenciaDiaria, "HH:mm:ss");

		jSpinnerhoraAsistenciaDiaria.setEditor(timeEditorhoraAsistenciaDiaria);

		jSpinnerhoraAsistenciaDiaria.setValue(new Date());

		jSpinnerhoraAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhoraAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhoraAsistenciaDiaria.setValue(new Date());
		//jSpinnerhoraAsistenciaDiaria.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhoraAsistenciaDiaria.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhoraAsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonhoraAsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraAsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraAsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoraAsistenciaDiariaBusqueda.setText("U");
		this.jButtonhoraAsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoraAsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoraAsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhoraAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhoraAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horaAsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoraAsistenciaDiariaBusqueda.setVisible(false);		}


					
		this.jLabelhoras_atrasoAsistenciaDiaria = new JLabelMe();
		this.jLabelhoras_atrasoAsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO+" : *");
		this.jLabelhoras_atrasoAsistenciaDiaria.setToolTipText("Horas Atraso");
		this.jLabelhoras_atrasoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_atrasoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_atrasoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_atrasoAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_atrasoAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_atrasoAsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelhoras_atrasoAsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		jTextFieldhoras_atrasoAsistenciaDiaria= new JTextFieldMe();
		jTextFieldhoras_atrasoAsistenciaDiaria.setEnabled(false);
		jTextFieldhoras_atrasoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_atrasoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_atrasoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_atrasoAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_atrasoAsistenciaDiaria.setText("0.0");

		this.jButtonhoras_atrasoAsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonhoras_atrasoAsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_atrasoAsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_atrasoAsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_atrasoAsistenciaDiariaBusqueda.setText("U");
		this.jButtonhoras_atrasoAsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_atrasoAsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_atrasoAsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_atrasoAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_atrasoAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_atrasoAsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_atrasoAsistenciaDiariaBusqueda.setVisible(false);		}


					
		this.jLabelhoras_faltaAsistenciaDiaria = new JLabelMe();
		this.jLabelhoras_faltaAsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA+" : *");
		this.jLabelhoras_faltaAsistenciaDiaria.setToolTipText("Horas Falta");
		this.jLabelhoras_faltaAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_faltaAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_faltaAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_faltaAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_faltaAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_faltaAsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelhoras_faltaAsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		jTextFieldhoras_faltaAsistenciaDiaria= new JTextFieldMe();
		jTextFieldhoras_faltaAsistenciaDiaria.setEnabled(false);
		jTextFieldhoras_faltaAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_faltaAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_faltaAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_faltaAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_faltaAsistenciaDiaria.setText("0.0");

		this.jButtonhoras_faltaAsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonhoras_faltaAsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_faltaAsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_faltaAsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_faltaAsistenciaDiariaBusqueda.setText("U");
		this.jButtonhoras_faltaAsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_faltaAsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_faltaAsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_faltaAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_faltaAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_faltaAsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_faltaAsistenciaDiariaBusqueda.setVisible(false);		}


					
		this.jLabelhoras_permisoAsistenciaDiaria = new JLabelMe();
		this.jLabelhoras_permisoAsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO+" : *");
		this.jLabelhoras_permisoAsistenciaDiaria.setToolTipText("Horas Permiso");
		this.jLabelhoras_permisoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_permisoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_permisoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_permisoAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_permisoAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_permisoAsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelhoras_permisoAsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		jTextFieldhoras_permisoAsistenciaDiaria= new JTextFieldMe();
		jTextFieldhoras_permisoAsistenciaDiaria.setEnabled(false);
		jTextFieldhoras_permisoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_permisoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_permisoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_permisoAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_permisoAsistenciaDiaria.setText("0.0");

		this.jButtonhoras_permisoAsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonhoras_permisoAsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_permisoAsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_permisoAsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_permisoAsistenciaDiariaBusqueda.setText("U");
		this.jButtonhoras_permisoAsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_permisoAsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_permisoAsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_permisoAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_permisoAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_permisoAsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_permisoAsistenciaDiariaBusqueda.setVisible(false);		}


					
		this.jLabelhoras_extra25AsistenciaDiaria = new JLabelMe();
		this.jLabelhoras_extra25AsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25+" : *");
		this.jLabelhoras_extra25AsistenciaDiaria.setToolTipText("Horas Extra25");
		this.jLabelhoras_extra25AsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra25AsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra25AsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_extra25AsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_extra25AsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_extra25AsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelhoras_extra25AsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		jTextFieldhoras_extra25AsistenciaDiaria= new JTextFieldMe();
		jTextFieldhoras_extra25AsistenciaDiaria.setEnabled(false);
		jTextFieldhoras_extra25AsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra25AsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra25AsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_extra25AsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_extra25AsistenciaDiaria.setText("0.0");

		this.jButtonhoras_extra25AsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonhoras_extra25AsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra25AsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra25AsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_extra25AsistenciaDiariaBusqueda.setText("U");
		this.jButtonhoras_extra25AsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_extra25AsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_extra25AsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_extra25AsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_extra25AsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_extra25AsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_extra25AsistenciaDiariaBusqueda.setVisible(false);		}


					
		this.jLabelhoras_extra50AsistenciaDiaria = new JLabelMe();
		this.jLabelhoras_extra50AsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50+" : *");
		this.jLabelhoras_extra50AsistenciaDiaria.setToolTipText("Horas Extra50");
		this.jLabelhoras_extra50AsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra50AsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra50AsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_extra50AsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_extra50AsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_extra50AsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelhoras_extra50AsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		jTextFieldhoras_extra50AsistenciaDiaria= new JTextFieldMe();
		jTextFieldhoras_extra50AsistenciaDiaria.setEnabled(false);
		jTextFieldhoras_extra50AsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra50AsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra50AsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_extra50AsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_extra50AsistenciaDiaria.setText("0.0");

		this.jButtonhoras_extra50AsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonhoras_extra50AsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra50AsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra50AsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_extra50AsistenciaDiariaBusqueda.setText("U");
		this.jButtonhoras_extra50AsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_extra50AsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_extra50AsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_extra50AsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_extra50AsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_extra50AsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_extra50AsistenciaDiariaBusqueda.setVisible(false);		}


					
		this.jLabelhoras_extra100AsistenciaDiaria = new JLabelMe();
		this.jLabelhoras_extra100AsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100+" : *");
		this.jLabelhoras_extra100AsistenciaDiaria.setToolTipText("Horas Extra100");
		this.jLabelhoras_extra100AsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra100AsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra100AsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_extra100AsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_extra100AsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_extra100AsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelhoras_extra100AsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		jTextFieldhoras_extra100AsistenciaDiaria= new JTextFieldMe();
		jTextFieldhoras_extra100AsistenciaDiaria.setEnabled(false);
		jTextFieldhoras_extra100AsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra100AsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra100AsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_extra100AsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_extra100AsistenciaDiaria.setText("0.0");

		this.jButtonhoras_extra100AsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonhoras_extra100AsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra100AsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra100AsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_extra100AsistenciaDiariaBusqueda.setText("U");
		this.jButtonhoras_extra100AsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_extra100AsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_extra100AsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_extra100AsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_extra100AsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_extra100AsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_extra100AsistenciaDiariaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionAsistenciaDiaria = new JLabelMe();
		this.jLabeldescripcionAsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionAsistenciaDiaria.setToolTipText("Descripcion");
		this.jLabeldescripcionAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionAsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPaneldescripcionAsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		jTextFielddescripcionAsistenciaDiaria= new JTextFieldMe();

		jTextFielddescripcionAsistenciaDiaria.setEnabled(false);
		jTextFielddescripcionAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescripcionAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescripcionAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescripcionAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtondescripcionAsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtondescripcionAsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionAsistenciaDiariaBusqueda.setText("U");
		this.jButtondescripcionAsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionAsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionAsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescripcionAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescripcionAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionAsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionAsistenciaDiariaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAsistenciaDiaria() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAsistenciaDiaria = new JLabelMe();
		this.jLabelid_empresaAsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAsistenciaDiaria.setToolTipText("Empresa");
		this.jLabelid_empresaAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelid_empresaAsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		jComboBoxid_empresaAsistenciaDiaria= new JComboBoxMe();
		jComboBoxid_empresaAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAsistenciaDiaria.setEnabled(false);

		this.jButtonid_empresaAsistenciaDiaria= new JButtonMe();
		this.jButtonid_empresaAsistenciaDiaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsistenciaDiaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsistenciaDiaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsistenciaDiaria.setText("Buscar");
		this.jButtonid_empresaAsistenciaDiaria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAsistenciaDiaria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsistenciaDiaria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsistenciaDiaria"));

		this.jButtonid_empresaAsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonid_empresaAsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAsistenciaDiariaBusqueda.setText("U");
		this.jButtonid_empresaAsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAsistenciaDiariaBusqueda.setVisible(false);		}

		this.jButtonid_empresaAsistenciaDiariaUpdate= new JButtonMe();
		this.jButtonid_empresaAsistenciaDiariaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaDiariaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaDiariaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAsistenciaDiariaUpdate.setText("U");
		this.jButtonid_empresaAsistenciaDiariaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAsistenciaDiariaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsistenciaDiariaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsistenciaDiariaUpdate"));



					
		this.jLabelid_empleadoAsistenciaDiaria = new JLabelMe();
		this.jLabelid_empleadoAsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoAsistenciaDiaria.setToolTipText("Empleado");
		this.jLabelid_empleadoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoAsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelid_empleadoAsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		jComboBoxid_empleadoAsistenciaDiaria= new JComboBoxMe();
		jComboBoxid_empleadoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoAsistenciaDiaria= new JButtonMe();
		this.jButtonid_empleadoAsistenciaDiaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsistenciaDiaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsistenciaDiaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsistenciaDiaria.setText("Buscar");
		this.jButtonid_empleadoAsistenciaDiaria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoAsistenciaDiaria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsistenciaDiaria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsistenciaDiaria"));

		this.jButtonid_empleadoAsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonid_empleadoAsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAsistenciaDiariaBusqueda.setText("U");
		this.jButtonid_empleadoAsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoAsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoAsistenciaDiariaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoAsistenciaDiariaUpdate= new JButtonMe();
		this.jButtonid_empleadoAsistenciaDiariaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaDiariaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaDiariaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAsistenciaDiariaUpdate.setText("U");
		this.jButtonid_empleadoAsistenciaDiariaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoAsistenciaDiariaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsistenciaDiariaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsistenciaDiariaUpdate"));



					
		this.jLabelid_estructuraAsistenciaDiaria = new JLabelMe();
		this.jLabelid_estructuraAsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraAsistenciaDiaria.setToolTipText("Estructura");
		this.jLabelid_estructuraAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraAsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelid_estructuraAsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		jComboBoxid_estructuraAsistenciaDiaria= new JComboBoxMe();
		jComboBoxid_estructuraAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraAsistenciaDiaria= new JButtonMe();
		this.jButtonid_estructuraAsistenciaDiaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraAsistenciaDiaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraAsistenciaDiaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraAsistenciaDiaria.setText("Buscar");
		this.jButtonid_estructuraAsistenciaDiaria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraAsistenciaDiaria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraAsistenciaDiaria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraAsistenciaDiaria"));

		this.jButtonid_estructuraAsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonid_estructuraAsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraAsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraAsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraAsistenciaDiariaBusqueda.setText("U");
		this.jButtonid_estructuraAsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraAsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraAsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraAsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraAsistenciaDiariaBusqueda.setVisible(false);		}

		this.jButtonid_estructuraAsistenciaDiariaUpdate= new JButtonMe();
		this.jButtonid_estructuraAsistenciaDiariaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraAsistenciaDiariaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraAsistenciaDiariaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraAsistenciaDiariaUpdate.setText("U");
		this.jButtonid_estructuraAsistenciaDiariaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraAsistenciaDiariaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraAsistenciaDiariaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraAsistenciaDiariaUpdate"));


		jButtonid_estructuraAsistenciaDiariaArbol= new JButtonMe();
		jButtonid_estructuraAsistenciaDiariaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraAsistenciaDiariaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraAsistenciaDiariaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraAsistenciaDiariaArbol.setText("Arbol");
		jButtonid_estructuraAsistenciaDiariaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraAsistenciaDiariaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraAsistenciaDiariaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraAsistenciaDiariaArbol"));



					
		this.jLabelid_estructura_seccionAsistenciaDiaria = new JLabelMe();
		this.jLabelid_estructura_seccionAsistenciaDiaria.setText(""+AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION+" : *");
		this.jLabelid_estructura_seccionAsistenciaDiaria.setToolTipText("Estructura Seccion");
		this.jLabelid_estructura_seccionAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estructura_seccionAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estructura_seccionAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructura_seccionAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructura_seccionAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructura_seccionAsistenciaDiaria.setToolTipText(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION);
		this.gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		this.jPanelid_estructura_seccionAsistenciaDiaria.setLayout(this.gridaBagLayoutAsistenciaDiaria);


		jComboBoxid_estructura_seccionAsistenciaDiaria= new JComboBoxMe();
		jComboBoxid_estructura_seccionAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructura_seccionAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructura_seccionAsistenciaDiaria= new JButtonMe();
		this.jButtonid_estructura_seccionAsistenciaDiaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_seccionAsistenciaDiaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_seccionAsistenciaDiaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_seccionAsistenciaDiaria.setText("Buscar");
		this.jButtonid_estructura_seccionAsistenciaDiaria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructura_seccionAsistenciaDiaria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionAsistenciaDiaria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructura_seccionAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionAsistenciaDiaria"));

		this.jButtonid_estructura_seccionAsistenciaDiariaBusqueda= new JButtonMe();
		this.jButtonid_estructura_seccionAsistenciaDiariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionAsistenciaDiariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionAsistenciaDiariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructura_seccionAsistenciaDiariaBusqueda.setText("U");
		this.jButtonid_estructura_seccionAsistenciaDiariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructura_seccionAsistenciaDiariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionAsistenciaDiariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructura_seccionAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionAsistenciaDiariaBusqueda"));

		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructura_seccionAsistenciaDiariaBusqueda.setVisible(false);		}

		this.jButtonid_estructura_seccionAsistenciaDiariaUpdate= new JButtonMe();
		this.jButtonid_estructura_seccionAsistenciaDiariaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionAsistenciaDiariaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionAsistenciaDiariaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructura_seccionAsistenciaDiariaUpdate.setText("U");
		this.jButtonid_estructura_seccionAsistenciaDiariaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructura_seccionAsistenciaDiariaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionAsistenciaDiariaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructura_seccionAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionAsistenciaDiariaUpdate"));


		jButtonid_estructura_seccionAsistenciaDiariaArbol= new JButtonMe();
		jButtonid_estructura_seccionAsistenciaDiariaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_seccionAsistenciaDiariaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_seccionAsistenciaDiariaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_seccionAsistenciaDiariaArbol.setText("Arbol");
		jButtonid_estructura_seccionAsistenciaDiariaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructura_seccionAsistenciaDiariaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionAsistenciaDiariaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructura_seccionAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionAsistenciaDiariaArbol"));



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
		//this.jInternalFrameDetalleAsistenciaDiaria = new AsistenciaDiariaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Asistencia Diaria DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAsistenciaDiaria= new GridBagLayout();
		

		
		String sToolTipAsistenciaDiaria="";
		sToolTipAsistenciaDiaria=AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAsistenciaDiaria+="(Nomina.AsistenciaDiaria)";
		}
		
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
			sToolTipAsistenciaDiaria+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAsistenciaDiaria = new JButtonMe();
		this.jButtonModificarAsistenciaDiaria = new JButtonMe();
        this.jButtonActualizarAsistenciaDiaria = new JButtonMe();
        this.jButtonEliminarAsistenciaDiaria = new JButtonMe();
        this.jButtonCancelarAsistenciaDiaria = new JButtonMe();
        this.jButtonGuardarCambiosAsistenciaDiaria = new JButtonMe();
		this.jButtonGuardarCambiosTablaAsistenciaDiaria = new JButtonMe();
		this.jButtonCerrarAsistenciaDiaria = new JButtonMe();
		
		this.jScrollPanelDatosAsistenciaDiaria = new JScrollPane();   
        this.jScrollPanelDatosEdicionAsistenciaDiaria = new JScrollPane();
		this.jScrollPanelDatosGeneralAsistenciaDiaria = new JScrollPane();
				
		
		
		this.jPanelCamposAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Asistencia Diaria";
		
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Diarias" + this.sPath));
		} else {
			this.jScrollPanelDatosAsistenciaDiaria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAsistenciaDiaria.setName("jPanelCamposAsistenciaDiaria"); 

		this.jPanelCamposOcultosAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAsistenciaDiaria.setName("jPanelCamposOcultosAsistenciaDiaria"); 

        this.jPanelAccionesAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAsistenciaDiaria.setToolTipText("Acciones");
        this.jPanelAccionesAsistenciaDiaria.setName("Acciones"); 

		this.jPanelAccionesFormularioAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAsistenciaDiaria.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAsistenciaDiaria.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAsistenciaDiaria.setText("Nuevo");
		this.jButtonModificarAsistenciaDiaria.setText("Editar");
        this.jButtonActualizarAsistenciaDiaria.setText("Actualizar");
        this.jButtonEliminarAsistenciaDiaria.setText("Eliminar");
        this.jButtonCancelarAsistenciaDiaria.setText("Cancelar");
        this.jButtonGuardarCambiosAsistenciaDiaria.setText("Guardar");
		this.jButtonGuardarCambiosTablaAsistenciaDiaria.setText("Guardar");
		this.jButtonCerrarAsistenciaDiaria.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAsistenciaDiaria,"nuevo_button","Nuevo",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAsistenciaDiaria,"modificar_button","Editar",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAsistenciaDiaria,"actualizar_button","Actualizar",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAsistenciaDiaria,"eliminar_button","Eliminar",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAsistenciaDiaria,"cancelar_button","Cancelar",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAsistenciaDiaria,"guardarcambios_button","Guardar",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAsistenciaDiaria,"guardarcambiostabla_button","Guardar",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAsistenciaDiaria,"cerrar_button","Salir",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAsistenciaDiaria.setToolTipText("Nuevo"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAsistenciaDiaria.setToolTipText("Editar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAsistenciaDiaria.setToolTipText("Actualizar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAsistenciaDiaria.setToolTipText("Eliminar)"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAsistenciaDiaria.setToolTipText("Cancelar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAsistenciaDiaria.setToolTipText("Guardar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAsistenciaDiaria.setToolTipText("Guardar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAsistenciaDiaria.setToolTipText("Salir"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAsistenciaDiaria";
		inputMap = this.jButtonNuevoAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAsistenciaDiaria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAsistenciaDiaria"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAsistenciaDiaria";
		inputMap = this.jButtonActualizarAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAsistenciaDiaria"));
		
		//ELIMINAR
		sMapKey = "EliminarAsistenciaDiaria";
		inputMap = this.jButtonEliminarAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAsistenciaDiaria"));
		
		//CANCELAR	
		sMapKey = "CancelarAsistenciaDiaria";
		inputMap = this.jButtonCancelarAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAsistenciaDiaria"));
		
		//CERRAR		
		sMapKey = "CerrarAsistenciaDiaria";
		inputMap = this.jButtonCerrarAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAsistenciaDiaria"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAsistenciaDiaria";
		inputMap = this.jButtonGuardarCambiosTablaAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAsistenciaDiaria"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAsistenciaDiaria = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAsistenciaDiaria.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAsistenciaDiaria.setToolTipText("Nuevo AsistenciaDiaria");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAsistenciaDiaria = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAsistenciaDiaria.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAsistenciaDiaria.setToolTipText("Sin Cerrar Ventana AsistenciaDiaria");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAsistenciaDiaria = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAsistenciaDiaria.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAsistenciaDiaria.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAsistenciaDiaria.setText("Accion");
		this.jComboBoxTiposAccionesAsistenciaDiaria.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAsistenciaDiaria = new JLabelMe();
		
		this.jLabelAccionesAsistenciaDiaria.setText("Acciones");		
		this.jLabelAccionesAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAsistenciaDiaria();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAsistenciaDiaria();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAsistenciaDiaria=new JTabbedPane();
		this.jTabbedPaneRelacionesAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAsistenciaDiaria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaDiaria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaDiaria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAsistenciaDiaria = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAsistenciaDiaria = new GridBagLayout();
		
		this.jPanelCamposAsistenciaDiaria.setLayout(gridaBagLayoutCamposAsistenciaDiaria);
		this.jPanelCamposOcultosAsistenciaDiaria.setLayout(gridaBagLayoutCamposOcultosAsistenciaDiaria);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAsistenciaDiaria.add(jLabelIdAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAsistenciaDiaria.add(jLabelidAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAsistenciaDiaria.add(jLabelid_empresaAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAsistenciaDiaria.add(jButtonid_empresaAsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 3;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAsistenciaDiaria.add(jButtonid_empresaAsistenciaDiariaUpdate, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAsistenciaDiaria.add(jComboBoxid_empresaAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoAsistenciaDiaria.add(jLabelid_empleadoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoAsistenciaDiaria.add(jButtonid_empleadoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 3;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAsistenciaDiaria.add(jButtonid_empleadoAsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 4;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAsistenciaDiaria.add(jButtonid_empleadoAsistenciaDiariaUpdate, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoAsistenciaDiaria.add(jComboBoxid_empleadoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraAsistenciaDiaria.add(jLabelid_estructuraAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraAsistenciaDiaria.add(jButtonid_estructuraAsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 3;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraAsistenciaDiaria.add(jButtonid_estructuraAsistenciaDiariaUpdate, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraAsistenciaDiaria.add(jComboBoxid_estructuraAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructura_seccionAsistenciaDiaria.add(jLabelid_estructura_seccionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructura_seccionAsistenciaDiaria.add(jButtonid_estructura_seccionAsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 3;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructura_seccionAsistenciaDiaria.add(jButtonid_estructura_seccionAsistenciaDiariaUpdate, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructura_seccionAsistenciaDiaria.add(jComboBoxid_estructura_seccionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaAsistenciaDiaria.add(jLabelfechaAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaAsistenciaDiaria.add(jButtonfechaAsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaAsistenciaDiaria.add(jDateChooserfechaAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoraAsistenciaDiaria.add(jLabelhoraAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoraAsistenciaDiaria.add(jButtonhoraAsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoraAsistenciaDiaria.add(jSpinnerhoraAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_atrasoAsistenciaDiaria.add(jLabelhoras_atrasoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_atrasoAsistenciaDiaria.add(jButtonhoras_atrasoAsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_atrasoAsistenciaDiaria.add(jTextFieldhoras_atrasoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_faltaAsistenciaDiaria.add(jLabelhoras_faltaAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_faltaAsistenciaDiaria.add(jButtonhoras_faltaAsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_faltaAsistenciaDiaria.add(jTextFieldhoras_faltaAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_permisoAsistenciaDiaria.add(jLabelhoras_permisoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_permisoAsistenciaDiaria.add(jButtonhoras_permisoAsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_permisoAsistenciaDiaria.add(jTextFieldhoras_permisoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_extra25AsistenciaDiaria.add(jLabelhoras_extra25AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_extra25AsistenciaDiaria.add(jButtonhoras_extra25AsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_extra25AsistenciaDiaria.add(jTextFieldhoras_extra25AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_extra50AsistenciaDiaria.add(jLabelhoras_extra50AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_extra50AsistenciaDiaria.add(jButtonhoras_extra50AsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_extra50AsistenciaDiaria.add(jTextFieldhoras_extra50AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_extra100AsistenciaDiaria.add(jLabelhoras_extra100AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_extra100AsistenciaDiaria.add(jButtonhoras_extra100AsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_extra100AsistenciaDiaria.add(jTextFieldhoras_extra100AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionAsistenciaDiaria.add(jLabeldescripcionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 2;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
		this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionAsistenciaDiaria.add(jButtondescripcionAsistenciaDiariaBusqueda, this.gridBagConstraintsAsistenciaDiaria);
	}

	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
	this.gridBagConstraintsAsistenciaDiaria.gridx = 1;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionAsistenciaDiaria.add(jTextFielddescripcionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelidAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelid_empleadoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelid_estructuraAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelid_estructura_seccionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelfechaAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelhoraAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelhoras_atrasoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelhoras_faltaAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelhoras_permisoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelhoras_extra25AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelhoras_extra50AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPanelhoras_extra100AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaDiaria.add(this.jPaneldescripcionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposAsistenciaDiaria % 2==0) {
		iXPanelCamposAsistenciaDiaria=0;
		iYPanelCamposAsistenciaDiaria++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaDiaria.gridy = iYPanelCamposOcultosAsistenciaDiaria;
	this.gridBagConstraintsAsistenciaDiaria.gridx = iXPanelCamposOcultosAsistenciaDiaria++;
	this.gridBagConstraintsAsistenciaDiaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaDiaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsistenciaDiaria.add(this.jPanelid_empresaAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);



	if(iXPanelCamposOcultosAsistenciaDiaria % 2==0) {
		iXPanelCamposOcultosAsistenciaDiaria=0;
		iYPanelCamposOcultosAsistenciaDiaria++;
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
			
		GridBagLayout gridaBagLayoutAccionesAsistenciaDiaria= new GridBagLayout();
		this.jPanelAccionesAsistenciaDiaria.setLayout(gridaBagLayoutAccionesAsistenciaDiaria);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAsistenciaDiaria= new GridBagLayout();
		this.jPanelAccionesFormularioAsistenciaDiaria.setLayout(gridaBagLayoutAccionesFormularioAsistenciaDiaria);
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAsistenciaDiaria.add(this.jComboBoxTiposAccionesFormularioAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAsistenciaDiaria.add(this.jCheckBoxPostAccionNuevoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAsistenciaDiaria.add(this.jCheckBoxPostAccionSinCerrarAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAsistenciaDiaria.add(this.jCheckBoxPostAccionSinMensajeAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccion++;
			
		this.jPanelAccionesAsistenciaDiaria.add(this.jButtonModificarAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);							

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx =iPosXAccion++;
			
		this.jPanelAccionesAsistenciaDiaria.add(this.jButtonEliminarAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
			
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccion++;
		
		this.jPanelAccionesAsistenciaDiaria.add(this.jButtonActualizarAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccion++;
		
		this.jPanelAccionesAsistenciaDiaria.add(this.jButtonGuardarCambiosAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);	
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;		
		this.gridBagConstraintsAsistenciaDiaria.gridx =iPosXAccion++;
		
		this.jPanelAccionesAsistenciaDiaria.add(this.jButtonCancelarAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAsistenciaDiaria);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();						
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsistenciaDiaria.gridx = 0;		
			//this.gridBagConstraintsAsistenciaDiaria.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAsistenciaDiaria.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAsistenciaDiaria.gridx =0;
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAsistenciaDiaria.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AsistenciaDiariaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAsistenciaDiaria = new AsistenciaDiariaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Asistencia Diaria DATOS");
			
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
			
	        //this.setTitle("[FOR] - Asistencia Diaria DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Asistencia Diaria Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AsistenciaDiariaModel asistenciadiariaModel=new AsistenciaDiariaModel(this);
			
			//SI USARA CLASE INTERNA
			//AsistenciaDiariaModel.AsistenciaDiariaFocusTraversalPolicy asistenciadiariaFocusTraversalPolicy = asistenciadiariaModel.new AsistenciaDiariaFocusTraversalPolicy(this);
			
			//asistenciadiariaFocusTraversalPolicy.setasistenciadiariaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(asistenciadiariaModel);
			
			
			this.jContentPaneDetalleAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAsistenciaDiaria = new GridBagLayout();	
			this.jContentPaneDetalleAsistenciaDiaria.setLayout(gridaBagLayoutDetalleAsistenciaDiaria);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAsistenciaDiaria = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
				this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
					
				
				this.jContentPaneDetalleAsistenciaDiaria.add(jTtoolBarDetalleAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);								
				
}
			
			this.jScrollPanelDatosEdicionAsistenciaDiaria=   new JScrollPane(jContentPaneDetalleAsistenciaDiaria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAsistenciaDiaria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaDiaria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaDiaria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAsistenciaDiaria=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAsistenciaDiaria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaDiaria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaDiaria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	        
			this.jContentPaneDetalleAsistenciaDiaria.add(jPanelCamposAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);
			
			
			
			
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
						&& asistenciadiariaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.asistenciadiariaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAsistenciaDiaria= new GridBagConstraints();
						this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
						this.jContentPaneDetalleAsistenciaDiaria.add(this.jTabbedPaneRelacionesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAsistenciaDiaria.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAsistenciaDiaria.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
					this.gridBagConstraintsAsistenciaDiaria.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
					
				
					this.jContentPaneDetalleAsistenciaDiaria.add(jPanelCamposOcultosAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);
				
					this.jPanelCamposOcultosAsistenciaDiaria.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	        this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAsistenciaDiaria.add(this.jPanelAccionesFormularioAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);							
			
			
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
	        this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
	        
			
			this.jContentPaneDetalleAsistenciaDiaria.add(this.jPanelAccionesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAsistenciaDiaria);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAsistenciaDiaria=   new JScrollPane(this.jPanelCamposAsistenciaDiaria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAsistenciaDiaria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaDiaria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaDiaria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAsistenciaDiaria.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);			
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			
			
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
			
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaDiaria.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAsistenciaDiaria;//jContentPane;
		
		return jScrollPanelDatosEdicionAsistenciaDiaria;
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
