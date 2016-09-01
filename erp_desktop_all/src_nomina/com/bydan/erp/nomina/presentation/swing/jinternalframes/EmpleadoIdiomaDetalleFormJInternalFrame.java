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
import com.bydan.erp.nomina.util.EmpleadoIdiomaConstantesFunciones;

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
public class EmpleadoIdiomaDetalleFormJInternalFrame extends EmpleadoIdiomaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleadoIdioma;
	
	protected JMenuBar jmenuBarDetalleEmpleadoIdioma;
	
	protected JMenu jmenuDetalleEmpleadoIdioma;
	protected JMenu jmenuDetalleArchivoEmpleadoIdioma;
	protected JMenu jmenuDetalleAccionesEmpleadoIdioma;
	protected JMenu jmenuDetalleDatosEmpleadoIdioma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoIdioma;	
	protected GridBagConstraints gridBagConstraintsEmpleadoIdioma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoIdiomaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleadoIdioma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected IdiomaBeanSwingJInternalFrame idiomaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_idioma="";
	
	public EmpleadoIdiomaSessionBean empleadoidiomaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public IdiomaSessionBean idiomaSessionBean;	
	
	public EmpleadoIdiomaLogic empleadoidiomaLogic;
	
	public JScrollPane jScrollPanelDatosEmpleadoIdioma;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoIdioma;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoIdioma;
	
	protected JPanel jPanelCamposEmpleadoIdioma;    
	protected JPanel jPanelCamposOcultosEmpleadoIdioma;    	
	protected JPanel jPanelAccionesEmpleadoIdioma;
	protected JPanel jPanelAccionesFormularioEmpleadoIdioma;
    
	
	
	protected Integer iXPanelCamposEmpleadoIdioma=0;
	protected Integer iYPanelCamposEmpleadoIdioma=0;
	
	protected Integer iXPanelCamposOcultosEmpleadoIdioma=0;
	protected Integer iYPanelCamposOcultosEmpleadoIdioma=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleadoIdioma;
	public JButton jButtonModificarEmpleadoIdioma;
	public JButton jButtonActualizarEmpleadoIdioma;
    public JButton jButtonEliminarEmpleadoIdioma;
	public JButton jButtonCancelarEmpleadoIdioma;
    public JButton jButtonGuardarCambiosEmpleadoIdioma;
	public JButton jButtonGuardarCambiosTablaEmpleadoIdioma;
	protected JButton jButtonCerrarEmpleadoIdioma;
	
	
	protected JButton jButtonProcesarInformacionEmpleadoIdioma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleadoIdioma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleadoIdioma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleadoIdioma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoIdioma;
	protected JButton jButtonModificarToolBarEmpleadoIdioma;
	protected JButton jButtonActualizarToolBarEmpleadoIdioma;
    protected JButton jButtonEliminarToolBarEmpleadoIdioma;
	protected JButton jButtonCancelarToolBarEmpleadoIdioma;
    protected JButton jButtonGuardarCambiosToolBarEmpleadoIdioma;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleadoIdioma;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoIdioma;
	protected JButton jButtonCerrarToolBarEmpleadoIdioma;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleadoIdioma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoIdioma;
	protected JMenuItem jMenuItemModificarEmpleadoIdioma;
	protected JMenuItem jMenuItemActualizarEmpleadoIdioma;
    protected JMenuItem jMenuItemEliminarEmpleadoIdioma;
	protected JMenuItem jMenuItemCancelarEmpleadoIdioma;
    protected JMenuItem jMenuItemGuardarCambiosEmpleadoIdioma;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoIdioma;
	protected JMenuItem jMenuItemCerrarEmpleadoIdioma;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoIdioma;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoIdioma;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoIdioma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoIdioma;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoIdioma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoIdioma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoIdioma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleadoIdioma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleadoIdioma;
	public JLabel jLabelIdEmpleadoIdioma;
	public JLabel jLabelidEmpleadoIdioma;
	public JButton jButtonidEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPaneles_maternaEmpleadoIdioma;
	public JLabel jLabeles_maternaEmpleadoIdioma;
	public JCheckBox jCheckBoxes_maternaEmpleadoIdioma;
	public JButton jButtones_maternaEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPaneles_tecnicoEmpleadoIdioma;
	public JLabel jLabeles_tecnicoEmpleadoIdioma;
	public JCheckBox jCheckBoxes_tecnicoEmpleadoIdioma;
	public JButton jButtones_tecnicoEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPanelporcen_tecnicoEmpleadoIdioma;
	public JLabel jLabelporcen_tecnicoEmpleadoIdioma;
	public JTextField jTextFieldporcen_tecnicoEmpleadoIdioma;
	public JButton jButtonporcen_tecnicoEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPaneles_lecturaEmpleadoIdioma;
	public JLabel jLabeles_lecturaEmpleadoIdioma;
	public JCheckBox jCheckBoxes_lecturaEmpleadoIdioma;
	public JButton jButtones_lecturaEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPanelporcen_lecturaEmpleadoIdioma;
	public JLabel jLabelporcen_lecturaEmpleadoIdioma;
	public JTextField jTextFieldporcen_lecturaEmpleadoIdioma;
	public JButton jButtonporcen_lecturaEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPaneles_escritoEmpleadoIdioma;
	public JLabel jLabeles_escritoEmpleadoIdioma;
	public JCheckBox jCheckBoxes_escritoEmpleadoIdioma;
	public JButton jButtones_escritoEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPanelporcen_escritoEmpleadoIdioma;
	public JLabel jLabelporcen_escritoEmpleadoIdioma;
	public JTextField jTextFieldporcen_escritoEmpleadoIdioma;
	public JButton jButtonporcen_escritoEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPaneles_habladoEmpleadoIdioma;
	public JLabel jLabeles_habladoEmpleadoIdioma;
	public JCheckBox jCheckBoxes_habladoEmpleadoIdioma;
	public JButton jButtones_habladoEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPanelporcen_habladoEmpleadoIdioma;
	public JLabel jLabelporcen_habladoEmpleadoIdioma;
	public JTextField jTextFieldporcen_habladoEmpleadoIdioma;
	public JButton jButtonporcen_habladoEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionEmpleadoIdioma;
	public JLabel jLabeldescripcionEmpleadoIdioma;
	public JTextArea jTextAreadescripcionEmpleadoIdioma;
	public JScrollPane jscrollPanedescripcionEmpleadoIdioma;
	public JButton jButtondescripcionEmpleadoIdiomaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleadoIdioma;
	public JLabel jLabelid_empresaEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleadoIdioma;
	public JButton jButtonid_empresaEmpleadoIdioma= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoIdiomaUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEmpleadoIdioma;
	public JLabel jLabelid_empleadoEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmpleadoIdioma;
	public JButton jButtonid_empleadoEmpleadoIdioma= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoIdiomaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoIdiomaBusqueda= new JButtonMe();

	public JPanel jPanelid_idiomaEmpleadoIdioma;
	public JLabel jLabelid_idiomaEmpleadoIdioma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_idiomaEmpleadoIdioma;
	public JButton jButtonid_idiomaEmpleadoIdioma= new JButtonMe();
	public JButton jButtonid_idiomaEmpleadoIdiomaUpdate= new JButtonMe();
	public JButton jButtonid_idiomaEmpleadoIdiomaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleadoIdioma;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpleadoIdiomaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleadoIdioma=new JPanel();
				this.jPanelAccionesFormularioEmpleadoIdioma=new JPanel();
				this.jmenuBarDetalleEmpleadoIdioma=new JMenuBar();
				this.jTtoolBarDetalleEmpleadoIdioma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoIdiomaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpleadoIdioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoIdiomaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpleadoIdioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoIdiomaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoIdioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoIdiomaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoIdioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoIdiomaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoIdioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleadoIdioma() {
		return this.jButtonActualizarToolBarEmpleadoIdioma;
	}
	
	public JButton getjButtonEliminarToolBarEmpleadoIdioma() {
		return this.jButtonEliminarToolBarEmpleadoIdioma;
	}
	
	public JButton getjButtonCancelarToolBarEmpleadoIdioma() {
		return this.jButtonCancelarToolBarEmpleadoIdioma;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleadoIdioma() {
		return this.jButtonProcesarInformacionEmpleadoIdioma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoIdioma)	{
		this.jButtonProcesarInformacionEmpleadoIdioma = jButtonProcesarInformacionEmpleadoIdioma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoIdioma() {
		return this.jComboBoxTiposAccionesEmpleadoIdioma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoIdioma(
			JComboBox jComboBoxTiposRelacionesEmpleadoIdioma) {
		this.jComboBoxTiposRelacionesEmpleadoIdioma = jComboBoxTiposRelacionesEmpleadoIdioma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoIdioma(
			JComboBox jComboBoxTiposAccionesEmpleadoIdioma) {
		this.jComboBoxTiposAccionesEmpleadoIdioma = jComboBoxTiposAccionesEmpleadoIdioma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleadoIdioma() {
		return this.jComboBoxTiposAccionesFormularioEmpleadoIdioma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleadoIdioma(
			JComboBox jComboBoxTiposAccionesFormularioEmpleadoIdioma) {
		this.jComboBoxTiposAccionesFormularioEmpleadoIdioma = jComboBoxTiposAccionesFormularioEmpleadoIdioma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
		
		this.empleadoidiomaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoidiomaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoidiomaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoIdiomaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoIdiomaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoIdiomaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Idioma MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoIdiomaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleadoIdioma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleadoIdioma=new JButtonMe();
				this.jButtonModificarToolBarEmpleadoIdioma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleadoIdioma,this.jTtoolBarDetalleEmpleadoIdioma,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleadoIdioma,this.jTtoolBarDetalleEmpleadoIdioma,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleadoIdioma,this.jTtoolBarDetalleEmpleadoIdioma,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleadoIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleadoIdioma,this.jTtoolBarDetalleEmpleadoIdioma,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleadoIdioma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleadoIdioma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleadoIdioma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleadoIdioma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleadoIdioma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoIdioma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoIdioma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoIdioma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleadoIdioma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleadoIdioma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleadoIdioma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleadoIdioma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleadoIdioma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleadoIdioma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleadoIdioma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleadoIdioma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleadoIdioma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleadoIdioma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleadoIdioma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleadoIdioma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleadoIdioma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoIdioma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoIdioma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoIdioma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoIdioma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoIdioma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleadoIdioma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleadoIdioma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleadoIdioma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoIdioma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoIdioma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoIdioma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoIdioma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoIdioma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoIdioma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleadoIdioma.add(this.jMenuItemDetalleCerrarEmpleadoIdioma);
		
		this.jmenuDetalleAccionesEmpleadoIdioma.add(this.jMenuItemActualizarEmpleadoIdioma);
		this.jmenuDetalleAccionesEmpleadoIdioma.add(this.jMenuItemEliminarEmpleadoIdioma);
		this.jmenuDetalleAccionesEmpleadoIdioma.add(this.jMenuItemCancelarEmpleadoIdioma);		
		
		//this.jmenuDetalleDatosEmpleadoIdioma.add(this.jMenuItemDetalleAbrirOrderByEmpleadoIdioma);				
		this.jmenuDetalleDatosEmpleadoIdioma.add(this.jMenuItemDetalleMostarOcultarEmpleadoIdioma);				
				
		//this.jmenuDetalleAccionesEmpleadoIdioma.add(this.jMenuItemGuardarCambiosEmpleadoIdioma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleadoIdioma.add(this.jmenuDetalleArchivoEmpleadoIdioma);		
		this.jmenuBarDetalleEmpleadoIdioma.add(this.jmenuDetalleAccionesEmpleadoIdioma);		
		this.jmenuBarDetalleEmpleadoIdioma.add(this.jmenuDetalleDatosEmpleadoIdioma);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleadoIdioma);				
	}
	
	
	public void inicializarElementosCamposEmpleadoIdioma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleadoIdioma = new JLabelMe();
		jLabelIdEmpleadoIdioma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleadoIdioma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleadoIdioma= new GridBagLayout();

		this.jPanelidEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);

		jLabelidEmpleadoIdioma = new JLabel();
		jLabelidEmpleadoIdioma.setText("Id");

		jLabelidEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeles_maternaEmpleadoIdioma = new JLabelMe();
		this.jLabeles_maternaEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA+" : *");
		this.jLabeles_maternaEmpleadoIdioma.setToolTipText("Es Materna");
		this.jLabeles_maternaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_maternaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_maternaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_maternaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_maternaEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_maternaEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPaneles_maternaEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jCheckBoxes_maternaEmpleadoIdioma= new JCheckBoxMe();
		jCheckBoxes_maternaEmpleadoIdioma.setEnabled(false);

		jCheckBoxes_maternaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_maternaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_maternaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_maternaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_maternaEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtones_maternaEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_maternaEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_maternaEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_maternaEmpleadoIdiomaBusqueda.setText("U");
		this.jButtones_maternaEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_maternaEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_maternaEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_maternaEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_maternaEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_maternaEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_maternaEmpleadoIdiomaBusqueda.setVisible(false);		}


					
		this.jLabeles_tecnicoEmpleadoIdioma = new JLabelMe();
		this.jLabeles_tecnicoEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO+" : *");
		this.jLabeles_tecnicoEmpleadoIdioma.setToolTipText("Es Tecnico");
		this.jLabeles_tecnicoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_tecnicoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_tecnicoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_tecnicoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_tecnicoEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_tecnicoEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPaneles_tecnicoEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jCheckBoxes_tecnicoEmpleadoIdioma= new JCheckBoxMe();
		jCheckBoxes_tecnicoEmpleadoIdioma.setEnabled(false);

		jCheckBoxes_tecnicoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_tecnicoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_tecnicoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_tecnicoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_tecnicoEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtones_tecnicoEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_tecnicoEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_tecnicoEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_tecnicoEmpleadoIdiomaBusqueda.setText("U");
		this.jButtones_tecnicoEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_tecnicoEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_tecnicoEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_tecnicoEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_tecnicoEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_tecnicoEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_tecnicoEmpleadoIdiomaBusqueda.setVisible(false);		}


					
		this.jLabelporcen_tecnicoEmpleadoIdioma = new JLabelMe();
		this.jLabelporcen_tecnicoEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO+" : *");
		this.jLabelporcen_tecnicoEmpleadoIdioma.setToolTipText("Porcen Tecnico");
		this.jLabelporcen_tecnicoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_tecnicoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_tecnicoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_tecnicoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_tecnicoEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_tecnicoEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPanelporcen_tecnicoEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jTextFieldporcen_tecnicoEmpleadoIdioma= new JTextFieldMe();
		jTextFieldporcen_tecnicoEmpleadoIdioma.setEnabled(false);
		jTextFieldporcen_tecnicoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_tecnicoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_tecnicoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_tecnicoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_tecnicoEmpleadoIdioma.setText("0");

		this.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda.setText("U");
		this.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_tecnicoEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_tecnicoEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_tecnicoEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda.setVisible(false);		}


					
		this.jLabeles_lecturaEmpleadoIdioma = new JLabelMe();
		this.jLabeles_lecturaEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA+" : *");
		this.jLabeles_lecturaEmpleadoIdioma.setToolTipText("Es Lectura");
		this.jLabeles_lecturaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_lecturaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_lecturaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_lecturaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_lecturaEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_lecturaEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPaneles_lecturaEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jCheckBoxes_lecturaEmpleadoIdioma= new JCheckBoxMe();
		jCheckBoxes_lecturaEmpleadoIdioma.setEnabled(false);

		jCheckBoxes_lecturaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_lecturaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_lecturaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_lecturaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_lecturaEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtones_lecturaEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_lecturaEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_lecturaEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_lecturaEmpleadoIdiomaBusqueda.setText("U");
		this.jButtones_lecturaEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_lecturaEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_lecturaEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_lecturaEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_lecturaEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_lecturaEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_lecturaEmpleadoIdiomaBusqueda.setVisible(false);		}


					
		this.jLabelporcen_lecturaEmpleadoIdioma = new JLabelMe();
		this.jLabelporcen_lecturaEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA+" : *");
		this.jLabelporcen_lecturaEmpleadoIdioma.setToolTipText("Porcen Lectura");
		this.jLabelporcen_lecturaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_lecturaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_lecturaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_lecturaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_lecturaEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_lecturaEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPanelporcen_lecturaEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jTextFieldporcen_lecturaEmpleadoIdioma= new JTextFieldMe();
		jTextFieldporcen_lecturaEmpleadoIdioma.setEnabled(false);
		jTextFieldporcen_lecturaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_lecturaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_lecturaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_lecturaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_lecturaEmpleadoIdioma.setText("0");

		this.jButtonporcen_lecturaEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtonporcen_lecturaEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_lecturaEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_lecturaEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_lecturaEmpleadoIdiomaBusqueda.setText("U");
		this.jButtonporcen_lecturaEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_lecturaEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_lecturaEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_lecturaEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_lecturaEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_lecturaEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_lecturaEmpleadoIdiomaBusqueda.setVisible(false);		}


					
		this.jLabeles_escritoEmpleadoIdioma = new JLabelMe();
		this.jLabeles_escritoEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO+" : *");
		this.jLabeles_escritoEmpleadoIdioma.setToolTipText("Es Escrito");
		this.jLabeles_escritoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_escritoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_escritoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_escritoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_escritoEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_escritoEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPaneles_escritoEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jCheckBoxes_escritoEmpleadoIdioma= new JCheckBoxMe();
		jCheckBoxes_escritoEmpleadoIdioma.setEnabled(false);

		jCheckBoxes_escritoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_escritoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_escritoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_escritoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_escritoEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtones_escritoEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_escritoEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_escritoEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_escritoEmpleadoIdiomaBusqueda.setText("U");
		this.jButtones_escritoEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_escritoEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_escritoEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_escritoEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_escritoEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_escritoEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_escritoEmpleadoIdiomaBusqueda.setVisible(false);		}


					
		this.jLabelporcen_escritoEmpleadoIdioma = new JLabelMe();
		this.jLabelporcen_escritoEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO+" : *");
		this.jLabelporcen_escritoEmpleadoIdioma.setToolTipText("Porcen Escrito");
		this.jLabelporcen_escritoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_escritoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_escritoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_escritoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_escritoEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_escritoEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPanelporcen_escritoEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jTextFieldporcen_escritoEmpleadoIdioma= new JTextFieldMe();
		jTextFieldporcen_escritoEmpleadoIdioma.setEnabled(false);
		jTextFieldporcen_escritoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_escritoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_escritoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_escritoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_escritoEmpleadoIdioma.setText("0");

		this.jButtonporcen_escritoEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtonporcen_escritoEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_escritoEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_escritoEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_escritoEmpleadoIdiomaBusqueda.setText("U");
		this.jButtonporcen_escritoEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_escritoEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_escritoEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_escritoEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_escritoEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_escritoEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_escritoEmpleadoIdiomaBusqueda.setVisible(false);		}


					
		this.jLabeles_habladoEmpleadoIdioma = new JLabelMe();
		this.jLabeles_habladoEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO+" : *");
		this.jLabeles_habladoEmpleadoIdioma.setToolTipText("Es Hablado");
		this.jLabeles_habladoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_habladoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_habladoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_habladoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_habladoEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_habladoEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPaneles_habladoEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jCheckBoxes_habladoEmpleadoIdioma= new JCheckBoxMe();
		jCheckBoxes_habladoEmpleadoIdioma.setEnabled(false);

		jCheckBoxes_habladoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_habladoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_habladoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_habladoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_habladoEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtones_habladoEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_habladoEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_habladoEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_habladoEmpleadoIdiomaBusqueda.setText("U");
		this.jButtones_habladoEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_habladoEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_habladoEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_habladoEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_habladoEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_habladoEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_habladoEmpleadoIdiomaBusqueda.setVisible(false);		}


					
		this.jLabelporcen_habladoEmpleadoIdioma = new JLabelMe();
		this.jLabelporcen_habladoEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO+" : *");
		this.jLabelporcen_habladoEmpleadoIdioma.setToolTipText("Porcen Hablado");
		this.jLabelporcen_habladoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_habladoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_habladoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_habladoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_habladoEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_habladoEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPanelporcen_habladoEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jTextFieldporcen_habladoEmpleadoIdioma= new JTextFieldMe();
		jTextFieldporcen_habladoEmpleadoIdioma.setEnabled(false);
		jTextFieldporcen_habladoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_habladoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_habladoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_habladoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_habladoEmpleadoIdioma.setText("0");

		this.jButtonporcen_habladoEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtonporcen_habladoEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_habladoEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_habladoEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_habladoEmpleadoIdiomaBusqueda.setText("U");
		this.jButtonporcen_habladoEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_habladoEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_habladoEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_habladoEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_habladoEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_habladoEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_habladoEmpleadoIdiomaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionEmpleadoIdioma = new JLabelMe();
		this.jLabeldescripcionEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionEmpleadoIdioma.setToolTipText("Descripcion");
		this.jLabeldescripcionEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPaneldescripcionEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jTextAreadescripcionEmpleadoIdioma= new JTextAreaMe();
		jTextAreadescripcionEmpleadoIdioma.setEnabled(false);
		jTextAreadescripcionEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoIdioma.setLineWrap(true);
		jTextAreadescripcionEmpleadoIdioma.setWrapStyleWord(true);
		jTextAreadescripcionEmpleadoIdioma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionEmpleadoIdioma.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionEmpleadoIdioma = new JScrollPane(jTextAreadescripcionEmpleadoIdioma);
		jscrollPanedescripcionEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtondescripcionEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionEmpleadoIdiomaBusqueda.setText("U");
		this.jButtondescripcionEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionEmpleadoIdiomaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpleadoIdioma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleadoIdioma = new JLabelMe();
		this.jLabelid_empresaEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleadoIdioma.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPanelid_empresaEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jComboBoxid_empresaEmpleadoIdioma= new JComboBoxMe();
		jComboBoxid_empresaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleadoIdioma.setEnabled(false);

		this.jButtonid_empresaEmpleadoIdioma= new JButtonMe();
		this.jButtonid_empresaEmpleadoIdioma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoIdioma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoIdioma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoIdioma.setText("Buscar");
		this.jButtonid_empresaEmpleadoIdioma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleadoIdioma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoIdioma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoIdioma"));

		this.jButtonid_empresaEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoIdiomaBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoIdiomaBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoIdiomaUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoIdiomaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoIdiomaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoIdiomaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoIdiomaUpdate.setText("U");
		this.jButtonid_empresaEmpleadoIdiomaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoIdiomaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoIdiomaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoIdiomaUpdate"));



					
		this.jLabelid_empleadoEmpleadoIdioma = new JLabelMe();
		this.jLabelid_empleadoEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmpleadoIdioma.setToolTipText("Empleado");
		this.jLabelid_empleadoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPanelid_empleadoEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jComboBoxid_empleadoEmpleadoIdioma= new JComboBoxMe();
		jComboBoxid_empleadoEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmpleadoIdioma= new JButtonMe();
		this.jButtonid_empleadoEmpleadoIdioma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoIdioma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoIdioma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoIdioma.setText("Buscar");
		this.jButtonid_empleadoEmpleadoIdioma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmpleadoIdioma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoIdioma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoIdioma"));

		this.jButtonid_empleadoEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoIdiomaBusqueda.setText("U");
		this.jButtonid_empleadoEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmpleadoIdiomaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmpleadoIdiomaUpdate= new JButtonMe();
		this.jButtonid_empleadoEmpleadoIdiomaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoIdiomaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoIdiomaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoIdiomaUpdate.setText("U");
		this.jButtonid_empleadoEmpleadoIdiomaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmpleadoIdiomaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoIdiomaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoIdiomaUpdate"));



					
		this.jLabelid_idiomaEmpleadoIdioma = new JLabelMe();
		this.jLabelid_idiomaEmpleadoIdioma.setText(""+EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA+" : *");
		this.jLabelid_idiomaEmpleadoIdioma.setToolTipText("Idioma");
		this.jLabelid_idiomaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_idiomaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_idiomaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_idiomaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_idiomaEmpleadoIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_idiomaEmpleadoIdioma.setToolTipText(EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA);
		this.gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		this.jPanelid_idiomaEmpleadoIdioma.setLayout(this.gridaBagLayoutEmpleadoIdioma);


		jComboBoxid_idiomaEmpleadoIdioma= new JComboBoxMe();
		jComboBoxid_idiomaEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_idiomaEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_idiomaEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_idiomaEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_idiomaEmpleadoIdioma= new JButtonMe();
		this.jButtonid_idiomaEmpleadoIdioma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_idiomaEmpleadoIdioma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_idiomaEmpleadoIdioma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_idiomaEmpleadoIdioma.setText("Buscar");
		this.jButtonid_idiomaEmpleadoIdioma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_idiomaEmpleadoIdioma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_idiomaEmpleadoIdioma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_idiomaEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_idiomaEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_idiomaEmpleadoIdioma"));

		this.jButtonid_idiomaEmpleadoIdiomaBusqueda= new JButtonMe();
		this.jButtonid_idiomaEmpleadoIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_idiomaEmpleadoIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_idiomaEmpleadoIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_idiomaEmpleadoIdiomaBusqueda.setText("U");
		this.jButtonid_idiomaEmpleadoIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_idiomaEmpleadoIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_idiomaEmpleadoIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_idiomaEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_idiomaEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_idiomaEmpleadoIdiomaBusqueda"));

		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_idiomaEmpleadoIdiomaBusqueda.setVisible(false);		}

		this.jButtonid_idiomaEmpleadoIdiomaUpdate= new JButtonMe();
		this.jButtonid_idiomaEmpleadoIdiomaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_idiomaEmpleadoIdiomaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_idiomaEmpleadoIdiomaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_idiomaEmpleadoIdiomaUpdate.setText("U");
		this.jButtonid_idiomaEmpleadoIdiomaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_idiomaEmpleadoIdiomaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_idiomaEmpleadoIdiomaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_idiomaEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_idiomaEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_idiomaEmpleadoIdiomaUpdate"));



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
		//this.jInternalFrameDetalleEmpleadoIdioma = new EmpleadoIdiomaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado Idioma DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoIdioma= new GridBagLayout();
		

		
		String sToolTipEmpleadoIdioma="";
		sToolTipEmpleadoIdioma=EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoIdioma+="(Nomina.EmpleadoIdioma)";
		}
		
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoIdioma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleadoIdioma = new JButtonMe();
		this.jButtonModificarEmpleadoIdioma = new JButtonMe();
        this.jButtonActualizarEmpleadoIdioma = new JButtonMe();
        this.jButtonEliminarEmpleadoIdioma = new JButtonMe();
        this.jButtonCancelarEmpleadoIdioma = new JButtonMe();
        this.jButtonGuardarCambiosEmpleadoIdioma = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleadoIdioma = new JButtonMe();
		this.jButtonCerrarEmpleadoIdioma = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoIdioma = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleadoIdioma = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleadoIdioma = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Idioma";
		
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Idiomas" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoIdioma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleadoIdioma.setName("jPanelCamposEmpleadoIdioma"); 

		this.jPanelCamposOcultosEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleadoIdioma.setName("jPanelCamposOcultosEmpleadoIdioma"); 

        this.jPanelAccionesEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoIdioma.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoIdioma.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleadoIdioma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleadoIdioma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleadoIdioma.setText("Nuevo");
		this.jButtonModificarEmpleadoIdioma.setText("Editar");
        this.jButtonActualizarEmpleadoIdioma.setText("Actualizar");
        this.jButtonEliminarEmpleadoIdioma.setText("Eliminar");
        this.jButtonCancelarEmpleadoIdioma.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleadoIdioma.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleadoIdioma.setText("Guardar");
		this.jButtonCerrarEmpleadoIdioma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoIdioma,"nuevo_button","Nuevo",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleadoIdioma,"modificar_button","Editar",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleadoIdioma,"actualizar_button","Actualizar",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleadoIdioma,"eliminar_button","Eliminar",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleadoIdioma,"cancelar_button","Cancelar",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleadoIdioma,"guardarcambios_button","Guardar",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoIdioma,"guardarcambiostabla_button","Guardar",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoIdioma,"cerrar_button","Salir",this.empleadoidiomaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleadoIdioma.setToolTipText("Nuevo"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleadoIdioma.setToolTipText("Editar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleadoIdioma.setToolTipText("Actualizar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleadoIdioma.setToolTipText("Eliminar)"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleadoIdioma.setToolTipText("Cancelar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleadoIdioma.setToolTipText("Guardar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleadoIdioma.setToolTipText("Guardar"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoIdioma.setToolTipText("Salir"+" "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoIdioma";
		inputMap = this.jButtonNuevoEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoIdioma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoIdioma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleadoIdioma";
		inputMap = this.jButtonActualizarEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleadoIdioma"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleadoIdioma";
		inputMap = this.jButtonEliminarEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleadoIdioma"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleadoIdioma";
		inputMap = this.jButtonCancelarEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleadoIdioma"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoIdioma";
		inputMap = this.jButtonCerrarEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoIdioma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoIdioma";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoIdioma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleadoIdioma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleadoIdioma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleadoIdioma.setToolTipText("Nuevo EmpleadoIdioma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleadoIdioma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleadoIdioma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleadoIdioma.setToolTipText("Sin Cerrar Ventana EmpleadoIdioma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleadoIdioma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleadoIdioma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleadoIdioma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleadoIdioma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoIdioma.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoIdioma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleadoIdioma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleadoIdioma = new JLabelMe();
		
		this.jLabelAccionesEmpleadoIdioma.setText("Acciones");		
		this.jLabelAccionesEmpleadoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleadoIdioma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleadoIdioma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleadoIdioma=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleadoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleadoIdioma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleadoIdioma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoIdioma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoIdioma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleadoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleadoIdioma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleadoIdioma = new GridBagLayout();
		
		this.jPanelCamposEmpleadoIdioma.setLayout(gridaBagLayoutCamposEmpleadoIdioma);
		this.jPanelCamposOcultosEmpleadoIdioma.setLayout(gridaBagLayoutCamposOcultosEmpleadoIdioma);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleadoIdioma.add(jLabelIdEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleadoIdioma.add(jLabelidEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleadoIdioma.add(jLabelid_empresaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoIdioma.add(jButtonid_empresaEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 3;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoIdioma.add(jButtonid_empresaEmpleadoIdiomaUpdate, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleadoIdioma.add(jComboBoxid_empresaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmpleadoIdioma.add(jLabelid_empleadoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoEmpleadoIdioma.add(jButtonid_empleadoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 3;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoIdioma.add(jButtonid_empleadoEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 4;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoIdioma.add(jButtonid_empleadoEmpleadoIdiomaUpdate, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmpleadoIdioma.add(jComboBoxid_empleadoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_idiomaEmpleadoIdioma.add(jLabelid_idiomaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_idiomaEmpleadoIdioma.add(jButtonid_idiomaEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 3;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_idiomaEmpleadoIdioma.add(jButtonid_idiomaEmpleadoIdiomaUpdate, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_idiomaEmpleadoIdioma.add(jComboBoxid_idiomaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_maternaEmpleadoIdioma.add(jLabeles_maternaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_maternaEmpleadoIdioma.add(jButtones_maternaEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_maternaEmpleadoIdioma.add(jCheckBoxes_maternaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_tecnicoEmpleadoIdioma.add(jLabeles_tecnicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_tecnicoEmpleadoIdioma.add(jButtones_tecnicoEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_tecnicoEmpleadoIdioma.add(jCheckBoxes_tecnicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_tecnicoEmpleadoIdioma.add(jLabelporcen_tecnicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_tecnicoEmpleadoIdioma.add(jButtonporcen_tecnicoEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_tecnicoEmpleadoIdioma.add(jTextFieldporcen_tecnicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_lecturaEmpleadoIdioma.add(jLabeles_lecturaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_lecturaEmpleadoIdioma.add(jButtones_lecturaEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_lecturaEmpleadoIdioma.add(jCheckBoxes_lecturaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_lecturaEmpleadoIdioma.add(jLabelporcen_lecturaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_lecturaEmpleadoIdioma.add(jButtonporcen_lecturaEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_lecturaEmpleadoIdioma.add(jTextFieldporcen_lecturaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_escritoEmpleadoIdioma.add(jLabeles_escritoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_escritoEmpleadoIdioma.add(jButtones_escritoEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_escritoEmpleadoIdioma.add(jCheckBoxes_escritoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_escritoEmpleadoIdioma.add(jLabelporcen_escritoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_escritoEmpleadoIdioma.add(jButtonporcen_escritoEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_escritoEmpleadoIdioma.add(jTextFieldporcen_escritoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_habladoEmpleadoIdioma.add(jLabeles_habladoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_habladoEmpleadoIdioma.add(jButtones_habladoEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_habladoEmpleadoIdioma.add(jCheckBoxes_habladoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_habladoEmpleadoIdioma.add(jLabelporcen_habladoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_habladoEmpleadoIdioma.add(jButtonporcen_habladoEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_habladoEmpleadoIdioma.add(jTextFieldporcen_habladoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionEmpleadoIdioma.add(jLabeldescripcionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = 2;
		this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
		this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionEmpleadoIdioma.add(jButtondescripcionEmpleadoIdiomaBusqueda, this.gridBagConstraintsEmpleadoIdioma);
	}

	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
	this.gridBagConstraintsEmpleadoIdioma.gridx = 1;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionEmpleadoIdioma.add(jscrollPanedescripcionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPanelidEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPanelid_empleadoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPanelid_idiomaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPaneles_maternaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPaneles_tecnicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPanelporcen_tecnicoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPaneles_lecturaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPanelporcen_lecturaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPaneles_escritoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPanelporcen_escritoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPaneles_habladoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPanelporcen_habladoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoIdioma.add(this.jPaneldescripcionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposEmpleadoIdioma % 1==0) {
		iXPanelCamposEmpleadoIdioma=0;
		iYPanelCamposEmpleadoIdioma++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoIdioma.gridy = iYPanelCamposOcultosEmpleadoIdioma;
	this.gridBagConstraintsEmpleadoIdioma.gridx = iXPanelCamposOcultosEmpleadoIdioma++;
	this.gridBagConstraintsEmpleadoIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoIdioma.add(this.jPanelid_empresaEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);



	if(iXPanelCamposOcultosEmpleadoIdioma % 1==0) {
		iXPanelCamposOcultosEmpleadoIdioma=0;
		iYPanelCamposOcultosEmpleadoIdioma++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoIdioma= new GridBagLayout();
		this.jPanelAccionesEmpleadoIdioma.setLayout(gridaBagLayoutAccionesEmpleadoIdioma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleadoIdioma= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleadoIdioma.setLayout(gridaBagLayoutAccionesFormularioEmpleadoIdioma);
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoIdioma.add(this.jComboBoxTiposAccionesFormularioEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoIdioma.add(this.jCheckBoxPostAccionNuevoEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoIdioma.add(this.jCheckBoxPostAccionSinCerrarEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoIdioma.add(this.jCheckBoxPostAccionSinMensajeEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleadoIdioma.add(this.jButtonModificarEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);							

		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;
		this.gridBagConstraintsEmpleadoIdioma.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleadoIdioma.add(this.jButtonEliminarEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		
			
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoIdioma.add(this.jButtonActualizarEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);


		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoIdioma.add(this.jButtonGuardarCambiosEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);	
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = 0;		
		this.gridBagConstraintsEmpleadoIdioma.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleadoIdioma.add(this.jButtonCancelarEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoIdioma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoIdioma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoIdioma.gridx = 0;		
			//this.gridBagConstraintsEmpleadoIdioma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoIdioma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoIdioma.gridx =0;
		this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoIdioma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoIdiomaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleadoIdioma = new EmpleadoIdiomaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado Idioma DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado Idioma DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Idioma Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoIdiomaModel empleadoidiomaModel=new EmpleadoIdiomaModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoIdiomaModel.EmpleadoIdiomaFocusTraversalPolicy empleadoidiomaFocusTraversalPolicy = empleadoidiomaModel.new EmpleadoIdiomaFocusTraversalPolicy(this);
			
			//empleadoidiomaFocusTraversalPolicy.setempleadoidiomaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadoidiomaModel);
			
			
			this.jContentPaneDetalleEmpleadoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleadoIdioma = new GridBagLayout();	
			this.jContentPaneDetalleEmpleadoIdioma.setLayout(gridaBagLayoutDetalleEmpleadoIdioma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoIdioma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleadoIdioma.add(jTtoolBarDetalleEmpleadoIdioma, gridBagConstraintsEmpleadoIdioma);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleadoIdioma=   new JScrollPane(jContentPaneDetalleEmpleadoIdioma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoIdioma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoIdioma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoIdioma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleadoIdioma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoIdioma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoIdioma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoIdioma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	        
			this.jContentPaneDetalleEmpleadoIdioma.add(jPanelCamposEmpleadoIdioma, gridBagConstraintsEmpleadoIdioma);
			
			
			
			
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
						&& empleadoidiomaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empleadoidiomaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleadoIdioma= new GridBagConstraints();
						this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
						this.jContentPaneDetalleEmpleadoIdioma.add(this.jTabbedPaneRelacionesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleadoIdioma.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleadoIdioma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
					this.gridBagConstraintsEmpleadoIdioma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleadoIdioma.add(jPanelCamposOcultosEmpleadoIdioma, gridBagConstraintsEmpleadoIdioma);
				
					this.jPanelCamposOcultosEmpleadoIdioma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	        this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleadoIdioma.add(this.jPanelAccionesFormularioEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);							
			
			
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
	        this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleadoIdioma.add(this.jPanelAccionesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleadoIdioma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleadoIdioma=   new JScrollPane(this.jPanelCamposEmpleadoIdioma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoIdioma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoIdioma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoIdioma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
			this.gridBagConstraintsEmpleadoIdioma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleadoIdioma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleadoIdioma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);			
			
			this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoIdioma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
			
			
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoIdioma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		
			
		this.gridBagConstraintsEmpleadoIdioma = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoIdioma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoIdioma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoIdioma, this.gridBagConstraintsEmpleadoIdioma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleadoIdioma;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleadoIdioma;
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
