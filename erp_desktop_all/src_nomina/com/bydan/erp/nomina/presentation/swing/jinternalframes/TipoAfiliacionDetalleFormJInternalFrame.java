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
import com.bydan.erp.nomina.util.TipoAfiliacionConstantesFunciones;

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
public class TipoAfiliacionDetalleFormJInternalFrame extends TipoAfiliacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoAfiliacion;
	
	protected JMenuBar jmenuBarDetalleTipoAfiliacion;
	
	protected JMenu jmenuDetalleTipoAfiliacion;
	protected JMenu jmenuDetalleArchivoTipoAfiliacion;
	protected JMenu jmenuDetalleAccionesTipoAfiliacion;
	protected JMenu jmenuDetalleDatosTipoAfiliacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAfiliacion;	
	protected GridBagConstraints gridBagConstraintsTipoAfiliacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoAfiliacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoAfiliacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CateTipoAfiliacionBeanSwingJInternalFrame catetipoafiliacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_catetipoafiliacion="";
	
	public TipoAfiliacionSessionBean tipoafiliacionSessionBean;
	
	

	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;
	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralEmpleado=false;
	public DatoGeneralEmpleadoSessionBean datogeneralempleadoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CateTipoAfiliacionSessionBean catetipoafiliacionSessionBean;	
	
	public TipoAfiliacionLogic tipoafiliacionLogic;
	
	public JScrollPane jScrollPanelDatosTipoAfiliacion;
	public JScrollPane jScrollPanelDatosEdicionTipoAfiliacion;
	public JScrollPane jScrollPanelDatosGeneralTipoAfiliacion;
	
	protected JPanel jPanelCamposTipoAfiliacion;    
	protected JPanel jPanelCamposOcultosTipoAfiliacion;    	
	protected JPanel jPanelAccionesTipoAfiliacion;
	protected JPanel jPanelAccionesFormularioTipoAfiliacion;
    
	
	
	protected Integer iXPanelCamposTipoAfiliacion=0;
	protected Integer iYPanelCamposTipoAfiliacion=0;
	
	protected Integer iXPanelCamposOcultosTipoAfiliacion=0;
	protected Integer iYPanelCamposOcultosTipoAfiliacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoAfiliacion;
	public JButton jButtonModificarTipoAfiliacion;
	public JButton jButtonActualizarTipoAfiliacion;
    public JButton jButtonEliminarTipoAfiliacion;
	public JButton jButtonCancelarTipoAfiliacion;
    public JButton jButtonGuardarCambiosTipoAfiliacion;
	public JButton jButtonGuardarCambiosTablaTipoAfiliacion;
	protected JButton jButtonCerrarTipoAfiliacion;
	
	
	protected JButton jButtonProcesarInformacionTipoAfiliacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoAfiliacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoAfiliacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoAfiliacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAfiliacion;
	protected JButton jButtonModificarToolBarTipoAfiliacion;
	protected JButton jButtonActualizarToolBarTipoAfiliacion;
    protected JButton jButtonEliminarToolBarTipoAfiliacion;
	protected JButton jButtonCancelarToolBarTipoAfiliacion;
    protected JButton jButtonGuardarCambiosToolBarTipoAfiliacion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoAfiliacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAfiliacion;
	protected JButton jButtonCerrarToolBarTipoAfiliacion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoAfiliacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAfiliacion;
	protected JMenuItem jMenuItemModificarTipoAfiliacion;
	protected JMenuItem jMenuItemActualizarTipoAfiliacion;
    protected JMenuItem jMenuItemEliminarTipoAfiliacion;
	protected JMenuItem jMenuItemCancelarTipoAfiliacion;
    protected JMenuItem jMenuItemGuardarCambiosTipoAfiliacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAfiliacion;
	protected JMenuItem jMenuItemCerrarTipoAfiliacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoAfiliacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAfiliacion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoAfiliacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAfiliacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoAfiliacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAfiliacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAfiliacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoAfiliacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoAfiliacion;
	public JLabel jLabelIdTipoAfiliacion;
	public JLabel jLabelidTipoAfiliacion;
	public JButton jButtonidTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoAfiliacion;
	public JLabel jLabelcodigoTipoAfiliacion;
	public JTextField jTextFieldcodigoTipoAfiliacion;
	public JButton jButtoncodigoTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoAfiliacion;
	public JLabel jLabelnombreTipoAfiliacion;
	public JTextArea jTextAreanombreTipoAfiliacion;
	public JScrollPane jscrollPanenombreTipoAfiliacion;
	public JButton jButtonnombreTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPanelporcen_empleaTipoAfiliacion;
	public JLabel jLabelporcen_empleaTipoAfiliacion;
	public JTextField jTextFieldporcen_empleaTipoAfiliacion;
	public JButton jButtonporcen_empleaTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPanelporcen_patroTipoAfiliacion;
	public JLabel jLabelporcen_patroTipoAfiliacion;
	public JTextField jTextFieldporcen_patroTipoAfiliacion;
	public JButton jButtonporcen_patroTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPanelporcen_gene_empleaTipoAfiliacion;
	public JLabel jLabelporcen_gene_empleaTipoAfiliacion;
	public JTextField jTextFieldporcen_gene_empleaTipoAfiliacion;
	public JButton jButtonporcen_gene_empleaTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPanelporcen_gene_patroTipoAfiliacion;
	public JLabel jLabelporcen_gene_patroTipoAfiliacion;
	public JTextField jTextFieldporcen_gene_patroTipoAfiliacion;
	public JButton jButtonporcen_gene_patroTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPanelporcen_secuTipoAfiliacion;
	public JLabel jLabelporcen_secuTipoAfiliacion;
	public JTextField jTextFieldporcen_secuTipoAfiliacion;
	public JButton jButtonporcen_secuTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPanelporcen_ieceTipoAfiliacion;
	public JLabel jLabelporcen_ieceTipoAfiliacion;
	public JTextField jTextFieldporcen_ieceTipoAfiliacion;
	public JButton jButtonporcen_ieceTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoAfiliacion;
	public JLabel jLabeldescripcionTipoAfiliacion;
	public JTextArea jTextAreadescripcionTipoAfiliacion;
	public JScrollPane jscrollPanedescripcionTipoAfiliacion;
	public JButton jButtondescripcionTipoAfiliacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoAfiliacion;
	public JLabel jLabelid_empresaTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoAfiliacion;
	public JButton jButtonid_empresaTipoAfiliacion= new JButtonMe();
	public JButton jButtonid_empresaTipoAfiliacionUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPanelid_cate_tipo_afiliacionTipoAfiliacion;
	public JLabel jLabelid_cate_tipo_afiliacionTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cate_tipo_afiliacionTipoAfiliacion;
	public JButton jButtonid_cate_tipo_afiliacionTipoAfiliacion= new JButtonMe();
	public JButton jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate= new JButtonMe();
	public JButton jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoAfiliacion;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoAfiliacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoAfiliacion=new JPanel();
				this.jPanelAccionesFormularioTipoAfiliacion=new JPanel();
				this.jmenuBarDetalleTipoAfiliacion=new JMenuBar();
				this.jTtoolBarDetalleTipoAfiliacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAfiliacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoAfiliacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAfiliacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAfiliacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAfiliacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoAfiliacion() {
		return this.jButtonActualizarToolBarTipoAfiliacion;
	}
	
	public JButton getjButtonEliminarToolBarTipoAfiliacion() {
		return this.jButtonEliminarToolBarTipoAfiliacion;
	}
	
	public JButton getjButtonCancelarToolBarTipoAfiliacion() {
		return this.jButtonCancelarToolBarTipoAfiliacion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoAfiliacion() {
		return this.jButtonProcesarInformacionTipoAfiliacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAfiliacion)	{
		this.jButtonProcesarInformacionTipoAfiliacion = jButtonProcesarInformacionTipoAfiliacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAfiliacion() {
		return this.jComboBoxTiposAccionesTipoAfiliacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAfiliacion(
			JComboBox jComboBoxTiposRelacionesTipoAfiliacion) {
		this.jComboBoxTiposRelacionesTipoAfiliacion = jComboBoxTiposRelacionesTipoAfiliacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAfiliacion(
			JComboBox jComboBoxTiposAccionesTipoAfiliacion) {
		this.jComboBoxTiposAccionesTipoAfiliacion = jComboBoxTiposAccionesTipoAfiliacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoAfiliacion() {
		return this.jComboBoxTiposAccionesFormularioTipoAfiliacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoAfiliacion(
			JComboBox jComboBoxTiposAccionesFormularioTipoAfiliacion) {
		this.jComboBoxTiposAccionesFormularioTipoAfiliacion = jComboBoxTiposAccionesFormularioTipoAfiliacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
		
		this.tipoafiliacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoafiliacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoafiliacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAfiliacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Afiliacion MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoAfiliacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoAfiliacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoAfiliacion=new JButtonMe();
				this.jButtonModificarToolBarTipoAfiliacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoAfiliacion,this.jTtoolBarDetalleTipoAfiliacion,
							"actualizar","actualizar","Actualizar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoAfiliacion,this.jTtoolBarDetalleTipoAfiliacion,
							"eliminar","eliminar","Eliminar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoAfiliacion,this.jTtoolBarDetalleTipoAfiliacion,
							"cancelar","cancelar","Cancelar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoAfiliacion,this.jTtoolBarDetalleTipoAfiliacion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoAfiliacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoAfiliacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoAfiliacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoAfiliacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoAfiliacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAfiliacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAfiliacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAfiliacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoAfiliacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoAfiliacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoAfiliacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoAfiliacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoAfiliacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoAfiliacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoAfiliacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoAfiliacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoAfiliacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoAfiliacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoAfiliacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoAfiliacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoAfiliacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAfiliacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAfiliacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAfiliacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAfiliacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAfiliacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoAfiliacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoAfiliacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoAfiliacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAfiliacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAfiliacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAfiliacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAfiliacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAfiliacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAfiliacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoAfiliacion.add(this.jMenuItemDetalleCerrarTipoAfiliacion);
		
		this.jmenuDetalleAccionesTipoAfiliacion.add(this.jMenuItemActualizarTipoAfiliacion);
		this.jmenuDetalleAccionesTipoAfiliacion.add(this.jMenuItemEliminarTipoAfiliacion);
		this.jmenuDetalleAccionesTipoAfiliacion.add(this.jMenuItemCancelarTipoAfiliacion);		
		
		//this.jmenuDetalleDatosTipoAfiliacion.add(this.jMenuItemDetalleAbrirOrderByTipoAfiliacion);				
		this.jmenuDetalleDatosTipoAfiliacion.add(this.jMenuItemDetalleMostarOcultarTipoAfiliacion);				
				
		//this.jmenuDetalleAccionesTipoAfiliacion.add(this.jMenuItemGuardarCambiosTipoAfiliacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoAfiliacion.add(this.jmenuDetalleArchivoTipoAfiliacion);		
		this.jmenuBarDetalleTipoAfiliacion.add(this.jmenuDetalleAccionesTipoAfiliacion);		
		this.jmenuBarDetalleTipoAfiliacion.add(this.jmenuDetalleDatosTipoAfiliacion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoAfiliacion.add(this.jmenuDetalleTipoAfiliacion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoAfiliacion);				
	}
	
	
	public void inicializarElementosCamposTipoAfiliacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoAfiliacion = new JLabelMe();
		jLabelIdTipoAfiliacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoAfiliacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoAfiliacion= new GridBagLayout();

		this.jPanelidTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);

		jLabelidTipoAfiliacion = new JLabel();
		jLabelidTipoAfiliacion.setText("Id");

		jLabelidTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoAfiliacion = new JLabelMe();
		this.jLabelcodigoTipoAfiliacion.setText(""+TipoAfiliacionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoAfiliacion.setToolTipText("Codigo");
		this.jLabelcodigoTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		this.jPanelcodigoTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);


		jTextFieldcodigoTipoAfiliacion= new JTextFieldMe();

		jTextFieldcodigoTipoAfiliacion.setEnabled(false);
		jTextFieldcodigoTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoAfiliacionBusqueda.setText("U");
		this.jButtoncodigoTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoAfiliacionBusqueda"));

		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoAfiliacionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoAfiliacion = new JLabelMe();
		this.jLabelnombreTipoAfiliacion.setText(""+TipoAfiliacionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoAfiliacion.setToolTipText("Nombre");
		this.jLabelnombreTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		this.jPanelnombreTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);


		jTextAreanombreTipoAfiliacion= new JTextAreaMe();
		jTextAreanombreTipoAfiliacion.setEnabled(false);
		jTextAreanombreTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAfiliacion.setLineWrap(true);
		jTextAreanombreTipoAfiliacion.setWrapStyleWord(true);
		jTextAreanombreTipoAfiliacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoAfiliacion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoAfiliacion = new JScrollPane(jTextAreanombreTipoAfiliacion);
		jscrollPanenombreTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtonnombreTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoAfiliacionBusqueda.setText("U");
		this.jButtonnombreTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoAfiliacionBusqueda"));

		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoAfiliacionBusqueda.setVisible(false);		}


					
		this.jLabelporcen_empleaTipoAfiliacion = new JLabelMe();
		this.jLabelporcen_empleaTipoAfiliacion.setText(""+TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA+" : *");
		this.jLabelporcen_empleaTipoAfiliacion.setToolTipText("Porcen Emplea");
		this.jLabelporcen_empleaTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_empleaTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_empleaTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_empleaTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_empleaTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_empleaTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA);
		this.gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		this.jPanelporcen_empleaTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);


		jTextFieldporcen_empleaTipoAfiliacion= new JTextFieldMe();
		jTextFieldporcen_empleaTipoAfiliacion.setEnabled(false);
		jTextFieldporcen_empleaTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_empleaTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_empleaTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_empleaTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_empleaTipoAfiliacion.setText("0.0");

		this.jButtonporcen_empleaTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtonporcen_empleaTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_empleaTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_empleaTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_empleaTipoAfiliacionBusqueda.setText("U");
		this.jButtonporcen_empleaTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_empleaTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_empleaTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_empleaTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_empleaTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_empleaTipoAfiliacionBusqueda"));

		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_empleaTipoAfiliacionBusqueda.setVisible(false);		}


					
		this.jLabelporcen_patroTipoAfiliacion = new JLabelMe();
		this.jLabelporcen_patroTipoAfiliacion.setText(""+TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO+" : *");
		this.jLabelporcen_patroTipoAfiliacion.setToolTipText("Porcen Patro");
		this.jLabelporcen_patroTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_patroTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_patroTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_patroTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_patroTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_patroTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO);
		this.gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		this.jPanelporcen_patroTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);


		jTextFieldporcen_patroTipoAfiliacion= new JTextFieldMe();
		jTextFieldporcen_patroTipoAfiliacion.setEnabled(false);
		jTextFieldporcen_patroTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_patroTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_patroTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_patroTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_patroTipoAfiliacion.setText("0.0");

		this.jButtonporcen_patroTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtonporcen_patroTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_patroTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_patroTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_patroTipoAfiliacionBusqueda.setText("U");
		this.jButtonporcen_patroTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_patroTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_patroTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_patroTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_patroTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_patroTipoAfiliacionBusqueda"));

		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_patroTipoAfiliacionBusqueda.setVisible(false);		}


					
		this.jLabelporcen_gene_empleaTipoAfiliacion = new JLabelMe();
		this.jLabelporcen_gene_empleaTipoAfiliacion.setText(""+TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA+" : *");
		this.jLabelporcen_gene_empleaTipoAfiliacion.setToolTipText("Porcen Gene Emplea");
		this.jLabelporcen_gene_empleaTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcen_gene_empleaTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcen_gene_empleaTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_gene_empleaTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_gene_empleaTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_gene_empleaTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA);
		this.gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		this.jPanelporcen_gene_empleaTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);


		jTextFieldporcen_gene_empleaTipoAfiliacion= new JTextFieldMe();
		jTextFieldporcen_gene_empleaTipoAfiliacion.setEnabled(false);
		jTextFieldporcen_gene_empleaTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_gene_empleaTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_gene_empleaTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_gene_empleaTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_gene_empleaTipoAfiliacion.setText("0.0");

		this.jButtonporcen_gene_empleaTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtonporcen_gene_empleaTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_gene_empleaTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_gene_empleaTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_gene_empleaTipoAfiliacionBusqueda.setText("U");
		this.jButtonporcen_gene_empleaTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_gene_empleaTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_gene_empleaTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_gene_empleaTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_gene_empleaTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_gene_empleaTipoAfiliacionBusqueda"));

		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_gene_empleaTipoAfiliacionBusqueda.setVisible(false);		}


					
		this.jLabelporcen_gene_patroTipoAfiliacion = new JLabelMe();
		this.jLabelporcen_gene_patroTipoAfiliacion.setText(""+TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO+" : *");
		this.jLabelporcen_gene_patroTipoAfiliacion.setToolTipText("Porcen Gene Patro");
		this.jLabelporcen_gene_patroTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcen_gene_patroTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcen_gene_patroTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_gene_patroTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_gene_patroTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_gene_patroTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO);
		this.gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		this.jPanelporcen_gene_patroTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);


		jTextFieldporcen_gene_patroTipoAfiliacion= new JTextFieldMe();
		jTextFieldporcen_gene_patroTipoAfiliacion.setEnabled(false);
		jTextFieldporcen_gene_patroTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_gene_patroTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_gene_patroTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_gene_patroTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_gene_patroTipoAfiliacion.setText("0.0");

		this.jButtonporcen_gene_patroTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtonporcen_gene_patroTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_gene_patroTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_gene_patroTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_gene_patroTipoAfiliacionBusqueda.setText("U");
		this.jButtonporcen_gene_patroTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_gene_patroTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_gene_patroTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_gene_patroTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_gene_patroTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_gene_patroTipoAfiliacionBusqueda"));

		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_gene_patroTipoAfiliacionBusqueda.setVisible(false);		}


					
		this.jLabelporcen_secuTipoAfiliacion = new JLabelMe();
		this.jLabelporcen_secuTipoAfiliacion.setText(""+TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU+" : *");
		this.jLabelporcen_secuTipoAfiliacion.setToolTipText("Porcen Secu");
		this.jLabelporcen_secuTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_secuTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_secuTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_secuTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_secuTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_secuTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU);
		this.gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		this.jPanelporcen_secuTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);


		jTextFieldporcen_secuTipoAfiliacion= new JTextFieldMe();
		jTextFieldporcen_secuTipoAfiliacion.setEnabled(false);
		jTextFieldporcen_secuTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_secuTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_secuTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_secuTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_secuTipoAfiliacion.setText("0.0");

		this.jButtonporcen_secuTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtonporcen_secuTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_secuTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_secuTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_secuTipoAfiliacionBusqueda.setText("U");
		this.jButtonporcen_secuTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_secuTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_secuTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_secuTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_secuTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_secuTipoAfiliacionBusqueda"));

		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_secuTipoAfiliacionBusqueda.setVisible(false);		}


					
		this.jLabelporcen_ieceTipoAfiliacion = new JLabelMe();
		this.jLabelporcen_ieceTipoAfiliacion.setText(""+TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE+" : *");
		this.jLabelporcen_ieceTipoAfiliacion.setToolTipText("Porcen Iece");
		this.jLabelporcen_ieceTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_ieceTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_ieceTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_ieceTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_ieceTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_ieceTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE);
		this.gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		this.jPanelporcen_ieceTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);


		jTextFieldporcen_ieceTipoAfiliacion= new JTextFieldMe();
		jTextFieldporcen_ieceTipoAfiliacion.setEnabled(false);
		jTextFieldporcen_ieceTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_ieceTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_ieceTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_ieceTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_ieceTipoAfiliacion.setText("0.0");

		this.jButtonporcen_ieceTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtonporcen_ieceTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_ieceTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_ieceTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_ieceTipoAfiliacionBusqueda.setText("U");
		this.jButtonporcen_ieceTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_ieceTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_ieceTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_ieceTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_ieceTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_ieceTipoAfiliacionBusqueda"));

		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_ieceTipoAfiliacionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoAfiliacion = new JLabelMe();
		this.jLabeldescripcionTipoAfiliacion.setText(""+TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTipoAfiliacion.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		this.jPaneldescripcionTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);


		jTextAreadescripcionTipoAfiliacion= new JTextAreaMe();
		jTextAreadescripcionTipoAfiliacion.setEnabled(false);
		jTextAreadescripcionTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoAfiliacion.setLineWrap(true);
		jTextAreadescripcionTipoAfiliacion.setWrapStyleWord(true);
		jTextAreadescripcionTipoAfiliacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoAfiliacion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoAfiliacion = new JScrollPane(jTextAreadescripcionTipoAfiliacion);
		jscrollPanedescripcionTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtondescripcionTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoAfiliacionBusqueda.setText("U");
		this.jButtondescripcionTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoAfiliacionBusqueda"));

		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoAfiliacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoAfiliacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoAfiliacion = new JLabelMe();
		this.jLabelid_empresaTipoAfiliacion.setText(""+TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoAfiliacion.setToolTipText("Empresa");
		this.jLabelid_empresaTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		this.jPanelid_empresaTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);


		jComboBoxid_empresaTipoAfiliacion= new JComboBoxMe();
		jComboBoxid_empresaTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoAfiliacion.setEnabled(false);

		this.jButtonid_empresaTipoAfiliacion= new JButtonMe();
		this.jButtonid_empresaTipoAfiliacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAfiliacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAfiliacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAfiliacion.setText("Buscar");
		this.jButtonid_empresaTipoAfiliacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoAfiliacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAfiliacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAfiliacion"));

		this.jButtonid_empresaTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoAfiliacionBusqueda.setText("U");
		this.jButtonid_empresaTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAfiliacionBusqueda"));

		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoAfiliacionBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoAfiliacionUpdate= new JButtonMe();
		this.jButtonid_empresaTipoAfiliacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAfiliacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAfiliacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoAfiliacionUpdate.setText("U");
		this.jButtonid_empresaTipoAfiliacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoAfiliacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAfiliacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAfiliacionUpdate"));



					
		this.jLabelid_cate_tipo_afiliacionTipoAfiliacion = new JLabelMe();
		this.jLabelid_cate_tipo_afiliacionTipoAfiliacion.setText(""+TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION+" : *");
		this.jLabelid_cate_tipo_afiliacionTipoAfiliacion.setToolTipText("Cate Tipo Afiliacion");
		this.jLabelid_cate_tipo_afiliacionTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cate_tipo_afiliacionTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cate_tipo_afiliacionTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cate_tipo_afiliacionTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cate_tipo_afiliacionTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cate_tipo_afiliacionTipoAfiliacion.setToolTipText(TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION);
		this.gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		this.jPanelid_cate_tipo_afiliacionTipoAfiliacion.setLayout(this.gridaBagLayoutTipoAfiliacion);


		jComboBoxid_cate_tipo_afiliacionTipoAfiliacion= new JComboBoxMe();
		jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cate_tipo_afiliacionTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cate_tipo_afiliacionTipoAfiliacion= new JButtonMe();
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacion.setText("Buscar");
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cate_tipo_afiliacionTipoAfiliacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cate_tipo_afiliacionTipoAfiliacion"));

		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda.setText("U");
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cate_tipo_afiliacionTipoAfiliacionBusqueda"));

		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda.setVisible(false);		}

		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate= new JButtonMe();
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate.setText("U");
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cate_tipo_afiliacionTipoAfiliacionUpdate"));



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
		//this.jInternalFrameDetalleTipoAfiliacion = new TipoAfiliacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Afiliacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAfiliacion= new GridBagLayout();
		

		
		String sToolTipTipoAfiliacion="";
		sToolTipTipoAfiliacion=TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAfiliacion+="(Nomina.TipoAfiliacion)";
		}
		
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAfiliacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoAfiliacion = new JButtonMe();
		this.jButtonModificarTipoAfiliacion = new JButtonMe();
        this.jButtonActualizarTipoAfiliacion = new JButtonMe();
        this.jButtonEliminarTipoAfiliacion = new JButtonMe();
        this.jButtonCancelarTipoAfiliacion = new JButtonMe();
        this.jButtonGuardarCambiosTipoAfiliacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoAfiliacion = new JButtonMe();
		this.jButtonCerrarTipoAfiliacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoAfiliacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoAfiliacion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoAfiliacion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Afiliacion";
		
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Afiliaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAfiliacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoAfiliacion.setName("jPanelCamposTipoAfiliacion"); 

		this.jPanelCamposOcultosTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoAfiliacion.setName("jPanelCamposOcultosTipoAfiliacion"); 

        this.jPanelAccionesTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAfiliacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoAfiliacion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoAfiliacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoAfiliacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoAfiliacion.setText("Nuevo");
		this.jButtonModificarTipoAfiliacion.setText("Editar");
        this.jButtonActualizarTipoAfiliacion.setText("Actualizar");
        this.jButtonEliminarTipoAfiliacion.setText("Eliminar");
        this.jButtonCancelarTipoAfiliacion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoAfiliacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoAfiliacion.setText("Guardar");
		this.jButtonCerrarTipoAfiliacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAfiliacion,"nuevo_button","Nuevo",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoAfiliacion,"modificar_button","Editar",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoAfiliacion,"actualizar_button","Actualizar",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoAfiliacion,"eliminar_button","Eliminar",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoAfiliacion,"cancelar_button","Cancelar",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoAfiliacion,"guardarcambios_button","Guardar",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAfiliacion,"guardarcambiostabla_button","Guardar",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAfiliacion,"cerrar_button","Salir",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoAfiliacion.setToolTipText("Nuevo"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoAfiliacion.setToolTipText("Editar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoAfiliacion.setToolTipText("Actualizar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoAfiliacion.setToolTipText("Eliminar)"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoAfiliacion.setToolTipText("Cancelar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoAfiliacion.setToolTipText("Guardar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoAfiliacion.setToolTipText("Guardar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAfiliacion.setToolTipText("Salir"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAfiliacion";
		inputMap = this.jButtonNuevoTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAfiliacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAfiliacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoAfiliacion";
		inputMap = this.jButtonActualizarTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoAfiliacion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoAfiliacion";
		inputMap = this.jButtonEliminarTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoAfiliacion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoAfiliacion";
		inputMap = this.jButtonCancelarTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoAfiliacion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoAfiliacion";
		inputMap = this.jButtonCerrarTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAfiliacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAfiliacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAfiliacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoAfiliacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoAfiliacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoAfiliacion.setToolTipText("Nuevo TipoAfiliacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoAfiliacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoAfiliacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoAfiliacion.setToolTipText("Sin Cerrar Ventana TipoAfiliacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoAfiliacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoAfiliacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoAfiliacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAfiliacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoAfiliacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoAfiliacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoAfiliacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoAfiliacion = new JLabelMe();
		
		this.jLabelAccionesTipoAfiliacion.setText("Acciones");		
		this.jLabelAccionesTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoAfiliacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoAfiliacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoAfiliacion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoAfiliacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAfiliacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAfiliacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoAfiliacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAfiliacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAfiliacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoAfiliacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoAfiliacion = new GridBagLayout();
		
		this.jPanelCamposTipoAfiliacion.setLayout(gridaBagLayoutCamposTipoAfiliacion);
		this.jPanelCamposOcultosTipoAfiliacion.setLayout(gridaBagLayoutCamposOcultosTipoAfiliacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoAfiliacion.add(jLabelIdTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoAfiliacion.add(jLabelidTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoAfiliacion.add(jLabelid_empresaTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoAfiliacion.add(jButtonid_empresaTipoAfiliacionBusqueda, this.gridBagConstraintsTipoAfiliacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 3;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoAfiliacion.add(jButtonid_empresaTipoAfiliacionUpdate, this.gridBagConstraintsTipoAfiliacion);
	}

	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoAfiliacion.add(jComboBoxid_empresaTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cate_tipo_afiliacionTipoAfiliacion.add(jLabelid_cate_tipo_afiliacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cate_tipo_afiliacionTipoAfiliacion.add(jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda, this.gridBagConstraintsTipoAfiliacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 3;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cate_tipo_afiliacionTipoAfiliacion.add(jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate, this.gridBagConstraintsTipoAfiliacion);
	}

	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cate_tipo_afiliacionTipoAfiliacion.add(jComboBoxid_cate_tipo_afiliacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoAfiliacion.add(jLabelcodigoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoAfiliacion.add(jButtoncodigoTipoAfiliacionBusqueda, this.gridBagConstraintsTipoAfiliacion);
	}

	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoAfiliacion.add(jTextFieldcodigoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoAfiliacion.add(jLabelnombreTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoAfiliacion.add(jButtonnombreTipoAfiliacionBusqueda, this.gridBagConstraintsTipoAfiliacion);
	}

	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoAfiliacion.add(jscrollPanenombreTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_empleaTipoAfiliacion.add(jLabelporcen_empleaTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_empleaTipoAfiliacion.add(jButtonporcen_empleaTipoAfiliacionBusqueda, this.gridBagConstraintsTipoAfiliacion);
	}

	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_empleaTipoAfiliacion.add(jTextFieldporcen_empleaTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_patroTipoAfiliacion.add(jLabelporcen_patroTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_patroTipoAfiliacion.add(jButtonporcen_patroTipoAfiliacionBusqueda, this.gridBagConstraintsTipoAfiliacion);
	}

	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_patroTipoAfiliacion.add(jTextFieldporcen_patroTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_gene_empleaTipoAfiliacion.add(jLabelporcen_gene_empleaTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_gene_empleaTipoAfiliacion.add(jButtonporcen_gene_empleaTipoAfiliacionBusqueda, this.gridBagConstraintsTipoAfiliacion);
	}

	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_gene_empleaTipoAfiliacion.add(jTextFieldporcen_gene_empleaTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_gene_patroTipoAfiliacion.add(jLabelporcen_gene_patroTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_gene_patroTipoAfiliacion.add(jButtonporcen_gene_patroTipoAfiliacionBusqueda, this.gridBagConstraintsTipoAfiliacion);
	}

	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_gene_patroTipoAfiliacion.add(jTextFieldporcen_gene_patroTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_secuTipoAfiliacion.add(jLabelporcen_secuTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_secuTipoAfiliacion.add(jButtonporcen_secuTipoAfiliacionBusqueda, this.gridBagConstraintsTipoAfiliacion);
	}

	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_secuTipoAfiliacion.add(jTextFieldporcen_secuTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_ieceTipoAfiliacion.add(jLabelporcen_ieceTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_ieceTipoAfiliacion.add(jButtonporcen_ieceTipoAfiliacionBusqueda, this.gridBagConstraintsTipoAfiliacion);
	}

	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_ieceTipoAfiliacion.add(jTextFieldporcen_ieceTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoAfiliacion.add(jLabeldescripcionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoAfiliacion.add(jButtondescripcionTipoAfiliacionBusqueda, this.gridBagConstraintsTipoAfiliacion);
	}

	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoAfiliacion.add(jscrollPanedescripcionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAfiliacion.add(this.jPanelidTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposTipoAfiliacion % 1==0) {
		iXPanelCamposTipoAfiliacion=0;
		iYPanelCamposTipoAfiliacion++;
	}
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAfiliacion.add(this.jPanelid_cate_tipo_afiliacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposTipoAfiliacion % 1==0) {
		iXPanelCamposTipoAfiliacion=0;
		iYPanelCamposTipoAfiliacion++;
	}
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAfiliacion.add(this.jPanelcodigoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposTipoAfiliacion % 1==0) {
		iXPanelCamposTipoAfiliacion=0;
		iYPanelCamposTipoAfiliacion++;
	}
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAfiliacion.add(this.jPanelnombreTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposTipoAfiliacion % 1==0) {
		iXPanelCamposTipoAfiliacion=0;
		iYPanelCamposTipoAfiliacion++;
	}
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAfiliacion.add(this.jPanelporcen_empleaTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposTipoAfiliacion % 1==0) {
		iXPanelCamposTipoAfiliacion=0;
		iYPanelCamposTipoAfiliacion++;
	}
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAfiliacion.add(this.jPanelporcen_patroTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposTipoAfiliacion % 1==0) {
		iXPanelCamposTipoAfiliacion=0;
		iYPanelCamposTipoAfiliacion++;
	}
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAfiliacion.add(this.jPanelporcen_gene_empleaTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposTipoAfiliacion % 1==0) {
		iXPanelCamposTipoAfiliacion=0;
		iYPanelCamposTipoAfiliacion++;
	}
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAfiliacion.add(this.jPanelporcen_gene_patroTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposTipoAfiliacion % 1==0) {
		iXPanelCamposTipoAfiliacion=0;
		iYPanelCamposTipoAfiliacion++;
	}
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAfiliacion.add(this.jPanelporcen_secuTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposTipoAfiliacion % 1==0) {
		iXPanelCamposTipoAfiliacion=0;
		iYPanelCamposTipoAfiliacion++;
	}
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAfiliacion.add(this.jPanelporcen_ieceTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposTipoAfiliacion % 1==0) {
		iXPanelCamposTipoAfiliacion=0;
		iYPanelCamposTipoAfiliacion++;
	}
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAfiliacion.add(this.jPaneldescripcionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposTipoAfiliacion % 1==0) {
		iXPanelCamposTipoAfiliacion=0;
		iYPanelCamposTipoAfiliacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAfiliacion.gridy = iYPanelCamposOcultosTipoAfiliacion;
	this.gridBagConstraintsTipoAfiliacion.gridx = iXPanelCamposOcultosTipoAfiliacion++;
	this.gridBagConstraintsTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoAfiliacion.add(this.jPanelid_empresaTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);



	if(iXPanelCamposOcultosTipoAfiliacion % 1==0) {
		iXPanelCamposOcultosTipoAfiliacion=0;
		iYPanelCamposOcultosTipoAfiliacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoAfiliacion= new GridBagLayout();
		this.jPanelAccionesTipoAfiliacion.setLayout(gridaBagLayoutAccionesTipoAfiliacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoAfiliacion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoAfiliacion.setLayout(gridaBagLayoutAccionesFormularioTipoAfiliacion);
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAfiliacion.add(this.jComboBoxTiposAccionesFormularioTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAfiliacion.add(this.jCheckBoxPostAccionNuevoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAfiliacion.add(this.jCheckBoxPostAccionSinCerrarTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAfiliacion.add(this.jCheckBoxPostAccionSinMensajeTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoAfiliacion.add(this.jButtonModificarTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);							

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoAfiliacion.add(this.jButtonEliminarTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
			
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAfiliacion.add(this.jButtonActualizarTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAfiliacion.add(this.jButtonGuardarCambiosTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);	
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;		
		this.gridBagConstraintsTipoAfiliacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoAfiliacion.add(this.jButtonCancelarTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAfiliacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAfiliacion.gridx = 0;		
			//this.gridBagConstraintsTipoAfiliacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAfiliacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAfiliacion.gridx =0;
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAfiliacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoAfiliacion = new TipoAfiliacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Afiliacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Afiliacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Afiliacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoAfiliacionModel tipoafiliacionModel=new TipoAfiliacionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoAfiliacionModel.TipoAfiliacionFocusTraversalPolicy tipoafiliacionFocusTraversalPolicy = tipoafiliacionModel.new TipoAfiliacionFocusTraversalPolicy(this);
			
			//tipoafiliacionFocusTraversalPolicy.settipoafiliacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoafiliacionModel);
			
			
			this.jContentPaneDetalleTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoAfiliacion = new GridBagLayout();	
			this.jContentPaneDetalleTipoAfiliacion.setLayout(gridaBagLayoutDetalleTipoAfiliacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAfiliacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
				this.gridBagConstraintsTipoAfiliacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoAfiliacion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoAfiliacion.add(jTtoolBarDetalleTipoAfiliacion, gridBagConstraintsTipoAfiliacion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoAfiliacion=   new JScrollPane(jContentPaneDetalleTipoAfiliacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAfiliacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAfiliacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAfiliacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoAfiliacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAfiliacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAfiliacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAfiliacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoAfiliacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	        
			this.jContentPaneDetalleTipoAfiliacion.add(jPanelCamposTipoAfiliacion, gridBagConstraintsTipoAfiliacion);
			
			
			
			
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
						&& tipoafiliacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(this.puedeCargarPorParteDatoGeneralEmpleado,false,-1);
					
					if(this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoAfiliacion= new GridBagConstraints();
						this.gridBagConstraintsTipoAfiliacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoAfiliacion.gridx = 0;
						this.jContentPaneDetalleTipoAfiliacion.add(this.jTabbedPaneRelacionesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoAfiliacion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoAfiliacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
					this.gridBagConstraintsTipoAfiliacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoAfiliacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoAfiliacion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoAfiliacion.add(jPanelCamposOcultosTipoAfiliacion, gridBagConstraintsTipoAfiliacion);
				
					this.jPanelCamposOcultosTipoAfiliacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	        this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoAfiliacion.add(this.jPanelAccionesFormularioTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);							
			
			
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
	        this.gridBagConstraintsTipoAfiliacion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoAfiliacion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoAfiliacion.add(this.jPanelAccionesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoAfiliacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoAfiliacion=   new JScrollPane(this.jPanelCamposTipoAfiliacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAfiliacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAfiliacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAfiliacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoAfiliacion.gridx = 0;
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoAfiliacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAfiliacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);			
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAfiliacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAfiliacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			
			
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAfiliacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
			
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAfiliacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoAfiliacion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoAfiliacion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		this.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
		this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

		this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.datogeneralempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {

				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

				this.datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datogeneralempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datogeneralempleadoBeanSwingJInternalFrame.setdatogeneralempleadoSessionBean(this.datogeneralempleadoSessionBean);

				//this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
				//this.gridBagConstraintsTipoAfiliacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoAfiliacion.gridx = 0;
				//this.jContentPaneDetalleTipoAfiliacion.add(this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoAfiliacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoAfiliacion.add("Dato General Empleados",this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoAfiliacion.setComponentAt(iIndexTab,this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoGeneralEmpleado) {
					this.jTabbedPaneRelacionesTipoAfiliacion.add("Dato General Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(List<TipoAfiliacion> tipoafiliacions,TipoAfiliacion tipoafiliacion,DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralempleadoBeanSwingJInternalFrame.getDatoGeneralEmpleadoLogic().setConnexion(this.tipoafiliacionLogic.getConnexion());

					datogeneralempleadoBeanSwingJInternalFrame.settipoafiliacionsForeignKey(tipoafiliacions);
					datogeneralempleadoBeanSwingJInternalFrame.settipoafiliacionForeignKey(tipoafiliacion);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoAfiliacion(true);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setlidTipoAfiliacionActual(tipoafiliacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datogeneralempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyDatoGeneralEmpleado(datogeneralempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					datogeneralempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoAfiliacion(true);
					datogeneralempleadoBeanSwingJInternalFrame.setid_tipo_afiliacionFK_IdTipoAfiliacion(tipoafiliacion.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					datogeneralempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoAfiliacionForeignKey(tipoafiliacion,1,false,true,true);
					datogeneralempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoAfiliacion");
					datogeneralempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoAfiliacion");
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(true);
					datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDatoGeneralEmpleado("n",datogeneralempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, datogeneralempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingDatoGeneralEmpleado(false);
					datogeneralempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("relacionado");
					} else {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");
					}

					datogeneralempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionDatoGeneralEmpleado().setVisible(false);

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
