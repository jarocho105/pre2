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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.ListadoActivosFijosConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class ListadoActivosFijosDetalleFormJInternalFrame extends ListadoActivosFijosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleListadoActivosFijos;
	
	protected JMenuBar jmenuBarDetalleListadoActivosFijos;
	
	protected JMenu jmenuDetalleListadoActivosFijos;
	protected JMenu jmenuDetalleArchivoListadoActivosFijos;
	protected JMenu jmenuDetalleAccionesListadoActivosFijos;
	protected JMenu jmenuDetalleDatosListadoActivosFijos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadoActivosFijos;	
	protected GridBagConstraints gridBagConstraintsListadoActivosFijos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ListadoActivosFijosBeanSwingJInternalFrameAdditional jInternalFrameDetalleListadoActivosFijos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadoActivosFijosSessionBean listadoactivosfijosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ListadoActivosFijosLogic listadoactivosfijosLogic;
	
	public JScrollPane jScrollPanelDatosListadoActivosFijos;
	public JScrollPane jScrollPanelDatosEdicionListadoActivosFijos;
	public JScrollPane jScrollPanelDatosGeneralListadoActivosFijos;
	
	protected JPanel jPanelCamposListadoActivosFijos;    
	protected JPanel jPanelCamposOcultosListadoActivosFijos;    	
	protected JPanel jPanelAccionesListadoActivosFijos;
	protected JPanel jPanelAccionesFormularioListadoActivosFijos;
    
	
	
	protected Integer iXPanelCamposListadoActivosFijos=0;
	protected Integer iYPanelCamposListadoActivosFijos=0;
	
	protected Integer iXPanelCamposOcultosListadoActivosFijos=0;
	protected Integer iYPanelCamposOcultosListadoActivosFijos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoListadoActivosFijos;
	public JButton jButtonModificarListadoActivosFijos;
	public JButton jButtonActualizarListadoActivosFijos;
    public JButton jButtonEliminarListadoActivosFijos;
	public JButton jButtonCancelarListadoActivosFijos;
    public JButton jButtonGuardarCambiosListadoActivosFijos;
	public JButton jButtonGuardarCambiosTablaListadoActivosFijos;
	protected JButton jButtonCerrarListadoActivosFijos;
	
	
	protected JButton jButtonProcesarInformacionListadoActivosFijos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoListadoActivosFijos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarListadoActivosFijos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeListadoActivosFijos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadoActivosFijos;
	protected JButton jButtonModificarToolBarListadoActivosFijos;
	protected JButton jButtonActualizarToolBarListadoActivosFijos;
    protected JButton jButtonEliminarToolBarListadoActivosFijos;
	protected JButton jButtonCancelarToolBarListadoActivosFijos;
    protected JButton jButtonGuardarCambiosToolBarListadoActivosFijos;
	protected JButton jButtonGuardarCambiosTablaToolBarListadoActivosFijos;
	protected JButton jButtonMostrarOcultarTablaToolBarListadoActivosFijos;
	protected JButton jButtonCerrarToolBarListadoActivosFijos;
	
	protected JButton jButtonProcesarInformacionToolBarListadoActivosFijos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadoActivosFijos;
	protected JMenuItem jMenuItemModificarListadoActivosFijos;
	protected JMenuItem jMenuItemActualizarListadoActivosFijos;
    protected JMenuItem jMenuItemEliminarListadoActivosFijos;
	protected JMenuItem jMenuItemCancelarListadoActivosFijos;
    protected JMenuItem jMenuItemGuardarCambiosListadoActivosFijos;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadoActivosFijos;
	protected JMenuItem jMenuItemCerrarListadoActivosFijos;
	protected JMenuItem jMenuItemDetalleCerrarListadoActivosFijos;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadoActivosFijos;
	
	protected JMenuItem jMenuItemProcesarInformacionListadoActivosFijos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadoActivosFijos;
	protected JMenuItem jMenuItemMostrarOcultarListadoActivosFijos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadoActivosFijos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadoActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadoActivosFijos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioListadoActivosFijos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidListadoActivosFijos;
	public JLabel jLabelIdListadoActivosFijos;
	public JLabel jLabelidListadoActivosFijos;
	public JButton jButtonidListadoActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sub_grupoListadoActivosFijos;
	public JLabel jLabelcodigo_sub_grupoListadoActivosFijos;
	public JTextField jTextFieldcodigo_sub_grupoListadoActivosFijos;
	public JButton jButtoncodigo_sub_grupoListadoActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sub_grupoListadoActivosFijos;
	public JLabel jLabelnombre_sub_grupoListadoActivosFijos;
	public JTextArea jTextAreanombre_sub_grupoListadoActivosFijos;
	public JScrollPane jscrollPanenombre_sub_grupoListadoActivosFijos;
	public JButton jButtonnombre_sub_grupoListadoActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_detalle_grupoListadoActivosFijos;
	public JLabel jLabelcodigo_detalle_grupoListadoActivosFijos;
	public JTextField jTextFieldcodigo_detalle_grupoListadoActivosFijos;
	public JButton jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_detalle_grupoListadoActivosFijos;
	public JLabel jLabelnombre_detalle_grupoListadoActivosFijos;
	public JTextArea jTextAreanombre_detalle_grupoListadoActivosFijos;
	public JScrollPane jscrollPanenombre_detalle_grupoListadoActivosFijos;
	public JButton jButtonnombre_detalle_grupoListadoActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelclaveListadoActivosFijos;
	public JLabel jLabelclaveListadoActivosFijos;
	public JTextField jTextFieldclaveListadoActivosFijos;
	public JButton jButtonclaveListadoActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelnombreListadoActivosFijos;
	public JLabel jLabelnombreListadoActivosFijos;
	public JTextArea jTextAreanombreListadoActivosFijos;
	public JScrollPane jscrollPanenombreListadoActivosFijos;
	public JButton jButtonnombreListadoActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_compraListadoActivosFijos;
	public JLabel jLabelfecha_compraListadoActivosFijos;
	//public JFormattedTextField jDateChooserfecha_compraListadoActivosFijos;

	public JDateChooser jDateChooserfecha_compraListadoActivosFijos;
	public JButton jButtonfecha_compraListadoActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelvida_utilListadoActivosFijos;
	public JLabel jLabelvida_utilListadoActivosFijos;
	public JTextField jTextFieldvida_utilListadoActivosFijos;
	public JButton jButtonvida_utilListadoActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelcosto_de_compraListadoActivosFijos;
	public JLabel jLabelcosto_de_compraListadoActivosFijos;
	public JTextField jTextFieldcosto_de_compraListadoActivosFijos;
	public JButton jButtoncosto_de_compraListadoActivosFijosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaListadoActivosFijos;
	public JLabel jLabelid_empresaListadoActivosFijos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaListadoActivosFijos;
	public JButton jButtonid_empresaListadoActivosFijos= new JButtonMe();
	public JButton jButtonid_empresaListadoActivosFijosUpdate= new JButtonMe();
	public JButton jButtonid_empresaListadoActivosFijosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesListadoActivosFijos;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=1078;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ListadoActivosFijosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposListadoActivosFijos=new JPanel();
				this.jPanelAccionesFormularioListadoActivosFijos=new JPanel();
				this.jmenuBarDetalleListadoActivosFijos=new JMenuBar();
				this.jTtoolBarDetalleListadoActivosFijos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoActivosFijosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ListadoActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ListadoActivosFijosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ListadoActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoActivosFijosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoActivosFijosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoActivosFijosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadoActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarListadoActivosFijos() {
		return this.jButtonActualizarToolBarListadoActivosFijos;
	}
	
	public JButton getjButtonEliminarToolBarListadoActivosFijos() {
		return this.jButtonEliminarToolBarListadoActivosFijos;
	}
	
	public JButton getjButtonCancelarToolBarListadoActivosFijos() {
		return this.jButtonCancelarToolBarListadoActivosFijos;
	}		
	
	public JButton getjButtonProcesarInformacionListadoActivosFijos() {
		return this.jButtonProcesarInformacionListadoActivosFijos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadoActivosFijos)	{
		this.jButtonProcesarInformacionListadoActivosFijos = jButtonProcesarInformacionListadoActivosFijos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadoActivosFijos() {
		return this.jComboBoxTiposAccionesListadoActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadoActivosFijos(
			JComboBox jComboBoxTiposRelacionesListadoActivosFijos) {
		this.jComboBoxTiposRelacionesListadoActivosFijos = jComboBoxTiposRelacionesListadoActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadoActivosFijos(
			JComboBox jComboBoxTiposAccionesListadoActivosFijos) {
		this.jComboBoxTiposAccionesListadoActivosFijos = jComboBoxTiposAccionesListadoActivosFijos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioListadoActivosFijos() {
		return this.jComboBoxTiposAccionesFormularioListadoActivosFijos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioListadoActivosFijos(
			JComboBox jComboBoxTiposAccionesFormularioListadoActivosFijos) {
		this.jComboBoxTiposAccionesFormularioListadoActivosFijos = jComboBoxTiposAccionesFormularioListadoActivosFijos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.listadoactivosfijosSessionBean=new ListadoActivosFijosSessionBean();
		
		this.listadoactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadoactivosfijosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadoActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadoActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadoActivosFijosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listado Activos Fijos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
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
	
		ListadoActivosFijosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleListadoActivosFijos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarListadoActivosFijos=new JButtonMe();
				this.jButtonModificarToolBarListadoActivosFijos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarListadoActivosFijos,this.jTtoolBarDetalleListadoActivosFijos,
							"actualizar","actualizar","Actualizar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarListadoActivosFijos,this.jTtoolBarDetalleListadoActivosFijos,
							"eliminar","eliminar","Eliminar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarListadoActivosFijos,this.jTtoolBarDetalleListadoActivosFijos,
							"cancelar","cancelar","Cancelar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarListadoActivosFijos,this.jTtoolBarDetalleListadoActivosFijos,
							"guardarcambios","guardarcambios","Guardar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleListadoActivosFijos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleListadoActivosFijos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoListadoActivosFijos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesListadoActivosFijos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosListadoActivosFijos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadoActivosFijos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadoActivosFijos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadoActivosFijos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarListadoActivosFijos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarListadoActivosFijos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarListadoActivosFijos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarListadoActivosFijos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarListadoActivosFijos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarListadoActivosFijos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarListadoActivosFijos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarListadoActivosFijos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarListadoActivosFijos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarListadoActivosFijos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarListadoActivosFijos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarListadoActivosFijos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosListadoActivosFijos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadoActivosFijos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadoActivosFijos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadoActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadoActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadoActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarListadoActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarListadoActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarListadoActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadoActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadoActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadoActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadoActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadoActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadoActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoListadoActivosFijos.add(this.jMenuItemDetalleCerrarListadoActivosFijos);
		
		this.jmenuDetalleAccionesListadoActivosFijos.add(this.jMenuItemActualizarListadoActivosFijos);
		this.jmenuDetalleAccionesListadoActivosFijos.add(this.jMenuItemEliminarListadoActivosFijos);
		this.jmenuDetalleAccionesListadoActivosFijos.add(this.jMenuItemCancelarListadoActivosFijos);		
		
		//this.jmenuDetalleDatosListadoActivosFijos.add(this.jMenuItemDetalleAbrirOrderByListadoActivosFijos);				
		this.jmenuDetalleDatosListadoActivosFijos.add(this.jMenuItemDetalleMostarOcultarListadoActivosFijos);				
				
		//this.jmenuDetalleAccionesListadoActivosFijos.add(this.jMenuItemGuardarCambiosListadoActivosFijos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleListadoActivosFijos.add(this.jmenuDetalleArchivoListadoActivosFijos);		
		this.jmenuBarDetalleListadoActivosFijos.add(this.jmenuDetalleAccionesListadoActivosFijos);		
		this.jmenuBarDetalleListadoActivosFijos.add(this.jmenuDetalleDatosListadoActivosFijos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleListadoActivosFijos);				
	}
	
	
	public void inicializarElementosCamposListadoActivosFijos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdListadoActivosFijos = new JLabelMe();
		jLabelIdListadoActivosFijos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidListadoActivosFijos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidListadoActivosFijos.setToolTipText(ListadoActivosFijosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutListadoActivosFijos= new GridBagLayout();

		this.jPanelidListadoActivosFijos.setLayout(this.gridaBagLayoutListadoActivosFijos);

		jLabelidListadoActivosFijos = new JLabel();
		jLabelidListadoActivosFijos.setText("Id");

		jLabelidListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigo_sub_grupoListadoActivosFijos = new JLabelMe();
		this.jLabelcodigo_sub_grupoListadoActivosFijos.setText(""+ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO+" : *");
		this.jLabelcodigo_sub_grupoListadoActivosFijos.setToolTipText("Codigo Sub Grupo");
		this.jLabelcodigo_sub_grupoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sub_grupoListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sub_grupoListadoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sub_grupoListadoActivosFijos.setToolTipText(ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		this.gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		this.jPanelcodigo_sub_grupoListadoActivosFijos.setLayout(this.gridaBagLayoutListadoActivosFijos);


		jTextFieldcodigo_sub_grupoListadoActivosFijos= new JTextFieldMe();

		jTextFieldcodigo_sub_grupoListadoActivosFijos.setEnabled(false);
		jTextFieldcodigo_sub_grupoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sub_grupoListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda= new JButtonMe();
		this.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda.setText("U");
		this.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sub_grupoListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sub_grupoListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sub_grupoListadoActivosFijosBusqueda"));

		if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sub_grupoListadoActivosFijos = new JLabelMe();
		this.jLabelnombre_sub_grupoListadoActivosFijos.setText(""+ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO+" : *");
		this.jLabelnombre_sub_grupoListadoActivosFijos.setToolTipText("Nombre Sub Grupo");
		this.jLabelnombre_sub_grupoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sub_grupoListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sub_grupoListadoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sub_grupoListadoActivosFijos.setToolTipText(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		this.gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		this.jPanelnombre_sub_grupoListadoActivosFijos.setLayout(this.gridaBagLayoutListadoActivosFijos);


		jTextAreanombre_sub_grupoListadoActivosFijos= new JTextAreaMe();
		jTextAreanombre_sub_grupoListadoActivosFijos.setEnabled(false);
		jTextAreanombre_sub_grupoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoListadoActivosFijos.setLineWrap(true);
		jTextAreanombre_sub_grupoListadoActivosFijos.setWrapStyleWord(true);
		jTextAreanombre_sub_grupoListadoActivosFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sub_grupoListadoActivosFijos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sub_grupoListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sub_grupoListadoActivosFijos = new JScrollPane(jTextAreanombre_sub_grupoListadoActivosFijos);
		jscrollPanenombre_sub_grupoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sub_grupoListadoActivosFijosBusqueda= new JButtonMe();
		this.jButtonnombre_sub_grupoListadoActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoListadoActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoListadoActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sub_grupoListadoActivosFijosBusqueda.setText("U");
		this.jButtonnombre_sub_grupoListadoActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sub_grupoListadoActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sub_grupoListadoActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sub_grupoListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sub_grupoListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sub_grupoListadoActivosFijosBusqueda"));

		if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sub_grupoListadoActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_detalle_grupoListadoActivosFijos = new JLabelMe();
		this.jLabelcodigo_detalle_grupoListadoActivosFijos.setText(""+ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO+" : *");
		this.jLabelcodigo_detalle_grupoListadoActivosFijos.setToolTipText("Codigo Detalle Grupo");
		this.jLabelcodigo_detalle_grupoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_detalle_grupoListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_detalle_grupoListadoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_detalle_grupoListadoActivosFijos.setToolTipText(ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		this.gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		this.jPanelcodigo_detalle_grupoListadoActivosFijos.setLayout(this.gridaBagLayoutListadoActivosFijos);


		jTextFieldcodigo_detalle_grupoListadoActivosFijos= new JTextFieldMe();

		jTextFieldcodigo_detalle_grupoListadoActivosFijos.setEnabled(false);
		jTextFieldcodigo_detalle_grupoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_detalle_grupoListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda= new JButtonMe();
		this.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda.setText("U");
		this.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_detalle_grupoListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_detalle_grupoListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_detalle_grupoListadoActivosFijosBusqueda"));

		if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_detalle_grupoListadoActivosFijos = new JLabelMe();
		this.jLabelnombre_detalle_grupoListadoActivosFijos.setText(""+ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+" : *");
		this.jLabelnombre_detalle_grupoListadoActivosFijos.setToolTipText("Nombre Detalle Grupo");
		this.jLabelnombre_detalle_grupoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_detalle_grupoListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_detalle_grupoListadoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_detalle_grupoListadoActivosFijos.setToolTipText(ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		this.gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		this.jPanelnombre_detalle_grupoListadoActivosFijos.setLayout(this.gridaBagLayoutListadoActivosFijos);


		jTextAreanombre_detalle_grupoListadoActivosFijos= new JTextAreaMe();
		jTextAreanombre_detalle_grupoListadoActivosFijos.setEnabled(false);
		jTextAreanombre_detalle_grupoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoListadoActivosFijos.setLineWrap(true);
		jTextAreanombre_detalle_grupoListadoActivosFijos.setWrapStyleWord(true);
		jTextAreanombre_detalle_grupoListadoActivosFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_detalle_grupoListadoActivosFijos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_detalle_grupoListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_detalle_grupoListadoActivosFijos = new JScrollPane(jTextAreanombre_detalle_grupoListadoActivosFijos);
		jscrollPanenombre_detalle_grupoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda= new JButtonMe();
		this.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda.setText("U");
		this.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_detalle_grupoListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_detalle_grupoListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_detalle_grupoListadoActivosFijosBusqueda"));

		if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelclaveListadoActivosFijos = new JLabelMe();
		this.jLabelclaveListadoActivosFijos.setText(""+ListadoActivosFijosConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveListadoActivosFijos.setToolTipText("Clave");
		this.jLabelclaveListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveListadoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveListadoActivosFijos.setToolTipText(ListadoActivosFijosConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		this.jPanelclaveListadoActivosFijos.setLayout(this.gridaBagLayoutListadoActivosFijos);


		jTextFieldclaveListadoActivosFijos= new JTextFieldMe();

		jTextFieldclaveListadoActivosFijos.setEnabled(false);
		jTextFieldclaveListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldclaveListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonclaveListadoActivosFijosBusqueda= new JButtonMe();
		this.jButtonclaveListadoActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveListadoActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveListadoActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveListadoActivosFijosBusqueda.setText("U");
		this.jButtonclaveListadoActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveListadoActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveListadoActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldclaveListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldclaveListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveListadoActivosFijosBusqueda"));

		if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveListadoActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelnombreListadoActivosFijos = new JLabelMe();
		this.jLabelnombreListadoActivosFijos.setText(""+ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreListadoActivosFijos.setToolTipText("Nombre");
		this.jLabelnombreListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreListadoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreListadoActivosFijos.setToolTipText(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		this.jPanelnombreListadoActivosFijos.setLayout(this.gridaBagLayoutListadoActivosFijos);


		jTextAreanombreListadoActivosFijos= new JTextAreaMe();
		jTextAreanombreListadoActivosFijos.setEnabled(false);
		jTextAreanombreListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadoActivosFijos.setLineWrap(true);
		jTextAreanombreListadoActivosFijos.setWrapStyleWord(true);
		jTextAreanombreListadoActivosFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreListadoActivosFijos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreListadoActivosFijos = new JScrollPane(jTextAreanombreListadoActivosFijos);
		jscrollPanenombreListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreListadoActivosFijosBusqueda= new JButtonMe();
		this.jButtonnombreListadoActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreListadoActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreListadoActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreListadoActivosFijosBusqueda.setText("U");
		this.jButtonnombreListadoActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreListadoActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreListadoActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreListadoActivosFijosBusqueda"));

		if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreListadoActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_compraListadoActivosFijos = new JLabelMe();
		this.jLabelfecha_compraListadoActivosFijos.setText(""+ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA+" : *");
		this.jLabelfecha_compraListadoActivosFijos.setToolTipText("Fecha Compra");
		this.jLabelfecha_compraListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_compraListadoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_compraListadoActivosFijos.setToolTipText(ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
		this.gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		this.jPanelfecha_compraListadoActivosFijos.setLayout(this.gridaBagLayoutListadoActivosFijos);


		//jFormattedTextFieldfecha_compraListadoActivosFijos= new JFormattedTextFieldMe();

		jDateChooserfecha_compraListadoActivosFijos= new JDateChooser();
		jDateChooserfecha_compraListadoActivosFijos.setEnabled(false);
		jDateChooserfecha_compraListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_compraListadoActivosFijos.setDate(new Date());
		jDateChooserfecha_compraListadoActivosFijos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_compraListadoActivosFijos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_compraListadoActivosFijosBusqueda= new JButtonMe();
		this.jButtonfecha_compraListadoActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraListadoActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraListadoActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_compraListadoActivosFijosBusqueda.setText("U");
		this.jButtonfecha_compraListadoActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_compraListadoActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_compraListadoActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_compraListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_compraListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_compraListadoActivosFijosBusqueda"));

		if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_compraListadoActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelvida_utilListadoActivosFijos = new JLabelMe();
		this.jLabelvida_utilListadoActivosFijos.setText(""+ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL+" : *");
		this.jLabelvida_utilListadoActivosFijos.setToolTipText("Va Util");
		this.jLabelvida_utilListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvida_utilListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvida_utilListadoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvida_utilListadoActivosFijos.setToolTipText(ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
		this.gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		this.jPanelvida_utilListadoActivosFijos.setLayout(this.gridaBagLayoutListadoActivosFijos);


		jTextFieldvida_utilListadoActivosFijos= new JTextFieldMe();
		jTextFieldvida_utilListadoActivosFijos.setEnabled(false);
		jTextFieldvida_utilListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvida_utilListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvida_utilListadoActivosFijos.setText("0.0");

		this.jButtonvida_utilListadoActivosFijosBusqueda= new JButtonMe();
		this.jButtonvida_utilListadoActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilListadoActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilListadoActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvida_utilListadoActivosFijosBusqueda.setText("U");
		this.jButtonvida_utilListadoActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvida_utilListadoActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvida_utilListadoActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvida_utilListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvida_utilListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"vida_utilListadoActivosFijosBusqueda"));

		if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvida_utilListadoActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelcosto_de_compraListadoActivosFijos = new JLabelMe();
		this.jLabelcosto_de_compraListadoActivosFijos.setText(""+ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA+" : *");
		this.jLabelcosto_de_compraListadoActivosFijos.setToolTipText("Costo Compra");
		this.jLabelcosto_de_compraListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_de_compraListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_de_compraListadoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_de_compraListadoActivosFijos.setToolTipText(ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
		this.gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		this.jPanelcosto_de_compraListadoActivosFijos.setLayout(this.gridaBagLayoutListadoActivosFijos);


		jTextFieldcosto_de_compraListadoActivosFijos= new JTextFieldMe();
		jTextFieldcosto_de_compraListadoActivosFijos.setEnabled(false);
		jTextFieldcosto_de_compraListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_de_compraListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_de_compraListadoActivosFijos.setText("0.0");

		this.jButtoncosto_de_compraListadoActivosFijosBusqueda= new JButtonMe();
		this.jButtoncosto_de_compraListadoActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraListadoActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraListadoActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_de_compraListadoActivosFijosBusqueda.setText("U");
		this.jButtoncosto_de_compraListadoActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_de_compraListadoActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_de_compraListadoActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_de_compraListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_de_compraListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_de_compraListadoActivosFijosBusqueda"));

		if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_de_compraListadoActivosFijosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysListadoActivosFijos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaListadoActivosFijos = new JLabelMe();
		this.jLabelid_empresaListadoActivosFijos.setText(""+ListadoActivosFijosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaListadoActivosFijos.setToolTipText("Empresa");
		this.jLabelid_empresaListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaListadoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaListadoActivosFijos.setToolTipText(ListadoActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		this.jPanelid_empresaListadoActivosFijos.setLayout(this.gridaBagLayoutListadoActivosFijos);


		jComboBoxid_empresaListadoActivosFijos= new JComboBoxMe();
		jComboBoxid_empresaListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaListadoActivosFijos.setEnabled(false);

		this.jButtonid_empresaListadoActivosFijos= new JButtonMe();
		this.jButtonid_empresaListadoActivosFijos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadoActivosFijos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadoActivosFijos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadoActivosFijos.setText("Buscar");
		this.jButtonid_empresaListadoActivosFijos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaListadoActivosFijos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadoActivosFijos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadoActivosFijos"));

		this.jButtonid_empresaListadoActivosFijosBusqueda= new JButtonMe();
		this.jButtonid_empresaListadoActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadoActivosFijosBusqueda.setText("U");
		this.jButtonid_empresaListadoActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaListadoActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadoActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadoActivosFijosBusqueda"));

		if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaListadoActivosFijosBusqueda.setVisible(false);		}

		this.jButtonid_empresaListadoActivosFijosUpdate= new JButtonMe();
		this.jButtonid_empresaListadoActivosFijosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoActivosFijosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoActivosFijosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadoActivosFijosUpdate.setText("U");
		this.jButtonid_empresaListadoActivosFijosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaListadoActivosFijosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadoActivosFijosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadoActivosFijosUpdate"));



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
		//this.jInternalFrameDetalleListadoActivosFijos = new ListadoActivosFijosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Listado Activos Fijos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadoActivosFijos= new GridBagLayout();
		

		
		String sToolTipListadoActivosFijos="";
		sToolTipListadoActivosFijos=ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadoActivosFijos+="(ActivosFijos.ListadoActivosFijos)";
		}
		
		if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadoActivosFijos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoListadoActivosFijos = new JButtonMe();
		this.jButtonModificarListadoActivosFijos = new JButtonMe();
        this.jButtonActualizarListadoActivosFijos = new JButtonMe();
        this.jButtonEliminarListadoActivosFijos = new JButtonMe();
        this.jButtonCancelarListadoActivosFijos = new JButtonMe();
        this.jButtonGuardarCambiosListadoActivosFijos = new JButtonMe();
		this.jButtonGuardarCambiosTablaListadoActivosFijos = new JButtonMe();
		this.jButtonCerrarListadoActivosFijos = new JButtonMe();
		
		this.jScrollPanelDatosListadoActivosFijos = new JScrollPane();   
        this.jScrollPanelDatosEdicionListadoActivosFijos = new JScrollPane();
		this.jScrollPanelDatosGeneralListadoActivosFijos = new JScrollPane();
				
		
		
		this.jPanelCamposListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Listado Activos Fijos";
		
		if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Activos Fijoses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadoActivosFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposListadoActivosFijos.setName("jPanelCamposListadoActivosFijos"); 

		this.jPanelCamposOcultosListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosListadoActivosFijos.setName("jPanelCamposOcultosListadoActivosFijos"); 

        this.jPanelAccionesListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadoActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesListadoActivosFijos.setName("Acciones"); 

		this.jPanelAccionesFormularioListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioListadoActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioListadoActivosFijos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoListadoActivosFijos.setText("Nuevo");
		this.jButtonModificarListadoActivosFijos.setText("Editar");
        this.jButtonActualizarListadoActivosFijos.setText("Actualizar");
        this.jButtonEliminarListadoActivosFijos.setText("Eliminar");
        this.jButtonCancelarListadoActivosFijos.setText("Cancelar");
        this.jButtonGuardarCambiosListadoActivosFijos.setText("Guardar");
		this.jButtonGuardarCambiosTablaListadoActivosFijos.setText("Guardar");
		this.jButtonCerrarListadoActivosFijos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadoActivosFijos,"nuevo_button","Nuevo",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarListadoActivosFijos,"modificar_button","Editar",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarListadoActivosFijos,"actualizar_button","Actualizar",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarListadoActivosFijos,"eliminar_button","Eliminar",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarListadoActivosFijos,"cancelar_button","Cancelar",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosListadoActivosFijos,"guardarcambios_button","Guardar",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadoActivosFijos,"guardarcambiostabla_button","Guardar",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadoActivosFijos,"cerrar_button","Salir",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoListadoActivosFijos.setToolTipText("Nuevo"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarListadoActivosFijos.setToolTipText("Editar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarListadoActivosFijos.setToolTipText("Actualizar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarListadoActivosFijos.setToolTipText("Eliminar)"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarListadoActivosFijos.setToolTipText("Cancelar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosListadoActivosFijos.setToolTipText("Guardar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaListadoActivosFijos.setToolTipText("Guardar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadoActivosFijos.setToolTipText("Salir"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadoActivosFijos";
		inputMap = this.jButtonNuevoListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadoActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadoActivosFijos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarListadoActivosFijos";
		inputMap = this.jButtonActualizarListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarListadoActivosFijos"));
		
		//ELIMINAR
		sMapKey = "EliminarListadoActivosFijos";
		inputMap = this.jButtonEliminarListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarListadoActivosFijos"));
		
		//CANCELAR	
		sMapKey = "CancelarListadoActivosFijos";
		inputMap = this.jButtonCancelarListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarListadoActivosFijos"));
		
		//CERRAR		
		sMapKey = "CerrarListadoActivosFijos";
		inputMap = this.jButtonCerrarListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadoActivosFijos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadoActivosFijos";
		inputMap = this.jButtonGuardarCambiosTablaListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadoActivosFijos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoListadoActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoListadoActivosFijos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoListadoActivosFijos.setToolTipText("Nuevo ListadoActivosFijos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarListadoActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarListadoActivosFijos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarListadoActivosFijos.setToolTipText("Sin Cerrar Ventana ListadoActivosFijos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeListadoActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeListadoActivosFijos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeListadoActivosFijos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadoActivosFijos.setText("Accion");
		this.jComboBoxTiposAccionesListadoActivosFijos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioListadoActivosFijos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioListadoActivosFijos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesListadoActivosFijos = new JLabelMe();
		
		this.jLabelAccionesListadoActivosFijos.setText("Acciones");		
		this.jLabelAccionesListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposListadoActivosFijos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysListadoActivosFijos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesListadoActivosFijos=new JTabbedPane();
		this.jTabbedPaneRelacionesListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesListadoActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioListadoActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadoActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadoActivosFijos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposListadoActivosFijos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosListadoActivosFijos = new GridBagLayout();
		
		this.jPanelCamposListadoActivosFijos.setLayout(gridaBagLayoutCamposListadoActivosFijos);
		this.jPanelCamposOcultosListadoActivosFijos.setLayout(gridaBagLayoutCamposOcultosListadoActivosFijos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidListadoActivosFijos.add(jLabelIdListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 1;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidListadoActivosFijos.add(jLabelidListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaListadoActivosFijos.add(jLabelid_empresaListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 2;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
		this.gridBagConstraintsListadoActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadoActivosFijos.add(jButtonid_empresaListadoActivosFijosBusqueda, this.gridBagConstraintsListadoActivosFijos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 3;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
		this.gridBagConstraintsListadoActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadoActivosFijos.add(jButtonid_empresaListadoActivosFijosUpdate, this.gridBagConstraintsListadoActivosFijos);
	}

	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 1;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaListadoActivosFijos.add(jComboBoxid_empresaListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sub_grupoListadoActivosFijos.add(jLabelcodigo_sub_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 2;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
		this.gridBagConstraintsListadoActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sub_grupoListadoActivosFijos.add(jButtoncodigo_sub_grupoListadoActivosFijosBusqueda, this.gridBagConstraintsListadoActivosFijos);
	}

	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 1;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sub_grupoListadoActivosFijos.add(jTextFieldcodigo_sub_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sub_grupoListadoActivosFijos.add(jLabelnombre_sub_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 2;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
		this.gridBagConstraintsListadoActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sub_grupoListadoActivosFijos.add(jButtonnombre_sub_grupoListadoActivosFijosBusqueda, this.gridBagConstraintsListadoActivosFijos);
	}

	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 1;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sub_grupoListadoActivosFijos.add(jscrollPanenombre_sub_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_detalle_grupoListadoActivosFijos.add(jLabelcodigo_detalle_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 2;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
		this.gridBagConstraintsListadoActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_detalle_grupoListadoActivosFijos.add(jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda, this.gridBagConstraintsListadoActivosFijos);
	}

	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 1;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_detalle_grupoListadoActivosFijos.add(jTextFieldcodigo_detalle_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_detalle_grupoListadoActivosFijos.add(jLabelnombre_detalle_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 2;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
		this.gridBagConstraintsListadoActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_detalle_grupoListadoActivosFijos.add(jButtonnombre_detalle_grupoListadoActivosFijosBusqueda, this.gridBagConstraintsListadoActivosFijos);
	}

	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 1;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_detalle_grupoListadoActivosFijos.add(jscrollPanenombre_detalle_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveListadoActivosFijos.add(jLabelclaveListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 2;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
		this.gridBagConstraintsListadoActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveListadoActivosFijos.add(jButtonclaveListadoActivosFijosBusqueda, this.gridBagConstraintsListadoActivosFijos);
	}

	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 1;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveListadoActivosFijos.add(jTextFieldclaveListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreListadoActivosFijos.add(jLabelnombreListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 2;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
		this.gridBagConstraintsListadoActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreListadoActivosFijos.add(jButtonnombreListadoActivosFijosBusqueda, this.gridBagConstraintsListadoActivosFijos);
	}

	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 1;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreListadoActivosFijos.add(jscrollPanenombreListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_compraListadoActivosFijos.add(jLabelfecha_compraListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 2;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
		this.gridBagConstraintsListadoActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_compraListadoActivosFijos.add(jButtonfecha_compraListadoActivosFijosBusqueda, this.gridBagConstraintsListadoActivosFijos);
	}

	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 1;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_compraListadoActivosFijos.add(jDateChooserfecha_compraListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvida_utilListadoActivosFijos.add(jLabelvida_utilListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 2;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
		this.gridBagConstraintsListadoActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvida_utilListadoActivosFijos.add(jButtonvida_utilListadoActivosFijosBusqueda, this.gridBagConstraintsListadoActivosFijos);
	}

	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 1;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvida_utilListadoActivosFijos.add(jTextFieldvida_utilListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_de_compraListadoActivosFijos.add(jLabelcosto_de_compraListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 2;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
		this.gridBagConstraintsListadoActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_de_compraListadoActivosFijos.add(jButtoncosto_de_compraListadoActivosFijosBusqueda, this.gridBagConstraintsListadoActivosFijos);
	}

	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoActivosFijos.gridy = 0;
	this.gridBagConstraintsListadoActivosFijos.gridx = 1;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_de_compraListadoActivosFijos.add(jTextFieldcosto_de_compraListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoActivosFijos.gridy = iYPanelCamposListadoActivosFijos;
	this.gridBagConstraintsListadoActivosFijos.gridx = iXPanelCamposListadoActivosFijos++;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoActivosFijos.add(this.jPanelidListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(iXPanelCamposListadoActivosFijos % 1==0) {
		iXPanelCamposListadoActivosFijos=0;
		iYPanelCamposListadoActivosFijos++;
	}
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoActivosFijos.gridy = iYPanelCamposListadoActivosFijos;
	this.gridBagConstraintsListadoActivosFijos.gridx = iXPanelCamposListadoActivosFijos++;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoActivosFijos.add(this.jPanelcodigo_sub_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(iXPanelCamposListadoActivosFijos % 1==0) {
		iXPanelCamposListadoActivosFijos=0;
		iYPanelCamposListadoActivosFijos++;
	}
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoActivosFijos.gridy = iYPanelCamposListadoActivosFijos;
	this.gridBagConstraintsListadoActivosFijos.gridx = iXPanelCamposListadoActivosFijos++;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoActivosFijos.add(this.jPanelnombre_sub_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(iXPanelCamposListadoActivosFijos % 1==0) {
		iXPanelCamposListadoActivosFijos=0;
		iYPanelCamposListadoActivosFijos++;
	}
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoActivosFijos.gridy = iYPanelCamposListadoActivosFijos;
	this.gridBagConstraintsListadoActivosFijos.gridx = iXPanelCamposListadoActivosFijos++;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoActivosFijos.add(this.jPanelcodigo_detalle_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(iXPanelCamposListadoActivosFijos % 1==0) {
		iXPanelCamposListadoActivosFijos=0;
		iYPanelCamposListadoActivosFijos++;
	}
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoActivosFijos.gridy = iYPanelCamposListadoActivosFijos;
	this.gridBagConstraintsListadoActivosFijos.gridx = iXPanelCamposListadoActivosFijos++;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoActivosFijos.add(this.jPanelnombre_detalle_grupoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(iXPanelCamposListadoActivosFijos % 1==0) {
		iXPanelCamposListadoActivosFijos=0;
		iYPanelCamposListadoActivosFijos++;
	}
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoActivosFijos.gridy = iYPanelCamposListadoActivosFijos;
	this.gridBagConstraintsListadoActivosFijos.gridx = iXPanelCamposListadoActivosFijos++;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoActivosFijos.add(this.jPanelclaveListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(iXPanelCamposListadoActivosFijos % 1==0) {
		iXPanelCamposListadoActivosFijos=0;
		iYPanelCamposListadoActivosFijos++;
	}
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoActivosFijos.gridy = iYPanelCamposListadoActivosFijos;
	this.gridBagConstraintsListadoActivosFijos.gridx = iXPanelCamposListadoActivosFijos++;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoActivosFijos.add(this.jPanelnombreListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(iXPanelCamposListadoActivosFijos % 1==0) {
		iXPanelCamposListadoActivosFijos=0;
		iYPanelCamposListadoActivosFijos++;
	}
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoActivosFijos.gridy = iYPanelCamposListadoActivosFijos;
	this.gridBagConstraintsListadoActivosFijos.gridx = iXPanelCamposListadoActivosFijos++;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoActivosFijos.add(this.jPanelfecha_compraListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(iXPanelCamposListadoActivosFijos % 1==0) {
		iXPanelCamposListadoActivosFijos=0;
		iYPanelCamposListadoActivosFijos++;
	}
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoActivosFijos.gridy = iYPanelCamposListadoActivosFijos;
	this.gridBagConstraintsListadoActivosFijos.gridx = iXPanelCamposListadoActivosFijos++;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoActivosFijos.add(this.jPanelvida_utilListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(iXPanelCamposListadoActivosFijos % 1==0) {
		iXPanelCamposListadoActivosFijos=0;
		iYPanelCamposListadoActivosFijos++;
	}
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoActivosFijos.gridy = iYPanelCamposListadoActivosFijos;
	this.gridBagConstraintsListadoActivosFijos.gridx = iXPanelCamposListadoActivosFijos++;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoActivosFijos.add(this.jPanelcosto_de_compraListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(iXPanelCamposListadoActivosFijos % 1==0) {
		iXPanelCamposListadoActivosFijos=0;
		iYPanelCamposListadoActivosFijos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoActivosFijos.gridy = iYPanelCamposOcultosListadoActivosFijos;
	this.gridBagConstraintsListadoActivosFijos.gridx = iXPanelCamposOcultosListadoActivosFijos++;
	this.gridBagConstraintsListadoActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosListadoActivosFijos.add(this.jPanelid_empresaListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);



	if(iXPanelCamposOcultosListadoActivosFijos % 1==0) {
		iXPanelCamposOcultosListadoActivosFijos=0;
		iYPanelCamposOcultosListadoActivosFijos++;
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
			
		GridBagLayout gridaBagLayoutAccionesListadoActivosFijos= new GridBagLayout();
		this.jPanelAccionesListadoActivosFijos.setLayout(gridaBagLayoutAccionesListadoActivosFijos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioListadoActivosFijos= new GridBagLayout();
		this.jPanelAccionesFormularioListadoActivosFijos.setLayout(gridaBagLayoutAccionesFormularioListadoActivosFijos);
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioListadoActivosFijos.add(this.jComboBoxTiposAccionesFormularioListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccion++;
			
		this.jPanelAccionesListadoActivosFijos.add(this.jButtonModificarListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);							

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx =iPosXAccion++;
			
		this.jPanelAccionesListadoActivosFijos.add(this.jButtonEliminarListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
			
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadoActivosFijos.add(this.jButtonActualizarListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadoActivosFijos.add(this.jButtonGuardarCambiosListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);	
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;		
		this.gridBagConstraintsListadoActivosFijos.gridx =iPosXAccion++;
		
		this.jPanelAccionesListadoActivosFijos.add(this.jButtonCancelarListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadoActivosFijos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();						
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadoActivosFijos.gridx = 0;		
			//this.gridBagConstraintsListadoActivosFijos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadoActivosFijos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadoActivosFijos.gridx =0;
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadoActivosFijos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ListadoActivosFijosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleListadoActivosFijos = new ListadoActivosFijosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Listado Activos Fijos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Listado Activos Fijos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listado Activos Fijos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ListadoActivosFijosModel listadoactivosfijosModel=new ListadoActivosFijosModel(this);
			
			//SI USARA CLASE INTERNA
			//ListadoActivosFijosModel.ListadoActivosFijosFocusTraversalPolicy listadoactivosfijosFocusTraversalPolicy = listadoactivosfijosModel.new ListadoActivosFijosFocusTraversalPolicy(this);
			
			//listadoactivosfijosFocusTraversalPolicy.setlistadoactivosfijosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(listadoactivosfijosModel);
			
			
			this.jContentPaneDetalleListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleListadoActivosFijos = new GridBagLayout();	
			this.jContentPaneDetalleListadoActivosFijos.setLayout(gridaBagLayoutDetalleListadoActivosFijos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadoActivosFijos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
				this.gridBagConstraintsListadoActivosFijos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsListadoActivosFijos.gridx = 0;
					
				
				this.jContentPaneDetalleListadoActivosFijos.add(jTtoolBarDetalleListadoActivosFijos, gridBagConstraintsListadoActivosFijos);								
				
}
			
			this.jScrollPanelDatosEdicionListadoActivosFijos=   new JScrollPane(jContentPaneDetalleListadoActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadoActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralListadoActivosFijos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadoActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsListadoActivosFijos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	        
			this.jContentPaneDetalleListadoActivosFijos.add(jPanelCamposListadoActivosFijos, gridBagConstraintsListadoActivosFijos);
			
			
			
			
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
						//&& listadoactivosfijosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsListadoActivosFijos= new GridBagConstraints();
						this.gridBagConstraintsListadoActivosFijos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsListadoActivosFijos.gridx = 0;
						this.jContentPaneDetalleListadoActivosFijos.add(this.jTabbedPaneRelacionesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesListadoActivosFijos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosListadoActivosFijos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
					this.gridBagConstraintsListadoActivosFijos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsListadoActivosFijos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsListadoActivosFijos.gridx = 0;
					
				
					this.jContentPaneDetalleListadoActivosFijos.add(jPanelCamposOcultosListadoActivosFijos, gridBagConstraintsListadoActivosFijos);
				
					this.jPanelCamposOcultosListadoActivosFijos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	        this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleListadoActivosFijos.add(this.jPanelAccionesFormularioListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);							
			
			
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
	        this.gridBagConstraintsListadoActivosFijos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsListadoActivosFijos.gridx = 0;
	        
			
			this.jContentPaneDetalleListadoActivosFijos.add(this.jPanelAccionesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionListadoActivosFijos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionListadoActivosFijos=   new JScrollPane(this.jPanelCamposListadoActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadoActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsListadoActivosFijos.gridx = 0;
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsListadoActivosFijos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadoActivosFijos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);			
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadoActivosFijos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			
			
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
			
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadoActivosFijos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralListadoActivosFijos;//jContentPane;
		
		return jScrollPanelDatosEdicionListadoActivosFijos;
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
