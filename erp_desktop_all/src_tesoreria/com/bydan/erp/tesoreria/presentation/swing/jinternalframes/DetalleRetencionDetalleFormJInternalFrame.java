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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.DetalleRetencionConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class DetalleRetencionDetalleFormJInternalFrame extends DetalleRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleRetencion;
	
	protected JMenuBar jmenuBarDetalleDetalleRetencion;
	
	protected JMenu jmenuDetalleDetalleRetencion;
	protected JMenu jmenuDetalleArchivoDetalleRetencion;
	protected JMenu jmenuDetalleAccionesDetalleRetencion;
	protected JMenu jmenuDetalleDatosDetalleRetencion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleRetencion;	
	protected GridBagConstraints gridBagConstraintsDetalleRetencion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleRetencionBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleRetencion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpresaBeanSwingJInternalFrame empresadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresadestino="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public DetalleRetencionSessionBean detalleretencionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpresaSessionBean empresadestinoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;	
	
	public DetalleRetencionLogic detalleretencionLogic;
	
	public JScrollPane jScrollPanelDatosDetalleRetencion;
	public JScrollPane jScrollPanelDatosEdicionDetalleRetencion;
	public JScrollPane jScrollPanelDatosGeneralDetalleRetencion;
	
	protected JPanel jPanelCamposDetalleRetencion;    
	protected JPanel jPanelCamposOcultosDetalleRetencion;    	
	protected JPanel jPanelAccionesDetalleRetencion;
	protected JPanel jPanelAccionesFormularioDetalleRetencion;
    
	
	
	protected Integer iXPanelCamposDetalleRetencion=0;
	protected Integer iYPanelCamposDetalleRetencion=0;
	
	protected Integer iXPanelCamposOcultosDetalleRetencion=0;
	protected Integer iYPanelCamposOcultosDetalleRetencion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleRetencion;
	public JButton jButtonModificarDetalleRetencion;
	public JButton jButtonActualizarDetalleRetencion;
    public JButton jButtonEliminarDetalleRetencion;
	public JButton jButtonCancelarDetalleRetencion;
    public JButton jButtonGuardarCambiosDetalleRetencion;
	public JButton jButtonGuardarCambiosTablaDetalleRetencion;
	protected JButton jButtonCerrarDetalleRetencion;
	
	
	protected JButton jButtonProcesarInformacionDetalleRetencion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleRetencion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleRetencion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleRetencion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleRetencion;
	protected JButton jButtonModificarToolBarDetalleRetencion;
	protected JButton jButtonActualizarToolBarDetalleRetencion;
    protected JButton jButtonEliminarToolBarDetalleRetencion;
	protected JButton jButtonCancelarToolBarDetalleRetencion;
    protected JButton jButtonGuardarCambiosToolBarDetalleRetencion;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleRetencion;
	protected JButton jButtonCerrarToolBarDetalleRetencion;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleRetencion;
	protected JMenuItem jMenuItemModificarDetalleRetencion;
	protected JMenuItem jMenuItemActualizarDetalleRetencion;
    protected JMenuItem jMenuItemEliminarDetalleRetencion;
	protected JMenuItem jMenuItemCancelarDetalleRetencion;
    protected JMenuItem jMenuItemGuardarCambiosDetalleRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleRetencion;
	protected JMenuItem jMenuItemCerrarDetalleRetencion;
	protected JMenuItem jMenuItemDetalleCerrarDetalleRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleRetencion;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleRetencion;
	protected JMenuItem jMenuItemMostrarOcultarDetalleRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleRetencion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleRetencion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleRetencion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleRetencion;
	public JLabel jLabelIdDetalleRetencion;
	public JLabel jLabelidDetalleRetencion;
	public JButton jButtonidDetalleRetencionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleRetencion;
	public JLabel jLabeldescripcionDetalleRetencion;
	public JTextArea jTextAreadescripcionDetalleRetencion;
	public JScrollPane jscrollPanedescripcionDetalleRetencion;
	public JButton jButtondescripcionDetalleRetencionBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeDetalleRetencion;
	public JLabel jLabelporcentajeDetalleRetencion;
	public JTextField jTextFieldporcentajeDetalleRetencion;
	public JButton jButtonporcentajeDetalleRetencionBusqueda= new JButtonMe();

	public JPanel jPanelmonto_minimoDetalleRetencion;
	public JLabel jLabelmonto_minimoDetalleRetencion;
	public JTextField jTextFieldmonto_minimoDetalleRetencion;
	public JButton jButtonmonto_minimoDetalleRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleRetencion;
	public JLabel jLabelid_empresaDetalleRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleRetencion;
	public JButton jButtonid_empresaDetalleRetencion= new JButtonMe();
	public JButton jButtonid_empresaDetalleRetencionUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_empresa_destinoDetalleRetencion;
	public JLabel jLabelid_empresa_destinoDetalleRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_destinoDetalleRetencion;
	public JButton jButtonid_empresa_destinoDetalleRetencion= new JButtonMe();
	public JButton jButtonid_empresa_destinoDetalleRetencionUpdate= new JButtonMe();
	public JButton jButtonid_empresa_destinoDetalleRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableDetalleRetencion;
	public JLabel jLabelid_cuenta_contableDetalleRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableDetalleRetencion;
	public JButton jButtonid_cuenta_contableDetalleRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetalleRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetalleRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetalleRetencionArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoDetalleRetencion;
	public JLabel jLabelid_cuenta_contable_creditoDetalleRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoDetalleRetencion;
	public JButton jButtonid_cuenta_contable_creditoDetalleRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoDetalleRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoDetalleRetencionArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleRetencion;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleRetencionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleRetencion=new JPanel();
				this.jPanelAccionesFormularioDetalleRetencion=new JPanel();
				this.jmenuBarDetalleDetalleRetencion=new JMenuBar();
				this.jTtoolBarDetalleDetalleRetencion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRetencionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleRetencionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRetencionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRetencionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRetencionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleRetencion() {
		return this.jButtonActualizarToolBarDetalleRetencion;
	}
	
	public JButton getjButtonEliminarToolBarDetalleRetencion() {
		return this.jButtonEliminarToolBarDetalleRetencion;
	}
	
	public JButton getjButtonCancelarToolBarDetalleRetencion() {
		return this.jButtonCancelarToolBarDetalleRetencion;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleRetencion() {
		return this.jButtonProcesarInformacionDetalleRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleRetencion)	{
		this.jButtonProcesarInformacionDetalleRetencion = jButtonProcesarInformacionDetalleRetencion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleRetencion() {
		return this.jComboBoxTiposAccionesDetalleRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleRetencion(
			JComboBox jComboBoxTiposRelacionesDetalleRetencion) {
		this.jComboBoxTiposRelacionesDetalleRetencion = jComboBoxTiposRelacionesDetalleRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleRetencion(
			JComboBox jComboBoxTiposAccionesDetalleRetencion) {
		this.jComboBoxTiposAccionesDetalleRetencion = jComboBoxTiposAccionesDetalleRetencion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleRetencion() {
		return this.jComboBoxTiposAccionesFormularioDetalleRetencion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleRetencion(
			JComboBox jComboBoxTiposAccionesFormularioDetalleRetencion) {
		this.jComboBoxTiposAccionesFormularioDetalleRetencion = jComboBoxTiposAccionesFormularioDetalleRetencion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleretencionSessionBean=new DetalleRetencionSessionBean();
		
		this.detalleretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleretencionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleRetencion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleRetencion=new JButtonMe();
				this.jButtonModificarToolBarDetalleRetencion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleRetencion,this.jTtoolBarDetalleDetalleRetencion,
							"actualizar","actualizar","Actualizar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleRetencion,this.jTtoolBarDetalleDetalleRetencion,
							"eliminar","eliminar","Eliminar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleRetencion,this.jTtoolBarDetalleDetalleRetencion,
							"cancelar","cancelar","Cancelar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleRetencion,this.jTtoolBarDetalleDetalleRetencion,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleRetencion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleRetencion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleRetencion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleRetencion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleRetencion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleRetencion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleRetencion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleRetencion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleRetencion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleRetencion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleRetencion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleRetencion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleRetencion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleRetencion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleRetencion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleRetencion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleRetencion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleRetencion.add(this.jMenuItemDetalleCerrarDetalleRetencion);
		
		this.jmenuDetalleAccionesDetalleRetencion.add(this.jMenuItemActualizarDetalleRetencion);
		this.jmenuDetalleAccionesDetalleRetencion.add(this.jMenuItemEliminarDetalleRetencion);
		this.jmenuDetalleAccionesDetalleRetencion.add(this.jMenuItemCancelarDetalleRetencion);		
		
		//this.jmenuDetalleDatosDetalleRetencion.add(this.jMenuItemDetalleAbrirOrderByDetalleRetencion);				
		this.jmenuDetalleDatosDetalleRetencion.add(this.jMenuItemDetalleMostarOcultarDetalleRetencion);				
				
		//this.jmenuDetalleAccionesDetalleRetencion.add(this.jMenuItemGuardarCambiosDetalleRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleRetencion.add(this.jmenuDetalleArchivoDetalleRetencion);		
		this.jmenuBarDetalleDetalleRetencion.add(this.jmenuDetalleAccionesDetalleRetencion);		
		this.jmenuBarDetalleDetalleRetencion.add(this.jmenuDetalleDatosDetalleRetencion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleRetencion);				
	}
	
	
	public void inicializarElementosCamposDetalleRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleRetencion = new JLabelMe();
		jLabelIdDetalleRetencion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleRetencion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleRetencion.setToolTipText(DetalleRetencionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleRetencion= new GridBagLayout();

		this.jPanelidDetalleRetencion.setLayout(this.gridaBagLayoutDetalleRetencion);

		jLabelidDetalleRetencion = new JLabel();
		jLabelidDetalleRetencion.setText("Id");

		jLabelidDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionDetalleRetencion = new JLabelMe();
		this.jLabeldescripcionDetalleRetencion.setText(""+DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleRetencion.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleRetencion.setToolTipText(DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleRetencion = new GridBagLayout();
		this.jPaneldescripcionDetalleRetencion.setLayout(this.gridaBagLayoutDetalleRetencion);


		jTextAreadescripcionDetalleRetencion= new JTextAreaMe();
		jTextAreadescripcionDetalleRetencion.setEnabled(false);
		jTextAreadescripcionDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleRetencion.setLineWrap(true);
		jTextAreadescripcionDetalleRetencion.setWrapStyleWord(true);
		jTextAreadescripcionDetalleRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleRetencion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleRetencion = new JScrollPane(jTextAreadescripcionDetalleRetencion);
		jscrollPanedescripcionDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleRetencionBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleRetencionBusqueda.setText("U");
		this.jButtondescripcionDetalleRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleRetencionBusqueda"));

		if(this.detalleretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleRetencionBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeDetalleRetencion = new JLabelMe();
		this.jLabelporcentajeDetalleRetencion.setText(""+DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeDetalleRetencion.setToolTipText("Porcentaje");
		this.jLabelporcentajeDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeDetalleRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeDetalleRetencion.setToolTipText(DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutDetalleRetencion = new GridBagLayout();
		this.jPanelporcentajeDetalleRetencion.setLayout(this.gridaBagLayoutDetalleRetencion);


		jTextFieldporcentajeDetalleRetencion= new JTextFieldMe();
		jTextFieldporcentajeDetalleRetencion.setEnabled(false);
		jTextFieldporcentajeDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeDetalleRetencion.setText("0.0");

		this.jButtonporcentajeDetalleRetencionBusqueda= new JButtonMe();
		this.jButtonporcentajeDetalleRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDetalleRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDetalleRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeDetalleRetencionBusqueda.setText("U");
		this.jButtonporcentajeDetalleRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeDetalleRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeDetalleRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeDetalleRetencionBusqueda"));

		if(this.detalleretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeDetalleRetencionBusqueda.setVisible(false);		}


					
		this.jLabelmonto_minimoDetalleRetencion = new JLabelMe();
		this.jLabelmonto_minimoDetalleRetencion.setText(""+DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO+" : *");
		this.jLabelmonto_minimoDetalleRetencion.setToolTipText("Monto Minimo");
		this.jLabelmonto_minimoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_minimoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_minimoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_minimoDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_minimoDetalleRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_minimoDetalleRetencion.setToolTipText(DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO);
		this.gridaBagLayoutDetalleRetencion = new GridBagLayout();
		this.jPanelmonto_minimoDetalleRetencion.setLayout(this.gridaBagLayoutDetalleRetencion);


		jTextFieldmonto_minimoDetalleRetencion= new JTextFieldMe();
		jTextFieldmonto_minimoDetalleRetencion.setEnabled(false);
		jTextFieldmonto_minimoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_minimoDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_minimoDetalleRetencion.setText("0.0");

		this.jButtonmonto_minimoDetalleRetencionBusqueda= new JButtonMe();
		this.jButtonmonto_minimoDetalleRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimoDetalleRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimoDetalleRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_minimoDetalleRetencionBusqueda.setText("U");
		this.jButtonmonto_minimoDetalleRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_minimoDetalleRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_minimoDetalleRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_minimoDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_minimoDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_minimoDetalleRetencionBusqueda"));

		if(this.detalleretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_minimoDetalleRetencionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleRetencion = new JLabelMe();
		this.jLabelid_empresaDetalleRetencion.setText(""+DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleRetencion.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleRetencion.setToolTipText(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleRetencion = new GridBagLayout();
		this.jPanelid_empresaDetalleRetencion.setLayout(this.gridaBagLayoutDetalleRetencion);


		jComboBoxid_empresaDetalleRetencion= new JComboBoxMe();
		jComboBoxid_empresaDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleRetencion.setEnabled(false);

		this.jButtonid_empresaDetalleRetencion= new JButtonMe();
		this.jButtonid_empresaDetalleRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRetencion.setText("Buscar");
		this.jButtonid_empresaDetalleRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRetencion"));

		this.jButtonid_empresaDetalleRetencionBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleRetencionBusqueda.setText("U");
		this.jButtonid_empresaDetalleRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRetencionBusqueda"));

		if(this.detalleretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleRetencionBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleRetencionUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleRetencionUpdate.setText("U");
		this.jButtonid_empresaDetalleRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRetencionUpdate"));



					
		this.jLabelid_empresa_destinoDetalleRetencion = new JLabelMe();
		this.jLabelid_empresa_destinoDetalleRetencion.setText(""+DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO+" : *");
		this.jLabelid_empresa_destinoDetalleRetencion.setToolTipText("Empresa Destino");
		this.jLabelid_empresa_destinoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empresa_destinoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empresa_destinoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_destinoDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresa_destinoDetalleRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresa_destinoDetalleRetencion.setToolTipText(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO);
		this.gridaBagLayoutDetalleRetencion = new GridBagLayout();
		this.jPanelid_empresa_destinoDetalleRetencion.setLayout(this.gridaBagLayoutDetalleRetencion);


		jComboBoxid_empresa_destinoDetalleRetencion= new JComboBoxMe();
		jComboBoxid_empresa_destinoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_destinoDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empresa_destinoDetalleRetencion= new JButtonMe();
		this.jButtonid_empresa_destinoDetalleRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_destinoDetalleRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_destinoDetalleRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_destinoDetalleRetencion.setText("Buscar");
		this.jButtonid_empresa_destinoDetalleRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresa_destinoDetalleRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_destinoDetalleRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresa_destinoDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_destinoDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_destinoDetalleRetencion"));

		this.jButtonid_empresa_destinoDetalleRetencionBusqueda= new JButtonMe();
		this.jButtonid_empresa_destinoDetalleRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoDetalleRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoDetalleRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_destinoDetalleRetencionBusqueda.setText("U");
		this.jButtonid_empresa_destinoDetalleRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresa_destinoDetalleRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_destinoDetalleRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresa_destinoDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_destinoDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_destinoDetalleRetencionBusqueda"));

		if(this.detalleretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresa_destinoDetalleRetencionBusqueda.setVisible(false);		}

		this.jButtonid_empresa_destinoDetalleRetencionUpdate= new JButtonMe();
		this.jButtonid_empresa_destinoDetalleRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoDetalleRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoDetalleRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_destinoDetalleRetencionUpdate.setText("U");
		this.jButtonid_empresa_destinoDetalleRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresa_destinoDetalleRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_destinoDetalleRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresa_destinoDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_destinoDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_destinoDetalleRetencionUpdate"));



					
		this.jLabelid_cuenta_contableDetalleRetencion = new JLabelMe();
		this.jLabelid_cuenta_contableDetalleRetencion.setText(""+DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableDetalleRetencion.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableDetalleRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableDetalleRetencion.setToolTipText(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutDetalleRetencion = new GridBagLayout();
		this.jPanelid_cuenta_contableDetalleRetencion.setLayout(this.gridaBagLayoutDetalleRetencion);


		jComboBoxid_cuenta_contableDetalleRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contableDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableDetalleRetencion= new JButtonMe();
		this.jButtonid_cuenta_contableDetalleRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetalleRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetalleRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetalleRetencion.setText("Buscar");
		this.jButtonid_cuenta_contableDetalleRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableDetalleRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleRetencion"));

		this.jButtonid_cuenta_contableDetalleRetencionBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableDetalleRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableDetalleRetencionBusqueda.setText("U");
		this.jButtonid_cuenta_contableDetalleRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableDetalleRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleRetencionBusqueda"));

		if(this.detalleretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableDetalleRetencionBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableDetalleRetencionUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableDetalleRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableDetalleRetencionUpdate.setText("U");
		this.jButtonid_cuenta_contableDetalleRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableDetalleRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleRetencionUpdate"));


		jButtonid_cuenta_contableDetalleRetencionArbol= new JButtonMe();
		jButtonid_cuenta_contableDetalleRetencionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetalleRetencionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetalleRetencionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetalleRetencionArbol.setText("Arbol");
		jButtonid_cuenta_contableDetalleRetencionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableDetalleRetencionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleRetencionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleRetencionArbol"));



					
		this.jLabelid_cuenta_contable_creditoDetalleRetencion = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoDetalleRetencion.setText(""+DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoDetalleRetencion.setToolTipText("Cuenta Contable Credito");
		this.jLabelid_cuenta_contable_creditoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoDetalleRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoDetalleRetencion.setToolTipText(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutDetalleRetencion = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoDetalleRetencion.setLayout(this.gridaBagLayoutDetalleRetencion);


		jComboBoxid_cuenta_contable_creditoDetalleRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoDetalleRetencion= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoDetalleRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoDetalleRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoDetalleRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoDetalleRetencion.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoDetalleRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoDetalleRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoDetalleRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoDetalleRetencion"));

		this.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoDetalleRetencionBusqueda"));

		if(this.detalleretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoDetalleRetencionUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoDetalleRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoDetalleRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoDetalleRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoDetalleRetencionUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoDetalleRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoDetalleRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoDetalleRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoDetalleRetencionUpdate"));


		jButtonid_cuenta_contable_creditoDetalleRetencionArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoDetalleRetencionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoDetalleRetencionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoDetalleRetencionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoDetalleRetencionArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoDetalleRetencionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoDetalleRetencionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoDetalleRetencionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoDetalleRetencionArbol"));



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
		//this.jInternalFrameDetalleDetalleRetencion = new DetalleRetencionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Retencion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleRetencion= new GridBagLayout();
		

		
		String sToolTipDetalleRetencion="";
		sToolTipDetalleRetencion=DetalleRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleRetencion+="(Tesoreria.DetalleRetencion)";
		}
		
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleRetencion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleRetencion = new JButtonMe();
		this.jButtonModificarDetalleRetencion = new JButtonMe();
        this.jButtonActualizarDetalleRetencion = new JButtonMe();
        this.jButtonEliminarDetalleRetencion = new JButtonMe();
        this.jButtonCancelarDetalleRetencion = new JButtonMe();
        this.jButtonGuardarCambiosDetalleRetencion = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleRetencion = new JButtonMe();
		this.jButtonCerrarDetalleRetencion = new JButtonMe();
		
		this.jScrollPanelDatosDetalleRetencion = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleRetencion = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleRetencion = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Retencion";
		
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleRetencion.setName("jPanelCamposDetalleRetencion"); 

		this.jPanelCamposOcultosDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleRetencion.setName("jPanelCamposOcultosDetalleRetencion"); 

        this.jPanelAccionesDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleRetencion.setToolTipText("Acciones");
        this.jPanelAccionesDetalleRetencion.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleRetencion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleRetencion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleRetencion.setText("Nuevo");
		this.jButtonModificarDetalleRetencion.setText("Editar");
        this.jButtonActualizarDetalleRetencion.setText("Actualizar");
        this.jButtonEliminarDetalleRetencion.setText("Eliminar");
        this.jButtonCancelarDetalleRetencion.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleRetencion.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleRetencion.setText("Guardar");
		this.jButtonCerrarDetalleRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleRetencion,"nuevo_button","Nuevo",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleRetencion,"modificar_button","Editar",this.detalleretencionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleRetencion,"actualizar_button","Actualizar",this.detalleretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleRetencion,"eliminar_button","Eliminar",this.detalleretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleRetencion,"cancelar_button","Cancelar",this.detalleretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleRetencion,"guardarcambios_button","Guardar",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleRetencion,"guardarcambiostabla_button","Guardar",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleRetencion,"cerrar_button","Salir",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleRetencion.setToolTipText("Nuevo"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleRetencion.setToolTipText("Editar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleRetencion.setToolTipText("Actualizar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleRetencion.setToolTipText("Eliminar)"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleRetencion.setToolTipText("Cancelar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleRetencion.setToolTipText("Guardar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleRetencion.setToolTipText("Guardar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleRetencion.setToolTipText("Salir"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleRetencion";
		inputMap = this.jButtonNuevoDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleRetencion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleRetencion";
		inputMap = this.jButtonActualizarDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleRetencion"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleRetencion";
		inputMap = this.jButtonEliminarDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleRetencion"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleRetencion";
		inputMap = this.jButtonCancelarDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleRetencion"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleRetencion";
		inputMap = this.jButtonCerrarDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleRetencion";
		inputMap = this.jButtonGuardarCambiosTablaDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleRetencion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleRetencion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleRetencion.setToolTipText("Nuevo DetalleRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleRetencion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleRetencion.setToolTipText("Sin Cerrar Ventana DetalleRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleRetencion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleRetencion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleRetencion.setText("Accion");
		this.jComboBoxTiposAccionesDetalleRetencion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleRetencion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleRetencion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleRetencion = new JLabelMe();
		
		this.jLabelAccionesDetalleRetencion.setText("Acciones");		
		this.jLabelAccionesDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleRetencion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleRetencion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleRetencion=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleRetencion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleRetencion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleRetencion = new GridBagLayout();
		
		this.jPanelCamposDetalleRetencion.setLayout(gridaBagLayoutCamposDetalleRetencion);
		this.jPanelCamposOcultosDetalleRetencion.setLayout(gridaBagLayoutCamposOcultosDetalleRetencion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 0;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleRetencion.add(jLabelIdDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 1;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleRetencion.add(jLabelidDetalleRetencion, this.gridBagConstraintsDetalleRetencion);


	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 0;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleRetencion.add(jLabelid_empresaDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 2;
		this.gridBagConstraintsDetalleRetencion.ipadx = 0;
		this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleRetencion.add(jButtonid_empresaDetalleRetencionBusqueda, this.gridBagConstraintsDetalleRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 3;
		this.gridBagConstraintsDetalleRetencion.ipadx = 0;
		this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleRetencion.add(jButtonid_empresaDetalleRetencionUpdate, this.gridBagConstraintsDetalleRetencion);
	}

	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 1;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleRetencion.add(jComboBoxid_empresaDetalleRetencion, this.gridBagConstraintsDetalleRetencion);


	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 0;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresa_destinoDetalleRetencion.add(jLabelid_empresa_destinoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 2;
		this.gridBagConstraintsDetalleRetencion.ipadx = 0;
		this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_destinoDetalleRetencion.add(jButtonid_empresa_destinoDetalleRetencionBusqueda, this.gridBagConstraintsDetalleRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 3;
		this.gridBagConstraintsDetalleRetencion.ipadx = 0;
		this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_destinoDetalleRetencion.add(jButtonid_empresa_destinoDetalleRetencionUpdate, this.gridBagConstraintsDetalleRetencion);
	}

	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 1;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresa_destinoDetalleRetencion.add(jComboBoxid_empresa_destinoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);


	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 0;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableDetalleRetencion.add(jLabelid_cuenta_contableDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 2;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableDetalleRetencion.add(jButtonid_cuenta_contableDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 3;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableDetalleRetencion.add(jButtonid_cuenta_contableDetalleRetencionArbol, this.gridBagConstraintsDetalleRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 4;
		this.gridBagConstraintsDetalleRetencion.ipadx = 0;
		this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableDetalleRetencion.add(jButtonid_cuenta_contableDetalleRetencionBusqueda, this.gridBagConstraintsDetalleRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 5;
		this.gridBagConstraintsDetalleRetencion.ipadx = 0;
		this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableDetalleRetencion.add(jButtonid_cuenta_contableDetalleRetencionUpdate, this.gridBagConstraintsDetalleRetencion);
	}

	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 1;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableDetalleRetencion.add(jComboBoxid_cuenta_contableDetalleRetencion, this.gridBagConstraintsDetalleRetencion);


	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 0;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoDetalleRetencion.add(jLabelid_cuenta_contable_creditoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 2;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoDetalleRetencion.add(jButtonid_cuenta_contable_creditoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 3;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoDetalleRetencion.add(jButtonid_cuenta_contable_creditoDetalleRetencionArbol, this.gridBagConstraintsDetalleRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 4;
		this.gridBagConstraintsDetalleRetencion.ipadx = 0;
		this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoDetalleRetencion.add(jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda, this.gridBagConstraintsDetalleRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 5;
		this.gridBagConstraintsDetalleRetencion.ipadx = 0;
		this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoDetalleRetencion.add(jButtonid_cuenta_contable_creditoDetalleRetencionUpdate, this.gridBagConstraintsDetalleRetencion);
	}

	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 1;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoDetalleRetencion.add(jComboBoxid_cuenta_contable_creditoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);


	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 0;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleRetencion.add(jLabeldescripcionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 2;
		this.gridBagConstraintsDetalleRetencion.ipadx = 0;
		this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleRetencion.add(jButtondescripcionDetalleRetencionBusqueda, this.gridBagConstraintsDetalleRetencion);
	}

	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 1;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleRetencion.add(jscrollPanedescripcionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);


	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 0;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeDetalleRetencion.add(jLabelporcentajeDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 2;
		this.gridBagConstraintsDetalleRetencion.ipadx = 0;
		this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeDetalleRetencion.add(jButtonporcentajeDetalleRetencionBusqueda, this.gridBagConstraintsDetalleRetencion);
	}

	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 1;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeDetalleRetencion.add(jTextFieldporcentajeDetalleRetencion, this.gridBagConstraintsDetalleRetencion);


	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 0;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_minimoDetalleRetencion.add(jLabelmonto_minimoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 2;
		this.gridBagConstraintsDetalleRetencion.ipadx = 0;
		this.gridBagConstraintsDetalleRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_minimoDetalleRetencion.add(jButtonmonto_minimoDetalleRetencionBusqueda, this.gridBagConstraintsDetalleRetencion);
	}

	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRetencion.gridy = 0;
	this.gridBagConstraintsDetalleRetencion.gridx = 1;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_minimoDetalleRetencion.add(jTextFieldmonto_minimoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRetencion.gridy = iYPanelCamposDetalleRetencion;
	this.gridBagConstraintsDetalleRetencion.gridx = iXPanelCamposDetalleRetencion++;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRetencion.add(this.jPanelidDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(iXPanelCamposDetalleRetencion % 1==0) {
		iXPanelCamposDetalleRetencion=0;
		iYPanelCamposDetalleRetencion++;
	}
	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRetencion.gridy = iYPanelCamposDetalleRetencion;
	this.gridBagConstraintsDetalleRetencion.gridx = iXPanelCamposDetalleRetencion++;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRetencion.add(this.jPanelid_empresa_destinoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(iXPanelCamposDetalleRetencion % 1==0) {
		iXPanelCamposDetalleRetencion=0;
		iYPanelCamposDetalleRetencion++;
	}
	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRetencion.gridy = iYPanelCamposDetalleRetencion;
	this.gridBagConstraintsDetalleRetencion.gridx = iXPanelCamposDetalleRetencion++;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRetencion.add(this.jPanelid_cuenta_contableDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(iXPanelCamposDetalleRetencion % 1==0) {
		iXPanelCamposDetalleRetencion=0;
		iYPanelCamposDetalleRetencion++;
	}
	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRetencion.gridy = iYPanelCamposDetalleRetencion;
	this.gridBagConstraintsDetalleRetencion.gridx = iXPanelCamposDetalleRetencion++;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRetencion.add(this.jPanelid_cuenta_contable_creditoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(iXPanelCamposDetalleRetencion % 1==0) {
		iXPanelCamposDetalleRetencion=0;
		iYPanelCamposDetalleRetencion++;
	}
	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRetencion.gridy = iYPanelCamposDetalleRetencion;
	this.gridBagConstraintsDetalleRetencion.gridx = iXPanelCamposDetalleRetencion++;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRetencion.add(this.jPaneldescripcionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(iXPanelCamposDetalleRetencion % 1==0) {
		iXPanelCamposDetalleRetencion=0;
		iYPanelCamposDetalleRetencion++;
	}
	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRetencion.gridy = iYPanelCamposDetalleRetencion;
	this.gridBagConstraintsDetalleRetencion.gridx = iXPanelCamposDetalleRetencion++;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRetencion.add(this.jPanelporcentajeDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(iXPanelCamposDetalleRetencion % 1==0) {
		iXPanelCamposDetalleRetencion=0;
		iYPanelCamposDetalleRetencion++;
	}
	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRetencion.gridy = iYPanelCamposDetalleRetencion;
	this.gridBagConstraintsDetalleRetencion.gridx = iXPanelCamposDetalleRetencion++;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRetencion.add(this.jPanelmonto_minimoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(iXPanelCamposDetalleRetencion % 1==0) {
		iXPanelCamposDetalleRetencion=0;
		iYPanelCamposDetalleRetencion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRetencion.gridy = iYPanelCamposOcultosDetalleRetencion;
	this.gridBagConstraintsDetalleRetencion.gridx = iXPanelCamposOcultosDetalleRetencion++;
	this.gridBagConstraintsDetalleRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRetencion.add(this.jPanelid_empresaDetalleRetencion, this.gridBagConstraintsDetalleRetencion);



	if(iXPanelCamposOcultosDetalleRetencion % 1==0) {
		iXPanelCamposOcultosDetalleRetencion=0;
		iYPanelCamposOcultosDetalleRetencion++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleRetencion= new GridBagLayout();
		this.jPanelAccionesDetalleRetencion.setLayout(gridaBagLayoutAccionesDetalleRetencion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleRetencion= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleRetencion.setLayout(gridaBagLayoutAccionesFormularioDetalleRetencion);
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleRetencion.add(this.jComboBoxTiposAccionesFormularioDetalleRetencion, this.gridBagConstraintsDetalleRetencion);

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleRetencion.add(this.jCheckBoxPostAccionNuevoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleretencionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleRetencion.add(this.jCheckBoxPostAccionSinCerrarDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleretencionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleRetencion.add(this.jCheckBoxPostAccionSinMensajeDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleRetencion.add(this.jButtonModificarDetalleRetencion, this.gridBagConstraintsDetalleRetencion);							

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleRetencion.add(this.jButtonEliminarDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
			
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = 0;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleRetencion.add(this.jButtonActualizarDetalleRetencion, this.gridBagConstraintsDetalleRetencion);


		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = 0;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleRetencion.add(this.jButtonGuardarCambiosDetalleRetencion, this.gridBagConstraintsDetalleRetencion);	
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = 0;		
		this.gridBagConstraintsDetalleRetencion.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleRetencion.add(this.jButtonCancelarDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleRetencion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();						
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRetencion.gridx = 0;		
			//this.gridBagConstraintsDetalleRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleRetencion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleRetencion.gridx =0;
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleRetencionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleRetencion = new DetalleRetencionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Retencion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Retencion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Retencion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleRetencionModel detalleretencionModel=new DetalleRetencionModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleRetencionModel.DetalleRetencionFocusTraversalPolicy detalleretencionFocusTraversalPolicy = detalleretencionModel.new DetalleRetencionFocusTraversalPolicy(this);
			
			//detalleretencionFocusTraversalPolicy.setdetalleretencionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleretencionModel);
			
			
			this.jContentPaneDetalleDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleRetencion = new GridBagLayout();	
			this.jContentPaneDetalleDetalleRetencion.setLayout(gridaBagLayoutDetalleDetalleRetencion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleRetencion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
				this.gridBagConstraintsDetalleRetencion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleRetencion.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleRetencion.add(jTtoolBarDetalleDetalleRetencion, gridBagConstraintsDetalleRetencion);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleRetencion=   new JScrollPane(jContentPaneDetalleDetalleRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleRetencion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleRetencion.gridx = 0;
	        
			this.jContentPaneDetalleDetalleRetencion.add(jPanelCamposDetalleRetencion, gridBagConstraintsDetalleRetencion);
			
			
			
			
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
						&& detalleretencionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleretencionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleRetencion= new GridBagConstraints();
						this.gridBagConstraintsDetalleRetencion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleRetencion.gridx = 0;
						this.jContentPaneDetalleDetalleRetencion.add(this.jTabbedPaneRelacionesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleRetencion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleRetencion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
					this.gridBagConstraintsDetalleRetencion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleRetencion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleRetencion.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleRetencion.add(jPanelCamposOcultosDetalleRetencion, gridBagConstraintsDetalleRetencion);
				
					this.jPanelCamposOcultosDetalleRetencion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleRetencion.gridx = 0;
	        this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleRetencion.add(this.jPanelAccionesFormularioDetalleRetencion, this.gridBagConstraintsDetalleRetencion);							
			
			
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
	        this.gridBagConstraintsDetalleRetencion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleRetencion.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleRetencion.add(this.jPanelAccionesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleRetencion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleRetencion=   new JScrollPane(this.jPanelCamposDetalleRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRetencion.gridx = 0;
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleRetencion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleRetencion, this.gridBagConstraintsDetalleRetencion);			
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			
			
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
			
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleRetencion;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleRetencion;
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
