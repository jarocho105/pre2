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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.FacturaDiarioConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class FacturaDiarioDetalleFormJInternalFrame extends FacturaDiarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturaDiario;
	
	protected JMenuBar jmenuBarDetalleFacturaDiario;
	
	protected JMenu jmenuDetalleFacturaDiario;
	protected JMenu jmenuDetalleArchivoFacturaDiario;
	protected JMenu jmenuDetalleAccionesFacturaDiario;
	protected JMenu jmenuDetalleDatosFacturaDiario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaDiario;	
	protected GridBagConstraints gridBagConstraintsFacturaDiario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturaDiarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturaDiario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";
	
	public FacturaDiarioSessionBean facturadiarioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;	
	
	public FacturaDiarioLogic facturadiarioLogic;
	
	public JScrollPane jScrollPanelDatosFacturaDiario;
	public JScrollPane jScrollPanelDatosEdicionFacturaDiario;
	public JScrollPane jScrollPanelDatosGeneralFacturaDiario;
	
	protected JPanel jPanelCamposFacturaDiario;    
	protected JPanel jPanelCamposOcultosFacturaDiario;    	
	protected JPanel jPanelAccionesFacturaDiario;
	protected JPanel jPanelAccionesFormularioFacturaDiario;
    
	
	
	protected Integer iXPanelCamposFacturaDiario=0;
	protected Integer iYPanelCamposFacturaDiario=0;
	
	protected Integer iXPanelCamposOcultosFacturaDiario=0;
	protected Integer iYPanelCamposOcultosFacturaDiario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturaDiario;
	public JButton jButtonModificarFacturaDiario;
	public JButton jButtonActualizarFacturaDiario;
    public JButton jButtonEliminarFacturaDiario;
	public JButton jButtonCancelarFacturaDiario;
    public JButton jButtonGuardarCambiosFacturaDiario;
	public JButton jButtonGuardarCambiosTablaFacturaDiario;
	protected JButton jButtonCerrarFacturaDiario;
	
	
	protected JButton jButtonProcesarInformacionFacturaDiario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturaDiario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturaDiario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturaDiario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaDiario;
	protected JButton jButtonModificarToolBarFacturaDiario;
	protected JButton jButtonActualizarToolBarFacturaDiario;
    protected JButton jButtonEliminarToolBarFacturaDiario;
	protected JButton jButtonCancelarToolBarFacturaDiario;
    protected JButton jButtonGuardarCambiosToolBarFacturaDiario;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturaDiario;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaDiario;
	protected JButton jButtonCerrarToolBarFacturaDiario;
	
	protected JButton jButtonProcesarInformacionToolBarFacturaDiario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaDiario;
	protected JMenuItem jMenuItemModificarFacturaDiario;
	protected JMenuItem jMenuItemActualizarFacturaDiario;
    protected JMenuItem jMenuItemEliminarFacturaDiario;
	protected JMenuItem jMenuItemCancelarFacturaDiario;
    protected JMenuItem jMenuItemGuardarCambiosFacturaDiario;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaDiario;
	protected JMenuItem jMenuItemCerrarFacturaDiario;
	protected JMenuItem jMenuItemDetalleCerrarFacturaDiario;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaDiario;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturaDiario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaDiario;
	protected JMenuItem jMenuItemMostrarOcultarFacturaDiario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaDiario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaDiario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaDiario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturaDiario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturaDiario;
	public JLabel jLabelIdFacturaDiario;
	public JLabel jLabelidFacturaDiario;
	public JButton jButtonidFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionFacturaDiario;
	public JLabel jLabelfecha_emisionFacturaDiario;
	//public JFormattedTextField jDateChooserfecha_emisionFacturaDiario;

	public JDateChooser jDateChooserfecha_emisionFacturaDiario;
	public JButton jButtonfecha_emisionFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoFacturaDiario;
	public JLabel jLabelfecha_vencimientoFacturaDiario;
	//public JFormattedTextField jDateChooserfecha_vencimientoFacturaDiario;

	public JDateChooser jDateChooserfecha_vencimientoFacturaDiario;
	public JButton jButtonfecha_vencimientoFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serieFacturaDiario;
	public JLabel jLabelnumero_serieFacturaDiario;
	public JTextField jTextFieldnumero_serieFacturaDiario;
	public JButton jButtonnumero_serieFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelrucFacturaDiario;
	public JLabel jLabelrucFacturaDiario;
	public JTextField jTextFieldrucFacturaDiario;
	public JButton jButtonrucFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizaFacturaDiario;
	public JLabel jLabelnumero_autorizaFacturaDiario;
	public JTextField jTextFieldnumero_autorizaFacturaDiario;
	public JButton jButtonnumero_autorizaFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPaneles_devolucionFacturaDiario;
	public JLabel jLabeles_devolucionFacturaDiario;
	public JCheckBox jCheckBoxes_devolucionFacturaDiario;
	public JButton jButtones_devolucionFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelvalor_facturaFacturaDiario;
	public JLabel jLabelvalor_facturaFacturaDiario;
	public JTextField jTextFieldvalor_facturaFacturaDiario;
	public JButton jButtonvalor_facturaFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelbase_imponibleFacturaDiario;
	public JLabel jLabelbase_imponibleFacturaDiario;
	public JTextField jTextFieldbase_imponibleFacturaDiario;
	public JButton jButtonbase_imponibleFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelmonto_ivaFacturaDiario;
	public JLabel jLabelmonto_ivaFacturaDiario;
	public JTextField jTextFieldmonto_ivaFacturaDiario;
	public JButton jButtonmonto_ivaFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelbim_tarjetaFacturaDiario;
	public JLabel jLabelbim_tarjetaFacturaDiario;
	public JTextField jTextFieldbim_tarjetaFacturaDiario;
	public JButton jButtonbim_tarjetaFacturaDiarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFacturaDiario;
	public JLabel jLabelid_empresaFacturaDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFacturaDiario;
	public JButton jButtonid_empresaFacturaDiario= new JButtonMe();
	public JButton jButtonid_empresaFacturaDiarioUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFacturaDiario;
	public JLabel jLabelid_sucursalFacturaDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFacturaDiario;
	public JButton jButtonid_sucursalFacturaDiario= new JButtonMe();
	public JButton jButtonid_sucursalFacturaDiarioUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteFacturaDiario;
	public JLabel jLabelid_clienteFacturaDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFacturaDiario;
	public JButton jButtonid_clienteFacturaDiario= new JButtonMe();
	public JButton jButtonid_clienteFacturaDiarioUpdate= new JButtonMe();
	public JButton jButtonid_clienteFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelid_periodo_declaraFacturaDiario;
	public JLabel jLabelid_periodo_declaraFacturaDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraFacturaDiario;
	public JButton jButtonid_periodo_declaraFacturaDiario= new JButtonMe();
	public JButton jButtonid_periodo_declaraFacturaDiarioUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraFacturaDiarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_ivaFacturaDiario;
	public JLabel jLabelid_tipo_ivaFacturaDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ivaFacturaDiario;
	public JButton jButtonid_tipo_ivaFacturaDiario= new JButtonMe();
	public JButton jButtonid_tipo_ivaFacturaDiarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ivaFacturaDiarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturaDiario;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FacturaDiarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturaDiario=new JPanel();
				this.jPanelAccionesFormularioFacturaDiario=new JPanel();
				this.jmenuBarDetalleFacturaDiario=new JMenuBar();
				this.jTtoolBarDetalleFacturaDiario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDiarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FacturaDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturaDiarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FacturaDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDiarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDiarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDiarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturaDiario() {
		return this.jButtonActualizarToolBarFacturaDiario;
	}
	
	public JButton getjButtonEliminarToolBarFacturaDiario() {
		return this.jButtonEliminarToolBarFacturaDiario;
	}
	
	public JButton getjButtonCancelarToolBarFacturaDiario() {
		return this.jButtonCancelarToolBarFacturaDiario;
	}		
	
	public JButton getjButtonProcesarInformacionFacturaDiario() {
		return this.jButtonProcesarInformacionFacturaDiario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaDiario)	{
		this.jButtonProcesarInformacionFacturaDiario = jButtonProcesarInformacionFacturaDiario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaDiario() {
		return this.jComboBoxTiposAccionesFacturaDiario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaDiario(
			JComboBox jComboBoxTiposRelacionesFacturaDiario) {
		this.jComboBoxTiposRelacionesFacturaDiario = jComboBoxTiposRelacionesFacturaDiario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaDiario(
			JComboBox jComboBoxTiposAccionesFacturaDiario) {
		this.jComboBoxTiposAccionesFacturaDiario = jComboBoxTiposAccionesFacturaDiario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturaDiario() {
		return this.jComboBoxTiposAccionesFormularioFacturaDiario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturaDiario(
			JComboBox jComboBoxTiposAccionesFormularioFacturaDiario) {
		this.jComboBoxTiposAccionesFormularioFacturaDiario = jComboBoxTiposAccionesFormularioFacturaDiario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
		
		this.facturadiarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturadiarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturadiarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaDiarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaDiarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaDiarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Diario MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturaDiario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturaDiario=new JButtonMe();
				this.jButtonModificarToolBarFacturaDiario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturaDiario,this.jTtoolBarDetalleFacturaDiario,
							"actualizar","actualizar","Actualizar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturaDiario,this.jTtoolBarDetalleFacturaDiario,
							"eliminar","eliminar","Eliminar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturaDiario,this.jTtoolBarDetalleFacturaDiario,
							"cancelar","cancelar","Cancelar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturaDiario,this.jTtoolBarDetalleFacturaDiario,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturaDiario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturaDiario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturaDiario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturaDiario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturaDiario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaDiario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaDiario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaDiario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturaDiario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturaDiario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturaDiario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturaDiario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturaDiario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturaDiario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturaDiario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturaDiario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturaDiario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturaDiario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturaDiario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturaDiario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturaDiario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaDiario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaDiario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaDiario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaDiario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaDiario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturaDiario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturaDiario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturaDiario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaDiario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaDiario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaDiario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaDiario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaDiario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaDiario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturaDiario.add(this.jMenuItemDetalleCerrarFacturaDiario);
		
		this.jmenuDetalleAccionesFacturaDiario.add(this.jMenuItemActualizarFacturaDiario);
		this.jmenuDetalleAccionesFacturaDiario.add(this.jMenuItemEliminarFacturaDiario);
		this.jmenuDetalleAccionesFacturaDiario.add(this.jMenuItemCancelarFacturaDiario);		
		
		//this.jmenuDetalleDatosFacturaDiario.add(this.jMenuItemDetalleAbrirOrderByFacturaDiario);				
		this.jmenuDetalleDatosFacturaDiario.add(this.jMenuItemDetalleMostarOcultarFacturaDiario);				
				
		//this.jmenuDetalleAccionesFacturaDiario.add(this.jMenuItemGuardarCambiosFacturaDiario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturaDiario.add(this.jmenuDetalleArchivoFacturaDiario);		
		this.jmenuBarDetalleFacturaDiario.add(this.jmenuDetalleAccionesFacturaDiario);		
		this.jmenuBarDetalleFacturaDiario.add(this.jmenuDetalleDatosFacturaDiario);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFacturaDiario);				
	}
	
	
	public void inicializarElementosCamposFacturaDiario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturaDiario = new JLabelMe();
		jLabelIdFacturaDiario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturaDiario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturaDiario= new GridBagLayout();

		this.jPanelidFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);

		jLabelidFacturaDiario = new JLabel();
		jLabelidFacturaDiario.setText("Id");

		jLabelidFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emisionFacturaDiario = new JLabelMe();
		this.jLabelfecha_emisionFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionFacturaDiario.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelfecha_emisionFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		//jFormattedTextFieldfecha_emisionFacturaDiario= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionFacturaDiario= new JDateChooser();
		jDateChooserfecha_emisionFacturaDiario.setEnabled(false);
		jDateChooserfecha_emisionFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionFacturaDiario.setDate(new Date());
		jDateChooserfecha_emisionFacturaDiario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionFacturaDiario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonfecha_emisionFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionFacturaDiarioBusqueda.setText("U");
		this.jButtonfecha_emisionFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionFacturaDiarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoFacturaDiario = new JLabelMe();
		this.jLabelfecha_vencimientoFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoFacturaDiario.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelfecha_vencimientoFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		//jFormattedTextFieldfecha_vencimientoFacturaDiario= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoFacturaDiario= new JDateChooser();
		jDateChooserfecha_vencimientoFacturaDiario.setEnabled(false);
		jDateChooserfecha_vencimientoFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoFacturaDiario.setDate(new Date());
		jDateChooserfecha_vencimientoFacturaDiario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoFacturaDiario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoFacturaDiarioBusqueda.setText("U");
		this.jButtonfecha_vencimientoFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoFacturaDiarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_serieFacturaDiario = new JLabelMe();
		this.jLabelnumero_serieFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE+" : *");
		this.jLabelnumero_serieFacturaDiario.setToolTipText("Numero Serie");
		this.jLabelnumero_serieFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serieFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serieFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serieFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelnumero_serieFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jTextFieldnumero_serieFacturaDiario= new JTextFieldMe();

		jTextFieldnumero_serieFacturaDiario.setEnabled(false);
		jTextFieldnumero_serieFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serieFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_serieFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonnumero_serieFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serieFacturaDiarioBusqueda.setText("U");
		this.jButtonnumero_serieFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serieFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serieFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serieFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serieFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serieFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serieFacturaDiarioBusqueda.setVisible(false);		}


					
		this.jLabelrucFacturaDiario = new JLabelMe();
		this.jLabelrucFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucFacturaDiario.setToolTipText("Ruc");
		this.jLabelrucFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelrucFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jTextFieldrucFacturaDiario= new JTextFieldMe();

		jTextFieldrucFacturaDiario.setEnabled(false);
		jTextFieldrucFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonrucFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucFacturaDiarioBusqueda.setText("U");
		this.jButtonrucFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucFacturaDiarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizaFacturaDiario = new JLabelMe();
		this.jLabelnumero_autorizaFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA+" : *");
		this.jLabelnumero_autorizaFacturaDiario.setToolTipText("Numero Autoriza");
		this.jLabelnumero_autorizaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizaFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizaFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelnumero_autorizaFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jTextFieldnumero_autorizaFacturaDiario= new JTextFieldMe();

		jTextFieldnumero_autorizaFacturaDiario.setEnabled(false);
		jTextFieldnumero_autorizaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizaFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonnumero_autorizaFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizaFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizaFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizaFacturaDiarioBusqueda.setText("U");
		this.jButtonnumero_autorizaFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizaFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizaFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizaFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizaFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizaFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizaFacturaDiarioBusqueda.setVisible(false);		}


					
		this.jLabeles_devolucionFacturaDiario = new JLabelMe();
		this.jLabeles_devolucionFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION+" : *");
		this.jLabeles_devolucionFacturaDiario.setToolTipText("Es Devolucion");
		this.jLabeles_devolucionFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_devolucionFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_devolucionFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_devolucionFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_devolucionFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_devolucionFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPaneles_devolucionFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jCheckBoxes_devolucionFacturaDiario= new JCheckBoxMe();
		jCheckBoxes_devolucionFacturaDiario.setEnabled(false);

		jCheckBoxes_devolucionFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_devolucionFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_devolucionFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_devolucionFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_devolucionFacturaDiarioBusqueda= new JButtonMe();
		this.jButtones_devolucionFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_devolucionFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_devolucionFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_devolucionFacturaDiarioBusqueda.setText("U");
		this.jButtones_devolucionFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_devolucionFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_devolucionFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_devolucionFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_devolucionFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_devolucionFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_devolucionFacturaDiarioBusqueda.setVisible(false);		}


					
		this.jLabelvalor_facturaFacturaDiario = new JLabelMe();
		this.jLabelvalor_facturaFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA+" : *");
		this.jLabelvalor_facturaFacturaDiario.setToolTipText("Valor Factura");
		this.jLabelvalor_facturaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_facturaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_facturaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_facturaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_facturaFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_facturaFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelvalor_facturaFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jTextFieldvalor_facturaFacturaDiario= new JTextFieldMe();
		jTextFieldvalor_facturaFacturaDiario.setEnabled(false);
		jTextFieldvalor_facturaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_facturaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_facturaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_facturaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_facturaFacturaDiario.setText("0.0");

		this.jButtonvalor_facturaFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonvalor_facturaFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_facturaFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_facturaFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_facturaFacturaDiarioBusqueda.setText("U");
		this.jButtonvalor_facturaFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_facturaFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_facturaFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_facturaFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_facturaFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_facturaFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_facturaFacturaDiarioBusqueda.setVisible(false);		}


					
		this.jLabelbase_imponibleFacturaDiario = new JLabelMe();
		this.jLabelbase_imponibleFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE+" : *");
		this.jLabelbase_imponibleFacturaDiario.setToolTipText("Base Imponible");
		this.jLabelbase_imponibleFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_imponibleFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_imponibleFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_imponibleFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelbase_imponibleFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jTextFieldbase_imponibleFacturaDiario= new JTextFieldMe();
		jTextFieldbase_imponibleFacturaDiario.setEnabled(false);
		jTextFieldbase_imponibleFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_imponibleFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_imponibleFacturaDiario.setText("0.0");

		this.jButtonbase_imponibleFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonbase_imponibleFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_imponibleFacturaDiarioBusqueda.setText("U");
		this.jButtonbase_imponibleFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_imponibleFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_imponibleFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_imponibleFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_imponibleFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_imponibleFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_imponibleFacturaDiarioBusqueda.setVisible(false);		}


					
		this.jLabelmonto_ivaFacturaDiario = new JLabelMe();
		this.jLabelmonto_ivaFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_MONTOIVA+" : *");
		this.jLabelmonto_ivaFacturaDiario.setToolTipText("Monto Iva");
		this.jLabelmonto_ivaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_ivaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_ivaFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_ivaFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_MONTOIVA);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelmonto_ivaFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jTextFieldmonto_ivaFacturaDiario= new JTextFieldMe();
		jTextFieldmonto_ivaFacturaDiario.setEnabled(false);
		jTextFieldmonto_ivaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_ivaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_ivaFacturaDiario.setText("0.0");

		this.jButtonmonto_ivaFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonmonto_ivaFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_ivaFacturaDiarioBusqueda.setText("U");
		this.jButtonmonto_ivaFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_ivaFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_ivaFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_ivaFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_ivaFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_ivaFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_ivaFacturaDiarioBusqueda.setVisible(false);		}


					
		this.jLabelbim_tarjetaFacturaDiario = new JLabelMe();
		this.jLabelbim_tarjetaFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA+" : *");
		this.jLabelbim_tarjetaFacturaDiario.setToolTipText("Bim Tarjeta");
		this.jLabelbim_tarjetaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbim_tarjetaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbim_tarjetaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbim_tarjetaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbim_tarjetaFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbim_tarjetaFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelbim_tarjetaFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jTextFieldbim_tarjetaFacturaDiario= new JTextFieldMe();
		jTextFieldbim_tarjetaFacturaDiario.setEnabled(false);
		jTextFieldbim_tarjetaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbim_tarjetaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbim_tarjetaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbim_tarjetaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbim_tarjetaFacturaDiario.setText("0.0");

		this.jButtonbim_tarjetaFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonbim_tarjetaFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbim_tarjetaFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbim_tarjetaFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbim_tarjetaFacturaDiarioBusqueda.setText("U");
		this.jButtonbim_tarjetaFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbim_tarjetaFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbim_tarjetaFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbim_tarjetaFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbim_tarjetaFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bim_tarjetaFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbim_tarjetaFacturaDiarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFacturaDiario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFacturaDiario = new JLabelMe();
		this.jLabelid_empresaFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFacturaDiario.setToolTipText("Empresa");
		this.jLabelid_empresaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelid_empresaFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jComboBoxid_empresaFacturaDiario= new JComboBoxMe();
		jComboBoxid_empresaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFacturaDiario.setEnabled(false);

		this.jButtonid_empresaFacturaDiario= new JButtonMe();
		this.jButtonid_empresaFacturaDiario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaDiario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaDiario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaDiario.setText("Buscar");
		this.jButtonid_empresaFacturaDiario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFacturaDiario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaDiario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaDiario"));

		this.jButtonid_empresaFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaDiarioBusqueda.setText("U");
		this.jButtonid_empresaFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturaDiarioBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturaDiarioUpdate= new JButtonMe();
		this.jButtonid_empresaFacturaDiarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaDiarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaDiarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaDiarioUpdate.setText("U");
		this.jButtonid_empresaFacturaDiarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturaDiarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaDiarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaDiarioUpdate"));



					
		this.jLabelid_sucursalFacturaDiario = new JLabelMe();
		this.jLabelid_sucursalFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFacturaDiario.setToolTipText("Sucursal");
		this.jLabelid_sucursalFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelid_sucursalFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jComboBoxid_sucursalFacturaDiario= new JComboBoxMe();
		jComboBoxid_sucursalFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFacturaDiario.setEnabled(false);

		this.jButtonid_sucursalFacturaDiario= new JButtonMe();
		this.jButtonid_sucursalFacturaDiario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaDiario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaDiario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaDiario.setText("Buscar");
		this.jButtonid_sucursalFacturaDiario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFacturaDiario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaDiario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaDiario"));

		this.jButtonid_sucursalFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonid_sucursalFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaDiarioBusqueda.setText("U");
		this.jButtonid_sucursalFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFacturaDiarioBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFacturaDiarioUpdate= new JButtonMe();
		this.jButtonid_sucursalFacturaDiarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaDiarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaDiarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaDiarioUpdate.setText("U");
		this.jButtonid_sucursalFacturaDiarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFacturaDiarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaDiarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaDiarioUpdate"));



					
		this.jLabelid_clienteFacturaDiario = new JLabelMe();
		this.jLabelid_clienteFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteFacturaDiario.setToolTipText("Cliente");
		this.jLabelid_clienteFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelid_clienteFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jComboBoxid_clienteFacturaDiario= new JComboBoxMe();
		jComboBoxid_clienteFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteFacturaDiario= new JButtonMe();
		this.jButtonid_clienteFacturaDiario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaDiario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaDiario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaDiario.setText("Buscar");
		this.jButtonid_clienteFacturaDiario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteFacturaDiario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaDiario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaDiario"));

		this.jButtonid_clienteFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonid_clienteFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturaDiarioBusqueda.setText("U");
		this.jButtonid_clienteFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteFacturaDiarioBusqueda.setVisible(false);		}

		this.jButtonid_clienteFacturaDiarioUpdate= new JButtonMe();
		this.jButtonid_clienteFacturaDiarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaDiarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaDiarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturaDiarioUpdate.setText("U");
		this.jButtonid_clienteFacturaDiarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteFacturaDiarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaDiarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaDiarioUpdate"));



					
		this.jLabelid_periodo_declaraFacturaDiario = new JLabelMe();
		this.jLabelid_periodo_declaraFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA+" : *");
		this.jLabelid_periodo_declaraFacturaDiario.setToolTipText("Periodo Declara");
		this.jLabelid_periodo_declaraFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodo_declaraFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodo_declaraFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelid_periodo_declaraFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jComboBoxid_periodo_declaraFacturaDiario= new JComboBoxMe();
		jComboBoxid_periodo_declaraFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodo_declaraFacturaDiario= new JButtonMe();
		this.jButtonid_periodo_declaraFacturaDiario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraFacturaDiario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraFacturaDiario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraFacturaDiario.setText("Buscar");
		this.jButtonid_periodo_declaraFacturaDiario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodo_declaraFacturaDiario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraFacturaDiario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodo_declaraFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraFacturaDiario"));

		this.jButtonid_periodo_declaraFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonid_periodo_declaraFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraFacturaDiarioBusqueda.setText("U");
		this.jButtonid_periodo_declaraFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodo_declaraFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodo_declaraFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodo_declaraFacturaDiarioBusqueda.setVisible(false);		}

		this.jButtonid_periodo_declaraFacturaDiarioUpdate= new JButtonMe();
		this.jButtonid_periodo_declaraFacturaDiarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraFacturaDiarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraFacturaDiarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraFacturaDiarioUpdate.setText("U");
		this.jButtonid_periodo_declaraFacturaDiarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodo_declaraFacturaDiarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraFacturaDiarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodo_declaraFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraFacturaDiarioUpdate"));



					
		this.jLabelid_tipo_ivaFacturaDiario = new JLabelMe();
		this.jLabelid_tipo_ivaFacturaDiario.setText(""+FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA+" : *");
		this.jLabelid_tipo_ivaFacturaDiario.setToolTipText("Tipo Iva");
		this.jLabelid_tipo_ivaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ivaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_ivaFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_ivaFacturaDiario.setToolTipText(FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA);
		this.gridaBagLayoutFacturaDiario = new GridBagLayout();
		this.jPanelid_tipo_ivaFacturaDiario.setLayout(this.gridaBagLayoutFacturaDiario);


		jComboBoxid_tipo_ivaFacturaDiario= new JComboBoxMe();
		jComboBoxid_tipo_ivaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ivaFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_ivaFacturaDiario= new JButtonMe();
		this.jButtonid_tipo_ivaFacturaDiario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaFacturaDiario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaFacturaDiario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaFacturaDiario.setText("Buscar");
		this.jButtonid_tipo_ivaFacturaDiario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_ivaFacturaDiario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaFacturaDiario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_ivaFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaFacturaDiario"));

		this.jButtonid_tipo_ivaFacturaDiarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_ivaFacturaDiarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaFacturaDiarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaFacturaDiarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaFacturaDiarioBusqueda.setText("U");
		this.jButtonid_tipo_ivaFacturaDiarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_ivaFacturaDiarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaFacturaDiarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_ivaFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaFacturaDiarioBusqueda"));

		if(this.facturadiarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_ivaFacturaDiarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_ivaFacturaDiarioUpdate= new JButtonMe();
		this.jButtonid_tipo_ivaFacturaDiarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaFacturaDiarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaFacturaDiarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaFacturaDiarioUpdate.setText("U");
		this.jButtonid_tipo_ivaFacturaDiarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_ivaFacturaDiarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaFacturaDiarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_ivaFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaFacturaDiarioUpdate"));



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
		//this.jInternalFrameDetalleFacturaDiario = new FacturaDiarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Factura Diario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaDiario= new GridBagLayout();
		

		
		String sToolTipFacturaDiario="";
		sToolTipFacturaDiario=FacturaDiarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaDiario+="(Sris.FacturaDiario)";
		}
		
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaDiario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturaDiario = new JButtonMe();
		this.jButtonModificarFacturaDiario = new JButtonMe();
        this.jButtonActualizarFacturaDiario = new JButtonMe();
        this.jButtonEliminarFacturaDiario = new JButtonMe();
        this.jButtonCancelarFacturaDiario = new JButtonMe();
        this.jButtonGuardarCambiosFacturaDiario = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturaDiario = new JButtonMe();
		this.jButtonCerrarFacturaDiario = new JButtonMe();
		
		this.jScrollPanelDatosFacturaDiario = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturaDiario = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturaDiario = new JScrollPane();
				
		
		
		this.jPanelCamposFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Factura Diario";
		
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Diarios" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaDiario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFacturaDiario.setName("jPanelCamposFacturaDiario"); 

		this.jPanelCamposOcultosFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturaDiario.setName("jPanelCamposOcultosFacturaDiario"); 

        this.jPanelAccionesFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaDiario.setToolTipText("Acciones");
        this.jPanelAccionesFacturaDiario.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturaDiario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturaDiario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturaDiario.setText("Nuevo");
		this.jButtonModificarFacturaDiario.setText("Editar");
        this.jButtonActualizarFacturaDiario.setText("Actualizar");
        this.jButtonEliminarFacturaDiario.setText("Eliminar");
        this.jButtonCancelarFacturaDiario.setText("Cancelar");
        this.jButtonGuardarCambiosFacturaDiario.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturaDiario.setText("Guardar");
		this.jButtonCerrarFacturaDiario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaDiario,"nuevo_button","Nuevo",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturaDiario,"modificar_button","Editar",this.facturadiarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturaDiario,"actualizar_button","Actualizar",this.facturadiarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturaDiario,"eliminar_button","Eliminar",this.facturadiarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturaDiario,"cancelar_button","Cancelar",this.facturadiarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturaDiario,"guardarcambios_button","Guardar",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaDiario,"guardarcambiostabla_button","Guardar",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaDiario,"cerrar_button","Salir",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturaDiario.setToolTipText("Nuevo"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturaDiario.setToolTipText("Editar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturaDiario.setToolTipText("Actualizar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturaDiario.setToolTipText("Eliminar)"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturaDiario.setToolTipText("Cancelar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturaDiario.setToolTipText("Guardar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturaDiario.setToolTipText("Guardar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaDiario.setToolTipText("Salir"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaDiario";
		inputMap = this.jButtonNuevoFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaDiario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaDiario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturaDiario";
		inputMap = this.jButtonActualizarFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturaDiario"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturaDiario";
		inputMap = this.jButtonEliminarFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturaDiario"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturaDiario";
		inputMap = this.jButtonCancelarFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturaDiario"));
		
		//CERRAR		
		sMapKey = "CerrarFacturaDiario";
		inputMap = this.jButtonCerrarFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaDiario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaDiario";
		inputMap = this.jButtonGuardarCambiosTablaFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaDiario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturaDiario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturaDiario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturaDiario.setToolTipText("Nuevo FacturaDiario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturaDiario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturaDiario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturaDiario.setToolTipText("Sin Cerrar Ventana FacturaDiario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturaDiario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturaDiario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturaDiario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturaDiario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaDiario.setText("Accion");
		this.jComboBoxTiposAccionesFacturaDiario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturaDiario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturaDiario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturaDiario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturaDiario = new JLabelMe();
		
		this.jLabelAccionesFacturaDiario.setText("Acciones");		
		this.jLabelAccionesFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturaDiario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturaDiario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturaDiario=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturaDiario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturaDiario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaDiario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaDiario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturaDiario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaDiario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaDiario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturaDiario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturaDiario = new GridBagLayout();
		
		this.jPanelCamposFacturaDiario.setLayout(gridaBagLayoutCamposFacturaDiario);
		this.jPanelCamposOcultosFacturaDiario.setLayout(gridaBagLayoutCamposOcultosFacturaDiario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFacturaDiario.add(jLabelIdFacturaDiario, this.gridBagConstraintsFacturaDiario);



	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFacturaDiario.add(jLabelidFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFacturaDiario.add(jLabelid_empresaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaDiario.add(jButtonid_empresaFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 3;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaDiario.add(jButtonid_empresaFacturaDiarioUpdate, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFacturaDiario.add(jComboBoxid_empresaFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFacturaDiario.add(jLabelid_sucursalFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturaDiario.add(jButtonid_sucursalFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 3;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturaDiario.add(jButtonid_sucursalFacturaDiarioUpdate, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFacturaDiario.add(jComboBoxid_sucursalFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteFacturaDiario.add(jLabelid_clienteFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 2;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteFacturaDiario.add(jButtonid_clienteFacturaDiario, this.gridBagConstraintsFacturaDiario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 3;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturaDiario.add(jButtonid_clienteFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 4;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturaDiario.add(jButtonid_clienteFacturaDiarioUpdate, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteFacturaDiario.add(jComboBoxid_clienteFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodo_declaraFacturaDiario.add(jLabelid_periodo_declaraFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraFacturaDiario.add(jButtonid_periodo_declaraFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 3;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraFacturaDiario.add(jButtonid_periodo_declaraFacturaDiarioUpdate, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodo_declaraFacturaDiario.add(jComboBoxid_periodo_declaraFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_ivaFacturaDiario.add(jLabelid_tipo_ivaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaFacturaDiario.add(jButtonid_tipo_ivaFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 3;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaFacturaDiario.add(jButtonid_tipo_ivaFacturaDiarioUpdate, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_ivaFacturaDiario.add(jComboBoxid_tipo_ivaFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionFacturaDiario.add(jLabelfecha_emisionFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionFacturaDiario.add(jButtonfecha_emisionFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionFacturaDiario.add(jDateChooserfecha_emisionFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoFacturaDiario.add(jLabelfecha_vencimientoFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoFacturaDiario.add(jButtonfecha_vencimientoFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoFacturaDiario.add(jDateChooserfecha_vencimientoFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_serieFacturaDiario.add(jLabelnumero_serieFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serieFacturaDiario.add(jButtonnumero_serieFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_serieFacturaDiario.add(jTextFieldnumero_serieFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucFacturaDiario.add(jLabelrucFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucFacturaDiario.add(jButtonrucFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucFacturaDiario.add(jTextFieldrucFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_autorizaFacturaDiario.add(jLabelnumero_autorizaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizaFacturaDiario.add(jButtonnumero_autorizaFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_autorizaFacturaDiario.add(jTextFieldnumero_autorizaFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_devolucionFacturaDiario.add(jLabeles_devolucionFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_devolucionFacturaDiario.add(jButtones_devolucionFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_devolucionFacturaDiario.add(jCheckBoxes_devolucionFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_facturaFacturaDiario.add(jLabelvalor_facturaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_facturaFacturaDiario.add(jButtonvalor_facturaFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_facturaFacturaDiario.add(jTextFieldvalor_facturaFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_imponibleFacturaDiario.add(jLabelbase_imponibleFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_imponibleFacturaDiario.add(jButtonbase_imponibleFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_imponibleFacturaDiario.add(jTextFieldbase_imponibleFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_ivaFacturaDiario.add(jLabelmonto_ivaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_ivaFacturaDiario.add(jButtonmonto_ivaFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_ivaFacturaDiario.add(jTextFieldmonto_ivaFacturaDiario, this.gridBagConstraintsFacturaDiario);


	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 0;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbim_tarjetaFacturaDiario.add(jLabelbim_tarjetaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 2;
		this.gridBagConstraintsFacturaDiario.ipadx = 0;
		this.gridBagConstraintsFacturaDiario.insets = new Insets(0, 0, 0, 0);
		this.jPanelbim_tarjetaFacturaDiario.add(jButtonbim_tarjetaFacturaDiarioBusqueda, this.gridBagConstraintsFacturaDiario);
	}

	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDiario.gridy = 0;
	this.gridBagConstraintsFacturaDiario.gridx = 1;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbim_tarjetaFacturaDiario.add(jTextFieldbim_tarjetaFacturaDiario, this.gridBagConstraintsFacturaDiario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelidFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelid_clienteFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelid_periodo_declaraFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelid_tipo_ivaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelfecha_emisionFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelfecha_vencimientoFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelnumero_serieFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelrucFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelnumero_autorizaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPaneles_devolucionFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelvalor_facturaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelbase_imponibleFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelmonto_ivaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDiario.add(this.jPanelbim_tarjetaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposFacturaDiario % 2==0) {
		iXPanelCamposFacturaDiario=0;
		iYPanelCamposFacturaDiario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposOcultosFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposOcultosFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturaDiario.add(this.jPanelid_empresaFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposOcultosFacturaDiario % 2==0) {
		iXPanelCamposOcultosFacturaDiario=0;
		iYPanelCamposOcultosFacturaDiario++;
	}
	this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDiario.gridy = iYPanelCamposOcultosFacturaDiario;
	this.gridBagConstraintsFacturaDiario.gridx = iXPanelCamposOcultosFacturaDiario++;
	this.gridBagConstraintsFacturaDiario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDiario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturaDiario.add(this.jPanelid_sucursalFacturaDiario, this.gridBagConstraintsFacturaDiario);



	if(iXPanelCamposOcultosFacturaDiario % 2==0) {
		iXPanelCamposOcultosFacturaDiario=0;
		iYPanelCamposOcultosFacturaDiario++;
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
			
		GridBagLayout gridaBagLayoutAccionesFacturaDiario= new GridBagLayout();
		this.jPanelAccionesFacturaDiario.setLayout(gridaBagLayoutAccionesFacturaDiario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturaDiario= new GridBagLayout();
		this.jPanelAccionesFormularioFacturaDiario.setLayout(gridaBagLayoutAccionesFormularioFacturaDiario);
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturaDiario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturaDiario.add(this.jComboBoxTiposAccionesFormularioFacturaDiario, this.gridBagConstraintsFacturaDiario);

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturaDiario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturaDiario.add(this.jCheckBoxPostAccionNuevoFacturaDiario, this.gridBagConstraintsFacturaDiario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.facturadiarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFacturaDiario.add(this.jCheckBoxPostAccionSinCerrarFacturaDiario, this.gridBagConstraintsFacturaDiario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.facturadiarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFacturaDiario.add(this.jCheckBoxPostAccionSinMensajeFacturaDiario, this.gridBagConstraintsFacturaDiario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturaDiario.add(this.jButtonModificarFacturaDiario, this.gridBagConstraintsFacturaDiario);							

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturaDiario.add(this.jButtonEliminarFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
			
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = 0;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaDiario.add(this.jButtonActualizarFacturaDiario, this.gridBagConstraintsFacturaDiario);


		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = 0;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaDiario.add(this.jButtonGuardarCambiosFacturaDiario, this.gridBagConstraintsFacturaDiario);	
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = 0;		
		this.gridBagConstraintsFacturaDiario.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturaDiario.add(this.jButtonCancelarFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaDiario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaDiario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();						
			this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaDiario.gridx = 0;		
			//this.gridBagConstraintsFacturaDiario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaDiario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaDiario.gridx =0;
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaDiario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaDiario, this.gridBagConstraintsFacturaDiario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturaDiarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturaDiario = new FacturaDiarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Factura Diario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Factura Diario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Factura Diario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturaDiarioModel facturadiarioModel=new FacturaDiarioModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturaDiarioModel.FacturaDiarioFocusTraversalPolicy facturadiarioFocusTraversalPolicy = facturadiarioModel.new FacturaDiarioFocusTraversalPolicy(this);
			
			//facturadiarioFocusTraversalPolicy.setfacturadiarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturadiarioModel);
			
			
			this.jContentPaneDetalleFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturaDiario = new GridBagLayout();	
			this.jContentPaneDetalleFacturaDiario.setLayout(gridaBagLayoutDetalleFacturaDiario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaDiario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
				this.gridBagConstraintsFacturaDiario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFacturaDiario.gridx = 0;
					
				
				this.jContentPaneDetalleFacturaDiario.add(jTtoolBarDetalleFacturaDiario, gridBagConstraintsFacturaDiario);								
				
}
			
			this.jScrollPanelDatosEdicionFacturaDiario=   new JScrollPane(jContentPaneDetalleFacturaDiario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaDiario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaDiario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaDiario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturaDiario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaDiario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaDiario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaDiario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFacturaDiario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFacturaDiario.gridx = 0;
	        
			this.jContentPaneDetalleFacturaDiario.add(jPanelCamposFacturaDiario, gridBagConstraintsFacturaDiario);
			
			
			
			
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
						&& facturadiarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.facturadiarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturaDiario= new GridBagConstraints();
						this.gridBagConstraintsFacturaDiario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturaDiario.gridx = 0;
						this.jContentPaneDetalleFacturaDiario.add(this.jTabbedPaneRelacionesFacturaDiario, this.gridBagConstraintsFacturaDiario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturaDiario.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturaDiario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
					this.gridBagConstraintsFacturaDiario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturaDiario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturaDiario.gridx = 0;
					
				
					this.jContentPaneDetalleFacturaDiario.add(jPanelCamposOcultosFacturaDiario, gridBagConstraintsFacturaDiario);
				
					this.jPanelCamposOcultosFacturaDiario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFacturaDiario.gridx = 0;
	        this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFacturaDiario.add(this.jPanelAccionesFormularioFacturaDiario, this.gridBagConstraintsFacturaDiario);							
			
			
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
	        this.gridBagConstraintsFacturaDiario.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFacturaDiario.gridx = 0;
	        
			
			this.jContentPaneDetalleFacturaDiario.add(this.jPanelAccionesFacturaDiario, this.gridBagConstraintsFacturaDiario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturaDiario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturaDiario=   new JScrollPane(this.jPanelCamposFacturaDiario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaDiario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaDiario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaDiario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturaDiario.gridx = 0;
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturaDiario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturaDiario, this.gridBagConstraintsFacturaDiario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaDiario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturaDiario, this.gridBagConstraintsFacturaDiario);			
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaDiario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturaDiario, this.gridBagConstraintsFacturaDiario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDiario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaDiario, this.gridBagConstraintsFacturaDiario);
			
			
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDiario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
			
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDiario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaDiario, this.gridBagConstraintsFacturaDiario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturaDiario;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturaDiario;
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
