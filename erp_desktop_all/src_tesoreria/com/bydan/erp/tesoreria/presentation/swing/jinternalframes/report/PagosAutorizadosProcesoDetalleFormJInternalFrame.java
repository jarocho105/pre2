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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.PagosAutorizadosProcesoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class PagosAutorizadosProcesoDetalleFormJInternalFrame extends PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePagosAutorizadosProceso;
	
	protected JMenuBar jmenuBarDetallePagosAutorizadosProceso;
	
	protected JMenu jmenuDetallePagosAutorizadosProceso;
	protected JMenu jmenuDetalleArchivoPagosAutorizadosProceso;
	protected JMenu jmenuDetalleAccionesPagosAutorizadosProceso;
	protected JMenu jmenuDetalleDatosPagosAutorizadosProceso;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPagosAutorizadosProceso;	
	protected GridBagConstraints gridBagConstraintsPagosAutorizadosProceso;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional jInternalFrameDetallePagosAutorizadosProceso;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public PagosAutorizadosProcesoSessionBean pagosautorizadosprocesoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;	
	
	public PagosAutorizadosProcesoLogic pagosautorizadosprocesoLogic;
	
	public JScrollPane jScrollPanelDatosPagosAutorizadosProceso;
	public JScrollPane jScrollPanelDatosEdicionPagosAutorizadosProceso;
	public JScrollPane jScrollPanelDatosGeneralPagosAutorizadosProceso;
	
	protected JPanel jPanelCamposPagosAutorizadosProceso;    
	protected JPanel jPanelCamposOcultosPagosAutorizadosProceso;    	
	protected JPanel jPanelAccionesPagosAutorizadosProceso;
	protected JPanel jPanelAccionesFormularioPagosAutorizadosProceso;
    
	
	
	protected Integer iXPanelCamposPagosAutorizadosProceso=0;
	protected Integer iYPanelCamposPagosAutorizadosProceso=0;
	
	protected Integer iXPanelCamposOcultosPagosAutorizadosProceso=0;
	protected Integer iYPanelCamposOcultosPagosAutorizadosProceso=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPagosAutorizadosProceso;
	public JButton jButtonModificarPagosAutorizadosProceso;
	public JButton jButtonActualizarPagosAutorizadosProceso;
    public JButton jButtonEliminarPagosAutorizadosProceso;
	public JButton jButtonCancelarPagosAutorizadosProceso;
    public JButton jButtonGuardarCambiosPagosAutorizadosProceso;
	public JButton jButtonGuardarCambiosTablaPagosAutorizadosProceso;
	protected JButton jButtonCerrarPagosAutorizadosProceso;
	
	
	protected JButton jButtonProcesarInformacionPagosAutorizadosProceso;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPagosAutorizadosProceso;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPagosAutorizadosProceso;
	protected JCheckBox jCheckBoxPostAccionSinMensajePagosAutorizadosProceso;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPagosAutorizadosProceso;
	protected JButton jButtonModificarToolBarPagosAutorizadosProceso;
	protected JButton jButtonActualizarToolBarPagosAutorizadosProceso;
    protected JButton jButtonEliminarToolBarPagosAutorizadosProceso;
	protected JButton jButtonCancelarToolBarPagosAutorizadosProceso;
    protected JButton jButtonGuardarCambiosToolBarPagosAutorizadosProceso;
	protected JButton jButtonGuardarCambiosTablaToolBarPagosAutorizadosProceso;
	protected JButton jButtonMostrarOcultarTablaToolBarPagosAutorizadosProceso;
	protected JButton jButtonCerrarToolBarPagosAutorizadosProceso;
	
	protected JButton jButtonProcesarInformacionToolBarPagosAutorizadosProceso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPagosAutorizadosProceso;
	protected JMenuItem jMenuItemModificarPagosAutorizadosProceso;
	protected JMenuItem jMenuItemActualizarPagosAutorizadosProceso;
    protected JMenuItem jMenuItemEliminarPagosAutorizadosProceso;
	protected JMenuItem jMenuItemCancelarPagosAutorizadosProceso;
    protected JMenuItem jMenuItemGuardarCambiosPagosAutorizadosProceso;
	protected JMenuItem jMenuItemGuardarCambiosTablaPagosAutorizadosProceso;
	protected JMenuItem jMenuItemCerrarPagosAutorizadosProceso;
	protected JMenuItem jMenuItemDetalleCerrarPagosAutorizadosProceso;
	protected JMenuItem jMenuItemDetalleMostarOcultarPagosAutorizadosProceso;
	
	protected JMenuItem jMenuItemProcesarInformacionPagosAutorizadosProceso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPagosAutorizadosProceso;
	protected JMenuItem jMenuItemMostrarOcultarPagosAutorizadosProceso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPagosAutorizadosProceso;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPagosAutorizadosProceso;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPagosAutorizadosProceso;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPagosAutorizadosProceso;
	public JLabel jLabelIdPagosAutorizadosProceso;
	public JLabel jLabelidPagosAutorizadosProceso;
	public JButton jButtonidPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_documentoPagosAutorizadosProceso;
	public JLabel jLabelnombre_tipo_documentoPagosAutorizadosProceso;
	public JTextArea jTextAreanombre_tipo_documentoPagosAutorizadosProceso;
	public JScrollPane jscrollPanenombre_tipo_documentoPagosAutorizadosProceso;
	public JButton jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPagosAutorizadosProceso;
	public JLabel jLabelcodigoPagosAutorizadosProceso;
	public JTextField jTextFieldcodigoPagosAutorizadosProceso;
	public JButton jButtoncodigoPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioPagosAutorizadosProceso;
	public JLabel jLabelbeneficiarioPagosAutorizadosProceso;
	public JTextArea jTextAreabeneficiarioPagosAutorizadosProceso;
	public JScrollPane jscrollPanebeneficiarioPagosAutorizadosProceso;
	public JButton jButtonbeneficiarioPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelfechaPagosAutorizadosProceso;
	public JLabel jLabelfechaPagosAutorizadosProceso;
	//public JFormattedTextField jDateChooserfechaPagosAutorizadosProceso;

	public JDateChooser jDateChooserfechaPagosAutorizadosProceso;
	public JButton jButtonfechaPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPagosAutorizadosProceso;
	public JLabel jLabelfecha_emisionPagosAutorizadosProceso;
	//public JFormattedTextField jDateChooserfecha_emisionPagosAutorizadosProceso;

	public JDateChooser jDateChooserfecha_emisionPagosAutorizadosProceso;
	public JButton jButtonfecha_emisionPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso;
	public JLabel jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso;
	public JTextField jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso;
	public JButton jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorPagosAutorizadosProceso;
	public JLabel jLabelnumero_mayorPagosAutorizadosProceso;
	public JTextArea jTextAreanumero_mayorPagosAutorizadosProceso;
	public JScrollPane jscrollPanenumero_mayorPagosAutorizadosProceso;
	public JButton jButtonnumero_mayorPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelvalorPagosAutorizadosProceso;
	public JLabel jLabelvalorPagosAutorizadosProceso;
	public JTextField jTextFieldvalorPagosAutorizadosProceso;
	public JButton jButtonvalorPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuenta_bancoPagosAutorizadosProceso;
	public JLabel jLabelcodigo_cuenta_bancoPagosAutorizadosProceso;
	public JTextArea jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso;
	public JScrollPane jscrollPanecodigo_cuenta_bancoPagosAutorizadosProceso;
	public JButton jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequePagosAutorizadosProceso;
	public JLabel jLabelnumero_chequePagosAutorizadosProceso;
	public JTextField jTextFieldnumero_chequePagosAutorizadosProceso;
	public JButton jButtonnumero_chequePagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso;
	public JLabel jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso;
	public JTextArea jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso;
	public JScrollPane jscrollPanebeneficiario_detalle_cheque_giradoPagosAutorizadosProceso;
	public JButton jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPagosAutorizadosProceso;
	public JLabel jLabelid_empresaPagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPagosAutorizadosProceso;
	public JButton jButtonid_empresaPagosAutorizadosProceso= new JButtonMe();
	public JButton jButtonid_empresaPagosAutorizadosProcesoUpdate= new JButtonMe();
	public JButton jButtonid_empresaPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPagosAutorizadosProceso;
	public JLabel jLabelid_sucursalPagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPagosAutorizadosProceso;
	public JButton jButtonid_sucursalPagosAutorizadosProceso= new JButtonMe();
	public JButton jButtonid_sucursalPagosAutorizadosProcesoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPagosAutorizadosProcesoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPagosAutorizadosProceso;
	public JLabel jLabelid_ejercicioPagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPagosAutorizadosProceso;
	public JButton jButtonid_ejercicioPagosAutorizadosProceso= new JButtonMe();
	public JButton jButtonid_ejercicioPagosAutorizadosProcesoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPagosAutorizadosProcesoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPagosAutorizadosProceso;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PagosAutorizadosProcesoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPagosAutorizadosProceso=new JPanel();
				this.jPanelAccionesFormularioPagosAutorizadosProceso=new JPanel();
				this.jmenuBarDetallePagosAutorizadosProceso=new JMenuBar();
				this.jTtoolBarDetallePagosAutorizadosProceso=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosProcesoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PagosAutorizadosProceso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PagosAutorizadosProcesoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PagosAutorizadosProceso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosProcesoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutorizadosProceso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosProcesoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutorizadosProceso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosProcesoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PagosAutorizadosProceso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPagosAutorizadosProceso() {
		return this.jButtonActualizarToolBarPagosAutorizadosProceso;
	}
	
	public JButton getjButtonEliminarToolBarPagosAutorizadosProceso() {
		return this.jButtonEliminarToolBarPagosAutorizadosProceso;
	}
	
	public JButton getjButtonCancelarToolBarPagosAutorizadosProceso() {
		return this.jButtonCancelarToolBarPagosAutorizadosProceso;
	}		
	
	public JButton getjButtonProcesarInformacionPagosAutorizadosProceso() {
		return this.jButtonProcesarInformacionPagosAutorizadosProceso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPagosAutorizadosProceso)	{
		this.jButtonProcesarInformacionPagosAutorizadosProceso = jButtonProcesarInformacionPagosAutorizadosProceso;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPagosAutorizadosProceso() {
		return this.jComboBoxTiposAccionesPagosAutorizadosProceso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPagosAutorizadosProceso(
			JComboBox jComboBoxTiposRelacionesPagosAutorizadosProceso) {
		this.jComboBoxTiposRelacionesPagosAutorizadosProceso = jComboBoxTiposRelacionesPagosAutorizadosProceso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPagosAutorizadosProceso(
			JComboBox jComboBoxTiposAccionesPagosAutorizadosProceso) {
		this.jComboBoxTiposAccionesPagosAutorizadosProceso = jComboBoxTiposAccionesPagosAutorizadosProceso;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPagosAutorizadosProceso() {
		return this.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPagosAutorizadosProceso(
			JComboBox jComboBoxTiposAccionesFormularioPagosAutorizadosProceso) {
		this.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso = jComboBoxTiposAccionesFormularioPagosAutorizadosProceso;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pagosautorizadosprocesoSessionBean=new PagosAutorizadosProcesoSessionBean();
		
		this.pagosautorizadosprocesoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagosautorizadosprocesoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PagosAutorizadosProcesoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PagosAutorizadosProcesoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PagosAutorizadosProcesoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pagos Autorizados Proceso MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
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
	
		PagosAutorizadosProcesoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePagosAutorizadosProceso= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPagosAutorizadosProceso=new JButtonMe();
				this.jButtonModificarToolBarPagosAutorizadosProceso=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPagosAutorizadosProceso,this.jTtoolBarDetallePagosAutorizadosProceso,
							"actualizar","actualizar","Actualizar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPagosAutorizadosProceso,this.jTtoolBarDetallePagosAutorizadosProceso,
							"eliminar","eliminar","Eliminar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPagosAutorizadosProceso,this.jTtoolBarDetallePagosAutorizadosProceso,
							"cancelar","cancelar","Cancelar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPagosAutorizadosProceso,this.jTtoolBarDetallePagosAutorizadosProceso,
							"guardarcambios","guardarcambios","Guardar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePagosAutorizadosProceso=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePagosAutorizadosProceso=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPagosAutorizadosProceso=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPagosAutorizadosProceso=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPagosAutorizadosProceso=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPagosAutorizadosProceso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPagosAutorizadosProceso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPagosAutorizadosProceso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPagosAutorizadosProceso= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPagosAutorizadosProceso.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPagosAutorizadosProceso,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPagosAutorizadosProceso= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPagosAutorizadosProceso.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPagosAutorizadosProceso,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPagosAutorizadosProceso= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPagosAutorizadosProceso.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPagosAutorizadosProceso,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPagosAutorizadosProceso= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPagosAutorizadosProceso.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPagosAutorizadosProceso,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPagosAutorizadosProceso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPagosAutorizadosProceso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPagosAutorizadosProceso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPagosAutorizadosProceso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPagosAutorizadosProceso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPagosAutorizadosProceso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPagosAutorizadosProceso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPagosAutorizadosProceso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPagosAutorizadosProceso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPagosAutorizadosProceso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPagosAutorizadosProceso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPagosAutorizadosProceso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPagosAutorizadosProceso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPagosAutorizadosProceso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPagosAutorizadosProceso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPagosAutorizadosProceso.add(this.jMenuItemDetalleCerrarPagosAutorizadosProceso);
		
		this.jmenuDetalleAccionesPagosAutorizadosProceso.add(this.jMenuItemActualizarPagosAutorizadosProceso);
		this.jmenuDetalleAccionesPagosAutorizadosProceso.add(this.jMenuItemEliminarPagosAutorizadosProceso);
		this.jmenuDetalleAccionesPagosAutorizadosProceso.add(this.jMenuItemCancelarPagosAutorizadosProceso);		
		
		//this.jmenuDetalleDatosPagosAutorizadosProceso.add(this.jMenuItemDetalleAbrirOrderByPagosAutorizadosProceso);				
		this.jmenuDetalleDatosPagosAutorizadosProceso.add(this.jMenuItemDetalleMostarOcultarPagosAutorizadosProceso);				
				
		//this.jmenuDetalleAccionesPagosAutorizadosProceso.add(this.jMenuItemGuardarCambiosPagosAutorizadosProceso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePagosAutorizadosProceso.add(this.jmenuDetalleArchivoPagosAutorizadosProceso);		
		this.jmenuBarDetallePagosAutorizadosProceso.add(this.jmenuDetalleAccionesPagosAutorizadosProceso);		
		this.jmenuBarDetallePagosAutorizadosProceso.add(this.jmenuDetalleDatosPagosAutorizadosProceso);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePagosAutorizadosProceso);				
	}
	
	
	public void inicializarElementosCamposPagosAutorizadosProceso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPagosAutorizadosProceso = new JLabelMe();
		jLabelIdPagosAutorizadosProceso.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPagosAutorizadosProceso = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPagosAutorizadosProceso= new GridBagLayout();

		this.jPanelidPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);

		jLabelidPagosAutorizadosProceso = new JLabel();
		jLabelidPagosAutorizadosProceso.setText("Id");

		jLabelidPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_tipo_documentoPagosAutorizadosProceso = new JLabelMe();
		this.jLabelnombre_tipo_documentoPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO+" : *");
		this.jLabelnombre_tipo_documentoPagosAutorizadosProceso.setToolTipText("Nombre Tipo Documento");
		this.jLabelnombre_tipo_documentoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_documentoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_documentoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_documentoPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_documentoPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_documentoPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelnombre_tipo_documentoPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jTextAreanombre_tipo_documentoPagosAutorizadosProceso= new JTextAreaMe();
		jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setEnabled(false);
		jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setLineWrap(true);
		jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setWrapStyleWord(true);
		jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_documentoPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_documentoPagosAutorizadosProceso = new JScrollPane(jTextAreanombre_tipo_documentoPagosAutorizadosProceso);
		jscrollPanenombre_tipo_documentoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_documentoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_documentoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_documentoPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_documentoPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_documentoPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda.setVisible(false);		}


					
		this.jLabelcodigoPagosAutorizadosProceso = new JLabelMe();
		this.jLabelcodigoPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPagosAutorizadosProceso.setToolTipText("Codigo");
		this.jLabelcodigoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelcodigoPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jTextFieldcodigoPagosAutorizadosProceso= new JTextFieldMe();

		jTextFieldcodigoPagosAutorizadosProceso.setEnabled(false);
		jTextFieldcodigoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtoncodigoPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtoncodigoPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPagosAutorizadosProcesoBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioPagosAutorizadosProceso = new JLabelMe();
		this.jLabelbeneficiarioPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioPagosAutorizadosProceso.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelbeneficiarioPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jTextAreabeneficiarioPagosAutorizadosProceso= new JTextAreaMe();
		jTextAreabeneficiarioPagosAutorizadosProceso.setEnabled(false);
		jTextAreabeneficiarioPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioPagosAutorizadosProceso.setLineWrap(true);
		jTextAreabeneficiarioPagosAutorizadosProceso.setWrapStyleWord(true);
		jTextAreabeneficiarioPagosAutorizadosProceso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioPagosAutorizadosProceso.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioPagosAutorizadosProceso = new JScrollPane(jTextAreabeneficiarioPagosAutorizadosProceso);
		jscrollPanebeneficiarioPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda.setVisible(false);		}


					
		this.jLabelfechaPagosAutorizadosProceso = new JLabelMe();
		this.jLabelfechaPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPagosAutorizadosProceso.setToolTipText("Fecha");
		this.jLabelfechaPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelfechaPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		//jFormattedTextFieldfechaPagosAutorizadosProceso= new JFormattedTextFieldMe();

		jDateChooserfechaPagosAutorizadosProceso= new JDateChooser();
		jDateChooserfechaPagosAutorizadosProceso.setEnabled(false);
		jDateChooserfechaPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPagosAutorizadosProceso.setDate(new Date());
		jDateChooserfechaPagosAutorizadosProceso.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPagosAutorizadosProceso.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtonfechaPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtonfechaPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPagosAutorizadosProcesoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPagosAutorizadosProceso = new JLabelMe();
		this.jLabelfecha_emisionPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPagosAutorizadosProceso.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelfecha_emisionPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		//jFormattedTextFieldfecha_emisionPagosAutorizadosProceso= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPagosAutorizadosProceso= new JDateChooser();
		jDateChooserfecha_emisionPagosAutorizadosProceso.setEnabled(false);
		jDateChooserfecha_emisionPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPagosAutorizadosProceso.setDate(new Date());
		jDateChooserfecha_emisionPagosAutorizadosProceso.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPagosAutorizadosProceso.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso = new JLabelMe();
		this.jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO+" : *");
		this.jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setToolTipText("Codigo Tipo Movimiento Modulo");
		this.jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso= new JTextFieldMe();

		jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setEnabled(false);
		jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorPagosAutorizadosProceso = new JLabelMe();
		this.jLabelnumero_mayorPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorPagosAutorizadosProceso.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelnumero_mayorPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jTextAreanumero_mayorPagosAutorizadosProceso= new JTextAreaMe();
		jTextAreanumero_mayorPagosAutorizadosProceso.setEnabled(false);
		jTextAreanumero_mayorPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorPagosAutorizadosProceso.setLineWrap(true);
		jTextAreanumero_mayorPagosAutorizadosProceso.setWrapStyleWord(true);
		jTextAreanumero_mayorPagosAutorizadosProceso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorPagosAutorizadosProceso.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorPagosAutorizadosProceso = new JScrollPane(jTextAreanumero_mayorPagosAutorizadosProceso);
		jscrollPanenumero_mayorPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda.setVisible(false);		}


					
		this.jLabelvalorPagosAutorizadosProceso = new JLabelMe();
		this.jLabelvalorPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPagosAutorizadosProceso.setToolTipText("Valor");
		this.jLabelvalorPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelvalorPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jTextFieldvalorPagosAutorizadosProceso= new JTextFieldMe();
		jTextFieldvalorPagosAutorizadosProceso.setEnabled(false);
		jTextFieldvalorPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPagosAutorizadosProceso.setText("0.0");

		this.jButtonvalorPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtonvalorPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtonvalorPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPagosAutorizadosProcesoBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cuenta_bancoPagosAutorizadosProceso = new JLabelMe();
		this.jLabelcodigo_cuenta_bancoPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO+" : *");
		this.jLabelcodigo_cuenta_bancoPagosAutorizadosProceso.setToolTipText("Codigo Cuenta Banco");
		this.jLabelcodigo_cuenta_bancoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_cuenta_bancoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_cuenta_bancoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuenta_bancoPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuenta_bancoPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuenta_bancoPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelcodigo_cuenta_bancoPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso= new JTextAreaMe();
		jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setEnabled(false);
		jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setLineWrap(true);
		jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setWrapStyleWord(true);
		jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigo_cuenta_bancoPagosAutorizadosProceso = new JScrollPane(jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso);
		jscrollPanecodigo_cuenta_bancoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigo_cuenta_bancoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigo_cuenta_bancoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuenta_bancoPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequePagosAutorizadosProceso = new JLabelMe();
		this.jLabelnumero_chequePagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequePagosAutorizadosProceso.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequePagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequePagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequePagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequePagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequePagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequePagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelnumero_chequePagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jTextFieldnumero_chequePagosAutorizadosProceso= new JTextFieldMe();

		jTextFieldnumero_chequePagosAutorizadosProceso.setEnabled(false);
		jTextFieldnumero_chequePagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequePagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequePagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequePagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequePagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtonnumero_chequePagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequePagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequePagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequePagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtonnumero_chequePagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequePagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequePagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequePagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequePagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequePagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequePagosAutorizadosProcesoBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso = new JLabelMe();
		this.jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO+" : *");
		this.jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setToolTipText("Beneficiario Detalle Cheque Girado");
		this.jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso= new JTextAreaMe();
		jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setEnabled(false);
		jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setLineWrap(true);
		jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setWrapStyleWord(true);
		jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiario_detalle_cheque_giradoPagosAutorizadosProceso = new JScrollPane(jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso);
		jscrollPanebeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanebeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanebeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPagosAutorizadosProceso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPagosAutorizadosProceso = new JLabelMe();
		this.jLabelid_empresaPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPagosAutorizadosProceso.setToolTipText("Empresa");
		this.jLabelid_empresaPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelid_empresaPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jComboBoxid_empresaPagosAutorizadosProceso= new JComboBoxMe();
		jComboBoxid_empresaPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPagosAutorizadosProceso.setEnabled(false);

		this.jButtonid_empresaPagosAutorizadosProceso= new JButtonMe();
		this.jButtonid_empresaPagosAutorizadosProceso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosAutorizadosProceso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosAutorizadosProceso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosAutorizadosProceso.setText("Buscar");
		this.jButtonid_empresaPagosAutorizadosProceso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPagosAutorizadosProceso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosAutorizadosProceso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosAutorizadosProceso"));

		this.jButtonid_empresaPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtonid_empresaPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtonid_empresaPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPagosAutorizadosProcesoBusqueda.setVisible(false);		}

		this.jButtonid_empresaPagosAutorizadosProcesoUpdate= new JButtonMe();
		this.jButtonid_empresaPagosAutorizadosProcesoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutorizadosProcesoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutorizadosProcesoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPagosAutorizadosProcesoUpdate.setText("U");
		this.jButtonid_empresaPagosAutorizadosProcesoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPagosAutorizadosProcesoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosAutorizadosProcesoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosAutorizadosProcesoUpdate"));



					
		this.jLabelid_sucursalPagosAutorizadosProceso = new JLabelMe();
		this.jLabelid_sucursalPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPagosAutorizadosProceso.setToolTipText("Sucursal");
		this.jLabelid_sucursalPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelid_sucursalPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jComboBoxid_sucursalPagosAutorizadosProceso= new JComboBoxMe();
		jComboBoxid_sucursalPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPagosAutorizadosProceso.setEnabled(false);

		this.jButtonid_sucursalPagosAutorizadosProceso= new JButtonMe();
		this.jButtonid_sucursalPagosAutorizadosProceso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPagosAutorizadosProceso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPagosAutorizadosProceso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPagosAutorizadosProceso.setText("Buscar");
		this.jButtonid_sucursalPagosAutorizadosProceso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPagosAutorizadosProceso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPagosAutorizadosProceso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPagosAutorizadosProceso"));

		this.jButtonid_sucursalPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtonid_sucursalPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtonid_sucursalPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPagosAutorizadosProcesoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPagosAutorizadosProcesoUpdate= new JButtonMe();
		this.jButtonid_sucursalPagosAutorizadosProcesoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPagosAutorizadosProcesoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPagosAutorizadosProcesoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPagosAutorizadosProcesoUpdate.setText("U");
		this.jButtonid_sucursalPagosAutorizadosProcesoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPagosAutorizadosProcesoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPagosAutorizadosProcesoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPagosAutorizadosProcesoUpdate"));



					
		this.jLabelid_ejercicioPagosAutorizadosProceso = new JLabelMe();
		this.jLabelid_ejercicioPagosAutorizadosProceso.setText(""+PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPagosAutorizadosProceso.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPagosAutorizadosProceso.setToolTipText(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		this.jPanelid_ejercicioPagosAutorizadosProceso.setLayout(this.gridaBagLayoutPagosAutorizadosProceso);


		jComboBoxid_ejercicioPagosAutorizadosProceso= new JComboBoxMe();
		jComboBoxid_ejercicioPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPagosAutorizadosProceso.setEnabled(false);

		this.jButtonid_ejercicioPagosAutorizadosProceso= new JButtonMe();
		this.jButtonid_ejercicioPagosAutorizadosProceso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPagosAutorizadosProceso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPagosAutorizadosProceso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPagosAutorizadosProceso.setText("Buscar");
		this.jButtonid_ejercicioPagosAutorizadosProceso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPagosAutorizadosProceso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPagosAutorizadosProceso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPagosAutorizadosProceso"));

		this.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda.setText("U");
		this.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPagosAutorizadosProcesoBusqueda"));

		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPagosAutorizadosProcesoUpdate= new JButtonMe();
		this.jButtonid_ejercicioPagosAutorizadosProcesoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPagosAutorizadosProcesoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPagosAutorizadosProcesoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPagosAutorizadosProcesoUpdate.setText("U");
		this.jButtonid_ejercicioPagosAutorizadosProcesoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPagosAutorizadosProcesoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPagosAutorizadosProcesoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPagosAutorizadosProcesoUpdate"));



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
		//this.jInternalFrameDetallePagosAutorizadosProceso = new PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pagos Autorizados Proceso DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPagosAutorizadosProceso= new GridBagLayout();
		

		
		String sToolTipPagosAutorizadosProceso="";
		sToolTipPagosAutorizadosProceso=PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPagosAutorizadosProceso+="(Tesoreria.PagosAutorizadosProceso)";
		}
		
		if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPagosAutorizadosProceso+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPagosAutorizadosProceso = new JButtonMe();
		this.jButtonModificarPagosAutorizadosProceso = new JButtonMe();
        this.jButtonActualizarPagosAutorizadosProceso = new JButtonMe();
        this.jButtonEliminarPagosAutorizadosProceso = new JButtonMe();
        this.jButtonCancelarPagosAutorizadosProceso = new JButtonMe();
        this.jButtonGuardarCambiosPagosAutorizadosProceso = new JButtonMe();
		this.jButtonGuardarCambiosTablaPagosAutorizadosProceso = new JButtonMe();
		this.jButtonCerrarPagosAutorizadosProceso = new JButtonMe();
		
		this.jScrollPanelDatosPagosAutorizadosProceso = new JScrollPane();   
        this.jScrollPanelDatosEdicionPagosAutorizadosProceso = new JScrollPane();
		this.jScrollPanelDatosGeneralPagosAutorizadosProceso = new JScrollPane();
				
		
		
		this.jPanelCamposPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pagos Autorizados Proceso";
		
		if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizados Procesos" + this.sPath));
		} else {
			this.jScrollPanelDatosPagosAutorizadosProceso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPagosAutorizadosProceso.setName("jPanelCamposPagosAutorizadosProceso"); 

		this.jPanelCamposOcultosPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPagosAutorizadosProceso.setName("jPanelCamposOcultosPagosAutorizadosProceso"); 

        this.jPanelAccionesPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPagosAutorizadosProceso.setToolTipText("Acciones");
        this.jPanelAccionesPagosAutorizadosProceso.setName("Acciones"); 

		this.jPanelAccionesFormularioPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPagosAutorizadosProceso.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPagosAutorizadosProceso.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPagosAutorizadosProceso.setText("Nuevo");
		this.jButtonModificarPagosAutorizadosProceso.setText("Editar");
        this.jButtonActualizarPagosAutorizadosProceso.setText("Actualizar");
        this.jButtonEliminarPagosAutorizadosProceso.setText("Eliminar");
        this.jButtonCancelarPagosAutorizadosProceso.setText("Cancelar");
        this.jButtonGuardarCambiosPagosAutorizadosProceso.setText("Guardar");
		this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.setText("Guardar");
		this.jButtonCerrarPagosAutorizadosProceso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPagosAutorizadosProceso,"nuevo_button","Nuevo",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPagosAutorizadosProceso,"modificar_button","Editar",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPagosAutorizadosProceso,"actualizar_button","Actualizar",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPagosAutorizadosProceso,"eliminar_button","Eliminar",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPagosAutorizadosProceso,"cancelar_button","Cancelar",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPagosAutorizadosProceso,"guardarcambios_button","Guardar",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPagosAutorizadosProceso,"guardarcambiostabla_button","Guardar",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPagosAutorizadosProceso,"cerrar_button","Salir",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPagosAutorizadosProceso.setToolTipText("Nuevo"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPagosAutorizadosProceso.setToolTipText("Editar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPagosAutorizadosProceso.setToolTipText("Actualizar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPagosAutorizadosProceso.setToolTipText("Eliminar)"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPagosAutorizadosProceso.setToolTipText("Cancelar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPagosAutorizadosProceso.setToolTipText("Guardar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.setToolTipText("Guardar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPagosAutorizadosProceso.setToolTipText("Salir"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPagosAutorizadosProceso";
		inputMap = this.jButtonNuevoPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPagosAutorizadosProceso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPagosAutorizadosProceso"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPagosAutorizadosProceso";
		inputMap = this.jButtonActualizarPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPagosAutorizadosProceso"));
		
		//ELIMINAR
		sMapKey = "EliminarPagosAutorizadosProceso";
		inputMap = this.jButtonEliminarPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPagosAutorizadosProceso"));
		
		//CANCELAR	
		sMapKey = "CancelarPagosAutorizadosProceso";
		inputMap = this.jButtonCancelarPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPagosAutorizadosProceso"));
		
		//CERRAR		
		sMapKey = "CerrarPagosAutorizadosProceso";
		inputMap = this.jButtonCerrarPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPagosAutorizadosProceso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPagosAutorizadosProceso";
		inputMap = this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPagosAutorizadosProceso"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPagosAutorizadosProceso = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPagosAutorizadosProceso.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPagosAutorizadosProceso.setToolTipText("Nuevo PagosAutorizadosProceso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPagosAutorizadosProceso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPagosAutorizadosProceso.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPagosAutorizadosProceso.setToolTipText("Sin Cerrar Ventana PagosAutorizadosProceso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePagosAutorizadosProceso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePagosAutorizadosProceso.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePagosAutorizadosProceso.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPagosAutorizadosProceso.setText("Accion");
		this.jComboBoxTiposAccionesPagosAutorizadosProceso.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPagosAutorizadosProceso = new JLabelMe();
		
		this.jLabelAccionesPagosAutorizadosProceso.setText("Acciones");		
		this.jLabelAccionesPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPagosAutorizadosProceso();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPagosAutorizadosProceso();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPagosAutorizadosProceso=new JTabbedPane();
		this.jTabbedPaneRelacionesPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPagosAutorizadosProceso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutorizadosProceso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutorizadosProceso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPagosAutorizadosProceso = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPagosAutorizadosProceso = new GridBagLayout();
		
		this.jPanelCamposPagosAutorizadosProceso.setLayout(gridaBagLayoutCamposPagosAutorizadosProceso);
		this.jPanelCamposOcultosPagosAutorizadosProceso.setLayout(gridaBagLayoutCamposOcultosPagosAutorizadosProceso);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPagosAutorizadosProceso.add(jLabelIdPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPagosAutorizadosProceso.add(jLabelidPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPagosAutorizadosProceso.add(jLabelid_empresaPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPagosAutorizadosProceso.add(jButtonid_empresaPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 3;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPagosAutorizadosProceso.add(jButtonid_empresaPagosAutorizadosProcesoUpdate, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPagosAutorizadosProceso.add(jComboBoxid_empresaPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPagosAutorizadosProceso.add(jLabelid_sucursalPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPagosAutorizadosProceso.add(jButtonid_sucursalPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 3;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPagosAutorizadosProceso.add(jButtonid_sucursalPagosAutorizadosProcesoUpdate, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPagosAutorizadosProceso.add(jComboBoxid_sucursalPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPagosAutorizadosProceso.add(jLabelid_ejercicioPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPagosAutorizadosProceso.add(jButtonid_ejercicioPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 3;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPagosAutorizadosProceso.add(jButtonid_ejercicioPagosAutorizadosProcesoUpdate, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPagosAutorizadosProceso.add(jComboBoxid_ejercicioPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_documentoPagosAutorizadosProceso.add(jLabelnombre_tipo_documentoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_documentoPagosAutorizadosProceso.add(jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_documentoPagosAutorizadosProceso.add(jscrollPanenombre_tipo_documentoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPagosAutorizadosProceso.add(jLabelcodigoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPagosAutorizadosProceso.add(jButtoncodigoPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPagosAutorizadosProceso.add(jTextFieldcodigoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiarioPagosAutorizadosProceso.add(jLabelbeneficiarioPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioPagosAutorizadosProceso.add(jButtonbeneficiarioPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiarioPagosAutorizadosProceso.add(jscrollPanebeneficiarioPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPagosAutorizadosProceso.add(jLabelfechaPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPagosAutorizadosProceso.add(jButtonfechaPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPagosAutorizadosProceso.add(jDateChooserfechaPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPagosAutorizadosProceso.add(jLabelfecha_emisionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPagosAutorizadosProceso.add(jButtonfecha_emisionPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPagosAutorizadosProceso.add(jDateChooserfecha_emisionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.add(jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.add(jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.add(jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorPagosAutorizadosProceso.add(jLabelnumero_mayorPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorPagosAutorizadosProceso.add(jButtonnumero_mayorPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorPagosAutorizadosProceso.add(jscrollPanenumero_mayorPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPagosAutorizadosProceso.add(jLabelvalorPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPagosAutorizadosProceso.add(jButtonvalorPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPagosAutorizadosProceso.add(jTextFieldvalorPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuenta_bancoPagosAutorizadosProceso.add(jLabelcodigo_cuenta_bancoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuenta_bancoPagosAutorizadosProceso.add(jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuenta_bancoPagosAutorizadosProceso.add(jscrollPanecodigo_cuenta_bancoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequePagosAutorizadosProceso.add(jLabelnumero_chequePagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequePagosAutorizadosProceso.add(jButtonnumero_chequePagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequePagosAutorizadosProceso.add(jTextFieldnumero_chequePagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.add(jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 2;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.add(jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda, this.gridBagConstraintsPagosAutorizadosProceso);
	}

	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.add(jscrollPanebeneficiario_detalle_cheque_giradoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelidPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelnombre_tipo_documentoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelcodigoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelbeneficiarioPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelfechaPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelfecha_emisionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelnumero_mayorPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelvalorPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelcodigo_cuenta_bancoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelnumero_chequePagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizadosProceso.add(this.jPanelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposPagosAutorizadosProceso % 2==0) {
		iXPanelCamposPagosAutorizadosProceso=0;
		iYPanelCamposPagosAutorizadosProceso++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposOcultosPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposOcultosPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPagosAutorizadosProceso.add(this.jPanelid_empresaPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposOcultosPagosAutorizadosProceso % 2==0) {
		iXPanelCamposOcultosPagosAutorizadosProceso=0;
		iYPanelCamposOcultosPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposOcultosPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposOcultosPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPagosAutorizadosProceso.add(this.jPanelid_sucursalPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposOcultosPagosAutorizadosProceso % 2==0) {
		iXPanelCamposOcultosPagosAutorizadosProceso=0;
		iYPanelCamposOcultosPagosAutorizadosProceso++;
	}
	this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizadosProceso.gridy = iYPanelCamposOcultosPagosAutorizadosProceso;
	this.gridBagConstraintsPagosAutorizadosProceso.gridx = iXPanelCamposOcultosPagosAutorizadosProceso++;
	this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizadosProceso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPagosAutorizadosProceso.add(this.jPanelid_ejercicioPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);



	if(iXPanelCamposOcultosPagosAutorizadosProceso % 2==0) {
		iXPanelCamposOcultosPagosAutorizadosProceso=0;
		iYPanelCamposOcultosPagosAutorizadosProceso++;
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
			
		GridBagLayout gridaBagLayoutAccionesPagosAutorizadosProceso= new GridBagLayout();
		this.jPanelAccionesPagosAutorizadosProceso.setLayout(gridaBagLayoutAccionesPagosAutorizadosProceso);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPagosAutorizadosProceso= new GridBagLayout();
		this.jPanelAccionesFormularioPagosAutorizadosProceso.setLayout(gridaBagLayoutAccionesFormularioPagosAutorizadosProceso);
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPagosAutorizadosProceso.add(this.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccion++;
			
		this.jPanelAccionesPagosAutorizadosProceso.add(this.jButtonModificarPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);							

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx =iPosXAccion++;
			
		this.jPanelAccionesPagosAutorizadosProceso.add(this.jButtonEliminarPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
			
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccion++;
		
		this.jPanelAccionesPagosAutorizadosProceso.add(this.jButtonActualizarPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccion++;
		
		this.jPanelAccionesPagosAutorizadosProceso.add(this.jButtonGuardarCambiosPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);	
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx =iPosXAccion++;
		
		this.jPanelAccionesPagosAutorizadosProceso.add(this.jButtonCancelarPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPagosAutorizadosProceso);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();						
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;		
			//this.gridBagConstraintsPagosAutorizadosProceso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx =0;
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPagosAutorizadosProceso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PagosAutorizadosProcesoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePagosAutorizadosProceso = new PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pagos Autorizados Proceso DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pagos Autorizados Proceso DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pagos Autorizados Proceso Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PagosAutorizadosProcesoModel pagosautorizadosprocesoModel=new PagosAutorizadosProcesoModel(this);
			
			//SI USARA CLASE INTERNA
			//PagosAutorizadosProcesoModel.PagosAutorizadosProcesoFocusTraversalPolicy pagosautorizadosprocesoFocusTraversalPolicy = pagosautorizadosprocesoModel.new PagosAutorizadosProcesoFocusTraversalPolicy(this);
			
			//pagosautorizadosprocesoFocusTraversalPolicy.setpagosautorizadosprocesoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pagosautorizadosprocesoModel);
			
			
			this.jContentPaneDetallePagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePagosAutorizadosProceso = new GridBagLayout();	
			this.jContentPaneDetallePagosAutorizadosProceso.setLayout(gridaBagLayoutDetallePagosAutorizadosProceso);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPagosAutorizadosProceso = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
				this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
					
				
				this.jContentPaneDetallePagosAutorizadosProceso.add(jTtoolBarDetallePagosAutorizadosProceso, gridBagConstraintsPagosAutorizadosProceso);								
				
}
			
			this.jScrollPanelDatosEdicionPagosAutorizadosProceso=   new JScrollPane(jContentPaneDetallePagosAutorizadosProceso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPagosAutorizadosProceso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	        
			this.jContentPaneDetallePagosAutorizadosProceso.add(jPanelCamposPagosAutorizadosProceso, gridBagConstraintsPagosAutorizadosProceso);
			
			
			
			
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
						//&& pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPagosAutorizadosProceso= new GridBagConstraints();
						this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
						this.jContentPaneDetallePagosAutorizadosProceso.add(this.jTabbedPaneRelacionesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPagosAutorizadosProceso.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPagosAutorizadosProceso.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
					this.gridBagConstraintsPagosAutorizadosProceso.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
					
				
					this.jContentPaneDetallePagosAutorizadosProceso.add(jPanelCamposOcultosPagosAutorizadosProceso, gridBagConstraintsPagosAutorizadosProceso);
				
					this.jPanelCamposOcultosPagosAutorizadosProceso.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	        this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePagosAutorizadosProceso.add(this.jPanelAccionesFormularioPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);							
			
			
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
	        this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
	        
			
			this.jContentPaneDetallePagosAutorizadosProceso.add(this.jPanelAccionesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPagosAutorizadosProceso);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPagosAutorizadosProceso=   new JScrollPane(this.jPanelCamposPagosAutorizadosProceso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPagosAutorizadosProceso.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);			
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			
			
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
			
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPagosAutorizadosProceso;//jContentPane;
		
		return jScrollPanelDatosEdicionPagosAutorizadosProceso;
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
