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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


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
import com.bydan.erp.contabilidad.util.PresuAsignacionConstantesFunciones;

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
public class PresuAsignacionDetalleFormJInternalFrame extends PresuAsignacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresuAsignacion;
	
	protected JMenuBar jmenuBarDetallePresuAsignacion;
	
	protected JMenu jmenuDetallePresuAsignacion;
	protected JMenu jmenuDetalleArchivoPresuAsignacion;
	protected JMenu jmenuDetalleAccionesPresuAsignacion;
	protected JMenu jmenuDetalleDatosPresuAsignacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuAsignacion;	
	protected GridBagConstraints gridBagConstraintsPresuAsignacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresuAsignacionBeanSwingJInternalFrameAdditional jInternalFrameDetallePresuAsignacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PresuProyectoCuentaBeanSwingJInternalFrame presuproyectocuentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuproyectocuenta="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected PresuEstadoBeanSwingJInternalFrame presuestadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuestado="";
	
	public PresuAsignacionSessionBean presuasignacionSessionBean;
	
	
	
	
	public PresuProyectoCuentaSessionBean presuproyectocuentaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public PresuEstadoSessionBean presuestadoSessionBean;	
	
	public PresuAsignacionLogic presuasignacionLogic;
	
	public JScrollPane jScrollPanelDatosPresuAsignacion;
	public JScrollPane jScrollPanelDatosEdicionPresuAsignacion;
	public JScrollPane jScrollPanelDatosGeneralPresuAsignacion;
	
	protected JPanel jPanelCamposPresuAsignacion;    
	protected JPanel jPanelCamposOcultosPresuAsignacion;    	
	protected JPanel jPanelAccionesPresuAsignacion;
	protected JPanel jPanelAccionesFormularioPresuAsignacion;
    
	
	
	protected Integer iXPanelCamposPresuAsignacion=0;
	protected Integer iYPanelCamposPresuAsignacion=0;
	
	protected Integer iXPanelCamposOcultosPresuAsignacion=0;
	protected Integer iYPanelCamposOcultosPresuAsignacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresuAsignacion;
	public JButton jButtonModificarPresuAsignacion;
	public JButton jButtonActualizarPresuAsignacion;
    public JButton jButtonEliminarPresuAsignacion;
	public JButton jButtonCancelarPresuAsignacion;
    public JButton jButtonGuardarCambiosPresuAsignacion;
	public JButton jButtonGuardarCambiosTablaPresuAsignacion;
	protected JButton jButtonCerrarPresuAsignacion;
	
	
	protected JButton jButtonProcesarInformacionPresuAsignacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresuAsignacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresuAsignacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresuAsignacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuAsignacion;
	protected JButton jButtonModificarToolBarPresuAsignacion;
	protected JButton jButtonActualizarToolBarPresuAsignacion;
    protected JButton jButtonEliminarToolBarPresuAsignacion;
	protected JButton jButtonCancelarToolBarPresuAsignacion;
    protected JButton jButtonGuardarCambiosToolBarPresuAsignacion;
	protected JButton jButtonGuardarCambiosTablaToolBarPresuAsignacion;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuAsignacion;
	protected JButton jButtonCerrarToolBarPresuAsignacion;
	
	protected JButton jButtonProcesarInformacionToolBarPresuAsignacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuAsignacion;
	protected JMenuItem jMenuItemModificarPresuAsignacion;
	protected JMenuItem jMenuItemActualizarPresuAsignacion;
    protected JMenuItem jMenuItemEliminarPresuAsignacion;
	protected JMenuItem jMenuItemCancelarPresuAsignacion;
    protected JMenuItem jMenuItemGuardarCambiosPresuAsignacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuAsignacion;
	protected JMenuItem jMenuItemCerrarPresuAsignacion;
	protected JMenuItem jMenuItemDetalleCerrarPresuAsignacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuAsignacion;
	
	protected JMenuItem jMenuItemProcesarInformacionPresuAsignacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuAsignacion;
	protected JMenuItem jMenuItemMostrarOcultarPresuAsignacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuAsignacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuAsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuAsignacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresuAsignacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresuAsignacion;
	public JLabel jLabelIdPresuAsignacion;
	public JLabel jLabelidPresuAsignacion;
	public JButton jButtonidPresuAsignacionBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_secuencialPresuAsignacion;
	public JLabel jLabelcodigo_secuencialPresuAsignacion;
	public JTextField jTextFieldcodigo_secuencialPresuAsignacion;
	public JButton jButtoncodigo_secuencialPresuAsignacionBusqueda= new JButtonMe();

	public JPanel jPanelvalorPresuAsignacion;
	public JLabel jLabelvalorPresuAsignacion;
	public JTextField jTextFieldvalorPresuAsignacion;
	public JButton jButtonvalorPresuAsignacionBusqueda= new JButtonMe();

	public JPanel jPanelfechaPresuAsignacion;
	public JLabel jLabelfechaPresuAsignacion;
	//public JFormattedTextField jDateChooserfechaPresuAsignacion;

	public JDateChooser jDateChooserfechaPresuAsignacion;
	public JButton jButtonfechaPresuAsignacionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPresuAsignacion;
	public JLabel jLabeldescripcionPresuAsignacion;
	public JTextArea jTextAreadescripcionPresuAsignacion;
	public JScrollPane jscrollPanedescripcionPresuAsignacion;
	public JButton jButtondescripcionPresuAsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_presu_proyecto_cuentaPresuAsignacion;
	public JLabel jLabelid_presu_proyecto_cuentaPresuAsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_proyecto_cuentaPresuAsignacion;
	public JButton jButtonid_presu_proyecto_cuentaPresuAsignacion= new JButtonMe();
	public JButton jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate= new JButtonMe();
	public JButton jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoPresuAsignacion;
	public JLabel jLabelid_empleadoPresuAsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoPresuAsignacion;
	public JButton jButtonid_empleadoPresuAsignacion= new JButtonMe();
	public JButton jButtonid_empleadoPresuAsignacionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoPresuAsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_presu_estadoPresuAsignacion;
	public JLabel jLabelid_presu_estadoPresuAsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_estadoPresuAsignacion;
	public JButton jButtonid_presu_estadoPresuAsignacion= new JButtonMe();
	public JButton jButtonid_presu_estadoPresuAsignacionUpdate= new JButtonMe();
	public JButton jButtonid_presu_estadoPresuAsignacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresuAsignacion;
	
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
	
	public PresuAsignacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresuAsignacion=new JPanel();
				this.jPanelAccionesFormularioPresuAsignacion=new JPanel();
				this.jmenuBarDetallePresuAsignacion=new JMenuBar();
				this.jTtoolBarDetallePresuAsignacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuAsignacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresuAsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresuAsignacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresuAsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuAsignacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuAsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuAsignacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuAsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuAsignacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuAsignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresuAsignacion() {
		return this.jButtonActualizarToolBarPresuAsignacion;
	}
	
	public JButton getjButtonEliminarToolBarPresuAsignacion() {
		return this.jButtonEliminarToolBarPresuAsignacion;
	}
	
	public JButton getjButtonCancelarToolBarPresuAsignacion() {
		return this.jButtonCancelarToolBarPresuAsignacion;
	}		
	
	public JButton getjButtonProcesarInformacionPresuAsignacion() {
		return this.jButtonProcesarInformacionPresuAsignacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuAsignacion)	{
		this.jButtonProcesarInformacionPresuAsignacion = jButtonProcesarInformacionPresuAsignacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuAsignacion() {
		return this.jComboBoxTiposAccionesPresuAsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuAsignacion(
			JComboBox jComboBoxTiposRelacionesPresuAsignacion) {
		this.jComboBoxTiposRelacionesPresuAsignacion = jComboBoxTiposRelacionesPresuAsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuAsignacion(
			JComboBox jComboBoxTiposAccionesPresuAsignacion) {
		this.jComboBoxTiposAccionesPresuAsignacion = jComboBoxTiposAccionesPresuAsignacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresuAsignacion() {
		return this.jComboBoxTiposAccionesFormularioPresuAsignacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresuAsignacion(
			JComboBox jComboBoxTiposAccionesFormularioPresuAsignacion) {
		this.jComboBoxTiposAccionesFormularioPresuAsignacion = jComboBoxTiposAccionesFormularioPresuAsignacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
		
		this.presuasignacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuasignacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presuasignacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuAsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuAsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuAsignacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asignacion Presupuesto MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
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
	
		PresuAsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresuAsignacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresuAsignacion=new JButtonMe();
				this.jButtonModificarToolBarPresuAsignacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresuAsignacion,this.jTtoolBarDetallePresuAsignacion,
							"actualizar","actualizar","Actualizar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresuAsignacion,this.jTtoolBarDetallePresuAsignacion,
							"eliminar","eliminar","Eliminar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresuAsignacion,this.jTtoolBarDetallePresuAsignacion,
							"cancelar","cancelar","Cancelar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresuAsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresuAsignacion,this.jTtoolBarDetallePresuAsignacion,
							"guardarcambios","guardarcambios","Guardar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresuAsignacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresuAsignacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresuAsignacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresuAsignacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresuAsignacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuAsignacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuAsignacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuAsignacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresuAsignacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresuAsignacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresuAsignacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresuAsignacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresuAsignacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresuAsignacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresuAsignacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresuAsignacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresuAsignacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresuAsignacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresuAsignacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresuAsignacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresuAsignacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuAsignacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuAsignacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuAsignacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuAsignacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuAsignacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresuAsignacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresuAsignacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresuAsignacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuAsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuAsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuAsignacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuAsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuAsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuAsignacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresuAsignacion.add(this.jMenuItemDetalleCerrarPresuAsignacion);
		
		this.jmenuDetalleAccionesPresuAsignacion.add(this.jMenuItemActualizarPresuAsignacion);
		this.jmenuDetalleAccionesPresuAsignacion.add(this.jMenuItemEliminarPresuAsignacion);
		this.jmenuDetalleAccionesPresuAsignacion.add(this.jMenuItemCancelarPresuAsignacion);		
		
		//this.jmenuDetalleDatosPresuAsignacion.add(this.jMenuItemDetalleAbrirOrderByPresuAsignacion);				
		this.jmenuDetalleDatosPresuAsignacion.add(this.jMenuItemDetalleMostarOcultarPresuAsignacion);				
				
		//this.jmenuDetalleAccionesPresuAsignacion.add(this.jMenuItemGuardarCambiosPresuAsignacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresuAsignacion.add(this.jmenuDetalleArchivoPresuAsignacion);		
		this.jmenuBarDetallePresuAsignacion.add(this.jmenuDetalleAccionesPresuAsignacion);		
		this.jmenuBarDetallePresuAsignacion.add(this.jmenuDetalleDatosPresuAsignacion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresuAsignacion);				
	}
	
	
	public void inicializarElementosCamposPresuAsignacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresuAsignacion = new JLabelMe();
		jLabelIdPresuAsignacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresuAsignacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresuAsignacion.setToolTipText(PresuAsignacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresuAsignacion= new GridBagLayout();

		this.jPanelidPresuAsignacion.setLayout(this.gridaBagLayoutPresuAsignacion);

		jLabelidPresuAsignacion = new JLabel();
		jLabelidPresuAsignacion.setText("Id");

		jLabelidPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigo_secuencialPresuAsignacion = new JLabelMe();
		this.jLabelcodigo_secuencialPresuAsignacion.setText(""+PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL+" : *");
		this.jLabelcodigo_secuencialPresuAsignacion.setToolTipText("Codigo Secuencial");
		this.jLabelcodigo_secuencialPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_secuencialPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_secuencialPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_secuencialPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_secuencialPresuAsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_secuencialPresuAsignacion.setToolTipText(PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL);
		this.gridaBagLayoutPresuAsignacion = new GridBagLayout();
		this.jPanelcodigo_secuencialPresuAsignacion.setLayout(this.gridaBagLayoutPresuAsignacion);


		jTextFieldcodigo_secuencialPresuAsignacion= new JTextFieldMe();
		jTextFieldcodigo_secuencialPresuAsignacion.setEnabled(false);
		jTextFieldcodigo_secuencialPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_secuencialPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_secuencialPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_secuencialPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcodigo_secuencialPresuAsignacion.setText("0");

		this.jButtoncodigo_secuencialPresuAsignacionBusqueda= new JButtonMe();
		this.jButtoncodigo_secuencialPresuAsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_secuencialPresuAsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_secuencialPresuAsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_secuencialPresuAsignacionBusqueda.setText("U");
		this.jButtoncodigo_secuencialPresuAsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_secuencialPresuAsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_secuencialPresuAsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_secuencialPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_secuencialPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_secuencialPresuAsignacionBusqueda"));

		if(this.presuasignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_secuencialPresuAsignacionBusqueda.setVisible(false);		}


					
		this.jLabelvalorPresuAsignacion = new JLabelMe();
		this.jLabelvalorPresuAsignacion.setText(""+PresuAsignacionConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPresuAsignacion.setToolTipText("Valor");
		this.jLabelvalorPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPresuAsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPresuAsignacion.setToolTipText(PresuAsignacionConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPresuAsignacion = new GridBagLayout();
		this.jPanelvalorPresuAsignacion.setLayout(this.gridaBagLayoutPresuAsignacion);


		jTextFieldvalorPresuAsignacion= new JTextFieldMe();
		jTextFieldvalorPresuAsignacion.setEnabled(false);
		jTextFieldvalorPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPresuAsignacion.setText("0.0");

		this.jButtonvalorPresuAsignacionBusqueda= new JButtonMe();
		this.jButtonvalorPresuAsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresuAsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresuAsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPresuAsignacionBusqueda.setText("U");
		this.jButtonvalorPresuAsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPresuAsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPresuAsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPresuAsignacionBusqueda"));

		if(this.presuasignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPresuAsignacionBusqueda.setVisible(false);		}


					
		this.jLabelfechaPresuAsignacion = new JLabelMe();
		this.jLabelfechaPresuAsignacion.setText(""+PresuAsignacionConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPresuAsignacion.setToolTipText("Fecha");
		this.jLabelfechaPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPresuAsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPresuAsignacion.setToolTipText(PresuAsignacionConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPresuAsignacion = new GridBagLayout();
		this.jPanelfechaPresuAsignacion.setLayout(this.gridaBagLayoutPresuAsignacion);


		//jFormattedTextFieldfechaPresuAsignacion= new JFormattedTextFieldMe();

		jDateChooserfechaPresuAsignacion= new JDateChooser();
		jDateChooserfechaPresuAsignacion.setEnabled(false);
		jDateChooserfechaPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPresuAsignacion.setDate(new Date());
		jDateChooserfechaPresuAsignacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPresuAsignacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPresuAsignacionBusqueda= new JButtonMe();
		this.jButtonfechaPresuAsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPresuAsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPresuAsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPresuAsignacionBusqueda.setText("U");
		this.jButtonfechaPresuAsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPresuAsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPresuAsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPresuAsignacionBusqueda"));

		if(this.presuasignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPresuAsignacionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPresuAsignacion = new JLabelMe();
		this.jLabeldescripcionPresuAsignacion.setText(""+PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPresuAsignacion.setToolTipText("Descripcion");
		this.jLabeldescripcionPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPresuAsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPresuAsignacion.setToolTipText(PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPresuAsignacion = new GridBagLayout();
		this.jPaneldescripcionPresuAsignacion.setLayout(this.gridaBagLayoutPresuAsignacion);


		jTextAreadescripcionPresuAsignacion= new JTextAreaMe();
		jTextAreadescripcionPresuAsignacion.setEnabled(false);
		jTextAreadescripcionPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuAsignacion.setLineWrap(true);
		jTextAreadescripcionPresuAsignacion.setWrapStyleWord(true);
		jTextAreadescripcionPresuAsignacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPresuAsignacion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPresuAsignacion = new JScrollPane(jTextAreadescripcionPresuAsignacion);
		jscrollPanedescripcionPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPresuAsignacionBusqueda= new JButtonMe();
		this.jButtondescripcionPresuAsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPresuAsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPresuAsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPresuAsignacionBusqueda.setText("U");
		this.jButtondescripcionPresuAsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPresuAsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPresuAsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPresuAsignacionBusqueda"));

		if(this.presuasignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPresuAsignacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresuAsignacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_presu_proyecto_cuentaPresuAsignacion = new JLabelMe();
		this.jLabelid_presu_proyecto_cuentaPresuAsignacion.setText(""+PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA+" : *");
		this.jLabelid_presu_proyecto_cuentaPresuAsignacion.setToolTipText("Proyecto Cuenta");
		this.jLabelid_presu_proyecto_cuentaPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_presu_proyecto_cuentaPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_presu_proyecto_cuentaPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_presu_proyecto_cuentaPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_presu_proyecto_cuentaPresuAsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_presu_proyecto_cuentaPresuAsignacion.setToolTipText(PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA);
		this.gridaBagLayoutPresuAsignacion = new GridBagLayout();
		this.jPanelid_presu_proyecto_cuentaPresuAsignacion.setLayout(this.gridaBagLayoutPresuAsignacion);


		jComboBoxid_presu_proyecto_cuentaPresuAsignacion= new JComboBoxMe();
		jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_proyecto_cuentaPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_presu_proyecto_cuentaPresuAsignacion= new JButtonMe();
		this.jButtonid_presu_proyecto_cuentaPresuAsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_proyecto_cuentaPresuAsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_proyecto_cuentaPresuAsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_proyecto_cuentaPresuAsignacion.setText("Buscar");
		this.jButtonid_presu_proyecto_cuentaPresuAsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_presu_proyecto_cuentaPresuAsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_proyecto_cuentaPresuAsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_presu_proyecto_cuentaPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_proyecto_cuentaPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_proyecto_cuentaPresuAsignacion"));

		this.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda= new JButtonMe();
		this.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda.setText("U");
		this.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_presu_proyecto_cuentaPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_proyecto_cuentaPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_proyecto_cuentaPresuAsignacionBusqueda"));

		if(this.presuasignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda.setVisible(false);		}

		this.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate= new JButtonMe();
		this.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate.setText("U");
		this.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_presu_proyecto_cuentaPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_proyecto_cuentaPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_proyecto_cuentaPresuAsignacionUpdate"));



					
		this.jLabelid_empleadoPresuAsignacion = new JLabelMe();
		this.jLabelid_empleadoPresuAsignacion.setText(""+PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoPresuAsignacion.setToolTipText("Empleado");
		this.jLabelid_empleadoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoPresuAsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoPresuAsignacion.setToolTipText(PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutPresuAsignacion = new GridBagLayout();
		this.jPanelid_empleadoPresuAsignacion.setLayout(this.gridaBagLayoutPresuAsignacion);


		jComboBoxid_empleadoPresuAsignacion= new JComboBoxMe();
		jComboBoxid_empleadoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoPresuAsignacion= new JButtonMe();
		this.jButtonid_empleadoPresuAsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPresuAsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPresuAsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPresuAsignacion.setText("Buscar");
		this.jButtonid_empleadoPresuAsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoPresuAsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPresuAsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPresuAsignacion"));

		this.jButtonid_empleadoPresuAsignacionBusqueda= new JButtonMe();
		this.jButtonid_empleadoPresuAsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuAsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuAsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPresuAsignacionBusqueda.setText("U");
		this.jButtonid_empleadoPresuAsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoPresuAsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPresuAsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPresuAsignacionBusqueda"));

		if(this.presuasignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoPresuAsignacionBusqueda.setVisible(false);		}

		this.jButtonid_empleadoPresuAsignacionUpdate= new JButtonMe();
		this.jButtonid_empleadoPresuAsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuAsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuAsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPresuAsignacionUpdate.setText("U");
		this.jButtonid_empleadoPresuAsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoPresuAsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPresuAsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPresuAsignacionUpdate"));



					
		this.jLabelid_presu_estadoPresuAsignacion = new JLabelMe();
		this.jLabelid_presu_estadoPresuAsignacion.setText(""+PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO+" : *");
		this.jLabelid_presu_estadoPresuAsignacion.setToolTipText("Estado");
		this.jLabelid_presu_estadoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_estadoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_estadoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_presu_estadoPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_presu_estadoPresuAsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_presu_estadoPresuAsignacion.setToolTipText(PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO);
		this.gridaBagLayoutPresuAsignacion = new GridBagLayout();
		this.jPanelid_presu_estadoPresuAsignacion.setLayout(this.gridaBagLayoutPresuAsignacion);


		jComboBoxid_presu_estadoPresuAsignacion= new JComboBoxMe();
		jComboBoxid_presu_estadoPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_estadoPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_estadoPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_estadoPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_presu_estadoPresuAsignacion= new JButtonMe();
		this.jButtonid_presu_estadoPresuAsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_estadoPresuAsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_estadoPresuAsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_estadoPresuAsignacion.setText("Buscar");
		this.jButtonid_presu_estadoPresuAsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_presu_estadoPresuAsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_estadoPresuAsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_presu_estadoPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_estadoPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_estadoPresuAsignacion"));

		this.jButtonid_presu_estadoPresuAsignacionBusqueda= new JButtonMe();
		this.jButtonid_presu_estadoPresuAsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuAsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuAsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_estadoPresuAsignacionBusqueda.setText("U");
		this.jButtonid_presu_estadoPresuAsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_presu_estadoPresuAsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_estadoPresuAsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_presu_estadoPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_estadoPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_estadoPresuAsignacionBusqueda"));

		if(this.presuasignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_presu_estadoPresuAsignacionBusqueda.setVisible(false);		}

		this.jButtonid_presu_estadoPresuAsignacionUpdate= new JButtonMe();
		this.jButtonid_presu_estadoPresuAsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuAsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuAsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_estadoPresuAsignacionUpdate.setText("U");
		this.jButtonid_presu_estadoPresuAsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_presu_estadoPresuAsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_estadoPresuAsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_presu_estadoPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_estadoPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_estadoPresuAsignacionUpdate"));



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
		//this.jInternalFrameDetallePresuAsignacion = new PresuAsignacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Asignacion Presupuesto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuAsignacion= new GridBagLayout();
		

		
		String sToolTipPresuAsignacion="";
		sToolTipPresuAsignacion=PresuAsignacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuAsignacion+="(Contabilidad.PresuAsignacion)";
		}
		
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuAsignacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresuAsignacion = new JButtonMe();
		this.jButtonModificarPresuAsignacion = new JButtonMe();
        this.jButtonActualizarPresuAsignacion = new JButtonMe();
        this.jButtonEliminarPresuAsignacion = new JButtonMe();
        this.jButtonCancelarPresuAsignacion = new JButtonMe();
        this.jButtonGuardarCambiosPresuAsignacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresuAsignacion = new JButtonMe();
		this.jButtonCerrarPresuAsignacion = new JButtonMe();
		
		this.jScrollPanelDatosPresuAsignacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresuAsignacion = new JScrollPane();
		this.jScrollPanelDatosGeneralPresuAsignacion = new JScrollPane();
				
		
		
		this.jPanelCamposPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Asignacion Presupuesto";
		
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asignacion Presupuestoes" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuAsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresuAsignacion.setName("jPanelCamposPresuAsignacion"); 

		this.jPanelCamposOcultosPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresuAsignacion.setName("jPanelCamposOcultosPresuAsignacion"); 

        this.jPanelAccionesPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuAsignacion.setToolTipText("Acciones");
        this.jPanelAccionesPresuAsignacion.setName("Acciones"); 

		this.jPanelAccionesFormularioPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresuAsignacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresuAsignacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresuAsignacion.setText("Nuevo");
		this.jButtonModificarPresuAsignacion.setText("Editar");
        this.jButtonActualizarPresuAsignacion.setText("Actualizar");
        this.jButtonEliminarPresuAsignacion.setText("Eliminar");
        this.jButtonCancelarPresuAsignacion.setText("Cancelar");
        this.jButtonGuardarCambiosPresuAsignacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresuAsignacion.setText("Guardar");
		this.jButtonCerrarPresuAsignacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuAsignacion,"nuevo_button","Nuevo",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresuAsignacion,"modificar_button","Editar",this.presuasignacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresuAsignacion,"actualizar_button","Actualizar",this.presuasignacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresuAsignacion,"eliminar_button","Eliminar",this.presuasignacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresuAsignacion,"cancelar_button","Cancelar",this.presuasignacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresuAsignacion,"guardarcambios_button","Guardar",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuAsignacion,"guardarcambiostabla_button","Guardar",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuAsignacion,"cerrar_button","Salir",this.presuasignacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresuAsignacion.setToolTipText("Nuevo"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresuAsignacion.setToolTipText("Editar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresuAsignacion.setToolTipText("Actualizar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresuAsignacion.setToolTipText("Eliminar)"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresuAsignacion.setToolTipText("Cancelar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresuAsignacion.setToolTipText("Guardar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresuAsignacion.setToolTipText("Guardar"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuAsignacion.setToolTipText("Salir"+" "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuAsignacion";
		inputMap = this.jButtonNuevoPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuAsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuAsignacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresuAsignacion";
		inputMap = this.jButtonActualizarPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresuAsignacion"));
		
		//ELIMINAR
		sMapKey = "EliminarPresuAsignacion";
		inputMap = this.jButtonEliminarPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresuAsignacion"));
		
		//CANCELAR	
		sMapKey = "CancelarPresuAsignacion";
		inputMap = this.jButtonCancelarPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresuAsignacion"));
		
		//CERRAR		
		sMapKey = "CerrarPresuAsignacion";
		inputMap = this.jButtonCerrarPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuAsignacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuAsignacion";
		inputMap = this.jButtonGuardarCambiosTablaPresuAsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuAsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuAsignacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresuAsignacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresuAsignacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresuAsignacion.setToolTipText("Nuevo PresuAsignacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresuAsignacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresuAsignacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresuAsignacion.setToolTipText("Sin Cerrar Ventana PresuAsignacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresuAsignacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresuAsignacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresuAsignacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuAsignacion.setText("Accion");
		this.jComboBoxTiposAccionesPresuAsignacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresuAsignacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresuAsignacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresuAsignacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresuAsignacion = new JLabelMe();
		
		this.jLabelAccionesPresuAsignacion.setText("Acciones");		
		this.jLabelAccionesPresuAsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuAsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuAsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresuAsignacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresuAsignacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresuAsignacion=new JTabbedPane();
		this.jTabbedPaneRelacionesPresuAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresuAsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresuAsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuAsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuAsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuAsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresuAsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuAsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuAsignacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresuAsignacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresuAsignacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresuAsignacion = new GridBagLayout();
		
		this.jPanelCamposPresuAsignacion.setLayout(gridaBagLayoutCamposPresuAsignacion);
		this.jPanelCamposOcultosPresuAsignacion.setLayout(gridaBagLayoutCamposOcultosPresuAsignacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 0;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresuAsignacion.add(jLabelIdPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 1;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresuAsignacion.add(jLabelidPresuAsignacion, this.gridBagConstraintsPresuAsignacion);


	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 0;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_presu_proyecto_cuentaPresuAsignacion.add(jLabelid_presu_proyecto_cuentaPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = 2;
		this.gridBagConstraintsPresuAsignacion.ipadx = 0;
		this.gridBagConstraintsPresuAsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_proyecto_cuentaPresuAsignacion.add(jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda, this.gridBagConstraintsPresuAsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = 3;
		this.gridBagConstraintsPresuAsignacion.ipadx = 0;
		this.gridBagConstraintsPresuAsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_proyecto_cuentaPresuAsignacion.add(jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate, this.gridBagConstraintsPresuAsignacion);
	}

	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 1;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_presu_proyecto_cuentaPresuAsignacion.add(jComboBoxid_presu_proyecto_cuentaPresuAsignacion, this.gridBagConstraintsPresuAsignacion);


	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 0;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoPresuAsignacion.add(jLabelid_empleadoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 2;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoPresuAsignacion.add(jButtonid_empleadoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = 3;
		this.gridBagConstraintsPresuAsignacion.ipadx = 0;
		this.gridBagConstraintsPresuAsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPresuAsignacion.add(jButtonid_empleadoPresuAsignacionBusqueda, this.gridBagConstraintsPresuAsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = 4;
		this.gridBagConstraintsPresuAsignacion.ipadx = 0;
		this.gridBagConstraintsPresuAsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPresuAsignacion.add(jButtonid_empleadoPresuAsignacionUpdate, this.gridBagConstraintsPresuAsignacion);
	}

	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 1;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoPresuAsignacion.add(jComboBoxid_empleadoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);


	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 0;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_secuencialPresuAsignacion.add(jLabelcodigo_secuencialPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = 2;
		this.gridBagConstraintsPresuAsignacion.ipadx = 0;
		this.gridBagConstraintsPresuAsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_secuencialPresuAsignacion.add(jButtoncodigo_secuencialPresuAsignacionBusqueda, this.gridBagConstraintsPresuAsignacion);
	}

	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 1;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_secuencialPresuAsignacion.add(jTextFieldcodigo_secuencialPresuAsignacion, this.gridBagConstraintsPresuAsignacion);


	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 0;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPresuAsignacion.add(jLabelvalorPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = 2;
		this.gridBagConstraintsPresuAsignacion.ipadx = 0;
		this.gridBagConstraintsPresuAsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPresuAsignacion.add(jButtonvalorPresuAsignacionBusqueda, this.gridBagConstraintsPresuAsignacion);
	}

	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 1;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPresuAsignacion.add(jTextFieldvalorPresuAsignacion, this.gridBagConstraintsPresuAsignacion);


	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 0;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPresuAsignacion.add(jLabelfechaPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = 2;
		this.gridBagConstraintsPresuAsignacion.ipadx = 0;
		this.gridBagConstraintsPresuAsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPresuAsignacion.add(jButtonfechaPresuAsignacionBusqueda, this.gridBagConstraintsPresuAsignacion);
	}

	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 1;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPresuAsignacion.add(jDateChooserfechaPresuAsignacion, this.gridBagConstraintsPresuAsignacion);


	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 0;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_presu_estadoPresuAsignacion.add(jLabelid_presu_estadoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = 2;
		this.gridBagConstraintsPresuAsignacion.ipadx = 0;
		this.gridBagConstraintsPresuAsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_estadoPresuAsignacion.add(jButtonid_presu_estadoPresuAsignacionBusqueda, this.gridBagConstraintsPresuAsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = 3;
		this.gridBagConstraintsPresuAsignacion.ipadx = 0;
		this.gridBagConstraintsPresuAsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_estadoPresuAsignacion.add(jButtonid_presu_estadoPresuAsignacionUpdate, this.gridBagConstraintsPresuAsignacion);
	}

	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 1;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_presu_estadoPresuAsignacion.add(jComboBoxid_presu_estadoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);


	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 0;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPresuAsignacion.add(jLabeldescripcionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		//this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = 2;
		this.gridBagConstraintsPresuAsignacion.ipadx = 0;
		this.gridBagConstraintsPresuAsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPresuAsignacion.add(jButtondescripcionPresuAsignacionBusqueda, this.gridBagConstraintsPresuAsignacion);
	}

	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuAsignacion.gridy = 0;
	this.gridBagConstraintsPresuAsignacion.gridx = 1;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPresuAsignacion.add(jscrollPanedescripcionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuAsignacion.gridy = iYPanelCamposPresuAsignacion;
	this.gridBagConstraintsPresuAsignacion.gridx = iXPanelCamposPresuAsignacion++;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuAsignacion.add(this.jPanelidPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(iXPanelCamposPresuAsignacion % 1==0) {
		iXPanelCamposPresuAsignacion=0;
		iYPanelCamposPresuAsignacion++;
	}
	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuAsignacion.gridy = iYPanelCamposPresuAsignacion;
	this.gridBagConstraintsPresuAsignacion.gridx = iXPanelCamposPresuAsignacion++;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuAsignacion.add(this.jPanelid_presu_proyecto_cuentaPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(iXPanelCamposPresuAsignacion % 1==0) {
		iXPanelCamposPresuAsignacion=0;
		iYPanelCamposPresuAsignacion++;
	}
	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuAsignacion.gridy = iYPanelCamposPresuAsignacion;
	this.gridBagConstraintsPresuAsignacion.gridx = iXPanelCamposPresuAsignacion++;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuAsignacion.add(this.jPanelid_empleadoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(iXPanelCamposPresuAsignacion % 1==0) {
		iXPanelCamposPresuAsignacion=0;
		iYPanelCamposPresuAsignacion++;
	}
	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuAsignacion.gridy = iYPanelCamposPresuAsignacion;
	this.gridBagConstraintsPresuAsignacion.gridx = iXPanelCamposPresuAsignacion++;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuAsignacion.add(this.jPanelcodigo_secuencialPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(iXPanelCamposPresuAsignacion % 1==0) {
		iXPanelCamposPresuAsignacion=0;
		iYPanelCamposPresuAsignacion++;
	}
	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuAsignacion.gridy = iYPanelCamposPresuAsignacion;
	this.gridBagConstraintsPresuAsignacion.gridx = iXPanelCamposPresuAsignacion++;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuAsignacion.add(this.jPanelvalorPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(iXPanelCamposPresuAsignacion % 1==0) {
		iXPanelCamposPresuAsignacion=0;
		iYPanelCamposPresuAsignacion++;
	}
	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuAsignacion.gridy = iYPanelCamposPresuAsignacion;
	this.gridBagConstraintsPresuAsignacion.gridx = iXPanelCamposPresuAsignacion++;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuAsignacion.add(this.jPanelfechaPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(iXPanelCamposPresuAsignacion % 1==0) {
		iXPanelCamposPresuAsignacion=0;
		iYPanelCamposPresuAsignacion++;
	}
	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuAsignacion.gridy = iYPanelCamposPresuAsignacion;
	this.gridBagConstraintsPresuAsignacion.gridx = iXPanelCamposPresuAsignacion++;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuAsignacion.add(this.jPanelid_presu_estadoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(iXPanelCamposPresuAsignacion % 1==0) {
		iXPanelCamposPresuAsignacion=0;
		iYPanelCamposPresuAsignacion++;
	}
	this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuAsignacion.gridy = iYPanelCamposPresuAsignacion;
	this.gridBagConstraintsPresuAsignacion.gridx = iXPanelCamposPresuAsignacion++;
	this.gridBagConstraintsPresuAsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuAsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuAsignacion.add(this.jPaneldescripcionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);



	if(iXPanelCamposPresuAsignacion % 1==0) {
		iXPanelCamposPresuAsignacion=0;
		iYPanelCamposPresuAsignacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesPresuAsignacion= new GridBagLayout();
		this.jPanelAccionesPresuAsignacion.setLayout(gridaBagLayoutAccionesPresuAsignacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresuAsignacion= new GridBagLayout();
		this.jPanelAccionesFormularioPresuAsignacion.setLayout(gridaBagLayoutAccionesFormularioPresuAsignacion);
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuAsignacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuAsignacion.add(this.jComboBoxTiposAccionesFormularioPresuAsignacion, this.gridBagConstraintsPresuAsignacion);

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuAsignacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuAsignacion.add(this.jCheckBoxPostAccionNuevoPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presuasignacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuAsignacion.add(this.jCheckBoxPostAccionSinCerrarPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presuasignacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuAsignacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuAsignacion.add(this.jCheckBoxPostAccionSinMensajePresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresuAsignacion.add(this.jButtonModificarPresuAsignacion, this.gridBagConstraintsPresuAsignacion);							

		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuAsignacion.gridy = 0;
		this.gridBagConstraintsPresuAsignacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresuAsignacion.add(this.jButtonEliminarPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
			
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = 0;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuAsignacion.add(this.jButtonActualizarPresuAsignacion, this.gridBagConstraintsPresuAsignacion);


		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = 0;		
		this.gridBagConstraintsPresuAsignacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuAsignacion.add(this.jButtonGuardarCambiosPresuAsignacion, this.gridBagConstraintsPresuAsignacion);	
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = 0;		
		this.gridBagConstraintsPresuAsignacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresuAsignacion.add(this.jButtonCancelarPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuAsignacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuAsignacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();						
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuAsignacion.gridx = 0;		
			//this.gridBagConstraintsPresuAsignacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuAsignacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuAsignacion.gridx =0;
		this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuAsignacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresuAsignacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresuAsignacion = new PresuAsignacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Asignacion Presupuesto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Asignacion Presupuesto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Asignacion Presupuesto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresuAsignacionModel presuasignacionModel=new PresuAsignacionModel(this);
			
			//SI USARA CLASE INTERNA
			//PresuAsignacionModel.PresuAsignacionFocusTraversalPolicy presuasignacionFocusTraversalPolicy = presuasignacionModel.new PresuAsignacionFocusTraversalPolicy(this);
			
			//presuasignacionFocusTraversalPolicy.setpresuasignacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presuasignacionModel);
			
			
			this.jContentPaneDetallePresuAsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresuAsignacion = new GridBagLayout();	
			this.jContentPaneDetallePresuAsignacion.setLayout(gridaBagLayoutDetallePresuAsignacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuAsignacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
				this.gridBagConstraintsPresuAsignacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresuAsignacion.gridx = 0;
					
				
				this.jContentPaneDetallePresuAsignacion.add(jTtoolBarDetallePresuAsignacion, gridBagConstraintsPresuAsignacion);								
				
}
			
			this.jScrollPanelDatosEdicionPresuAsignacion=   new JScrollPane(jContentPaneDetallePresuAsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuAsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuAsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuAsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresuAsignacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuAsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuAsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuAsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresuAsignacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresuAsignacion.gridx = 0;
	        
			this.jContentPaneDetallePresuAsignacion.add(jPanelCamposPresuAsignacion, gridBagConstraintsPresuAsignacion);
			
			
			
			
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
						&& presuasignacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presuasignacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresuAsignacion= new GridBagConstraints();
						this.gridBagConstraintsPresuAsignacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresuAsignacion.gridx = 0;
						this.jContentPaneDetallePresuAsignacion.add(this.jTabbedPaneRelacionesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresuAsignacion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresuAsignacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
					this.gridBagConstraintsPresuAsignacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresuAsignacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresuAsignacion.gridx = 0;
					
				
					this.jContentPaneDetallePresuAsignacion.add(jPanelCamposOcultosPresuAsignacion, gridBagConstraintsPresuAsignacion);
				
					this.jPanelCamposOcultosPresuAsignacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresuAsignacion.gridx = 0;
	        this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresuAsignacion.add(this.jPanelAccionesFormularioPresuAsignacion, this.gridBagConstraintsPresuAsignacion);							
			
			
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
	        this.gridBagConstraintsPresuAsignacion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresuAsignacion.gridx = 0;
	        
			
			this.jContentPaneDetallePresuAsignacion.add(this.jPanelAccionesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresuAsignacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresuAsignacion=   new JScrollPane(this.jPanelCamposPresuAsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuAsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuAsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuAsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresuAsignacion.gridx = 0;
			this.gridBagConstraintsPresuAsignacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresuAsignacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresuAsignacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuAsignacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresuAsignacion, this.gridBagConstraintsPresuAsignacion);			
			
			this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
			this.gridBagConstraintsPresuAsignacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuAsignacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuAsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
			
			
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuAsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		
			
		this.gridBagConstraintsPresuAsignacion = new GridBagConstraints();
		this.gridBagConstraintsPresuAsignacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuAsignacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuAsignacion, this.gridBagConstraintsPresuAsignacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresuAsignacion;//jContentPane;
		
		return jScrollPanelDatosEdicionPresuAsignacion;
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
