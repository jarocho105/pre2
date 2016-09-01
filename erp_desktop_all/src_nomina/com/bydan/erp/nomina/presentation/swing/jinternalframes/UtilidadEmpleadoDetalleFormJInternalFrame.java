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
import com.bydan.erp.nomina.util.UtilidadEmpleadoConstantesFunciones;

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
public class UtilidadEmpleadoDetalleFormJInternalFrame extends UtilidadEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleUtilidadEmpleado;
	
	protected JMenuBar jmenuBarDetalleUtilidadEmpleado;
	
	protected JMenu jmenuDetalleUtilidadEmpleado;
	protected JMenu jmenuDetalleArchivoUtilidadEmpleado;
	protected JMenu jmenuDetalleAccionesUtilidadEmpleado;
	protected JMenu jmenuDetalleDatosUtilidadEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUtilidadEmpleado;	
	protected GridBagConstraints gridBagConstraintsUtilidadEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected UtilidadEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleUtilidadEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public UtilidadEmpleadoSessionBean utilidadempleadoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public AnioSessionBean anioSessionBean;	
	
	public UtilidadEmpleadoLogic utilidadempleadoLogic;
	
	public JScrollPane jScrollPanelDatosUtilidadEmpleado;
	public JScrollPane jScrollPanelDatosEdicionUtilidadEmpleado;
	public JScrollPane jScrollPanelDatosGeneralUtilidadEmpleado;
	
	protected JPanel jPanelCamposUtilidadEmpleado;    
	protected JPanel jPanelCamposOcultosUtilidadEmpleado;    	
	protected JPanel jPanelAccionesUtilidadEmpleado;
	protected JPanel jPanelAccionesFormularioUtilidadEmpleado;
    
	
	
	protected Integer iXPanelCamposUtilidadEmpleado=0;
	protected Integer iYPanelCamposUtilidadEmpleado=0;
	
	protected Integer iXPanelCamposOcultosUtilidadEmpleado=0;
	protected Integer iYPanelCamposOcultosUtilidadEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoUtilidadEmpleado;
	public JButton jButtonModificarUtilidadEmpleado;
	public JButton jButtonActualizarUtilidadEmpleado;
    public JButton jButtonEliminarUtilidadEmpleado;
	public JButton jButtonCancelarUtilidadEmpleado;
    public JButton jButtonGuardarCambiosUtilidadEmpleado;
	public JButton jButtonGuardarCambiosTablaUtilidadEmpleado;
	protected JButton jButtonCerrarUtilidadEmpleado;
	
	
	protected JButton jButtonProcesarInformacionUtilidadEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoUtilidadEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarUtilidadEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeUtilidadEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUtilidadEmpleado;
	protected JButton jButtonModificarToolBarUtilidadEmpleado;
	protected JButton jButtonActualizarToolBarUtilidadEmpleado;
    protected JButton jButtonEliminarToolBarUtilidadEmpleado;
	protected JButton jButtonCancelarToolBarUtilidadEmpleado;
    protected JButton jButtonGuardarCambiosToolBarUtilidadEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarUtilidadEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarUtilidadEmpleado;
	protected JButton jButtonCerrarToolBarUtilidadEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarUtilidadEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUtilidadEmpleado;
	protected JMenuItem jMenuItemModificarUtilidadEmpleado;
	protected JMenuItem jMenuItemActualizarUtilidadEmpleado;
    protected JMenuItem jMenuItemEliminarUtilidadEmpleado;
	protected JMenuItem jMenuItemCancelarUtilidadEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosUtilidadEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaUtilidadEmpleado;
	protected JMenuItem jMenuItemCerrarUtilidadEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarUtilidadEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarUtilidadEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionUtilidadEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUtilidadEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarUtilidadEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUtilidadEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUtilidadEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioUtilidadEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidUtilidadEmpleado;
	public JLabel jLabelIdUtilidadEmpleado;
	public JLabel jLabelidUtilidadEmpleado;
	public JButton jButtonidUtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ingresoUtilidadEmpleado;
	public JLabel jLabelfecha_ingresoUtilidadEmpleado;
	//public JFormattedTextField jDateChooserfecha_ingresoUtilidadEmpleado;

	public JDateChooser jDateChooserfecha_ingresoUtilidadEmpleado;
	public JButton jButtonfecha_ingresoUtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_salidaUtilidadEmpleado;
	public JLabel jLabelfecha_salidaUtilidadEmpleado;
	//public JFormattedTextField jDateChooserfecha_salidaUtilidadEmpleado;

	public JDateChooser jDateChooserfecha_salidaUtilidadEmpleado;
	public JButton jButtonfecha_salidaUtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalorUtilidadEmpleado;
	public JLabel jLabelvalorUtilidadEmpleado;
	public JTextField jTextFieldvalorUtilidadEmpleado;
	public JButton jButtonvalorUtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasUtilidadEmpleado;
	public JLabel jLabelnumero_diasUtilidadEmpleado;
	public JTextField jTextFieldnumero_diasUtilidadEmpleado;
	public JButton jButtonnumero_diasUtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cargasUtilidadEmpleado;
	public JLabel jLabelnumero_cargasUtilidadEmpleado;
	public JTextField jTextFieldnumero_cargasUtilidadEmpleado;
	public JButton jButtonnumero_cargasUtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_factor10UtilidadEmpleado;
	public JLabel jLabelnumero_factor10UtilidadEmpleado;
	public JTextField jTextFieldnumero_factor10UtilidadEmpleado;
	public JButton jButtonnumero_factor10UtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_factor10UtilidadEmpleado;
	public JLabel jLabelvalor_factor10UtilidadEmpleado;
	public JTextField jTextFieldvalor_factor10UtilidadEmpleado;
	public JButton jButtonvalor_factor10UtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelutilidad_factor10UtilidadEmpleado;
	public JLabel jLabelutilidad_factor10UtilidadEmpleado;
	public JTextField jTextFieldutilidad_factor10UtilidadEmpleado;
	public JButton jButtonutilidad_factor10UtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_factor5UtilidadEmpleado;
	public JLabel jLabelnumero_factor5UtilidadEmpleado;
	public JTextField jTextFieldnumero_factor5UtilidadEmpleado;
	public JButton jButtonnumero_factor5UtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_factor5UtilidadEmpleado;
	public JLabel jLabelvalor_factor5UtilidadEmpleado;
	public JTextField jTextFieldvalor_factor5UtilidadEmpleado;
	public JButton jButtonvalor_factor5UtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelutilidad_factor5UtilidadEmpleado;
	public JLabel jLabelutilidad_factor5UtilidadEmpleado;
	public JTextField jTextFieldutilidad_factor5UtilidadEmpleado;
	public JButton jButtonutilidad_factor5UtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneltotalUtilidadEmpleado;
	public JLabel jLabeltotalUtilidadEmpleado;
	public JTextField jTextFieldtotalUtilidadEmpleado;
	public JButton jButtontotalUtilidadEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaUtilidadEmpleado;
	public JLabel jLabelid_empresaUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaUtilidadEmpleado;
	public JButton jButtonid_empresaUtilidadEmpleado= new JButtonMe();
	public JButton jButtonid_empresaUtilidadEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaUtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoUtilidadEmpleado;
	public JLabel jLabelid_empleadoUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoUtilidadEmpleado;
	public JButton jButtonid_empleadoUtilidadEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoUtilidadEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoUtilidadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioUtilidadEmpleado;
	public JLabel jLabelid_anioUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioUtilidadEmpleado;
	public JButton jButtonid_anioUtilidadEmpleado= new JButtonMe();
	public JButton jButtonid_anioUtilidadEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anioUtilidadEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesUtilidadEmpleado;
	
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
	public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public UtilidadEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposUtilidadEmpleado=new JPanel();
				this.jPanelAccionesFormularioUtilidadEmpleado=new JPanel();
				this.jmenuBarDetalleUtilidadEmpleado=new JMenuBar();
				this.jTtoolBarDetalleUtilidadEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("UtilidadEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public UtilidadEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("UtilidadEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UtilidadEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarUtilidadEmpleado() {
		return this.jButtonActualizarToolBarUtilidadEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarUtilidadEmpleado() {
		return this.jButtonEliminarToolBarUtilidadEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarUtilidadEmpleado() {
		return this.jButtonCancelarToolBarUtilidadEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionUtilidadEmpleado() {
		return this.jButtonProcesarInformacionUtilidadEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUtilidadEmpleado)	{
		this.jButtonProcesarInformacionUtilidadEmpleado = jButtonProcesarInformacionUtilidadEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUtilidadEmpleado() {
		return this.jComboBoxTiposAccionesUtilidadEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUtilidadEmpleado(
			JComboBox jComboBoxTiposRelacionesUtilidadEmpleado) {
		this.jComboBoxTiposRelacionesUtilidadEmpleado = jComboBoxTiposRelacionesUtilidadEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUtilidadEmpleado(
			JComboBox jComboBoxTiposAccionesUtilidadEmpleado) {
		this.jComboBoxTiposAccionesUtilidadEmpleado = jComboBoxTiposAccionesUtilidadEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioUtilidadEmpleado() {
		return this.jComboBoxTiposAccionesFormularioUtilidadEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioUtilidadEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioUtilidadEmpleado) {
		this.jComboBoxTiposAccionesFormularioUtilidadEmpleado = jComboBoxTiposAccionesFormularioUtilidadEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
		
		this.utilidadempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.utilidadempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UtilidadEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UtilidadEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UtilidadEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Utilidad Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		UtilidadEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleUtilidadEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarUtilidadEmpleado=new JButtonMe();
				this.jButtonModificarToolBarUtilidadEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarUtilidadEmpleado,this.jTtoolBarDetalleUtilidadEmpleado,
							"actualizar","actualizar","Actualizar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarUtilidadEmpleado,this.jTtoolBarDetalleUtilidadEmpleado,
							"eliminar","eliminar","Eliminar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarUtilidadEmpleado,this.jTtoolBarDetalleUtilidadEmpleado,
							"cancelar","cancelar","Cancelar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarUtilidadEmpleado,this.jTtoolBarDetalleUtilidadEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleUtilidadEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleUtilidadEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoUtilidadEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesUtilidadEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosUtilidadEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUtilidadEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUtilidadEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUtilidadEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarUtilidadEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarUtilidadEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarUtilidadEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarUtilidadEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarUtilidadEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarUtilidadEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarUtilidadEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarUtilidadEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarUtilidadEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarUtilidadEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarUtilidadEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarUtilidadEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosUtilidadEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUtilidadEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUtilidadEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUtilidadEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUtilidadEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUtilidadEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarUtilidadEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarUtilidadEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarUtilidadEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUtilidadEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUtilidadEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUtilidadEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUtilidadEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUtilidadEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUtilidadEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoUtilidadEmpleado.add(this.jMenuItemDetalleCerrarUtilidadEmpleado);
		
		this.jmenuDetalleAccionesUtilidadEmpleado.add(this.jMenuItemActualizarUtilidadEmpleado);
		this.jmenuDetalleAccionesUtilidadEmpleado.add(this.jMenuItemEliminarUtilidadEmpleado);
		this.jmenuDetalleAccionesUtilidadEmpleado.add(this.jMenuItemCancelarUtilidadEmpleado);		
		
		//this.jmenuDetalleDatosUtilidadEmpleado.add(this.jMenuItemDetalleAbrirOrderByUtilidadEmpleado);				
		this.jmenuDetalleDatosUtilidadEmpleado.add(this.jMenuItemDetalleMostarOcultarUtilidadEmpleado);				
				
		//this.jmenuDetalleAccionesUtilidadEmpleado.add(this.jMenuItemGuardarCambiosUtilidadEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleUtilidadEmpleado.add(this.jmenuDetalleArchivoUtilidadEmpleado);		
		this.jmenuBarDetalleUtilidadEmpleado.add(this.jmenuDetalleAccionesUtilidadEmpleado);		
		this.jmenuBarDetalleUtilidadEmpleado.add(this.jmenuDetalleDatosUtilidadEmpleado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleUtilidadEmpleado);				
	}
	
	
	public void inicializarElementosCamposUtilidadEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdUtilidadEmpleado = new JLabelMe();
		jLabelIdUtilidadEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidUtilidadEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidUtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutUtilidadEmpleado= new GridBagLayout();

		this.jPanelidUtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);

		jLabelidUtilidadEmpleado = new JLabel();
		jLabelidUtilidadEmpleado.setText("Id");

		jLabelidUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_ingresoUtilidadEmpleado = new JLabelMe();
		this.jLabelfecha_ingresoUtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO+" : *");
		this.jLabelfecha_ingresoUtilidadEmpleado.setToolTipText("Fecha Ingreso");
		this.jLabelfecha_ingresoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ingresoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ingresoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ingresoUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ingresoUtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ingresoUtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelfecha_ingresoUtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		//jFormattedTextFieldfecha_ingresoUtilidadEmpleado= new JFormattedTextFieldMe();

		jDateChooserfecha_ingresoUtilidadEmpleado= new JDateChooser();
		jDateChooserfecha_ingresoUtilidadEmpleado.setEnabled(false);
		jDateChooserfecha_ingresoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ingresoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ingresoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ingresoUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ingresoUtilidadEmpleado.setDate(new Date());
		jDateChooserfecha_ingresoUtilidadEmpleado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ingresoUtilidadEmpleado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ingresoUtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonfecha_ingresoUtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ingresoUtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ingresoUtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ingresoUtilidadEmpleadoBusqueda.setText("U");
		this.jButtonfecha_ingresoUtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ingresoUtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ingresoUtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ingresoUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ingresoUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ingresoUtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ingresoUtilidadEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_salidaUtilidadEmpleado = new JLabelMe();
		this.jLabelfecha_salidaUtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA+" : *");
		this.jLabelfecha_salidaUtilidadEmpleado.setToolTipText("Fecha Salida");
		this.jLabelfecha_salidaUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_salidaUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_salidaUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_salidaUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_salidaUtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_salidaUtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelfecha_salidaUtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		//jFormattedTextFieldfecha_salidaUtilidadEmpleado= new JFormattedTextFieldMe();

		jDateChooserfecha_salidaUtilidadEmpleado= new JDateChooser();
		jDateChooserfecha_salidaUtilidadEmpleado.setEnabled(false);
		jDateChooserfecha_salidaUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_salidaUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_salidaUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_salidaUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_salidaUtilidadEmpleado.setDate(new Date());
		jDateChooserfecha_salidaUtilidadEmpleado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_salidaUtilidadEmpleado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_salidaUtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonfecha_salidaUtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_salidaUtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_salidaUtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_salidaUtilidadEmpleadoBusqueda.setText("U");
		this.jButtonfecha_salidaUtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_salidaUtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_salidaUtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_salidaUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_salidaUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_salidaUtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_salidaUtilidadEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalorUtilidadEmpleado = new JLabelMe();
		this.jLabelvalorUtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorUtilidadEmpleado.setToolTipText("Valor");
		this.jLabelvalorUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorUtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorUtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelvalorUtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jTextFieldvalorUtilidadEmpleado= new JTextFieldMe();
		jTextFieldvalorUtilidadEmpleado.setEnabled(false);
		jTextFieldvalorUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorUtilidadEmpleado.setText("0.0");

		this.jButtonvalorUtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalorUtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorUtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorUtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorUtilidadEmpleadoBusqueda.setText("U");
		this.jButtonvalorUtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorUtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorUtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorUtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorUtilidadEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasUtilidadEmpleado = new JLabelMe();
		this.jLabelnumero_diasUtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasUtilidadEmpleado.setToolTipText("Numero Dias");
		this.jLabelnumero_diasUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasUtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasUtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelnumero_diasUtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jTextFieldnumero_diasUtilidadEmpleado= new JTextFieldMe();
		jTextFieldnumero_diasUtilidadEmpleado.setEnabled(false);
		jTextFieldnumero_diasUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasUtilidadEmpleado.setText("0");

		this.jButtonnumero_diasUtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonnumero_diasUtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasUtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasUtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasUtilidadEmpleadoBusqueda.setText("U");
		this.jButtonnumero_diasUtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasUtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasUtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasUtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasUtilidadEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cargasUtilidadEmpleado = new JLabelMe();
		this.jLabelnumero_cargasUtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS+" : *");
		this.jLabelnumero_cargasUtilidadEmpleado.setToolTipText("Numero Cargas");
		this.jLabelnumero_cargasUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cargasUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cargasUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cargasUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cargasUtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cargasUtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelnumero_cargasUtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jTextFieldnumero_cargasUtilidadEmpleado= new JTextFieldMe();
		jTextFieldnumero_cargasUtilidadEmpleado.setEnabled(false);
		jTextFieldnumero_cargasUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cargasUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cargasUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cargasUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cargasUtilidadEmpleado.setText("0");

		this.jButtonnumero_cargasUtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonnumero_cargasUtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cargasUtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cargasUtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cargasUtilidadEmpleadoBusqueda.setText("U");
		this.jButtonnumero_cargasUtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cargasUtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cargasUtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cargasUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cargasUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cargasUtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cargasUtilidadEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_factor10UtilidadEmpleado = new JLabelMe();
		this.jLabelnumero_factor10UtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10+" : *");
		this.jLabelnumero_factor10UtilidadEmpleado.setToolTipText("Numero Factor10");
		this.jLabelnumero_factor10UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_factor10UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_factor10UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_factor10UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_factor10UtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_factor10UtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelnumero_factor10UtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jTextFieldnumero_factor10UtilidadEmpleado= new JTextFieldMe();
		jTextFieldnumero_factor10UtilidadEmpleado.setEnabled(false);
		jTextFieldnumero_factor10UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_factor10UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_factor10UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_factor10UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_factor10UtilidadEmpleado.setText("0.0");

		this.jButtonnumero_factor10UtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonnumero_factor10UtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_factor10UtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_factor10UtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_factor10UtilidadEmpleadoBusqueda.setText("U");
		this.jButtonnumero_factor10UtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_factor10UtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_factor10UtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_factor10UtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_factor10UtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_factor10UtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_factor10UtilidadEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_factor10UtilidadEmpleado = new JLabelMe();
		this.jLabelvalor_factor10UtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10+" : *");
		this.jLabelvalor_factor10UtilidadEmpleado.setToolTipText("Valor Factor10");
		this.jLabelvalor_factor10UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_factor10UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_factor10UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_factor10UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_factor10UtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_factor10UtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelvalor_factor10UtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jTextFieldvalor_factor10UtilidadEmpleado= new JTextFieldMe();
		jTextFieldvalor_factor10UtilidadEmpleado.setEnabled(false);
		jTextFieldvalor_factor10UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_factor10UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_factor10UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_factor10UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_factor10UtilidadEmpleado.setText("0.0");

		this.jButtonvalor_factor10UtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_factor10UtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_factor10UtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_factor10UtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_factor10UtilidadEmpleadoBusqueda.setText("U");
		this.jButtonvalor_factor10UtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_factor10UtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_factor10UtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_factor10UtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_factor10UtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_factor10UtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_factor10UtilidadEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelutilidad_factor10UtilidadEmpleado = new JLabelMe();
		this.jLabelutilidad_factor10UtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10+" : *");
		this.jLabelutilidad_factor10UtilidadEmpleado.setToolTipText("Utilidad Factor10");
		this.jLabelutilidad_factor10UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelutilidad_factor10UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelutilidad_factor10UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelutilidad_factor10UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelutilidad_factor10UtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelutilidad_factor10UtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelutilidad_factor10UtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jTextFieldutilidad_factor10UtilidadEmpleado= new JTextFieldMe();
		jTextFieldutilidad_factor10UtilidadEmpleado.setEnabled(false);
		jTextFieldutilidad_factor10UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidad_factor10UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidad_factor10UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldutilidad_factor10UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldutilidad_factor10UtilidadEmpleado.setText("0.0");

		this.jButtonutilidad_factor10UtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonutilidad_factor10UtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidad_factor10UtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidad_factor10UtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonutilidad_factor10UtilidadEmpleadoBusqueda.setText("U");
		this.jButtonutilidad_factor10UtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonutilidad_factor10UtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonutilidad_factor10UtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldutilidad_factor10UtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldutilidad_factor10UtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"utilidad_factor10UtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonutilidad_factor10UtilidadEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_factor5UtilidadEmpleado = new JLabelMe();
		this.jLabelnumero_factor5UtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5+" : *");
		this.jLabelnumero_factor5UtilidadEmpleado.setToolTipText("Numero Factor5");
		this.jLabelnumero_factor5UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_factor5UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_factor5UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_factor5UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_factor5UtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_factor5UtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelnumero_factor5UtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jTextFieldnumero_factor5UtilidadEmpleado= new JTextFieldMe();
		jTextFieldnumero_factor5UtilidadEmpleado.setEnabled(false);
		jTextFieldnumero_factor5UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_factor5UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_factor5UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_factor5UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_factor5UtilidadEmpleado.setText("0.0");

		this.jButtonnumero_factor5UtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonnumero_factor5UtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_factor5UtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_factor5UtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_factor5UtilidadEmpleadoBusqueda.setText("U");
		this.jButtonnumero_factor5UtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_factor5UtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_factor5UtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_factor5UtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_factor5UtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_factor5UtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_factor5UtilidadEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_factor5UtilidadEmpleado = new JLabelMe();
		this.jLabelvalor_factor5UtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5+" : *");
		this.jLabelvalor_factor5UtilidadEmpleado.setToolTipText("Valor Factor5");
		this.jLabelvalor_factor5UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_factor5UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_factor5UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_factor5UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_factor5UtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_factor5UtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelvalor_factor5UtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jTextFieldvalor_factor5UtilidadEmpleado= new JTextFieldMe();
		jTextFieldvalor_factor5UtilidadEmpleado.setEnabled(false);
		jTextFieldvalor_factor5UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_factor5UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_factor5UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_factor5UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_factor5UtilidadEmpleado.setText("0.0");

		this.jButtonvalor_factor5UtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_factor5UtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_factor5UtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_factor5UtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_factor5UtilidadEmpleadoBusqueda.setText("U");
		this.jButtonvalor_factor5UtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_factor5UtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_factor5UtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_factor5UtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_factor5UtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_factor5UtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_factor5UtilidadEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelutilidad_factor5UtilidadEmpleado = new JLabelMe();
		this.jLabelutilidad_factor5UtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5+" : *");
		this.jLabelutilidad_factor5UtilidadEmpleado.setToolTipText("Utilidad Factor5");
		this.jLabelutilidad_factor5UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelutilidad_factor5UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelutilidad_factor5UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelutilidad_factor5UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelutilidad_factor5UtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelutilidad_factor5UtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelutilidad_factor5UtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jTextFieldutilidad_factor5UtilidadEmpleado= new JTextFieldMe();
		jTextFieldutilidad_factor5UtilidadEmpleado.setEnabled(false);
		jTextFieldutilidad_factor5UtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidad_factor5UtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidad_factor5UtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldutilidad_factor5UtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldutilidad_factor5UtilidadEmpleado.setText("0.0");

		this.jButtonutilidad_factor5UtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonutilidad_factor5UtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidad_factor5UtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidad_factor5UtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonutilidad_factor5UtilidadEmpleadoBusqueda.setText("U");
		this.jButtonutilidad_factor5UtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonutilidad_factor5UtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonutilidad_factor5UtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldutilidad_factor5UtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldutilidad_factor5UtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"utilidad_factor5UtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonutilidad_factor5UtilidadEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeltotalUtilidadEmpleado = new JLabelMe();
		this.jLabeltotalUtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalUtilidadEmpleado.setToolTipText("Total");
		this.jLabeltotalUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalUtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalUtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPaneltotalUtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jTextFieldtotalUtilidadEmpleado= new JTextFieldMe();
		jTextFieldtotalUtilidadEmpleado.setEnabled(false);
		jTextFieldtotalUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalUtilidadEmpleado.setText("0.0");

		this.jButtontotalUtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtontotalUtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalUtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalUtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalUtilidadEmpleadoBusqueda.setText("U");
		this.jButtontotalUtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalUtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalUtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalUtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalUtilidadEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysUtilidadEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaUtilidadEmpleado = new JLabelMe();
		this.jLabelid_empresaUtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaUtilidadEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaUtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaUtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelid_empresaUtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jComboBoxid_empresaUtilidadEmpleado= new JComboBoxMe();
		jComboBoxid_empresaUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaUtilidadEmpleado.setEnabled(false);

		this.jButtonid_empresaUtilidadEmpleado= new JButtonMe();
		this.jButtonid_empresaUtilidadEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadEmpleado.setText("Buscar");
		this.jButtonid_empresaUtilidadEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaUtilidadEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadEmpleado"));

		this.jButtonid_empresaUtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaUtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUtilidadEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaUtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaUtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaUtilidadEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaUtilidadEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaUtilidadEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUtilidadEmpleadoUpdate.setText("U");
		this.jButtonid_empresaUtilidadEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaUtilidadEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadEmpleadoUpdate"));



					
		this.jLabelid_empleadoUtilidadEmpleado = new JLabelMe();
		this.jLabelid_empleadoUtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoUtilidadEmpleado.setToolTipText("Empleado");
		this.jLabelid_empleadoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoUtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoUtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelid_empleadoUtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jComboBoxid_empleadoUtilidadEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoUtilidadEmpleado= new JButtonMe();
		this.jButtonid_empleadoUtilidadEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoUtilidadEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoUtilidadEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoUtilidadEmpleado.setText("Buscar");
		this.jButtonid_empleadoUtilidadEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoUtilidadEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoUtilidadEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoUtilidadEmpleado"));

		this.jButtonid_empleadoUtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empleadoUtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoUtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoUtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoUtilidadEmpleadoBusqueda.setText("U");
		this.jButtonid_empleadoUtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoUtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoUtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoUtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoUtilidadEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoUtilidadEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empleadoUtilidadEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoUtilidadEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoUtilidadEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoUtilidadEmpleadoUpdate.setText("U");
		this.jButtonid_empleadoUtilidadEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoUtilidadEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoUtilidadEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoUtilidadEmpleadoUpdate"));



					
		this.jLabelid_anioUtilidadEmpleado = new JLabelMe();
		this.jLabelid_anioUtilidadEmpleado.setText(""+UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioUtilidadEmpleado.setToolTipText("Anio");
		this.jLabelid_anioUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioUtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioUtilidadEmpleado.setToolTipText(UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		this.jPanelid_anioUtilidadEmpleado.setLayout(this.gridaBagLayoutUtilidadEmpleado);


		jComboBoxid_anioUtilidadEmpleado= new JComboBoxMe();
		jComboBoxid_anioUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioUtilidadEmpleado= new JButtonMe();
		this.jButtonid_anioUtilidadEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioUtilidadEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioUtilidadEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioUtilidadEmpleado.setText("Buscar");
		this.jButtonid_anioUtilidadEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioUtilidadEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioUtilidadEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioUtilidadEmpleado"));

		this.jButtonid_anioUtilidadEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_anioUtilidadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUtilidadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUtilidadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioUtilidadEmpleadoBusqueda.setText("U");
		this.jButtonid_anioUtilidadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioUtilidadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioUtilidadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioUtilidadEmpleadoBusqueda"));

		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioUtilidadEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_anioUtilidadEmpleadoUpdate= new JButtonMe();
		this.jButtonid_anioUtilidadEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUtilidadEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUtilidadEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioUtilidadEmpleadoUpdate.setText("U");
		this.jButtonid_anioUtilidadEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioUtilidadEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioUtilidadEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioUtilidadEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleUtilidadEmpleado = new UtilidadEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Utilidad Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUtilidadEmpleado= new GridBagLayout();
		

		
		String sToolTipUtilidadEmpleado="";
		sToolTipUtilidadEmpleado=UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUtilidadEmpleado+="(Nomina.UtilidadEmpleado)";
		}
		
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipUtilidadEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoUtilidadEmpleado = new JButtonMe();
		this.jButtonModificarUtilidadEmpleado = new JButtonMe();
        this.jButtonActualizarUtilidadEmpleado = new JButtonMe();
        this.jButtonEliminarUtilidadEmpleado = new JButtonMe();
        this.jButtonCancelarUtilidadEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosUtilidadEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaUtilidadEmpleado = new JButtonMe();
		this.jButtonCerrarUtilidadEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosUtilidadEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionUtilidadEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralUtilidadEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Utilidad Empleado";
		
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosUtilidadEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposUtilidadEmpleado.setName("jPanelCamposUtilidadEmpleado"); 

		this.jPanelCamposOcultosUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosUtilidadEmpleado.setName("jPanelCamposOcultosUtilidadEmpleado"); 

        this.jPanelAccionesUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUtilidadEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesUtilidadEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioUtilidadEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioUtilidadEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoUtilidadEmpleado.setText("Nuevo");
		this.jButtonModificarUtilidadEmpleado.setText("Editar");
        this.jButtonActualizarUtilidadEmpleado.setText("Actualizar");
        this.jButtonEliminarUtilidadEmpleado.setText("Eliminar");
        this.jButtonCancelarUtilidadEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosUtilidadEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaUtilidadEmpleado.setText("Guardar");
		this.jButtonCerrarUtilidadEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUtilidadEmpleado,"nuevo_button","Nuevo",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarUtilidadEmpleado,"modificar_button","Editar",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarUtilidadEmpleado,"actualizar_button","Actualizar",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarUtilidadEmpleado,"eliminar_button","Eliminar",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarUtilidadEmpleado,"cancelar_button","Cancelar",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosUtilidadEmpleado,"guardarcambios_button","Guardar",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUtilidadEmpleado,"guardarcambiostabla_button","Guardar",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUtilidadEmpleado,"cerrar_button","Salir",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoUtilidadEmpleado.setToolTipText("Nuevo"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarUtilidadEmpleado.setToolTipText("Editar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarUtilidadEmpleado.setToolTipText("Actualizar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarUtilidadEmpleado.setToolTipText("Eliminar)"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarUtilidadEmpleado.setToolTipText("Cancelar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosUtilidadEmpleado.setToolTipText("Guardar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaUtilidadEmpleado.setToolTipText("Guardar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUtilidadEmpleado.setToolTipText("Salir"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUtilidadEmpleado";
		inputMap = this.jButtonNuevoUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUtilidadEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUtilidadEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarUtilidadEmpleado";
		inputMap = this.jButtonActualizarUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarUtilidadEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarUtilidadEmpleado";
		inputMap = this.jButtonEliminarUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarUtilidadEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarUtilidadEmpleado";
		inputMap = this.jButtonCancelarUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarUtilidadEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarUtilidadEmpleado";
		inputMap = this.jButtonCerrarUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUtilidadEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUtilidadEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUtilidadEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoUtilidadEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoUtilidadEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoUtilidadEmpleado.setToolTipText("Nuevo UtilidadEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarUtilidadEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarUtilidadEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarUtilidadEmpleado.setToolTipText("Sin Cerrar Ventana UtilidadEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeUtilidadEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeUtilidadEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeUtilidadEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUtilidadEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesUtilidadEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesUtilidadEmpleado = new JLabelMe();
		
		this.jLabelAccionesUtilidadEmpleado.setText("Acciones");		
		this.jLabelAccionesUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposUtilidadEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysUtilidadEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesUtilidadEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesUtilidadEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposUtilidadEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosUtilidadEmpleado = new GridBagLayout();
		
		this.jPanelCamposUtilidadEmpleado.setLayout(gridaBagLayoutCamposUtilidadEmpleado);
		this.jPanelCamposOcultosUtilidadEmpleado.setLayout(gridaBagLayoutCamposOcultosUtilidadEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidUtilidadEmpleado.add(jLabelIdUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidUtilidadEmpleado.add(jLabelidUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaUtilidadEmpleado.add(jLabelid_empresaUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUtilidadEmpleado.add(jButtonid_empresaUtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 3;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUtilidadEmpleado.add(jButtonid_empresaUtilidadEmpleadoUpdate, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaUtilidadEmpleado.add(jComboBoxid_empresaUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoUtilidadEmpleado.add(jLabelid_empleadoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoUtilidadEmpleado.add(jButtonid_empleadoUtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 3;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoUtilidadEmpleado.add(jButtonid_empleadoUtilidadEmpleadoUpdate, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoUtilidadEmpleado.add(jComboBoxid_empleadoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioUtilidadEmpleado.add(jLabelid_anioUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioUtilidadEmpleado.add(jButtonid_anioUtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 3;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioUtilidadEmpleado.add(jButtonid_anioUtilidadEmpleadoUpdate, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioUtilidadEmpleado.add(jComboBoxid_anioUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ingresoUtilidadEmpleado.add(jLabelfecha_ingresoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ingresoUtilidadEmpleado.add(jButtonfecha_ingresoUtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ingresoUtilidadEmpleado.add(jDateChooserfecha_ingresoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_salidaUtilidadEmpleado.add(jLabelfecha_salidaUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_salidaUtilidadEmpleado.add(jButtonfecha_salidaUtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_salidaUtilidadEmpleado.add(jDateChooserfecha_salidaUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorUtilidadEmpleado.add(jLabelvalorUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorUtilidadEmpleado.add(jButtonvalorUtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorUtilidadEmpleado.add(jTextFieldvalorUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasUtilidadEmpleado.add(jLabelnumero_diasUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasUtilidadEmpleado.add(jButtonnumero_diasUtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasUtilidadEmpleado.add(jTextFieldnumero_diasUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cargasUtilidadEmpleado.add(jLabelnumero_cargasUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cargasUtilidadEmpleado.add(jButtonnumero_cargasUtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cargasUtilidadEmpleado.add(jTextFieldnumero_cargasUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_factor10UtilidadEmpleado.add(jLabelnumero_factor10UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_factor10UtilidadEmpleado.add(jButtonnumero_factor10UtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_factor10UtilidadEmpleado.add(jTextFieldnumero_factor10UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_factor10UtilidadEmpleado.add(jLabelvalor_factor10UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_factor10UtilidadEmpleado.add(jButtonvalor_factor10UtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_factor10UtilidadEmpleado.add(jTextFieldvalor_factor10UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelutilidad_factor10UtilidadEmpleado.add(jLabelutilidad_factor10UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelutilidad_factor10UtilidadEmpleado.add(jButtonutilidad_factor10UtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelutilidad_factor10UtilidadEmpleado.add(jTextFieldutilidad_factor10UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_factor5UtilidadEmpleado.add(jLabelnumero_factor5UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_factor5UtilidadEmpleado.add(jButtonnumero_factor5UtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_factor5UtilidadEmpleado.add(jTextFieldnumero_factor5UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_factor5UtilidadEmpleado.add(jLabelvalor_factor5UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_factor5UtilidadEmpleado.add(jButtonvalor_factor5UtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_factor5UtilidadEmpleado.add(jTextFieldvalor_factor5UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelutilidad_factor5UtilidadEmpleado.add(jLabelutilidad_factor5UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelutilidad_factor5UtilidadEmpleado.add(jButtonutilidad_factor5UtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelutilidad_factor5UtilidadEmpleado.add(jTextFieldutilidad_factor5UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalUtilidadEmpleado.add(jLabeltotalUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 2;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
		this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalUtilidadEmpleado.add(jButtontotalUtilidadEmpleadoBusqueda, this.gridBagConstraintsUtilidadEmpleado);
	}

	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
	this.gridBagConstraintsUtilidadEmpleado.gridx = 1;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalUtilidadEmpleado.add(jTextFieldtotalUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelidUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelid_empleadoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelid_anioUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelfecha_ingresoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelfecha_salidaUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelvalorUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelnumero_diasUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelnumero_cargasUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelnumero_factor10UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelvalor_factor10UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelutilidad_factor10UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelnumero_factor5UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelvalor_factor5UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPanelutilidad_factor5UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadEmpleado.add(this.jPaneltotalUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposUtilidadEmpleado % 2==0) {
		iXPanelCamposUtilidadEmpleado=0;
		iYPanelCamposUtilidadEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadEmpleado.gridy = iYPanelCamposOcultosUtilidadEmpleado;
	this.gridBagConstraintsUtilidadEmpleado.gridx = iXPanelCamposOcultosUtilidadEmpleado++;
	this.gridBagConstraintsUtilidadEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUtilidadEmpleado.add(this.jPanelid_empresaUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);



	if(iXPanelCamposOcultosUtilidadEmpleado % 2==0) {
		iXPanelCamposOcultosUtilidadEmpleado=0;
		iYPanelCamposOcultosUtilidadEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesUtilidadEmpleado= new GridBagLayout();
		this.jPanelAccionesUtilidadEmpleado.setLayout(gridaBagLayoutAccionesUtilidadEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioUtilidadEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioUtilidadEmpleado.setLayout(gridaBagLayoutAccionesFormularioUtilidadEmpleado);
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUtilidadEmpleado.add(this.jComboBoxTiposAccionesFormularioUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUtilidadEmpleado.add(this.jCheckBoxPostAccionNuevoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUtilidadEmpleado.add(this.jCheckBoxPostAccionSinCerrarUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUtilidadEmpleado.add(this.jCheckBoxPostAccionSinMensajeUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesUtilidadEmpleado.add(this.jButtonModificarUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);							

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesUtilidadEmpleado.add(this.jButtonEliminarUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
			
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesUtilidadEmpleado.add(this.jButtonActualizarUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesUtilidadEmpleado.add(this.jButtonGuardarCambiosUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);	
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;		
		this.gridBagConstraintsUtilidadEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesUtilidadEmpleado.add(this.jButtonCancelarUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUtilidadEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadEmpleado.gridx = 0;		
			//this.gridBagConstraintsUtilidadEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUtilidadEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUtilidadEmpleado.gridx =0;
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUtilidadEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(UtilidadEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleUtilidadEmpleado = new UtilidadEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Utilidad Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Utilidad Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Utilidad Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			UtilidadEmpleadoModel utilidadempleadoModel=new UtilidadEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//UtilidadEmpleadoModel.UtilidadEmpleadoFocusTraversalPolicy utilidadempleadoFocusTraversalPolicy = utilidadempleadoModel.new UtilidadEmpleadoFocusTraversalPolicy(this);
			
			//utilidadempleadoFocusTraversalPolicy.setutilidadempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(utilidadempleadoModel);
			
			
			this.jContentPaneDetalleUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleUtilidadEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleUtilidadEmpleado.setLayout(gridaBagLayoutDetalleUtilidadEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUtilidadEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
				this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleUtilidadEmpleado.add(jTtoolBarDetalleUtilidadEmpleado, gridBagConstraintsUtilidadEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionUtilidadEmpleado=   new JScrollPane(jContentPaneDetalleUtilidadEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUtilidadEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralUtilidadEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUtilidadEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleUtilidadEmpleado.add(jPanelCamposUtilidadEmpleado, gridBagConstraintsUtilidadEmpleado);
			
			
			
			
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
						&& utilidadempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.utilidadempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsUtilidadEmpleado= new GridBagConstraints();
						this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
						this.jContentPaneDetalleUtilidadEmpleado.add(this.jTabbedPaneRelacionesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUtilidadEmpleado.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosUtilidadEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
					this.gridBagConstraintsUtilidadEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleUtilidadEmpleado.add(jPanelCamposOcultosUtilidadEmpleado, gridBagConstraintsUtilidadEmpleado);
				
					this.jPanelCamposOcultosUtilidadEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	        this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleUtilidadEmpleado.add(this.jPanelAccionesFormularioUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);							
			
			
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleUtilidadEmpleado.add(this.jPanelAccionesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionUtilidadEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionUtilidadEmpleado=   new JScrollPane(this.jPanelCamposUtilidadEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUtilidadEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsUtilidadEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);			
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			
			
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
			
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralUtilidadEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionUtilidadEmpleado;
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
