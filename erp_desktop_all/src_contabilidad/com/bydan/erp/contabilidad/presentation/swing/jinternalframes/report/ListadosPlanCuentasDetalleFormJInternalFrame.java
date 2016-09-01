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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ListadosPlanCuentasConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ListadosPlanCuentasDetalleFormJInternalFrame extends ListadosPlanCuentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleListadosPlanCuentas;
	
	protected JMenuBar jmenuBarDetalleListadosPlanCuentas;
	
	protected JMenu jmenuDetalleListadosPlanCuentas;
	protected JMenu jmenuDetalleArchivoListadosPlanCuentas;
	protected JMenu jmenuDetalleAccionesListadosPlanCuentas;
	protected JMenu jmenuDetalleDatosListadosPlanCuentas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadosPlanCuentas;	
	protected GridBagConstraints gridBagConstraintsListadosPlanCuentas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ListadosPlanCuentasBeanSwingJInternalFrameAdditional jInternalFrameDetalleListadosPlanCuentas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadosPlanCuentasSessionBean listadosplancuentasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ListadosPlanCuentasLogic listadosplancuentasLogic;
	
	public JScrollPane jScrollPanelDatosListadosPlanCuentas;
	public JScrollPane jScrollPanelDatosEdicionListadosPlanCuentas;
	public JScrollPane jScrollPanelDatosGeneralListadosPlanCuentas;
	
	protected JPanel jPanelCamposListadosPlanCuentas;    
	protected JPanel jPanelCamposOcultosListadosPlanCuentas;    	
	protected JPanel jPanelAccionesListadosPlanCuentas;
	protected JPanel jPanelAccionesFormularioListadosPlanCuentas;
    
	
	
	protected Integer iXPanelCamposListadosPlanCuentas=0;
	protected Integer iYPanelCamposListadosPlanCuentas=0;
	
	protected Integer iXPanelCamposOcultosListadosPlanCuentas=0;
	protected Integer iYPanelCamposOcultosListadosPlanCuentas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoListadosPlanCuentas;
	public JButton jButtonModificarListadosPlanCuentas;
	public JButton jButtonActualizarListadosPlanCuentas;
    public JButton jButtonEliminarListadosPlanCuentas;
	public JButton jButtonCancelarListadosPlanCuentas;
    public JButton jButtonGuardarCambiosListadosPlanCuentas;
	public JButton jButtonGuardarCambiosTablaListadosPlanCuentas;
	protected JButton jButtonCerrarListadosPlanCuentas;
	
	
	protected JButton jButtonProcesarInformacionListadosPlanCuentas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoListadosPlanCuentas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarListadosPlanCuentas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeListadosPlanCuentas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadosPlanCuentas;
	protected JButton jButtonModificarToolBarListadosPlanCuentas;
	protected JButton jButtonActualizarToolBarListadosPlanCuentas;
    protected JButton jButtonEliminarToolBarListadosPlanCuentas;
	protected JButton jButtonCancelarToolBarListadosPlanCuentas;
    protected JButton jButtonGuardarCambiosToolBarListadosPlanCuentas;
	protected JButton jButtonGuardarCambiosTablaToolBarListadosPlanCuentas;
	protected JButton jButtonMostrarOcultarTablaToolBarListadosPlanCuentas;
	protected JButton jButtonCerrarToolBarListadosPlanCuentas;
	
	protected JButton jButtonProcesarInformacionToolBarListadosPlanCuentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadosPlanCuentas;
	protected JMenuItem jMenuItemModificarListadosPlanCuentas;
	protected JMenuItem jMenuItemActualizarListadosPlanCuentas;
    protected JMenuItem jMenuItemEliminarListadosPlanCuentas;
	protected JMenuItem jMenuItemCancelarListadosPlanCuentas;
    protected JMenuItem jMenuItemGuardarCambiosListadosPlanCuentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadosPlanCuentas;
	protected JMenuItem jMenuItemCerrarListadosPlanCuentas;
	protected JMenuItem jMenuItemDetalleCerrarListadosPlanCuentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadosPlanCuentas;
	
	protected JMenuItem jMenuItemProcesarInformacionListadosPlanCuentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadosPlanCuentas;
	protected JMenuItem jMenuItemMostrarOcultarListadosPlanCuentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadosPlanCuentas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadosPlanCuentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadosPlanCuentas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioListadosPlanCuentas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidListadosPlanCuentas;
	public JLabel jLabelIdListadosPlanCuentas;
	public JLabel jLabelidListadosPlanCuentas;
	public JButton jButtonidListadosPlanCuentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_monedaListadosPlanCuentas;
	public JLabel jLabelnombre_monedaListadosPlanCuentas;
	public JTextField jTextFieldnombre_monedaListadosPlanCuentas;
	public JButton jButtonnombre_monedaListadosPlanCuentasBusqueda= new JButtonMe();

	public JPanel jPanelcodigoListadosPlanCuentas;
	public JLabel jLabelcodigoListadosPlanCuentas;
	public JTextField jTextFieldcodigoListadosPlanCuentas;
	public JButton jButtoncodigoListadosPlanCuentasBusqueda= new JButtonMe();

	public JPanel jPanelnombreListadosPlanCuentas;
	public JLabel jLabelnombreListadosPlanCuentas;
	public JTextArea jTextAreanombreListadosPlanCuentas;
	public JScrollPane jscrollPanenombreListadosPlanCuentas;
	public JButton jButtonnombreListadosPlanCuentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_nivel_cuentaListadosPlanCuentas;
	public JLabel jLabelnombre_nivel_cuentaListadosPlanCuentas;
	public JTextArea jTextAreanombre_nivel_cuentaListadosPlanCuentas;
	public JScrollPane jscrollPanenombre_nivel_cuentaListadosPlanCuentas;
	public JButton jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda= new JButtonMe();

	public JPanel jPaneles_movimientoListadosPlanCuentas;
	public JLabel jLabeles_movimientoListadosPlanCuentas;
	public JCheckBox jCheckBoxes_movimientoListadosPlanCuentas;
	public JButton jButtones_movimientoListadosPlanCuentasBusqueda= new JButtonMe();

	public JPanel jPaneles_centro_costoListadosPlanCuentas;
	public JLabel jLabeles_centro_costoListadosPlanCuentas;
	public JCheckBox jCheckBoxes_centro_costoListadosPlanCuentas;
	public JButton jButtones_centro_costoListadosPlanCuentasBusqueda= new JButtonMe();

	public JPanel jPaneles_centro_actividadListadosPlanCuentas;
	public JLabel jLabeles_centro_actividadListadosPlanCuentas;
	public JCheckBox jCheckBoxes_centro_actividadListadosPlanCuentas;
	public JButton jButtones_centro_actividadListadosPlanCuentasBusqueda= new JButtonMe();

	public JPanel jPaneles_para_f52ListadosPlanCuentas;
	public JLabel jLabeles_para_f52ListadosPlanCuentas;
	public JCheckBox jCheckBoxes_para_f52ListadosPlanCuentas;
	public JButton jButtones_para_f52ListadosPlanCuentasBusqueda= new JButtonMe();

	public JPanel jPanelordenListadosPlanCuentas;
	public JLabel jLabelordenListadosPlanCuentas;
	public JTextField jTextFieldordenListadosPlanCuentas;
	public JButton jButtonordenListadosPlanCuentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaListadosPlanCuentas;
	public JLabel jLabelid_empresaListadosPlanCuentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaListadosPlanCuentas;
	public JButton jButtonid_empresaListadosPlanCuentas= new JButtonMe();
	public JButton jButtonid_empresaListadosPlanCuentasUpdate= new JButtonMe();
	public JButton jButtonid_empresaListadosPlanCuentasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesListadosPlanCuentas;
	
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
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ListadosPlanCuentasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposListadosPlanCuentas=new JPanel();
				this.jPanelAccionesFormularioListadosPlanCuentas=new JPanel();
				this.jmenuBarDetalleListadosPlanCuentas=new JMenuBar();
				this.jTtoolBarDetalleListadosPlanCuentas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosPlanCuentasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ListadosPlanCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ListadosPlanCuentasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ListadosPlanCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosPlanCuentasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosPlanCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosPlanCuentasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosPlanCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosPlanCuentasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadosPlanCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarListadosPlanCuentas() {
		return this.jButtonActualizarToolBarListadosPlanCuentas;
	}
	
	public JButton getjButtonEliminarToolBarListadosPlanCuentas() {
		return this.jButtonEliminarToolBarListadosPlanCuentas;
	}
	
	public JButton getjButtonCancelarToolBarListadosPlanCuentas() {
		return this.jButtonCancelarToolBarListadosPlanCuentas;
	}		
	
	public JButton getjButtonProcesarInformacionListadosPlanCuentas() {
		return this.jButtonProcesarInformacionListadosPlanCuentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadosPlanCuentas)	{
		this.jButtonProcesarInformacionListadosPlanCuentas = jButtonProcesarInformacionListadosPlanCuentas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadosPlanCuentas() {
		return this.jComboBoxTiposAccionesListadosPlanCuentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadosPlanCuentas(
			JComboBox jComboBoxTiposRelacionesListadosPlanCuentas) {
		this.jComboBoxTiposRelacionesListadosPlanCuentas = jComboBoxTiposRelacionesListadosPlanCuentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadosPlanCuentas(
			JComboBox jComboBoxTiposAccionesListadosPlanCuentas) {
		this.jComboBoxTiposAccionesListadosPlanCuentas = jComboBoxTiposAccionesListadosPlanCuentas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioListadosPlanCuentas() {
		return this.jComboBoxTiposAccionesFormularioListadosPlanCuentas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioListadosPlanCuentas(
			JComboBox jComboBoxTiposAccionesFormularioListadosPlanCuentas) {
		this.jComboBoxTiposAccionesFormularioListadosPlanCuentas = jComboBoxTiposAccionesFormularioListadosPlanCuentas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.listadosplancuentasSessionBean=new ListadosPlanCuentasSessionBean();
		
		this.listadosplancuentasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadosplancuentasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadosplancuentasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadosPlanCuentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadosPlanCuentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadosPlanCuentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listados Plan Cuentas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
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
	
		ListadosPlanCuentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleListadosPlanCuentas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarListadosPlanCuentas=new JButtonMe();
				this.jButtonModificarToolBarListadosPlanCuentas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarListadosPlanCuentas,this.jTtoolBarDetalleListadosPlanCuentas,
							"actualizar","actualizar","Actualizar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarListadosPlanCuentas,this.jTtoolBarDetalleListadosPlanCuentas,
							"eliminar","eliminar","Eliminar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarListadosPlanCuentas,this.jTtoolBarDetalleListadosPlanCuentas,
							"cancelar","cancelar","Cancelar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarListadosPlanCuentas,this.jTtoolBarDetalleListadosPlanCuentas,
							"guardarcambios","guardarcambios","Guardar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleListadosPlanCuentas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleListadosPlanCuentas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoListadosPlanCuentas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesListadosPlanCuentas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosListadosPlanCuentas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadosPlanCuentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadosPlanCuentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadosPlanCuentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarListadosPlanCuentas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarListadosPlanCuentas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarListadosPlanCuentas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarListadosPlanCuentas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarListadosPlanCuentas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarListadosPlanCuentas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarListadosPlanCuentas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarListadosPlanCuentas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarListadosPlanCuentas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarListadosPlanCuentas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarListadosPlanCuentas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarListadosPlanCuentas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosListadosPlanCuentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadosPlanCuentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadosPlanCuentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadosPlanCuentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadosPlanCuentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadosPlanCuentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarListadosPlanCuentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarListadosPlanCuentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarListadosPlanCuentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadosPlanCuentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadosPlanCuentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadosPlanCuentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadosPlanCuentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadosPlanCuentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadosPlanCuentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoListadosPlanCuentas.add(this.jMenuItemDetalleCerrarListadosPlanCuentas);
		
		this.jmenuDetalleAccionesListadosPlanCuentas.add(this.jMenuItemActualizarListadosPlanCuentas);
		this.jmenuDetalleAccionesListadosPlanCuentas.add(this.jMenuItemEliminarListadosPlanCuentas);
		this.jmenuDetalleAccionesListadosPlanCuentas.add(this.jMenuItemCancelarListadosPlanCuentas);		
		
		//this.jmenuDetalleDatosListadosPlanCuentas.add(this.jMenuItemDetalleAbrirOrderByListadosPlanCuentas);				
		this.jmenuDetalleDatosListadosPlanCuentas.add(this.jMenuItemDetalleMostarOcultarListadosPlanCuentas);				
				
		//this.jmenuDetalleAccionesListadosPlanCuentas.add(this.jMenuItemGuardarCambiosListadosPlanCuentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleListadosPlanCuentas.add(this.jmenuDetalleArchivoListadosPlanCuentas);		
		this.jmenuBarDetalleListadosPlanCuentas.add(this.jmenuDetalleAccionesListadosPlanCuentas);		
		this.jmenuBarDetalleListadosPlanCuentas.add(this.jmenuDetalleDatosListadosPlanCuentas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleListadosPlanCuentas);				
	}
	
	
	public void inicializarElementosCamposListadosPlanCuentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdListadosPlanCuentas = new JLabelMe();
		jLabelIdListadosPlanCuentas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidListadosPlanCuentas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidListadosPlanCuentas.setToolTipText(ListadosPlanCuentasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutListadosPlanCuentas= new GridBagLayout();

		this.jPanelidListadosPlanCuentas.setLayout(this.gridaBagLayoutListadosPlanCuentas);

		jLabelidListadosPlanCuentas = new JLabel();
		jLabelidListadosPlanCuentas.setText("Id");

		jLabelidListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_monedaListadosPlanCuentas = new JLabelMe();
		this.jLabelnombre_monedaListadosPlanCuentas.setText(""+ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA+" : *");
		this.jLabelnombre_monedaListadosPlanCuentas.setToolTipText("Nombre Moneda");
		this.jLabelnombre_monedaListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_monedaListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_monedaListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_monedaListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_monedaListadosPlanCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_monedaListadosPlanCuentas.setToolTipText(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA);
		this.gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		this.jPanelnombre_monedaListadosPlanCuentas.setLayout(this.gridaBagLayoutListadosPlanCuentas);


		jTextFieldnombre_monedaListadosPlanCuentas= new JTextFieldMe();

		jTextFieldnombre_monedaListadosPlanCuentas.setEnabled(false);
		jTextFieldnombre_monedaListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_monedaListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_monedaListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_monedaListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_monedaListadosPlanCuentasBusqueda= new JButtonMe();
		this.jButtonnombre_monedaListadosPlanCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_monedaListadosPlanCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_monedaListadosPlanCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_monedaListadosPlanCuentasBusqueda.setText("U");
		this.jButtonnombre_monedaListadosPlanCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_monedaListadosPlanCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_monedaListadosPlanCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_monedaListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_monedaListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_monedaListadosPlanCuentasBusqueda"));

		if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_monedaListadosPlanCuentasBusqueda.setVisible(false);		}


					
		this.jLabelcodigoListadosPlanCuentas = new JLabelMe();
		this.jLabelcodigoListadosPlanCuentas.setText(""+ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoListadosPlanCuentas.setToolTipText("Codigo");
		this.jLabelcodigoListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoListadosPlanCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoListadosPlanCuentas.setToolTipText(ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		this.jPanelcodigoListadosPlanCuentas.setLayout(this.gridaBagLayoutListadosPlanCuentas);


		jTextFieldcodigoListadosPlanCuentas= new JTextFieldMe();

		jTextFieldcodigoListadosPlanCuentas.setEnabled(false);
		jTextFieldcodigoListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoListadosPlanCuentasBusqueda= new JButtonMe();
		this.jButtoncodigoListadosPlanCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadosPlanCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadosPlanCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoListadosPlanCuentasBusqueda.setText("U");
		this.jButtoncodigoListadosPlanCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoListadosPlanCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoListadosPlanCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoListadosPlanCuentasBusqueda"));

		if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoListadosPlanCuentasBusqueda.setVisible(false);		}


					
		this.jLabelnombreListadosPlanCuentas = new JLabelMe();
		this.jLabelnombreListadosPlanCuentas.setText(""+ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreListadosPlanCuentas.setToolTipText("Nombre");
		this.jLabelnombreListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreListadosPlanCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreListadosPlanCuentas.setToolTipText(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		this.jPanelnombreListadosPlanCuentas.setLayout(this.gridaBagLayoutListadosPlanCuentas);


		jTextAreanombreListadosPlanCuentas= new JTextAreaMe();
		jTextAreanombreListadosPlanCuentas.setEnabled(false);
		jTextAreanombreListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadosPlanCuentas.setLineWrap(true);
		jTextAreanombreListadosPlanCuentas.setWrapStyleWord(true);
		jTextAreanombreListadosPlanCuentas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreListadosPlanCuentas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreListadosPlanCuentas = new JScrollPane(jTextAreanombreListadosPlanCuentas);
		jscrollPanenombreListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreListadosPlanCuentasBusqueda= new JButtonMe();
		this.jButtonnombreListadosPlanCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreListadosPlanCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreListadosPlanCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreListadosPlanCuentasBusqueda.setText("U");
		this.jButtonnombreListadosPlanCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreListadosPlanCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreListadosPlanCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreListadosPlanCuentasBusqueda"));

		if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreListadosPlanCuentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_nivel_cuentaListadosPlanCuentas = new JLabelMe();
		this.jLabelnombre_nivel_cuentaListadosPlanCuentas.setText(""+ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA+" : *");
		this.jLabelnombre_nivel_cuentaListadosPlanCuentas.setToolTipText("Nombre Nivel Cuenta");
		this.jLabelnombre_nivel_cuentaListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_nivel_cuentaListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_nivel_cuentaListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_nivel_cuentaListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_nivel_cuentaListadosPlanCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_nivel_cuentaListadosPlanCuentas.setToolTipText(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA);
		this.gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		this.jPanelnombre_nivel_cuentaListadosPlanCuentas.setLayout(this.gridaBagLayoutListadosPlanCuentas);


		jTextAreanombre_nivel_cuentaListadosPlanCuentas= new JTextAreaMe();
		jTextAreanombre_nivel_cuentaListadosPlanCuentas.setEnabled(false);
		jTextAreanombre_nivel_cuentaListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_nivel_cuentaListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_nivel_cuentaListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_nivel_cuentaListadosPlanCuentas.setLineWrap(true);
		jTextAreanombre_nivel_cuentaListadosPlanCuentas.setWrapStyleWord(true);
		jTextAreanombre_nivel_cuentaListadosPlanCuentas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_nivel_cuentaListadosPlanCuentas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_nivel_cuentaListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_nivel_cuentaListadosPlanCuentas = new JScrollPane(jTextAreanombre_nivel_cuentaListadosPlanCuentas);
		jscrollPanenombre_nivel_cuentaListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_nivel_cuentaListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_nivel_cuentaListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda= new JButtonMe();
		this.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda.setText("U");
		this.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_nivel_cuentaListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_nivel_cuentaListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_nivel_cuentaListadosPlanCuentasBusqueda"));

		if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda.setVisible(false);		}


					
		this.jLabeles_movimientoListadosPlanCuentas = new JLabelMe();
		this.jLabeles_movimientoListadosPlanCuentas.setText(""+ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO+" : *");
		this.jLabeles_movimientoListadosPlanCuentas.setToolTipText("Es Movimiento");
		this.jLabeles_movimientoListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_movimientoListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_movimientoListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_movimientoListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_movimientoListadosPlanCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_movimientoListadosPlanCuentas.setToolTipText(ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO);
		this.gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		this.jPaneles_movimientoListadosPlanCuentas.setLayout(this.gridaBagLayoutListadosPlanCuentas);


		jCheckBoxes_movimientoListadosPlanCuentas= new JCheckBoxMe();
		jCheckBoxes_movimientoListadosPlanCuentas.setEnabled(false);

		jCheckBoxes_movimientoListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_movimientoListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_movimientoListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_movimientoListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_movimientoListadosPlanCuentasBusqueda= new JButtonMe();
		this.jButtones_movimientoListadosPlanCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_movimientoListadosPlanCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_movimientoListadosPlanCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_movimientoListadosPlanCuentasBusqueda.setText("U");
		this.jButtones_movimientoListadosPlanCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_movimientoListadosPlanCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_movimientoListadosPlanCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_movimientoListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_movimientoListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_movimientoListadosPlanCuentasBusqueda"));

		if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_movimientoListadosPlanCuentasBusqueda.setVisible(false);		}


					
		this.jLabeles_centro_costoListadosPlanCuentas = new JLabelMe();
		this.jLabeles_centro_costoListadosPlanCuentas.setText(""+ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO+" : *");
		this.jLabeles_centro_costoListadosPlanCuentas.setToolTipText("Es Centro Costo");
		this.jLabeles_centro_costoListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_centro_costoListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_centro_costoListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_centro_costoListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_centro_costoListadosPlanCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_centro_costoListadosPlanCuentas.setToolTipText(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO);
		this.gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		this.jPaneles_centro_costoListadosPlanCuentas.setLayout(this.gridaBagLayoutListadosPlanCuentas);


		jCheckBoxes_centro_costoListadosPlanCuentas= new JCheckBoxMe();
		jCheckBoxes_centro_costoListadosPlanCuentas.setEnabled(false);

		jCheckBoxes_centro_costoListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_centro_costoListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_centro_costoListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_centro_costoListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_centro_costoListadosPlanCuentasBusqueda= new JButtonMe();
		this.jButtones_centro_costoListadosPlanCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_centro_costoListadosPlanCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_centro_costoListadosPlanCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_centro_costoListadosPlanCuentasBusqueda.setText("U");
		this.jButtones_centro_costoListadosPlanCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_centro_costoListadosPlanCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_centro_costoListadosPlanCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_centro_costoListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_centro_costoListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_centro_costoListadosPlanCuentasBusqueda"));

		if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_centro_costoListadosPlanCuentasBusqueda.setVisible(false);		}


					
		this.jLabeles_centro_actividadListadosPlanCuentas = new JLabelMe();
		this.jLabeles_centro_actividadListadosPlanCuentas.setText(""+ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD+" : *");
		this.jLabeles_centro_actividadListadosPlanCuentas.setToolTipText("Es Centro Activad");
		this.jLabeles_centro_actividadListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_centro_actividadListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_centro_actividadListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_centro_actividadListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_centro_actividadListadosPlanCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_centro_actividadListadosPlanCuentas.setToolTipText(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD);
		this.gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		this.jPaneles_centro_actividadListadosPlanCuentas.setLayout(this.gridaBagLayoutListadosPlanCuentas);


		jCheckBoxes_centro_actividadListadosPlanCuentas= new JCheckBoxMe();
		jCheckBoxes_centro_actividadListadosPlanCuentas.setEnabled(false);

		jCheckBoxes_centro_actividadListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_centro_actividadListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_centro_actividadListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_centro_actividadListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_centro_actividadListadosPlanCuentasBusqueda= new JButtonMe();
		this.jButtones_centro_actividadListadosPlanCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_centro_actividadListadosPlanCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_centro_actividadListadosPlanCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_centro_actividadListadosPlanCuentasBusqueda.setText("U");
		this.jButtones_centro_actividadListadosPlanCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_centro_actividadListadosPlanCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_centro_actividadListadosPlanCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_centro_actividadListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_centro_actividadListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_centro_actividadListadosPlanCuentasBusqueda"));

		if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_centro_actividadListadosPlanCuentasBusqueda.setVisible(false);		}


					
		this.jLabeles_para_f52ListadosPlanCuentas = new JLabelMe();
		this.jLabeles_para_f52ListadosPlanCuentas.setText(""+ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52+" : *");
		this.jLabeles_para_f52ListadosPlanCuentas.setToolTipText("Es Para F52");
		this.jLabeles_para_f52ListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_para_f52ListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_para_f52ListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_para_f52ListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_para_f52ListadosPlanCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_para_f52ListadosPlanCuentas.setToolTipText(ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52);
		this.gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		this.jPaneles_para_f52ListadosPlanCuentas.setLayout(this.gridaBagLayoutListadosPlanCuentas);


		jCheckBoxes_para_f52ListadosPlanCuentas= new JCheckBoxMe();
		jCheckBoxes_para_f52ListadosPlanCuentas.setEnabled(false);

		jCheckBoxes_para_f52ListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_f52ListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_f52ListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_para_f52ListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_para_f52ListadosPlanCuentasBusqueda= new JButtonMe();
		this.jButtones_para_f52ListadosPlanCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_f52ListadosPlanCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_f52ListadosPlanCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_para_f52ListadosPlanCuentasBusqueda.setText("U");
		this.jButtones_para_f52ListadosPlanCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_para_f52ListadosPlanCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_para_f52ListadosPlanCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_para_f52ListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_para_f52ListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_para_f52ListadosPlanCuentasBusqueda"));

		if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_para_f52ListadosPlanCuentasBusqueda.setVisible(false);		}


					
		this.jLabelordenListadosPlanCuentas = new JLabelMe();
		this.jLabelordenListadosPlanCuentas.setText(""+ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenListadosPlanCuentas.setToolTipText("Orden");
		this.jLabelordenListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenListadosPlanCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenListadosPlanCuentas.setToolTipText(ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		this.jPanelordenListadosPlanCuentas.setLayout(this.gridaBagLayoutListadosPlanCuentas);


		jTextFieldordenListadosPlanCuentas= new JTextFieldMe();
		jTextFieldordenListadosPlanCuentas.setEnabled(false);
		jTextFieldordenListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenListadosPlanCuentas.setText("0");

		this.jButtonordenListadosPlanCuentasBusqueda= new JButtonMe();
		this.jButtonordenListadosPlanCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenListadosPlanCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenListadosPlanCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenListadosPlanCuentasBusqueda.setText("U");
		this.jButtonordenListadosPlanCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenListadosPlanCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenListadosPlanCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenListadosPlanCuentasBusqueda"));

		if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenListadosPlanCuentasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysListadosPlanCuentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaListadosPlanCuentas = new JLabelMe();
		this.jLabelid_empresaListadosPlanCuentas.setText(""+ListadosPlanCuentasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaListadosPlanCuentas.setToolTipText("Empresa");
		this.jLabelid_empresaListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaListadosPlanCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaListadosPlanCuentas.setToolTipText(ListadosPlanCuentasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		this.jPanelid_empresaListadosPlanCuentas.setLayout(this.gridaBagLayoutListadosPlanCuentas);


		jComboBoxid_empresaListadosPlanCuentas= new JComboBoxMe();
		jComboBoxid_empresaListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaListadosPlanCuentas.setEnabled(false);

		this.jButtonid_empresaListadosPlanCuentas= new JButtonMe();
		this.jButtonid_empresaListadosPlanCuentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosPlanCuentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosPlanCuentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosPlanCuentas.setText("Buscar");
		this.jButtonid_empresaListadosPlanCuentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaListadosPlanCuentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosPlanCuentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosPlanCuentas"));

		this.jButtonid_empresaListadosPlanCuentasBusqueda= new JButtonMe();
		this.jButtonid_empresaListadosPlanCuentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosPlanCuentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosPlanCuentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadosPlanCuentasBusqueda.setText("U");
		this.jButtonid_empresaListadosPlanCuentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaListadosPlanCuentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosPlanCuentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosPlanCuentasBusqueda"));

		if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaListadosPlanCuentasBusqueda.setVisible(false);		}

		this.jButtonid_empresaListadosPlanCuentasUpdate= new JButtonMe();
		this.jButtonid_empresaListadosPlanCuentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosPlanCuentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosPlanCuentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadosPlanCuentasUpdate.setText("U");
		this.jButtonid_empresaListadosPlanCuentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaListadosPlanCuentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosPlanCuentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosPlanCuentasUpdate"));



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
		//this.jInternalFrameDetalleListadosPlanCuentas = new ListadosPlanCuentasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Listados Plan Cuentas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadosPlanCuentas= new GridBagLayout();
		

		
		String sToolTipListadosPlanCuentas="";
		sToolTipListadosPlanCuentas=ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadosPlanCuentas+="(Contabilidad.ListadosPlanCuentas)";
		}
		
		if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadosPlanCuentas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoListadosPlanCuentas = new JButtonMe();
		this.jButtonModificarListadosPlanCuentas = new JButtonMe();
        this.jButtonActualizarListadosPlanCuentas = new JButtonMe();
        this.jButtonEliminarListadosPlanCuentas = new JButtonMe();
        this.jButtonCancelarListadosPlanCuentas = new JButtonMe();
        this.jButtonGuardarCambiosListadosPlanCuentas = new JButtonMe();
		this.jButtonGuardarCambiosTablaListadosPlanCuentas = new JButtonMe();
		this.jButtonCerrarListadosPlanCuentas = new JButtonMe();
		
		this.jScrollPanelDatosListadosPlanCuentas = new JScrollPane();   
        this.jScrollPanelDatosEdicionListadosPlanCuentas = new JScrollPane();
		this.jScrollPanelDatosGeneralListadosPlanCuentas = new JScrollPane();
				
		
		
		this.jPanelCamposListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Listados Plan Cuentas";
		
		if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Plan Cuentases" + this.sPath));
		} else {
			this.jScrollPanelDatosListadosPlanCuentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposListadosPlanCuentas.setName("jPanelCamposListadosPlanCuentas"); 

		this.jPanelCamposOcultosListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosListadosPlanCuentas.setName("jPanelCamposOcultosListadosPlanCuentas"); 

        this.jPanelAccionesListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadosPlanCuentas.setToolTipText("Acciones");
        this.jPanelAccionesListadosPlanCuentas.setName("Acciones"); 

		this.jPanelAccionesFormularioListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioListadosPlanCuentas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioListadosPlanCuentas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoListadosPlanCuentas.setText("Nuevo");
		this.jButtonModificarListadosPlanCuentas.setText("Editar");
        this.jButtonActualizarListadosPlanCuentas.setText("Actualizar");
        this.jButtonEliminarListadosPlanCuentas.setText("Eliminar");
        this.jButtonCancelarListadosPlanCuentas.setText("Cancelar");
        this.jButtonGuardarCambiosListadosPlanCuentas.setText("Guardar");
		this.jButtonGuardarCambiosTablaListadosPlanCuentas.setText("Guardar");
		this.jButtonCerrarListadosPlanCuentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadosPlanCuentas,"nuevo_button","Nuevo",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarListadosPlanCuentas,"modificar_button","Editar",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarListadosPlanCuentas,"actualizar_button","Actualizar",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarListadosPlanCuentas,"eliminar_button","Eliminar",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarListadosPlanCuentas,"cancelar_button","Cancelar",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosListadosPlanCuentas,"guardarcambios_button","Guardar",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadosPlanCuentas,"guardarcambiostabla_button","Guardar",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadosPlanCuentas,"cerrar_button","Salir",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoListadosPlanCuentas.setToolTipText("Nuevo"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarListadosPlanCuentas.setToolTipText("Editar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarListadosPlanCuentas.setToolTipText("Actualizar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarListadosPlanCuentas.setToolTipText("Eliminar)"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarListadosPlanCuentas.setToolTipText("Cancelar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosListadosPlanCuentas.setToolTipText("Guardar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaListadosPlanCuentas.setToolTipText("Guardar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadosPlanCuentas.setToolTipText("Salir"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadosPlanCuentas";
		inputMap = this.jButtonNuevoListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadosPlanCuentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadosPlanCuentas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarListadosPlanCuentas";
		inputMap = this.jButtonActualizarListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarListadosPlanCuentas"));
		
		//ELIMINAR
		sMapKey = "EliminarListadosPlanCuentas";
		inputMap = this.jButtonEliminarListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarListadosPlanCuentas"));
		
		//CANCELAR	
		sMapKey = "CancelarListadosPlanCuentas";
		inputMap = this.jButtonCancelarListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarListadosPlanCuentas"));
		
		//CERRAR		
		sMapKey = "CerrarListadosPlanCuentas";
		inputMap = this.jButtonCerrarListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadosPlanCuentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadosPlanCuentas";
		inputMap = this.jButtonGuardarCambiosTablaListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadosPlanCuentas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoListadosPlanCuentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoListadosPlanCuentas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoListadosPlanCuentas.setToolTipText("Nuevo ListadosPlanCuentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarListadosPlanCuentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarListadosPlanCuentas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarListadosPlanCuentas.setToolTipText("Sin Cerrar Ventana ListadosPlanCuentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeListadosPlanCuentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeListadosPlanCuentas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeListadosPlanCuentas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesListadosPlanCuentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadosPlanCuentas.setText("Accion");
		this.jComboBoxTiposAccionesListadosPlanCuentas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioListadosPlanCuentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesListadosPlanCuentas = new JLabelMe();
		
		this.jLabelAccionesListadosPlanCuentas.setText("Acciones");		
		this.jLabelAccionesListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposListadosPlanCuentas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysListadosPlanCuentas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesListadosPlanCuentas=new JTabbedPane();
		this.jTabbedPaneRelacionesListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesListadosPlanCuentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosPlanCuentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosPlanCuentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposListadosPlanCuentas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosListadosPlanCuentas = new GridBagLayout();
		
		this.jPanelCamposListadosPlanCuentas.setLayout(gridaBagLayoutCamposListadosPlanCuentas);
		this.jPanelCamposOcultosListadosPlanCuentas.setLayout(gridaBagLayoutCamposOcultosListadosPlanCuentas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidListadosPlanCuentas.add(jLabelIdListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 1;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidListadosPlanCuentas.add(jLabelidListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaListadosPlanCuentas.add(jLabelid_empresaListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 2;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
		this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadosPlanCuentas.add(jButtonid_empresaListadosPlanCuentasBusqueda, this.gridBagConstraintsListadosPlanCuentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 3;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
		this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadosPlanCuentas.add(jButtonid_empresaListadosPlanCuentasUpdate, this.gridBagConstraintsListadosPlanCuentas);
	}

	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 1;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaListadosPlanCuentas.add(jComboBoxid_empresaListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_monedaListadosPlanCuentas.add(jLabelnombre_monedaListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 2;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
		this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_monedaListadosPlanCuentas.add(jButtonnombre_monedaListadosPlanCuentasBusqueda, this.gridBagConstraintsListadosPlanCuentas);
	}

	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 1;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_monedaListadosPlanCuentas.add(jTextFieldnombre_monedaListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoListadosPlanCuentas.add(jLabelcodigoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 2;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
		this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoListadosPlanCuentas.add(jButtoncodigoListadosPlanCuentasBusqueda, this.gridBagConstraintsListadosPlanCuentas);
	}

	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 1;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoListadosPlanCuentas.add(jTextFieldcodigoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreListadosPlanCuentas.add(jLabelnombreListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 2;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
		this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreListadosPlanCuentas.add(jButtonnombreListadosPlanCuentasBusqueda, this.gridBagConstraintsListadosPlanCuentas);
	}

	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 1;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreListadosPlanCuentas.add(jscrollPanenombreListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_nivel_cuentaListadosPlanCuentas.add(jLabelnombre_nivel_cuentaListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 2;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
		this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_nivel_cuentaListadosPlanCuentas.add(jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda, this.gridBagConstraintsListadosPlanCuentas);
	}

	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 1;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_nivel_cuentaListadosPlanCuentas.add(jscrollPanenombre_nivel_cuentaListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_movimientoListadosPlanCuentas.add(jLabeles_movimientoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 2;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
		this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_movimientoListadosPlanCuentas.add(jButtones_movimientoListadosPlanCuentasBusqueda, this.gridBagConstraintsListadosPlanCuentas);
	}

	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 1;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_movimientoListadosPlanCuentas.add(jCheckBoxes_movimientoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_centro_costoListadosPlanCuentas.add(jLabeles_centro_costoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 2;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
		this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_centro_costoListadosPlanCuentas.add(jButtones_centro_costoListadosPlanCuentasBusqueda, this.gridBagConstraintsListadosPlanCuentas);
	}

	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 1;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_centro_costoListadosPlanCuentas.add(jCheckBoxes_centro_costoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_centro_actividadListadosPlanCuentas.add(jLabeles_centro_actividadListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 2;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
		this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_centro_actividadListadosPlanCuentas.add(jButtones_centro_actividadListadosPlanCuentasBusqueda, this.gridBagConstraintsListadosPlanCuentas);
	}

	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 1;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_centro_actividadListadosPlanCuentas.add(jCheckBoxes_centro_actividadListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_para_f52ListadosPlanCuentas.add(jLabeles_para_f52ListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 2;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
		this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_para_f52ListadosPlanCuentas.add(jButtones_para_f52ListadosPlanCuentasBusqueda, this.gridBagConstraintsListadosPlanCuentas);
	}

	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 1;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_para_f52ListadosPlanCuentas.add(jCheckBoxes_para_f52ListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenListadosPlanCuentas.add(jLabelordenListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 2;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
		this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenListadosPlanCuentas.add(jButtonordenListadosPlanCuentasBusqueda, this.gridBagConstraintsListadosPlanCuentas);
	}

	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
	this.gridBagConstraintsListadosPlanCuentas.gridx = 1;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenListadosPlanCuentas.add(jTextFieldordenListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosPlanCuentas.gridy = iYPanelCamposListadosPlanCuentas;
	this.gridBagConstraintsListadosPlanCuentas.gridx = iXPanelCamposListadosPlanCuentas++;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosPlanCuentas.add(this.jPanelidListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(iXPanelCamposListadosPlanCuentas % 1==0) {
		iXPanelCamposListadosPlanCuentas=0;
		iYPanelCamposListadosPlanCuentas++;
	}
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosPlanCuentas.gridy = iYPanelCamposListadosPlanCuentas;
	this.gridBagConstraintsListadosPlanCuentas.gridx = iXPanelCamposListadosPlanCuentas++;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosPlanCuentas.add(this.jPanelnombre_monedaListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(iXPanelCamposListadosPlanCuentas % 1==0) {
		iXPanelCamposListadosPlanCuentas=0;
		iYPanelCamposListadosPlanCuentas++;
	}
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosPlanCuentas.gridy = iYPanelCamposListadosPlanCuentas;
	this.gridBagConstraintsListadosPlanCuentas.gridx = iXPanelCamposListadosPlanCuentas++;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosPlanCuentas.add(this.jPanelcodigoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(iXPanelCamposListadosPlanCuentas % 1==0) {
		iXPanelCamposListadosPlanCuentas=0;
		iYPanelCamposListadosPlanCuentas++;
	}
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosPlanCuentas.gridy = iYPanelCamposListadosPlanCuentas;
	this.gridBagConstraintsListadosPlanCuentas.gridx = iXPanelCamposListadosPlanCuentas++;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosPlanCuentas.add(this.jPanelnombreListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(iXPanelCamposListadosPlanCuentas % 1==0) {
		iXPanelCamposListadosPlanCuentas=0;
		iYPanelCamposListadosPlanCuentas++;
	}
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosPlanCuentas.gridy = iYPanelCamposListadosPlanCuentas;
	this.gridBagConstraintsListadosPlanCuentas.gridx = iXPanelCamposListadosPlanCuentas++;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosPlanCuentas.add(this.jPanelnombre_nivel_cuentaListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(iXPanelCamposListadosPlanCuentas % 1==0) {
		iXPanelCamposListadosPlanCuentas=0;
		iYPanelCamposListadosPlanCuentas++;
	}
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosPlanCuentas.gridy = iYPanelCamposListadosPlanCuentas;
	this.gridBagConstraintsListadosPlanCuentas.gridx = iXPanelCamposListadosPlanCuentas++;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosPlanCuentas.add(this.jPaneles_movimientoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(iXPanelCamposListadosPlanCuentas % 1==0) {
		iXPanelCamposListadosPlanCuentas=0;
		iYPanelCamposListadosPlanCuentas++;
	}
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosPlanCuentas.gridy = iYPanelCamposListadosPlanCuentas;
	this.gridBagConstraintsListadosPlanCuentas.gridx = iXPanelCamposListadosPlanCuentas++;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosPlanCuentas.add(this.jPaneles_centro_costoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(iXPanelCamposListadosPlanCuentas % 1==0) {
		iXPanelCamposListadosPlanCuentas=0;
		iYPanelCamposListadosPlanCuentas++;
	}
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosPlanCuentas.gridy = iYPanelCamposListadosPlanCuentas;
	this.gridBagConstraintsListadosPlanCuentas.gridx = iXPanelCamposListadosPlanCuentas++;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosPlanCuentas.add(this.jPaneles_centro_actividadListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(iXPanelCamposListadosPlanCuentas % 1==0) {
		iXPanelCamposListadosPlanCuentas=0;
		iYPanelCamposListadosPlanCuentas++;
	}
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosPlanCuentas.gridy = iYPanelCamposListadosPlanCuentas;
	this.gridBagConstraintsListadosPlanCuentas.gridx = iXPanelCamposListadosPlanCuentas++;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosPlanCuentas.add(this.jPaneles_para_f52ListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(iXPanelCamposListadosPlanCuentas % 1==0) {
		iXPanelCamposListadosPlanCuentas=0;
		iYPanelCamposListadosPlanCuentas++;
	}
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosPlanCuentas.gridy = iYPanelCamposListadosPlanCuentas;
	this.gridBagConstraintsListadosPlanCuentas.gridx = iXPanelCamposListadosPlanCuentas++;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosPlanCuentas.add(this.jPanelordenListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(iXPanelCamposListadosPlanCuentas % 1==0) {
		iXPanelCamposListadosPlanCuentas=0;
		iYPanelCamposListadosPlanCuentas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosPlanCuentas.gridy = iYPanelCamposOcultosListadosPlanCuentas;
	this.gridBagConstraintsListadosPlanCuentas.gridx = iXPanelCamposOcultosListadosPlanCuentas++;
	this.gridBagConstraintsListadosPlanCuentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosPlanCuentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosListadosPlanCuentas.add(this.jPanelid_empresaListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);



	if(iXPanelCamposOcultosListadosPlanCuentas % 1==0) {
		iXPanelCamposOcultosListadosPlanCuentas=0;
		iYPanelCamposOcultosListadosPlanCuentas++;
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
			
		GridBagLayout gridaBagLayoutAccionesListadosPlanCuentas= new GridBagLayout();
		this.jPanelAccionesListadosPlanCuentas.setLayout(gridaBagLayoutAccionesListadosPlanCuentas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioListadosPlanCuentas= new GridBagLayout();
		this.jPanelAccionesFormularioListadosPlanCuentas.setLayout(gridaBagLayoutAccionesFormularioListadosPlanCuentas);
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioListadosPlanCuentas.add(this.jComboBoxTiposAccionesFormularioListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccion++;
			
		this.jPanelAccionesListadosPlanCuentas.add(this.jButtonModificarListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);							

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx =iPosXAccion++;
			
		this.jPanelAccionesListadosPlanCuentas.add(this.jButtonEliminarListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		
			
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadosPlanCuentas.add(this.jButtonActualizarListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);


		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadosPlanCuentas.add(this.jButtonGuardarCambiosListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);	
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;		
		this.gridBagConstraintsListadosPlanCuentas.gridx =iPosXAccion++;
		
		this.jPanelAccionesListadosPlanCuentas.add(this.jButtonCancelarListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadosPlanCuentas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();						
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosPlanCuentas.gridx = 0;		
			//this.gridBagConstraintsListadosPlanCuentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadosPlanCuentas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadosPlanCuentas.gridx =0;
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadosPlanCuentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ListadosPlanCuentasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleListadosPlanCuentas = new ListadosPlanCuentasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Listados Plan Cuentas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Listados Plan Cuentas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listados Plan Cuentas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ListadosPlanCuentasModel listadosplancuentasModel=new ListadosPlanCuentasModel(this);
			
			//SI USARA CLASE INTERNA
			//ListadosPlanCuentasModel.ListadosPlanCuentasFocusTraversalPolicy listadosplancuentasFocusTraversalPolicy = listadosplancuentasModel.new ListadosPlanCuentasFocusTraversalPolicy(this);
			
			//listadosplancuentasFocusTraversalPolicy.setlistadosplancuentasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(listadosplancuentasModel);
			
			
			this.jContentPaneDetalleListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleListadosPlanCuentas = new GridBagLayout();	
			this.jContentPaneDetalleListadosPlanCuentas.setLayout(gridaBagLayoutDetalleListadosPlanCuentas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadosPlanCuentas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
				this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
					
				
				this.jContentPaneDetalleListadosPlanCuentas.add(jTtoolBarDetalleListadosPlanCuentas, gridBagConstraintsListadosPlanCuentas);								
				
}
			
			this.jScrollPanelDatosEdicionListadosPlanCuentas=   new JScrollPane(jContentPaneDetalleListadosPlanCuentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadosPlanCuentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosPlanCuentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosPlanCuentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralListadosPlanCuentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadosPlanCuentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosPlanCuentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosPlanCuentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	        
			this.jContentPaneDetalleListadosPlanCuentas.add(jPanelCamposListadosPlanCuentas, gridBagConstraintsListadosPlanCuentas);
			
			
			
			
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
						//&& listadosplancuentasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.listadosplancuentasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsListadosPlanCuentas= new GridBagConstraints();
						this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
						this.jContentPaneDetalleListadosPlanCuentas.add(this.jTabbedPaneRelacionesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesListadosPlanCuentas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosListadosPlanCuentas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
					this.gridBagConstraintsListadosPlanCuentas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
					
				
					this.jContentPaneDetalleListadosPlanCuentas.add(jPanelCamposOcultosListadosPlanCuentas, gridBagConstraintsListadosPlanCuentas);
				
					this.jPanelCamposOcultosListadosPlanCuentas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	        this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleListadosPlanCuentas.add(this.jPanelAccionesFormularioListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);							
			
			
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
	        this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
	        
			
			this.jContentPaneDetalleListadosPlanCuentas.add(this.jPanelAccionesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionListadosPlanCuentas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionListadosPlanCuentas=   new JScrollPane(this.jPanelCamposListadosPlanCuentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadosPlanCuentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosPlanCuentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosPlanCuentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsListadosPlanCuentas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);			
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
			
			
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		
			
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadosPlanCuentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralListadosPlanCuentas;//jContentPane;
		
		return jScrollPanelDatosEdicionListadosPlanCuentas;
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
