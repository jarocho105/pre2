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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ListadosFormasPagosConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ListadosFormasPagosDetalleFormJInternalFrame extends ListadosFormasPagosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleListadosFormasPagos;
	
	protected JMenuBar jmenuBarDetalleListadosFormasPagos;
	
	protected JMenu jmenuDetalleListadosFormasPagos;
	protected JMenu jmenuDetalleArchivoListadosFormasPagos;
	protected JMenu jmenuDetalleAccionesListadosFormasPagos;
	protected JMenu jmenuDetalleDatosListadosFormasPagos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadosFormasPagos;	
	protected GridBagConstraints gridBagConstraintsListadosFormasPagos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ListadosFormasPagosBeanSwingJInternalFrameAdditional jInternalFrameDetalleListadosFormasPagos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoGrupoFormaPagoBeanSwingJInternalFrame tipogrupoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoformapago="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public ListadosFormasPagosSessionBean listadosformaspagosSessionBean;
	
	
	
	
	public TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public ListadosFormasPagosLogic listadosformaspagosLogic;
	
	public JScrollPane jScrollPanelDatosListadosFormasPagos;
	public JScrollPane jScrollPanelDatosEdicionListadosFormasPagos;
	public JScrollPane jScrollPanelDatosGeneralListadosFormasPagos;
	
	protected JPanel jPanelCamposListadosFormasPagos;    
	protected JPanel jPanelCamposOcultosListadosFormasPagos;    	
	protected JPanel jPanelAccionesListadosFormasPagos;
	protected JPanel jPanelAccionesFormularioListadosFormasPagos;
    
	
	
	protected Integer iXPanelCamposListadosFormasPagos=0;
	protected Integer iYPanelCamposListadosFormasPagos=0;
	
	protected Integer iXPanelCamposOcultosListadosFormasPagos=0;
	protected Integer iYPanelCamposOcultosListadosFormasPagos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoListadosFormasPagos;
	public JButton jButtonModificarListadosFormasPagos;
	public JButton jButtonActualizarListadosFormasPagos;
    public JButton jButtonEliminarListadosFormasPagos;
	public JButton jButtonCancelarListadosFormasPagos;
    public JButton jButtonGuardarCambiosListadosFormasPagos;
	public JButton jButtonGuardarCambiosTablaListadosFormasPagos;
	protected JButton jButtonCerrarListadosFormasPagos;
	
	
	protected JButton jButtonProcesarInformacionListadosFormasPagos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoListadosFormasPagos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarListadosFormasPagos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeListadosFormasPagos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadosFormasPagos;
	protected JButton jButtonModificarToolBarListadosFormasPagos;
	protected JButton jButtonActualizarToolBarListadosFormasPagos;
    protected JButton jButtonEliminarToolBarListadosFormasPagos;
	protected JButton jButtonCancelarToolBarListadosFormasPagos;
    protected JButton jButtonGuardarCambiosToolBarListadosFormasPagos;
	protected JButton jButtonGuardarCambiosTablaToolBarListadosFormasPagos;
	protected JButton jButtonMostrarOcultarTablaToolBarListadosFormasPagos;
	protected JButton jButtonCerrarToolBarListadosFormasPagos;
	
	protected JButton jButtonProcesarInformacionToolBarListadosFormasPagos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadosFormasPagos;
	protected JMenuItem jMenuItemModificarListadosFormasPagos;
	protected JMenuItem jMenuItemActualizarListadosFormasPagos;
    protected JMenuItem jMenuItemEliminarListadosFormasPagos;
	protected JMenuItem jMenuItemCancelarListadosFormasPagos;
    protected JMenuItem jMenuItemGuardarCambiosListadosFormasPagos;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadosFormasPagos;
	protected JMenuItem jMenuItemCerrarListadosFormasPagos;
	protected JMenuItem jMenuItemDetalleCerrarListadosFormasPagos;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadosFormasPagos;
	
	protected JMenuItem jMenuItemProcesarInformacionListadosFormasPagos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadosFormasPagos;
	protected JMenuItem jMenuItemMostrarOcultarListadosFormasPagos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadosFormasPagos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadosFormasPagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadosFormasPagos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioListadosFormasPagos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidListadosFormasPagos;
	public JLabel jLabelIdListadosFormasPagos;
	public JLabel jLabelidListadosFormasPagos;
	public JButton jButtonidListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeListadosFormasPagos;
	public JLabel jLabelfecha_desdeListadosFormasPagos;
	//public JFormattedTextField jDateChooserfecha_desdeListadosFormasPagos;

	public JDateChooser jDateChooserfecha_desdeListadosFormasPagos;
	public JButton jButtonfecha_desdeListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaListadosFormasPagos;
	public JLabel jLabelfecha_hastaListadosFormasPagos;
	//public JFormattedTextField jDateChooserfecha_hastaListadosFormasPagos;

	public JDateChooser jDateChooserfecha_hastaListadosFormasPagos;
	public JButton jButtonfecha_hastaListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoListadosFormasPagos;
	public JLabel jLabelcodigoListadosFormasPagos;
	public JTextField jTextFieldcodigoListadosFormasPagos;
	public JButton jButtoncodigoListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoListadosFormasPagos;
	public JLabel jLabelnombre_completoListadosFormasPagos;
	public JTextArea jTextAreanombre_completoListadosFormasPagos;
	public JScrollPane jscrollPanenombre_completoListadosFormasPagos;
	public JButton jButtonnombre_completoListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_tipo_cuenta_banco_globalListadosFormasPagos;
	public JLabel jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos;
	public JTextField jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos;
	public JButton jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaListadosFormasPagos;
	public JLabel jLabelnumero_cuentaListadosFormasPagos;
	public JTextField jTextFieldnumero_cuentaListadosFormasPagos;
	public JButton jButtonnumero_cuentaListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_estado_anti_clienteListadosFormasPagos;
	public JLabel jLabelcodigo_estado_anti_clienteListadosFormasPagos;
	public JTextField jTextFieldcodigo_estado_anti_clienteListadosFormasPagos;
	public JButton jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelfechaListadosFormasPagos;
	public JLabel jLabelfechaListadosFormasPagos;
	//public JFormattedTextField jDateChooserfechaListadosFormasPagos;

	public JDateChooser jDateChooserfechaListadosFormasPagos;
	public JButton jButtonfechaListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelvalorListadosFormasPagos;
	public JLabel jLabelvalorListadosFormasPagos;
	public JTextField jTextFieldvalorListadosFormasPagos;
	public JButton jButtonvalorListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelvalor_adicionalListadosFormasPagos;
	public JLabel jLabelvalor_adicionalListadosFormasPagos;
	public JTextField jTextFieldvalor_adicionalListadosFormasPagos;
	public JButton jButtonvalor_adicionalListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_grupo_forma_pagoListadosFormasPagos;
	public JLabel jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos;
	public JTextArea jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos;
	public JScrollPane jscrollPanenombre_tipo_grupo_forma_pagoListadosFormasPagos;
	public JButton jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPaneltotalListadosFormasPagos;
	public JLabel jLabeltotalListadosFormasPagos;
	public JTextField jTextFieldtotalListadosFormasPagos;
	public JButton jButtontotalListadosFormasPagosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_grupo_forma_pagoListadosFormasPagos;
	public JLabel jLabelid_tipo_grupo_forma_pagoListadosFormasPagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos;
	public JButton jButtonid_tipo_grupo_forma_pagoListadosFormasPagos= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaListadosFormasPagos;
	public JLabel jLabelid_empresaListadosFormasPagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaListadosFormasPagos;
	public JButton jButtonid_empresaListadosFormasPagos= new JButtonMe();
	public JButton jButtonid_empresaListadosFormasPagosUpdate= new JButtonMe();
	public JButton jButtonid_empresaListadosFormasPagosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalListadosFormasPagos;
	public JLabel jLabelid_sucursalListadosFormasPagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalListadosFormasPagos;
	public JButton jButtonid_sucursalListadosFormasPagos= new JButtonMe();
	public JButton jButtonid_sucursalListadosFormasPagosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalListadosFormasPagosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesListadosFormasPagos;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ListadosFormasPagosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposListadosFormasPagos=new JPanel();
				this.jPanelAccionesFormularioListadosFormasPagos=new JPanel();
				this.jmenuBarDetalleListadosFormasPagos=new JMenuBar();
				this.jTtoolBarDetalleListadosFormasPagos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosFormasPagosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ListadosFormasPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ListadosFormasPagosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ListadosFormasPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosFormasPagosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosFormasPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosFormasPagosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosFormasPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosFormasPagosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadosFormasPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarListadosFormasPagos() {
		return this.jButtonActualizarToolBarListadosFormasPagos;
	}
	
	public JButton getjButtonEliminarToolBarListadosFormasPagos() {
		return this.jButtonEliminarToolBarListadosFormasPagos;
	}
	
	public JButton getjButtonCancelarToolBarListadosFormasPagos() {
		return this.jButtonCancelarToolBarListadosFormasPagos;
	}		
	
	public JButton getjButtonProcesarInformacionListadosFormasPagos() {
		return this.jButtonProcesarInformacionListadosFormasPagos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadosFormasPagos)	{
		this.jButtonProcesarInformacionListadosFormasPagos = jButtonProcesarInformacionListadosFormasPagos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadosFormasPagos() {
		return this.jComboBoxTiposAccionesListadosFormasPagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadosFormasPagos(
			JComboBox jComboBoxTiposRelacionesListadosFormasPagos) {
		this.jComboBoxTiposRelacionesListadosFormasPagos = jComboBoxTiposRelacionesListadosFormasPagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadosFormasPagos(
			JComboBox jComboBoxTiposAccionesListadosFormasPagos) {
		this.jComboBoxTiposAccionesListadosFormasPagos = jComboBoxTiposAccionesListadosFormasPagos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioListadosFormasPagos() {
		return this.jComboBoxTiposAccionesFormularioListadosFormasPagos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioListadosFormasPagos(
			JComboBox jComboBoxTiposAccionesFormularioListadosFormasPagos) {
		this.jComboBoxTiposAccionesFormularioListadosFormasPagos = jComboBoxTiposAccionesFormularioListadosFormasPagos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.listadosformaspagosSessionBean=new ListadosFormasPagosSessionBean();
		
		this.listadosformaspagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadosformaspagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadosformaspagosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadosFormasPagosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadosFormasPagosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadosFormasPagosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listados Formas Pagos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
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
	
		ListadosFormasPagosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleListadosFormasPagos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarListadosFormasPagos=new JButtonMe();
				this.jButtonModificarToolBarListadosFormasPagos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarListadosFormasPagos,this.jTtoolBarDetalleListadosFormasPagos,
							"actualizar","actualizar","Actualizar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarListadosFormasPagos,this.jTtoolBarDetalleListadosFormasPagos,
							"eliminar","eliminar","Eliminar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarListadosFormasPagos,this.jTtoolBarDetalleListadosFormasPagos,
							"cancelar","cancelar","Cancelar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarListadosFormasPagos,this.jTtoolBarDetalleListadosFormasPagos,
							"guardarcambios","guardarcambios","Guardar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleListadosFormasPagos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleListadosFormasPagos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoListadosFormasPagos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesListadosFormasPagos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosListadosFormasPagos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadosFormasPagos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadosFormasPagos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadosFormasPagos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarListadosFormasPagos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarListadosFormasPagos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarListadosFormasPagos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarListadosFormasPagos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarListadosFormasPagos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarListadosFormasPagos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarListadosFormasPagos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarListadosFormasPagos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarListadosFormasPagos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarListadosFormasPagos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarListadosFormasPagos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarListadosFormasPagos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosListadosFormasPagos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadosFormasPagos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadosFormasPagos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadosFormasPagos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadosFormasPagos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadosFormasPagos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarListadosFormasPagos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarListadosFormasPagos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarListadosFormasPagos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadosFormasPagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadosFormasPagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadosFormasPagos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadosFormasPagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadosFormasPagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadosFormasPagos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoListadosFormasPagos.add(this.jMenuItemDetalleCerrarListadosFormasPagos);
		
		this.jmenuDetalleAccionesListadosFormasPagos.add(this.jMenuItemActualizarListadosFormasPagos);
		this.jmenuDetalleAccionesListadosFormasPagos.add(this.jMenuItemEliminarListadosFormasPagos);
		this.jmenuDetalleAccionesListadosFormasPagos.add(this.jMenuItemCancelarListadosFormasPagos);		
		
		//this.jmenuDetalleDatosListadosFormasPagos.add(this.jMenuItemDetalleAbrirOrderByListadosFormasPagos);				
		this.jmenuDetalleDatosListadosFormasPagos.add(this.jMenuItemDetalleMostarOcultarListadosFormasPagos);				
				
		//this.jmenuDetalleAccionesListadosFormasPagos.add(this.jMenuItemGuardarCambiosListadosFormasPagos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleListadosFormasPagos.add(this.jmenuDetalleArchivoListadosFormasPagos);		
		this.jmenuBarDetalleListadosFormasPagos.add(this.jmenuDetalleAccionesListadosFormasPagos);		
		this.jmenuBarDetalleListadosFormasPagos.add(this.jmenuDetalleDatosListadosFormasPagos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleListadosFormasPagos);				
	}
	
	
	public void inicializarElementosCamposListadosFormasPagos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdListadosFormasPagos = new JLabelMe();
		jLabelIdListadosFormasPagos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidListadosFormasPagos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutListadosFormasPagos= new GridBagLayout();

		this.jPanelidListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);

		jLabelidListadosFormasPagos = new JLabel();
		jLabelidListadosFormasPagos.setText("Id");

		jLabelidListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeListadosFormasPagos = new JLabelMe();
		this.jLabelfecha_desdeListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeListadosFormasPagos.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelfecha_desdeListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		//jFormattedTextFieldfecha_desdeListadosFormasPagos= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeListadosFormasPagos= new JDateChooser();
		jDateChooserfecha_desdeListadosFormasPagos.setEnabled(false);
		jDateChooserfecha_desdeListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeListadosFormasPagos.setDate(new Date());
		jDateChooserfecha_desdeListadosFormasPagos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeListadosFormasPagos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtonfecha_desdeListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeListadosFormasPagosBusqueda.setText("U");
		this.jButtonfecha_desdeListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeListadosFormasPagosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaListadosFormasPagos = new JLabelMe();
		this.jLabelfecha_hastaListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaListadosFormasPagos.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelfecha_hastaListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		//jFormattedTextFieldfecha_hastaListadosFormasPagos= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaListadosFormasPagos= new JDateChooser();
		jDateChooserfecha_hastaListadosFormasPagos.setEnabled(false);
		jDateChooserfecha_hastaListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaListadosFormasPagos.setDate(new Date());
		jDateChooserfecha_hastaListadosFormasPagos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaListadosFormasPagos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtonfecha_hastaListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaListadosFormasPagosBusqueda.setText("U");
		this.jButtonfecha_hastaListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaListadosFormasPagosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoListadosFormasPagos = new JLabelMe();
		this.jLabelcodigoListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoListadosFormasPagos.setToolTipText("Codigo");
		this.jLabelcodigoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelcodigoListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jTextFieldcodigoListadosFormasPagos= new JTextFieldMe();

		jTextFieldcodigoListadosFormasPagos.setEnabled(false);
		jTextFieldcodigoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtoncodigoListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoListadosFormasPagosBusqueda.setText("U");
		this.jButtoncodigoListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoListadosFormasPagosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoListadosFormasPagos = new JLabelMe();
		this.jLabelnombre_completoListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoListadosFormasPagos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelnombre_completoListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jTextAreanombre_completoListadosFormasPagos= new JTextAreaMe();
		jTextAreanombre_completoListadosFormasPagos.setEnabled(false);
		jTextAreanombre_completoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoListadosFormasPagos.setLineWrap(true);
		jTextAreanombre_completoListadosFormasPagos.setWrapStyleWord(true);
		jTextAreanombre_completoListadosFormasPagos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoListadosFormasPagos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoListadosFormasPagos = new JScrollPane(jTextAreanombre_completoListadosFormasPagos);
		jscrollPanenombre_completoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_completoListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtonnombre_completoListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoListadosFormasPagosBusqueda.setText("U");
		this.jButtonnombre_completoListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoListadosFormasPagosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos = new JLabelMe();
		this.jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL+" : *");
		this.jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setToolTipText("Codigo Tipo Cuenta Banco Global");
		this.jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_tipo_cuenta_banco_globalListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos= new JTextFieldMe();

		jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setEnabled(false);
		jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda.setText("U");
		this.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaListadosFormasPagos = new JLabelMe();
		this.jLabelnumero_cuentaListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaListadosFormasPagos.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelnumero_cuentaListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jTextFieldnumero_cuentaListadosFormasPagos= new JTextFieldMe();

		jTextFieldnumero_cuentaListadosFormasPagos.setEnabled(false);
		jTextFieldnumero_cuentaListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaListadosFormasPagosBusqueda.setText("U");
		this.jButtonnumero_cuentaListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaListadosFormasPagosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_estado_anti_clienteListadosFormasPagos = new JLabelMe();
		this.jLabelcodigo_estado_anti_clienteListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE+" : *");
		this.jLabelcodigo_estado_anti_clienteListadosFormasPagos.setToolTipText("Codigo Estado Anti Cliente");
		this.jLabelcodigo_estado_anti_clienteListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_estado_anti_clienteListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_estado_anti_clienteListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_estado_anti_clienteListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_estado_anti_clienteListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_estado_anti_clienteListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelcodigo_estado_anti_clienteListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jTextFieldcodigo_estado_anti_clienteListadosFormasPagos= new JTextFieldMe();

		jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.setEnabled(false);
		jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_estado_anti_clienteListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda.setText("U");
		this.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_estado_anti_clienteListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda.setVisible(false);		}


					
		this.jLabelfechaListadosFormasPagos = new JLabelMe();
		this.jLabelfechaListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaListadosFormasPagos.setToolTipText("Fecha");
		this.jLabelfechaListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelfechaListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		//jFormattedTextFieldfechaListadosFormasPagos= new JFormattedTextFieldMe();

		jDateChooserfechaListadosFormasPagos= new JDateChooser();
		jDateChooserfechaListadosFormasPagos.setEnabled(false);
		jDateChooserfechaListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaListadosFormasPagos.setDate(new Date());
		jDateChooserfechaListadosFormasPagos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaListadosFormasPagos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtonfechaListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaListadosFormasPagosBusqueda.setText("U");
		this.jButtonfechaListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaListadosFormasPagosBusqueda.setVisible(false);		}


					
		this.jLabelvalorListadosFormasPagos = new JLabelMe();
		this.jLabelvalorListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorListadosFormasPagos.setToolTipText("Valor");
		this.jLabelvalorListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelvalorListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jTextFieldvalorListadosFormasPagos= new JTextFieldMe();
		jTextFieldvalorListadosFormasPagos.setEnabled(false);
		jTextFieldvalorListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorListadosFormasPagos.setText("0.0");

		this.jButtonvalorListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtonvalorListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorListadosFormasPagosBusqueda.setText("U");
		this.jButtonvalorListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorListadosFormasPagosBusqueda.setVisible(false);		}


					
		this.jLabelvalor_adicionalListadosFormasPagos = new JLabelMe();
		this.jLabelvalor_adicionalListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL+" : *");
		this.jLabelvalor_adicionalListadosFormasPagos.setToolTipText("Valor Adicional");
		this.jLabelvalor_adicionalListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_adicionalListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_adicionalListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_adicionalListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_adicionalListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_adicionalListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelvalor_adicionalListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jTextFieldvalor_adicionalListadosFormasPagos= new JTextFieldMe();
		jTextFieldvalor_adicionalListadosFormasPagos.setEnabled(false);
		jTextFieldvalor_adicionalListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_adicionalListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_adicionalListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_adicionalListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_adicionalListadosFormasPagos.setText("0.0");

		this.jButtonvalor_adicionalListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtonvalor_adicionalListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_adicionalListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_adicionalListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_adicionalListadosFormasPagosBusqueda.setText("U");
		this.jButtonvalor_adicionalListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_adicionalListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_adicionalListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_adicionalListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_adicionalListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_adicionalListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_adicionalListadosFormasPagosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos = new JLabelMe();
		this.jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO+" : *");
		this.jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos.setToolTipText("Nombre Tipo Grupo Forma Pago");
		this.jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_grupo_forma_pagoListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_grupo_forma_pagoListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelnombre_tipo_grupo_forma_pagoListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos= new JTextAreaMe();
		jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setEnabled(false);
		jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setLineWrap(true);
		jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setWrapStyleWord(true);
		jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_grupo_forma_pagoListadosFormasPagos = new JScrollPane(jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos);
		jscrollPanenombre_tipo_grupo_forma_pagoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_grupo_forma_pagoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_grupo_forma_pagoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setText("U");
		this.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setVisible(false);		}


					
		this.jLabeltotalListadosFormasPagos = new JLabelMe();
		this.jLabeltotalListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalListadosFormasPagos.setToolTipText("Total");
		this.jLabeltotalListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPaneltotalListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jTextFieldtotalListadosFormasPagos= new JTextFieldMe();
		jTextFieldtotalListadosFormasPagos.setEnabled(false);
		jTextFieldtotalListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalListadosFormasPagos.setText("0.0");

		this.jButtontotalListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtontotalListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalListadosFormasPagosBusqueda.setText("U");
		this.jButtontotalListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalListadosFormasPagosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysListadosFormasPagos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_grupo_forma_pagoListadosFormasPagos = new JLabelMe();
		this.jLabelid_tipo_grupo_forma_pagoListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO+" : *");
		this.jLabelid_tipo_grupo_forma_pagoListadosFormasPagos.setToolTipText("Tipo Grupo Forma Pago");
		this.jLabelid_tipo_grupo_forma_pagoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_forma_pagoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_forma_pagoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_forma_pagoListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_grupo_forma_pagoListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_grupo_forma_pagoListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelid_tipo_grupo_forma_pagoListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos= new JComboBoxMe();
		jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagos= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagos.setText("Buscar");
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoListadosFormasPagos"));

		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setText("U");
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate.setText("U");
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoListadosFormasPagosUpdate"));



					
		this.jLabelid_empresaListadosFormasPagos = new JLabelMe();
		this.jLabelid_empresaListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaListadosFormasPagos.setToolTipText("Empresa");
		this.jLabelid_empresaListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelid_empresaListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jComboBoxid_empresaListadosFormasPagos= new JComboBoxMe();
		jComboBoxid_empresaListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaListadosFormasPagos.setEnabled(false);

		this.jButtonid_empresaListadosFormasPagos= new JButtonMe();
		this.jButtonid_empresaListadosFormasPagos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosFormasPagos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosFormasPagos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosFormasPagos.setText("Buscar");
		this.jButtonid_empresaListadosFormasPagos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaListadosFormasPagos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosFormasPagos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosFormasPagos"));

		this.jButtonid_empresaListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtonid_empresaListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadosFormasPagosBusqueda.setText("U");
		this.jButtonid_empresaListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaListadosFormasPagosBusqueda.setVisible(false);		}

		this.jButtonid_empresaListadosFormasPagosUpdate= new JButtonMe();
		this.jButtonid_empresaListadosFormasPagosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosFormasPagosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosFormasPagosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadosFormasPagosUpdate.setText("U");
		this.jButtonid_empresaListadosFormasPagosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaListadosFormasPagosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosFormasPagosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosFormasPagosUpdate"));



					
		this.jLabelid_sucursalListadosFormasPagos = new JLabelMe();
		this.jLabelid_sucursalListadosFormasPagos.setText(""+ListadosFormasPagosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalListadosFormasPagos.setToolTipText("Sucursal");
		this.jLabelid_sucursalListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalListadosFormasPagos.setToolTipText(ListadosFormasPagosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		this.jPanelid_sucursalListadosFormasPagos.setLayout(this.gridaBagLayoutListadosFormasPagos);


		jComboBoxid_sucursalListadosFormasPagos= new JComboBoxMe();
		jComboBoxid_sucursalListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalListadosFormasPagos.setEnabled(false);

		this.jButtonid_sucursalListadosFormasPagos= new JButtonMe();
		this.jButtonid_sucursalListadosFormasPagos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalListadosFormasPagos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalListadosFormasPagos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalListadosFormasPagos.setText("Buscar");
		this.jButtonid_sucursalListadosFormasPagos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalListadosFormasPagos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalListadosFormasPagos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalListadosFormasPagos"));

		this.jButtonid_sucursalListadosFormasPagosBusqueda= new JButtonMe();
		this.jButtonid_sucursalListadosFormasPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalListadosFormasPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalListadosFormasPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalListadosFormasPagosBusqueda.setText("U");
		this.jButtonid_sucursalListadosFormasPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalListadosFormasPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalListadosFormasPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalListadosFormasPagosBusqueda"));

		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalListadosFormasPagosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalListadosFormasPagosUpdate= new JButtonMe();
		this.jButtonid_sucursalListadosFormasPagosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalListadosFormasPagosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalListadosFormasPagosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalListadosFormasPagosUpdate.setText("U");
		this.jButtonid_sucursalListadosFormasPagosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalListadosFormasPagosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalListadosFormasPagosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalListadosFormasPagosUpdate"));



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
		//this.jInternalFrameDetalleListadosFormasPagos = new ListadosFormasPagosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Listados Formas Pagos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadosFormasPagos= new GridBagLayout();
		

		
		String sToolTipListadosFormasPagos="";
		sToolTipListadosFormasPagos=ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadosFormasPagos+="(Nomina.ListadosFormasPagos)";
		}
		
		if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadosFormasPagos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoListadosFormasPagos = new JButtonMe();
		this.jButtonModificarListadosFormasPagos = new JButtonMe();
        this.jButtonActualizarListadosFormasPagos = new JButtonMe();
        this.jButtonEliminarListadosFormasPagos = new JButtonMe();
        this.jButtonCancelarListadosFormasPagos = new JButtonMe();
        this.jButtonGuardarCambiosListadosFormasPagos = new JButtonMe();
		this.jButtonGuardarCambiosTablaListadosFormasPagos = new JButtonMe();
		this.jButtonCerrarListadosFormasPagos = new JButtonMe();
		
		this.jScrollPanelDatosListadosFormasPagos = new JScrollPane();   
        this.jScrollPanelDatosEdicionListadosFormasPagos = new JScrollPane();
		this.jScrollPanelDatosGeneralListadosFormasPagos = new JScrollPane();
				
		
		
		this.jPanelCamposListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Listados Formas Pagos";
		
		if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Formas Pagoses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadosFormasPagos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposListadosFormasPagos.setName("jPanelCamposListadosFormasPagos"); 

		this.jPanelCamposOcultosListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosListadosFormasPagos.setName("jPanelCamposOcultosListadosFormasPagos"); 

        this.jPanelAccionesListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadosFormasPagos.setToolTipText("Acciones");
        this.jPanelAccionesListadosFormasPagos.setName("Acciones"); 

		this.jPanelAccionesFormularioListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioListadosFormasPagos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioListadosFormasPagos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoListadosFormasPagos.setText("Nuevo");
		this.jButtonModificarListadosFormasPagos.setText("Editar");
        this.jButtonActualizarListadosFormasPagos.setText("Actualizar");
        this.jButtonEliminarListadosFormasPagos.setText("Eliminar");
        this.jButtonCancelarListadosFormasPagos.setText("Cancelar");
        this.jButtonGuardarCambiosListadosFormasPagos.setText("Guardar");
		this.jButtonGuardarCambiosTablaListadosFormasPagos.setText("Guardar");
		this.jButtonCerrarListadosFormasPagos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadosFormasPagos,"nuevo_button","Nuevo",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarListadosFormasPagos,"modificar_button","Editar",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarListadosFormasPagos,"actualizar_button","Actualizar",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarListadosFormasPagos,"eliminar_button","Eliminar",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarListadosFormasPagos,"cancelar_button","Cancelar",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosListadosFormasPagos,"guardarcambios_button","Guardar",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadosFormasPagos,"guardarcambiostabla_button","Guardar",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadosFormasPagos,"cerrar_button","Salir",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoListadosFormasPagos.setToolTipText("Nuevo"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarListadosFormasPagos.setToolTipText("Editar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarListadosFormasPagos.setToolTipText("Actualizar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarListadosFormasPagos.setToolTipText("Eliminar)"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarListadosFormasPagos.setToolTipText("Cancelar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosListadosFormasPagos.setToolTipText("Guardar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaListadosFormasPagos.setToolTipText("Guardar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadosFormasPagos.setToolTipText("Salir"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadosFormasPagos";
		inputMap = this.jButtonNuevoListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadosFormasPagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadosFormasPagos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarListadosFormasPagos";
		inputMap = this.jButtonActualizarListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarListadosFormasPagos"));
		
		//ELIMINAR
		sMapKey = "EliminarListadosFormasPagos";
		inputMap = this.jButtonEliminarListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarListadosFormasPagos"));
		
		//CANCELAR	
		sMapKey = "CancelarListadosFormasPagos";
		inputMap = this.jButtonCancelarListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarListadosFormasPagos"));
		
		//CERRAR		
		sMapKey = "CerrarListadosFormasPagos";
		inputMap = this.jButtonCerrarListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadosFormasPagos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadosFormasPagos";
		inputMap = this.jButtonGuardarCambiosTablaListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadosFormasPagos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoListadosFormasPagos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoListadosFormasPagos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoListadosFormasPagos.setToolTipText("Nuevo ListadosFormasPagos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarListadosFormasPagos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarListadosFormasPagos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarListadosFormasPagos.setToolTipText("Sin Cerrar Ventana ListadosFormasPagos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeListadosFormasPagos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeListadosFormasPagos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeListadosFormasPagos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadosFormasPagos.setText("Accion");
		this.jComboBoxTiposAccionesListadosFormasPagos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioListadosFormasPagos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioListadosFormasPagos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesListadosFormasPagos = new JLabelMe();
		
		this.jLabelAccionesListadosFormasPagos.setText("Acciones");		
		this.jLabelAccionesListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposListadosFormasPagos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysListadosFormasPagos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesListadosFormasPagos=new JTabbedPane();
		this.jTabbedPaneRelacionesListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesListadosFormasPagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosFormasPagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosFormasPagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioListadosFormasPagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadosFormasPagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadosFormasPagos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposListadosFormasPagos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosListadosFormasPagos = new GridBagLayout();
		
		this.jPanelCamposListadosFormasPagos.setLayout(gridaBagLayoutCamposListadosFormasPagos);
		this.jPanelCamposOcultosListadosFormasPagos.setLayout(gridaBagLayoutCamposOcultosListadosFormasPagos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidListadosFormasPagos.add(jLabelIdListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidListadosFormasPagos.add(jLabelidListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_grupo_forma_pagoListadosFormasPagos.add(jLabelid_tipo_grupo_forma_pagoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_forma_pagoListadosFormasPagos.add(jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 3;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_forma_pagoListadosFormasPagos.add(jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_grupo_forma_pagoListadosFormasPagos.add(jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaListadosFormasPagos.add(jLabelid_empresaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadosFormasPagos.add(jButtonid_empresaListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 3;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadosFormasPagos.add(jButtonid_empresaListadosFormasPagosUpdate, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaListadosFormasPagos.add(jComboBoxid_empresaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalListadosFormasPagos.add(jLabelid_sucursalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalListadosFormasPagos.add(jButtonid_sucursalListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 3;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalListadosFormasPagos.add(jButtonid_sucursalListadosFormasPagosUpdate, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalListadosFormasPagos.add(jComboBoxid_sucursalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeListadosFormasPagos.add(jLabelfecha_desdeListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeListadosFormasPagos.add(jButtonfecha_desdeListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeListadosFormasPagos.add(jDateChooserfecha_desdeListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaListadosFormasPagos.add(jLabelfecha_hastaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaListadosFormasPagos.add(jButtonfecha_hastaListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaListadosFormasPagos.add(jDateChooserfecha_hastaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoListadosFormasPagos.add(jLabelcodigoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoListadosFormasPagos.add(jButtoncodigoListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoListadosFormasPagos.add(jTextFieldcodigoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoListadosFormasPagos.add(jLabelnombre_completoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoListadosFormasPagos.add(jButtonnombre_completoListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoListadosFormasPagos.add(jscrollPanenombre_completoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_tipo_cuenta_banco_globalListadosFormasPagos.add(jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_tipo_cuenta_banco_globalListadosFormasPagos.add(jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_tipo_cuenta_banco_globalListadosFormasPagos.add(jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaListadosFormasPagos.add(jLabelnumero_cuentaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaListadosFormasPagos.add(jButtonnumero_cuentaListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaListadosFormasPagos.add(jTextFieldnumero_cuentaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_estado_anti_clienteListadosFormasPagos.add(jLabelcodigo_estado_anti_clienteListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_estado_anti_clienteListadosFormasPagos.add(jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_estado_anti_clienteListadosFormasPagos.add(jTextFieldcodigo_estado_anti_clienteListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaListadosFormasPagos.add(jLabelfechaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaListadosFormasPagos.add(jButtonfechaListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaListadosFormasPagos.add(jDateChooserfechaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorListadosFormasPagos.add(jLabelvalorListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorListadosFormasPagos.add(jButtonvalorListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorListadosFormasPagos.add(jTextFieldvalorListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_adicionalListadosFormasPagos.add(jLabelvalor_adicionalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_adicionalListadosFormasPagos.add(jButtonvalor_adicionalListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_adicionalListadosFormasPagos.add(jTextFieldvalor_adicionalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_grupo_forma_pagoListadosFormasPagos.add(jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_grupo_forma_pagoListadosFormasPagos.add(jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_grupo_forma_pagoListadosFormasPagos.add(jscrollPanenombre_tipo_grupo_forma_pagoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalListadosFormasPagos.add(jLabeltotalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 2;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
		this.gridBagConstraintsListadosFormasPagos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalListadosFormasPagos.add(jButtontotalListadosFormasPagosBusqueda, this.gridBagConstraintsListadosFormasPagos);
	}

	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosFormasPagos.gridy = 0;
	this.gridBagConstraintsListadosFormasPagos.gridx = 1;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalListadosFormasPagos.add(jTextFieldtotalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelidListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelid_tipo_grupo_forma_pagoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelfecha_desdeListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelfecha_hastaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelcodigoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelnombre_completoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelcodigo_tipo_cuenta_banco_globalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelnumero_cuentaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelcodigo_estado_anti_clienteListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelfechaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelvalorListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelvalor_adicionalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPanelnombre_tipo_grupo_forma_pagoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosFormasPagos.add(this.jPaneltotalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposListadosFormasPagos % 2==0) {
		iXPanelCamposListadosFormasPagos=0;
		iYPanelCamposListadosFormasPagos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposOcultosListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposOcultosListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosListadosFormasPagos.add(this.jPanelid_empresaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposOcultosListadosFormasPagos % 2==0) {
		iXPanelCamposOcultosListadosFormasPagos=0;
		iYPanelCamposOcultosListadosFormasPagos++;
	}
	this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosFormasPagos.gridy = iYPanelCamposOcultosListadosFormasPagos;
	this.gridBagConstraintsListadosFormasPagos.gridx = iXPanelCamposOcultosListadosFormasPagos++;
	this.gridBagConstraintsListadosFormasPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosFormasPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosListadosFormasPagos.add(this.jPanelid_sucursalListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);



	if(iXPanelCamposOcultosListadosFormasPagos % 2==0) {
		iXPanelCamposOcultosListadosFormasPagos=0;
		iYPanelCamposOcultosListadosFormasPagos++;
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
			
		GridBagLayout gridaBagLayoutAccionesListadosFormasPagos= new GridBagLayout();
		this.jPanelAccionesListadosFormasPagos.setLayout(gridaBagLayoutAccionesListadosFormasPagos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioListadosFormasPagos= new GridBagLayout();
		this.jPanelAccionesFormularioListadosFormasPagos.setLayout(gridaBagLayoutAccionesFormularioListadosFormasPagos);
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioListadosFormasPagos.add(this.jComboBoxTiposAccionesFormularioListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccion++;
			
		this.jPanelAccionesListadosFormasPagos.add(this.jButtonModificarListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);							

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx =iPosXAccion++;
			
		this.jPanelAccionesListadosFormasPagos.add(this.jButtonEliminarListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
			
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadosFormasPagos.add(this.jButtonActualizarListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadosFormasPagos.add(this.jButtonGuardarCambiosListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);	
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;		
		this.gridBagConstraintsListadosFormasPagos.gridx =iPosXAccion++;
		
		this.jPanelAccionesListadosFormasPagos.add(this.jButtonCancelarListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadosFormasPagos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();						
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosFormasPagos.gridx = 0;		
			//this.gridBagConstraintsListadosFormasPagos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadosFormasPagos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadosFormasPagos.gridx =0;
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadosFormasPagos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ListadosFormasPagosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleListadosFormasPagos = new ListadosFormasPagosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Listados Formas Pagos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Listados Formas Pagos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listados Formas Pagos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ListadosFormasPagosModel listadosformaspagosModel=new ListadosFormasPagosModel(this);
			
			//SI USARA CLASE INTERNA
			//ListadosFormasPagosModel.ListadosFormasPagosFocusTraversalPolicy listadosformaspagosFocusTraversalPolicy = listadosformaspagosModel.new ListadosFormasPagosFocusTraversalPolicy(this);
			
			//listadosformaspagosFocusTraversalPolicy.setlistadosformaspagosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(listadosformaspagosModel);
			
			
			this.jContentPaneDetalleListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleListadosFormasPagos = new GridBagLayout();	
			this.jContentPaneDetalleListadosFormasPagos.setLayout(gridaBagLayoutDetalleListadosFormasPagos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadosFormasPagos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
				this.gridBagConstraintsListadosFormasPagos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsListadosFormasPagos.gridx = 0;
					
				
				this.jContentPaneDetalleListadosFormasPagos.add(jTtoolBarDetalleListadosFormasPagos, gridBagConstraintsListadosFormasPagos);								
				
}
			
			this.jScrollPanelDatosEdicionListadosFormasPagos=   new JScrollPane(jContentPaneDetalleListadosFormasPagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadosFormasPagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosFormasPagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosFormasPagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralListadosFormasPagos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadosFormasPagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosFormasPagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosFormasPagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsListadosFormasPagos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	        
			this.jContentPaneDetalleListadosFormasPagos.add(jPanelCamposListadosFormasPagos, gridBagConstraintsListadosFormasPagos);
			
			
			
			
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
						//&& listadosformaspagosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.listadosformaspagosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsListadosFormasPagos= new GridBagConstraints();
						this.gridBagConstraintsListadosFormasPagos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsListadosFormasPagos.gridx = 0;
						this.jContentPaneDetalleListadosFormasPagos.add(this.jTabbedPaneRelacionesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesListadosFormasPagos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosListadosFormasPagos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
					this.gridBagConstraintsListadosFormasPagos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsListadosFormasPagos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsListadosFormasPagos.gridx = 0;
					
				
					this.jContentPaneDetalleListadosFormasPagos.add(jPanelCamposOcultosListadosFormasPagos, gridBagConstraintsListadosFormasPagos);
				
					this.jPanelCamposOcultosListadosFormasPagos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	        this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleListadosFormasPagos.add(this.jPanelAccionesFormularioListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);							
			
			
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
	        this.gridBagConstraintsListadosFormasPagos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsListadosFormasPagos.gridx = 0;
	        
			
			this.jContentPaneDetalleListadosFormasPagos.add(this.jPanelAccionesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionListadosFormasPagos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionListadosFormasPagos=   new JScrollPane(this.jPanelCamposListadosFormasPagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadosFormasPagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosFormasPagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosFormasPagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsListadosFormasPagos.gridx = 0;
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsListadosFormasPagos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadosFormasPagos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);			
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadosFormasPagos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosFormasPagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			
			
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosFormasPagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
			
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadosFormasPagos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralListadosFormasPagos;//jContentPane;
		
		return jScrollPanelDatosEdicionListadosFormasPagos;
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
