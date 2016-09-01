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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.FacturasProveedoresConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class FacturasProveedoresDetalleFormJInternalFrame extends FacturasProveedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturasProveedores;
	
	protected JMenuBar jmenuBarDetalleFacturasProveedores;
	
	protected JMenu jmenuDetalleFacturasProveedores;
	protected JMenu jmenuDetalleArchivoFacturasProveedores;
	protected JMenu jmenuDetalleAccionesFacturasProveedores;
	protected JMenu jmenuDetalleDatosFacturasProveedores;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturasProveedores;	
	protected GridBagConstraints gridBagConstraintsFacturasProveedores;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturasProveedoresBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturasProveedores;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public FacturasProveedoresSessionBean facturasproveedoresSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public FacturasProveedoresLogic facturasproveedoresLogic;
	
	public JScrollPane jScrollPanelDatosFacturasProveedores;
	public JScrollPane jScrollPanelDatosEdicionFacturasProveedores;
	public JScrollPane jScrollPanelDatosGeneralFacturasProveedores;
	
	protected JPanel jPanelCamposFacturasProveedores;    
	protected JPanel jPanelCamposOcultosFacturasProveedores;    	
	protected JPanel jPanelAccionesFacturasProveedores;
	protected JPanel jPanelAccionesFormularioFacturasProveedores;
    
	
	
	protected Integer iXPanelCamposFacturasProveedores=0;
	protected Integer iYPanelCamposFacturasProveedores=0;
	
	protected Integer iXPanelCamposOcultosFacturasProveedores=0;
	protected Integer iYPanelCamposOcultosFacturasProveedores=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturasProveedores;
	public JButton jButtonModificarFacturasProveedores;
	public JButton jButtonActualizarFacturasProveedores;
    public JButton jButtonEliminarFacturasProveedores;
	public JButton jButtonCancelarFacturasProveedores;
    public JButton jButtonGuardarCambiosFacturasProveedores;
	public JButton jButtonGuardarCambiosTablaFacturasProveedores;
	protected JButton jButtonCerrarFacturasProveedores;
	
	
	protected JButton jButtonProcesarInformacionFacturasProveedores;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturasProveedores;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturasProveedores;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturasProveedores;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturasProveedores;
	protected JButton jButtonModificarToolBarFacturasProveedores;
	protected JButton jButtonActualizarToolBarFacturasProveedores;
    protected JButton jButtonEliminarToolBarFacturasProveedores;
	protected JButton jButtonCancelarToolBarFacturasProveedores;
    protected JButton jButtonGuardarCambiosToolBarFacturasProveedores;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturasProveedores;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturasProveedores;
	protected JButton jButtonCerrarToolBarFacturasProveedores;
	
	protected JButton jButtonProcesarInformacionToolBarFacturasProveedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturasProveedores;
	protected JMenuItem jMenuItemModificarFacturasProveedores;
	protected JMenuItem jMenuItemActualizarFacturasProveedores;
    protected JMenuItem jMenuItemEliminarFacturasProveedores;
	protected JMenuItem jMenuItemCancelarFacturasProveedores;
    protected JMenuItem jMenuItemGuardarCambiosFacturasProveedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturasProveedores;
	protected JMenuItem jMenuItemCerrarFacturasProveedores;
	protected JMenuItem jMenuItemDetalleCerrarFacturasProveedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturasProveedores;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturasProveedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturasProveedores;
	protected JMenuItem jMenuItemMostrarOcultarFacturasProveedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturasProveedores;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturasProveedores;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturasProveedores;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturasProveedores;
	public JLabel jLabelIdFacturasProveedores;
	public JLabel jLabelidFacturasProveedores;
	public JButton jButtonidFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_inicioFacturasProveedores;
	public JLabel jLabelfecha_emision_inicioFacturasProveedores;
	//public JFormattedTextField jDateChooserfecha_emision_inicioFacturasProveedores;

	public JDateChooser jDateChooserfecha_emision_inicioFacturasProveedores;
	public JButton jButtonfecha_emision_inicioFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_finFacturasProveedores;
	public JLabel jLabelfecha_emision_finFacturasProveedores;
	//public JFormattedTextField jDateChooserfecha_emision_finFacturasProveedores;

	public JDateChooser jDateChooserfecha_emision_finFacturasProveedores;
	public JButton jButtonfecha_emision_finFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_clienteFacturasProveedores;
	public JLabel jLabelcodigo_clienteFacturasProveedores;
	public JTextField jTextFieldcodigo_clienteFacturasProveedores;
	public JButton jButtoncodigo_clienteFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteFacturasProveedores;
	public JLabel jLabelnombre_clienteFacturasProveedores;
	public JTextArea jTextAreanombre_clienteFacturasProveedores;
	public JScrollPane jscrollPanenombre_clienteFacturasProveedores;
	public JButton jButtonnombre_clienteFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaFacturasProveedores;
	public JLabel jLabelnumero_facturaFacturasProveedores;
	public JTextField jTextFieldnumero_facturaFacturasProveedores;
	public JButton jButtonnumero_facturaFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionFacturasProveedores;
	public JLabel jLabelfecha_emisionFacturasProveedores;
	//public JFormattedTextField jDateChooserfecha_emisionFacturasProveedores;

	public JDateChooser jDateChooserfecha_emisionFacturasProveedores;
	public JButton jButtonfecha_emisionFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPaneltotalFacturasProveedores;
	public JLabel jLabeltotalFacturasProveedores;
	public JTextField jTextFieldtotalFacturasProveedores;
	public JButton jButtontotalFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoFacturasProveedores;
	public JLabel jLabelnumero_pre_impresoFacturasProveedores;
	public JTextField jTextFieldnumero_pre_impresoFacturasProveedores;
	public JButton jButtonnumero_pre_impresoFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfechaFacturasProveedores;
	public JLabel jLabelfechaFacturasProveedores;
	//public JFormattedTextField jDateChooserfechaFacturasProveedores;

	public JDateChooser jDateChooserfechaFacturasProveedores;
	public JButton jButtonfechaFacturasProveedoresBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFacturasProveedores;
	public JLabel jLabelid_empresaFacturasProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFacturasProveedores;
	public JButton jButtonid_empresaFacturasProveedores= new JButtonMe();
	public JButton jButtonid_empresaFacturasProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteFacturasProveedores;
	public JLabel jLabelid_clienteFacturasProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFacturasProveedores;
	public JButton jButtonid_clienteFacturasProveedores= new JButtonMe();
	public JButton jButtonid_clienteFacturasProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_clienteFacturasProveedoresBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturasProveedores;
	
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FacturasProveedoresDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturasProveedores=new JPanel();
				this.jPanelAccionesFormularioFacturasProveedores=new JPanel();
				this.jmenuBarDetalleFacturasProveedores=new JMenuBar();
				this.jTtoolBarDetalleFacturasProveedores=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasProveedoresDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturasProveedoresDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasProveedoresDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasProveedoresDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasProveedoresDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturasProveedores() {
		return this.jButtonActualizarToolBarFacturasProveedores;
	}
	
	public JButton getjButtonEliminarToolBarFacturasProveedores() {
		return this.jButtonEliminarToolBarFacturasProveedores;
	}
	
	public JButton getjButtonCancelarToolBarFacturasProveedores() {
		return this.jButtonCancelarToolBarFacturasProveedores;
	}		
	
	public JButton getjButtonProcesarInformacionFacturasProveedores() {
		return this.jButtonProcesarInformacionFacturasProveedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturasProveedores)	{
		this.jButtonProcesarInformacionFacturasProveedores = jButtonProcesarInformacionFacturasProveedores;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturasProveedores() {
		return this.jComboBoxTiposAccionesFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturasProveedores(
			JComboBox jComboBoxTiposRelacionesFacturasProveedores) {
		this.jComboBoxTiposRelacionesFacturasProveedores = jComboBoxTiposRelacionesFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturasProveedores(
			JComboBox jComboBoxTiposAccionesFacturasProveedores) {
		this.jComboBoxTiposAccionesFacturasProveedores = jComboBoxTiposAccionesFacturasProveedores;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturasProveedores() {
		return this.jComboBoxTiposAccionesFormularioFacturasProveedores;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturasProveedores(
			JComboBox jComboBoxTiposAccionesFormularioFacturasProveedores) {
		this.jComboBoxTiposAccionesFormularioFacturasProveedores = jComboBoxTiposAccionesFormularioFacturasProveedores;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturasproveedoresSessionBean=new FacturasProveedoresSessionBean();
		
		this.facturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturasproveedoresSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturasProveedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturas Proveedores MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturasProveedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturasProveedores= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturasProveedores=new JButtonMe();
				this.jButtonModificarToolBarFacturasProveedores=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"actualizar","actualizar","Actualizar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"eliminar","eliminar","Eliminar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"cancelar","cancelar","Cancelar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturasProveedores=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturasProveedores=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturasProveedores=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturasProveedores=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturasProveedores=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturasProveedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturasProveedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturasProveedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturasProveedores= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturasProveedores.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturasProveedores,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturasProveedores= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturasProveedores.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturasProveedores,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturasProveedores= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturasProveedores.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturasProveedores,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturasProveedores= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturasProveedores.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturasProveedores,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturasProveedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturasProveedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturasProveedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturasProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturasProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturasProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturasProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturasProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturasProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturasProveedores.add(this.jMenuItemDetalleCerrarFacturasProveedores);
		
		this.jmenuDetalleAccionesFacturasProveedores.add(this.jMenuItemActualizarFacturasProveedores);
		this.jmenuDetalleAccionesFacturasProveedores.add(this.jMenuItemEliminarFacturasProveedores);
		this.jmenuDetalleAccionesFacturasProveedores.add(this.jMenuItemCancelarFacturasProveedores);		
		
		//this.jmenuDetalleDatosFacturasProveedores.add(this.jMenuItemDetalleAbrirOrderByFacturasProveedores);				
		this.jmenuDetalleDatosFacturasProveedores.add(this.jMenuItemDetalleMostarOcultarFacturasProveedores);				
				
		//this.jmenuDetalleAccionesFacturasProveedores.add(this.jMenuItemGuardarCambiosFacturasProveedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturasProveedores.add(this.jmenuDetalleArchivoFacturasProveedores);		
		this.jmenuBarDetalleFacturasProveedores.add(this.jmenuDetalleAccionesFacturasProveedores);		
		this.jmenuBarDetalleFacturasProveedores.add(this.jmenuDetalleDatosFacturasProveedores);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFacturasProveedores);				
	}
	
	
	public void inicializarElementosCamposFacturasProveedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturasProveedores = new JLabelMe();
		jLabelIdFacturasProveedores.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturasProveedores = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturasProveedores= new GridBagLayout();

		this.jPanelidFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);

		jLabelidFacturasProveedores = new JLabel();
		jLabelidFacturasProveedores.setText("Id");

		jLabelidFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_inicioFacturasProveedores = new JLabelMe();
		this.jLabelfecha_emision_inicioFacturasProveedores.setText(""+FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONINICIO+" : *");
		this.jLabelfecha_emision_inicioFacturasProveedores.setToolTipText("Fecha Emision Inicio");
		this.jLabelfecha_emision_inicioFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_emision_inicioFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_emision_inicioFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_inicioFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_inicioFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_inicioFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONINICIO);
		this.gridaBagLayoutFacturasProveedores = new GridBagLayout();
		this.jPanelfecha_emision_inicioFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);


		//jFormattedTextFieldfecha_emision_inicioFacturasProveedores= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_inicioFacturasProveedores= new JDateChooser();
		jDateChooserfecha_emision_inicioFacturasProveedores.setEnabled(false);
		jDateChooserfecha_emision_inicioFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_inicioFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_inicioFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_inicioFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_inicioFacturasProveedores.setDate(new Date());
		jDateChooserfecha_emision_inicioFacturasProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_inicioFacturasProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_inicioFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonfecha_emision_inicioFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_inicioFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_inicioFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_inicioFacturasProveedoresBusqueda.setText("U");
		this.jButtonfecha_emision_inicioFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_inicioFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_inicioFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_inicioFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_inicioFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_inicioFacturasProveedoresBusqueda"));

		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_inicioFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_finFacturasProveedores = new JLabelMe();
		this.jLabelfecha_emision_finFacturasProveedores.setText(""+FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONFIN+" : *");
		this.jLabelfecha_emision_finFacturasProveedores.setToolTipText("Fecha Emision Fin");
		this.jLabelfecha_emision_finFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_finFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_finFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_finFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_finFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_finFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONFIN);
		this.gridaBagLayoutFacturasProveedores = new GridBagLayout();
		this.jPanelfecha_emision_finFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);


		//jFormattedTextFieldfecha_emision_finFacturasProveedores= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_finFacturasProveedores= new JDateChooser();
		jDateChooserfecha_emision_finFacturasProveedores.setEnabled(false);
		jDateChooserfecha_emision_finFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_finFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_finFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_finFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_finFacturasProveedores.setDate(new Date());
		jDateChooserfecha_emision_finFacturasProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_finFacturasProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_finFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonfecha_emision_finFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_finFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_finFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_finFacturasProveedoresBusqueda.setText("U");
		this.jButtonfecha_emision_finFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_finFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_finFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_finFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_finFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_finFacturasProveedoresBusqueda"));

		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_finFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_clienteFacturasProveedores = new JLabelMe();
		this.jLabelcodigo_clienteFacturasProveedores.setText(""+FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE+" : *");
		this.jLabelcodigo_clienteFacturasProveedores.setToolTipText("Codigo Cliente");
		this.jLabelcodigo_clienteFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_clienteFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_clienteFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_clienteFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE);
		this.gridaBagLayoutFacturasProveedores = new GridBagLayout();
		this.jPanelcodigo_clienteFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);


		jTextFieldcodigo_clienteFacturasProveedores= new JTextFieldMe();

		jTextFieldcodigo_clienteFacturasProveedores.setEnabled(false);
		jTextFieldcodigo_clienteFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_clienteFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_clienteFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtoncodigo_clienteFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_clienteFacturasProveedoresBusqueda.setText("U");
		this.jButtoncodigo_clienteFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_clienteFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_clienteFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_clienteFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_clienteFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_clienteFacturasProveedoresBusqueda"));

		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_clienteFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteFacturasProveedores = new JLabelMe();
		this.jLabelnombre_clienteFacturasProveedores.setText(""+FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteFacturasProveedores.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutFacturasProveedores = new GridBagLayout();
		this.jPanelnombre_clienteFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);


		jTextAreanombre_clienteFacturasProveedores= new JTextAreaMe();
		jTextAreanombre_clienteFacturasProveedores.setEnabled(false);
		jTextAreanombre_clienteFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteFacturasProveedores.setLineWrap(true);
		jTextAreanombre_clienteFacturasProveedores.setWrapStyleWord(true);
		jTextAreanombre_clienteFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteFacturasProveedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteFacturasProveedores = new JScrollPane(jTextAreanombre_clienteFacturasProveedores);
		jscrollPanenombre_clienteFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_clienteFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteFacturasProveedoresBusqueda.setText("U");
		this.jButtonnombre_clienteFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteFacturasProveedoresBusqueda"));

		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaFacturasProveedores = new JLabelMe();
		this.jLabelnumero_facturaFacturasProveedores.setText(""+FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaFacturasProveedores.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutFacturasProveedores = new GridBagLayout();
		this.jPanelnumero_facturaFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);


		jTextFieldnumero_facturaFacturasProveedores= new JTextFieldMe();

		jTextFieldnumero_facturaFacturasProveedores.setEnabled(false);
		jTextFieldnumero_facturaFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonnumero_facturaFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaFacturasProveedoresBusqueda.setText("U");
		this.jButtonnumero_facturaFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaFacturasProveedoresBusqueda"));

		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionFacturasProveedores = new JLabelMe();
		this.jLabelfecha_emisionFacturasProveedores.setText(""+FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionFacturasProveedores.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutFacturasProveedores = new GridBagLayout();
		this.jPanelfecha_emisionFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);


		//jFormattedTextFieldfecha_emisionFacturasProveedores= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionFacturasProveedores= new JDateChooser();
		jDateChooserfecha_emisionFacturasProveedores.setEnabled(false);
		jDateChooserfecha_emisionFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionFacturasProveedores.setDate(new Date());
		jDateChooserfecha_emisionFacturasProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionFacturasProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonfecha_emisionFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionFacturasProveedoresBusqueda.setText("U");
		this.jButtonfecha_emisionFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionFacturasProveedoresBusqueda"));

		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabeltotalFacturasProveedores = new JLabelMe();
		this.jLabeltotalFacturasProveedores.setText(""+FacturasProveedoresConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalFacturasProveedores.setToolTipText("Total");
		this.jLabeltotalFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutFacturasProveedores = new GridBagLayout();
		this.jPaneltotalFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);


		jTextFieldtotalFacturasProveedores= new JTextFieldMe();
		jTextFieldtotalFacturasProveedores.setEnabled(false);
		jTextFieldtotalFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalFacturasProveedores.setText("0.0");

		this.jButtontotalFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtontotalFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalFacturasProveedoresBusqueda.setText("U");
		this.jButtontotalFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalFacturasProveedoresBusqueda"));

		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoFacturasProveedores = new JLabelMe();
		this.jLabelnumero_pre_impresoFacturasProveedores.setText(""+FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoFacturasProveedores.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutFacturasProveedores = new GridBagLayout();
		this.jPanelnumero_pre_impresoFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);


		jTextFieldnumero_pre_impresoFacturasProveedores= new JTextFieldMe();

		jTextFieldnumero_pre_impresoFacturasProveedores.setEnabled(false);
		jTextFieldnumero_pre_impresoFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoFacturasProveedoresBusqueda.setText("U");
		this.jButtonnumero_pre_impresoFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoFacturasProveedoresBusqueda"));

		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelfechaFacturasProveedores = new JLabelMe();
		this.jLabelfechaFacturasProveedores.setText(""+FacturasProveedoresConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaFacturasProveedores.setToolTipText("Fecha");
		this.jLabelfechaFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutFacturasProveedores = new GridBagLayout();
		this.jPanelfechaFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);


		//jFormattedTextFieldfechaFacturasProveedores= new JFormattedTextFieldMe();

		jDateChooserfechaFacturasProveedores= new JDateChooser();
		jDateChooserfechaFacturasProveedores.setEnabled(false);
		jDateChooserfechaFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaFacturasProveedores.setDate(new Date());
		jDateChooserfechaFacturasProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaFacturasProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonfechaFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaFacturasProveedoresBusqueda.setText("U");
		this.jButtonfechaFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaFacturasProveedoresBusqueda"));

		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaFacturasProveedoresBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFacturasProveedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFacturasProveedores = new JLabelMe();
		this.jLabelid_empresaFacturasProveedores.setText(""+FacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFacturasProveedores.setToolTipText("Empresa");
		this.jLabelid_empresaFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFacturasProveedores = new GridBagLayout();
		this.jPanelid_empresaFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);


		jComboBoxid_empresaFacturasProveedores= new JComboBoxMe();
		jComboBoxid_empresaFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFacturasProveedores.setEnabled(false);

		this.jButtonid_empresaFacturasProveedores= new JButtonMe();
		this.jButtonid_empresaFacturasProveedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasProveedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasProveedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasProveedores.setText("Buscar");
		this.jButtonid_empresaFacturasProveedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFacturasProveedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasProveedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasProveedores"));

		this.jButtonid_empresaFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturasProveedoresBusqueda.setText("U");
		this.jButtonid_empresaFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasProveedoresBusqueda"));

		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturasProveedoresBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturasProveedoresUpdate= new JButtonMe();
		this.jButtonid_empresaFacturasProveedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasProveedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasProveedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturasProveedoresUpdate.setText("U");
		this.jButtonid_empresaFacturasProveedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturasProveedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasProveedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasProveedoresUpdate"));



					
		this.jLabelid_clienteFacturasProveedores = new JLabelMe();
		this.jLabelid_clienteFacturasProveedores.setText(""+FacturasProveedoresConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteFacturasProveedores.setToolTipText("Cliente");
		this.jLabelid_clienteFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteFacturasProveedores.setToolTipText(FacturasProveedoresConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutFacturasProveedores = new GridBagLayout();
		this.jPanelid_clienteFacturasProveedores.setLayout(this.gridaBagLayoutFacturasProveedores);


		jComboBoxid_clienteFacturasProveedores= new JComboBoxMe();
		jComboBoxid_clienteFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteFacturasProveedores= new JButtonMe();
		this.jButtonid_clienteFacturasProveedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturasProveedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturasProveedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturasProveedores.setText("Buscar");
		this.jButtonid_clienteFacturasProveedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteFacturasProveedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturasProveedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturasProveedores"));

		this.jButtonid_clienteFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonid_clienteFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturasProveedoresBusqueda.setText("U");
		this.jButtonid_clienteFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturasProveedoresBusqueda"));

		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteFacturasProveedoresBusqueda.setVisible(false);		}

		this.jButtonid_clienteFacturasProveedoresUpdate= new JButtonMe();
		this.jButtonid_clienteFacturasProveedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturasProveedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturasProveedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturasProveedoresUpdate.setText("U");
		this.jButtonid_clienteFacturasProveedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteFacturasProveedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturasProveedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturasProveedoresUpdate"));



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
		//this.jInternalFrameDetalleFacturasProveedores = new FacturasProveedoresBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Facturas Proveedores DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturasProveedores= new GridBagLayout();
		

		
		String sToolTipFacturasProveedores="";
		sToolTipFacturasProveedores=FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturasProveedores+="(Cartera.FacturasProveedores)";
		}
		
		if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturasProveedores+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturasProveedores = new JButtonMe();
		this.jButtonModificarFacturasProveedores = new JButtonMe();
        this.jButtonActualizarFacturasProveedores = new JButtonMe();
        this.jButtonEliminarFacturasProveedores = new JButtonMe();
        this.jButtonCancelarFacturasProveedores = new JButtonMe();
        this.jButtonGuardarCambiosFacturasProveedores = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturasProveedores = new JButtonMe();
		this.jButtonCerrarFacturasProveedores = new JButtonMe();
		
		this.jScrollPanelDatosFacturasProveedores = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturasProveedores = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturasProveedores = new JScrollPane();
				
		
		
		this.jPanelCamposFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Facturas Proveedores";
		
		if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Proveedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFacturasProveedores.setName("jPanelCamposFacturasProveedores"); 

		this.jPanelCamposOcultosFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturasProveedores.setName("jPanelCamposOcultosFacturasProveedores"); 

        this.jPanelAccionesFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturasProveedores.setToolTipText("Acciones");
        this.jPanelAccionesFacturasProveedores.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturasProveedores.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturasProveedores.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturasProveedores.setText("Nuevo");
		this.jButtonModificarFacturasProveedores.setText("Editar");
        this.jButtonActualizarFacturasProveedores.setText("Actualizar");
        this.jButtonEliminarFacturasProveedores.setText("Eliminar");
        this.jButtonCancelarFacturasProveedores.setText("Cancelar");
        this.jButtonGuardarCambiosFacturasProveedores.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturasProveedores.setText("Guardar");
		this.jButtonCerrarFacturasProveedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturasProveedores,"nuevo_button","Nuevo",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturasProveedores,"modificar_button","Editar",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturasProveedores,"actualizar_button","Actualizar",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturasProveedores,"eliminar_button","Eliminar",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturasProveedores,"cancelar_button","Cancelar",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturasProveedores,"guardarcambios_button","Guardar",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturasProveedores,"guardarcambiostabla_button","Guardar",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturasProveedores,"cerrar_button","Salir",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturasProveedores.setToolTipText("Nuevo"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturasProveedores.setToolTipText("Editar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturasProveedores.setToolTipText("Actualizar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturasProveedores.setToolTipText("Eliminar)"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturasProveedores.setToolTipText("Cancelar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturasProveedores.setToolTipText("Guardar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturasProveedores.setToolTipText("Guardar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturasProveedores.setToolTipText("Salir"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturasProveedores";
		inputMap = this.jButtonNuevoFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturasProveedores"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturasProveedores";
		inputMap = this.jButtonActualizarFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturasProveedores"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturasProveedores";
		inputMap = this.jButtonEliminarFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturasProveedores"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturasProveedores";
		inputMap = this.jButtonCancelarFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturasProveedores"));
		
		//CERRAR		
		sMapKey = "CerrarFacturasProveedores";
		inputMap = this.jButtonCerrarFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturasProveedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturasProveedores";
		inputMap = this.jButtonGuardarCambiosTablaFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturasProveedores"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturasProveedores.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturasProveedores.setToolTipText("Nuevo FacturasProveedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturasProveedores.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturasProveedores.setToolTipText("Sin Cerrar Ventana FacturasProveedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturasProveedores.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturasProveedores.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturasProveedores.setText("Accion");
		this.jComboBoxTiposAccionesFacturasProveedores.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturasProveedores.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturasProveedores.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturasProveedores = new JLabelMe();
		
		this.jLabelAccionesFacturasProveedores.setText("Acciones");		
		this.jLabelAccionesFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturasProveedores();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturasProveedores();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturasProveedores=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturasProveedores.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturasProveedores = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturasProveedores = new GridBagLayout();
		
		this.jPanelCamposFacturasProveedores.setLayout(gridaBagLayoutCamposFacturasProveedores);
		this.jPanelCamposOcultosFacturasProveedores.setLayout(gridaBagLayoutCamposOcultosFacturasProveedores);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFacturasProveedores.add(jLabelIdFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFacturasProveedores.add(jLabelidFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFacturasProveedores.add(jLabelid_empresaFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 2;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturasProveedores.add(jButtonid_empresaFacturasProveedoresBusqueda, this.gridBagConstraintsFacturasProveedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 3;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturasProveedores.add(jButtonid_empresaFacturasProveedoresUpdate, this.gridBagConstraintsFacturasProveedores);
	}

	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFacturasProveedores.add(jComboBoxid_empresaFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteFacturasProveedores.add(jLabelid_clienteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 2;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturasProveedores.add(jButtonid_clienteFacturasProveedoresBusqueda, this.gridBagConstraintsFacturasProveedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 3;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturasProveedores.add(jButtonid_clienteFacturasProveedoresUpdate, this.gridBagConstraintsFacturasProveedores);
	}

	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteFacturasProveedores.add(jComboBoxid_clienteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_inicioFacturasProveedores.add(jLabelfecha_emision_inicioFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 2;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_inicioFacturasProveedores.add(jButtonfecha_emision_inicioFacturasProveedoresBusqueda, this.gridBagConstraintsFacturasProveedores);
	}

	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_inicioFacturasProveedores.add(jDateChooserfecha_emision_inicioFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_finFacturasProveedores.add(jLabelfecha_emision_finFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 2;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_finFacturasProveedores.add(jButtonfecha_emision_finFacturasProveedoresBusqueda, this.gridBagConstraintsFacturasProveedores);
	}

	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_finFacturasProveedores.add(jDateChooserfecha_emision_finFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_clienteFacturasProveedores.add(jLabelcodigo_clienteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 2;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_clienteFacturasProveedores.add(jButtoncodigo_clienteFacturasProveedoresBusqueda, this.gridBagConstraintsFacturasProveedores);
	}

	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_clienteFacturasProveedores.add(jTextFieldcodigo_clienteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteFacturasProveedores.add(jLabelnombre_clienteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 2;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteFacturasProveedores.add(jButtonnombre_clienteFacturasProveedoresBusqueda, this.gridBagConstraintsFacturasProveedores);
	}

	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteFacturasProveedores.add(jscrollPanenombre_clienteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaFacturasProveedores.add(jLabelnumero_facturaFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 2;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaFacturasProveedores.add(jButtonnumero_facturaFacturasProveedoresBusqueda, this.gridBagConstraintsFacturasProveedores);
	}

	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaFacturasProveedores.add(jTextFieldnumero_facturaFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionFacturasProveedores.add(jLabelfecha_emisionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 2;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionFacturasProveedores.add(jButtonfecha_emisionFacturasProveedoresBusqueda, this.gridBagConstraintsFacturasProveedores);
	}

	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionFacturasProveedores.add(jDateChooserfecha_emisionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalFacturasProveedores.add(jLabeltotalFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 2;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalFacturasProveedores.add(jButtontotalFacturasProveedoresBusqueda, this.gridBagConstraintsFacturasProveedores);
	}

	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalFacturasProveedores.add(jTextFieldtotalFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoFacturasProveedores.add(jLabelnumero_pre_impresoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 2;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoFacturasProveedores.add(jButtonnumero_pre_impresoFacturasProveedoresBusqueda, this.gridBagConstraintsFacturasProveedores);
	}

	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoFacturasProveedores.add(jTextFieldnumero_pre_impresoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 0;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaFacturasProveedores.add(jLabelfechaFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 2;
		this.gridBagConstraintsFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaFacturasProveedores.add(jButtonfechaFacturasProveedoresBusqueda, this.gridBagConstraintsFacturasProveedores);
	}

	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasProveedores.gridy = 0;
	this.gridBagConstraintsFacturasProveedores.gridx = 1;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaFacturasProveedores.add(jDateChooserfechaFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasProveedores.add(this.jPanelidFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposFacturasProveedores % 1==0) {
		iXPanelCamposFacturasProveedores=0;
		iYPanelCamposFacturasProveedores++;
	}
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasProveedores.add(this.jPanelid_clienteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposFacturasProveedores % 1==0) {
		iXPanelCamposFacturasProveedores=0;
		iYPanelCamposFacturasProveedores++;
	}
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasProveedores.add(this.jPanelfecha_emision_inicioFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposFacturasProveedores % 1==0) {
		iXPanelCamposFacturasProveedores=0;
		iYPanelCamposFacturasProveedores++;
	}
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasProveedores.add(this.jPanelfecha_emision_finFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposFacturasProveedores % 1==0) {
		iXPanelCamposFacturasProveedores=0;
		iYPanelCamposFacturasProveedores++;
	}
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasProveedores.add(this.jPanelcodigo_clienteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposFacturasProveedores % 1==0) {
		iXPanelCamposFacturasProveedores=0;
		iYPanelCamposFacturasProveedores++;
	}
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasProveedores.add(this.jPanelnombre_clienteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposFacturasProveedores % 1==0) {
		iXPanelCamposFacturasProveedores=0;
		iYPanelCamposFacturasProveedores++;
	}
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasProveedores.add(this.jPanelnumero_facturaFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposFacturasProveedores % 1==0) {
		iXPanelCamposFacturasProveedores=0;
		iYPanelCamposFacturasProveedores++;
	}
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasProveedores.add(this.jPanelfecha_emisionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposFacturasProveedores % 1==0) {
		iXPanelCamposFacturasProveedores=0;
		iYPanelCamposFacturasProveedores++;
	}
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasProveedores.add(this.jPaneltotalFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposFacturasProveedores % 1==0) {
		iXPanelCamposFacturasProveedores=0;
		iYPanelCamposFacturasProveedores++;
	}
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasProveedores.add(this.jPanelnumero_pre_impresoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposFacturasProveedores % 1==0) {
		iXPanelCamposFacturasProveedores=0;
		iYPanelCamposFacturasProveedores++;
	}
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasProveedores.add(this.jPanelfechaFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposFacturasProveedores % 1==0) {
		iXPanelCamposFacturasProveedores=0;
		iYPanelCamposFacturasProveedores++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasProveedores.gridy = iYPanelCamposOcultosFacturasProveedores;
	this.gridBagConstraintsFacturasProveedores.gridx = iXPanelCamposOcultosFacturasProveedores++;
	this.gridBagConstraintsFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturasProveedores.add(this.jPanelid_empresaFacturasProveedores, this.gridBagConstraintsFacturasProveedores);



	if(iXPanelCamposOcultosFacturasProveedores % 1==0) {
		iXPanelCamposOcultosFacturasProveedores=0;
		iYPanelCamposOcultosFacturasProveedores++;
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
			
		GridBagLayout gridaBagLayoutAccionesFacturasProveedores= new GridBagLayout();
		this.jPanelAccionesFacturasProveedores.setLayout(gridaBagLayoutAccionesFacturasProveedores);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturasProveedores= new GridBagLayout();
		this.jPanelAccionesFormularioFacturasProveedores.setLayout(gridaBagLayoutAccionesFormularioFacturasProveedores);
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturasProveedores.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturasProveedores.add(this.jComboBoxTiposAccionesFormularioFacturasProveedores, this.gridBagConstraintsFacturasProveedores);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturasProveedores.add(this.jButtonModificarFacturasProveedores, this.gridBagConstraintsFacturasProveedores);							

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturasProveedores.add(this.jButtonEliminarFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
			
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = 0;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturasProveedores.add(this.jButtonActualizarFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = 0;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturasProveedores.add(this.jButtonGuardarCambiosFacturasProveedores, this.gridBagConstraintsFacturasProveedores);	
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = 0;		
		this.gridBagConstraintsFacturasProveedores.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturasProveedores.add(this.jButtonCancelarFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturasProveedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturasProveedores);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();						
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasProveedores.gridx = 0;		
			//this.gridBagConstraintsFacturasProveedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturasProveedores.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturasProveedores.gridx =0;
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturasProveedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturasProveedores = new FacturasProveedoresBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Facturas Proveedores DATOS");
			
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
			
	        //this.setTitle("[FOR] - Facturas Proveedores DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturas Proveedores Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturasProveedoresModel facturasproveedoresModel=new FacturasProveedoresModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturasProveedoresModel.FacturasProveedoresFocusTraversalPolicy facturasproveedoresFocusTraversalPolicy = facturasproveedoresModel.new FacturasProveedoresFocusTraversalPolicy(this);
			
			//facturasproveedoresFocusTraversalPolicy.setfacturasproveedoresJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturasproveedoresModel);
			
			
			this.jContentPaneDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturasProveedores = new GridBagLayout();	
			this.jContentPaneDetalleFacturasProveedores.setLayout(gridaBagLayoutDetalleFacturasProveedores);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturasProveedores = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
				this.gridBagConstraintsFacturasProveedores.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFacturasProveedores.gridx = 0;
					
				
				this.jContentPaneDetalleFacturasProveedores.add(jTtoolBarDetalleFacturasProveedores, gridBagConstraintsFacturasProveedores);								
				
}
			
			this.jScrollPanelDatosEdicionFacturasProveedores=   new JScrollPane(jContentPaneDetalleFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturasProveedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFacturasProveedores.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFacturasProveedores.gridx = 0;
	        
			this.jContentPaneDetalleFacturasProveedores.add(jPanelCamposFacturasProveedores, gridBagConstraintsFacturasProveedores);
			
			
			
			
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
						//&& facturasproveedoresSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.facturasproveedoresSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturasProveedores= new GridBagConstraints();
						this.gridBagConstraintsFacturasProveedores.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturasProveedores.gridx = 0;
						this.jContentPaneDetalleFacturasProveedores.add(this.jTabbedPaneRelacionesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturasProveedores.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturasProveedores.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
					this.gridBagConstraintsFacturasProveedores.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturasProveedores.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturasProveedores.gridx = 0;
					
				
					this.jContentPaneDetalleFacturasProveedores.add(jPanelCamposOcultosFacturasProveedores, gridBagConstraintsFacturasProveedores);
				
					this.jPanelCamposOcultosFacturasProveedores.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFacturasProveedores.gridx = 0;
	        this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFacturasProveedores.add(this.jPanelAccionesFormularioFacturasProveedores, this.gridBagConstraintsFacturasProveedores);							
			
			
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
	        this.gridBagConstraintsFacturasProveedores.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFacturasProveedores.gridx = 0;
	        
			
			this.jContentPaneDetalleFacturasProveedores.add(this.jPanelAccionesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturasProveedores);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturasProveedores=   new JScrollPane(this.jPanelCamposFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturasProveedores.gridx = 0;
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturasProveedores.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturasProveedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturasProveedores, this.gridBagConstraintsFacturasProveedores);			
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturasProveedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			
			
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
			
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturasProveedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturasProveedores;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturasProveedores;
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
