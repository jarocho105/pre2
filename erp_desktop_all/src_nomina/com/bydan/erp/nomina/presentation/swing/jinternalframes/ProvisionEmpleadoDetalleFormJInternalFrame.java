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
import com.bydan.erp.nomina.util.ProvisionEmpleadoConstantesFunciones;

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
public class ProvisionEmpleadoDetalleFormJInternalFrame extends ProvisionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProvisionEmpleado;
	
	protected JMenuBar jmenuBarDetalleProvisionEmpleado;
	
	protected JMenu jmenuDetalleProvisionEmpleado;
	protected JMenu jmenuDetalleArchivoProvisionEmpleado;
	protected JMenu jmenuDetalleAccionesProvisionEmpleado;
	protected JMenu jmenuDetalleDatosProvisionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProvisionEmpleado;	
	protected GridBagConstraints gridBagConstraintsProvisionEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProvisionEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleProvisionEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected TipoProvisionEmpleadoBeanSwingJInternalFrame tipoprovisionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprovisionempleado="";

	protected DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_defiprovisionempleado="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public ProvisionEmpleadoSessionBean provisionempleadoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public TipoProvisionEmpleadoSessionBean tipoprovisionempleadoSessionBean;
	public DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public ProvisionEmpleadoLogic provisionempleadoLogic;
	
	public JScrollPane jScrollPanelDatosProvisionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionProvisionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralProvisionEmpleado;
	
	protected JPanel jPanelCamposProvisionEmpleado;    
	protected JPanel jPanelCamposOcultosProvisionEmpleado;    	
	protected JPanel jPanelAccionesProvisionEmpleado;
	protected JPanel jPanelAccionesFormularioProvisionEmpleado;
    
	
	
	protected Integer iXPanelCamposProvisionEmpleado=0;
	protected Integer iYPanelCamposProvisionEmpleado=0;
	
	protected Integer iXPanelCamposOcultosProvisionEmpleado=0;
	protected Integer iYPanelCamposOcultosProvisionEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProvisionEmpleado;
	public JButton jButtonModificarProvisionEmpleado;
	public JButton jButtonActualizarProvisionEmpleado;
    public JButton jButtonEliminarProvisionEmpleado;
	public JButton jButtonCancelarProvisionEmpleado;
    public JButton jButtonGuardarCambiosProvisionEmpleado;
	public JButton jButtonGuardarCambiosTablaProvisionEmpleado;
	protected JButton jButtonCerrarProvisionEmpleado;
	
	
	protected JButton jButtonProcesarInformacionProvisionEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProvisionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProvisionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProvisionEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProvisionEmpleado;
	protected JButton jButtonModificarToolBarProvisionEmpleado;
	protected JButton jButtonActualizarToolBarProvisionEmpleado;
    protected JButton jButtonEliminarToolBarProvisionEmpleado;
	protected JButton jButtonCancelarToolBarProvisionEmpleado;
    protected JButton jButtonGuardarCambiosToolBarProvisionEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarProvisionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarProvisionEmpleado;
	protected JButton jButtonCerrarToolBarProvisionEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarProvisionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProvisionEmpleado;
	protected JMenuItem jMenuItemModificarProvisionEmpleado;
	protected JMenuItem jMenuItemActualizarProvisionEmpleado;
    protected JMenuItem jMenuItemEliminarProvisionEmpleado;
	protected JMenuItem jMenuItemCancelarProvisionEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosProvisionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaProvisionEmpleado;
	protected JMenuItem jMenuItemCerrarProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarProvisionEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionProvisionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProvisionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarProvisionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProvisionEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProvisionEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProvisionEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProvisionEmpleado;
	public JLabel jLabelIdProvisionEmpleado;
	public JLabel jLabelidProvisionEmpleado;
	public JButton jButtonidProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelfechaProvisionEmpleado;
	public JLabel jLabelfechaProvisionEmpleado;
	//public JFormattedTextField jDateChooserfechaProvisionEmpleado;

	public JDateChooser jDateChooserfechaProvisionEmpleado;
	public JButton jButtonfechaProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_liquidacionProvisionEmpleado;
	public JLabel jLabelfecha_liquidacionProvisionEmpleado;
	//public JFormattedTextField jDateChooserfecha_liquidacionProvisionEmpleado;

	public JDateChooser jDateChooserfecha_liquidacionProvisionEmpleado;
	public JButton jButtonfecha_liquidacionProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_mesProvisionEmpleado;
	public JLabel jLabelvalor_mesProvisionEmpleado;
	public JTextField jTextFieldvalor_mesProvisionEmpleado;
	public JButton jButtonvalor_mesProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_pagaProvisionEmpleado;
	public JLabel jLabelvalor_pagaProvisionEmpleado;
	public JTextField jTextFieldvalor_pagaProvisionEmpleado;
	public JButton jButtonvalor_pagaProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_vacacionProvisionEmpleado;
	public JLabel jLabelvalor_vacacionProvisionEmpleado;
	public JTextField jTextFieldvalor_vacacionProvisionEmpleado;
	public JButton jButtonvalor_vacacionProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_liquidacionProvisionEmpleado;
	public JLabel jLabelvalor_liquidacionProvisionEmpleado;
	public JTextField jTextFieldvalor_liquidacionProvisionEmpleado;
	public JButton jButtonvalor_liquidacionProvisionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProvisionEmpleado;
	public JLabel jLabelid_empresaProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProvisionEmpleado;
	public JButton jButtonid_empresaProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_empresaProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoProvisionEmpleado;
	public JLabel jLabelid_empleadoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoProvisionEmpleado;
	public JButton jButtonid_empleadoProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraProvisionEmpleado;
	public JLabel jLabelid_estructuraProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraProvisionEmpleado;
	public JButton jButtonid_estructuraProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_estructuraProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estructuraProvisionEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraProvisionEmpleadoArbol= new JButtonMe();

	public JPanel jPanelid_tipo_provision_empleadoProvisionEmpleado;
	public JLabel jLabelid_tipo_provision_empleadoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_provision_empleadoProvisionEmpleado;
	public JButton jButtonid_tipo_provision_empleadoProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_defi_provision_empleadoProvisionEmpleado;
	public JLabel jLabelid_defi_provision_empleadoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_defi_provision_empleadoProvisionEmpleado;
	public JButton jButtonid_defi_provision_empleadoProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioProvisionEmpleado;
	public JLabel jLabelid_anioProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioProvisionEmpleado;
	public JButton jButtonid_anioProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_anioProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anioProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesProvisionEmpleado;
	public JLabel jLabelid_mesProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesProvisionEmpleado;
	public JButton jButtonid_mesProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_mesProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_mesProvisionEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProvisionEmpleado;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProvisionEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProvisionEmpleado=new JPanel();
				this.jPanelAccionesFormularioProvisionEmpleado=new JPanel();
				this.jmenuBarDetalleProvisionEmpleado=new JMenuBar();
				this.jTtoolBarDetalleProvisionEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvisionEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProvisionEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvisionEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvisionEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvisionEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProvisionEmpleado() {
		return this.jButtonActualizarToolBarProvisionEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarProvisionEmpleado() {
		return this.jButtonEliminarToolBarProvisionEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarProvisionEmpleado() {
		return this.jButtonCancelarToolBarProvisionEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionProvisionEmpleado() {
		return this.jButtonProcesarInformacionProvisionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProvisionEmpleado)	{
		this.jButtonProcesarInformacionProvisionEmpleado = jButtonProcesarInformacionProvisionEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProvisionEmpleado() {
		return this.jComboBoxTiposAccionesProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProvisionEmpleado(
			JComboBox jComboBoxTiposRelacionesProvisionEmpleado) {
		this.jComboBoxTiposRelacionesProvisionEmpleado = jComboBoxTiposRelacionesProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProvisionEmpleado(
			JComboBox jComboBoxTiposAccionesProvisionEmpleado) {
		this.jComboBoxTiposAccionesProvisionEmpleado = jComboBoxTiposAccionesProvisionEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProvisionEmpleado() {
		return this.jComboBoxTiposAccionesFormularioProvisionEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProvisionEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioProvisionEmpleado) {
		this.jComboBoxTiposAccionesFormularioProvisionEmpleado = jComboBoxTiposAccionesFormularioProvisionEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		
		this.provisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.provisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.provisionempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProvisionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Provision Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProvisionEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProvisionEmpleado=new JButtonMe();
				this.jButtonModificarToolBarProvisionEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProvisionEmpleado,this.jTtoolBarDetalleProvisionEmpleado,
							"actualizar","actualizar","Actualizar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProvisionEmpleado,this.jTtoolBarDetalleProvisionEmpleado,
							"eliminar","eliminar","Eliminar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProvisionEmpleado,this.jTtoolBarDetalleProvisionEmpleado,
							"cancelar","cancelar","Cancelar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProvisionEmpleado,this.jTtoolBarDetalleProvisionEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProvisionEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProvisionEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProvisionEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProvisionEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProvisionEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProvisionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProvisionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProvisionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProvisionEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProvisionEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProvisionEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProvisionEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProvisionEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProvisionEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProvisionEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProvisionEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProvisionEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProvisionEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProvisionEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProvisionEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProvisionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProvisionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProvisionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProvisionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProvisionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProvisionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProvisionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProvisionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProvisionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProvisionEmpleado.add(this.jMenuItemDetalleCerrarProvisionEmpleado);
		
		this.jmenuDetalleAccionesProvisionEmpleado.add(this.jMenuItemActualizarProvisionEmpleado);
		this.jmenuDetalleAccionesProvisionEmpleado.add(this.jMenuItemEliminarProvisionEmpleado);
		this.jmenuDetalleAccionesProvisionEmpleado.add(this.jMenuItemCancelarProvisionEmpleado);		
		
		//this.jmenuDetalleDatosProvisionEmpleado.add(this.jMenuItemDetalleAbrirOrderByProvisionEmpleado);				
		this.jmenuDetalleDatosProvisionEmpleado.add(this.jMenuItemDetalleMostarOcultarProvisionEmpleado);				
				
		//this.jmenuDetalleAccionesProvisionEmpleado.add(this.jMenuItemGuardarCambiosProvisionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProvisionEmpleado.add(this.jmenuDetalleArchivoProvisionEmpleado);		
		this.jmenuBarDetalleProvisionEmpleado.add(this.jmenuDetalleAccionesProvisionEmpleado);		
		this.jmenuBarDetalleProvisionEmpleado.add(this.jmenuDetalleDatosProvisionEmpleado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProvisionEmpleado);				
	}
	
	
	public void inicializarElementosCamposProvisionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProvisionEmpleado = new JLabelMe();
		jLabelIdProvisionEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProvisionEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProvisionEmpleado= new GridBagLayout();

		this.jPanelidProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);

		jLabelidProvisionEmpleado = new JLabel();
		jLabelidProvisionEmpleado.setText("Id");

		jLabelidProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaProvisionEmpleado = new JLabelMe();
		this.jLabelfechaProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaProvisionEmpleado.setToolTipText("Fecha");
		this.jLabelfechaProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelfechaProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		//jFormattedTextFieldfechaProvisionEmpleado= new JFormattedTextFieldMe();

		jDateChooserfechaProvisionEmpleado= new JDateChooser();
		jDateChooserfechaProvisionEmpleado.setEnabled(false);
		jDateChooserfechaProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaProvisionEmpleado.setDate(new Date());
		jDateChooserfechaProvisionEmpleado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaProvisionEmpleado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonfechaProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaProvisionEmpleadoBusqueda.setText("U");
		this.jButtonfechaProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaProvisionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_liquidacionProvisionEmpleado = new JLabelMe();
		this.jLabelfecha_liquidacionProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION+" : *");
		this.jLabelfecha_liquidacionProvisionEmpleado.setToolTipText("Fecha Liquacion");
		this.jLabelfecha_liquidacionProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_liquidacionProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_liquidacionProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_liquidacionProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_liquidacionProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_liquidacionProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelfecha_liquidacionProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		//jFormattedTextFieldfecha_liquidacionProvisionEmpleado= new JFormattedTextFieldMe();

		jDateChooserfecha_liquidacionProvisionEmpleado= new JDateChooser();
		jDateChooserfecha_liquidacionProvisionEmpleado.setEnabled(false);
		jDateChooserfecha_liquidacionProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_liquidacionProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_liquidacionProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_liquidacionProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_liquidacionProvisionEmpleado.setDate(new Date());
		jDateChooserfecha_liquidacionProvisionEmpleado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_liquidacionProvisionEmpleado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_liquidacionProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonfecha_liquidacionProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_liquidacionProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_liquidacionProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_liquidacionProvisionEmpleadoBusqueda.setText("U");
		this.jButtonfecha_liquidacionProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_liquidacionProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_liquidacionProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_liquidacionProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_liquidacionProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_liquidacionProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_liquidacionProvisionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_mesProvisionEmpleado = new JLabelMe();
		this.jLabelvalor_mesProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES+" : *");
		this.jLabelvalor_mesProvisionEmpleado.setToolTipText("Valor Mes");
		this.jLabelvalor_mesProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_mesProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_mesProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_mesProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_mesProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_mesProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelvalor_mesProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		jTextFieldvalor_mesProvisionEmpleado= new JTextFieldMe();
		jTextFieldvalor_mesProvisionEmpleado.setEnabled(false);
		jTextFieldvalor_mesProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_mesProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_mesProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_mesProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_mesProvisionEmpleado.setText("0.0");

		this.jButtonvalor_mesProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_mesProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_mesProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_mesProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_mesProvisionEmpleadoBusqueda.setText("U");
		this.jButtonvalor_mesProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_mesProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_mesProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_mesProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_mesProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_mesProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_mesProvisionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_pagaProvisionEmpleado = new JLabelMe();
		this.jLabelvalor_pagaProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA+" : *");
		this.jLabelvalor_pagaProvisionEmpleado.setToolTipText("Valor Paga");
		this.jLabelvalor_pagaProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagaProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagaProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_pagaProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_pagaProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_pagaProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelvalor_pagaProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		jTextFieldvalor_pagaProvisionEmpleado= new JTextFieldMe();
		jTextFieldvalor_pagaProvisionEmpleado.setEnabled(false);
		jTextFieldvalor_pagaProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagaProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagaProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_pagaProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_pagaProvisionEmpleado.setText("0.0");

		this.jButtonvalor_pagaProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_pagaProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagaProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagaProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_pagaProvisionEmpleadoBusqueda.setText("U");
		this.jButtonvalor_pagaProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_pagaProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_pagaProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_pagaProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_pagaProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_pagaProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_pagaProvisionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_vacacionProvisionEmpleado = new JLabelMe();
		this.jLabelvalor_vacacionProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION+" : *");
		this.jLabelvalor_vacacionProvisionEmpleado.setToolTipText("Valor Vacacion");
		this.jLabelvalor_vacacionProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_vacacionProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_vacacionProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_vacacionProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_vacacionProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_vacacionProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelvalor_vacacionProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		jTextFieldvalor_vacacionProvisionEmpleado= new JTextFieldMe();
		jTextFieldvalor_vacacionProvisionEmpleado.setEnabled(false);
		jTextFieldvalor_vacacionProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_vacacionProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_vacacionProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_vacacionProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_vacacionProvisionEmpleado.setText("0.0");

		this.jButtonvalor_vacacionProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_vacacionProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_vacacionProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_vacacionProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_vacacionProvisionEmpleadoBusqueda.setText("U");
		this.jButtonvalor_vacacionProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_vacacionProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_vacacionProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_vacacionProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_vacacionProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_vacacionProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_vacacionProvisionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_liquidacionProvisionEmpleado = new JLabelMe();
		this.jLabelvalor_liquidacionProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION+" : *");
		this.jLabelvalor_liquidacionProvisionEmpleado.setToolTipText("Valor Liquacion");
		this.jLabelvalor_liquidacionProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_liquidacionProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_liquidacionProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_liquidacionProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_liquidacionProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_liquidacionProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelvalor_liquidacionProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		jTextFieldvalor_liquidacionProvisionEmpleado= new JTextFieldMe();
		jTextFieldvalor_liquidacionProvisionEmpleado.setEnabled(false);
		jTextFieldvalor_liquidacionProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_liquidacionProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_liquidacionProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_liquidacionProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_liquidacionProvisionEmpleado.setText("0.0");

		this.jButtonvalor_liquidacionProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_liquidacionProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_liquidacionProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_liquidacionProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_liquidacionProvisionEmpleadoBusqueda.setText("U");
		this.jButtonvalor_liquidacionProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_liquidacionProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_liquidacionProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_liquidacionProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_liquidacionProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_liquidacionProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_liquidacionProvisionEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProvisionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProvisionEmpleado = new JLabelMe();
		this.jLabelid_empresaProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProvisionEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelid_empresaProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		jComboBoxid_empresaProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_empresaProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProvisionEmpleado.setEnabled(false);

		this.jButtonid_empresaProvisionEmpleado= new JButtonMe();
		this.jButtonid_empresaProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProvisionEmpleado.setText("Buscar");
		this.jButtonid_empresaProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProvisionEmpleado"));

		this.jButtonid_empresaProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_empresaProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProvisionEmpleadoUpdate"));



					
		this.jLabelid_empleadoProvisionEmpleado = new JLabelMe();
		this.jLabelid_empleadoProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoProvisionEmpleado.setToolTipText("Empleado");
		this.jLabelid_empleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelid_empleadoProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		jComboBoxid_empleadoProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoProvisionEmpleado= new JButtonMe();
		this.jButtonid_empleadoProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProvisionEmpleado.setText("Buscar");
		this.jButtonid_empleadoProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProvisionEmpleado"));

		this.jButtonid_empleadoProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empleadoProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_empleadoProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empleadoProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_empleadoProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProvisionEmpleadoUpdate"));



					
		this.jLabelid_estructuraProvisionEmpleado = new JLabelMe();
		this.jLabelid_estructuraProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraProvisionEmpleado.setToolTipText("Estructura");
		this.jLabelid_estructuraProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelid_estructuraProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		jComboBoxid_estructuraProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_estructuraProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraProvisionEmpleado= new JButtonMe();
		this.jButtonid_estructuraProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProvisionEmpleado.setText("Buscar");
		this.jButtonid_estructuraProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProvisionEmpleado"));

		this.jButtonid_estructuraProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_estructuraProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_estructuraProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_estructuraProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_estructuraProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_estructuraProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProvisionEmpleadoUpdate"));


		jButtonid_estructuraProvisionEmpleadoArbol= new JButtonMe();
		jButtonid_estructuraProvisionEmpleadoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraProvisionEmpleadoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraProvisionEmpleadoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraProvisionEmpleadoArbol.setText("Arbol");
		jButtonid_estructuraProvisionEmpleadoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraProvisionEmpleadoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProvisionEmpleadoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProvisionEmpleadoArbol"));



					
		this.jLabelid_tipo_provision_empleadoProvisionEmpleado = new JLabelMe();
		this.jLabelid_tipo_provision_empleadoProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO+" : *");
		this.jLabelid_tipo_provision_empleadoProvisionEmpleado.setToolTipText("Tipo Provision Empleado");
		this.jLabelid_tipo_provision_empleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_provision_empleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_provision_empleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_provision_empleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_provision_empleadoProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_provision_empleadoProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelid_tipo_provision_empleadoProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		jComboBoxid_tipo_provision_empleadoProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_provision_empleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_provision_empleadoProvisionEmpleado= new JButtonMe();
		this.jButtonid_tipo_provision_empleadoProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_provision_empleadoProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_provision_empleadoProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_provision_empleadoProvisionEmpleado.setText("Buscar");
		this.jButtonid_tipo_provision_empleadoProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_provision_empleadoProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_provision_empleadoProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_provision_empleadoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_provision_empleadoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_provision_empleadoProvisionEmpleado"));

		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_provision_empleadoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_provision_empleadoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_provision_empleadoProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_provision_empleadoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_provision_empleadoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_provision_empleadoProvisionEmpleadoUpdate"));



					
		this.jLabelid_defi_provision_empleadoProvisionEmpleado = new JLabelMe();
		this.jLabelid_defi_provision_empleadoProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO+" : *");
		this.jLabelid_defi_provision_empleadoProvisionEmpleado.setToolTipText("Defi Provision Empleado");
		this.jLabelid_defi_provision_empleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_defi_provision_empleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_defi_provision_empleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_defi_provision_empleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_defi_provision_empleadoProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_defi_provision_empleadoProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelid_defi_provision_empleadoProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		jComboBoxid_defi_provision_empleadoProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_defi_provision_empleadoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_defi_provision_empleadoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_defi_provision_empleadoProvisionEmpleado= new JButtonMe();
		this.jButtonid_defi_provision_empleadoProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_defi_provision_empleadoProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_defi_provision_empleadoProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_defi_provision_empleadoProvisionEmpleado.setText("Buscar");
		this.jButtonid_defi_provision_empleadoProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_defi_provision_empleadoProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_defi_provision_empleadoProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_defi_provision_empleadoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_defi_provision_empleadoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_defi_provision_empleadoProvisionEmpleado"));

		this.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_defi_provision_empleadoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_defi_provision_empleadoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_defi_provision_empleadoProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_defi_provision_empleadoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_defi_provision_empleadoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_defi_provision_empleadoProvisionEmpleadoUpdate"));



					
		this.jLabelid_anioProvisionEmpleado = new JLabelMe();
		this.jLabelid_anioProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioProvisionEmpleado.setToolTipText("Anio");
		this.jLabelid_anioProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelid_anioProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		jComboBoxid_anioProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_anioProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioProvisionEmpleado= new JButtonMe();
		this.jButtonid_anioProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProvisionEmpleado.setText("Buscar");
		this.jButtonid_anioProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProvisionEmpleado"));

		this.jButtonid_anioProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_anioProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_anioProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_anioProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_anioProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_anioProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProvisionEmpleadoUpdate"));



					
		this.jLabelid_mesProvisionEmpleado = new JLabelMe();
		this.jLabelid_mesProvisionEmpleado.setText(""+ProvisionEmpleadoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesProvisionEmpleado.setToolTipText("Mes");
		this.jLabelid_mesProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesProvisionEmpleado.setToolTipText(ProvisionEmpleadoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		this.jPanelid_mesProvisionEmpleado.setLayout(this.gridaBagLayoutProvisionEmpleado);


		jComboBoxid_mesProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_mesProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesProvisionEmpleado= new JButtonMe();
		this.jButtonid_mesProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProvisionEmpleado.setText("Buscar");
		this.jButtonid_mesProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProvisionEmpleado"));

		this.jButtonid_mesProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_mesProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_mesProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProvisionEmpleadoBusqueda"));

		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_mesProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_mesProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_mesProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProvisionEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleProvisionEmpleado = new ProvisionEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Provision Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProvisionEmpleado= new GridBagLayout();
		

		
		String sToolTipProvisionEmpleado="";
		sToolTipProvisionEmpleado=ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProvisionEmpleado+="(Nomina.ProvisionEmpleado)";
		}
		
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProvisionEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProvisionEmpleado = new JButtonMe();
		this.jButtonModificarProvisionEmpleado = new JButtonMe();
        this.jButtonActualizarProvisionEmpleado = new JButtonMe();
        this.jButtonEliminarProvisionEmpleado = new JButtonMe();
        this.jButtonCancelarProvisionEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosProvisionEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarProvisionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosProvisionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionProvisionEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralProvisionEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Provision Empleado";
		
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provision Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosProvisionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProvisionEmpleado.setName("jPanelCamposProvisionEmpleado"); 

		this.jPanelCamposOcultosProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProvisionEmpleado.setName("jPanelCamposOcultosProvisionEmpleado"); 

        this.jPanelAccionesProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProvisionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesProvisionEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProvisionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProvisionEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProvisionEmpleado.setText("Nuevo");
		this.jButtonModificarProvisionEmpleado.setText("Editar");
        this.jButtonActualizarProvisionEmpleado.setText("Actualizar");
        this.jButtonEliminarProvisionEmpleado.setText("Eliminar");
        this.jButtonCancelarProvisionEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosProvisionEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaProvisionEmpleado.setText("Guardar");
		this.jButtonCerrarProvisionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProvisionEmpleado,"nuevo_button","Nuevo",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProvisionEmpleado,"modificar_button","Editar",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProvisionEmpleado,"actualizar_button","Actualizar",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProvisionEmpleado,"eliminar_button","Eliminar",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProvisionEmpleado,"cancelar_button","Cancelar",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProvisionEmpleado,"guardarcambios_button","Guardar",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProvisionEmpleado,"guardarcambiostabla_button","Guardar",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProvisionEmpleado,"cerrar_button","Salir",this.provisionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProvisionEmpleado.setToolTipText("Nuevo"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProvisionEmpleado.setToolTipText("Editar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProvisionEmpleado.setToolTipText("Actualizar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProvisionEmpleado.setToolTipText("Eliminar)"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProvisionEmpleado.setToolTipText("Cancelar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProvisionEmpleado.setToolTipText("Guardar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProvisionEmpleado.setToolTipText("Guardar"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProvisionEmpleado.setToolTipText("Salir"+" "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProvisionEmpleado";
		inputMap = this.jButtonNuevoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProvisionEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProvisionEmpleado";
		inputMap = this.jButtonActualizarProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProvisionEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarProvisionEmpleado";
		inputMap = this.jButtonEliminarProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProvisionEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarProvisionEmpleado";
		inputMap = this.jButtonCancelarProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProvisionEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarProvisionEmpleado";
		inputMap = this.jButtonCerrarProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProvisionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProvisionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProvisionEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProvisionEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProvisionEmpleado.setToolTipText("Nuevo ProvisionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProvisionEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProvisionEmpleado.setToolTipText("Sin Cerrar Ventana ProvisionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProvisionEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProvisionEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesProvisionEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProvisionEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProvisionEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProvisionEmpleado = new JLabelMe();
		
		this.jLabelAccionesProvisionEmpleado.setText("Acciones");		
		this.jLabelAccionesProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProvisionEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProvisionEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProvisionEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProvisionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProvisionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProvisionEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProvisionEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProvisionEmpleado = new GridBagLayout();
		
		this.jPanelCamposProvisionEmpleado.setLayout(gridaBagLayoutCamposProvisionEmpleado);
		this.jPanelCamposOcultosProvisionEmpleado.setLayout(gridaBagLayoutCamposOcultosProvisionEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProvisionEmpleado.add(jLabelIdProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProvisionEmpleado.add(jLabelidProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProvisionEmpleado.add(jLabelid_empresaProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProvisionEmpleado.add(jButtonid_empresaProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProvisionEmpleado.add(jButtonid_empresaProvisionEmpleadoUpdate, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProvisionEmpleado.add(jComboBoxid_empresaProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoProvisionEmpleado.add(jLabelid_empleadoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoProvisionEmpleado.add(jButtonid_empleadoProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoProvisionEmpleado.add(jButtonid_empleadoProvisionEmpleadoUpdate, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoProvisionEmpleado.add(jComboBoxid_empleadoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraProvisionEmpleado.add(jLabelid_estructuraProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraProvisionEmpleado.add(jButtonid_estructuraProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraProvisionEmpleado.add(jButtonid_estructuraProvisionEmpleadoUpdate, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraProvisionEmpleado.add(jComboBoxid_estructuraProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_provision_empleadoProvisionEmpleado.add(jLabelid_tipo_provision_empleadoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_provision_empleadoProvisionEmpleado.add(jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_provision_empleadoProvisionEmpleado.add(jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_provision_empleadoProvisionEmpleado.add(jComboBoxid_tipo_provision_empleadoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_defi_provision_empleadoProvisionEmpleado.add(jLabelid_defi_provision_empleadoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_defi_provision_empleadoProvisionEmpleado.add(jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_defi_provision_empleadoProvisionEmpleado.add(jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_defi_provision_empleadoProvisionEmpleado.add(jComboBoxid_defi_provision_empleadoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioProvisionEmpleado.add(jLabelid_anioProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProvisionEmpleado.add(jButtonid_anioProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProvisionEmpleado.add(jButtonid_anioProvisionEmpleadoUpdate, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioProvisionEmpleado.add(jComboBoxid_anioProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesProvisionEmpleado.add(jLabelid_mesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProvisionEmpleado.add(jButtonid_mesProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProvisionEmpleado.add(jButtonid_mesProvisionEmpleadoUpdate, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesProvisionEmpleado.add(jComboBoxid_mesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaProvisionEmpleado.add(jLabelfechaProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaProvisionEmpleado.add(jButtonfechaProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaProvisionEmpleado.add(jDateChooserfechaProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_liquidacionProvisionEmpleado.add(jLabelfecha_liquidacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_liquidacionProvisionEmpleado.add(jButtonfecha_liquidacionProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_liquidacionProvisionEmpleado.add(jDateChooserfecha_liquidacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_mesProvisionEmpleado.add(jLabelvalor_mesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_mesProvisionEmpleado.add(jButtonvalor_mesProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_mesProvisionEmpleado.add(jTextFieldvalor_mesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_pagaProvisionEmpleado.add(jLabelvalor_pagaProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_pagaProvisionEmpleado.add(jButtonvalor_pagaProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_pagaProvisionEmpleado.add(jTextFieldvalor_pagaProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_vacacionProvisionEmpleado.add(jLabelvalor_vacacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_vacacionProvisionEmpleado.add(jButtonvalor_vacacionProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_vacacionProvisionEmpleado.add(jTextFieldvalor_vacacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_liquidacionProvisionEmpleado.add(jLabelvalor_liquidacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_liquidacionProvisionEmpleado.add(jButtonvalor_liquidacionProvisionEmpleadoBusqueda, this.gridBagConstraintsProvisionEmpleado);
	}

	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_liquidacionProvisionEmpleado.add(jTextFieldvalor_liquidacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelidProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelid_empleadoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelid_estructuraProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelid_tipo_provision_empleadoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelid_defi_provision_empleadoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelid_anioProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelid_mesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelfechaProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelfecha_liquidacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelvalor_mesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelvalor_pagaProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelvalor_vacacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvisionEmpleado.add(this.jPanelvalor_liquidacionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposProvisionEmpleado % 1==0) {
		iXPanelCamposProvisionEmpleado=0;
		iYPanelCamposProvisionEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvisionEmpleado.gridy = iYPanelCamposOcultosProvisionEmpleado;
	this.gridBagConstraintsProvisionEmpleado.gridx = iXPanelCamposOcultosProvisionEmpleado++;
	this.gridBagConstraintsProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProvisionEmpleado.add(this.jPanelid_empresaProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);



	if(iXPanelCamposOcultosProvisionEmpleado % 1==0) {
		iXPanelCamposOcultosProvisionEmpleado=0;
		iYPanelCamposOcultosProvisionEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesProvisionEmpleado= new GridBagLayout();
		this.jPanelAccionesProvisionEmpleado.setLayout(gridaBagLayoutAccionesProvisionEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProvisionEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioProvisionEmpleado.setLayout(gridaBagLayoutAccionesFormularioProvisionEmpleado);
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProvisionEmpleado.add(this.jComboBoxTiposAccionesFormularioProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProvisionEmpleado.add(this.jCheckBoxPostAccionNuevoProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProvisionEmpleado.add(this.jCheckBoxPostAccionSinCerrarProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProvisionEmpleado.add(this.jCheckBoxPostAccionSinMensajeProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesProvisionEmpleado.add(this.jButtonModificarProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);							

		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsProvisionEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesProvisionEmpleado.add(this.jButtonEliminarProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
			
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesProvisionEmpleado.add(this.jButtonActualizarProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);


		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;		
		this.gridBagConstraintsProvisionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesProvisionEmpleado.add(this.jButtonGuardarCambiosProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);	
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = 0;		
		this.gridBagConstraintsProvisionEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesProvisionEmpleado.add(this.jButtonCancelarProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProvisionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProvisionEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProvisionEmpleado.gridx = 0;		
			//this.gridBagConstraintsProvisionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProvisionEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProvisionEmpleado.gridx =0;
		this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProvisionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProvisionEmpleado = new ProvisionEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Provision Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Provision Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Provision Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProvisionEmpleadoModel provisionempleadoModel=new ProvisionEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//ProvisionEmpleadoModel.ProvisionEmpleadoFocusTraversalPolicy provisionempleadoFocusTraversalPolicy = provisionempleadoModel.new ProvisionEmpleadoFocusTraversalPolicy(this);
			
			//provisionempleadoFocusTraversalPolicy.setprovisionempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(provisionempleadoModel);
			
			
			this.jContentPaneDetalleProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProvisionEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleProvisionEmpleado.setLayout(gridaBagLayoutDetalleProvisionEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProvisionEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsProvisionEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProvisionEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleProvisionEmpleado.add(jTtoolBarDetalleProvisionEmpleado, gridBagConstraintsProvisionEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionProvisionEmpleado=   new JScrollPane(jContentPaneDetalleProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProvisionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProvisionEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleProvisionEmpleado.add(jPanelCamposProvisionEmpleado, gridBagConstraintsProvisionEmpleado);
			
			
			
			
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
						&& provisionempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.provisionempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProvisionEmpleado= new GridBagConstraints();
						this.gridBagConstraintsProvisionEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProvisionEmpleado.gridx = 0;
						this.jContentPaneDetalleProvisionEmpleado.add(this.jTabbedPaneRelacionesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProvisionEmpleado.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProvisionEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
					this.gridBagConstraintsProvisionEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProvisionEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProvisionEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleProvisionEmpleado.add(jPanelCamposOcultosProvisionEmpleado, gridBagConstraintsProvisionEmpleado);
				
					this.jPanelCamposOcultosProvisionEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	        this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProvisionEmpleado.add(this.jPanelAccionesFormularioProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);							
			
			
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsProvisionEmpleado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProvisionEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleProvisionEmpleado.add(this.jPanelAccionesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProvisionEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProvisionEmpleado=   new JScrollPane(this.jPanelCamposProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProvisionEmpleado.gridx = 0;
			this.gridBagConstraintsProvisionEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProvisionEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProvisionEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProvisionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);			
			
			this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsProvisionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProvisionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
			
			
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		
			
		this.gridBagConstraintsProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsProvisionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProvisionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProvisionEmpleado, this.gridBagConstraintsProvisionEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProvisionEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionProvisionEmpleado;
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
