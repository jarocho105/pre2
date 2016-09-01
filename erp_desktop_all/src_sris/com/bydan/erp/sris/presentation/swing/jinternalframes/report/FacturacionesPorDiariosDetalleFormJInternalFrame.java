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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.FacturacionesPorDiariosConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class FacturacionesPorDiariosDetalleFormJInternalFrame extends FacturacionesPorDiariosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturacionesPorDiarios;
	
	protected JMenuBar jmenuBarDetalleFacturacionesPorDiarios;
	
	protected JMenu jmenuDetalleFacturacionesPorDiarios;
	protected JMenu jmenuDetalleArchivoFacturacionesPorDiarios;
	protected JMenu jmenuDetalleAccionesFacturacionesPorDiarios;
	protected JMenu jmenuDetalleDatosFacturacionesPorDiarios;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturacionesPorDiarios;	
	protected GridBagConstraints gridBagConstraintsFacturacionesPorDiarios;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturacionesPorDiariosBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturacionesPorDiarios;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";
	
	public FacturacionesPorDiariosSessionBean facturacionespordiariosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;	
	
	public FacturacionesPorDiariosLogic facturacionespordiariosLogic;
	
	public JScrollPane jScrollPanelDatosFacturacionesPorDiarios;
	public JScrollPane jScrollPanelDatosEdicionFacturacionesPorDiarios;
	public JScrollPane jScrollPanelDatosGeneralFacturacionesPorDiarios;
	
	protected JPanel jPanelCamposFacturacionesPorDiarios;    
	protected JPanel jPanelCamposOcultosFacturacionesPorDiarios;    	
	protected JPanel jPanelAccionesFacturacionesPorDiarios;
	protected JPanel jPanelAccionesFormularioFacturacionesPorDiarios;
    
	
	
	protected Integer iXPanelCamposFacturacionesPorDiarios=0;
	protected Integer iYPanelCamposFacturacionesPorDiarios=0;
	
	protected Integer iXPanelCamposOcultosFacturacionesPorDiarios=0;
	protected Integer iYPanelCamposOcultosFacturacionesPorDiarios=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturacionesPorDiarios;
	public JButton jButtonModificarFacturacionesPorDiarios;
	public JButton jButtonActualizarFacturacionesPorDiarios;
    public JButton jButtonEliminarFacturacionesPorDiarios;
	public JButton jButtonCancelarFacturacionesPorDiarios;
    public JButton jButtonGuardarCambiosFacturacionesPorDiarios;
	public JButton jButtonGuardarCambiosTablaFacturacionesPorDiarios;
	protected JButton jButtonCerrarFacturacionesPorDiarios;
	
	
	protected JButton jButtonProcesarInformacionFacturacionesPorDiarios;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturacionesPorDiarios;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturacionesPorDiarios;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturacionesPorDiarios;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturacionesPorDiarios;
	protected JButton jButtonModificarToolBarFacturacionesPorDiarios;
	protected JButton jButtonActualizarToolBarFacturacionesPorDiarios;
    protected JButton jButtonEliminarToolBarFacturacionesPorDiarios;
	protected JButton jButtonCancelarToolBarFacturacionesPorDiarios;
    protected JButton jButtonGuardarCambiosToolBarFacturacionesPorDiarios;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturacionesPorDiarios;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturacionesPorDiarios;
	protected JButton jButtonCerrarToolBarFacturacionesPorDiarios;
	
	protected JButton jButtonProcesarInformacionToolBarFacturacionesPorDiarios;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturacionesPorDiarios;
	protected JMenuItem jMenuItemModificarFacturacionesPorDiarios;
	protected JMenuItem jMenuItemActualizarFacturacionesPorDiarios;
    protected JMenuItem jMenuItemEliminarFacturacionesPorDiarios;
	protected JMenuItem jMenuItemCancelarFacturacionesPorDiarios;
    protected JMenuItem jMenuItemGuardarCambiosFacturacionesPorDiarios;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturacionesPorDiarios;
	protected JMenuItem jMenuItemCerrarFacturacionesPorDiarios;
	protected JMenuItem jMenuItemDetalleCerrarFacturacionesPorDiarios;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturacionesPorDiarios;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturacionesPorDiarios;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturacionesPorDiarios;
	protected JMenuItem jMenuItemMostrarOcultarFacturacionesPorDiarios;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturacionesPorDiarios;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturacionesPorDiarios;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturacionesPorDiarios;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturacionesPorDiarios;
	public JLabel jLabelIdFacturacionesPorDiarios;
	public JLabel jLabelidFacturacionesPorDiarios;
	public JButton jButtonidFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeFacturacionesPorDiarios;
	public JLabel jLabelfecha_emision_desdeFacturacionesPorDiarios;
	//public JFormattedTextField jDateChooserfecha_emision_desdeFacturacionesPorDiarios;

	public JDateChooser jDateChooserfecha_emision_desdeFacturacionesPorDiarios;
	public JButton jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaFacturacionesPorDiarios;
	public JLabel jLabelfecha_emision_hastaFacturacionesPorDiarios;
	//public JFormattedTextField jDateChooserfecha_emision_hastaFacturacionesPorDiarios;

	public JDateChooser jDateChooserfecha_emision_hastaFacturacionesPorDiarios;
	public JButton jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionFacturacionesPorDiarios;
	public JLabel jLabelfecha_emisionFacturacionesPorDiarios;
	//public JFormattedTextField jDateChooserfecha_emisionFacturacionesPorDiarios;

	public JDateChooser jDateChooserfecha_emisionFacturacionesPorDiarios;
	public JButton jButtonfecha_emisionFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalFacturacionesPorDiarios;
	public JLabel jLabelnombre_sucursalFacturacionesPorDiarios;
	public JTextArea jTextAreanombre_sucursalFacturacionesPorDiarios;
	public JScrollPane jscrollPanenombre_sucursalFacturacionesPorDiarios;
	public JButton jButtonnombre_sucursalFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteFacturacionesPorDiarios;
	public JLabel jLabelnombre_completo_clienteFacturacionesPorDiarios;
	public JTextArea jTextAreanombre_completo_clienteFacturacionesPorDiarios;
	public JScrollPane jscrollPanenombre_completo_clienteFacturacionesPorDiarios;
	public JButton jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_asiento_contableFacturacionesPorDiarios;
	public JLabel jLabelcodigo_asiento_contableFacturacionesPorDiarios;
	public JTextField jTextFieldcodigo_asiento_contableFacturacionesPorDiarios;
	public JButton jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceFacturacionesPorDiarios;
	public JLabel jLabelfecha_venceFacturacionesPorDiarios;
	//public JFormattedTextField jDateChooserfecha_venceFacturacionesPorDiarios;

	public JDateChooser jDateChooserfecha_venceFacturacionesPorDiarios;
	public JButton jButtonfecha_venceFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_detalle_clienteFacturacionesPorDiarios;
	public JLabel jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios;
	//public JFormattedTextField jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios;

	public JDateChooser jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios;
	public JButton jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelmonto_mone_localFacturacionesPorDiarios;
	public JLabel jLabelmonto_mone_localFacturacionesPorDiarios;
	public JTextField jTextFieldmonto_mone_localFacturacionesPorDiarios;
	public JButton jButtonmonto_mone_localFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaFacturacionesPorDiarios;
	public JLabel jLabelnumero_facturaFacturacionesPorDiarios;
	public JTextField jTextFieldnumero_facturaFacturacionesPorDiarios;
	public JButton jButtonnumero_facturaFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelruc_clienteFacturacionesPorDiarios;
	public JLabel jLabelruc_clienteFacturacionesPorDiarios;
	public JTextField jTextFieldruc_clienteFacturacionesPorDiarios;
	public JButton jButtonruc_clienteFacturacionesPorDiariosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFacturacionesPorDiarios;
	public JLabel jLabelid_empresaFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFacturacionesPorDiarios;
	public JButton jButtonid_empresaFacturacionesPorDiarios= new JButtonMe();
	public JButton jButtonid_empresaFacturacionesPorDiariosUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionFacturacionesPorDiarios;
	public JLabel jLabelid_transaccionFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFacturacionesPorDiarios;
	public JButton jButtonid_transaccionFacturacionesPorDiarios= new JButtonMe();
	public JButton jButtonid_transaccionFacturacionesPorDiariosUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFacturacionesPorDiariosBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloFacturacionesPorDiarios;
	public JLabel jLabelid_tipo_transaccion_moduloFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios;
	public JButton jButtonid_tipo_transaccion_moduloFacturacionesPorDiarios= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturacionesPorDiarios;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FacturacionesPorDiariosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturacionesPorDiarios=new JPanel();
				this.jPanelAccionesFormularioFacturacionesPorDiarios=new JPanel();
				this.jmenuBarDetalleFacturacionesPorDiarios=new JMenuBar();
				this.jTtoolBarDetalleFacturacionesPorDiarios=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionesPorDiariosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FacturacionesPorDiarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturacionesPorDiariosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FacturacionesPorDiarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionesPorDiariosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturacionesPorDiarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionesPorDiariosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturacionesPorDiarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionesPorDiariosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturacionesPorDiarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturacionesPorDiarios() {
		return this.jButtonActualizarToolBarFacturacionesPorDiarios;
	}
	
	public JButton getjButtonEliminarToolBarFacturacionesPorDiarios() {
		return this.jButtonEliminarToolBarFacturacionesPorDiarios;
	}
	
	public JButton getjButtonCancelarToolBarFacturacionesPorDiarios() {
		return this.jButtonCancelarToolBarFacturacionesPorDiarios;
	}		
	
	public JButton getjButtonProcesarInformacionFacturacionesPorDiarios() {
		return this.jButtonProcesarInformacionFacturacionesPorDiarios;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturacionesPorDiarios)	{
		this.jButtonProcesarInformacionFacturacionesPorDiarios = jButtonProcesarInformacionFacturacionesPorDiarios;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturacionesPorDiarios() {
		return this.jComboBoxTiposAccionesFacturacionesPorDiarios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturacionesPorDiarios(
			JComboBox jComboBoxTiposRelacionesFacturacionesPorDiarios) {
		this.jComboBoxTiposRelacionesFacturacionesPorDiarios = jComboBoxTiposRelacionesFacturacionesPorDiarios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturacionesPorDiarios(
			JComboBox jComboBoxTiposAccionesFacturacionesPorDiarios) {
		this.jComboBoxTiposAccionesFacturacionesPorDiarios = jComboBoxTiposAccionesFacturacionesPorDiarios;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturacionesPorDiarios() {
		return this.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturacionesPorDiarios(
			JComboBox jComboBoxTiposAccionesFormularioFacturacionesPorDiarios) {
		this.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios = jComboBoxTiposAccionesFormularioFacturacionesPorDiarios;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturacionespordiariosSessionBean=new FacturacionesPorDiariosSessionBean();
		
		this.facturacionespordiariosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturacionespordiariosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturacionespordiariosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturacionesPorDiariosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturacionesPorDiariosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturacionesPorDiariosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturaciones Por Diarios MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturacionesPorDiariosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturacionesPorDiarios= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturacionesPorDiarios=new JButtonMe();
				this.jButtonModificarToolBarFacturacionesPorDiarios=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturacionesPorDiarios,this.jTtoolBarDetalleFacturacionesPorDiarios,
							"actualizar","actualizar","Actualizar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturacionesPorDiarios,this.jTtoolBarDetalleFacturacionesPorDiarios,
							"eliminar","eliminar","Eliminar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturacionesPorDiarios,this.jTtoolBarDetalleFacturacionesPorDiarios,
							"cancelar","cancelar","Cancelar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturacionesPorDiarios,this.jTtoolBarDetalleFacturacionesPorDiarios,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturacionesPorDiarios=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturacionesPorDiarios=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturacionesPorDiarios=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturacionesPorDiarios=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturacionesPorDiarios=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturacionesPorDiarios= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturacionesPorDiarios.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturacionesPorDiarios,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturacionesPorDiarios= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturacionesPorDiarios.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturacionesPorDiarios,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturacionesPorDiarios= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturacionesPorDiarios.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturacionesPorDiarios,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturacionesPorDiarios= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturacionesPorDiarios.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturacionesPorDiarios,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturacionesPorDiarios= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturacionesPorDiarios.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturacionesPorDiarios,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturacionesPorDiarios= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturacionesPorDiarios.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturacionesPorDiarios,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturacionesPorDiarios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturacionesPorDiarios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturacionesPorDiarios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturacionesPorDiarios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturacionesPorDiarios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturacionesPorDiarios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturacionesPorDiarios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturacionesPorDiarios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturacionesPorDiarios,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturacionesPorDiarios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturacionesPorDiarios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturacionesPorDiarios,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturacionesPorDiarios.add(this.jMenuItemDetalleCerrarFacturacionesPorDiarios);
		
		this.jmenuDetalleAccionesFacturacionesPorDiarios.add(this.jMenuItemActualizarFacturacionesPorDiarios);
		this.jmenuDetalleAccionesFacturacionesPorDiarios.add(this.jMenuItemEliminarFacturacionesPorDiarios);
		this.jmenuDetalleAccionesFacturacionesPorDiarios.add(this.jMenuItemCancelarFacturacionesPorDiarios);		
		
		//this.jmenuDetalleDatosFacturacionesPorDiarios.add(this.jMenuItemDetalleAbrirOrderByFacturacionesPorDiarios);				
		this.jmenuDetalleDatosFacturacionesPorDiarios.add(this.jMenuItemDetalleMostarOcultarFacturacionesPorDiarios);				
				
		//this.jmenuDetalleAccionesFacturacionesPorDiarios.add(this.jMenuItemGuardarCambiosFacturacionesPorDiarios);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturacionesPorDiarios.add(this.jmenuDetalleArchivoFacturacionesPorDiarios);		
		this.jmenuBarDetalleFacturacionesPorDiarios.add(this.jmenuDetalleAccionesFacturacionesPorDiarios);		
		this.jmenuBarDetalleFacturacionesPorDiarios.add(this.jmenuDetalleDatosFacturacionesPorDiarios);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFacturacionesPorDiarios);				
	}
	
	
	public void inicializarElementosCamposFacturacionesPorDiarios() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturacionesPorDiarios = new JLabelMe();
		jLabelIdFacturacionesPorDiarios.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturacionesPorDiarios = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturacionesPorDiarios= new GridBagLayout();

		this.jPanelidFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);

		jLabelidFacturacionesPorDiarios = new JLabel();
		jLabelidFacturacionesPorDiarios.setText("Id");

		jLabelidFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeFacturacionesPorDiarios = new JLabelMe();
		this.jLabelfecha_emision_desdeFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeFacturacionesPorDiarios.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelfecha_emision_desdeFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		//jFormattedTextFieldfecha_emision_desdeFacturacionesPorDiarios= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeFacturacionesPorDiarios= new JDateChooser();
		jDateChooserfecha_emision_desdeFacturacionesPorDiarios.setEnabled(false);
		jDateChooserfecha_emision_desdeFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeFacturacionesPorDiarios.setDate(new Date());
		jDateChooserfecha_emision_desdeFacturacionesPorDiarios.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeFacturacionesPorDiarios.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaFacturacionesPorDiarios = new JLabelMe();
		this.jLabelfecha_emision_hastaFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaFacturacionesPorDiarios.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelfecha_emision_hastaFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		//jFormattedTextFieldfecha_emision_hastaFacturacionesPorDiarios= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaFacturacionesPorDiarios= new JDateChooser();
		jDateChooserfecha_emision_hastaFacturacionesPorDiarios.setEnabled(false);
		jDateChooserfecha_emision_hastaFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaFacturacionesPorDiarios.setDate(new Date());
		jDateChooserfecha_emision_hastaFacturacionesPorDiarios.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaFacturacionesPorDiarios.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionFacturacionesPorDiarios = new JLabelMe();
		this.jLabelfecha_emisionFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionFacturacionesPorDiarios.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelfecha_emisionFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		//jFormattedTextFieldfecha_emisionFacturacionesPorDiarios= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionFacturacionesPorDiarios= new JDateChooser();
		jDateChooserfecha_emisionFacturacionesPorDiarios.setEnabled(false);
		jDateChooserfecha_emisionFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionFacturacionesPorDiarios.setDate(new Date());
		jDateChooserfecha_emisionFacturacionesPorDiarios.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionFacturacionesPorDiarios.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonfecha_emisionFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionFacturacionesPorDiariosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sucursalFacturacionesPorDiarios = new JLabelMe();
		this.jLabelnombre_sucursalFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalFacturacionesPorDiarios.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelnombre_sucursalFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		jTextAreanombre_sucursalFacturacionesPorDiarios= new JTextAreaMe();
		jTextAreanombre_sucursalFacturacionesPorDiarios.setEnabled(false);
		jTextAreanombre_sucursalFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalFacturacionesPorDiarios.setLineWrap(true);
		jTextAreanombre_sucursalFacturacionesPorDiarios.setWrapStyleWord(true);
		jTextAreanombre_sucursalFacturacionesPorDiarios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalFacturacionesPorDiarios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalFacturacionesPorDiarios = new JScrollPane(jTextAreanombre_sucursalFacturacionesPorDiarios);
		jscrollPanenombre_sucursalFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalFacturacionesPorDiariosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteFacturacionesPorDiarios = new JLabelMe();
		this.jLabelnombre_completo_clienteFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteFacturacionesPorDiarios.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelnombre_completo_clienteFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		jTextAreanombre_completo_clienteFacturacionesPorDiarios= new JTextAreaMe();
		jTextAreanombre_completo_clienteFacturacionesPorDiarios.setEnabled(false);
		jTextAreanombre_completo_clienteFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturacionesPorDiarios.setLineWrap(true);
		jTextAreanombre_completo_clienteFacturacionesPorDiarios.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteFacturacionesPorDiarios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteFacturacionesPorDiarios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteFacturacionesPorDiarios = new JScrollPane(jTextAreanombre_completo_clienteFacturacionesPorDiarios);
		jscrollPanenombre_completo_clienteFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_asiento_contableFacturacionesPorDiarios = new JLabelMe();
		this.jLabelcodigo_asiento_contableFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE+" : *");
		this.jLabelcodigo_asiento_contableFacturacionesPorDiarios.setToolTipText("Codigo Asiento Contable");
		this.jLabelcodigo_asiento_contableFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_asiento_contableFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_asiento_contableFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_asiento_contableFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_asiento_contableFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_asiento_contableFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelcodigo_asiento_contableFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		jTextFieldcodigo_asiento_contableFacturacionesPorDiarios= new JTextFieldMe();

		jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.setEnabled(false);
		jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_asiento_contableFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_asiento_contableFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_asiento_contableFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_venceFacturacionesPorDiarios = new JLabelMe();
		this.jLabelfecha_venceFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceFacturacionesPorDiarios.setToolTipText("Fecha Vence");
		this.jLabelfecha_venceFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelfecha_venceFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		//jFormattedTextFieldfecha_venceFacturacionesPorDiarios= new JFormattedTextFieldMe();

		jDateChooserfecha_venceFacturacionesPorDiarios= new JDateChooser();
		jDateChooserfecha_venceFacturacionesPorDiarios.setEnabled(false);
		jDateChooserfecha_venceFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceFacturacionesPorDiarios.setDate(new Date());
		jDateChooserfecha_venceFacturacionesPorDiarios.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceFacturacionesPorDiarios.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonfecha_venceFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonfecha_venceFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceFacturacionesPorDiariosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios = new JLabelMe();
		this.jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE+" : *");
		this.jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios.setToolTipText("Fecha Emision Detalle Cliente");
		this.jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_detalle_clienteFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_detalle_clienteFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_FECHAEMISIONDETALLECLIENTE);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelfecha_emision_detalle_clienteFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		//jFormattedTextFieldfecha_emision_detalle_clienteFacturacionesPorDiarios= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios= new JDateChooser();
		jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setEnabled(false);
		jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setDate(new Date());
		jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_detalle_clienteFacturacionesPorDiarios.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda.setVisible(false);		}


					
		this.jLabelmonto_mone_localFacturacionesPorDiarios = new JLabelMe();
		this.jLabelmonto_mone_localFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL+" : *");
		this.jLabelmonto_mone_localFacturacionesPorDiarios.setToolTipText("Monto Mone Local");
		this.jLabelmonto_mone_localFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_localFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_localFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_mone_localFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_mone_localFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_mone_localFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_MONTOMONELOCAL);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelmonto_mone_localFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		jTextFieldmonto_mone_localFacturacionesPorDiarios= new JTextFieldMe();
		jTextFieldmonto_mone_localFacturacionesPorDiarios.setEnabled(false);
		jTextFieldmonto_mone_localFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_localFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_localFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_mone_localFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_mone_localFacturacionesPorDiarios.setText("0.0");

		this.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_mone_localFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_mone_localFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_mone_localFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_mone_localFacturacionesPorDiariosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaFacturacionesPorDiarios = new JLabelMe();
		this.jLabelnumero_facturaFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaFacturacionesPorDiarios.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelnumero_facturaFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		jTextFieldnumero_facturaFacturacionesPorDiarios= new JTextFieldMe();

		jTextFieldnumero_facturaFacturacionesPorDiarios.setEnabled(false);
		jTextFieldnumero_facturaFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonnumero_facturaFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonnumero_facturaFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaFacturacionesPorDiariosBusqueda.setVisible(false);		}


					
		this.jLabelruc_clienteFacturacionesPorDiarios = new JLabelMe();
		this.jLabelruc_clienteFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE+" : *");
		this.jLabelruc_clienteFacturacionesPorDiarios.setToolTipText("Ruc Cliente");
		this.jLabelruc_clienteFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_clienteFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_clienteFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_clienteFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_RUCCLIENTE);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelruc_clienteFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		jTextFieldruc_clienteFacturacionesPorDiarios= new JTextFieldMe();

		jTextFieldruc_clienteFacturacionesPorDiarios.setEnabled(false);
		jTextFieldruc_clienteFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_clienteFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_clienteFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonruc_clienteFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_clienteFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonruc_clienteFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_clienteFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_clienteFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_clienteFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_clienteFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_clienteFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_clienteFacturacionesPorDiariosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFacturacionesPorDiarios() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFacturacionesPorDiarios = new JLabelMe();
		this.jLabelid_empresaFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFacturacionesPorDiarios.setToolTipText("Empresa");
		this.jLabelid_empresaFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelid_empresaFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		jComboBoxid_empresaFacturacionesPorDiarios= new JComboBoxMe();
		jComboBoxid_empresaFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFacturacionesPorDiarios.setEnabled(false);

		this.jButtonid_empresaFacturacionesPorDiarios= new JButtonMe();
		this.jButtonid_empresaFacturacionesPorDiarios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturacionesPorDiarios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturacionesPorDiarios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturacionesPorDiarios.setText("Buscar");
		this.jButtonid_empresaFacturacionesPorDiarios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFacturacionesPorDiarios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturacionesPorDiarios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturacionesPorDiarios"));

		this.jButtonid_empresaFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonid_empresaFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturacionesPorDiariosBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturacionesPorDiariosUpdate= new JButtonMe();
		this.jButtonid_empresaFacturacionesPorDiariosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturacionesPorDiariosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturacionesPorDiariosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturacionesPorDiariosUpdate.setText("U");
		this.jButtonid_empresaFacturacionesPorDiariosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturacionesPorDiariosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturacionesPorDiariosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturacionesPorDiariosUpdate"));



					
		this.jLabelid_transaccionFacturacionesPorDiarios = new JLabelMe();
		this.jLabelid_transaccionFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionFacturacionesPorDiarios.setToolTipText("Transaccion");
		this.jLabelid_transaccionFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelid_transaccionFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		jComboBoxid_transaccionFacturacionesPorDiarios= new JComboBoxMe();
		jComboBoxid_transaccionFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionFacturacionesPorDiarios= new JButtonMe();
		this.jButtonid_transaccionFacturacionesPorDiarios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFacturacionesPorDiarios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFacturacionesPorDiarios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFacturacionesPorDiarios.setText("Buscar");
		this.jButtonid_transaccionFacturacionesPorDiarios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionFacturacionesPorDiarios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFacturacionesPorDiarios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFacturacionesPorDiarios"));

		this.jButtonid_transaccionFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonid_transaccionFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonid_transaccionFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionFacturacionesPorDiariosBusqueda.setVisible(false);		}

		this.jButtonid_transaccionFacturacionesPorDiariosUpdate= new JButtonMe();
		this.jButtonid_transaccionFacturacionesPorDiariosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturacionesPorDiariosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturacionesPorDiariosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionFacturacionesPorDiariosUpdate.setText("U");
		this.jButtonid_transaccionFacturacionesPorDiariosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionFacturacionesPorDiariosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFacturacionesPorDiariosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFacturacionesPorDiariosUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloFacturacionesPorDiarios = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloFacturacionesPorDiarios.setText(""+FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloFacturacionesPorDiarios.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloFacturacionesPorDiarios.setToolTipText(FacturacionesPorDiariosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloFacturacionesPorDiarios.setLayout(this.gridaBagLayoutFacturacionesPorDiarios);


		jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiarios= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiarios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiarios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiarios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiarios.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiarios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiarios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiarios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFacturacionesPorDiarios"));

		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda"));

		if(this.facturacionespordiariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFacturacionesPorDiariosUpdate"));



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
		//this.jInternalFrameDetalleFacturacionesPorDiarios = new FacturacionesPorDiariosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Facturaciones Por Diarios DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturacionesPorDiarios= new GridBagLayout();
		

		
		String sToolTipFacturacionesPorDiarios="";
		sToolTipFacturacionesPorDiarios=FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturacionesPorDiarios+="(Sris.FacturacionesPorDiarios)";
		}
		
		if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturacionesPorDiarios+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturacionesPorDiarios = new JButtonMe();
		this.jButtonModificarFacturacionesPorDiarios = new JButtonMe();
        this.jButtonActualizarFacturacionesPorDiarios = new JButtonMe();
        this.jButtonEliminarFacturacionesPorDiarios = new JButtonMe();
        this.jButtonCancelarFacturacionesPorDiarios = new JButtonMe();
        this.jButtonGuardarCambiosFacturacionesPorDiarios = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturacionesPorDiarios = new JButtonMe();
		this.jButtonCerrarFacturacionesPorDiarios = new JButtonMe();
		
		this.jScrollPanelDatosFacturacionesPorDiarios = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturacionesPorDiarios = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturacionesPorDiarios = new JScrollPane();
				
		
		
		this.jPanelCamposFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Facturaciones Por Diarios";
		
		if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones Por Diarioses" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturacionesPorDiarios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFacturacionesPorDiarios.setName("jPanelCamposFacturacionesPorDiarios"); 

		this.jPanelCamposOcultosFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturacionesPorDiarios.setName("jPanelCamposOcultosFacturacionesPorDiarios"); 

        this.jPanelAccionesFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturacionesPorDiarios.setToolTipText("Acciones");
        this.jPanelAccionesFacturacionesPorDiarios.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturacionesPorDiarios.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturacionesPorDiarios.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturacionesPorDiarios.setText("Nuevo");
		this.jButtonModificarFacturacionesPorDiarios.setText("Editar");
        this.jButtonActualizarFacturacionesPorDiarios.setText("Actualizar");
        this.jButtonEliminarFacturacionesPorDiarios.setText("Eliminar");
        this.jButtonCancelarFacturacionesPorDiarios.setText("Cancelar");
        this.jButtonGuardarCambiosFacturacionesPorDiarios.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.setText("Guardar");
		this.jButtonCerrarFacturacionesPorDiarios.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturacionesPorDiarios,"nuevo_button","Nuevo",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturacionesPorDiarios,"modificar_button","Editar",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturacionesPorDiarios,"actualizar_button","Actualizar",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturacionesPorDiarios,"eliminar_button","Eliminar",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturacionesPorDiarios,"cancelar_button","Cancelar",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturacionesPorDiarios,"guardarcambios_button","Guardar",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturacionesPorDiarios,"guardarcambiostabla_button","Guardar",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturacionesPorDiarios,"cerrar_button","Salir",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturacionesPorDiarios.setToolTipText("Nuevo"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturacionesPorDiarios.setToolTipText("Editar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturacionesPorDiarios.setToolTipText("Actualizar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturacionesPorDiarios.setToolTipText("Eliminar)"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturacionesPorDiarios.setToolTipText("Cancelar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturacionesPorDiarios.setToolTipText("Guardar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.setToolTipText("Guardar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturacionesPorDiarios.setToolTipText("Salir"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturacionesPorDiarios";
		inputMap = this.jButtonNuevoFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturacionesPorDiarios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturacionesPorDiarios"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturacionesPorDiarios";
		inputMap = this.jButtonActualizarFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturacionesPorDiarios"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturacionesPorDiarios";
		inputMap = this.jButtonEliminarFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturacionesPorDiarios"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturacionesPorDiarios";
		inputMap = this.jButtonCancelarFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturacionesPorDiarios"));
		
		//CERRAR		
		sMapKey = "CerrarFacturacionesPorDiarios";
		inputMap = this.jButtonCerrarFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturacionesPorDiarios"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturacionesPorDiarios";
		inputMap = this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturacionesPorDiarios"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturacionesPorDiarios = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturacionesPorDiarios.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturacionesPorDiarios.setToolTipText("Nuevo FacturacionesPorDiarios");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturacionesPorDiarios = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturacionesPorDiarios.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturacionesPorDiarios.setToolTipText("Sin Cerrar Ventana FacturacionesPorDiarios");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturacionesPorDiarios = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturacionesPorDiarios.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturacionesPorDiarios.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturacionesPorDiarios.setText("Accion");
		this.jComboBoxTiposAccionesFacturacionesPorDiarios.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturacionesPorDiarios = new JLabelMe();
		
		this.jLabelAccionesFacturacionesPorDiarios.setText("Acciones");		
		this.jLabelAccionesFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturacionesPorDiarios();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturacionesPorDiarios();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturacionesPorDiarios=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturacionesPorDiarios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturacionesPorDiarios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturacionesPorDiarios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturacionesPorDiarios = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturacionesPorDiarios = new GridBagLayout();
		
		this.jPanelCamposFacturacionesPorDiarios.setLayout(gridaBagLayoutCamposFacturacionesPorDiarios);
		this.jPanelCamposOcultosFacturacionesPorDiarios.setLayout(gridaBagLayoutCamposOcultosFacturacionesPorDiarios);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFacturacionesPorDiarios.add(jLabelIdFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFacturacionesPorDiarios.add(jLabelidFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFacturacionesPorDiarios.add(jLabelid_empresaFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturacionesPorDiarios.add(jButtonid_empresaFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 3;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturacionesPorDiarios.add(jButtonid_empresaFacturacionesPorDiariosUpdate, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFacturacionesPorDiarios.add(jComboBoxid_empresaFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionFacturacionesPorDiarios.add(jLabelid_transaccionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionFacturacionesPorDiarios.add(jButtonid_transaccionFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 3;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionFacturacionesPorDiarios.add(jButtonid_transaccionFacturacionesPorDiariosUpdate, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionFacturacionesPorDiarios.add(jComboBoxid_transaccionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeFacturacionesPorDiarios.add(jLabelfecha_emision_desdeFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeFacturacionesPorDiarios.add(jButtonfecha_emision_desdeFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeFacturacionesPorDiarios.add(jDateChooserfecha_emision_desdeFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaFacturacionesPorDiarios.add(jLabelfecha_emision_hastaFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaFacturacionesPorDiarios.add(jButtonfecha_emision_hastaFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaFacturacionesPorDiarios.add(jDateChooserfecha_emision_hastaFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionFacturacionesPorDiarios.add(jLabelfecha_emisionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionFacturacionesPorDiarios.add(jButtonfecha_emisionFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionFacturacionesPorDiarios.add(jDateChooserfecha_emisionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalFacturacionesPorDiarios.add(jLabelnombre_sucursalFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalFacturacionesPorDiarios.add(jButtonnombre_sucursalFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalFacturacionesPorDiarios.add(jscrollPanenombre_sucursalFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteFacturacionesPorDiarios.add(jLabelnombre_completo_clienteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteFacturacionesPorDiarios.add(jButtonnombre_completo_clienteFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteFacturacionesPorDiarios.add(jscrollPanenombre_completo_clienteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaccion_moduloFacturacionesPorDiarios.add(jLabelid_tipo_transaccion_moduloFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloFacturacionesPorDiarios.add(jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 3;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloFacturacionesPorDiarios.add(jButtonid_tipo_transaccion_moduloFacturacionesPorDiariosUpdate, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaccion_moduloFacturacionesPorDiarios.add(jComboBoxid_tipo_transaccion_moduloFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_asiento_contableFacturacionesPorDiarios.add(jLabelcodigo_asiento_contableFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_asiento_contableFacturacionesPorDiarios.add(jButtoncodigo_asiento_contableFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_asiento_contableFacturacionesPorDiarios.add(jTextFieldcodigo_asiento_contableFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_venceFacturacionesPorDiarios.add(jLabelfecha_venceFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceFacturacionesPorDiarios.add(jButtonfecha_venceFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_venceFacturacionesPorDiarios.add(jDateChooserfecha_venceFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_detalle_clienteFacturacionesPorDiarios.add(jLabelfecha_emision_detalle_clienteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_detalle_clienteFacturacionesPorDiarios.add(jButtonfecha_emision_detalle_clienteFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_detalle_clienteFacturacionesPorDiarios.add(jDateChooserfecha_emision_detalle_clienteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_mone_localFacturacionesPorDiarios.add(jLabelmonto_mone_localFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_mone_localFacturacionesPorDiarios.add(jButtonmonto_mone_localFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_mone_localFacturacionesPorDiarios.add(jTextFieldmonto_mone_localFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaFacturacionesPorDiarios.add(jLabelnumero_facturaFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaFacturacionesPorDiarios.add(jButtonnumero_facturaFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaFacturacionesPorDiarios.add(jTextFieldnumero_facturaFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_clienteFacturacionesPorDiarios.add(jLabelruc_clienteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 2;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_clienteFacturacionesPorDiarios.add(jButtonruc_clienteFacturacionesPorDiariosBusqueda, this.gridBagConstraintsFacturacionesPorDiarios);
	}

	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_clienteFacturacionesPorDiarios.add(jTextFieldruc_clienteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelidFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelid_transaccionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelfecha_emision_desdeFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelfecha_emision_hastaFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelfecha_emisionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelnombre_sucursalFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelnombre_completo_clienteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelid_tipo_transaccion_moduloFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelcodigo_asiento_contableFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelfecha_venceFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelfecha_emision_detalle_clienteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelmonto_mone_localFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelnumero_facturaFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacionesPorDiarios.add(this.jPanelruc_clienteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposFacturacionesPorDiarios % 2==0) {
		iXPanelCamposFacturacionesPorDiarios=0;
		iYPanelCamposFacturacionesPorDiarios++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacionesPorDiarios.gridy = iYPanelCamposOcultosFacturacionesPorDiarios;
	this.gridBagConstraintsFacturacionesPorDiarios.gridx = iXPanelCamposOcultosFacturacionesPorDiarios++;
	this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacionesPorDiarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturacionesPorDiarios.add(this.jPanelid_empresaFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);



	if(iXPanelCamposOcultosFacturacionesPorDiarios % 2==0) {
		iXPanelCamposOcultosFacturacionesPorDiarios=0;
		iYPanelCamposOcultosFacturacionesPorDiarios++;
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
			
		GridBagLayout gridaBagLayoutAccionesFacturacionesPorDiarios= new GridBagLayout();
		this.jPanelAccionesFacturacionesPorDiarios.setLayout(gridaBagLayoutAccionesFacturacionesPorDiarios);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturacionesPorDiarios= new GridBagLayout();
		this.jPanelAccionesFormularioFacturacionesPorDiarios.setLayout(gridaBagLayoutAccionesFormularioFacturacionesPorDiarios);
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturacionesPorDiarios.add(this.jComboBoxTiposAccionesFormularioFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturacionesPorDiarios.add(this.jButtonModificarFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);							

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturacionesPorDiarios.add(this.jButtonEliminarFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
			
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturacionesPorDiarios.add(this.jButtonActualizarFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturacionesPorDiarios.add(this.jButtonGuardarCambiosFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);	
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturacionesPorDiarios.add(this.jButtonCancelarFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturacionesPorDiarios);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();						
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;		
			//this.gridBagConstraintsFacturacionesPorDiarios.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx =0;
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturacionesPorDiarios.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturacionesPorDiariosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturacionesPorDiarios = new FacturacionesPorDiariosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Facturaciones Por Diarios DATOS");
			
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
			
	        //this.setTitle("[FOR] - Facturaciones Por Diarios DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturaciones Por Diarios Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturacionesPorDiariosModel facturacionespordiariosModel=new FacturacionesPorDiariosModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturacionesPorDiariosModel.FacturacionesPorDiariosFocusTraversalPolicy facturacionespordiariosFocusTraversalPolicy = facturacionespordiariosModel.new FacturacionesPorDiariosFocusTraversalPolicy(this);
			
			//facturacionespordiariosFocusTraversalPolicy.setfacturacionespordiariosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturacionespordiariosModel);
			
			
			this.jContentPaneDetalleFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturacionesPorDiarios = new GridBagLayout();	
			this.jContentPaneDetalleFacturacionesPorDiarios.setLayout(gridaBagLayoutDetalleFacturacionesPorDiarios);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturacionesPorDiarios = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
				this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
					
				
				this.jContentPaneDetalleFacturacionesPorDiarios.add(jTtoolBarDetalleFacturacionesPorDiarios, gridBagConstraintsFacturacionesPorDiarios);								
				
}
			
			this.jScrollPanelDatosEdicionFacturacionesPorDiarios=   new JScrollPane(jContentPaneDetalleFacturacionesPorDiarios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturacionesPorDiarios=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	        
			this.jContentPaneDetalleFacturacionesPorDiarios.add(jPanelCamposFacturacionesPorDiarios, gridBagConstraintsFacturacionesPorDiarios);
			
			
			
			
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
						//&& facturacionespordiariosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.facturacionespordiariosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturacionesPorDiarios= new GridBagConstraints();
						this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
						this.jContentPaneDetalleFacturacionesPorDiarios.add(this.jTabbedPaneRelacionesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturacionesPorDiarios.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturacionesPorDiarios.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
					this.gridBagConstraintsFacturacionesPorDiarios.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
					
				
					this.jContentPaneDetalleFacturacionesPorDiarios.add(jPanelCamposOcultosFacturacionesPorDiarios, gridBagConstraintsFacturacionesPorDiarios);
				
					this.jPanelCamposOcultosFacturacionesPorDiarios.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	        this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFacturacionesPorDiarios.add(this.jPanelAccionesFormularioFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);							
			
			
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
	        this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
	        
			
			this.jContentPaneDetalleFacturacionesPorDiarios.add(this.jPanelAccionesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturacionesPorDiarios);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturacionesPorDiarios=   new JScrollPane(this.jPanelCamposFacturacionesPorDiarios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturacionesPorDiarios.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);			
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			
			
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
			
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturacionesPorDiarios;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturacionesPorDiarios;
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
