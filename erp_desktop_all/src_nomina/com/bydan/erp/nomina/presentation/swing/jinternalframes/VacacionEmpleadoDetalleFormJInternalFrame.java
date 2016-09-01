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
import com.bydan.erp.nomina.util.VacacionEmpleadoConstantesFunciones;

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
public class VacacionEmpleadoDetalleFormJInternalFrame extends VacacionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVacacionEmpleado;
	
	protected JMenuBar jmenuBarDetalleVacacionEmpleado;
	
	protected JMenu jmenuDetalleVacacionEmpleado;
	protected JMenu jmenuDetalleArchivoVacacionEmpleado;
	protected JMenu jmenuDetalleAccionesVacacionEmpleado;
	protected JMenu jmenuDetalleDatosVacacionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVacacionEmpleado;	
	protected GridBagConstraints gridBagConstraintsVacacionEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VacacionEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleVacacionEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected AnioBeanSwingJInternalFrame anioperiodo1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anioperiodo1="";

	protected AnioBeanSwingJInternalFrame anioperiodo2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anioperiodo2="";
	
	public VacacionEmpleadoSessionBean vacacionempleadoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public AnioSessionBean anioperiodo1SessionBean;
	public AnioSessionBean anioperiodo2SessionBean;	
	
	public VacacionEmpleadoLogic vacacionempleadoLogic;
	
	public JScrollPane jScrollPanelDatosVacacionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionVacacionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralVacacionEmpleado;
	
	protected JPanel jPanelCamposVacacionEmpleado;    
	protected JPanel jPanelCamposOcultosVacacionEmpleado;    	
	protected JPanel jPanelAccionesVacacionEmpleado;
	protected JPanel jPanelAccionesFormularioVacacionEmpleado;
    
	
	
	protected Integer iXPanelCamposVacacionEmpleado=0;
	protected Integer iYPanelCamposVacacionEmpleado=0;
	
	protected Integer iXPanelCamposOcultosVacacionEmpleado=0;
	protected Integer iYPanelCamposOcultosVacacionEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVacacionEmpleado;
	public JButton jButtonModificarVacacionEmpleado;
	public JButton jButtonActualizarVacacionEmpleado;
    public JButton jButtonEliminarVacacionEmpleado;
	public JButton jButtonCancelarVacacionEmpleado;
    public JButton jButtonGuardarCambiosVacacionEmpleado;
	public JButton jButtonGuardarCambiosTablaVacacionEmpleado;
	protected JButton jButtonCerrarVacacionEmpleado;
	
	
	protected JButton jButtonProcesarInformacionVacacionEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVacacionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVacacionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVacacionEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVacacionEmpleado;
	protected JButton jButtonModificarToolBarVacacionEmpleado;
	protected JButton jButtonActualizarToolBarVacacionEmpleado;
    protected JButton jButtonEliminarToolBarVacacionEmpleado;
	protected JButton jButtonCancelarToolBarVacacionEmpleado;
    protected JButton jButtonGuardarCambiosToolBarVacacionEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarVacacionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarVacacionEmpleado;
	protected JButton jButtonCerrarToolBarVacacionEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarVacacionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVacacionEmpleado;
	protected JMenuItem jMenuItemModificarVacacionEmpleado;
	protected JMenuItem jMenuItemActualizarVacacionEmpleado;
    protected JMenuItem jMenuItemEliminarVacacionEmpleado;
	protected JMenuItem jMenuItemCancelarVacacionEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosVacacionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaVacacionEmpleado;
	protected JMenuItem jMenuItemCerrarVacacionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarVacacionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarVacacionEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionVacacionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVacacionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarVacacionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVacacionEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVacacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVacacionEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVacacionEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVacacionEmpleado;
	public JLabel jLabelIdVacacionEmpleado;
	public JLabel jLabelidVacacionEmpleado;
	public JButton jButtonidVacacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_vecesVacacionEmpleado;
	public JLabel jLabelnumero_vecesVacacionEmpleado;
	public JTextField jTextFieldnumero_vecesVacacionEmpleado;
	public JButton jButtonnumero_vecesVacacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_estimadaVacacionEmpleado;
	public JLabel jLabelfecha_estimadaVacacionEmpleado;
	//public JFormattedTextField jDateChooserfecha_estimadaVacacionEmpleado;

	public JDateChooser jDateChooserfecha_estimadaVacacionEmpleado;
	public JButton jButtonfecha_estimadaVacacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelhoras_vacacionesVacacionEmpleado;
	public JLabel jLabelhoras_vacacionesVacacionEmpleado;
	public JTextField jTextFieldhoras_vacacionesVacacionEmpleado;
	public JButton jButtonhoras_vacacionesVacacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelhoras_tomadosVacacionEmpleado;
	public JLabel jLabelhoras_tomadosVacacionEmpleado;
	public JTextField jTextFieldhoras_tomadosVacacionEmpleado;
	public JButton jButtonhoras_tomadosVacacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelhoras_pagadosVacacionEmpleado;
	public JLabel jLabelhoras_pagadosVacacionEmpleado;
	public JTextField jTextFieldhoras_pagadosVacacionEmpleado;
	public JButton jButtonhoras_pagadosVacacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelhoras_adicionalesVacacionEmpleado;
	public JLabel jLabelhoras_adicionalesVacacionEmpleado;
	public JTextField jTextFieldhoras_adicionalesVacacionEmpleado;
	public JButton jButtonhoras_adicionalesVacacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVacacionEmpleado;
	public JLabel jLabelid_empresaVacacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVacacionEmpleado;
	public JButton jButtonid_empresaVacacionEmpleado= new JButtonMe();
	public JButton jButtonid_empresaVacacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaVacacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoVacacionEmpleado;
	public JLabel jLabelid_empleadoVacacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoVacacionEmpleado;
	public JButton jButtonid_empleadoVacacionEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoVacacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoVacacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_anio_periodo1VacacionEmpleado;
	public JLabel jLabelid_anio_periodo1VacacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anio_periodo1VacacionEmpleado;
	public JButton jButtonid_anio_periodo1VacacionEmpleado= new JButtonMe();
	public JButton jButtonid_anio_periodo1VacacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anio_periodo1VacacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_anio_periodo2VacacionEmpleado;
	public JLabel jLabelid_anio_periodo2VacacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anio_periodo2VacacionEmpleado;
	public JButton jButtonid_anio_periodo2VacacionEmpleado= new JButtonMe();
	public JButton jButtonid_anio_periodo2VacacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anio_periodo2VacacionEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVacacionEmpleado;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VacacionEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVacacionEmpleado=new JPanel();
				this.jPanelAccionesFormularioVacacionEmpleado=new JPanel();
				this.jmenuBarDetalleVacacionEmpleado=new JMenuBar();
				this.jTtoolBarDetalleVacacionEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VacacionEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VacacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VacacionEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VacacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VacacionEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VacacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VacacionEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VacacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VacacionEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VacacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVacacionEmpleado() {
		return this.jButtonActualizarToolBarVacacionEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarVacacionEmpleado() {
		return this.jButtonEliminarToolBarVacacionEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarVacacionEmpleado() {
		return this.jButtonCancelarToolBarVacacionEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionVacacionEmpleado() {
		return this.jButtonProcesarInformacionVacacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVacacionEmpleado)	{
		this.jButtonProcesarInformacionVacacionEmpleado = jButtonProcesarInformacionVacacionEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVacacionEmpleado() {
		return this.jComboBoxTiposAccionesVacacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVacacionEmpleado(
			JComboBox jComboBoxTiposRelacionesVacacionEmpleado) {
		this.jComboBoxTiposRelacionesVacacionEmpleado = jComboBoxTiposRelacionesVacacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVacacionEmpleado(
			JComboBox jComboBoxTiposAccionesVacacionEmpleado) {
		this.jComboBoxTiposAccionesVacacionEmpleado = jComboBoxTiposAccionesVacacionEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVacacionEmpleado() {
		return this.jComboBoxTiposAccionesFormularioVacacionEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVacacionEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioVacacionEmpleado) {
		this.jComboBoxTiposAccionesFormularioVacacionEmpleado = jComboBoxTiposAccionesFormularioVacacionEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
		
		this.vacacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vacacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vacacionempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VacacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VacacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VacacionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vacacion Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		VacacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVacacionEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVacacionEmpleado=new JButtonMe();
				this.jButtonModificarToolBarVacacionEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVacacionEmpleado,this.jTtoolBarDetalleVacacionEmpleado,
							"actualizar","actualizar","Actualizar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVacacionEmpleado,this.jTtoolBarDetalleVacacionEmpleado,
							"eliminar","eliminar","Eliminar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVacacionEmpleado,this.jTtoolBarDetalleVacacionEmpleado,
							"cancelar","cancelar","Cancelar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVacacionEmpleado,this.jTtoolBarDetalleVacacionEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVacacionEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVacacionEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVacacionEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVacacionEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVacacionEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVacacionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVacacionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVacacionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVacacionEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVacacionEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVacacionEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVacacionEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVacacionEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVacacionEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVacacionEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVacacionEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVacacionEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVacacionEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVacacionEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVacacionEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVacacionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVacacionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVacacionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVacacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVacacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVacacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVacacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVacacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVacacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVacacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVacacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVacacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVacacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVacacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVacacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVacacionEmpleado.add(this.jMenuItemDetalleCerrarVacacionEmpleado);
		
		this.jmenuDetalleAccionesVacacionEmpleado.add(this.jMenuItemActualizarVacacionEmpleado);
		this.jmenuDetalleAccionesVacacionEmpleado.add(this.jMenuItemEliminarVacacionEmpleado);
		this.jmenuDetalleAccionesVacacionEmpleado.add(this.jMenuItemCancelarVacacionEmpleado);		
		
		//this.jmenuDetalleDatosVacacionEmpleado.add(this.jMenuItemDetalleAbrirOrderByVacacionEmpleado);				
		this.jmenuDetalleDatosVacacionEmpleado.add(this.jMenuItemDetalleMostarOcultarVacacionEmpleado);				
				
		//this.jmenuDetalleAccionesVacacionEmpleado.add(this.jMenuItemGuardarCambiosVacacionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVacacionEmpleado.add(this.jmenuDetalleArchivoVacacionEmpleado);		
		this.jmenuBarDetalleVacacionEmpleado.add(this.jmenuDetalleAccionesVacacionEmpleado);		
		this.jmenuBarDetalleVacacionEmpleado.add(this.jmenuDetalleDatosVacacionEmpleado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVacacionEmpleado);				
	}
	
	
	public void inicializarElementosCamposVacacionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVacacionEmpleado = new JLabelMe();
		jLabelIdVacacionEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVacacionEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVacacionEmpleado.setToolTipText(VacacionEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVacacionEmpleado= new GridBagLayout();

		this.jPanelidVacacionEmpleado.setLayout(this.gridaBagLayoutVacacionEmpleado);

		jLabelidVacacionEmpleado = new JLabel();
		jLabelidVacacionEmpleado.setText("Id");

		jLabelidVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_vecesVacacionEmpleado = new JLabelMe();
		this.jLabelnumero_vecesVacacionEmpleado.setText(""+VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES+" : *");
		this.jLabelnumero_vecesVacacionEmpleado.setToolTipText("Numero Veces");
		this.jLabelnumero_vecesVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_vecesVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_vecesVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_vecesVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_vecesVacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_vecesVacacionEmpleado.setToolTipText(VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES);
		this.gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		this.jPanelnumero_vecesVacacionEmpleado.setLayout(this.gridaBagLayoutVacacionEmpleado);


		jTextFieldnumero_vecesVacacionEmpleado= new JTextFieldMe();
		jTextFieldnumero_vecesVacacionEmpleado.setEnabled(false);
		jTextFieldnumero_vecesVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_vecesVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_vecesVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_vecesVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_vecesVacacionEmpleado.setText("0");

		this.jButtonnumero_vecesVacacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonnumero_vecesVacacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_vecesVacacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_vecesVacacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_vecesVacacionEmpleadoBusqueda.setText("U");
		this.jButtonnumero_vecesVacacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_vecesVacacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_vecesVacacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_vecesVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_vecesVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_vecesVacacionEmpleadoBusqueda"));

		if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_vecesVacacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_estimadaVacacionEmpleado = new JLabelMe();
		this.jLabelfecha_estimadaVacacionEmpleado.setText(""+VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA+" : *");
		this.jLabelfecha_estimadaVacacionEmpleado.setToolTipText("Fecha Estimada");
		this.jLabelfecha_estimadaVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_estimadaVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_estimadaVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_estimadaVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_estimadaVacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_estimadaVacacionEmpleado.setToolTipText(VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA);
		this.gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		this.jPanelfecha_estimadaVacacionEmpleado.setLayout(this.gridaBagLayoutVacacionEmpleado);


		//jFormattedTextFieldfecha_estimadaVacacionEmpleado= new JFormattedTextFieldMe();

		jDateChooserfecha_estimadaVacacionEmpleado= new JDateChooser();
		jDateChooserfecha_estimadaVacacionEmpleado.setEnabled(false);
		jDateChooserfecha_estimadaVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_estimadaVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_estimadaVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_estimadaVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_estimadaVacacionEmpleado.setDate(new Date());
		jDateChooserfecha_estimadaVacacionEmpleado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_estimadaVacacionEmpleado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_estimadaVacacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonfecha_estimadaVacacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_estimadaVacacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_estimadaVacacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_estimadaVacacionEmpleadoBusqueda.setText("U");
		this.jButtonfecha_estimadaVacacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_estimadaVacacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_estimadaVacacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_estimadaVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_estimadaVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_estimadaVacacionEmpleadoBusqueda"));

		if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_estimadaVacacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelhoras_vacacionesVacacionEmpleado = new JLabelMe();
		this.jLabelhoras_vacacionesVacacionEmpleado.setText(""+VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES+" : *");
		this.jLabelhoras_vacacionesVacacionEmpleado.setToolTipText("Horas Vacaciones");
		this.jLabelhoras_vacacionesVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhoras_vacacionesVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhoras_vacacionesVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_vacacionesVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_vacacionesVacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_vacacionesVacacionEmpleado.setToolTipText(VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES);
		this.gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		this.jPanelhoras_vacacionesVacacionEmpleado.setLayout(this.gridaBagLayoutVacacionEmpleado);


		jTextFieldhoras_vacacionesVacacionEmpleado= new JTextFieldMe();
		jTextFieldhoras_vacacionesVacacionEmpleado.setEnabled(false);
		jTextFieldhoras_vacacionesVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_vacacionesVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_vacacionesVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_vacacionesVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_vacacionesVacacionEmpleado.setText("0.0");

		this.jButtonhoras_vacacionesVacacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonhoras_vacacionesVacacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_vacacionesVacacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_vacacionesVacacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_vacacionesVacacionEmpleadoBusqueda.setText("U");
		this.jButtonhoras_vacacionesVacacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_vacacionesVacacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_vacacionesVacacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_vacacionesVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_vacacionesVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_vacacionesVacacionEmpleadoBusqueda"));

		if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_vacacionesVacacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelhoras_tomadosVacacionEmpleado = new JLabelMe();
		this.jLabelhoras_tomadosVacacionEmpleado.setText(""+VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS+" : *");
		this.jLabelhoras_tomadosVacacionEmpleado.setToolTipText("Horas Tomados");
		this.jLabelhoras_tomadosVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_tomadosVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_tomadosVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_tomadosVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_tomadosVacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_tomadosVacacionEmpleado.setToolTipText(VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS);
		this.gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		this.jPanelhoras_tomadosVacacionEmpleado.setLayout(this.gridaBagLayoutVacacionEmpleado);


		jTextFieldhoras_tomadosVacacionEmpleado= new JTextFieldMe();
		jTextFieldhoras_tomadosVacacionEmpleado.setEnabled(false);
		jTextFieldhoras_tomadosVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_tomadosVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_tomadosVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_tomadosVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_tomadosVacacionEmpleado.setText("0.0");

		this.jButtonhoras_tomadosVacacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonhoras_tomadosVacacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_tomadosVacacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_tomadosVacacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_tomadosVacacionEmpleadoBusqueda.setText("U");
		this.jButtonhoras_tomadosVacacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_tomadosVacacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_tomadosVacacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_tomadosVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_tomadosVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_tomadosVacacionEmpleadoBusqueda"));

		if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_tomadosVacacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelhoras_pagadosVacacionEmpleado = new JLabelMe();
		this.jLabelhoras_pagadosVacacionEmpleado.setText(""+VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS+" : *");
		this.jLabelhoras_pagadosVacacionEmpleado.setToolTipText("Horas Pagados");
		this.jLabelhoras_pagadosVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_pagadosVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_pagadosVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_pagadosVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_pagadosVacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_pagadosVacacionEmpleado.setToolTipText(VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS);
		this.gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		this.jPanelhoras_pagadosVacacionEmpleado.setLayout(this.gridaBagLayoutVacacionEmpleado);


		jTextFieldhoras_pagadosVacacionEmpleado= new JTextFieldMe();
		jTextFieldhoras_pagadosVacacionEmpleado.setEnabled(false);
		jTextFieldhoras_pagadosVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_pagadosVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_pagadosVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_pagadosVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_pagadosVacacionEmpleado.setText("0.0");

		this.jButtonhoras_pagadosVacacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonhoras_pagadosVacacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_pagadosVacacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_pagadosVacacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_pagadosVacacionEmpleadoBusqueda.setText("U");
		this.jButtonhoras_pagadosVacacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_pagadosVacacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_pagadosVacacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_pagadosVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_pagadosVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_pagadosVacacionEmpleadoBusqueda"));

		if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_pagadosVacacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelhoras_adicionalesVacacionEmpleado = new JLabelMe();
		this.jLabelhoras_adicionalesVacacionEmpleado.setText(""+VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES+" : *");
		this.jLabelhoras_adicionalesVacacionEmpleado.setToolTipText("Horas Adicionales");
		this.jLabelhoras_adicionalesVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhoras_adicionalesVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhoras_adicionalesVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_adicionalesVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_adicionalesVacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_adicionalesVacacionEmpleado.setToolTipText(VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES);
		this.gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		this.jPanelhoras_adicionalesVacacionEmpleado.setLayout(this.gridaBagLayoutVacacionEmpleado);


		jTextFieldhoras_adicionalesVacacionEmpleado= new JTextFieldMe();
		jTextFieldhoras_adicionalesVacacionEmpleado.setEnabled(false);
		jTextFieldhoras_adicionalesVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_adicionalesVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_adicionalesVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_adicionalesVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_adicionalesVacacionEmpleado.setText("0.0");

		this.jButtonhoras_adicionalesVacacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonhoras_adicionalesVacacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_adicionalesVacacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_adicionalesVacacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_adicionalesVacacionEmpleadoBusqueda.setText("U");
		this.jButtonhoras_adicionalesVacacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_adicionalesVacacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_adicionalesVacacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_adicionalesVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_adicionalesVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_adicionalesVacacionEmpleadoBusqueda"));

		if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_adicionalesVacacionEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVacacionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVacacionEmpleado = new JLabelMe();
		this.jLabelid_empresaVacacionEmpleado.setText(""+VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVacacionEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVacacionEmpleado.setToolTipText(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		this.jPanelid_empresaVacacionEmpleado.setLayout(this.gridaBagLayoutVacacionEmpleado);


		jComboBoxid_empresaVacacionEmpleado= new JComboBoxMe();
		jComboBoxid_empresaVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVacacionEmpleado.setEnabled(false);

		this.jButtonid_empresaVacacionEmpleado= new JButtonMe();
		this.jButtonid_empresaVacacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVacacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVacacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVacacionEmpleado.setText("Buscar");
		this.jButtonid_empresaVacacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVacacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVacacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVacacionEmpleado"));

		this.jButtonid_empresaVacacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaVacacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVacacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVacacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVacacionEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaVacacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVacacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVacacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVacacionEmpleadoBusqueda"));

		if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVacacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaVacacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaVacacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVacacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVacacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVacacionEmpleadoUpdate.setText("U");
		this.jButtonid_empresaVacacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVacacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVacacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVacacionEmpleadoUpdate"));



					
		this.jLabelid_empleadoVacacionEmpleado = new JLabelMe();
		this.jLabelid_empleadoVacacionEmpleado.setText(""+VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoVacacionEmpleado.setToolTipText("Empleado");
		this.jLabelid_empleadoVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoVacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoVacacionEmpleado.setToolTipText(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		this.jPanelid_empleadoVacacionEmpleado.setLayout(this.gridaBagLayoutVacacionEmpleado);


		jComboBoxid_empleadoVacacionEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoVacacionEmpleado= new JButtonMe();
		this.jButtonid_empleadoVacacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoVacacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoVacacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoVacacionEmpleado.setText("Buscar");
		this.jButtonid_empleadoVacacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoVacacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoVacacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoVacacionEmpleado"));

		this.jButtonid_empleadoVacacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empleadoVacacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVacacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVacacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoVacacionEmpleadoBusqueda.setText("U");
		this.jButtonid_empleadoVacacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoVacacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoVacacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoVacacionEmpleadoBusqueda"));

		if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoVacacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoVacacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empleadoVacacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVacacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVacacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoVacacionEmpleadoUpdate.setText("U");
		this.jButtonid_empleadoVacacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoVacacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoVacacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoVacacionEmpleadoUpdate"));



					
		this.jLabelid_anio_periodo1VacacionEmpleado = new JLabelMe();
		this.jLabelid_anio_periodo1VacacionEmpleado.setText(""+VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1+" : *");
		this.jLabelid_anio_periodo1VacacionEmpleado.setToolTipText("Anio Periodo1");
		this.jLabelid_anio_periodo1VacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anio_periodo1VacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anio_periodo1VacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anio_periodo1VacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anio_periodo1VacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anio_periodo1VacacionEmpleado.setToolTipText(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1);
		this.gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		this.jPanelid_anio_periodo1VacacionEmpleado.setLayout(this.gridaBagLayoutVacacionEmpleado);


		jComboBoxid_anio_periodo1VacacionEmpleado= new JComboBoxMe();
		jComboBoxid_anio_periodo1VacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_periodo1VacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_periodo1VacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anio_periodo1VacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anio_periodo1VacacionEmpleado= new JButtonMe();
		this.jButtonid_anio_periodo1VacacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_periodo1VacacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_periodo1VacacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_periodo1VacacionEmpleado.setText("Buscar");
		this.jButtonid_anio_periodo1VacacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anio_periodo1VacacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_periodo1VacacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anio_periodo1VacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_periodo1VacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_periodo1VacacionEmpleado"));

		this.jButtonid_anio_periodo1VacacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_anio_periodo1VacacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_periodo1VacacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_periodo1VacacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anio_periodo1VacacionEmpleadoBusqueda.setText("U");
		this.jButtonid_anio_periodo1VacacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anio_periodo1VacacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_periodo1VacacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anio_periodo1VacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_periodo1VacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_periodo1VacacionEmpleadoBusqueda"));

		if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anio_periodo1VacacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_anio_periodo1VacacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_anio_periodo1VacacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_periodo1VacacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_periodo1VacacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anio_periodo1VacacionEmpleadoUpdate.setText("U");
		this.jButtonid_anio_periodo1VacacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anio_periodo1VacacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_periodo1VacacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anio_periodo1VacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_periodo1VacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_periodo1VacacionEmpleadoUpdate"));



					
		this.jLabelid_anio_periodo2VacacionEmpleado = new JLabelMe();
		this.jLabelid_anio_periodo2VacacionEmpleado.setText(""+VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2+" : *");
		this.jLabelid_anio_periodo2VacacionEmpleado.setToolTipText("Anio Periodo2");
		this.jLabelid_anio_periodo2VacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anio_periodo2VacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anio_periodo2VacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anio_periodo2VacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anio_periodo2VacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anio_periodo2VacacionEmpleado.setToolTipText(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2);
		this.gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		this.jPanelid_anio_periodo2VacacionEmpleado.setLayout(this.gridaBagLayoutVacacionEmpleado);


		jComboBoxid_anio_periodo2VacacionEmpleado= new JComboBoxMe();
		jComboBoxid_anio_periodo2VacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_periodo2VacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_periodo2VacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anio_periodo2VacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anio_periodo2VacacionEmpleado= new JButtonMe();
		this.jButtonid_anio_periodo2VacacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_periodo2VacacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_periodo2VacacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anio_periodo2VacacionEmpleado.setText("Buscar");
		this.jButtonid_anio_periodo2VacacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anio_periodo2VacacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_periodo2VacacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anio_periodo2VacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_periodo2VacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_periodo2VacacionEmpleado"));

		this.jButtonid_anio_periodo2VacacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_anio_periodo2VacacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_periodo2VacacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_periodo2VacacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anio_periodo2VacacionEmpleadoBusqueda.setText("U");
		this.jButtonid_anio_periodo2VacacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anio_periodo2VacacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_periodo2VacacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anio_periodo2VacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_periodo2VacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_periodo2VacacionEmpleadoBusqueda"));

		if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anio_periodo2VacacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_anio_periodo2VacacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_anio_periodo2VacacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_periodo2VacacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anio_periodo2VacacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anio_periodo2VacacionEmpleadoUpdate.setText("U");
		this.jButtonid_anio_periodo2VacacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anio_periodo2VacacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anio_periodo2VacacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anio_periodo2VacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anio_periodo2VacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anio_periodo2VacacionEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleVacacionEmpleado = new VacacionEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Vacacion Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVacacionEmpleado= new GridBagLayout();
		

		
		String sToolTipVacacionEmpleado="";
		sToolTipVacacionEmpleado=VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVacacionEmpleado+="(Nomina.VacacionEmpleado)";
		}
		
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipVacacionEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVacacionEmpleado = new JButtonMe();
		this.jButtonModificarVacacionEmpleado = new JButtonMe();
        this.jButtonActualizarVacacionEmpleado = new JButtonMe();
        this.jButtonEliminarVacacionEmpleado = new JButtonMe();
        this.jButtonCancelarVacacionEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosVacacionEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaVacacionEmpleado = new JButtonMe();
		this.jButtonCerrarVacacionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosVacacionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionVacacionEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralVacacionEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Vacacion Empleado";
		
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vacacion Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosVacacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVacacionEmpleado.setName("jPanelCamposVacacionEmpleado"); 

		this.jPanelCamposOcultosVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVacacionEmpleado.setName("jPanelCamposOcultosVacacionEmpleado"); 

        this.jPanelAccionesVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVacacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesVacacionEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVacacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVacacionEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVacacionEmpleado.setText("Nuevo");
		this.jButtonModificarVacacionEmpleado.setText("Editar");
        this.jButtonActualizarVacacionEmpleado.setText("Actualizar");
        this.jButtonEliminarVacacionEmpleado.setText("Eliminar");
        this.jButtonCancelarVacacionEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosVacacionEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaVacacionEmpleado.setText("Guardar");
		this.jButtonCerrarVacacionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVacacionEmpleado,"nuevo_button","Nuevo",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVacacionEmpleado,"modificar_button","Editar",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVacacionEmpleado,"actualizar_button","Actualizar",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVacacionEmpleado,"eliminar_button","Eliminar",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVacacionEmpleado,"cancelar_button","Cancelar",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVacacionEmpleado,"guardarcambios_button","Guardar",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVacacionEmpleado,"guardarcambiostabla_button","Guardar",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVacacionEmpleado,"cerrar_button","Salir",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVacacionEmpleado.setToolTipText("Nuevo"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVacacionEmpleado.setToolTipText("Editar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVacacionEmpleado.setToolTipText("Actualizar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVacacionEmpleado.setToolTipText("Eliminar)"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVacacionEmpleado.setToolTipText("Cancelar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVacacionEmpleado.setToolTipText("Guardar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVacacionEmpleado.setToolTipText("Guardar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVacacionEmpleado.setToolTipText("Salir"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVacacionEmpleado";
		inputMap = this.jButtonNuevoVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVacacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVacacionEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVacacionEmpleado";
		inputMap = this.jButtonActualizarVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVacacionEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarVacacionEmpleado";
		inputMap = this.jButtonEliminarVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVacacionEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarVacacionEmpleado";
		inputMap = this.jButtonCancelarVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVacacionEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarVacacionEmpleado";
		inputMap = this.jButtonCerrarVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVacacionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVacacionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVacacionEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVacacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVacacionEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVacacionEmpleado.setToolTipText("Nuevo VacacionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVacacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVacacionEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVacacionEmpleado.setToolTipText("Sin Cerrar Ventana VacacionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVacacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVacacionEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVacacionEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVacacionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesVacacionEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVacacionEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVacacionEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVacacionEmpleado = new JLabelMe();
		
		this.jLabelAccionesVacacionEmpleado.setText("Acciones");		
		this.jLabelAccionesVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVacacionEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVacacionEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVacacionEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVacacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVacacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVacacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVacacionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVacacionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVacacionEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVacacionEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVacacionEmpleado = new GridBagLayout();
		
		this.jPanelCamposVacacionEmpleado.setLayout(gridaBagLayoutCamposVacacionEmpleado);
		this.jPanelCamposOcultosVacacionEmpleado.setLayout(gridaBagLayoutCamposOcultosVacacionEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVacacionEmpleado.add(jLabelIdVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 1;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVacacionEmpleado.add(jLabelidVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVacacionEmpleado.add(jLabelid_empresaVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 2;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVacacionEmpleado.add(jButtonid_empresaVacacionEmpleadoBusqueda, this.gridBagConstraintsVacacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 3;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVacacionEmpleado.add(jButtonid_empresaVacacionEmpleadoUpdate, this.gridBagConstraintsVacacionEmpleado);
	}

	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 1;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVacacionEmpleado.add(jComboBoxid_empresaVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoVacacionEmpleado.add(jLabelid_empleadoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 2;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoVacacionEmpleado.add(jButtonid_empleadoVacacionEmpleadoBusqueda, this.gridBagConstraintsVacacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 3;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoVacacionEmpleado.add(jButtonid_empleadoVacacionEmpleadoUpdate, this.gridBagConstraintsVacacionEmpleado);
	}

	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 1;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoVacacionEmpleado.add(jComboBoxid_empleadoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anio_periodo1VacacionEmpleado.add(jLabelid_anio_periodo1VacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 2;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anio_periodo1VacacionEmpleado.add(jButtonid_anio_periodo1VacacionEmpleadoBusqueda, this.gridBagConstraintsVacacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 3;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anio_periodo1VacacionEmpleado.add(jButtonid_anio_periodo1VacacionEmpleadoUpdate, this.gridBagConstraintsVacacionEmpleado);
	}

	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 1;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anio_periodo1VacacionEmpleado.add(jComboBoxid_anio_periodo1VacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anio_periodo2VacacionEmpleado.add(jLabelid_anio_periodo2VacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 2;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anio_periodo2VacacionEmpleado.add(jButtonid_anio_periodo2VacacionEmpleadoBusqueda, this.gridBagConstraintsVacacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 3;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anio_periodo2VacacionEmpleado.add(jButtonid_anio_periodo2VacacionEmpleadoUpdate, this.gridBagConstraintsVacacionEmpleado);
	}

	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 1;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anio_periodo2VacacionEmpleado.add(jComboBoxid_anio_periodo2VacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_vecesVacacionEmpleado.add(jLabelnumero_vecesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 2;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_vecesVacacionEmpleado.add(jButtonnumero_vecesVacacionEmpleadoBusqueda, this.gridBagConstraintsVacacionEmpleado);
	}

	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 1;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_vecesVacacionEmpleado.add(jTextFieldnumero_vecesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_estimadaVacacionEmpleado.add(jLabelfecha_estimadaVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 2;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_estimadaVacacionEmpleado.add(jButtonfecha_estimadaVacacionEmpleadoBusqueda, this.gridBagConstraintsVacacionEmpleado);
	}

	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 1;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_estimadaVacacionEmpleado.add(jDateChooserfecha_estimadaVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_vacacionesVacacionEmpleado.add(jLabelhoras_vacacionesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 2;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_vacacionesVacacionEmpleado.add(jButtonhoras_vacacionesVacacionEmpleadoBusqueda, this.gridBagConstraintsVacacionEmpleado);
	}

	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 1;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_vacacionesVacacionEmpleado.add(jTextFieldhoras_vacacionesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_tomadosVacacionEmpleado.add(jLabelhoras_tomadosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 2;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_tomadosVacacionEmpleado.add(jButtonhoras_tomadosVacacionEmpleadoBusqueda, this.gridBagConstraintsVacacionEmpleado);
	}

	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 1;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_tomadosVacacionEmpleado.add(jTextFieldhoras_tomadosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_pagadosVacacionEmpleado.add(jLabelhoras_pagadosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 2;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_pagadosVacacionEmpleado.add(jButtonhoras_pagadosVacacionEmpleadoBusqueda, this.gridBagConstraintsVacacionEmpleado);
	}

	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 1;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_pagadosVacacionEmpleado.add(jTextFieldhoras_pagadosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_adicionalesVacacionEmpleado.add(jLabelhoras_adicionalesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 2;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
		this.gridBagConstraintsVacacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_adicionalesVacacionEmpleado.add(jButtonhoras_adicionalesVacacionEmpleadoBusqueda, this.gridBagConstraintsVacacionEmpleado);
	}

	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVacacionEmpleado.gridy = 0;
	this.gridBagConstraintsVacacionEmpleado.gridx = 1;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_adicionalesVacacionEmpleado.add(jTextFieldhoras_adicionalesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVacacionEmpleado.gridy = iYPanelCamposVacacionEmpleado;
	this.gridBagConstraintsVacacionEmpleado.gridx = iXPanelCamposVacacionEmpleado++;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVacacionEmpleado.add(this.jPanelidVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(iXPanelCamposVacacionEmpleado % 1==0) {
		iXPanelCamposVacacionEmpleado=0;
		iYPanelCamposVacacionEmpleado++;
	}
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVacacionEmpleado.gridy = iYPanelCamposVacacionEmpleado;
	this.gridBagConstraintsVacacionEmpleado.gridx = iXPanelCamposVacacionEmpleado++;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVacacionEmpleado.add(this.jPanelid_empleadoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(iXPanelCamposVacacionEmpleado % 1==0) {
		iXPanelCamposVacacionEmpleado=0;
		iYPanelCamposVacacionEmpleado++;
	}
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVacacionEmpleado.gridy = iYPanelCamposVacacionEmpleado;
	this.gridBagConstraintsVacacionEmpleado.gridx = iXPanelCamposVacacionEmpleado++;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVacacionEmpleado.add(this.jPanelid_anio_periodo1VacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(iXPanelCamposVacacionEmpleado % 1==0) {
		iXPanelCamposVacacionEmpleado=0;
		iYPanelCamposVacacionEmpleado++;
	}
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVacacionEmpleado.gridy = iYPanelCamposVacacionEmpleado;
	this.gridBagConstraintsVacacionEmpleado.gridx = iXPanelCamposVacacionEmpleado++;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVacacionEmpleado.add(this.jPanelid_anio_periodo2VacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(iXPanelCamposVacacionEmpleado % 1==0) {
		iXPanelCamposVacacionEmpleado=0;
		iYPanelCamposVacacionEmpleado++;
	}
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVacacionEmpleado.gridy = iYPanelCamposVacacionEmpleado;
	this.gridBagConstraintsVacacionEmpleado.gridx = iXPanelCamposVacacionEmpleado++;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVacacionEmpleado.add(this.jPanelnumero_vecesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(iXPanelCamposVacacionEmpleado % 1==0) {
		iXPanelCamposVacacionEmpleado=0;
		iYPanelCamposVacacionEmpleado++;
	}
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVacacionEmpleado.gridy = iYPanelCamposVacacionEmpleado;
	this.gridBagConstraintsVacacionEmpleado.gridx = iXPanelCamposVacacionEmpleado++;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVacacionEmpleado.add(this.jPanelfecha_estimadaVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(iXPanelCamposVacacionEmpleado % 1==0) {
		iXPanelCamposVacacionEmpleado=0;
		iYPanelCamposVacacionEmpleado++;
	}
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVacacionEmpleado.gridy = iYPanelCamposVacacionEmpleado;
	this.gridBagConstraintsVacacionEmpleado.gridx = iXPanelCamposVacacionEmpleado++;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVacacionEmpleado.add(this.jPanelhoras_vacacionesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(iXPanelCamposVacacionEmpleado % 1==0) {
		iXPanelCamposVacacionEmpleado=0;
		iYPanelCamposVacacionEmpleado++;
	}
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVacacionEmpleado.gridy = iYPanelCamposVacacionEmpleado;
	this.gridBagConstraintsVacacionEmpleado.gridx = iXPanelCamposVacacionEmpleado++;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVacacionEmpleado.add(this.jPanelhoras_tomadosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(iXPanelCamposVacacionEmpleado % 1==0) {
		iXPanelCamposVacacionEmpleado=0;
		iYPanelCamposVacacionEmpleado++;
	}
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVacacionEmpleado.gridy = iYPanelCamposVacacionEmpleado;
	this.gridBagConstraintsVacacionEmpleado.gridx = iXPanelCamposVacacionEmpleado++;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVacacionEmpleado.add(this.jPanelhoras_pagadosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(iXPanelCamposVacacionEmpleado % 1==0) {
		iXPanelCamposVacacionEmpleado=0;
		iYPanelCamposVacacionEmpleado++;
	}
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVacacionEmpleado.gridy = iYPanelCamposVacacionEmpleado;
	this.gridBagConstraintsVacacionEmpleado.gridx = iXPanelCamposVacacionEmpleado++;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVacacionEmpleado.add(this.jPanelhoras_adicionalesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(iXPanelCamposVacacionEmpleado % 1==0) {
		iXPanelCamposVacacionEmpleado=0;
		iYPanelCamposVacacionEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVacacionEmpleado.gridy = iYPanelCamposOcultosVacacionEmpleado;
	this.gridBagConstraintsVacacionEmpleado.gridx = iXPanelCamposOcultosVacacionEmpleado++;
	this.gridBagConstraintsVacacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVacacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVacacionEmpleado.add(this.jPanelid_empresaVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);



	if(iXPanelCamposOcultosVacacionEmpleado % 1==0) {
		iXPanelCamposOcultosVacacionEmpleado=0;
		iYPanelCamposOcultosVacacionEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesVacacionEmpleado= new GridBagLayout();
		this.jPanelAccionesVacacionEmpleado.setLayout(gridaBagLayoutAccionesVacacionEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVacacionEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioVacacionEmpleado.setLayout(gridaBagLayoutAccionesFormularioVacacionEmpleado);
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVacacionEmpleado.add(this.jComboBoxTiposAccionesFormularioVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVacacionEmpleado.add(this.jCheckBoxPostAccionNuevoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVacacionEmpleado.add(this.jCheckBoxPostAccionSinCerrarVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVacacionEmpleado.add(this.jCheckBoxPostAccionSinMensajeVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesVacacionEmpleado.add(this.jButtonModificarVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);							

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesVacacionEmpleado.add(this.jButtonEliminarVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
			
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesVacacionEmpleado.add(this.jButtonActualizarVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesVacacionEmpleado.add(this.jButtonGuardarCambiosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);	
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;		
		this.gridBagConstraintsVacacionEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesVacacionEmpleado.add(this.jButtonCancelarVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVacacionEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVacacionEmpleado.gridx = 0;		
			//this.gridBagConstraintsVacacionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVacacionEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVacacionEmpleado.gridx =0;
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVacacionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VacacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVacacionEmpleado = new VacacionEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Vacacion Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Vacacion Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vacacion Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VacacionEmpleadoModel vacacionempleadoModel=new VacacionEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//VacacionEmpleadoModel.VacacionEmpleadoFocusTraversalPolicy vacacionempleadoFocusTraversalPolicy = vacacionempleadoModel.new VacacionEmpleadoFocusTraversalPolicy(this);
			
			//vacacionempleadoFocusTraversalPolicy.setvacacionempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(vacacionempleadoModel);
			
			
			this.jContentPaneDetalleVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVacacionEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleVacacionEmpleado.setLayout(gridaBagLayoutDetalleVacacionEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVacacionEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsVacacionEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVacacionEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleVacacionEmpleado.add(jTtoolBarDetalleVacacionEmpleado, gridBagConstraintsVacacionEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionVacacionEmpleado=   new JScrollPane(jContentPaneDetalleVacacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVacacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVacacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVacacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVacacionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVacacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVacacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVacacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVacacionEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleVacacionEmpleado.add(jPanelCamposVacacionEmpleado, gridBagConstraintsVacacionEmpleado);
			
			
			
			
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
						&& vacacionempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.vacacionempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVacacionEmpleado= new GridBagConstraints();
						this.gridBagConstraintsVacacionEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVacacionEmpleado.gridx = 0;
						this.jContentPaneDetalleVacacionEmpleado.add(this.jTabbedPaneRelacionesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVacacionEmpleado.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVacacionEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
					this.gridBagConstraintsVacacionEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVacacionEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVacacionEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleVacacionEmpleado.add(jPanelCamposOcultosVacacionEmpleado, gridBagConstraintsVacacionEmpleado);
				
					this.jPanelCamposOcultosVacacionEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	        this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVacacionEmpleado.add(this.jPanelAccionesFormularioVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);							
			
			
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsVacacionEmpleado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVacacionEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleVacacionEmpleado.add(this.jPanelAccionesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVacacionEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVacacionEmpleado=   new JScrollPane(this.jPanelCamposVacacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVacacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVacacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVacacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVacacionEmpleado.gridx = 0;
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVacacionEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVacacionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);			
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVacacionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVacacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			
			
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVacacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
			
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVacacionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVacacionEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionVacacionEmpleado;
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
