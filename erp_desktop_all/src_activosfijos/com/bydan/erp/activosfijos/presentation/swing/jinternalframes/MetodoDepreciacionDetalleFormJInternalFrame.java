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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.MetodoDepreciacionConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class MetodoDepreciacionDetalleFormJInternalFrame extends MetodoDepreciacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMetodoDepreciacion;
	
	protected JMenuBar jmenuBarDetalleMetodoDepreciacion;
	
	protected JMenu jmenuDetalleMetodoDepreciacion;
	protected JMenu jmenuDetalleArchivoMetodoDepreciacion;
	protected JMenu jmenuDetalleAccionesMetodoDepreciacion;
	protected JMenu jmenuDetalleDatosMetodoDepreciacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMetodoDepreciacion;	
	protected GridBagConstraints gridBagConstraintsMetodoDepreciacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MetodoDepreciacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleMetodoDepreciacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public MetodoDepreciacionSessionBean metododepreciacionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public AnioSessionBean anioSessionBean;	
	
	public MetodoDepreciacionLogic metododepreciacionLogic;
	
	public JScrollPane jScrollPanelDatosMetodoDepreciacion;
	public JScrollPane jScrollPanelDatosEdicionMetodoDepreciacion;
	public JScrollPane jScrollPanelDatosGeneralMetodoDepreciacion;
	
	protected JPanel jPanelCamposMetodoDepreciacion;    
	protected JPanel jPanelCamposOcultosMetodoDepreciacion;    	
	protected JPanel jPanelAccionesMetodoDepreciacion;
	protected JPanel jPanelAccionesFormularioMetodoDepreciacion;
    
	
	
	protected Integer iXPanelCamposMetodoDepreciacion=0;
	protected Integer iYPanelCamposMetodoDepreciacion=0;
	
	protected Integer iXPanelCamposOcultosMetodoDepreciacion=0;
	protected Integer iYPanelCamposOcultosMetodoDepreciacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMetodoDepreciacion;
	public JButton jButtonModificarMetodoDepreciacion;
	public JButton jButtonActualizarMetodoDepreciacion;
    public JButton jButtonEliminarMetodoDepreciacion;
	public JButton jButtonCancelarMetodoDepreciacion;
    public JButton jButtonGuardarCambiosMetodoDepreciacion;
	public JButton jButtonGuardarCambiosTablaMetodoDepreciacion;
	protected JButton jButtonCerrarMetodoDepreciacion;
	
	
	protected JButton jButtonProcesarInformacionMetodoDepreciacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMetodoDepreciacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMetodoDepreciacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMetodoDepreciacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMetodoDepreciacion;
	protected JButton jButtonModificarToolBarMetodoDepreciacion;
	protected JButton jButtonActualizarToolBarMetodoDepreciacion;
    protected JButton jButtonEliminarToolBarMetodoDepreciacion;
	protected JButton jButtonCancelarToolBarMetodoDepreciacion;
    protected JButton jButtonGuardarCambiosToolBarMetodoDepreciacion;
	protected JButton jButtonGuardarCambiosTablaToolBarMetodoDepreciacion;
	protected JButton jButtonMostrarOcultarTablaToolBarMetodoDepreciacion;
	protected JButton jButtonCerrarToolBarMetodoDepreciacion;
	
	protected JButton jButtonProcesarInformacionToolBarMetodoDepreciacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMetodoDepreciacion;
	protected JMenuItem jMenuItemModificarMetodoDepreciacion;
	protected JMenuItem jMenuItemActualizarMetodoDepreciacion;
    protected JMenuItem jMenuItemEliminarMetodoDepreciacion;
	protected JMenuItem jMenuItemCancelarMetodoDepreciacion;
    protected JMenuItem jMenuItemGuardarCambiosMetodoDepreciacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaMetodoDepreciacion;
	protected JMenuItem jMenuItemCerrarMetodoDepreciacion;
	protected JMenuItem jMenuItemDetalleCerrarMetodoDepreciacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarMetodoDepreciacion;
	
	protected JMenuItem jMenuItemProcesarInformacionMetodoDepreciacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMetodoDepreciacion;
	protected JMenuItem jMenuItemMostrarOcultarMetodoDepreciacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMetodoDepreciacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMetodoDepreciacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMetodoDepreciacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMetodoDepreciacion;
	public JLabel jLabelIdMetodoDepreciacion;
	public JLabel jLabelidMetodoDepreciacion;
	public JButton jButtonidMetodoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeMetodoDepreciacion;
	public JLabel jLabelfecha_desdeMetodoDepreciacion;
	//public JFormattedTextField jDateChooserfecha_desdeMetodoDepreciacion;

	public JDateChooser jDateChooserfecha_desdeMetodoDepreciacion;
	public JButton jButtonfecha_desdeMetodoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaMetodoDepreciacion;
	public JLabel jLabelfecha_hastaMetodoDepreciacion;
	//public JFormattedTextField jDateChooserfecha_hastaMetodoDepreciacion;

	public JDateChooser jDateChooserfecha_hastaMetodoDepreciacion;
	public JButton jButtonfecha_hastaMetodoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeMetodoDepreciacion;
	public JLabel jLabelporcentajeMetodoDepreciacion;
	public JTextField jTextFieldporcentajeMetodoDepreciacion;
	public JButton jButtonporcentajeMetodoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelvalorMetodoDepreciacion;
	public JLabel jLabelvalorMetodoDepreciacion;
	public JTextField jTextFieldvalorMetodoDepreciacion;
	public JButton jButtonvalorMetodoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasMetodoDepreciacion;
	public JLabel jLabelnumero_diasMetodoDepreciacion;
	public JTextField jTextFieldnumero_diasMetodoDepreciacion;
	public JButton jButtonnumero_diasMetodoDepreciacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMetodoDepreciacion;
	public JLabel jLabelid_empresaMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMetodoDepreciacion;
	public JButton jButtonid_empresaMetodoDepreciacion= new JButtonMe();
	public JButton jButtonid_empresaMetodoDepreciacionUpdate= new JButtonMe();
	public JButton jButtonid_empresaMetodoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalMetodoDepreciacion;
	public JLabel jLabelid_sucursalMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalMetodoDepreciacion;
	public JButton jButtonid_sucursalMetodoDepreciacion= new JButtonMe();
	public JButton jButtonid_sucursalMetodoDepreciacionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalMetodoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_activo_fijoMetodoDepreciacion;
	public JLabel jLabelid_detalle_activo_fijoMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoMetodoDepreciacion;
	public JButton jButtonid_detalle_activo_fijoMetodoDepreciacion= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelid_anioMetodoDepreciacion;
	public JLabel jLabelid_anioMetodoDepreciacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioMetodoDepreciacion;
	public JButton jButtonid_anioMetodoDepreciacion= new JButtonMe();
	public JButton jButtonid_anioMetodoDepreciacionUpdate= new JButtonMe();
	public JButton jButtonid_anioMetodoDepreciacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMetodoDepreciacion;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MetodoDepreciacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMetodoDepreciacion=new JPanel();
				this.jPanelAccionesFormularioMetodoDepreciacion=new JPanel();
				this.jmenuBarDetalleMetodoDepreciacion=new JMenuBar();
				this.jTtoolBarDetalleMetodoDepreciacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MetodoDepreciacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MetodoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MetodoDepreciacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MetodoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MetodoDepreciacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MetodoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MetodoDepreciacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MetodoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MetodoDepreciacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MetodoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMetodoDepreciacion() {
		return this.jButtonActualizarToolBarMetodoDepreciacion;
	}
	
	public JButton getjButtonEliminarToolBarMetodoDepreciacion() {
		return this.jButtonEliminarToolBarMetodoDepreciacion;
	}
	
	public JButton getjButtonCancelarToolBarMetodoDepreciacion() {
		return this.jButtonCancelarToolBarMetodoDepreciacion;
	}		
	
	public JButton getjButtonProcesarInformacionMetodoDepreciacion() {
		return this.jButtonProcesarInformacionMetodoDepreciacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMetodoDepreciacion)	{
		this.jButtonProcesarInformacionMetodoDepreciacion = jButtonProcesarInformacionMetodoDepreciacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMetodoDepreciacion() {
		return this.jComboBoxTiposAccionesMetodoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMetodoDepreciacion(
			JComboBox jComboBoxTiposRelacionesMetodoDepreciacion) {
		this.jComboBoxTiposRelacionesMetodoDepreciacion = jComboBoxTiposRelacionesMetodoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMetodoDepreciacion(
			JComboBox jComboBoxTiposAccionesMetodoDepreciacion) {
		this.jComboBoxTiposAccionesMetodoDepreciacion = jComboBoxTiposAccionesMetodoDepreciacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMetodoDepreciacion() {
		return this.jComboBoxTiposAccionesFormularioMetodoDepreciacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMetodoDepreciacion(
			JComboBox jComboBoxTiposAccionesFormularioMetodoDepreciacion) {
		this.jComboBoxTiposAccionesFormularioMetodoDepreciacion = jComboBoxTiposAccionesFormularioMetodoDepreciacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
		
		this.metododepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.metododepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.metododepreciacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MetodoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MetodoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MetodoDepreciacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Metodo Depreciacion MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
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
	
		MetodoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMetodoDepreciacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMetodoDepreciacion=new JButtonMe();
				this.jButtonModificarToolBarMetodoDepreciacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMetodoDepreciacion,this.jTtoolBarDetalleMetodoDepreciacion,
							"actualizar","actualizar","Actualizar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMetodoDepreciacion,this.jTtoolBarDetalleMetodoDepreciacion,
							"eliminar","eliminar","Eliminar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMetodoDepreciacion,this.jTtoolBarDetalleMetodoDepreciacion,
							"cancelar","cancelar","Cancelar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMetodoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMetodoDepreciacion,this.jTtoolBarDetalleMetodoDepreciacion,
							"guardarcambios","guardarcambios","Guardar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMetodoDepreciacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMetodoDepreciacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMetodoDepreciacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMetodoDepreciacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMetodoDepreciacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMetodoDepreciacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMetodoDepreciacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMetodoDepreciacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMetodoDepreciacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMetodoDepreciacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMetodoDepreciacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMetodoDepreciacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMetodoDepreciacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMetodoDepreciacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMetodoDepreciacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMetodoDepreciacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMetodoDepreciacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMetodoDepreciacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMetodoDepreciacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMetodoDepreciacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMetodoDepreciacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMetodoDepreciacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMetodoDepreciacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMetodoDepreciacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMetodoDepreciacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMetodoDepreciacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMetodoDepreciacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMetodoDepreciacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMetodoDepreciacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMetodoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMetodoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMetodoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMetodoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMetodoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMetodoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMetodoDepreciacion.add(this.jMenuItemDetalleCerrarMetodoDepreciacion);
		
		this.jmenuDetalleAccionesMetodoDepreciacion.add(this.jMenuItemActualizarMetodoDepreciacion);
		this.jmenuDetalleAccionesMetodoDepreciacion.add(this.jMenuItemEliminarMetodoDepreciacion);
		this.jmenuDetalleAccionesMetodoDepreciacion.add(this.jMenuItemCancelarMetodoDepreciacion);		
		
		//this.jmenuDetalleDatosMetodoDepreciacion.add(this.jMenuItemDetalleAbrirOrderByMetodoDepreciacion);				
		this.jmenuDetalleDatosMetodoDepreciacion.add(this.jMenuItemDetalleMostarOcultarMetodoDepreciacion);				
				
		//this.jmenuDetalleAccionesMetodoDepreciacion.add(this.jMenuItemGuardarCambiosMetodoDepreciacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMetodoDepreciacion.add(this.jmenuDetalleArchivoMetodoDepreciacion);		
		this.jmenuBarDetalleMetodoDepreciacion.add(this.jmenuDetalleAccionesMetodoDepreciacion);		
		this.jmenuBarDetalleMetodoDepreciacion.add(this.jmenuDetalleDatosMetodoDepreciacion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMetodoDepreciacion);				
	}
	
	
	public void inicializarElementosCamposMetodoDepreciacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMetodoDepreciacion = new JLabelMe();
		jLabelIdMetodoDepreciacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMetodoDepreciacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMetodoDepreciacion.setToolTipText(MetodoDepreciacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMetodoDepreciacion= new GridBagLayout();

		this.jPanelidMetodoDepreciacion.setLayout(this.gridaBagLayoutMetodoDepreciacion);

		jLabelidMetodoDepreciacion = new JLabel();
		jLabelidMetodoDepreciacion.setText("Id");

		jLabelidMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeMetodoDepreciacion = new JLabelMe();
		this.jLabelfecha_desdeMetodoDepreciacion.setText(""+MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeMetodoDepreciacion.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeMetodoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeMetodoDepreciacion.setToolTipText(MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutMetodoDepreciacion = new GridBagLayout();
		this.jPanelfecha_desdeMetodoDepreciacion.setLayout(this.gridaBagLayoutMetodoDepreciacion);


		//jFormattedTextFieldfecha_desdeMetodoDepreciacion= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeMetodoDepreciacion= new JDateChooser();
		jDateChooserfecha_desdeMetodoDepreciacion.setEnabled(false);
		jDateChooserfecha_desdeMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeMetodoDepreciacion.setDate(new Date());
		jDateChooserfecha_desdeMetodoDepreciacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeMetodoDepreciacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeMetodoDepreciacionBusqueda= new JButtonMe();
		this.jButtonfecha_desdeMetodoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeMetodoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeMetodoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeMetodoDepreciacionBusqueda.setText("U");
		this.jButtonfecha_desdeMetodoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeMetodoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeMetodoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeMetodoDepreciacionBusqueda"));

		if(this.metododepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeMetodoDepreciacionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaMetodoDepreciacion = new JLabelMe();
		this.jLabelfecha_hastaMetodoDepreciacion.setText(""+MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaMetodoDepreciacion.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaMetodoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaMetodoDepreciacion.setToolTipText(MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutMetodoDepreciacion = new GridBagLayout();
		this.jPanelfecha_hastaMetodoDepreciacion.setLayout(this.gridaBagLayoutMetodoDepreciacion);


		//jFormattedTextFieldfecha_hastaMetodoDepreciacion= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaMetodoDepreciacion= new JDateChooser();
		jDateChooserfecha_hastaMetodoDepreciacion.setEnabled(false);
		jDateChooserfecha_hastaMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaMetodoDepreciacion.setDate(new Date());
		jDateChooserfecha_hastaMetodoDepreciacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaMetodoDepreciacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaMetodoDepreciacionBusqueda= new JButtonMe();
		this.jButtonfecha_hastaMetodoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaMetodoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaMetodoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaMetodoDepreciacionBusqueda.setText("U");
		this.jButtonfecha_hastaMetodoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaMetodoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaMetodoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaMetodoDepreciacionBusqueda"));

		if(this.metododepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaMetodoDepreciacionBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeMetodoDepreciacion = new JLabelMe();
		this.jLabelporcentajeMetodoDepreciacion.setText(""+MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeMetodoDepreciacion.setToolTipText("Porcentaje");
		this.jLabelporcentajeMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeMetodoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeMetodoDepreciacion.setToolTipText(MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutMetodoDepreciacion = new GridBagLayout();
		this.jPanelporcentajeMetodoDepreciacion.setLayout(this.gridaBagLayoutMetodoDepreciacion);


		jTextFieldporcentajeMetodoDepreciacion= new JTextFieldMe();
		jTextFieldporcentajeMetodoDepreciacion.setEnabled(false);
		jTextFieldporcentajeMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeMetodoDepreciacion.setText("0.0");

		this.jButtonporcentajeMetodoDepreciacionBusqueda= new JButtonMe();
		this.jButtonporcentajeMetodoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeMetodoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeMetodoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeMetodoDepreciacionBusqueda.setText("U");
		this.jButtonporcentajeMetodoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeMetodoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeMetodoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeMetodoDepreciacionBusqueda"));

		if(this.metododepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeMetodoDepreciacionBusqueda.setVisible(false);		}


					
		this.jLabelvalorMetodoDepreciacion = new JLabelMe();
		this.jLabelvalorMetodoDepreciacion.setText(""+MetodoDepreciacionConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorMetodoDepreciacion.setToolTipText("Valor");
		this.jLabelvalorMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorMetodoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorMetodoDepreciacion.setToolTipText(MetodoDepreciacionConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutMetodoDepreciacion = new GridBagLayout();
		this.jPanelvalorMetodoDepreciacion.setLayout(this.gridaBagLayoutMetodoDepreciacion);


		jTextFieldvalorMetodoDepreciacion= new JTextFieldMe();
		jTextFieldvalorMetodoDepreciacion.setEnabled(false);
		jTextFieldvalorMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorMetodoDepreciacion.setText("0.0");

		this.jButtonvalorMetodoDepreciacionBusqueda= new JButtonMe();
		this.jButtonvalorMetodoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorMetodoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorMetodoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorMetodoDepreciacionBusqueda.setText("U");
		this.jButtonvalorMetodoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorMetodoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorMetodoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorMetodoDepreciacionBusqueda"));

		if(this.metododepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorMetodoDepreciacionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasMetodoDepreciacion = new JLabelMe();
		this.jLabelnumero_diasMetodoDepreciacion.setText(""+MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasMetodoDepreciacion.setToolTipText("Numero Dias");
		this.jLabelnumero_diasMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasMetodoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasMetodoDepreciacion.setToolTipText(MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutMetodoDepreciacion = new GridBagLayout();
		this.jPanelnumero_diasMetodoDepreciacion.setLayout(this.gridaBagLayoutMetodoDepreciacion);


		jTextFieldnumero_diasMetodoDepreciacion= new JTextFieldMe();
		jTextFieldnumero_diasMetodoDepreciacion.setEnabled(false);
		jTextFieldnumero_diasMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasMetodoDepreciacion.setText("0");

		this.jButtonnumero_diasMetodoDepreciacionBusqueda= new JButtonMe();
		this.jButtonnumero_diasMetodoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasMetodoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasMetodoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasMetodoDepreciacionBusqueda.setText("U");
		this.jButtonnumero_diasMetodoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasMetodoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasMetodoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasMetodoDepreciacionBusqueda"));

		if(this.metododepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasMetodoDepreciacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMetodoDepreciacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMetodoDepreciacion = new JLabelMe();
		this.jLabelid_empresaMetodoDepreciacion.setText(""+MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMetodoDepreciacion.setToolTipText("Empresa");
		this.jLabelid_empresaMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMetodoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMetodoDepreciacion.setToolTipText(MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMetodoDepreciacion = new GridBagLayout();
		this.jPanelid_empresaMetodoDepreciacion.setLayout(this.gridaBagLayoutMetodoDepreciacion);


		jComboBoxid_empresaMetodoDepreciacion= new JComboBoxMe();
		jComboBoxid_empresaMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMetodoDepreciacion.setEnabled(false);

		this.jButtonid_empresaMetodoDepreciacion= new JButtonMe();
		this.jButtonid_empresaMetodoDepreciacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMetodoDepreciacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMetodoDepreciacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMetodoDepreciacion.setText("Buscar");
		this.jButtonid_empresaMetodoDepreciacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMetodoDepreciacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMetodoDepreciacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMetodoDepreciacion"));

		this.jButtonid_empresaMetodoDepreciacionBusqueda= new JButtonMe();
		this.jButtonid_empresaMetodoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMetodoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMetodoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMetodoDepreciacionBusqueda.setText("U");
		this.jButtonid_empresaMetodoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMetodoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMetodoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMetodoDepreciacionBusqueda"));

		if(this.metododepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMetodoDepreciacionBusqueda.setVisible(false);		}

		this.jButtonid_empresaMetodoDepreciacionUpdate= new JButtonMe();
		this.jButtonid_empresaMetodoDepreciacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMetodoDepreciacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMetodoDepreciacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMetodoDepreciacionUpdate.setText("U");
		this.jButtonid_empresaMetodoDepreciacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMetodoDepreciacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMetodoDepreciacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMetodoDepreciacionUpdate"));



					
		this.jLabelid_sucursalMetodoDepreciacion = new JLabelMe();
		this.jLabelid_sucursalMetodoDepreciacion.setText(""+MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalMetodoDepreciacion.setToolTipText("Sucursal");
		this.jLabelid_sucursalMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalMetodoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalMetodoDepreciacion.setToolTipText(MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutMetodoDepreciacion = new GridBagLayout();
		this.jPanelid_sucursalMetodoDepreciacion.setLayout(this.gridaBagLayoutMetodoDepreciacion);


		jComboBoxid_sucursalMetodoDepreciacion= new JComboBoxMe();
		jComboBoxid_sucursalMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalMetodoDepreciacion.setEnabled(false);

		this.jButtonid_sucursalMetodoDepreciacion= new JButtonMe();
		this.jButtonid_sucursalMetodoDepreciacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMetodoDepreciacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMetodoDepreciacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMetodoDepreciacion.setText("Buscar");
		this.jButtonid_sucursalMetodoDepreciacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalMetodoDepreciacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMetodoDepreciacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMetodoDepreciacion"));

		this.jButtonid_sucursalMetodoDepreciacionBusqueda= new JButtonMe();
		this.jButtonid_sucursalMetodoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMetodoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMetodoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMetodoDepreciacionBusqueda.setText("U");
		this.jButtonid_sucursalMetodoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalMetodoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMetodoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMetodoDepreciacionBusqueda"));

		if(this.metododepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalMetodoDepreciacionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalMetodoDepreciacionUpdate= new JButtonMe();
		this.jButtonid_sucursalMetodoDepreciacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMetodoDepreciacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMetodoDepreciacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMetodoDepreciacionUpdate.setText("U");
		this.jButtonid_sucursalMetodoDepreciacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalMetodoDepreciacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMetodoDepreciacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMetodoDepreciacionUpdate"));



					
		this.jLabelid_detalle_activo_fijoMetodoDepreciacion = new JLabelMe();
		this.jLabelid_detalle_activo_fijoMetodoDepreciacion.setText(""+MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO+" : *");
		this.jLabelid_detalle_activo_fijoMetodoDepreciacion.setToolTipText("Detalle Activo Fijo");
		this.jLabelid_detalle_activo_fijoMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_activo_fijoMetodoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_activo_fijoMetodoDepreciacion.setToolTipText(MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		this.gridaBagLayoutMetodoDepreciacion = new GridBagLayout();
		this.jPanelid_detalle_activo_fijoMetodoDepreciacion.setLayout(this.gridaBagLayoutMetodoDepreciacion);


		jComboBoxid_detalle_activo_fijoMetodoDepreciacion= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_activo_fijoMetodoDepreciacion= new JButtonMe();
		this.jButtonid_detalle_activo_fijoMetodoDepreciacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoMetodoDepreciacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoMetodoDepreciacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoMetodoDepreciacion.setText("Buscar");
		this.jButtonid_detalle_activo_fijoMetodoDepreciacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_activo_fijoMetodoDepreciacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoMetodoDepreciacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_activo_fijoMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoMetodoDepreciacion"));

		this.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda= new JButtonMe();
		this.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda.setText("U");
		this.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_activo_fijoMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoMetodoDepreciacionBusqueda"));

		if(this.metododepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda.setVisible(false);		}

		this.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate= new JButtonMe();
		this.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate.setText("U");
		this.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_activo_fijoMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoMetodoDepreciacionUpdate"));



					
		this.jLabelid_anioMetodoDepreciacion = new JLabelMe();
		this.jLabelid_anioMetodoDepreciacion.setText(""+MetodoDepreciacionConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioMetodoDepreciacion.setToolTipText("Anio");
		this.jLabelid_anioMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioMetodoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioMetodoDepreciacion.setToolTipText(MetodoDepreciacionConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutMetodoDepreciacion = new GridBagLayout();
		this.jPanelid_anioMetodoDepreciacion.setLayout(this.gridaBagLayoutMetodoDepreciacion);


		jComboBoxid_anioMetodoDepreciacion= new JComboBoxMe();
		jComboBoxid_anioMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioMetodoDepreciacion= new JButtonMe();
		this.jButtonid_anioMetodoDepreciacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioMetodoDepreciacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioMetodoDepreciacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioMetodoDepreciacion.setText("Buscar");
		this.jButtonid_anioMetodoDepreciacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioMetodoDepreciacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioMetodoDepreciacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioMetodoDepreciacion"));

		this.jButtonid_anioMetodoDepreciacionBusqueda= new JButtonMe();
		this.jButtonid_anioMetodoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioMetodoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioMetodoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioMetodoDepreciacionBusqueda.setText("U");
		this.jButtonid_anioMetodoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioMetodoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioMetodoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioMetodoDepreciacionBusqueda"));

		if(this.metododepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioMetodoDepreciacionBusqueda.setVisible(false);		}

		this.jButtonid_anioMetodoDepreciacionUpdate= new JButtonMe();
		this.jButtonid_anioMetodoDepreciacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioMetodoDepreciacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioMetodoDepreciacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioMetodoDepreciacionUpdate.setText("U");
		this.jButtonid_anioMetodoDepreciacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioMetodoDepreciacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioMetodoDepreciacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioMetodoDepreciacionUpdate"));



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
		//this.jInternalFrameDetalleMetodoDepreciacion = new MetodoDepreciacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Metodo Depreciacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMetodoDepreciacion= new GridBagLayout();
		

		
		String sToolTipMetodoDepreciacion="";
		sToolTipMetodoDepreciacion=MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMetodoDepreciacion+="(ActivosFijos.MetodoDepreciacion)";
		}
		
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipMetodoDepreciacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMetodoDepreciacion = new JButtonMe();
		this.jButtonModificarMetodoDepreciacion = new JButtonMe();
        this.jButtonActualizarMetodoDepreciacion = new JButtonMe();
        this.jButtonEliminarMetodoDepreciacion = new JButtonMe();
        this.jButtonCancelarMetodoDepreciacion = new JButtonMe();
        this.jButtonGuardarCambiosMetodoDepreciacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaMetodoDepreciacion = new JButtonMe();
		this.jButtonCerrarMetodoDepreciacion = new JButtonMe();
		
		this.jScrollPanelDatosMetodoDepreciacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionMetodoDepreciacion = new JScrollPane();
		this.jScrollPanelDatosGeneralMetodoDepreciacion = new JScrollPane();
				
		
		
		this.jPanelCamposMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Metodo Depreciacion";
		
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Metodo Depreciaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosMetodoDepreciacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMetodoDepreciacion.setName("jPanelCamposMetodoDepreciacion"); 

		this.jPanelCamposOcultosMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMetodoDepreciacion.setName("jPanelCamposOcultosMetodoDepreciacion"); 

        this.jPanelAccionesMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMetodoDepreciacion.setToolTipText("Acciones");
        this.jPanelAccionesMetodoDepreciacion.setName("Acciones"); 

		this.jPanelAccionesFormularioMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMetodoDepreciacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMetodoDepreciacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMetodoDepreciacion.setText("Nuevo");
		this.jButtonModificarMetodoDepreciacion.setText("Editar");
        this.jButtonActualizarMetodoDepreciacion.setText("Actualizar");
        this.jButtonEliminarMetodoDepreciacion.setText("Eliminar");
        this.jButtonCancelarMetodoDepreciacion.setText("Cancelar");
        this.jButtonGuardarCambiosMetodoDepreciacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaMetodoDepreciacion.setText("Guardar");
		this.jButtonCerrarMetodoDepreciacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMetodoDepreciacion,"nuevo_button","Nuevo",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMetodoDepreciacion,"modificar_button","Editar",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMetodoDepreciacion,"actualizar_button","Actualizar",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMetodoDepreciacion,"eliminar_button","Eliminar",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMetodoDepreciacion,"cancelar_button","Cancelar",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMetodoDepreciacion,"guardarcambios_button","Guardar",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMetodoDepreciacion,"guardarcambiostabla_button","Guardar",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMetodoDepreciacion,"cerrar_button","Salir",this.metododepreciacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMetodoDepreciacion.setToolTipText("Nuevo"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMetodoDepreciacion.setToolTipText("Editar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMetodoDepreciacion.setToolTipText("Actualizar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMetodoDepreciacion.setToolTipText("Eliminar)"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMetodoDepreciacion.setToolTipText("Cancelar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMetodoDepreciacion.setToolTipText("Guardar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMetodoDepreciacion.setToolTipText("Guardar"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMetodoDepreciacion.setToolTipText("Salir"+" "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMetodoDepreciacion";
		inputMap = this.jButtonNuevoMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMetodoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMetodoDepreciacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMetodoDepreciacion";
		inputMap = this.jButtonActualizarMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMetodoDepreciacion"));
		
		//ELIMINAR
		sMapKey = "EliminarMetodoDepreciacion";
		inputMap = this.jButtonEliminarMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMetodoDepreciacion"));
		
		//CANCELAR	
		sMapKey = "CancelarMetodoDepreciacion";
		inputMap = this.jButtonCancelarMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMetodoDepreciacion"));
		
		//CERRAR		
		sMapKey = "CerrarMetodoDepreciacion";
		inputMap = this.jButtonCerrarMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMetodoDepreciacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMetodoDepreciacion";
		inputMap = this.jButtonGuardarCambiosTablaMetodoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMetodoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMetodoDepreciacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMetodoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMetodoDepreciacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMetodoDepreciacion.setToolTipText("Nuevo MetodoDepreciacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMetodoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMetodoDepreciacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMetodoDepreciacion.setToolTipText("Sin Cerrar Ventana MetodoDepreciacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMetodoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMetodoDepreciacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMetodoDepreciacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMetodoDepreciacion.setText("Accion");
		this.jComboBoxTiposAccionesMetodoDepreciacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMetodoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMetodoDepreciacion = new JLabelMe();
		
		this.jLabelAccionesMetodoDepreciacion.setText("Acciones");		
		this.jLabelAccionesMetodoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMetodoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMetodoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMetodoDepreciacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMetodoDepreciacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMetodoDepreciacion=new JTabbedPane();
		this.jTabbedPaneRelacionesMetodoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMetodoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMetodoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMetodoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMetodoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMetodoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMetodoDepreciacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMetodoDepreciacion = new GridBagLayout();
		
		this.jPanelCamposMetodoDepreciacion.setLayout(gridaBagLayoutCamposMetodoDepreciacion);
		this.jPanelCamposOcultosMetodoDepreciacion.setLayout(gridaBagLayoutCamposOcultosMetodoDepreciacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMetodoDepreciacion.add(jLabelIdMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 1;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMetodoDepreciacion.add(jLabelidMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMetodoDepreciacion.add(jLabelid_empresaMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 2;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMetodoDepreciacion.add(jButtonid_empresaMetodoDepreciacionBusqueda, this.gridBagConstraintsMetodoDepreciacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 3;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMetodoDepreciacion.add(jButtonid_empresaMetodoDepreciacionUpdate, this.gridBagConstraintsMetodoDepreciacion);
	}

	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 1;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMetodoDepreciacion.add(jComboBoxid_empresaMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalMetodoDepreciacion.add(jLabelid_sucursalMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 2;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMetodoDepreciacion.add(jButtonid_sucursalMetodoDepreciacionBusqueda, this.gridBagConstraintsMetodoDepreciacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 3;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMetodoDepreciacion.add(jButtonid_sucursalMetodoDepreciacionUpdate, this.gridBagConstraintsMetodoDepreciacion);
	}

	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 1;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalMetodoDepreciacion.add(jComboBoxid_sucursalMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_activo_fijoMetodoDepreciacion.add(jLabelid_detalle_activo_fijoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 2;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoMetodoDepreciacion.add(jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda, this.gridBagConstraintsMetodoDepreciacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 3;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoMetodoDepreciacion.add(jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate, this.gridBagConstraintsMetodoDepreciacion);
	}

	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 1;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_activo_fijoMetodoDepreciacion.add(jComboBoxid_detalle_activo_fijoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioMetodoDepreciacion.add(jLabelid_anioMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 2;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioMetodoDepreciacion.add(jButtonid_anioMetodoDepreciacionBusqueda, this.gridBagConstraintsMetodoDepreciacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 3;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioMetodoDepreciacion.add(jButtonid_anioMetodoDepreciacionUpdate, this.gridBagConstraintsMetodoDepreciacion);
	}

	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 1;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioMetodoDepreciacion.add(jComboBoxid_anioMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeMetodoDepreciacion.add(jLabelfecha_desdeMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 2;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeMetodoDepreciacion.add(jButtonfecha_desdeMetodoDepreciacionBusqueda, this.gridBagConstraintsMetodoDepreciacion);
	}

	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 1;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeMetodoDepreciacion.add(jDateChooserfecha_desdeMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaMetodoDepreciacion.add(jLabelfecha_hastaMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 2;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaMetodoDepreciacion.add(jButtonfecha_hastaMetodoDepreciacionBusqueda, this.gridBagConstraintsMetodoDepreciacion);
	}

	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 1;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaMetodoDepreciacion.add(jDateChooserfecha_hastaMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeMetodoDepreciacion.add(jLabelporcentajeMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 2;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeMetodoDepreciacion.add(jButtonporcentajeMetodoDepreciacionBusqueda, this.gridBagConstraintsMetodoDepreciacion);
	}

	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 1;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeMetodoDepreciacion.add(jTextFieldporcentajeMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorMetodoDepreciacion.add(jLabelvalorMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 2;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorMetodoDepreciacion.add(jButtonvalorMetodoDepreciacionBusqueda, this.gridBagConstraintsMetodoDepreciacion);
	}

	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 1;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorMetodoDepreciacion.add(jTextFieldvalorMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasMetodoDepreciacion.add(jLabelnumero_diasMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = 2;
		this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
		this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasMetodoDepreciacion.add(jButtonnumero_diasMetodoDepreciacionBusqueda, this.gridBagConstraintsMetodoDepreciacion);
	}

	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
	this.gridBagConstraintsMetodoDepreciacion.gridx = 1;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasMetodoDepreciacion.add(jTextFieldnumero_diasMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMetodoDepreciacion.gridy = iYPanelCamposMetodoDepreciacion;
	this.gridBagConstraintsMetodoDepreciacion.gridx = iXPanelCamposMetodoDepreciacion++;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMetodoDepreciacion.add(this.jPanelidMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(iXPanelCamposMetodoDepreciacion % 1==0) {
		iXPanelCamposMetodoDepreciacion=0;
		iYPanelCamposMetodoDepreciacion++;
	}
	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMetodoDepreciacion.gridy = iYPanelCamposMetodoDepreciacion;
	this.gridBagConstraintsMetodoDepreciacion.gridx = iXPanelCamposMetodoDepreciacion++;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMetodoDepreciacion.add(this.jPanelid_detalle_activo_fijoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(iXPanelCamposMetodoDepreciacion % 1==0) {
		iXPanelCamposMetodoDepreciacion=0;
		iYPanelCamposMetodoDepreciacion++;
	}
	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMetodoDepreciacion.gridy = iYPanelCamposMetodoDepreciacion;
	this.gridBagConstraintsMetodoDepreciacion.gridx = iXPanelCamposMetodoDepreciacion++;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMetodoDepreciacion.add(this.jPanelid_anioMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(iXPanelCamposMetodoDepreciacion % 1==0) {
		iXPanelCamposMetodoDepreciacion=0;
		iYPanelCamposMetodoDepreciacion++;
	}
	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMetodoDepreciacion.gridy = iYPanelCamposMetodoDepreciacion;
	this.gridBagConstraintsMetodoDepreciacion.gridx = iXPanelCamposMetodoDepreciacion++;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMetodoDepreciacion.add(this.jPanelfecha_desdeMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(iXPanelCamposMetodoDepreciacion % 1==0) {
		iXPanelCamposMetodoDepreciacion=0;
		iYPanelCamposMetodoDepreciacion++;
	}
	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMetodoDepreciacion.gridy = iYPanelCamposMetodoDepreciacion;
	this.gridBagConstraintsMetodoDepreciacion.gridx = iXPanelCamposMetodoDepreciacion++;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMetodoDepreciacion.add(this.jPanelfecha_hastaMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(iXPanelCamposMetodoDepreciacion % 1==0) {
		iXPanelCamposMetodoDepreciacion=0;
		iYPanelCamposMetodoDepreciacion++;
	}
	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMetodoDepreciacion.gridy = iYPanelCamposMetodoDepreciacion;
	this.gridBagConstraintsMetodoDepreciacion.gridx = iXPanelCamposMetodoDepreciacion++;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMetodoDepreciacion.add(this.jPanelporcentajeMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(iXPanelCamposMetodoDepreciacion % 1==0) {
		iXPanelCamposMetodoDepreciacion=0;
		iYPanelCamposMetodoDepreciacion++;
	}
	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMetodoDepreciacion.gridy = iYPanelCamposMetodoDepreciacion;
	this.gridBagConstraintsMetodoDepreciacion.gridx = iXPanelCamposMetodoDepreciacion++;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMetodoDepreciacion.add(this.jPanelvalorMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(iXPanelCamposMetodoDepreciacion % 1==0) {
		iXPanelCamposMetodoDepreciacion=0;
		iYPanelCamposMetodoDepreciacion++;
	}
	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMetodoDepreciacion.gridy = iYPanelCamposMetodoDepreciacion;
	this.gridBagConstraintsMetodoDepreciacion.gridx = iXPanelCamposMetodoDepreciacion++;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMetodoDepreciacion.add(this.jPanelnumero_diasMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(iXPanelCamposMetodoDepreciacion % 1==0) {
		iXPanelCamposMetodoDepreciacion=0;
		iYPanelCamposMetodoDepreciacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMetodoDepreciacion.gridy = iYPanelCamposOcultosMetodoDepreciacion;
	this.gridBagConstraintsMetodoDepreciacion.gridx = iXPanelCamposOcultosMetodoDepreciacion++;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMetodoDepreciacion.add(this.jPanelid_empresaMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(iXPanelCamposOcultosMetodoDepreciacion % 1==0) {
		iXPanelCamposOcultosMetodoDepreciacion=0;
		iYPanelCamposOcultosMetodoDepreciacion++;
	}
	this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMetodoDepreciacion.gridy = iYPanelCamposOcultosMetodoDepreciacion;
	this.gridBagConstraintsMetodoDepreciacion.gridx = iXPanelCamposOcultosMetodoDepreciacion++;
	this.gridBagConstraintsMetodoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMetodoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMetodoDepreciacion.add(this.jPanelid_sucursalMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);



	if(iXPanelCamposOcultosMetodoDepreciacion % 1==0) {
		iXPanelCamposOcultosMetodoDepreciacion=0;
		iYPanelCamposOcultosMetodoDepreciacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesMetodoDepreciacion= new GridBagLayout();
		this.jPanelAccionesMetodoDepreciacion.setLayout(gridaBagLayoutAccionesMetodoDepreciacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMetodoDepreciacion= new GridBagLayout();
		this.jPanelAccionesFormularioMetodoDepreciacion.setLayout(gridaBagLayoutAccionesFormularioMetodoDepreciacion);
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMetodoDepreciacion.add(this.jComboBoxTiposAccionesFormularioMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMetodoDepreciacion.add(this.jCheckBoxPostAccionNuevoMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMetodoDepreciacion.add(this.jCheckBoxPostAccionSinCerrarMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMetodoDepreciacion.add(this.jCheckBoxPostAccionSinMensajeMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesMetodoDepreciacion.add(this.jButtonModificarMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);							

		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;
		this.gridBagConstraintsMetodoDepreciacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesMetodoDepreciacion.add(this.jButtonEliminarMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
			
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesMetodoDepreciacion.add(this.jButtonActualizarMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);


		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesMetodoDepreciacion.add(this.jButtonGuardarCambiosMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);	
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = 0;		
		this.gridBagConstraintsMetodoDepreciacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesMetodoDepreciacion.add(this.jButtonCancelarMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMetodoDepreciacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMetodoDepreciacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();						
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMetodoDepreciacion.gridx = 0;		
			//this.gridBagConstraintsMetodoDepreciacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMetodoDepreciacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMetodoDepreciacion.gridx =0;
		this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMetodoDepreciacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MetodoDepreciacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMetodoDepreciacion = new MetodoDepreciacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Metodo Depreciacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Metodo Depreciacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Metodo Depreciacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MetodoDepreciacionModel metododepreciacionModel=new MetodoDepreciacionModel(this);
			
			//SI USARA CLASE INTERNA
			//MetodoDepreciacionModel.MetodoDepreciacionFocusTraversalPolicy metododepreciacionFocusTraversalPolicy = metododepreciacionModel.new MetodoDepreciacionFocusTraversalPolicy(this);
			
			//metododepreciacionFocusTraversalPolicy.setmetododepreciacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(metododepreciacionModel);
			
			
			this.jContentPaneDetalleMetodoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMetodoDepreciacion = new GridBagLayout();	
			this.jContentPaneDetalleMetodoDepreciacion.setLayout(gridaBagLayoutDetalleMetodoDepreciacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMetodoDepreciacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
				this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
					
				
				this.jContentPaneDetalleMetodoDepreciacion.add(jTtoolBarDetalleMetodoDepreciacion, gridBagConstraintsMetodoDepreciacion);								
				
}
			
			this.jScrollPanelDatosEdicionMetodoDepreciacion=   new JScrollPane(jContentPaneDetalleMetodoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMetodoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMetodoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMetodoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMetodoDepreciacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMetodoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMetodoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMetodoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	        
			this.jContentPaneDetalleMetodoDepreciacion.add(jPanelCamposMetodoDepreciacion, gridBagConstraintsMetodoDepreciacion);
			
			
			
			
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
						&& metododepreciacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.metododepreciacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMetodoDepreciacion= new GridBagConstraints();
						this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
						this.jContentPaneDetalleMetodoDepreciacion.add(this.jTabbedPaneRelacionesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMetodoDepreciacion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMetodoDepreciacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
					this.gridBagConstraintsMetodoDepreciacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
					
				
					this.jContentPaneDetalleMetodoDepreciacion.add(jPanelCamposOcultosMetodoDepreciacion, gridBagConstraintsMetodoDepreciacion);
				
					this.jPanelCamposOcultosMetodoDepreciacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	        this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMetodoDepreciacion.add(this.jPanelAccionesFormularioMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);							
			
			
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
	        this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
	        
			
			this.jContentPaneDetalleMetodoDepreciacion.add(this.jPanelAccionesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMetodoDepreciacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMetodoDepreciacion=   new JScrollPane(this.jPanelCamposMetodoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMetodoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMetodoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMetodoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
			this.gridBagConstraintsMetodoDepreciacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMetodoDepreciacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMetodoDepreciacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);			
			
			this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsMetodoDepreciacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
			
			
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMetodoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		
			
		this.gridBagConstraintsMetodoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsMetodoDepreciacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMetodoDepreciacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMetodoDepreciacion, this.gridBagConstraintsMetodoDepreciacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMetodoDepreciacion;//jContentPane;
		
		return jScrollPanelDatosEdicionMetodoDepreciacion;
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
