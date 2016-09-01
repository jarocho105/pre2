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
import com.bydan.erp.nomina.util.NovedadNomiConstantesFunciones;

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
public class NovedadNomiDetalleFormJInternalFrame extends NovedadNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNovedadNomi;
	
	protected JMenuBar jmenuBarDetalleNovedadNomi;
	
	protected JMenu jmenuDetalleNovedadNomi;
	protected JMenu jmenuDetalleArchivoNovedadNomi;
	protected JMenu jmenuDetalleAccionesNovedadNomi;
	protected JMenu jmenuDetalleDatosNovedadNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNovedadNomi;	
	protected GridBagConstraints gridBagConstraintsNovedadNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NovedadNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleNovedadNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadoautorizaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoautoriza="";

	protected TipoNovedadNomiBeanSwingJInternalFrame tiponovedadnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiponovedadnomi="";

	protected EstadoNovedadNomiBeanSwingJInternalFrame estadonovedadnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadonovedadnomi="";
	
	public NovedadNomiSessionBean novedadnomiSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadoautorizaSessionBean;
	public TipoNovedadNomiSessionBean tiponovedadnomiSessionBean;
	public EstadoNovedadNomiSessionBean estadonovedadnomiSessionBean;	
	
	public NovedadNomiLogic novedadnomiLogic;
	
	public JScrollPane jScrollPanelDatosNovedadNomi;
	public JScrollPane jScrollPanelDatosEdicionNovedadNomi;
	public JScrollPane jScrollPanelDatosGeneralNovedadNomi;
	
	protected JPanel jPanelCamposNovedadNomi;    
	protected JPanel jPanelCamposOcultosNovedadNomi;    	
	protected JPanel jPanelAccionesNovedadNomi;
	protected JPanel jPanelAccionesFormularioNovedadNomi;
    
	
	
	protected Integer iXPanelCamposNovedadNomi=0;
	protected Integer iYPanelCamposNovedadNomi=0;
	
	protected Integer iXPanelCamposOcultosNovedadNomi=0;
	protected Integer iYPanelCamposOcultosNovedadNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNovedadNomi;
	public JButton jButtonModificarNovedadNomi;
	public JButton jButtonActualizarNovedadNomi;
    public JButton jButtonEliminarNovedadNomi;
	public JButton jButtonCancelarNovedadNomi;
    public JButton jButtonGuardarCambiosNovedadNomi;
	public JButton jButtonGuardarCambiosTablaNovedadNomi;
	protected JButton jButtonCerrarNovedadNomi;
	
	
	protected JButton jButtonProcesarInformacionNovedadNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNovedadNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNovedadNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNovedadNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNovedadNomi;
	protected JButton jButtonModificarToolBarNovedadNomi;
	protected JButton jButtonActualizarToolBarNovedadNomi;
    protected JButton jButtonEliminarToolBarNovedadNomi;
	protected JButton jButtonCancelarToolBarNovedadNomi;
    protected JButton jButtonGuardarCambiosToolBarNovedadNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarNovedadNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarNovedadNomi;
	protected JButton jButtonCerrarToolBarNovedadNomi;
	
	protected JButton jButtonProcesarInformacionToolBarNovedadNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNovedadNomi;
	protected JMenuItem jMenuItemModificarNovedadNomi;
	protected JMenuItem jMenuItemActualizarNovedadNomi;
    protected JMenuItem jMenuItemEliminarNovedadNomi;
	protected JMenuItem jMenuItemCancelarNovedadNomi;
    protected JMenuItem jMenuItemGuardarCambiosNovedadNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaNovedadNomi;
	protected JMenuItem jMenuItemCerrarNovedadNomi;
	protected JMenuItem jMenuItemDetalleCerrarNovedadNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarNovedadNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionNovedadNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNovedadNomi;
	protected JMenuItem jMenuItemMostrarOcultarNovedadNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNovedadNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNovedadNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNovedadNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNovedadNomi;
	public JLabel jLabelIdNovedadNomi;
	public JLabel jLabelidNovedadNomi;
	public JButton jButtonidNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelfechaNovedadNomi;
	public JLabel jLabelfechaNovedadNomi;
	//public JFormattedTextField jDateChooserfechaNovedadNomi;

	public JDateChooser jDateChooserfechaNovedadNomi;
	public JButton jButtonfechaNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelnumero_horaNovedadNomi;
	public JLabel jLabelnumero_horaNovedadNomi;
	public JTextField jTextFieldnumero_horaNovedadNomi;
	public JButton jButtonnumero_horaNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelnumero_minutoNovedadNomi;
	public JLabel jLabelnumero_minutoNovedadNomi;
	public JTextField jTextFieldnumero_minutoNovedadNomi;
	public JButton jButtonnumero_minutoNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelnumero_jornada_trabajoNovedadNomi;
	public JLabel jLabelnumero_jornada_trabajoNovedadNomi;
	public JTextField jTextFieldnumero_jornada_trabajoNovedadNomi;
	public JButton jButtonnumero_jornada_trabajoNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelanio_vacacionNovedadNomi;
	public JLabel jLabelanio_vacacionNovedadNomi;
	public JTextField jTextFieldanio_vacacionNovedadNomi;
	public JButton jButtonanio_vacacionNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionNovedadNomi;
	public JLabel jLabeldescripcionNovedadNomi;
	public JTextArea jTextAreadescripcionNovedadNomi;
	public JScrollPane jscrollPanedescripcionNovedadNomi;
	public JButton jButtondescripcionNovedadNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNovedadNomi;
	public JLabel jLabelid_empresaNovedadNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNovedadNomi;
	public JButton jButtonid_empresaNovedadNomi= new JButtonMe();
	public JButton jButtonid_empresaNovedadNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoNovedadNomi;
	public JLabel jLabelid_empleadoNovedadNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoNovedadNomi;
	public JButton jButtonid_empleadoNovedadNomi= new JButtonMe();
	public JButton jButtonid_empleadoNovedadNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleadoNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_autorizaNovedadNomi;
	public JLabel jLabelid_empleado_autorizaNovedadNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_autorizaNovedadNomi;
	public JButton jButtonid_empleado_autorizaNovedadNomi= new JButtonMe();
	public JButton jButtonid_empleado_autorizaNovedadNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleado_autorizaNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_novedad_nomiNovedadNomi;
	public JLabel jLabelid_tipo_novedad_nomiNovedadNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_novedad_nomiNovedadNomi;
	public JButton jButtonid_tipo_novedad_nomiNovedadNomi= new JButtonMe();
	public JButton jButtonid_tipo_novedad_nomiNovedadNomiUpdate= new JButtonMe();
	public JButton jButtonid_tipo_novedad_nomiNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_novedad_nomiNovedadNomi;
	public JLabel jLabelid_estado_novedad_nomiNovedadNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_novedad_nomiNovedadNomi;
	public JButton jButtonid_estado_novedad_nomiNovedadNomi= new JButtonMe();
	public JButton jButtonid_estado_novedad_nomiNovedadNomiUpdate= new JButtonMe();
	public JButton jButtonid_estado_novedad_nomiNovedadNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNovedadNomi;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NovedadNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNovedadNomi=new JPanel();
				this.jPanelAccionesFormularioNovedadNomi=new JPanel();
				this.jmenuBarDetalleNovedadNomi=new JMenuBar();
				this.jTtoolBarDetalleNovedadNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NovedadNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNovedadNomi() {
		return this.jButtonActualizarToolBarNovedadNomi;
	}
	
	public JButton getjButtonEliminarToolBarNovedadNomi() {
		return this.jButtonEliminarToolBarNovedadNomi;
	}
	
	public JButton getjButtonCancelarToolBarNovedadNomi() {
		return this.jButtonCancelarToolBarNovedadNomi;
	}		
	
	public JButton getjButtonProcesarInformacionNovedadNomi() {
		return this.jButtonProcesarInformacionNovedadNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNovedadNomi)	{
		this.jButtonProcesarInformacionNovedadNomi = jButtonProcesarInformacionNovedadNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNovedadNomi() {
		return this.jComboBoxTiposAccionesNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNovedadNomi(
			JComboBox jComboBoxTiposRelacionesNovedadNomi) {
		this.jComboBoxTiposRelacionesNovedadNomi = jComboBoxTiposRelacionesNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNovedadNomi(
			JComboBox jComboBoxTiposAccionesNovedadNomi) {
		this.jComboBoxTiposAccionesNovedadNomi = jComboBoxTiposAccionesNovedadNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNovedadNomi() {
		return this.jComboBoxTiposAccionesFormularioNovedadNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNovedadNomi(
			JComboBox jComboBoxTiposAccionesFormularioNovedadNomi) {
		this.jComboBoxTiposAccionesFormularioNovedadNomi = jComboBoxTiposAccionesFormularioNovedadNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.novedadnomiSessionBean=new NovedadNomiSessionBean();
		
		this.novedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.novedadnomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NovedadNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Novedad Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
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
	
		NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNovedadNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNovedadNomi=new JButtonMe();
				this.jButtonModificarToolBarNovedadNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNovedadNomi,this.jTtoolBarDetalleNovedadNomi,
							"actualizar","actualizar","Actualizar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNovedadNomi,this.jTtoolBarDetalleNovedadNomi,
							"eliminar","eliminar","Eliminar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNovedadNomi,this.jTtoolBarDetalleNovedadNomi,
							"cancelar","cancelar","Cancelar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNovedadNomi,this.jTtoolBarDetalleNovedadNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNovedadNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNovedadNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNovedadNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNovedadNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNovedadNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNovedadNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNovedadNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNovedadNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNovedadNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNovedadNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNovedadNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNovedadNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNovedadNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNovedadNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNovedadNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNovedadNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNovedadNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNovedadNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNovedadNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNovedadNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNovedadNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNovedadNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNovedadNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNovedadNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNovedadNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNovedadNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNovedadNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNovedadNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNovedadNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNovedadNomi.add(this.jMenuItemDetalleCerrarNovedadNomi);
		
		this.jmenuDetalleAccionesNovedadNomi.add(this.jMenuItemActualizarNovedadNomi);
		this.jmenuDetalleAccionesNovedadNomi.add(this.jMenuItemEliminarNovedadNomi);
		this.jmenuDetalleAccionesNovedadNomi.add(this.jMenuItemCancelarNovedadNomi);		
		
		//this.jmenuDetalleDatosNovedadNomi.add(this.jMenuItemDetalleAbrirOrderByNovedadNomi);				
		this.jmenuDetalleDatosNovedadNomi.add(this.jMenuItemDetalleMostarOcultarNovedadNomi);				
				
		//this.jmenuDetalleAccionesNovedadNomi.add(this.jMenuItemGuardarCambiosNovedadNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNovedadNomi.add(this.jmenuDetalleArchivoNovedadNomi);		
		this.jmenuBarDetalleNovedadNomi.add(this.jmenuDetalleAccionesNovedadNomi);		
		this.jmenuBarDetalleNovedadNomi.add(this.jmenuDetalleDatosNovedadNomi);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNovedadNomi);				
	}
	
	
	public void inicializarElementosCamposNovedadNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNovedadNomi = new JLabelMe();
		jLabelIdNovedadNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNovedadNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNovedadNomi= new GridBagLayout();

		this.jPanelidNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);

		jLabelidNovedadNomi = new JLabel();
		jLabelidNovedadNomi.setText("Id");

		jLabelidNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaNovedadNomi = new JLabelMe();
		this.jLabelfechaNovedadNomi.setText(""+NovedadNomiConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaNovedadNomi.setToolTipText("Fecha");
		this.jLabelfechaNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutNovedadNomi = new GridBagLayout();
		this.jPanelfechaNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);


		//jFormattedTextFieldfechaNovedadNomi= new JFormattedTextFieldMe();

		jDateChooserfechaNovedadNomi= new JDateChooser();
		jDateChooserfechaNovedadNomi.setEnabled(false);
		jDateChooserfechaNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaNovedadNomi.setDate(new Date());
		jDateChooserfechaNovedadNomi.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaNovedadNomi.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaNovedadNomiBusqueda= new JButtonMe();
		this.jButtonfechaNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaNovedadNomiBusqueda.setText("U");
		this.jButtonfechaNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaNovedadNomiBusqueda"));

		if(this.novedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaNovedadNomiBusqueda.setVisible(false);		}


					
		this.jLabelnumero_horaNovedadNomi = new JLabelMe();
		this.jLabelnumero_horaNovedadNomi.setText(""+NovedadNomiConstantesFunciones.LABEL_NUMEROHORA+" : *");
		this.jLabelnumero_horaNovedadNomi.setToolTipText("Numero Hora");
		this.jLabelnumero_horaNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horaNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horaNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_horaNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_horaNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_horaNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_NUMEROHORA);
		this.gridaBagLayoutNovedadNomi = new GridBagLayout();
		this.jPanelnumero_horaNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);


		jTextFieldnumero_horaNovedadNomi= new JTextFieldMe();
		jTextFieldnumero_horaNovedadNomi.setEnabled(false);
		jTextFieldnumero_horaNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horaNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horaNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_horaNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_horaNovedadNomi.setText("0");

		this.jButtonnumero_horaNovedadNomiBusqueda= new JButtonMe();
		this.jButtonnumero_horaNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horaNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horaNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_horaNovedadNomiBusqueda.setText("U");
		this.jButtonnumero_horaNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_horaNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_horaNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_horaNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_horaNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_horaNovedadNomiBusqueda"));

		if(this.novedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_horaNovedadNomiBusqueda.setVisible(false);		}


					
		this.jLabelnumero_minutoNovedadNomi = new JLabelMe();
		this.jLabelnumero_minutoNovedadNomi.setText(""+NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO+" : *");
		this.jLabelnumero_minutoNovedadNomi.setToolTipText("Numero Minuto");
		this.jLabelnumero_minutoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_minutoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_minutoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_minutoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_minutoNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_minutoNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO);
		this.gridaBagLayoutNovedadNomi = new GridBagLayout();
		this.jPanelnumero_minutoNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);


		jTextFieldnumero_minutoNovedadNomi= new JTextFieldMe();
		jTextFieldnumero_minutoNovedadNomi.setEnabled(false);
		jTextFieldnumero_minutoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_minutoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_minutoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_minutoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_minutoNovedadNomi.setText("0");

		this.jButtonnumero_minutoNovedadNomiBusqueda= new JButtonMe();
		this.jButtonnumero_minutoNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_minutoNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_minutoNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_minutoNovedadNomiBusqueda.setText("U");
		this.jButtonnumero_minutoNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_minutoNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_minutoNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_minutoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_minutoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_minutoNovedadNomiBusqueda"));

		if(this.novedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_minutoNovedadNomiBusqueda.setVisible(false);		}


					
		this.jLabelnumero_jornada_trabajoNovedadNomi = new JLabelMe();
		this.jLabelnumero_jornada_trabajoNovedadNomi.setText(""+NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO+" : *");
		this.jLabelnumero_jornada_trabajoNovedadNomi.setToolTipText("Numero Jornada Trabajo");
		this.jLabelnumero_jornada_trabajoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_jornada_trabajoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_jornada_trabajoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_jornada_trabajoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_jornada_trabajoNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_jornada_trabajoNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO);
		this.gridaBagLayoutNovedadNomi = new GridBagLayout();
		this.jPanelnumero_jornada_trabajoNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);


		jTextFieldnumero_jornada_trabajoNovedadNomi= new JTextFieldMe();
		jTextFieldnumero_jornada_trabajoNovedadNomi.setEnabled(false);
		jTextFieldnumero_jornada_trabajoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_jornada_trabajoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_jornada_trabajoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_jornada_trabajoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_jornada_trabajoNovedadNomi.setText("0");

		this.jButtonnumero_jornada_trabajoNovedadNomiBusqueda= new JButtonMe();
		this.jButtonnumero_jornada_trabajoNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_jornada_trabajoNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_jornada_trabajoNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_jornada_trabajoNovedadNomiBusqueda.setText("U");
		this.jButtonnumero_jornada_trabajoNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_jornada_trabajoNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_jornada_trabajoNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_jornada_trabajoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_jornada_trabajoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_jornada_trabajoNovedadNomiBusqueda"));

		if(this.novedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_jornada_trabajoNovedadNomiBusqueda.setVisible(false);		}


					
		this.jLabelanio_vacacionNovedadNomi = new JLabelMe();
		this.jLabelanio_vacacionNovedadNomi.setText(""+NovedadNomiConstantesFunciones.LABEL_ANIOVACACION+" : *");
		this.jLabelanio_vacacionNovedadNomi.setToolTipText("Anio Vacacion");
		this.jLabelanio_vacacionNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanio_vacacionNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanio_vacacionNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanio_vacacionNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanio_vacacionNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanio_vacacionNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_ANIOVACACION);
		this.gridaBagLayoutNovedadNomi = new GridBagLayout();
		this.jPanelanio_vacacionNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);


		jTextFieldanio_vacacionNovedadNomi= new JTextFieldMe();
		jTextFieldanio_vacacionNovedadNomi.setEnabled(false);
		jTextFieldanio_vacacionNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanio_vacacionNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanio_vacacionNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanio_vacacionNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldanio_vacacionNovedadNomi.setText("0");

		this.jButtonanio_vacacionNovedadNomiBusqueda= new JButtonMe();
		this.jButtonanio_vacacionNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanio_vacacionNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanio_vacacionNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanio_vacacionNovedadNomiBusqueda.setText("U");
		this.jButtonanio_vacacionNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanio_vacacionNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanio_vacacionNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanio_vacacionNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanio_vacacionNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anio_vacacionNovedadNomiBusqueda"));

		if(this.novedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanio_vacacionNovedadNomiBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionNovedadNomi = new JLabelMe();
		this.jLabeldescripcionNovedadNomi.setText(""+NovedadNomiConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionNovedadNomi.setToolTipText("Descripcion");
		this.jLabeldescripcionNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutNovedadNomi = new GridBagLayout();
		this.jPaneldescripcionNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);


		jTextAreadescripcionNovedadNomi= new JTextAreaMe();
		jTextAreadescripcionNovedadNomi.setEnabled(false);
		jTextAreadescripcionNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNovedadNomi.setLineWrap(true);
		jTextAreadescripcionNovedadNomi.setWrapStyleWord(true);
		jTextAreadescripcionNovedadNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionNovedadNomi.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionNovedadNomi = new JScrollPane(jTextAreadescripcionNovedadNomi);
		jscrollPanedescripcionNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionNovedadNomiBusqueda= new JButtonMe();
		this.jButtondescripcionNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionNovedadNomiBusqueda.setText("U");
		this.jButtondescripcionNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionNovedadNomiBusqueda"));

		if(this.novedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionNovedadNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNovedadNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNovedadNomi = new JLabelMe();
		this.jLabelid_empresaNovedadNomi.setText(""+NovedadNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNovedadNomi.setToolTipText("Empresa");
		this.jLabelid_empresaNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNovedadNomi = new GridBagLayout();
		this.jPanelid_empresaNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);


		jComboBoxid_empresaNovedadNomi= new JComboBoxMe();
		jComboBoxid_empresaNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNovedadNomi.setEnabled(false);

		this.jButtonid_empresaNovedadNomi= new JButtonMe();
		this.jButtonid_empresaNovedadNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedadNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedadNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedadNomi.setText("Buscar");
		this.jButtonid_empresaNovedadNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNovedadNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedadNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedadNomi"));

		this.jButtonid_empresaNovedadNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNovedadNomiBusqueda.setText("U");
		this.jButtonid_empresaNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedadNomiBusqueda"));

		if(this.novedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNovedadNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaNovedadNomiUpdate= new JButtonMe();
		this.jButtonid_empresaNovedadNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNovedadNomiUpdate.setText("U");
		this.jButtonid_empresaNovedadNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNovedadNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedadNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedadNomiUpdate"));



					
		this.jLabelid_empleadoNovedadNomi = new JLabelMe();
		this.jLabelid_empleadoNovedadNomi.setText(""+NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoNovedadNomi.setToolTipText("Empleado");
		this.jLabelid_empleadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutNovedadNomi = new GridBagLayout();
		this.jPanelid_empleadoNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);


		jComboBoxid_empleadoNovedadNomi= new JComboBoxMe();
		jComboBoxid_empleadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoNovedadNomi= new JButtonMe();
		this.jButtonid_empleadoNovedadNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNovedadNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNovedadNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNovedadNomi.setText("Buscar");
		this.jButtonid_empleadoNovedadNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoNovedadNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNovedadNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNovedadNomi"));

		this.jButtonid_empleadoNovedadNomiBusqueda= new JButtonMe();
		this.jButtonid_empleadoNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoNovedadNomiBusqueda.setText("U");
		this.jButtonid_empleadoNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNovedadNomiBusqueda"));

		if(this.novedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoNovedadNomiBusqueda.setVisible(false);		}

		this.jButtonid_empleadoNovedadNomiUpdate= new JButtonMe();
		this.jButtonid_empleadoNovedadNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNovedadNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNovedadNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoNovedadNomiUpdate.setText("U");
		this.jButtonid_empleadoNovedadNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoNovedadNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNovedadNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNovedadNomiUpdate"));



					
		this.jLabelid_empleado_autorizaNovedadNomi = new JLabelMe();
		this.jLabelid_empleado_autorizaNovedadNomi.setText(""+NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA+" : *");
		this.jLabelid_empleado_autorizaNovedadNomi.setToolTipText("Empleado Autoriza");
		this.jLabelid_empleado_autorizaNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_autorizaNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_autorizaNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_autorizaNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_autorizaNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_autorizaNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA);
		this.gridaBagLayoutNovedadNomi = new GridBagLayout();
		this.jPanelid_empleado_autorizaNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);


		jComboBoxid_empleado_autorizaNovedadNomi= new JComboBoxMe();
		jComboBoxid_empleado_autorizaNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_autorizaNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_autorizaNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_autorizaNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_autorizaNovedadNomi= new JButtonMe();
		this.jButtonid_empleado_autorizaNovedadNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_autorizaNovedadNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_autorizaNovedadNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_autorizaNovedadNomi.setText("Buscar");
		this.jButtonid_empleado_autorizaNovedadNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_autorizaNovedadNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_autorizaNovedadNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_autorizaNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_autorizaNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_autorizaNovedadNomi"));

		this.jButtonid_empleado_autorizaNovedadNomiBusqueda= new JButtonMe();
		this.jButtonid_empleado_autorizaNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_autorizaNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_autorizaNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_autorizaNovedadNomiBusqueda.setText("U");
		this.jButtonid_empleado_autorizaNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_autorizaNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_autorizaNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_autorizaNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_autorizaNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_autorizaNovedadNomiBusqueda"));

		if(this.novedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_autorizaNovedadNomiBusqueda.setVisible(false);		}

		this.jButtonid_empleado_autorizaNovedadNomiUpdate= new JButtonMe();
		this.jButtonid_empleado_autorizaNovedadNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_autorizaNovedadNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_autorizaNovedadNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_autorizaNovedadNomiUpdate.setText("U");
		this.jButtonid_empleado_autorizaNovedadNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_autorizaNovedadNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_autorizaNovedadNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_autorizaNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_autorizaNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_autorizaNovedadNomiUpdate"));



					
		this.jLabelid_tipo_novedad_nomiNovedadNomi = new JLabelMe();
		this.jLabelid_tipo_novedad_nomiNovedadNomi.setText(""+NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI+" : *");
		this.jLabelid_tipo_novedad_nomiNovedadNomi.setToolTipText("Tipo Novedad Nomi");
		this.jLabelid_tipo_novedad_nomiNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_novedad_nomiNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_novedad_nomiNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_novedad_nomiNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_novedad_nomiNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_novedad_nomiNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI);
		this.gridaBagLayoutNovedadNomi = new GridBagLayout();
		this.jPanelid_tipo_novedad_nomiNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);


		jComboBoxid_tipo_novedad_nomiNovedadNomi= new JComboBoxMe();
		jComboBoxid_tipo_novedad_nomiNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_novedad_nomiNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_novedad_nomiNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_novedad_nomiNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_novedad_nomiNovedadNomi= new JButtonMe();
		this.jButtonid_tipo_novedad_nomiNovedadNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_novedad_nomiNovedadNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_novedad_nomiNovedadNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_novedad_nomiNovedadNomi.setText("Buscar");
		this.jButtonid_tipo_novedad_nomiNovedadNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_novedad_nomiNovedadNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_novedad_nomiNovedadNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_novedad_nomiNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_novedad_nomiNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_novedad_nomiNovedadNomi"));

		this.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda= new JButtonMe();
		this.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda.setText("U");
		this.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_novedad_nomiNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_novedad_nomiNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_novedad_nomiNovedadNomiBusqueda"));

		if(this.novedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda.setVisible(false);		}

		this.jButtonid_tipo_novedad_nomiNovedadNomiUpdate= new JButtonMe();
		this.jButtonid_tipo_novedad_nomiNovedadNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_novedad_nomiNovedadNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_novedad_nomiNovedadNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_novedad_nomiNovedadNomiUpdate.setText("U");
		this.jButtonid_tipo_novedad_nomiNovedadNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_novedad_nomiNovedadNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_novedad_nomiNovedadNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_novedad_nomiNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_novedad_nomiNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_novedad_nomiNovedadNomiUpdate"));



					
		this.jLabelid_estado_novedad_nomiNovedadNomi = new JLabelMe();
		this.jLabelid_estado_novedad_nomiNovedadNomi.setText(""+NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI+" : *");
		this.jLabelid_estado_novedad_nomiNovedadNomi.setToolTipText("Estado Novedad Nomi");
		this.jLabelid_estado_novedad_nomiNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_novedad_nomiNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_novedad_nomiNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_novedad_nomiNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_novedad_nomiNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_novedad_nomiNovedadNomi.setToolTipText(NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI);
		this.gridaBagLayoutNovedadNomi = new GridBagLayout();
		this.jPanelid_estado_novedad_nomiNovedadNomi.setLayout(this.gridaBagLayoutNovedadNomi);


		jComboBoxid_estado_novedad_nomiNovedadNomi= new JComboBoxMe();
		jComboBoxid_estado_novedad_nomiNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_novedad_nomiNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_novedad_nomiNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_novedad_nomiNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_novedad_nomiNovedadNomi= new JButtonMe();
		this.jButtonid_estado_novedad_nomiNovedadNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_novedad_nomiNovedadNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_novedad_nomiNovedadNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_novedad_nomiNovedadNomi.setText("Buscar");
		this.jButtonid_estado_novedad_nomiNovedadNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_novedad_nomiNovedadNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_novedad_nomiNovedadNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_novedad_nomiNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_novedad_nomiNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_novedad_nomiNovedadNomi"));

		this.jButtonid_estado_novedad_nomiNovedadNomiBusqueda= new JButtonMe();
		this.jButtonid_estado_novedad_nomiNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_novedad_nomiNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_novedad_nomiNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_novedad_nomiNovedadNomiBusqueda.setText("U");
		this.jButtonid_estado_novedad_nomiNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_novedad_nomiNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_novedad_nomiNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_novedad_nomiNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_novedad_nomiNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_novedad_nomiNovedadNomiBusqueda"));

		if(this.novedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_novedad_nomiNovedadNomiBusqueda.setVisible(false);		}

		this.jButtonid_estado_novedad_nomiNovedadNomiUpdate= new JButtonMe();
		this.jButtonid_estado_novedad_nomiNovedadNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_novedad_nomiNovedadNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_novedad_nomiNovedadNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_novedad_nomiNovedadNomiUpdate.setText("U");
		this.jButtonid_estado_novedad_nomiNovedadNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_novedad_nomiNovedadNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_novedad_nomiNovedadNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_novedad_nomiNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_novedad_nomiNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_novedad_nomiNovedadNomiUpdate"));



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
		//this.jInternalFrameDetalleNovedadNomi = new NovedadNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Novedad Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNovedadNomi= new GridBagLayout();
		

		
		String sToolTipNovedadNomi="";
		sToolTipNovedadNomi=NovedadNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNovedadNomi+="(Nomina.NovedadNomi)";
		}
		
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipNovedadNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNovedadNomi = new JButtonMe();
		this.jButtonModificarNovedadNomi = new JButtonMe();
        this.jButtonActualizarNovedadNomi = new JButtonMe();
        this.jButtonEliminarNovedadNomi = new JButtonMe();
        this.jButtonCancelarNovedadNomi = new JButtonMe();
        this.jButtonGuardarCambiosNovedadNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaNovedadNomi = new JButtonMe();
		this.jButtonCerrarNovedadNomi = new JButtonMe();
		
		this.jScrollPanelDatosNovedadNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionNovedadNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralNovedadNomi = new JScrollPane();
				
		
		
		this.jPanelCamposNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Novedad Nomi";
		
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosNovedadNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNovedadNomi.setName("jPanelCamposNovedadNomi"); 

		this.jPanelCamposOcultosNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNovedadNomi.setName("jPanelCamposOcultosNovedadNomi"); 

        this.jPanelAccionesNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNovedadNomi.setToolTipText("Acciones");
        this.jPanelAccionesNovedadNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNovedadNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNovedadNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNovedadNomi.setText("Nuevo");
		this.jButtonModificarNovedadNomi.setText("Editar");
        this.jButtonActualizarNovedadNomi.setText("Actualizar");
        this.jButtonEliminarNovedadNomi.setText("Eliminar");
        this.jButtonCancelarNovedadNomi.setText("Cancelar");
        this.jButtonGuardarCambiosNovedadNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaNovedadNomi.setText("Guardar");
		this.jButtonCerrarNovedadNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNovedadNomi,"nuevo_button","Nuevo",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNovedadNomi,"modificar_button","Editar",this.novedadnomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNovedadNomi,"actualizar_button","Actualizar",this.novedadnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNovedadNomi,"eliminar_button","Eliminar",this.novedadnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNovedadNomi,"cancelar_button","Cancelar",this.novedadnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNovedadNomi,"guardarcambios_button","Guardar",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNovedadNomi,"guardarcambiostabla_button","Guardar",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNovedadNomi,"cerrar_button","Salir",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNovedadNomi.setToolTipText("Nuevo"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNovedadNomi.setToolTipText("Editar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNovedadNomi.setToolTipText("Actualizar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNovedadNomi.setToolTipText("Eliminar)"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNovedadNomi.setToolTipText("Cancelar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNovedadNomi.setToolTipText("Guardar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNovedadNomi.setToolTipText("Guardar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNovedadNomi.setToolTipText("Salir"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNovedadNomi";
		inputMap = this.jButtonNuevoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNovedadNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNovedadNomi";
		inputMap = this.jButtonActualizarNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNovedadNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarNovedadNomi";
		inputMap = this.jButtonEliminarNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNovedadNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarNovedadNomi";
		inputMap = this.jButtonCancelarNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNovedadNomi"));
		
		//CERRAR		
		sMapKey = "CerrarNovedadNomi";
		inputMap = this.jButtonCerrarNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNovedadNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNovedadNomi";
		inputMap = this.jButtonGuardarCambiosTablaNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNovedadNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNovedadNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNovedadNomi.setToolTipText("Nuevo NovedadNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNovedadNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNovedadNomi.setToolTipText("Sin Cerrar Ventana NovedadNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNovedadNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNovedadNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNovedadNomi.setText("Accion");
		this.jComboBoxTiposAccionesNovedadNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNovedadNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNovedadNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNovedadNomi = new JLabelMe();
		
		this.jLabelAccionesNovedadNomi.setText("Acciones");		
		this.jLabelAccionesNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNovedadNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNovedadNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNovedadNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNovedadNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNovedadNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNovedadNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNovedadNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNovedadNomi = new GridBagLayout();
		
		this.jPanelCamposNovedadNomi.setLayout(gridaBagLayoutCamposNovedadNomi);
		this.jPanelCamposOcultosNovedadNomi.setLayout(gridaBagLayoutCamposOcultosNovedadNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNovedadNomi.add(jLabelIdNovedadNomi, this.gridBagConstraintsNovedadNomi);



	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNovedadNomi.add(jLabelidNovedadNomi, this.gridBagConstraintsNovedadNomi);


	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaNovedadNomi.add(jLabelid_empresaNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 2;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNovedadNomi.add(jButtonid_empresaNovedadNomiBusqueda, this.gridBagConstraintsNovedadNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 3;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNovedadNomi.add(jButtonid_empresaNovedadNomiUpdate, this.gridBagConstraintsNovedadNomi);
	}

	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaNovedadNomi.add(jComboBoxid_empresaNovedadNomi, this.gridBagConstraintsNovedadNomi);


	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoNovedadNomi.add(jLabelid_empleadoNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 2;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoNovedadNomi.add(jButtonid_empleadoNovedadNomiBusqueda, this.gridBagConstraintsNovedadNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 3;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoNovedadNomi.add(jButtonid_empleadoNovedadNomiUpdate, this.gridBagConstraintsNovedadNomi);
	}

	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoNovedadNomi.add(jComboBoxid_empleadoNovedadNomi, this.gridBagConstraintsNovedadNomi);


	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_autorizaNovedadNomi.add(jLabelid_empleado_autorizaNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 2;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_autorizaNovedadNomi.add(jButtonid_empleado_autorizaNovedadNomiBusqueda, this.gridBagConstraintsNovedadNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 3;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_autorizaNovedadNomi.add(jButtonid_empleado_autorizaNovedadNomiUpdate, this.gridBagConstraintsNovedadNomi);
	}

	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_autorizaNovedadNomi.add(jComboBoxid_empleado_autorizaNovedadNomi, this.gridBagConstraintsNovedadNomi);


	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_novedad_nomiNovedadNomi.add(jLabelid_tipo_novedad_nomiNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 2;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_novedad_nomiNovedadNomi.add(jButtonid_tipo_novedad_nomiNovedadNomiBusqueda, this.gridBagConstraintsNovedadNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 3;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_novedad_nomiNovedadNomi.add(jButtonid_tipo_novedad_nomiNovedadNomiUpdate, this.gridBagConstraintsNovedadNomi);
	}

	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_novedad_nomiNovedadNomi.add(jComboBoxid_tipo_novedad_nomiNovedadNomi, this.gridBagConstraintsNovedadNomi);


	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_novedad_nomiNovedadNomi.add(jLabelid_estado_novedad_nomiNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 2;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_novedad_nomiNovedadNomi.add(jButtonid_estado_novedad_nomiNovedadNomiBusqueda, this.gridBagConstraintsNovedadNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 3;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_novedad_nomiNovedadNomi.add(jButtonid_estado_novedad_nomiNovedadNomiUpdate, this.gridBagConstraintsNovedadNomi);
	}

	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_novedad_nomiNovedadNomi.add(jComboBoxid_estado_novedad_nomiNovedadNomi, this.gridBagConstraintsNovedadNomi);


	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaNovedadNomi.add(jLabelfechaNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 2;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaNovedadNomi.add(jButtonfechaNovedadNomiBusqueda, this.gridBagConstraintsNovedadNomi);
	}

	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaNovedadNomi.add(jDateChooserfechaNovedadNomi, this.gridBagConstraintsNovedadNomi);


	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_horaNovedadNomi.add(jLabelnumero_horaNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 2;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_horaNovedadNomi.add(jButtonnumero_horaNovedadNomiBusqueda, this.gridBagConstraintsNovedadNomi);
	}

	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_horaNovedadNomi.add(jTextFieldnumero_horaNovedadNomi, this.gridBagConstraintsNovedadNomi);


	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_minutoNovedadNomi.add(jLabelnumero_minutoNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 2;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_minutoNovedadNomi.add(jButtonnumero_minutoNovedadNomiBusqueda, this.gridBagConstraintsNovedadNomi);
	}

	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_minutoNovedadNomi.add(jTextFieldnumero_minutoNovedadNomi, this.gridBagConstraintsNovedadNomi);


	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_jornada_trabajoNovedadNomi.add(jLabelnumero_jornada_trabajoNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 2;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_jornada_trabajoNovedadNomi.add(jButtonnumero_jornada_trabajoNovedadNomiBusqueda, this.gridBagConstraintsNovedadNomi);
	}

	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_jornada_trabajoNovedadNomi.add(jTextFieldnumero_jornada_trabajoNovedadNomi, this.gridBagConstraintsNovedadNomi);


	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelanio_vacacionNovedadNomi.add(jLabelanio_vacacionNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 2;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelanio_vacacionNovedadNomi.add(jButtonanio_vacacionNovedadNomiBusqueda, this.gridBagConstraintsNovedadNomi);
	}

	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelanio_vacacionNovedadNomi.add(jTextFieldanio_vacacionNovedadNomi, this.gridBagConstraintsNovedadNomi);


	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 0;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionNovedadNomi.add(jLabeldescripcionNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 2;
		this.gridBagConstraintsNovedadNomi.ipadx = 0;
		this.gridBagConstraintsNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionNovedadNomi.add(jButtondescripcionNovedadNomiBusqueda, this.gridBagConstraintsNovedadNomi);
	}

	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadNomi.gridy = 0;
	this.gridBagConstraintsNovedadNomi.gridx = 1;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionNovedadNomi.add(jscrollPanedescripcionNovedadNomi, this.gridBagConstraintsNovedadNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadNomi.add(this.jPanelidNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposNovedadNomi % 1==0) {
		iXPanelCamposNovedadNomi=0;
		iYPanelCamposNovedadNomi++;
	}
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadNomi.add(this.jPanelid_empleadoNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposNovedadNomi % 1==0) {
		iXPanelCamposNovedadNomi=0;
		iYPanelCamposNovedadNomi++;
	}
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadNomi.add(this.jPanelid_empleado_autorizaNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposNovedadNomi % 1==0) {
		iXPanelCamposNovedadNomi=0;
		iYPanelCamposNovedadNomi++;
	}
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadNomi.add(this.jPanelid_tipo_novedad_nomiNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposNovedadNomi % 1==0) {
		iXPanelCamposNovedadNomi=0;
		iYPanelCamposNovedadNomi++;
	}
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadNomi.add(this.jPanelid_estado_novedad_nomiNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposNovedadNomi % 1==0) {
		iXPanelCamposNovedadNomi=0;
		iYPanelCamposNovedadNomi++;
	}
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadNomi.add(this.jPanelfechaNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposNovedadNomi % 1==0) {
		iXPanelCamposNovedadNomi=0;
		iYPanelCamposNovedadNomi++;
	}
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadNomi.add(this.jPanelnumero_horaNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposNovedadNomi % 1==0) {
		iXPanelCamposNovedadNomi=0;
		iYPanelCamposNovedadNomi++;
	}
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadNomi.add(this.jPanelnumero_minutoNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposNovedadNomi % 1==0) {
		iXPanelCamposNovedadNomi=0;
		iYPanelCamposNovedadNomi++;
	}
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadNomi.add(this.jPanelnumero_jornada_trabajoNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposNovedadNomi % 1==0) {
		iXPanelCamposNovedadNomi=0;
		iYPanelCamposNovedadNomi++;
	}
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadNomi.add(this.jPanelanio_vacacionNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposNovedadNomi % 1==0) {
		iXPanelCamposNovedadNomi=0;
		iYPanelCamposNovedadNomi++;
	}
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadNomi.add(this.jPaneldescripcionNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposNovedadNomi % 1==0) {
		iXPanelCamposNovedadNomi=0;
		iYPanelCamposNovedadNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadNomi.gridy = iYPanelCamposOcultosNovedadNomi;
	this.gridBagConstraintsNovedadNomi.gridx = iXPanelCamposOcultosNovedadNomi++;
	this.gridBagConstraintsNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNovedadNomi.add(this.jPanelid_empresaNovedadNomi, this.gridBagConstraintsNovedadNomi);



	if(iXPanelCamposOcultosNovedadNomi % 1==0) {
		iXPanelCamposOcultosNovedadNomi=0;
		iYPanelCamposOcultosNovedadNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesNovedadNomi= new GridBagLayout();
		this.jPanelAccionesNovedadNomi.setLayout(gridaBagLayoutAccionesNovedadNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNovedadNomi= new GridBagLayout();
		this.jPanelAccionesFormularioNovedadNomi.setLayout(gridaBagLayoutAccionesFormularioNovedadNomi);
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNovedadNomi.add(this.jComboBoxTiposAccionesFormularioNovedadNomi, this.gridBagConstraintsNovedadNomi);

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNovedadNomi.add(this.jCheckBoxPostAccionNuevoNovedadNomi, this.gridBagConstraintsNovedadNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.novedadnomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNovedadNomi.add(this.jCheckBoxPostAccionSinCerrarNovedadNomi, this.gridBagConstraintsNovedadNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.novedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNovedadNomi.add(this.jCheckBoxPostAccionSinMensajeNovedadNomi, this.gridBagConstraintsNovedadNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesNovedadNomi.add(this.jButtonModificarNovedadNomi, this.gridBagConstraintsNovedadNomi);							

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesNovedadNomi.add(this.jButtonEliminarNovedadNomi, this.gridBagConstraintsNovedadNomi);
		
			
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = 0;		
		this.gridBagConstraintsNovedadNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesNovedadNomi.add(this.jButtonActualizarNovedadNomi, this.gridBagConstraintsNovedadNomi);


		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = 0;		
		this.gridBagConstraintsNovedadNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesNovedadNomi.add(this.jButtonGuardarCambiosNovedadNomi, this.gridBagConstraintsNovedadNomi);	
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = 0;		
		this.gridBagConstraintsNovedadNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesNovedadNomi.add(this.jButtonCancelarNovedadNomi, this.gridBagConstraintsNovedadNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNovedadNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNovedadNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();						
			this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedadNomi.gridx = 0;		
			//this.gridBagConstraintsNovedadNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNovedadNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNovedadNomi.gridx =0;
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNovedadNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNovedadNomi, this.gridBagConstraintsNovedadNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NovedadNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNovedadNomi = new NovedadNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Novedad Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Novedad Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Novedad Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NovedadNomiModel novedadnomiModel=new NovedadNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//NovedadNomiModel.NovedadNomiFocusTraversalPolicy novedadnomiFocusTraversalPolicy = novedadnomiModel.new NovedadNomiFocusTraversalPolicy(this);
			
			//novedadnomiFocusTraversalPolicy.setnovedadnomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(novedadnomiModel);
			
			
			this.jContentPaneDetalleNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNovedadNomi = new GridBagLayout();	
			this.jContentPaneDetalleNovedadNomi.setLayout(gridaBagLayoutDetalleNovedadNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNovedadNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
				this.gridBagConstraintsNovedadNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNovedadNomi.gridx = 0;
					
				
				this.jContentPaneDetalleNovedadNomi.add(jTtoolBarDetalleNovedadNomi, gridBagConstraintsNovedadNomi);								
				
}
			
			this.jScrollPanelDatosEdicionNovedadNomi=   new JScrollPane(jContentPaneDetalleNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNovedadNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNovedadNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNovedadNomi.gridx = 0;
	        
			this.jContentPaneDetalleNovedadNomi.add(jPanelCamposNovedadNomi, gridBagConstraintsNovedadNomi);
			
			
			
			
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
						&& novedadnomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.novedadnomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNovedadNomi= new GridBagConstraints();
						this.gridBagConstraintsNovedadNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNovedadNomi.gridx = 0;
						this.jContentPaneDetalleNovedadNomi.add(this.jTabbedPaneRelacionesNovedadNomi, this.gridBagConstraintsNovedadNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNovedadNomi.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNovedadNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
					this.gridBagConstraintsNovedadNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNovedadNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNovedadNomi.gridx = 0;
					
				
					this.jContentPaneDetalleNovedadNomi.add(jPanelCamposOcultosNovedadNomi, gridBagConstraintsNovedadNomi);
				
					this.jPanelCamposOcultosNovedadNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsNovedadNomi.gridx = 0;
	        this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNovedadNomi.add(this.jPanelAccionesFormularioNovedadNomi, this.gridBagConstraintsNovedadNomi);							
			
			
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
	        this.gridBagConstraintsNovedadNomi.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsNovedadNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleNovedadNomi.add(this.jPanelAccionesNovedadNomi, this.gridBagConstraintsNovedadNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNovedadNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNovedadNomi=   new JScrollPane(this.jPanelCamposNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNovedadNomi.gridx = 0;
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNovedadNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNovedadNomi, this.gridBagConstraintsNovedadNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNovedadNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNovedadNomi, this.gridBagConstraintsNovedadNomi);			
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNovedadNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNovedadNomi, this.gridBagConstraintsNovedadNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNovedadNomi, this.gridBagConstraintsNovedadNomi);
			
			
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNovedadNomi, this.gridBagConstraintsNovedadNomi);
		
			
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNovedadNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNovedadNomi, this.gridBagConstraintsNovedadNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNovedadNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionNovedadNomi;
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
