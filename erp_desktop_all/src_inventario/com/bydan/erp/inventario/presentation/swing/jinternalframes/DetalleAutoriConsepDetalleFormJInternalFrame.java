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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.DetalleAutoriConsepConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class DetalleAutoriConsepDetalleFormJInternalFrame extends DetalleAutoriConsepBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleAutoriConsep;
	
	protected JMenuBar jmenuBarDetalleDetalleAutoriConsep;
	
	protected JMenu jmenuDetalleDetalleAutoriConsep;
	protected JMenu jmenuDetalleArchivoDetalleAutoriConsep;
	protected JMenu jmenuDetalleAccionesDetalleAutoriConsep;
	protected JMenu jmenuDetalleDatosDetalleAutoriConsep;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleAutoriConsep;	
	protected GridBagConstraints gridBagConstraintsDetalleAutoriConsep;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleAutoriConsepBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleAutoriConsep;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AutoriConsepBeanSwingJInternalFrame autoriconsepBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_autoriconsep="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EstadoDetalleAutoriConsepBeanSwingJInternalFrame estadodetalleautoriconsepBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetalleautoriconsep="";
	
	public DetalleAutoriConsepSessionBean detalleautoriconsepSessionBean;
	
	
	
	
	public AutoriConsepSessionBean autoriconsepSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EstadoDetalleAutoriConsepSessionBean estadodetalleautoriconsepSessionBean;	
	
	public DetalleAutoriConsepLogic detalleautoriconsepLogic;
	
	public JScrollPane jScrollPanelDatosDetalleAutoriConsep;
	public JScrollPane jScrollPanelDatosEdicionDetalleAutoriConsep;
	public JScrollPane jScrollPanelDatosGeneralDetalleAutoriConsep;
	
	protected JPanel jPanelCamposDetalleAutoriConsep;    
	protected JPanel jPanelCamposOcultosDetalleAutoriConsep;    	
	protected JPanel jPanelAccionesDetalleAutoriConsep;
	protected JPanel jPanelAccionesFormularioDetalleAutoriConsep;
    
	
	
	protected Integer iXPanelCamposDetalleAutoriConsep=0;
	protected Integer iYPanelCamposDetalleAutoriConsep=0;
	
	protected Integer iXPanelCamposOcultosDetalleAutoriConsep=0;
	protected Integer iYPanelCamposOcultosDetalleAutoriConsep=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleAutoriConsep;
	public JButton jButtonModificarDetalleAutoriConsep;
	public JButton jButtonActualizarDetalleAutoriConsep;
    public JButton jButtonEliminarDetalleAutoriConsep;
	public JButton jButtonCancelarDetalleAutoriConsep;
    public JButton jButtonGuardarCambiosDetalleAutoriConsep;
	public JButton jButtonGuardarCambiosTablaDetalleAutoriConsep;
	protected JButton jButtonCerrarDetalleAutoriConsep;
	
	
	protected JButton jButtonProcesarInformacionDetalleAutoriConsep;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleAutoriConsep;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleAutoriConsep;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleAutoriConsep;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleAutoriConsep;
	protected JButton jButtonModificarToolBarDetalleAutoriConsep;
	protected JButton jButtonActualizarToolBarDetalleAutoriConsep;
    protected JButton jButtonEliminarToolBarDetalleAutoriConsep;
	protected JButton jButtonCancelarToolBarDetalleAutoriConsep;
    protected JButton jButtonGuardarCambiosToolBarDetalleAutoriConsep;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleAutoriConsep;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleAutoriConsep;
	protected JButton jButtonCerrarToolBarDetalleAutoriConsep;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleAutoriConsep;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleAutoriConsep;
	protected JMenuItem jMenuItemModificarDetalleAutoriConsep;
	protected JMenuItem jMenuItemActualizarDetalleAutoriConsep;
    protected JMenuItem jMenuItemEliminarDetalleAutoriConsep;
	protected JMenuItem jMenuItemCancelarDetalleAutoriConsep;
    protected JMenuItem jMenuItemGuardarCambiosDetalleAutoriConsep;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleAutoriConsep;
	protected JMenuItem jMenuItemCerrarDetalleAutoriConsep;
	protected JMenuItem jMenuItemDetalleCerrarDetalleAutoriConsep;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleAutoriConsep;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleAutoriConsep;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleAutoriConsep;
	protected JMenuItem jMenuItemMostrarOcultarDetalleAutoriConsep;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleAutoriConsep;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleAutoriConsep;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleAutoriConsep;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleAutoriConsep;
	public JLabel jLabelIdDetalleAutoriConsep;
	public JLabel jLabelidDetalleAutoriConsep;
	public JButton jButtonidDetalleAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_anioDetalleAutoriConsep;
	public JLabel jLabelcantidad_anioDetalleAutoriConsep;
	public JTextField jTextFieldcantidad_anioDetalleAutoriConsep;
	public JButton jButtoncantidad_anioDetalleAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_saldoDetalleAutoriConsep;
	public JLabel jLabelcantidad_saldoDetalleAutoriConsep;
	public JTextField jTextFieldcantidad_saldoDetalleAutoriConsep;
	public JButton jButtoncantidad_saldoDetalleAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelnombreDetalleAutoriConsep;
	public JLabel jLabelnombreDetalleAutoriConsep;
	public JTextField jTextFieldnombreDetalleAutoriConsep;
	public JButton jButtonnombreDetalleAutoriConsepBusqueda= new JButtonMe();

	
	public JPanel jPanelid_autori_consepDetalleAutoriConsep;
	public JLabel jLabelid_autori_consepDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_autori_consepDetalleAutoriConsep;
	public JButton jButtonid_autori_consepDetalleAutoriConsep= new JButtonMe();
	public JButton jButtonid_autori_consepDetalleAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_autori_consepDetalleAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleAutoriConsep;
	public JLabel jLabelid_empresaDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleAutoriConsep;
	public JButton jButtonid_empresaDetalleAutoriConsep= new JButtonMe();
	public JButton jButtonid_empresaDetalleAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleAutoriConsep;
	public JLabel jLabelid_productoDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleAutoriConsep;
	public JButton jButtonid_productoDetalleAutoriConsep= new JButtonMe();
	public JButton jButtonid_productoDetalleAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleAutoriConsep;
	public JLabel jLabelid_unidadDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleAutoriConsep;
	public JButton jButtonid_unidadDetalleAutoriConsep= new JButtonMe();
	public JButton jButtonid_unidadDetalleAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_detalle_autori_consepDetalleAutoriConsep;
	public JLabel jLabelid_estado_detalle_autori_consepDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep;
	public JButton jButtonid_estado_detalle_autori_consepDetalleAutoriConsep= new JButtonMe();
	public JButton jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleAutoriConsep;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleAutoriConsepDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleAutoriConsep=new JPanel();
				this.jPanelAccionesFormularioDetalleAutoriConsep=new JPanel();
				this.jmenuBarDetalleDetalleAutoriConsep=new JMenuBar();
				this.jTtoolBarDetalleDetalleAutoriConsep=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAutoriConsepDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleAutoriConsepDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAutoriConsepDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAutoriConsepDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAutoriConsepDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleAutoriConsep() {
		return this.jButtonActualizarToolBarDetalleAutoriConsep;
	}
	
	public JButton getjButtonEliminarToolBarDetalleAutoriConsep() {
		return this.jButtonEliminarToolBarDetalleAutoriConsep;
	}
	
	public JButton getjButtonCancelarToolBarDetalleAutoriConsep() {
		return this.jButtonCancelarToolBarDetalleAutoriConsep;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleAutoriConsep() {
		return this.jButtonProcesarInformacionDetalleAutoriConsep;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleAutoriConsep)	{
		this.jButtonProcesarInformacionDetalleAutoriConsep = jButtonProcesarInformacionDetalleAutoriConsep;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleAutoriConsep() {
		return this.jComboBoxTiposAccionesDetalleAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleAutoriConsep(
			JComboBox jComboBoxTiposRelacionesDetalleAutoriConsep) {
		this.jComboBoxTiposRelacionesDetalleAutoriConsep = jComboBoxTiposRelacionesDetalleAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleAutoriConsep(
			JComboBox jComboBoxTiposAccionesDetalleAutoriConsep) {
		this.jComboBoxTiposAccionesDetalleAutoriConsep = jComboBoxTiposAccionesDetalleAutoriConsep;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleAutoriConsep() {
		return this.jComboBoxTiposAccionesFormularioDetalleAutoriConsep;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleAutoriConsep(
			JComboBox jComboBoxTiposAccionesFormularioDetalleAutoriConsep) {
		this.jComboBoxTiposAccionesFormularioDetalleAutoriConsep = jComboBoxTiposAccionesFormularioDetalleAutoriConsep;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
		
		this.detalleautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleautoriconsepSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleAutoriConsepJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Autorizacion Consep MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleAutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleAutoriConsep= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleAutoriConsep=new JButtonMe();
				this.jButtonModificarToolBarDetalleAutoriConsep=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleAutoriConsep,this.jTtoolBarDetalleDetalleAutoriConsep,
							"actualizar","actualizar","Actualizar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleAutoriConsep,this.jTtoolBarDetalleDetalleAutoriConsep,
							"eliminar","eliminar","Eliminar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleAutoriConsep,this.jTtoolBarDetalleDetalleAutoriConsep,
							"cancelar","cancelar","Cancelar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleAutoriConsep,this.jTtoolBarDetalleDetalleAutoriConsep,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleAutoriConsep=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleAutoriConsep=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleAutoriConsep=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleAutoriConsep=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleAutoriConsep=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleAutoriConsep= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleAutoriConsep.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleAutoriConsep,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleAutoriConsep= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleAutoriConsep.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleAutoriConsep,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleAutoriConsep= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleAutoriConsep.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleAutoriConsep,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleAutoriConsep= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleAutoriConsep.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleAutoriConsep,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleAutoriConsep= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleAutoriConsep.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleAutoriConsep,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleAutoriConsep= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleAutoriConsep.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleAutoriConsep,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleAutoriConsep.add(this.jMenuItemDetalleCerrarDetalleAutoriConsep);
		
		this.jmenuDetalleAccionesDetalleAutoriConsep.add(this.jMenuItemActualizarDetalleAutoriConsep);
		this.jmenuDetalleAccionesDetalleAutoriConsep.add(this.jMenuItemEliminarDetalleAutoriConsep);
		this.jmenuDetalleAccionesDetalleAutoriConsep.add(this.jMenuItemCancelarDetalleAutoriConsep);		
		
		//this.jmenuDetalleDatosDetalleAutoriConsep.add(this.jMenuItemDetalleAbrirOrderByDetalleAutoriConsep);				
		this.jmenuDetalleDatosDetalleAutoriConsep.add(this.jMenuItemDetalleMostarOcultarDetalleAutoriConsep);				
				
		//this.jmenuDetalleAccionesDetalleAutoriConsep.add(this.jMenuItemGuardarCambiosDetalleAutoriConsep);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleAutoriConsep.add(this.jmenuDetalleArchivoDetalleAutoriConsep);		
		this.jmenuBarDetalleDetalleAutoriConsep.add(this.jmenuDetalleAccionesDetalleAutoriConsep);		
		this.jmenuBarDetalleDetalleAutoriConsep.add(this.jmenuDetalleDatosDetalleAutoriConsep);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleAutoriConsep);				
	}
	
	
	public void inicializarElementosCamposDetalleAutoriConsep() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleAutoriConsep = new JLabelMe();
		jLabelIdDetalleAutoriConsep.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleAutoriConsep = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleAutoriConsep.setToolTipText(DetalleAutoriConsepConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleAutoriConsep= new GridBagLayout();

		this.jPanelidDetalleAutoriConsep.setLayout(this.gridaBagLayoutDetalleAutoriConsep);

		jLabelidDetalleAutoriConsep = new JLabel();
		jLabelidDetalleAutoriConsep.setText("Id");

		jLabelidDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidad_anioDetalleAutoriConsep = new JLabelMe();
		this.jLabelcantidad_anioDetalleAutoriConsep.setText(""+DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO+" : *");
		this.jLabelcantidad_anioDetalleAutoriConsep.setToolTipText("Cantidad");
		this.jLabelcantidad_anioDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_anioDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_anioDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_anioDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_anioDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_anioDetalleAutoriConsep.setToolTipText(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO);
		this.gridaBagLayoutDetalleAutoriConsep = new GridBagLayout();
		this.jPanelcantidad_anioDetalleAutoriConsep.setLayout(this.gridaBagLayoutDetalleAutoriConsep);


		jTextFieldcantidad_anioDetalleAutoriConsep= new JTextFieldMe();
		jTextFieldcantidad_anioDetalleAutoriConsep.setEnabled(false);
		jTextFieldcantidad_anioDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_anioDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_anioDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_anioDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_anioDetalleAutoriConsep.setText("0.0");

		this.jButtoncantidad_anioDetalleAutoriConsepBusqueda= new JButtonMe();
		this.jButtoncantidad_anioDetalleAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_anioDetalleAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_anioDetalleAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_anioDetalleAutoriConsepBusqueda.setText("U");
		this.jButtoncantidad_anioDetalleAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_anioDetalleAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_anioDetalleAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_anioDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_anioDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_anioDetalleAutoriConsepBusqueda"));

		if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_anioDetalleAutoriConsepBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_saldoDetalleAutoriConsep = new JLabelMe();
		this.jLabelcantidad_saldoDetalleAutoriConsep.setText(""+DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO+" : *");
		this.jLabelcantidad_saldoDetalleAutoriConsep.setToolTipText("Saldo");
		this.jLabelcantidad_saldoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_saldoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_saldoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_saldoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_saldoDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_saldoDetalleAutoriConsep.setToolTipText(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO);
		this.gridaBagLayoutDetalleAutoriConsep = new GridBagLayout();
		this.jPanelcantidad_saldoDetalleAutoriConsep.setLayout(this.gridaBagLayoutDetalleAutoriConsep);


		jTextFieldcantidad_saldoDetalleAutoriConsep= new JTextFieldMe();
		jTextFieldcantidad_saldoDetalleAutoriConsep.setEnabled(false);
		jTextFieldcantidad_saldoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_saldoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_saldoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_saldoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_saldoDetalleAutoriConsep.setText("0.0");

		this.jButtoncantidad_saldoDetalleAutoriConsepBusqueda= new JButtonMe();
		this.jButtoncantidad_saldoDetalleAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_saldoDetalleAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_saldoDetalleAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_saldoDetalleAutoriConsepBusqueda.setText("U");
		this.jButtoncantidad_saldoDetalleAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_saldoDetalleAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_saldoDetalleAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_saldoDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_saldoDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_saldoDetalleAutoriConsepBusqueda"));

		if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_saldoDetalleAutoriConsepBusqueda.setVisible(false);		}


					
		this.jLabelnombreDetalleAutoriConsep = new JLabelMe();
		this.jLabelnombreDetalleAutoriConsep.setText(""+DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE+" :");
		this.jLabelnombreDetalleAutoriConsep.setToolTipText("Nombre");
		this.jLabelnombreDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDetalleAutoriConsep.setToolTipText(DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDetalleAutoriConsep = new GridBagLayout();
		this.jPanelnombreDetalleAutoriConsep.setLayout(this.gridaBagLayoutDetalleAutoriConsep);


		jTextFieldnombreDetalleAutoriConsep= new JTextFieldMe();

		jTextFieldnombreDetalleAutoriConsep.setEnabled(false);
		jTextFieldnombreDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreDetalleAutoriConsepBusqueda= new JButtonMe();
		this.jButtonnombreDetalleAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDetalleAutoriConsepBusqueda.setText("U");
		this.jButtonnombreDetalleAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDetalleAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDetalleAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDetalleAutoriConsepBusqueda"));

		if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDetalleAutoriConsepBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleAutoriConsep() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_autori_consepDetalleAutoriConsep = new JLabelMe();
		this.jLabelid_autori_consepDetalleAutoriConsep.setText(""+DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP+" : *");
		this.jLabelid_autori_consepDetalleAutoriConsep.setToolTipText("Autorizacion Consep");
		this.jLabelid_autori_consepDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_autori_consepDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_autori_consepDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_autori_consepDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_autori_consepDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_autori_consepDetalleAutoriConsep.setToolTipText(DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP);
		this.gridaBagLayoutDetalleAutoriConsep = new GridBagLayout();
		this.jPanelid_autori_consepDetalleAutoriConsep.setLayout(this.gridaBagLayoutDetalleAutoriConsep);


		jComboBoxid_autori_consepDetalleAutoriConsep= new JComboBoxMe();
		jComboBoxid_autori_consepDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_autori_consepDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_autori_consepDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_autori_consepDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_autori_consepDetalleAutoriConsep= new JButtonMe();
		this.jButtonid_autori_consepDetalleAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_autori_consepDetalleAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_autori_consepDetalleAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_autori_consepDetalleAutoriConsep.setText("Buscar");
		this.jButtonid_autori_consepDetalleAutoriConsep.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_autori_consepDetalleAutoriConsep.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_autori_consepDetalleAutoriConsep,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_autori_consepDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_autori_consepDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_autori_consepDetalleAutoriConsep"));

		this.jButtonid_autori_consepDetalleAutoriConsepBusqueda= new JButtonMe();
		this.jButtonid_autori_consepDetalleAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_autori_consepDetalleAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_autori_consepDetalleAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_autori_consepDetalleAutoriConsepBusqueda.setText("U");
		this.jButtonid_autori_consepDetalleAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_autori_consepDetalleAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_autori_consepDetalleAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_autori_consepDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_autori_consepDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_autori_consepDetalleAutoriConsepBusqueda"));

		if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_autori_consepDetalleAutoriConsepBusqueda.setVisible(false);		}

		this.jButtonid_autori_consepDetalleAutoriConsepUpdate= new JButtonMe();
		this.jButtonid_autori_consepDetalleAutoriConsepUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_autori_consepDetalleAutoriConsepUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_autori_consepDetalleAutoriConsepUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_autori_consepDetalleAutoriConsepUpdate.setText("U");
		this.jButtonid_autori_consepDetalleAutoriConsepUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_autori_consepDetalleAutoriConsepUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_autori_consepDetalleAutoriConsepUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_autori_consepDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_autori_consepDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_autori_consepDetalleAutoriConsepUpdate"));



					
		this.jLabelid_empresaDetalleAutoriConsep = new JLabelMe();
		this.jLabelid_empresaDetalleAutoriConsep.setText(""+DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleAutoriConsep.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleAutoriConsep.setToolTipText(DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleAutoriConsep = new GridBagLayout();
		this.jPanelid_empresaDetalleAutoriConsep.setLayout(this.gridaBagLayoutDetalleAutoriConsep);


		jComboBoxid_empresaDetalleAutoriConsep= new JComboBoxMe();
		jComboBoxid_empresaDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleAutoriConsep.setEnabled(false);

		this.jButtonid_empresaDetalleAutoriConsep= new JButtonMe();
		this.jButtonid_empresaDetalleAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleAutoriConsep.setText("Buscar");
		this.jButtonid_empresaDetalleAutoriConsep.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleAutoriConsep.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleAutoriConsep,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleAutoriConsep"));

		this.jButtonid_empresaDetalleAutoriConsepBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleAutoriConsepBusqueda.setText("U");
		this.jButtonid_empresaDetalleAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleAutoriConsepBusqueda"));

		if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleAutoriConsepBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleAutoriConsepUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleAutoriConsepUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAutoriConsepUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAutoriConsepUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleAutoriConsepUpdate.setText("U");
		this.jButtonid_empresaDetalleAutoriConsepUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleAutoriConsepUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleAutoriConsepUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleAutoriConsepUpdate"));



					
		this.jLabelid_productoDetalleAutoriConsep = new JLabelMe();
		this.jLabelid_productoDetalleAutoriConsep.setText(""+DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleAutoriConsep.setToolTipText("Producto");
		this.jLabelid_productoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleAutoriConsep.setToolTipText(DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleAutoriConsep = new GridBagLayout();
		this.jPanelid_productoDetalleAutoriConsep.setLayout(this.gridaBagLayoutDetalleAutoriConsep);


		jComboBoxid_productoDetalleAutoriConsep= new JComboBoxMe();
		jComboBoxid_productoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleAutoriConsep= new JButtonMe();
		this.jButtonid_productoDetalleAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleAutoriConsep.setText("Buscar");
		this.jButtonid_productoDetalleAutoriConsep.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleAutoriConsep.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleAutoriConsep,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleAutoriConsep"));

		this.jButtonid_productoDetalleAutoriConsepBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleAutoriConsepBusqueda.setText("U");
		this.jButtonid_productoDetalleAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleAutoriConsepBusqueda"));

		if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleAutoriConsepBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleAutoriConsepUpdate= new JButtonMe();
		this.jButtonid_productoDetalleAutoriConsepUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleAutoriConsepUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleAutoriConsepUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleAutoriConsepUpdate.setText("U");
		this.jButtonid_productoDetalleAutoriConsepUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleAutoriConsepUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleAutoriConsepUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleAutoriConsepUpdate"));



					
		this.jLabelid_unidadDetalleAutoriConsep = new JLabelMe();
		this.jLabelid_unidadDetalleAutoriConsep.setText(""+DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleAutoriConsep.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleAutoriConsep.setToolTipText(DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleAutoriConsep = new GridBagLayout();
		this.jPanelid_unidadDetalleAutoriConsep.setLayout(this.gridaBagLayoutDetalleAutoriConsep);


		jComboBoxid_unidadDetalleAutoriConsep= new JComboBoxMe();
		jComboBoxid_unidadDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleAutoriConsep= new JButtonMe();
		this.jButtonid_unidadDetalleAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleAutoriConsep.setText("Buscar");
		this.jButtonid_unidadDetalleAutoriConsep.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleAutoriConsep.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleAutoriConsep,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleAutoriConsep"));

		this.jButtonid_unidadDetalleAutoriConsepBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleAutoriConsepBusqueda.setText("U");
		this.jButtonid_unidadDetalleAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleAutoriConsepBusqueda"));

		if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleAutoriConsepBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleAutoriConsepUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleAutoriConsepUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleAutoriConsepUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleAutoriConsepUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleAutoriConsepUpdate.setText("U");
		this.jButtonid_unidadDetalleAutoriConsepUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleAutoriConsepUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleAutoriConsepUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleAutoriConsepUpdate"));



					
		this.jLabelid_estado_detalle_autori_consepDetalleAutoriConsep = new JLabelMe();
		this.jLabelid_estado_detalle_autori_consepDetalleAutoriConsep.setText(""+DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP+" : *");
		this.jLabelid_estado_detalle_autori_consepDetalleAutoriConsep.setToolTipText("Estado");
		this.jLabelid_estado_detalle_autori_consepDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_autori_consepDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_autori_consepDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_autori_consepDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_autori_consepDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_autori_consepDetalleAutoriConsep.setToolTipText(DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP);
		this.gridaBagLayoutDetalleAutoriConsep = new GridBagLayout();
		this.jPanelid_estado_detalle_autori_consepDetalleAutoriConsep.setLayout(this.gridaBagLayoutDetalleAutoriConsep);


		jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep= new JComboBoxMe();
		jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsep= new JButtonMe();
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsep.setText("Buscar");
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsep.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsep.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsep,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_autori_consepDetalleAutoriConsep"));

		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda.setText("U");
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_autori_consepDetalleAutoriConsepBusqueda"));

		if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate.setText("U");
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_autori_consepDetalleAutoriConsepUpdate"));



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
		//this.jInternalFrameDetalleDetalleAutoriConsep = new DetalleAutoriConsepBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Autorizacion Consep DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleAutoriConsep= new GridBagLayout();
		

		
		String sToolTipDetalleAutoriConsep="";
		sToolTipDetalleAutoriConsep=DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleAutoriConsep+="(Inventario.DetalleAutoriConsep)";
		}
		
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleAutoriConsep+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleAutoriConsep = new JButtonMe();
		this.jButtonModificarDetalleAutoriConsep = new JButtonMe();
        this.jButtonActualizarDetalleAutoriConsep = new JButtonMe();
        this.jButtonEliminarDetalleAutoriConsep = new JButtonMe();
        this.jButtonCancelarDetalleAutoriConsep = new JButtonMe();
        this.jButtonGuardarCambiosDetalleAutoriConsep = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleAutoriConsep = new JButtonMe();
		this.jButtonCerrarDetalleAutoriConsep = new JButtonMe();
		
		this.jScrollPanelDatosDetalleAutoriConsep = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleAutoriConsep = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleAutoriConsep = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Autorizacion Consep";
		
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Autorizacion Consepes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleAutoriConsep.setName("jPanelCamposDetalleAutoriConsep"); 

		this.jPanelCamposOcultosDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleAutoriConsep.setName("jPanelCamposOcultosDetalleAutoriConsep"); 

        this.jPanelAccionesDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesDetalleAutoriConsep.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleAutoriConsep.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleAutoriConsep.setText("Nuevo");
		this.jButtonModificarDetalleAutoriConsep.setText("Editar");
        this.jButtonActualizarDetalleAutoriConsep.setText("Actualizar");
        this.jButtonEliminarDetalleAutoriConsep.setText("Eliminar");
        this.jButtonCancelarDetalleAutoriConsep.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleAutoriConsep.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleAutoriConsep.setText("Guardar");
		this.jButtonCerrarDetalleAutoriConsep.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleAutoriConsep,"nuevo_button","Nuevo",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleAutoriConsep,"modificar_button","Editar",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleAutoriConsep,"actualizar_button","Actualizar",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleAutoriConsep,"eliminar_button","Eliminar",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleAutoriConsep,"cancelar_button","Cancelar",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleAutoriConsep,"guardarcambios_button","Guardar",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleAutoriConsep,"guardarcambiostabla_button","Guardar",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleAutoriConsep,"cerrar_button","Salir",this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleAutoriConsep.setToolTipText("Nuevo"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleAutoriConsep.setToolTipText("Editar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleAutoriConsep.setToolTipText("Actualizar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleAutoriConsep.setToolTipText("Eliminar)"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleAutoriConsep.setToolTipText("Cancelar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleAutoriConsep.setToolTipText("Guardar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleAutoriConsep.setToolTipText("Guardar"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleAutoriConsep.setToolTipText("Salir"+" "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleAutoriConsep";
		inputMap = this.jButtonNuevoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleAutoriConsep"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleAutoriConsep";
		inputMap = this.jButtonActualizarDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleAutoriConsep"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleAutoriConsep";
		inputMap = this.jButtonEliminarDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleAutoriConsep"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleAutoriConsep";
		inputMap = this.jButtonCancelarDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleAutoriConsep"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleAutoriConsep";
		inputMap = this.jButtonCerrarDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleAutoriConsep"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleAutoriConsep";
		inputMap = this.jButtonGuardarCambiosTablaDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleAutoriConsep"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleAutoriConsep.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleAutoriConsep.setToolTipText("Nuevo DetalleAutoriConsep");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleAutoriConsep.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleAutoriConsep.setToolTipText("Sin Cerrar Ventana DetalleAutoriConsep");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleAutoriConsep.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleAutoriConsep.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleAutoriConsep.setText("Accion");
		this.jComboBoxTiposAccionesDetalleAutoriConsep.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleAutoriConsep = new JLabelMe();
		
		this.jLabelAccionesDetalleAutoriConsep.setText("Acciones");		
		this.jLabelAccionesDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleAutoriConsep();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleAutoriConsep();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleAutoriConsep=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleAutoriConsep = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleAutoriConsep = new GridBagLayout();
		
		this.jPanelCamposDetalleAutoriConsep.setLayout(gridaBagLayoutCamposDetalleAutoriConsep);
		this.jPanelCamposOcultosDetalleAutoriConsep.setLayout(gridaBagLayoutCamposOcultosDetalleAutoriConsep);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleAutoriConsep.add(jLabelIdDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleAutoriConsep.add(jLabelidDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);


	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_autori_consepDetalleAutoriConsep.add(jLabelid_autori_consepDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 2;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_autori_consepDetalleAutoriConsep.add(jButtonid_autori_consepDetalleAutoriConsepBusqueda, this.gridBagConstraintsDetalleAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 3;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_autori_consepDetalleAutoriConsep.add(jButtonid_autori_consepDetalleAutoriConsepUpdate, this.gridBagConstraintsDetalleAutoriConsep);
	}

	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_autori_consepDetalleAutoriConsep.add(jComboBoxid_autori_consepDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);


	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleAutoriConsep.add(jLabelid_empresaDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 2;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleAutoriConsep.add(jButtonid_empresaDetalleAutoriConsepBusqueda, this.gridBagConstraintsDetalleAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 3;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleAutoriConsep.add(jButtonid_empresaDetalleAutoriConsepUpdate, this.gridBagConstraintsDetalleAutoriConsep);
	}

	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleAutoriConsep.add(jComboBoxid_empresaDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);


	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleAutoriConsep.add(jLabelid_productoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 2;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleAutoriConsep.add(jButtonid_productoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 3;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleAutoriConsep.add(jButtonid_productoDetalleAutoriConsepBusqueda, this.gridBagConstraintsDetalleAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 4;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleAutoriConsep.add(jButtonid_productoDetalleAutoriConsepUpdate, this.gridBagConstraintsDetalleAutoriConsep);
	}

	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleAutoriConsep.add(jComboBoxid_productoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);


	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleAutoriConsep.add(jLabelid_unidadDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 2;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleAutoriConsep.add(jButtonid_unidadDetalleAutoriConsepBusqueda, this.gridBagConstraintsDetalleAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 3;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleAutoriConsep.add(jButtonid_unidadDetalleAutoriConsepUpdate, this.gridBagConstraintsDetalleAutoriConsep);
	}

	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleAutoriConsep.add(jComboBoxid_unidadDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);


	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_anioDetalleAutoriConsep.add(jLabelcantidad_anioDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 2;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_anioDetalleAutoriConsep.add(jButtoncantidad_anioDetalleAutoriConsepBusqueda, this.gridBagConstraintsDetalleAutoriConsep);
	}

	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_anioDetalleAutoriConsep.add(jTextFieldcantidad_anioDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);


	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_saldoDetalleAutoriConsep.add(jLabelcantidad_saldoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 2;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_saldoDetalleAutoriConsep.add(jButtoncantidad_saldoDetalleAutoriConsepBusqueda, this.gridBagConstraintsDetalleAutoriConsep);
	}

	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_saldoDetalleAutoriConsep.add(jTextFieldcantidad_saldoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);


	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_detalle_autori_consepDetalleAutoriConsep.add(jLabelid_estado_detalle_autori_consepDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 2;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_autori_consepDetalleAutoriConsep.add(jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda, this.gridBagConstraintsDetalleAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 3;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_autori_consepDetalleAutoriConsep.add(jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate, this.gridBagConstraintsDetalleAutoriConsep);
	}

	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_detalle_autori_consepDetalleAutoriConsep.add(jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);


	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDetalleAutoriConsep.add(jLabelnombreDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 2;
		this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDetalleAutoriConsep.add(jButtonnombreDetalleAutoriConsepBusqueda, this.gridBagConstraintsDetalleAutoriConsep);
	}

	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDetalleAutoriConsep.add(jTextFieldnombreDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = iYPanelCamposDetalleAutoriConsep;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = iXPanelCamposDetalleAutoriConsep++;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleAutoriConsep.add(this.jPanelidDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(iXPanelCamposDetalleAutoriConsep % 1==0) {
		iXPanelCamposDetalleAutoriConsep=0;
		iYPanelCamposDetalleAutoriConsep++;
	}
	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = iYPanelCamposDetalleAutoriConsep;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = iXPanelCamposDetalleAutoriConsep++;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleAutoriConsep.add(this.jPanelid_autori_consepDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(iXPanelCamposDetalleAutoriConsep % 1==0) {
		iXPanelCamposDetalleAutoriConsep=0;
		iYPanelCamposDetalleAutoriConsep++;
	}
	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = iYPanelCamposDetalleAutoriConsep;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = iXPanelCamposDetalleAutoriConsep++;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleAutoriConsep.add(this.jPanelid_productoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(iXPanelCamposDetalleAutoriConsep % 1==0) {
		iXPanelCamposDetalleAutoriConsep=0;
		iYPanelCamposDetalleAutoriConsep++;
	}
	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = iYPanelCamposDetalleAutoriConsep;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = iXPanelCamposDetalleAutoriConsep++;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleAutoriConsep.add(this.jPanelid_unidadDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(iXPanelCamposDetalleAutoriConsep % 1==0) {
		iXPanelCamposDetalleAutoriConsep=0;
		iYPanelCamposDetalleAutoriConsep++;
	}
	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = iYPanelCamposDetalleAutoriConsep;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = iXPanelCamposDetalleAutoriConsep++;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleAutoriConsep.add(this.jPanelcantidad_anioDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(iXPanelCamposDetalleAutoriConsep % 1==0) {
		iXPanelCamposDetalleAutoriConsep=0;
		iYPanelCamposDetalleAutoriConsep++;
	}
	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = iYPanelCamposDetalleAutoriConsep;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = iXPanelCamposDetalleAutoriConsep++;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleAutoriConsep.add(this.jPanelcantidad_saldoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(iXPanelCamposDetalleAutoriConsep % 1==0) {
		iXPanelCamposDetalleAutoriConsep=0;
		iYPanelCamposDetalleAutoriConsep++;
	}
	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = iYPanelCamposDetalleAutoriConsep;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = iXPanelCamposDetalleAutoriConsep++;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleAutoriConsep.add(this.jPanelid_estado_detalle_autori_consepDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(iXPanelCamposDetalleAutoriConsep % 1==0) {
		iXPanelCamposDetalleAutoriConsep=0;
		iYPanelCamposDetalleAutoriConsep++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = iYPanelCamposOcultosDetalleAutoriConsep;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = iXPanelCamposOcultosDetalleAutoriConsep++;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAutoriConsep.add(this.jPanelid_empresaDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(iXPanelCamposOcultosDetalleAutoriConsep % 1==0) {
		iXPanelCamposOcultosDetalleAutoriConsep=0;
		iYPanelCamposOcultosDetalleAutoriConsep++;
	}
	this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAutoriConsep.gridy = iYPanelCamposOcultosDetalleAutoriConsep;
	this.gridBagConstraintsDetalleAutoriConsep.gridx = iXPanelCamposOcultosDetalleAutoriConsep++;
	this.gridBagConstraintsDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAutoriConsep.add(this.jPanelnombreDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);



	if(iXPanelCamposOcultosDetalleAutoriConsep % 1==0) {
		iXPanelCamposOcultosDetalleAutoriConsep=0;
		iYPanelCamposOcultosDetalleAutoriConsep++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleAutoriConsep= new GridBagLayout();
		this.jPanelAccionesDetalleAutoriConsep.setLayout(gridaBagLayoutAccionesDetalleAutoriConsep);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleAutoriConsep= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleAutoriConsep.setLayout(gridaBagLayoutAccionesFormularioDetalleAutoriConsep);
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleAutoriConsep.add(this.jComboBoxTiposAccionesFormularioDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleAutoriConsep.add(this.jCheckBoxPostAccionNuevoDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleAutoriConsep.add(this.jCheckBoxPostAccionSinCerrarDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleAutoriConsep.add(this.jCheckBoxPostAccionSinMensajeDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleAutoriConsep.add(this.jButtonModificarDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);							

		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsDetalleAutoriConsep.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleAutoriConsep.add(this.jButtonEliminarDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
			
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleAutoriConsep.add(this.jButtonActualizarDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);


		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleAutoriConsep.add(this.jButtonGuardarCambiosDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);	
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = 0;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleAutoriConsep.add(this.jButtonCancelarDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleAutoriConsep = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleAutoriConsep);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();						
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;		
			//this.gridBagConstraintsDetalleAutoriConsep.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleAutoriConsep.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleAutoriConsep.gridx =0;
		this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleAutoriConsep.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleAutoriConsep = new DetalleAutoriConsepBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Autorizacion Consep DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Autorizacion Consep DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Autorizacion Consep Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleAutoriConsepModel detalleautoriconsepModel=new DetalleAutoriConsepModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleAutoriConsepModel.DetalleAutoriConsepFocusTraversalPolicy detalleautoriconsepFocusTraversalPolicy = detalleautoriconsepModel.new DetalleAutoriConsepFocusTraversalPolicy(this);
			
			//detalleautoriconsepFocusTraversalPolicy.setdetalleautoriconsepJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleautoriconsepModel);
			
			
			this.jContentPaneDetalleDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleAutoriConsep = new GridBagLayout();	
			this.jContentPaneDetalleDetalleAutoriConsep.setLayout(gridaBagLayoutDetalleDetalleAutoriConsep);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleAutoriConsep = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleAutoriConsep.add(jTtoolBarDetalleDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleAutoriConsep=   new JScrollPane(jContentPaneDetalleDetalleAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleAutoriConsep=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	        
			this.jContentPaneDetalleDetalleAutoriConsep.add(jPanelCamposDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);
			
			
			
			
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
						&& detalleautoriconsepSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleAutoriConsep= new GridBagConstraints();
						this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
						this.jContentPaneDetalleDetalleAutoriConsep.add(this.jTabbedPaneRelacionesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleAutoriConsep.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleAutoriConsep.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
					this.gridBagConstraintsDetalleAutoriConsep.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleAutoriConsep.add(jPanelCamposOcultosDetalleAutoriConsep, gridBagConstraintsDetalleAutoriConsep);
				
					this.jPanelCamposOcultosDetalleAutoriConsep.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	        this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleAutoriConsep.add(this.jPanelAccionesFormularioDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);							
			
			
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
	        this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleAutoriConsep.add(this.jPanelAccionesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleAutoriConsep);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleAutoriConsep=   new JScrollPane(this.jPanelCamposDetalleAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
			this.gridBagConstraintsDetalleAutoriConsep.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleAutoriConsep.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);			
			
			this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsDetalleAutoriConsep.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
			
			
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		
			
		this.gridBagConstraintsDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsDetalleAutoriConsep.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAutoriConsep.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleAutoriConsep, this.gridBagConstraintsDetalleAutoriConsep);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleAutoriConsep;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleAutoriConsep;
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
