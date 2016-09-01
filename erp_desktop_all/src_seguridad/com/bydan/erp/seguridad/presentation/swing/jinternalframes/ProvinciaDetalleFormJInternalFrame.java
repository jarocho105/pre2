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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.ProvinciaConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class ProvinciaDetalleFormJInternalFrame extends ProvinciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProvincia;
	
	protected JMenuBar jmenuBarDetalleProvincia;
	
	protected JMenu jmenuDetalleProvincia;
	protected JMenu jmenuDetalleArchivoProvincia;
	protected JMenu jmenuDetalleAccionesProvincia;
	protected JMenu jmenuDetalleDatosProvincia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProvincia;	
	protected GridBagConstraints gridBagConstraintsProvincia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProvinciaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProvincia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_region="";
	
	public ProvinciaSessionBean provinciaSessionBean;
	
	

	public BarrioBeanSwingJInternalFrame barrioBeanSwingJInternalFrame=null;
	public BarrioBeanSwingJInternalFrame barrioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBarrio=false;
	public BarrioSessionBean barrioSessionBean;

	public CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrame=null;
	public CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCanton=false;
	public CantonSessionBean cantonSessionBean;

	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;
	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralEmpleado=false;
	public DatoGeneralEmpleadoSessionBean datogeneralempleadoSessionBean;

	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleado=false;
	public EmpleadoSessionBean empleadoSessionBean;

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;
	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCarteraDefecto=false;
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;

	public CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame=null;
	public CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCiudad=false;
	public CiudadSessionBean ciudadSessionBean;
	
	
	public PaisSessionBean paisSessionBean;
	public RegionSessionBean regionSessionBean;	
	
	public ProvinciaLogic provinciaLogic;
	
	public JScrollPane jScrollPanelDatosProvincia;
	public JScrollPane jScrollPanelDatosEdicionProvincia;
	public JScrollPane jScrollPanelDatosGeneralProvincia;
	
	protected JPanel jPanelCamposProvincia;    
	protected JPanel jPanelCamposOcultosProvincia;    	
	protected JPanel jPanelAccionesProvincia;
	protected JPanel jPanelAccionesFormularioProvincia;
    
	
	
	protected Integer iXPanelCamposProvincia=0;
	protected Integer iYPanelCamposProvincia=0;
	
	protected Integer iXPanelCamposOcultosProvincia=0;
	protected Integer iYPanelCamposOcultosProvincia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProvincia;
	public JButton jButtonModificarProvincia;
	public JButton jButtonActualizarProvincia;
    public JButton jButtonEliminarProvincia;
	public JButton jButtonCancelarProvincia;
    public JButton jButtonGuardarCambiosProvincia;
	public JButton jButtonGuardarCambiosTablaProvincia;
	protected JButton jButtonCerrarProvincia;
	
	
	protected JButton jButtonProcesarInformacionProvincia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProvincia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProvincia;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProvincia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProvincia;
	protected JButton jButtonModificarToolBarProvincia;
	protected JButton jButtonActualizarToolBarProvincia;
    protected JButton jButtonEliminarToolBarProvincia;
	protected JButton jButtonCancelarToolBarProvincia;
    protected JButton jButtonGuardarCambiosToolBarProvincia;
	protected JButton jButtonGuardarCambiosTablaToolBarProvincia;
	protected JButton jButtonMostrarOcultarTablaToolBarProvincia;
	protected JButton jButtonCerrarToolBarProvincia;
	
	protected JButton jButtonProcesarInformacionToolBarProvincia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProvincia;
	protected JMenuItem jMenuItemModificarProvincia;
	protected JMenuItem jMenuItemActualizarProvincia;
    protected JMenuItem jMenuItemEliminarProvincia;
	protected JMenuItem jMenuItemCancelarProvincia;
    protected JMenuItem jMenuItemGuardarCambiosProvincia;
	protected JMenuItem jMenuItemGuardarCambiosTablaProvincia;
	protected JMenuItem jMenuItemCerrarProvincia;
	protected JMenuItem jMenuItemDetalleCerrarProvincia;
	protected JMenuItem jMenuItemDetalleMostarOcultarProvincia;
	
	protected JMenuItem jMenuItemProcesarInformacionProvincia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProvincia;
	protected JMenuItem jMenuItemMostrarOcultarProvincia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProvincia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProvincia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProvincia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProvincia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProvincia;
	public JLabel jLabelIdProvincia;
	public JLabel jLabelidProvincia;
	public JButton jButtonidProvinciaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProvincia;
	public JLabel jLabelcodigoProvincia;
	public JTextField jTextFieldcodigoProvincia;
	public JButton jButtoncodigoProvinciaBusqueda= new JButtonMe();

	public JPanel jPanelnombreProvincia;
	public JLabel jLabelnombreProvincia;
	public JTextArea jTextAreanombreProvincia;
	public JScrollPane jscrollPanenombreProvincia;
	public JButton jButtonnombreProvinciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisProvincia;
	public JLabel jLabelid_paisProvincia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisProvincia;
	public JButton jButtonid_paisProvincia= new JButtonMe();
	public JButton jButtonid_paisProvinciaUpdate= new JButtonMe();
	public JButton jButtonid_paisProvinciaBusqueda= new JButtonMe();

	public JPanel jPanelid_regionProvincia;
	public JLabel jLabelid_regionProvincia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_regionProvincia;
	public JButton jButtonid_regionProvincia= new JButtonMe();
	public JButton jButtonid_regionProvinciaUpdate= new JButtonMe();
	public JButton jButtonid_regionProvinciaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProvincia;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProvinciaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProvincia=new JPanel();
				this.jPanelAccionesFormularioProvincia=new JPanel();
				this.jmenuBarDetalleProvincia=new JMenuBar();
				this.jTtoolBarDetalleProvincia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvinciaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Provincia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProvinciaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Provincia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvinciaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Provincia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvinciaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Provincia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvinciaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Provincia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProvincia() {
		return this.jButtonActualizarToolBarProvincia;
	}
	
	public JButton getjButtonEliminarToolBarProvincia() {
		return this.jButtonEliminarToolBarProvincia;
	}
	
	public JButton getjButtonCancelarToolBarProvincia() {
		return this.jButtonCancelarToolBarProvincia;
	}		
	
	public JButton getjButtonProcesarInformacionProvincia() {
		return this.jButtonProcesarInformacionProvincia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProvincia)	{
		this.jButtonProcesarInformacionProvincia = jButtonProcesarInformacionProvincia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProvincia() {
		return this.jComboBoxTiposAccionesProvincia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProvincia(
			JComboBox jComboBoxTiposRelacionesProvincia) {
		this.jComboBoxTiposRelacionesProvincia = jComboBoxTiposRelacionesProvincia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProvincia(
			JComboBox jComboBoxTiposAccionesProvincia) {
		this.jComboBoxTiposAccionesProvincia = jComboBoxTiposAccionesProvincia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProvincia() {
		return this.jComboBoxTiposAccionesFormularioProvincia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProvincia(
			JComboBox jComboBoxTiposAccionesFormularioProvincia) {
		this.jComboBoxTiposAccionesFormularioProvincia = jComboBoxTiposAccionesFormularioProvincia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.provinciaSessionBean=new ProvinciaSessionBean();
		
		this.provinciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.provinciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.provinciaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.barrioSessionBean=new BarrioSessionBean();
		//this.cantonSessionBean=new CantonSessionBean();
		//this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		//this.empleadoSessionBean=new EmpleadoSessionBean();
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		//this.ciudadSessionBean=new CiudadSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProvinciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Provincia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProvincia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProvincia=new JButtonMe();
				this.jButtonModificarToolBarProvincia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProvincia,this.jTtoolBarDetalleProvincia,
							"actualizar","actualizar","Actualizar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProvincia,this.jTtoolBarDetalleProvincia,
							"eliminar","eliminar","Eliminar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProvincia,this.jTtoolBarDetalleProvincia,
							"cancelar","cancelar","Cancelar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProvincia,this.jTtoolBarDetalleProvincia,
							"guardarcambios","guardarcambios","Guardar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProvincia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProvincia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProvincia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProvincia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProvincia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProvincia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProvincia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProvincia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProvincia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProvincia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProvincia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProvincia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProvincia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProvincia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProvincia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProvincia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProvincia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProvincia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProvincia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProvincia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProvincia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProvincia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProvincia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProvincia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProvincia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProvincia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProvincia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProvincia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProvincia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProvincia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProvincia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProvincia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProvincia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProvincia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProvincia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProvincia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProvincia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProvincia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProvincia.add(this.jMenuItemDetalleCerrarProvincia);
		
		this.jmenuDetalleAccionesProvincia.add(this.jMenuItemActualizarProvincia);
		this.jmenuDetalleAccionesProvincia.add(this.jMenuItemEliminarProvincia);
		this.jmenuDetalleAccionesProvincia.add(this.jMenuItemCancelarProvincia);		
		
		//this.jmenuDetalleDatosProvincia.add(this.jMenuItemDetalleAbrirOrderByProvincia);				
		this.jmenuDetalleDatosProvincia.add(this.jMenuItemDetalleMostarOcultarProvincia);				
				
		//this.jmenuDetalleAccionesProvincia.add(this.jMenuItemGuardarCambiosProvincia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProvincia.add(this.jmenuDetalleArchivoProvincia);		
		this.jmenuBarDetalleProvincia.add(this.jmenuDetalleAccionesProvincia);		
		this.jmenuBarDetalleProvincia.add(this.jmenuDetalleDatosProvincia);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleProvincia.add(this.jmenuDetalleProvincia);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProvincia);				
	}
	
	
	public void inicializarElementosCamposProvincia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProvincia = new JLabelMe();
		jLabelIdProvincia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProvincia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProvincia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProvincia.setToolTipText(ProvinciaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProvincia= new GridBagLayout();

		this.jPanelidProvincia.setLayout(this.gridaBagLayoutProvincia);

		jLabelidProvincia = new JLabel();
		jLabelidProvincia.setText("Id");

		jLabelidProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoProvincia = new JLabelMe();
		this.jLabelcodigoProvincia.setText(""+ProvinciaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProvincia.setToolTipText("Codigo");
		this.jLabelcodigoProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProvincia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProvincia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProvincia.setToolTipText(ProvinciaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProvincia = new GridBagLayout();
		this.jPanelcodigoProvincia.setLayout(this.gridaBagLayoutProvincia);


		jTextFieldcodigoProvincia= new JTextFieldMe();

		jTextFieldcodigoProvincia.setEnabled(false);
		jTextFieldcodigoProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProvincia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProvinciaBusqueda= new JButtonMe();
		this.jButtoncodigoProvinciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProvinciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProvinciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProvinciaBusqueda.setText("U");
		this.jButtoncodigoProvinciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProvinciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProvinciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProvincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProvincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProvinciaBusqueda"));

		if(this.provinciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProvinciaBusqueda.setVisible(false);		}


					
		this.jLabelnombreProvincia = new JLabelMe();
		this.jLabelnombreProvincia.setText(""+ProvinciaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProvincia.setToolTipText("Nombre");
		this.jLabelnombreProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProvincia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProvincia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProvincia.setToolTipText(ProvinciaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProvincia = new GridBagLayout();
		this.jPanelnombreProvincia.setLayout(this.gridaBagLayoutProvincia);


		jTextAreanombreProvincia= new JTextAreaMe();
		jTextAreanombreProvincia.setEnabled(false);
		jTextAreanombreProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProvincia.setLineWrap(true);
		jTextAreanombreProvincia.setWrapStyleWord(true);
		jTextAreanombreProvincia.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProvincia.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProvincia,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProvincia = new JScrollPane(jTextAreanombreProvincia);
		jscrollPanenombreProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombreProvinciaBusqueda= new JButtonMe();
		this.jButtonnombreProvinciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProvinciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProvinciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProvinciaBusqueda.setText("U");
		this.jButtonnombreProvinciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProvinciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProvinciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProvincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProvincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProvinciaBusqueda"));

		if(this.provinciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProvinciaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProvincia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisProvincia = new JLabelMe();
		this.jLabelid_paisProvincia.setText(""+ProvinciaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisProvincia.setToolTipText("Pais");
		this.jLabelid_paisProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisProvincia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisProvincia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisProvincia.setToolTipText(ProvinciaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutProvincia = new GridBagLayout();
		this.jPanelid_paisProvincia.setLayout(this.gridaBagLayoutProvincia);


		jComboBoxid_paisProvincia= new JComboBoxMe();
		jComboBoxid_paisProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisProvincia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisProvincia= new JButtonMe();
		this.jButtonid_paisProvincia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisProvincia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisProvincia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisProvincia.setText("Buscar");
		this.jButtonid_paisProvincia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisProvincia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisProvincia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisProvincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisProvincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisProvincia"));

		this.jButtonid_paisProvinciaBusqueda= new JButtonMe();
		this.jButtonid_paisProvinciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisProvinciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisProvinciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisProvinciaBusqueda.setText("U");
		this.jButtonid_paisProvinciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisProvinciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisProvinciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisProvincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisProvincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisProvinciaBusqueda"));

		if(this.provinciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisProvinciaBusqueda.setVisible(false);		}

		this.jButtonid_paisProvinciaUpdate= new JButtonMe();
		this.jButtonid_paisProvinciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisProvinciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisProvinciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisProvinciaUpdate.setText("U");
		this.jButtonid_paisProvinciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisProvinciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisProvinciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisProvincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisProvincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisProvinciaUpdate"));



					
		this.jLabelid_regionProvincia = new JLabelMe();
		this.jLabelid_regionProvincia.setText(""+ProvinciaConstantesFunciones.LABEL_IDREGION+" : *");
		this.jLabelid_regionProvincia.setToolTipText("Region");
		this.jLabelid_regionProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_regionProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_regionProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_regionProvincia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_regionProvincia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_regionProvincia.setToolTipText(ProvinciaConstantesFunciones.LABEL_IDREGION);
		this.gridaBagLayoutProvincia = new GridBagLayout();
		this.jPanelid_regionProvincia.setLayout(this.gridaBagLayoutProvincia);


		jComboBoxid_regionProvincia= new JComboBoxMe();
		jComboBoxid_regionProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_regionProvincia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_regionProvincia= new JButtonMe();
		this.jButtonid_regionProvincia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionProvincia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionProvincia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionProvincia.setText("Buscar");
		this.jButtonid_regionProvincia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_regionProvincia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionProvincia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_regionProvincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionProvincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionProvincia"));

		this.jButtonid_regionProvinciaBusqueda= new JButtonMe();
		this.jButtonid_regionProvinciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionProvinciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionProvinciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_regionProvinciaBusqueda.setText("U");
		this.jButtonid_regionProvinciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_regionProvinciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionProvinciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_regionProvincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionProvincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionProvinciaBusqueda"));

		if(this.provinciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_regionProvinciaBusqueda.setVisible(false);		}

		this.jButtonid_regionProvinciaUpdate= new JButtonMe();
		this.jButtonid_regionProvinciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionProvinciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionProvinciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_regionProvinciaUpdate.setText("U");
		this.jButtonid_regionProvinciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_regionProvinciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionProvinciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_regionProvincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionProvincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionProvinciaUpdate"));



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
		//this.jInternalFrameDetalleProvincia = new ProvinciaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Provincia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProvincia= new GridBagLayout();
		

		
		String sToolTipProvincia="";
		sToolTipProvincia=ProvinciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProvincia+="(Seguridad.Provincia)";
		}
		
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProvincia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProvincia = new JButtonMe();
		this.jButtonModificarProvincia = new JButtonMe();
        this.jButtonActualizarProvincia = new JButtonMe();
        this.jButtonEliminarProvincia = new JButtonMe();
        this.jButtonCancelarProvincia = new JButtonMe();
        this.jButtonGuardarCambiosProvincia = new JButtonMe();
		this.jButtonGuardarCambiosTablaProvincia = new JButtonMe();
		this.jButtonCerrarProvincia = new JButtonMe();
		
		this.jScrollPanelDatosProvincia = new JScrollPane();   
        this.jScrollPanelDatosEdicionProvincia = new JScrollPane();
		this.jScrollPanelDatosGeneralProvincia = new JScrollPane();
				
		
		
		this.jPanelCamposProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Provincia";
		
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provinciaes" + this.sPath));
		} else {
			this.jScrollPanelDatosProvincia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProvincia.setName("jPanelCamposProvincia"); 

		this.jPanelCamposOcultosProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProvincia.setName("jPanelCamposOcultosProvincia"); 

        this.jPanelAccionesProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProvincia.setToolTipText("Acciones");
        this.jPanelAccionesProvincia.setName("Acciones"); 

		this.jPanelAccionesFormularioProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProvincia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProvincia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProvincia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProvincia.setText("Nuevo");
		this.jButtonModificarProvincia.setText("Editar");
        this.jButtonActualizarProvincia.setText("Actualizar");
        this.jButtonEliminarProvincia.setText("Eliminar");
        this.jButtonCancelarProvincia.setText("Cancelar");
        this.jButtonGuardarCambiosProvincia.setText("Guardar");
		this.jButtonGuardarCambiosTablaProvincia.setText("Guardar");
		this.jButtonCerrarProvincia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProvincia,"nuevo_button","Nuevo",this.provinciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProvincia,"modificar_button","Editar",this.provinciaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProvincia,"actualizar_button","Actualizar",this.provinciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProvincia,"eliminar_button","Eliminar",this.provinciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProvincia,"cancelar_button","Cancelar",this.provinciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProvincia,"guardarcambios_button","Guardar",this.provinciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProvincia,"guardarcambiostabla_button","Guardar",this.provinciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProvincia,"cerrar_button","Salir",this.provinciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProvincia.setToolTipText("Nuevo"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProvincia.setToolTipText("Editar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProvincia.setToolTipText("Actualizar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProvincia.setToolTipText("Eliminar)"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProvincia.setToolTipText("Cancelar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProvincia.setToolTipText("Guardar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProvincia.setToolTipText("Guardar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProvincia.setToolTipText("Salir"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProvincia";
		inputMap = this.jButtonNuevoProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProvincia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProvincia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProvincia";
		inputMap = this.jButtonActualizarProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProvincia"));
		
		//ELIMINAR
		sMapKey = "EliminarProvincia";
		inputMap = this.jButtonEliminarProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProvincia"));
		
		//CANCELAR	
		sMapKey = "CancelarProvincia";
		inputMap = this.jButtonCancelarProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProvincia"));
		
		//CERRAR		
		sMapKey = "CerrarProvincia";
		inputMap = this.jButtonCerrarProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProvincia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProvincia";
		inputMap = this.jButtonGuardarCambiosTablaProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProvincia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProvincia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProvincia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProvincia.setToolTipText("Nuevo Provincia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProvincia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProvincia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProvincia.setToolTipText("Sin Cerrar Ventana Provincia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProvincia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProvincia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProvincia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProvincia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProvincia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProvincia.setText("Accion");
		this.jComboBoxTiposAccionesProvincia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProvincia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProvincia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProvincia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProvincia = new JLabelMe();
		
		this.jLabelAccionesProvincia.setText("Acciones");		
		this.jLabelAccionesProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProvincia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProvincia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProvincia=new JTabbedPane();
		this.jTabbedPaneRelacionesProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProvincia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProvincia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProvincia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProvincia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProvincia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProvincia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProvincia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProvincia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProvincia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProvincia = new GridBagLayout();
		
		this.jPanelCamposProvincia.setLayout(gridaBagLayoutCamposProvincia);
		this.jPanelCamposOcultosProvincia.setLayout(gridaBagLayoutCamposOcultosProvincia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvincia.gridy = 0;
	this.gridBagConstraintsProvincia.gridx = 0;
	this.gridBagConstraintsProvincia.ipadx = 0;
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProvincia.add(jLabelIdProvincia, this.gridBagConstraintsProvincia);



	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvincia.gridy = 0;
	this.gridBagConstraintsProvincia.gridx = 1;
	this.gridBagConstraintsProvincia.ipadx = 0;
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProvincia.add(jLabelidProvincia, this.gridBagConstraintsProvincia);


	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvincia.gridy = 0;
	this.gridBagConstraintsProvincia.gridx = 0;
	this.gridBagConstraintsProvincia.ipadx = 0;
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisProvincia.add(jLabelid_paisProvincia, this.gridBagConstraintsProvincia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvincia = new GridBagConstraints();
		//this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = 0;
		this.gridBagConstraintsProvincia.gridx = 2;
		this.gridBagConstraintsProvincia.ipadx = 0;
		this.gridBagConstraintsProvincia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisProvincia.add(jButtonid_paisProvinciaBusqueda, this.gridBagConstraintsProvincia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvincia = new GridBagConstraints();
		//this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = 0;
		this.gridBagConstraintsProvincia.gridx = 3;
		this.gridBagConstraintsProvincia.ipadx = 0;
		this.gridBagConstraintsProvincia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisProvincia.add(jButtonid_paisProvinciaUpdate, this.gridBagConstraintsProvincia);
	}

	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvincia.gridy = 0;
	this.gridBagConstraintsProvincia.gridx = 1;
	this.gridBagConstraintsProvincia.ipadx = 0;
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisProvincia.add(jComboBoxid_paisProvincia, this.gridBagConstraintsProvincia);


	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvincia.gridy = 0;
	this.gridBagConstraintsProvincia.gridx = 0;
	this.gridBagConstraintsProvincia.ipadx = 0;
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_regionProvincia.add(jLabelid_regionProvincia, this.gridBagConstraintsProvincia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvincia = new GridBagConstraints();
		//this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = 0;
		this.gridBagConstraintsProvincia.gridx = 2;
		this.gridBagConstraintsProvincia.ipadx = 0;
		this.gridBagConstraintsProvincia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_regionProvincia.add(jButtonid_regionProvinciaBusqueda, this.gridBagConstraintsProvincia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvincia = new GridBagConstraints();
		//this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = 0;
		this.gridBagConstraintsProvincia.gridx = 3;
		this.gridBagConstraintsProvincia.ipadx = 0;
		this.gridBagConstraintsProvincia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_regionProvincia.add(jButtonid_regionProvinciaUpdate, this.gridBagConstraintsProvincia);
	}

	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvincia.gridy = 0;
	this.gridBagConstraintsProvincia.gridx = 1;
	this.gridBagConstraintsProvincia.ipadx = 0;
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_regionProvincia.add(jComboBoxid_regionProvincia, this.gridBagConstraintsProvincia);


	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvincia.gridy = 0;
	this.gridBagConstraintsProvincia.gridx = 0;
	this.gridBagConstraintsProvincia.ipadx = 0;
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProvincia.add(jLabelcodigoProvincia, this.gridBagConstraintsProvincia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvincia = new GridBagConstraints();
		//this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = 0;
		this.gridBagConstraintsProvincia.gridx = 2;
		this.gridBagConstraintsProvincia.ipadx = 0;
		this.gridBagConstraintsProvincia.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProvincia.add(jButtoncodigoProvinciaBusqueda, this.gridBagConstraintsProvincia);
	}

	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvincia.gridy = 0;
	this.gridBagConstraintsProvincia.gridx = 1;
	this.gridBagConstraintsProvincia.ipadx = 0;
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProvincia.add(jTextFieldcodigoProvincia, this.gridBagConstraintsProvincia);


	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvincia.gridy = 0;
	this.gridBagConstraintsProvincia.gridx = 0;
	this.gridBagConstraintsProvincia.ipadx = 0;
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProvincia.add(jLabelnombreProvincia, this.gridBagConstraintsProvincia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProvincia = new GridBagConstraints();
		//this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = 0;
		this.gridBagConstraintsProvincia.gridx = 2;
		this.gridBagConstraintsProvincia.ipadx = 0;
		this.gridBagConstraintsProvincia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProvincia.add(jButtonnombreProvinciaBusqueda, this.gridBagConstraintsProvincia);
	}

	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProvincia.gridy = 0;
	this.gridBagConstraintsProvincia.gridx = 1;
	this.gridBagConstraintsProvincia.ipadx = 0;
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProvincia.add(jscrollPanenombreProvincia, this.gridBagConstraintsProvincia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvincia.gridy = iYPanelCamposProvincia;
	this.gridBagConstraintsProvincia.gridx = iXPanelCamposProvincia++;
	this.gridBagConstraintsProvincia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvincia.add(this.jPanelidProvincia, this.gridBagConstraintsProvincia);



	if(iXPanelCamposProvincia % 1==0) {
		iXPanelCamposProvincia=0;
		iYPanelCamposProvincia++;
	}
	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvincia.gridy = iYPanelCamposProvincia;
	this.gridBagConstraintsProvincia.gridx = iXPanelCamposProvincia++;
	this.gridBagConstraintsProvincia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvincia.add(this.jPanelid_paisProvincia, this.gridBagConstraintsProvincia);



	if(iXPanelCamposProvincia % 1==0) {
		iXPanelCamposProvincia=0;
		iYPanelCamposProvincia++;
	}
	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvincia.gridy = iYPanelCamposProvincia;
	this.gridBagConstraintsProvincia.gridx = iXPanelCamposProvincia++;
	this.gridBagConstraintsProvincia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvincia.add(this.jPanelid_regionProvincia, this.gridBagConstraintsProvincia);



	if(iXPanelCamposProvincia % 1==0) {
		iXPanelCamposProvincia=0;
		iYPanelCamposProvincia++;
	}
	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvincia.gridy = iYPanelCamposProvincia;
	this.gridBagConstraintsProvincia.gridx = iXPanelCamposProvincia++;
	this.gridBagConstraintsProvincia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvincia.add(this.jPanelcodigoProvincia, this.gridBagConstraintsProvincia);



	if(iXPanelCamposProvincia % 1==0) {
		iXPanelCamposProvincia=0;
		iYPanelCamposProvincia++;
	}
	this.gridBagConstraintsProvincia = new GridBagConstraints();
	this.gridBagConstraintsProvincia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProvincia.gridy = iYPanelCamposProvincia;
	this.gridBagConstraintsProvincia.gridx = iXPanelCamposProvincia++;
	this.gridBagConstraintsProvincia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProvincia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProvincia.add(this.jPanelnombreProvincia, this.gridBagConstraintsProvincia);



	if(iXPanelCamposProvincia % 1==0) {
		iXPanelCamposProvincia=0;
		iYPanelCamposProvincia++;
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
			
		GridBagLayout gridaBagLayoutAccionesProvincia= new GridBagLayout();
		this.jPanelAccionesProvincia.setLayout(gridaBagLayoutAccionesProvincia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProvincia= new GridBagLayout();
		this.jPanelAccionesFormularioProvincia.setLayout(gridaBagLayoutAccionesFormularioProvincia);
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProvincia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProvincia.add(this.jComboBoxTiposAccionesFormularioProvincia, this.gridBagConstraintsProvincia);

		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProvincia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProvincia.add(this.jCheckBoxPostAccionNuevoProvincia, this.gridBagConstraintsProvincia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.provinciaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProvincia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProvincia.add(this.jCheckBoxPostAccionSinCerrarProvincia, this.gridBagConstraintsProvincia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.provinciaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProvincia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProvincia.add(this.jCheckBoxPostAccionSinMensajeProvincia, this.gridBagConstraintsProvincia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.gridy = 0;
		this.gridBagConstraintsProvincia.gridx = iPosXAccion++;
			
		this.jPanelAccionesProvincia.add(this.jButtonModificarProvincia, this.gridBagConstraintsProvincia);							

		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.gridy = 0;
		this.gridBagConstraintsProvincia.gridx =iPosXAccion++;
			
		this.jPanelAccionesProvincia.add(this.jButtonEliminarProvincia, this.gridBagConstraintsProvincia);
		
			
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = 0;		
		this.gridBagConstraintsProvincia.gridx = iPosXAccion++;
		
		this.jPanelAccionesProvincia.add(this.jButtonActualizarProvincia, this.gridBagConstraintsProvincia);


		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = 0;		
		this.gridBagConstraintsProvincia.gridx = iPosXAccion++;
		
		this.jPanelAccionesProvincia.add(this.jButtonGuardarCambiosProvincia, this.gridBagConstraintsProvincia);	
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = 0;		
		this.gridBagConstraintsProvincia.gridx =iPosXAccion++;
		
		this.jPanelAccionesProvincia.add(this.jButtonCancelarProvincia, this.gridBagConstraintsProvincia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProvincia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProvincia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.provinciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProvincia = new GridBagConstraints();						
			this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProvincia.gridx = 0;		
			//this.gridBagConstraintsProvincia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProvincia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProvincia.gridx =0;
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProvincia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProvincia, this.gridBagConstraintsProvincia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProvinciaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProvincia = new ProvinciaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Provincia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Provincia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Provincia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProvinciaModel provinciaModel=new ProvinciaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProvinciaModel.ProvinciaFocusTraversalPolicy provinciaFocusTraversalPolicy = provinciaModel.new ProvinciaFocusTraversalPolicy(this);
			
			//provinciaFocusTraversalPolicy.setprovinciaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(provinciaModel);
			
			
			this.jContentPaneDetalleProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProvincia = new GridBagLayout();	
			this.jContentPaneDetalleProvincia.setLayout(gridaBagLayoutDetalleProvincia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProvincia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProvincia = new GridBagConstraints();
				this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProvincia.gridx = 0;
					
				
				this.jContentPaneDetalleProvincia.add(jTtoolBarDetalleProvincia, gridBagConstraintsProvincia);								
				
}
			
			this.jScrollPanelDatosEdicionProvincia=   new JScrollPane(jContentPaneDetalleProvincia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProvincia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProvincia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProvincia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProvincia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProvincia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProvincia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProvincia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProvincia.gridx = 0;
	        
			this.jContentPaneDetalleProvincia.add(jPanelCamposProvincia, gridBagConstraintsProvincia);
			
			
			
			
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
						&& provinciaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameBarrio(this.puedeCargarPorParteBarrio,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCanton(this.puedeCargarPorParteCanton,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCiudad(this.puedeCargarPorParteCiudad,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(this.puedeCargarPorParteDatoGeneralEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(this.puedeCargarPorParteEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(this.puedeCargarPorParteParametroCarteraDefecto,false,-1);
					
					if(this.provinciaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProvincia= new GridBagConstraints();
						this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProvincia.gridx = 0;
						this.jContentPaneDetalleProvincia.add(this.jTabbedPaneRelacionesProvincia, this.gridBagConstraintsProvincia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProvincia.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameBarrio(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCanton(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCiudad(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProvincia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProvincia = new GridBagConstraints();
					this.gridBagConstraintsProvincia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProvincia.gridx = 0;
					
				
					this.jContentPaneDetalleProvincia.add(jPanelCamposOcultosProvincia, gridBagConstraintsProvincia);
				
					this.jPanelCamposOcultosProvincia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;//22;		
	        this.gridBagConstraintsProvincia.gridx = 0;
	        this.gridBagConstraintsProvincia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProvincia.add(this.jPanelAccionesFormularioProvincia, this.gridBagConstraintsProvincia);							
			
			
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
	        this.gridBagConstraintsProvincia.gridy = iGridyRelaciones;//22;		
	        this.gridBagConstraintsProvincia.gridx = 0;
	        
			
			this.jContentPaneDetalleProvincia.add(this.jPanelAccionesProvincia, this.gridBagConstraintsProvincia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProvincia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProvincia=   new JScrollPane(this.jPanelCamposProvincia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProvincia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProvincia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProvincia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProvincia.gridx = 0;
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProvincia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProvincia, this.gridBagConstraintsProvincia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProvincia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProvincia, this.gridBagConstraintsProvincia);			
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProvincia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProvincia, this.gridBagConstraintsProvincia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvincia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProvincia, this.gridBagConstraintsProvincia);
			
			
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvincia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProvincia, this.gridBagConstraintsProvincia);
		
			
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProvincia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProvincia, this.gridBagConstraintsProvincia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProvincia;//jContentPane;
		
		return jScrollPanelDatosEdicionProvincia;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameBarrio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.barrioSessionBean=new BarrioSessionBean();
		this.barrioSessionBean.setConGuardarRelaciones(false);
		this.barrioSessionBean.setEsGuardarRelacionado(true);

		this.barrioBeanSwingJInternalFrame=null;//new BarrioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.barrioBeanSwingJInternalFramePopup=new BarrioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.barrioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.barrioSessionBean.getEsGuardarRelacionado()) {

				BarrioJInternalFrame.STIPO_TAMANIO_GENERAL=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;
				BarrioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.barrioSessionBean.setEsGuardarRelacionado(true);

				this.barrioBeanSwingJInternalFrame=new BarrioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.barrioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.barrioBeanSwingJInternalFrame.setbarrioSessionBean(this.barrioSessionBean);

				//this.gridBagConstraintsProvincia = new GridBagConstraints();
				//this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProvincia.gridx = 0;
				//this.jContentPaneDetalleProvincia.add(this.barrioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProvincia);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProvincia.add("Barrios",this.barrioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProvincia.setComponentAt(iIndexTab,this.barrioBeanSwingJInternalFrame.getContentPane());
				}

				//BarrioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.barrioSessionBean.setEsGuardarRelacionado(false);
				this.barrioBeanSwingJInternalFrame=null;//new BarrioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.barrioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBarrio) {
					this.jTabbedPaneRelacionesProvincia.add("Barrios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCanton(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cantonSessionBean=new CantonSessionBean();
		this.cantonSessionBean.setConGuardarRelaciones(false);
		this.cantonSessionBean.setEsGuardarRelacionado(true);

		this.cantonBeanSwingJInternalFrame=null;//new CantonBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cantonBeanSwingJInternalFramePopup=new CantonBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cantonBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cantonSessionBean.getEsGuardarRelacionado()) {

				CantonJInternalFrame.STIPO_TAMANIO_GENERAL=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CantonJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cantonSessionBean.setEsGuardarRelacionado(true);

				this.cantonBeanSwingJInternalFrame=new CantonBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cantonBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cantonBeanSwingJInternalFrame.setcantonSessionBean(this.cantonSessionBean);

				//this.gridBagConstraintsProvincia = new GridBagConstraints();
				//this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProvincia.gridx = 0;
				//this.jContentPaneDetalleProvincia.add(this.cantonBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProvincia);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProvincia.add("Cantones",this.cantonBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProvincia.setComponentAt(iIndexTab,this.cantonBeanSwingJInternalFrame.getContentPane());
				}

				//CantonJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cantonSessionBean.setEsGuardarRelacionado(false);
				this.cantonBeanSwingJInternalFrame=null;//new CantonBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cantonSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCanton) {
					this.jTabbedPaneRelacionesProvincia.add("Cantones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCiudad(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.ciudadSessionBean=new CiudadSessionBean();
		this.ciudadSessionBean.setConGuardarRelaciones(false);
		this.ciudadSessionBean.setEsGuardarRelacionado(true);

		this.ciudadBeanSwingJInternalFrame=null;//new CiudadBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.ciudadBeanSwingJInternalFramePopup=new CiudadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.ciudadBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.ciudadSessionBean.getEsGuardarRelacionado()) {

				CiudadJInternalFrame.STIPO_TAMANIO_GENERAL=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CiudadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.ciudadSessionBean.setEsGuardarRelacionado(true);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.ciudadBeanSwingJInternalFrame.setciudadSessionBean(this.ciudadSessionBean);

				//this.gridBagConstraintsProvincia = new GridBagConstraints();
				//this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProvincia.gridx = 0;
				//this.jContentPaneDetalleProvincia.add(this.ciudadBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProvincia);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProvincia.add("Ciudades",this.ciudadBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProvincia.setComponentAt(iIndexTab,this.ciudadBeanSwingJInternalFrame.getContentPane());
				}

				//CiudadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.ciudadSessionBean.setEsGuardarRelacionado(false);
				this.ciudadBeanSwingJInternalFrame=null;//new CiudadBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.ciudadSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCiudad) {
					this.jTabbedPaneRelacionesProvincia.add("Ciudades",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsProvincia = new GridBagConstraints();
				//this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProvincia.gridx = 0;
				//this.jContentPaneDetalleProvincia.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProvincia);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProvincia.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProvincia.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesProvincia.add("Clientes",new JPanel());
				}
			}
		}
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

				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

				this.datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datogeneralempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datogeneralempleadoBeanSwingJInternalFrame.setdatogeneralempleadoSessionBean(this.datogeneralempleadoSessionBean);

				//this.gridBagConstraintsProvincia = new GridBagConstraints();
				//this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProvincia.gridx = 0;
				//this.jContentPaneDetalleProvincia.add(this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProvincia);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProvincia.add("Dato General Empleados",this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProvincia.setComponentAt(iIndexTab,this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoGeneralEmpleado) {
					this.jTabbedPaneRelacionesProvincia.add("Dato General Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoSessionBean=new EmpleadoSessionBean();
		this.empleadoSessionBean.setConGuardarRelaciones(false);
		this.empleadoSessionBean.setEsGuardarRelacionado(true);

		this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {

				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoSessionBean.setEsGuardarRelacionado(true);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoBeanSwingJInternalFrame.setempleadoSessionBean(this.empleadoSessionBean);

				//this.gridBagConstraintsProvincia = new GridBagConstraints();
				//this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProvincia.gridx = 0;
				//this.jContentPaneDetalleProvincia.add(this.empleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProvincia);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProvincia.add("Empleados",this.empleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProvincia.setComponentAt(iIndexTab,this.empleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoSessionBean.setEsGuardarRelacionado(false);
				this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleado) {
					this.jTabbedPaneRelacionesProvincia.add("Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocarteradefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocarteradefectoBeanSwingJInternalFrame.setparametrocarteradefectoSessionBean(this.parametrocarteradefectoSessionBean);

				//this.gridBagConstraintsProvincia = new GridBagConstraints();
				//this.gridBagConstraintsProvincia.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProvincia.gridx = 0;
				//this.jContentPaneDetalleProvincia.add(this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProvincia);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProvincia.add("Parametro Cartera Defectos",this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProvincia.setComponentAt(iIndexTab,this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCarteraDefecto) {
					this.jTabbedPaneRelacionesProvincia.add("Parametro Cartera Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarBarrioBeanSwingJInternalFrame(List<Provincia> provincias,Provincia provincia,BarrioBeanSwingJInternalFrame barrioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//barrioBeanSwingJInternalFrame=new BarrioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					barrioBeanSwingJInternalFrame.getBarrioLogic().setConnexion(this.provinciaLogic.getConnexion());

					barrioBeanSwingJInternalFrame.setprovinciasForeignKey(provincias);
					barrioBeanSwingJInternalFrame.setprovinciaForeignKey(provincia);
					barrioBeanSwingJInternalFrame.barrioSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
					barrioBeanSwingJInternalFrame.barrioSessionBean.setlidProvinciaActual(provincia.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					barrioBeanSwingJInternalFrame.cargarCombosForeignKeyBarrio(barrioBeanSwingJInternalFrame.isCargarCombosDependencia);
					barrioBeanSwingJInternalFrame.setVisibilidadBusquedasParaProvincia(true);
					barrioBeanSwingJInternalFrame.setid_provinciaFK_IdProvincia(provincia.getId());

					if(!this.conCargarFormDetalle) {
						barrioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					barrioBeanSwingJInternalFrame.setSelectedItemCombosFrameProvinciaForeignKey(provincia,1,false,true,true);
					barrioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					barrioBeanSwingJInternalFrame.procesarBusqueda("FK_IdProvincia");
					barrioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProvincia");
					barrioBeanSwingJInternalFrame.inicializarActualizarBindingTablaBarrio(true);
					barrioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBarrio("n",barrioBeanSwingJInternalFrame.isGuardarCambiosEnLote, barrioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					barrioBeanSwingJInternalFrame.setAutoscrolls(true);
					barrioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						barrioBeanSwingJInternalFrame.actualizarEstadoPanelsBarrio("relacionado");
					} else {
						barrioBeanSwingJInternalFrame.actualizarEstadoPanelsBarrio("no_relacionado");
					}

					barrioBeanSwingJInternalFrame.getjButtonRecargarInformacionBarrio().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCantonBeanSwingJInternalFrame(List<Provincia> provincias,Provincia provincia,CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cantonBeanSwingJInternalFrame=new CantonBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cantonBeanSwingJInternalFrame.getCantonLogic().setConnexion(this.provinciaLogic.getConnexion());

					cantonBeanSwingJInternalFrame.setprovinciasForeignKey(provincias);
					cantonBeanSwingJInternalFrame.setprovinciaForeignKey(provincia);
					cantonBeanSwingJInternalFrame.cantonSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
					cantonBeanSwingJInternalFrame.cantonSessionBean.setlidProvinciaActual(provincia.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cantonBeanSwingJInternalFrame.cargarCombosForeignKeyCanton(cantonBeanSwingJInternalFrame.isCargarCombosDependencia);
					cantonBeanSwingJInternalFrame.setVisibilidadBusquedasParaProvincia(true);
					cantonBeanSwingJInternalFrame.setid_provinciaFK_IdProvincia(provincia.getId());

					if(!this.conCargarFormDetalle) {
						cantonBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cantonBeanSwingJInternalFrame.setSelectedItemCombosFrameProvinciaForeignKey(provincia,1,false,true,true);
					cantonBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cantonBeanSwingJInternalFrame.procesarBusqueda("FK_IdProvincia");
					cantonBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProvincia");
					cantonBeanSwingJInternalFrame.inicializarActualizarBindingTablaCanton(true);
					cantonBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCanton("n",cantonBeanSwingJInternalFrame.isGuardarCambiosEnLote, cantonBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cantonBeanSwingJInternalFrame.setAutoscrolls(true);
					cantonBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cantonBeanSwingJInternalFrame.actualizarEstadoPanelsCanton("relacionado");
					} else {
						cantonBeanSwingJInternalFrame.actualizarEstadoPanelsCanton("no_relacionado");
					}

					cantonBeanSwingJInternalFrame.getjButtonRecargarInformacionCanton().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(List<Provincia> provincias,Provincia provincia,DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralempleadoBeanSwingJInternalFrame.getDatoGeneralEmpleadoLogic().setConnexion(this.provinciaLogic.getConnexion());

					datogeneralempleadoBeanSwingJInternalFrame.setprovinciasForeignKey(provincias);
					datogeneralempleadoBeanSwingJInternalFrame.setprovinciaForeignKey(provincia);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setlidProvinciaActual(provincia.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datogeneralempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyDatoGeneralEmpleado(datogeneralempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					datogeneralempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProvincia(true);
					datogeneralempleadoBeanSwingJInternalFrame.setid_provinciaFK_IdProvincia(provincia.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					datogeneralempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameProvinciaForeignKey(provincia,1,false,true,true);
					datogeneralempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProvincia");
					datogeneralempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProvincia");
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

		public void cargarEmpleadoBeanSwingJInternalFrame(List<Provincia> provincias,Provincia provincia,EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.provinciaLogic.getConnexion());

					empleadoBeanSwingJInternalFrame.setprovinciasForeignKey(provincias);
					empleadoBeanSwingJInternalFrame.setprovinciaForeignKey(provincia);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setlidProvinciaActual(provincia.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleado(empleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProvincia(true);
					empleadoBeanSwingJInternalFrame.setid_provinciaFK_IdProvincia(provincia.getId());

					if(!this.conCargarFormDetalle) {
						empleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameProvinciaForeignKey(provincia,1,false,true,true);
					empleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProvincia");
					empleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProvincia");
					empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(true);
					empleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleado("n",empleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("relacionado");
					} else {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");
					}

					empleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarClienteBeanSwingJInternalFrame(List<Provincia> provincias,Provincia provincia,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.provinciaLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setprovinciasForeignKey(provincias);
					clienteBeanSwingJInternalFrame.setprovinciaForeignKey(provincia);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidProvinciaActual(provincia.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaProvincia(true);
					clienteBeanSwingJInternalFrame.setid_provinciaFK_IdProvincia(provincia.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameProvinciaForeignKey(provincia,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdProvincia");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProvincia");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroCarteraDefectoBeanSwingJInternalFrame(List<Provincia> provincias,Provincia provincia,ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocarteradefectoBeanSwingJInternalFrame.getParametroCarteraDefectoLogic().setConnexion(this.provinciaLogic.getConnexion());

					parametrocarteradefectoBeanSwingJInternalFrame.setprovinciasForeignKey(provincias);
					parametrocarteradefectoBeanSwingJInternalFrame.setprovinciaForeignKey(provincia);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setlidProvinciaActual(provincia.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocarteradefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCarteraDefecto(parametrocarteradefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProvincia(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setid_provinciaFK_IdProvincia(provincia.getId());

					if(!this.conCargarFormDetalle) {
						parametrocarteradefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocarteradefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameProvinciaForeignKey(provincia,1,false,true,true);
					parametrocarteradefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocarteradefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProvincia");
					parametrocarteradefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProvincia");
					parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(true);
					parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCarteraDefecto("n",parametrocarteradefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocarteradefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocarteradefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("relacionado");
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");
					}

					parametrocarteradefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCarteraDefecto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCiudadBeanSwingJInternalFrame(List<Provincia> provincias,Provincia provincia,CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.provinciaLogic.getConnexion());

					ciudadBeanSwingJInternalFrame.setprovinciasForeignKey(provincias);
					ciudadBeanSwingJInternalFrame.setprovinciaForeignKey(provincia);
					ciudadBeanSwingJInternalFrame.ciudadSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
					ciudadBeanSwingJInternalFrame.ciudadSessionBean.setlidProvinciaActual(provincia.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					ciudadBeanSwingJInternalFrame.cargarCombosForeignKeyCiudad(ciudadBeanSwingJInternalFrame.isCargarCombosDependencia);
					ciudadBeanSwingJInternalFrame.setVisibilidadBusquedasParaProvincia(true);
					ciudadBeanSwingJInternalFrame.setid_provinciaFK_IdProvincia(provincia.getId());

					if(!this.conCargarFormDetalle) {
						ciudadBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					ciudadBeanSwingJInternalFrame.setSelectedItemCombosFrameProvinciaForeignKey(provincia,1,false,true,true);
					ciudadBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					ciudadBeanSwingJInternalFrame.procesarBusqueda("FK_IdProvincia");
					ciudadBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProvincia");
					ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad(true);
					ciudadBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCiudad("n",ciudadBeanSwingJInternalFrame.isGuardarCambiosEnLote, ciudadBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					ciudadBeanSwingJInternalFrame.setAutoscrolls(true);
					ciudadBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						ciudadBeanSwingJInternalFrame.actualizarEstadoPanelsCiudad("relacionado");
					} else {
						ciudadBeanSwingJInternalFrame.actualizarEstadoPanelsCiudad("no_relacionado");
					}

					ciudadBeanSwingJInternalFrame.getjButtonRecargarInformacionCiudad().setVisible(false);

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
