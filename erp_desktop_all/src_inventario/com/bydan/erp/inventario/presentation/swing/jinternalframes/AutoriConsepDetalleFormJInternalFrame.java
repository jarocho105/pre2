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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.AutoriConsepConstantesFunciones;

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
public class AutoriConsepDetalleFormJInternalFrame extends AutoriConsepBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAutoriConsep;
	
	protected JMenuBar jmenuBarDetalleAutoriConsep;
	
	protected JMenu jmenuDetalleAutoriConsep;
	protected JMenu jmenuDetalleArchivoAutoriConsep;
	protected JMenu jmenuDetalleAccionesAutoriConsep;
	protected JMenu jmenuDetalleDatosAutoriConsep;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutoriConsep;	
	protected GridBagConstraints gridBagConstraintsAutoriConsep;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AutoriConsepBeanSwingJInternalFrameAdditional jInternalFrameDetalleAutoriConsep;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoAutoriConsepBeanSwingJInternalFrame tipoautoriconsepBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoautoriconsep="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public AutoriConsepSessionBean autoriconsepSessionBean;
	
	

	public DetalleAutoriConsepBeanSwingJInternalFrame detalleautoriconsepBeanSwingJInternalFrame=null;
	public DetalleAutoriConsepBeanSwingJInternalFrame detalleautoriconsepBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleAutoriConsep=false;
	public DetalleAutoriConsepSessionBean detalleautoriconsepSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoAutoriConsepSessionBean tipoautoriconsepSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public AutoriConsepLogic autoriconsepLogic;
	
	public JScrollPane jScrollPanelDatosAutoriConsep;
	public JScrollPane jScrollPanelDatosEdicionAutoriConsep;
	public JScrollPane jScrollPanelDatosGeneralAutoriConsep;
	
	protected JPanel jPanelCamposAutoriConsep;    
	protected JPanel jPanelCamposOcultosAutoriConsep;    	
	protected JPanel jPanelAccionesAutoriConsep;
	protected JPanel jPanelAccionesFormularioAutoriConsep;
    
	
	
	protected Integer iXPanelCamposAutoriConsep=0;
	protected Integer iYPanelCamposAutoriConsep=0;
	
	protected Integer iXPanelCamposOcultosAutoriConsep=0;
	protected Integer iYPanelCamposOcultosAutoriConsep=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAutoriConsep;
	public JButton jButtonModificarAutoriConsep;
	public JButton jButtonActualizarAutoriConsep;
    public JButton jButtonEliminarAutoriConsep;
	public JButton jButtonCancelarAutoriConsep;
    public JButton jButtonGuardarCambiosAutoriConsep;
	public JButton jButtonGuardarCambiosTablaAutoriConsep;
	protected JButton jButtonCerrarAutoriConsep;
	
	
	protected JButton jButtonProcesarInformacionAutoriConsep;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAutoriConsep;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAutoriConsep;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAutoriConsep;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutoriConsep;
	protected JButton jButtonModificarToolBarAutoriConsep;
	protected JButton jButtonActualizarToolBarAutoriConsep;
    protected JButton jButtonEliminarToolBarAutoriConsep;
	protected JButton jButtonCancelarToolBarAutoriConsep;
    protected JButton jButtonGuardarCambiosToolBarAutoriConsep;
	protected JButton jButtonGuardarCambiosTablaToolBarAutoriConsep;
	protected JButton jButtonMostrarOcultarTablaToolBarAutoriConsep;
	protected JButton jButtonCerrarToolBarAutoriConsep;
	
	protected JButton jButtonProcesarInformacionToolBarAutoriConsep;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutoriConsep;
	protected JMenuItem jMenuItemModificarAutoriConsep;
	protected JMenuItem jMenuItemActualizarAutoriConsep;
    protected JMenuItem jMenuItemEliminarAutoriConsep;
	protected JMenuItem jMenuItemCancelarAutoriConsep;
    protected JMenuItem jMenuItemGuardarCambiosAutoriConsep;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutoriConsep;
	protected JMenuItem jMenuItemCerrarAutoriConsep;
	protected JMenuItem jMenuItemDetalleCerrarAutoriConsep;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutoriConsep;
	
	protected JMenuItem jMenuItemProcesarInformacionAutoriConsep;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutoriConsep;
	protected JMenuItem jMenuItemMostrarOcultarAutoriConsep;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutoriConsep;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutoriConsep;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAutoriConsep;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAutoriConsep;
	public JLabel jLabelIdAutoriConsep;
	public JLabel jLabelidAutoriConsep;
	public JButton jButtonidAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPaneles_empresaAutoriConsep;
	public JLabel jLabeles_empresaAutoriConsep;
	public JCheckBox jCheckBoxes_empresaAutoriConsep;
	public JButton jButtones_empresaAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacionAutoriConsep;
	public JLabel jLabelnumero_autorizacionAutoriConsep;
	public JTextField jTextFieldnumero_autorizacionAutoriConsep;
	public JButton jButtonnumero_autorizacionAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionAutoriConsep;
	public JLabel jLabelfecha_emisionAutoriConsep;
	//public JFormattedTextField jDateChooserfecha_emisionAutoriConsep;

	public JDateChooser jDateChooserfecha_emisionAutoriConsep;
	public JButton jButtonfecha_emisionAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoAutoriConsep;
	public JLabel jLabelfecha_vencimientoAutoriConsep;
	//public JFormattedTextField jDateChooserfecha_vencimientoAutoriConsep;

	public JDateChooser jDateChooserfecha_vencimientoAutoriConsep;
	public JButton jButtonfecha_vencimientoAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultimaAutoriConsep;
	public JLabel jLabelfecha_ultimaAutoriConsep;
	//public JFormattedTextField jDateChooserfecha_ultimaAutoriConsep;

	public JDateChooser jDateChooserfecha_ultimaAutoriConsep;
	public JButton jButtonfecha_ultimaAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelfechaAutoriConsep;
	public JLabel jLabelfechaAutoriConsep;
	//public JFormattedTextField jDateChooserfechaAutoriConsep;

	public JDateChooser jDateChooserfechaAutoriConsep;
	public JButton jButtonfechaAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionAutoriConsep;
	public JLabel jLabeldescripcionAutoriConsep;
	public JTextArea jTextAreadescripcionAutoriConsep;
	public JScrollPane jscrollPanedescripcionAutoriConsep;
	public JButton jButtondescripcionAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelnombreAutoriConsep;
	public JLabel jLabelnombreAutoriConsep;
	public JTextField jTextFieldnombreAutoriConsep;
	public JButton jButtonnombreAutoriConsepBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAutoriConsep;
	public JLabel jLabelid_empresaAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAutoriConsep;
	public JButton jButtonid_empresaAutoriConsep= new JButtonMe();
	public JButton jButtonid_empresaAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_empresaAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioAutoriConsep;
	public JLabel jLabelid_usuarioAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioAutoriConsep;
	public JButton jButtonid_usuarioAutoriConsep= new JButtonMe();
	public JButton jButtonid_usuarioAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_usuarioAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteAutoriConsep;
	public JLabel jLabelid_clienteAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteAutoriConsep;
	public JButton jButtonid_clienteAutoriConsep= new JButtonMe();
	public JButton jButtonid_clienteAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_clienteAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_autori_consepAutoriConsep;
	public JLabel jLabelid_tipo_autori_consepAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_autori_consepAutoriConsep;
	public JButton jButtonid_tipo_autori_consepAutoriConsep= new JButtonMe();
	public JButton jButtonid_tipo_autori_consepAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_tipo_autori_consepAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoAutoriConsep;
	public JLabel jLabelid_empleadoAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoAutoriConsep;
	public JButton jButtonid_empleadoAutoriConsep= new JButtonMe();
	public JButton jButtonid_empleadoAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_empleadoAutoriConsepBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAutoriConsep;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="MEDIO";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AutoriConsepDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAutoriConsep=new JPanel();
				this.jPanelAccionesFormularioAutoriConsep=new JPanel();
				this.jmenuBarDetalleAutoriConsep=new JMenuBar();
				this.jTtoolBarDetalleAutoriConsep=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriConsepDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AutoriConsepDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriConsepDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriConsepDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriConsepDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	public JButton getjButtonActualizarToolBarAutoriConsep() {
		return this.jButtonActualizarToolBarAutoriConsep;
	}
	
	public JButton getjButtonEliminarToolBarAutoriConsep() {
		return this.jButtonEliminarToolBarAutoriConsep;
	}
	
	public JButton getjButtonCancelarToolBarAutoriConsep() {
		return this.jButtonCancelarToolBarAutoriConsep;
	}		
	
	public JButton getjButtonProcesarInformacionAutoriConsep() {
		return this.jButtonProcesarInformacionAutoriConsep;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutoriConsep)	{
		this.jButtonProcesarInformacionAutoriConsep = jButtonProcesarInformacionAutoriConsep;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutoriConsep() {
		return this.jComboBoxTiposAccionesAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutoriConsep(
			JComboBox jComboBoxTiposRelacionesAutoriConsep) {
		this.jComboBoxTiposRelacionesAutoriConsep = jComboBoxTiposRelacionesAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutoriConsep(
			JComboBox jComboBoxTiposAccionesAutoriConsep) {
		this.jComboBoxTiposAccionesAutoriConsep = jComboBoxTiposAccionesAutoriConsep;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAutoriConsep() {
		return this.jComboBoxTiposAccionesFormularioAutoriConsep;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAutoriConsep(
			JComboBox jComboBoxTiposAccionesFormularioAutoriConsep) {
		this.jComboBoxTiposAccionesFormularioAutoriConsep = jComboBoxTiposAccionesFormularioAutoriConsep;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.autoriconsepSessionBean=new AutoriConsepSessionBean();
		
		this.autoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autoriconsepSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutoriConsepJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autorizaciones Consep MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
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
	
		AutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAutoriConsep= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAutoriConsep=new JButtonMe();
				this.jButtonModificarToolBarAutoriConsep=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"actualizar","actualizar","Actualizar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"eliminar","eliminar","Eliminar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"cancelar","cancelar","Cancelar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAutoriConsep,this.jTtoolBarDetalleAutoriConsep,
							"guardarcambios","guardarcambios","Guardar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAutoriConsep=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAutoriConsep=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAutoriConsep=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAutoriConsep=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAutoriConsep=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutoriConsep= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutoriConsep.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutoriConsep,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAutoriConsep= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAutoriConsep.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAutoriConsep,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAutoriConsep= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAutoriConsep.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAutoriConsep,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAutoriConsep= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAutoriConsep.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAutoriConsep,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAutoriConsep= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAutoriConsep.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAutoriConsep,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAutoriConsep= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutoriConsep.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutoriConsep,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAutoriConsep.add(this.jMenuItemDetalleCerrarAutoriConsep);
		
		this.jmenuDetalleAccionesAutoriConsep.add(this.jMenuItemActualizarAutoriConsep);
		this.jmenuDetalleAccionesAutoriConsep.add(this.jMenuItemEliminarAutoriConsep);
		this.jmenuDetalleAccionesAutoriConsep.add(this.jMenuItemCancelarAutoriConsep);		
		
		//this.jmenuDetalleDatosAutoriConsep.add(this.jMenuItemDetalleAbrirOrderByAutoriConsep);				
		this.jmenuDetalleDatosAutoriConsep.add(this.jMenuItemDetalleMostarOcultarAutoriConsep);				
				
		//this.jmenuDetalleAccionesAutoriConsep.add(this.jMenuItemGuardarCambiosAutoriConsep);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAutoriConsep.add(this.jmenuDetalleArchivoAutoriConsep);		
		this.jmenuBarDetalleAutoriConsep.add(this.jmenuDetalleAccionesAutoriConsep);		
		this.jmenuBarDetalleAutoriConsep.add(this.jmenuDetalleDatosAutoriConsep);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleAutoriConsep.add(this.jmenuDetalleAutoriConsep);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAutoriConsep);				
	}
	
	
	public void inicializarElementosCamposAutoriConsep() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAutoriConsep = new JLabelMe();
		jLabelIdAutoriConsep.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAutoriConsep = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAutoriConsep= new GridBagLayout();

		this.jPanelidAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);

		jLabelidAutoriConsep = new JLabel();
		jLabelidAutoriConsep.setText("Id");

		jLabelidAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeles_empresaAutoriConsep = new JLabelMe();
		this.jLabeles_empresaAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_ESEMPRESA+" : *");
		this.jLabeles_empresaAutoriConsep.setToolTipText("Es Empresa");
		this.jLabeles_empresaAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_empresaAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_empresaAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_empresaAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_empresaAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_empresaAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_ESEMPRESA);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPaneles_empresaAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		jCheckBoxes_empresaAutoriConsep= new JCheckBoxMe();
		jCheckBoxes_empresaAutoriConsep.setEnabled(false);

		jCheckBoxes_empresaAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_empresaAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_empresaAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_empresaAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_empresaAutoriConsepBusqueda= new JButtonMe();
		this.jButtones_empresaAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_empresaAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_empresaAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_empresaAutoriConsepBusqueda.setText("U");
		this.jButtones_empresaAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_empresaAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_empresaAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_empresaAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_empresaAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_empresaAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_empresaAutoriConsepBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacionAutoriConsep = new JLabelMe();
		this.jLabelnumero_autorizacionAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION+" : *");
		this.jLabelnumero_autorizacionAutoriConsep.setToolTipText("Nro Autorizacion");
		this.jLabelnumero_autorizacionAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacionAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacionAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPanelnumero_autorizacionAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		jTextFieldnumero_autorizacionAutoriConsep= new JTextFieldMe();

		jTextFieldnumero_autorizacionAutoriConsep.setEnabled(false);
		jTextFieldnumero_autorizacionAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacionAutoriConsepBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacionAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacionAutoriConsepBusqueda.setText("U");
		this.jButtonnumero_autorizacionAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacionAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacionAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacionAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacionAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacionAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacionAutoriConsepBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionAutoriConsep = new JLabelMe();
		this.jLabelfecha_emisionAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionAutoriConsep.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPanelfecha_emisionAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		//jFormattedTextFieldfecha_emisionAutoriConsep= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionAutoriConsep= new JDateChooser();
		jDateChooserfecha_emisionAutoriConsep.setEnabled(false);
		jDateChooserfecha_emisionAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionAutoriConsep.setDate(new Date());
		jDateChooserfecha_emisionAutoriConsep.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionAutoriConsep.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionAutoriConsepBusqueda= new JButtonMe();
		this.jButtonfecha_emisionAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionAutoriConsepBusqueda.setText("U");
		this.jButtonfecha_emisionAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionAutoriConsepBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoAutoriConsep = new JLabelMe();
		this.jLabelfecha_vencimientoAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoAutoriConsep.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPanelfecha_vencimientoAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		//jFormattedTextFieldfecha_vencimientoAutoriConsep= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoAutoriConsep= new JDateChooser();
		jDateChooserfecha_vencimientoAutoriConsep.setEnabled(false);
		jDateChooserfecha_vencimientoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoAutoriConsep.setDate(new Date());
		jDateChooserfecha_vencimientoAutoriConsep.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoAutoriConsep.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoAutoriConsepBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoAutoriConsepBusqueda.setText("U");
		this.jButtonfecha_vencimientoAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoAutoriConsepBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultimaAutoriConsep = new JLabelMe();
		this.jLabelfecha_ultimaAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA+" : *");
		this.jLabelfecha_ultimaAutoriConsep.setToolTipText("Fecha Ult Modificacion");
		this.jLabelfecha_ultimaAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultimaAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultimaAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultimaAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultimaAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultimaAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPanelfecha_ultimaAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		//jFormattedTextFieldfecha_ultimaAutoriConsep= new JFormattedTextFieldMe();

		jDateChooserfecha_ultimaAutoriConsep= new JDateChooser();
		jDateChooserfecha_ultimaAutoriConsep.setEnabled(false);
		jDateChooserfecha_ultimaAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimaAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimaAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultimaAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultimaAutoriConsep.setDate(new Date());
		jDateChooserfecha_ultimaAutoriConsep.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultimaAutoriConsep.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultimaAutoriConsepBusqueda= new JButtonMe();
		this.jButtonfecha_ultimaAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimaAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimaAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultimaAutoriConsepBusqueda.setText("U");
		this.jButtonfecha_ultimaAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultimaAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultimaAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultimaAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultimaAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultimaAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultimaAutoriConsepBusqueda.setVisible(false);		}


					
		this.jLabelfechaAutoriConsep = new JLabelMe();
		this.jLabelfechaAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaAutoriConsep.setToolTipText("Fecha");
		this.jLabelfechaAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPanelfechaAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		//jFormattedTextFieldfechaAutoriConsep= new JFormattedTextFieldMe();

		jDateChooserfechaAutoriConsep= new JDateChooser();
		jDateChooserfechaAutoriConsep.setEnabled(false);
		jDateChooserfechaAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaAutoriConsep.setDate(new Date());
		jDateChooserfechaAutoriConsep.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaAutoriConsep.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaAutoriConsepBusqueda= new JButtonMe();
		this.jButtonfechaAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaAutoriConsepBusqueda.setText("U");
		this.jButtonfechaAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaAutoriConsepBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionAutoriConsep = new JLabelMe();
		this.jLabeldescripcionAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionAutoriConsep.setToolTipText("Descripcion");
		this.jLabeldescripcionAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPaneldescripcionAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		jTextAreadescripcionAutoriConsep= new JTextAreaMe();
		jTextAreadescripcionAutoriConsep.setEnabled(false);
		jTextAreadescripcionAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAutoriConsep.setLineWrap(true);
		jTextAreadescripcionAutoriConsep.setWrapStyleWord(true);
		jTextAreadescripcionAutoriConsep.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionAutoriConsep.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionAutoriConsep = new JScrollPane(jTextAreadescripcionAutoriConsep);
		jscrollPanedescripcionAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35));
		jscrollPanedescripcionAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35));
		jscrollPanedescripcionAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35));

		this.jButtondescripcionAutoriConsepBusqueda= new JButtonMe();
		this.jButtondescripcionAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionAutoriConsepBusqueda.setText("U");
		this.jButtondescripcionAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionAutoriConsepBusqueda.setVisible(false);		}


					
		this.jLabelnombreAutoriConsep = new JLabelMe();
		this.jLabelnombreAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_NOMBRE+" :");
		this.jLabelnombreAutoriConsep.setToolTipText("Nombre");
		this.jLabelnombreAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPanelnombreAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		jTextFieldnombreAutoriConsep= new JTextFieldMe();

		jTextFieldnombreAutoriConsep.setEnabled(false);
		jTextFieldnombreAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreAutoriConsepBusqueda= new JButtonMe();
		this.jButtonnombreAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreAutoriConsepBusqueda.setText("U");
		this.jButtonnombreAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreAutoriConsepBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAutoriConsep() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAutoriConsep = new JLabelMe();
		this.jLabelid_empresaAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAutoriConsep.setToolTipText("Empresa");
		this.jLabelid_empresaAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPanelid_empresaAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		jComboBoxid_empresaAutoriConsep= new JComboBoxMe();
		jComboBoxid_empresaAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAutoriConsep.setEnabled(false);

		this.jButtonid_empresaAutoriConsep= new JButtonMe();
		this.jButtonid_empresaAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriConsep.setText("Buscar");
		this.jButtonid_empresaAutoriConsep.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAutoriConsep.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriConsep,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriConsep"));

		this.jButtonid_empresaAutoriConsepBusqueda= new JButtonMe();
		this.jButtonid_empresaAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutoriConsepBusqueda.setText("U");
		this.jButtonid_empresaAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAutoriConsepBusqueda.setVisible(false);		}

		this.jButtonid_empresaAutoriConsepUpdate= new JButtonMe();
		this.jButtonid_empresaAutoriConsepUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriConsepUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriConsepUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutoriConsepUpdate.setText("U");
		this.jButtonid_empresaAutoriConsepUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAutoriConsepUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriConsepUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriConsepUpdate"));



					
		this.jLabelid_usuarioAutoriConsep = new JLabelMe();
		this.jLabelid_usuarioAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioAutoriConsep.setToolTipText("Usuario");
		this.jLabelid_usuarioAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPanelid_usuarioAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		jComboBoxid_usuarioAutoriConsep= new JComboBoxMe();
		jComboBoxid_usuarioAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioAutoriConsep.setEnabled(false);

		this.jButtonid_usuarioAutoriConsep= new JButtonMe();
		this.jButtonid_usuarioAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAutoriConsep.setText("Buscar");
		this.jButtonid_usuarioAutoriConsep.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioAutoriConsep.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAutoriConsep,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAutoriConsep"));

		this.jButtonid_usuarioAutoriConsepBusqueda= new JButtonMe();
		this.jButtonid_usuarioAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAutoriConsepBusqueda.setText("U");
		this.jButtonid_usuarioAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioAutoriConsepBusqueda.setVisible(false);		}

		this.jButtonid_usuarioAutoriConsepUpdate= new JButtonMe();
		this.jButtonid_usuarioAutoriConsepUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriConsepUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriConsepUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAutoriConsepUpdate.setText("U");
		this.jButtonid_usuarioAutoriConsepUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioAutoriConsepUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAutoriConsepUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAutoriConsepUpdate"));



					
		this.jLabelid_clienteAutoriConsep = new JLabelMe();
		this.jLabelid_clienteAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteAutoriConsep.setToolTipText("Cliente");
		this.jLabelid_clienteAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPanelid_clienteAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		jComboBoxid_clienteAutoriConsep= new JComboBoxMe();
		jComboBoxid_clienteAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteAutoriConsep= new JButtonMe();
		this.jButtonid_clienteAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAutoriConsep.setText("Buscar");
		this.jButtonid_clienteAutoriConsep.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteAutoriConsep.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAutoriConsep,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAutoriConsep"));

		this.jButtonid_clienteAutoriConsepBusqueda= new JButtonMe();
		this.jButtonid_clienteAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteAutoriConsepBusqueda.setText("U");
		this.jButtonid_clienteAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteAutoriConsepBusqueda.setVisible(false);		}

		this.jButtonid_clienteAutoriConsepUpdate= new JButtonMe();
		this.jButtonid_clienteAutoriConsepUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriConsepUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriConsepUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteAutoriConsepUpdate.setText("U");
		this.jButtonid_clienteAutoriConsepUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteAutoriConsepUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAutoriConsepUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAutoriConsepUpdate"));



					
		this.jLabelid_tipo_autori_consepAutoriConsep = new JLabelMe();
		this.jLabelid_tipo_autori_consepAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP+" : *");
		this.jLabelid_tipo_autori_consepAutoriConsep.setToolTipText("Tipo");
		this.jLabelid_tipo_autori_consepAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_autori_consepAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_autori_consepAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_autori_consepAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_autori_consepAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_autori_consepAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPanelid_tipo_autori_consepAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		jComboBoxid_tipo_autori_consepAutoriConsep= new JComboBoxMe();
		jComboBoxid_tipo_autori_consepAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_autori_consepAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_autori_consepAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_autori_consepAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_autori_consepAutoriConsep= new JButtonMe();
		this.jButtonid_tipo_autori_consepAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_autori_consepAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_autori_consepAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_autori_consepAutoriConsep.setText("Buscar");
		this.jButtonid_tipo_autori_consepAutoriConsep.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_autori_consepAutoriConsep.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_autori_consepAutoriConsep,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_autori_consepAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_autori_consepAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_autori_consepAutoriConsep"));

		this.jButtonid_tipo_autori_consepAutoriConsepBusqueda= new JButtonMe();
		this.jButtonid_tipo_autori_consepAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_autori_consepAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_autori_consepAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_autori_consepAutoriConsepBusqueda.setText("U");
		this.jButtonid_tipo_autori_consepAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_autori_consepAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_autori_consepAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_autori_consepAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_autori_consepAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_autori_consepAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_autori_consepAutoriConsepBusqueda.setVisible(false);		}

		this.jButtonid_tipo_autori_consepAutoriConsepUpdate= new JButtonMe();
		this.jButtonid_tipo_autori_consepAutoriConsepUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_autori_consepAutoriConsepUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_autori_consepAutoriConsepUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_autori_consepAutoriConsepUpdate.setText("U");
		this.jButtonid_tipo_autori_consepAutoriConsepUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_autori_consepAutoriConsepUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_autori_consepAutoriConsepUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_autori_consepAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_autori_consepAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_autori_consepAutoriConsepUpdate"));



					
		this.jLabelid_empleadoAutoriConsep = new JLabelMe();
		this.jLabelid_empleadoAutoriConsep.setText(""+AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoAutoriConsep.setToolTipText("Empleado");
		this.jLabelid_empleadoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoAutoriConsep.setToolTipText(AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutAutoriConsep = new GridBagLayout();
		this.jPanelid_empleadoAutoriConsep.setLayout(this.gridaBagLayoutAutoriConsep);


		jComboBoxid_empleadoAutoriConsep= new JComboBoxMe();
		jComboBoxid_empleadoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoAutoriConsep= new JButtonMe();
		this.jButtonid_empleadoAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAutoriConsep.setText("Buscar");
		this.jButtonid_empleadoAutoriConsep.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoAutoriConsep.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAutoriConsep,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAutoriConsep"));

		this.jButtonid_empleadoAutoriConsepBusqueda= new JButtonMe();
		this.jButtonid_empleadoAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAutoriConsepBusqueda.setText("U");
		this.jButtonid_empleadoAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAutoriConsepBusqueda"));

		if(this.autoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoAutoriConsepBusqueda.setVisible(false);		}

		this.jButtonid_empleadoAutoriConsepUpdate= new JButtonMe();
		this.jButtonid_empleadoAutoriConsepUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAutoriConsepUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAutoriConsepUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAutoriConsepUpdate.setText("U");
		this.jButtonid_empleadoAutoriConsepUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoAutoriConsepUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAutoriConsepUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAutoriConsepUpdate"));



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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleAutoriConsep = new AutoriConsepBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Autorizaciones Consep DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutoriConsep= new GridBagLayout();
		

		
		String sToolTipAutoriConsep="";
		sToolTipAutoriConsep=AutoriConsepConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutoriConsep+="(Inventario.AutoriConsep)";
		}
		
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutoriConsep+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAutoriConsep = new JButtonMe();
		this.jButtonModificarAutoriConsep = new JButtonMe();
        this.jButtonActualizarAutoriConsep = new JButtonMe();
        this.jButtonEliminarAutoriConsep = new JButtonMe();
        this.jButtonCancelarAutoriConsep = new JButtonMe();
        this.jButtonGuardarCambiosAutoriConsep = new JButtonMe();
		this.jButtonGuardarCambiosTablaAutoriConsep = new JButtonMe();
		this.jButtonCerrarAutoriConsep = new JButtonMe();
		
		this.jScrollPanelDatosAutoriConsep = new JScrollPane();   
        this.jScrollPanelDatosEdicionAutoriConsep = new JScrollPane();
		this.jScrollPanelDatosGeneralAutoriConsep = new JScrollPane();
				
		
		
		this.jPanelCamposAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Autorizaciones Consep";
		
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Consepes" + this.sPath));
		} else {
			this.jScrollPanelDatosAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposAutoriConsep.setName("jPanelCamposAutoriConsep"); 

		this.jPanelCamposOcultosAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAutoriConsep.setName("jPanelCamposOcultosAutoriConsep"); 

        this.jPanelAccionesAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesAutoriConsep.setName("Acciones"); 

		this.jPanelAccionesFormularioAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAutoriConsep.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAutoriConsep.setText("Nuevo");
		this.jButtonModificarAutoriConsep.setText("Editar");
        this.jButtonActualizarAutoriConsep.setText("Actualizar");
        this.jButtonEliminarAutoriConsep.setText("Eliminar");
        this.jButtonCancelarAutoriConsep.setText("Cancelar");
        this.jButtonGuardarCambiosAutoriConsep.setText("Guardar");
		this.jButtonGuardarCambiosTablaAutoriConsep.setText("Guardar");
		this.jButtonCerrarAutoriConsep.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutoriConsep,"nuevo_button","Nuevo",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAutoriConsep,"modificar_button","Editar",this.autoriconsepSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAutoriConsep,"actualizar_button","Actualizar",this.autoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAutoriConsep,"eliminar_button","Eliminar",this.autoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAutoriConsep,"cancelar_button","Cancelar",this.autoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAutoriConsep,"guardarcambios_button","Guardar",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutoriConsep,"guardarcambiostabla_button","Guardar",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutoriConsep,"cerrar_button","Salir",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAutoriConsep.setToolTipText("Nuevo"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAutoriConsep.setToolTipText("Editar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAutoriConsep.setToolTipText("Actualizar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAutoriConsep.setToolTipText("Eliminar)"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAutoriConsep.setToolTipText("Cancelar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAutoriConsep.setToolTipText("Guardar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAutoriConsep.setToolTipText("Guardar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutoriConsep.setToolTipText("Salir"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutoriConsep";
		inputMap = this.jButtonNuevoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutoriConsep"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAutoriConsep";
		inputMap = this.jButtonActualizarAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAutoriConsep"));
		
		//ELIMINAR
		sMapKey = "EliminarAutoriConsep";
		inputMap = this.jButtonEliminarAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAutoriConsep"));
		
		//CANCELAR	
		sMapKey = "CancelarAutoriConsep";
		inputMap = this.jButtonCancelarAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAutoriConsep"));
		
		//CERRAR		
		sMapKey = "CerrarAutoriConsep";
		inputMap = this.jButtonCerrarAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutoriConsep"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutoriConsep";
		inputMap = this.jButtonGuardarCambiosTablaAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutoriConsep"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAutoriConsep.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAutoriConsep.setToolTipText("Nuevo AutoriConsep");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAutoriConsep.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAutoriConsep.setToolTipText("Sin Cerrar Ventana AutoriConsep");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAutoriConsep.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAutoriConsep.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutoriConsep.setText("Accion");
		this.jComboBoxTiposAccionesAutoriConsep.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAutoriConsep.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAutoriConsep.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAutoriConsep = new JLabelMe();
		
		this.jLabelAccionesAutoriConsep.setText("Acciones");		
		this.jLabelAccionesAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAutoriConsep();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAutoriConsep();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAutoriConsep=new JTabbedPane();
		this.jTabbedPaneRelacionesAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAutoriConsep.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutoriConsep.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutoriConsep.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAutoriConsep = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAutoriConsep = new GridBagLayout();
		
		this.jPanelCamposAutoriConsep.setLayout(gridaBagLayoutCamposAutoriConsep);
		this.jPanelCamposOcultosAutoriConsep.setLayout(gridaBagLayoutCamposOcultosAutoriConsep);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidAutoriConsep.add(jLabelIdAutoriConsep, this.gridBagConstraintsAutoriConsep);



	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidAutoriConsep.add(jLabelidAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaAutoriConsep.add(jLabelid_empresaAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 2;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutoriConsep.add(jButtonid_empresaAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 3;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutoriConsep.add(jButtonid_empresaAutoriConsepUpdate, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaAutoriConsep.add(jComboBoxid_empresaAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioAutoriConsep.add(jLabelid_usuarioAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 2;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAutoriConsep.add(jButtonid_usuarioAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 3;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAutoriConsep.add(jButtonid_usuarioAutoriConsepUpdate, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioAutoriConsep.add(jComboBoxid_usuarioAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneles_empresaAutoriConsep.add(jLabeles_empresaAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 2;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_empresaAutoriConsep.add(jButtones_empresaAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneles_empresaAutoriConsep.add(jCheckBoxes_empresaAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteAutoriConsep.add(jLabelid_clienteAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 2;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteAutoriConsep.add(jButtonid_clienteAutoriConsep, this.gridBagConstraintsAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 3;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteAutoriConsep.add(jButtonid_clienteAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 4;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteAutoriConsep.add(jButtonid_clienteAutoriConsepUpdate, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteAutoriConsep.add(jComboBoxid_clienteAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_autorizacionAutoriConsep.add(jLabelnumero_autorizacionAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 2;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacionAutoriConsep.add(jButtonnumero_autorizacionAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_autorizacionAutoriConsep.add(jTextFieldnumero_autorizacionAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_autori_consepAutoriConsep.add(jLabelid_tipo_autori_consepAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 2;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_autori_consepAutoriConsep.add(jButtonid_tipo_autori_consepAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 3;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_autori_consepAutoriConsep.add(jButtonid_tipo_autori_consepAutoriConsepUpdate, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_autori_consepAutoriConsep.add(jComboBoxid_tipo_autori_consepAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleadoAutoriConsep.add(jLabelid_empleadoAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 2;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoAutoriConsep.add(jButtonid_empleadoAutoriConsep, this.gridBagConstraintsAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 3;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAutoriConsep.add(jButtonid_empleadoAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 4;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAutoriConsep.add(jButtonid_empleadoAutoriConsepUpdate, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleadoAutoriConsep.add(jComboBoxid_empleadoAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionAutoriConsep.add(jLabelfecha_emisionAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 2;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionAutoriConsep.add(jButtonfecha_emisionAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionAutoriConsep.add(jDateChooserfecha_emisionAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_vencimientoAutoriConsep.add(jLabelfecha_vencimientoAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 2;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoAutoriConsep.add(jButtonfecha_vencimientoAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_vencimientoAutoriConsep.add(jDateChooserfecha_vencimientoAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_ultimaAutoriConsep.add(jLabelfecha_ultimaAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 2;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultimaAutoriConsep.add(jButtonfecha_ultimaAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_ultimaAutoriConsep.add(jDateChooserfecha_ultimaAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaAutoriConsep.add(jLabelfechaAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 2;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaAutoriConsep.add(jButtonfechaAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaAutoriConsep.add(jDateChooserfechaAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionAutoriConsep.add(jLabeldescripcionAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 2;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionAutoriConsep.add(jButtondescripcionAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionAutoriConsep.add(jscrollPanedescripcionAutoriConsep, this.gridBagConstraintsAutoriConsep);


	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 0;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnombreAutoriConsep.add(jLabelnombreAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 2;
		this.gridBagConstraintsAutoriConsep.ipadx = 0;
		this.gridBagConstraintsAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreAutoriConsep.add(jButtonnombreAutoriConsepBusqueda, this.gridBagConstraintsAutoriConsep);
	}

	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriConsep.gridy = 0;
	this.gridBagConstraintsAutoriConsep.gridx = 1;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnombreAutoriConsep.add(jTextFieldnombreAutoriConsep, this.gridBagConstraintsAutoriConsep);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAutoriConsep.add(this.jPanelidAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposAutoriConsep % 3==0) {
		iXPanelCamposAutoriConsep=0;
		iYPanelCamposAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAutoriConsep.add(this.jPaneles_empresaAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposAutoriConsep % 3==0) {
		iXPanelCamposAutoriConsep=0;
		iYPanelCamposAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAutoriConsep.add(this.jPanelid_clienteAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposAutoriConsep % 3==0) {
		iXPanelCamposAutoriConsep=0;
		iYPanelCamposAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAutoriConsep.add(this.jPanelnumero_autorizacionAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposAutoriConsep % 3==0) {
		iXPanelCamposAutoriConsep=0;
		iYPanelCamposAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAutoriConsep.add(this.jPanelid_tipo_autori_consepAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposAutoriConsep % 3==0) {
		iXPanelCamposAutoriConsep=0;
		iYPanelCamposAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAutoriConsep.add(this.jPanelid_empleadoAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposAutoriConsep % 3==0) {
		iXPanelCamposAutoriConsep=0;
		iYPanelCamposAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAutoriConsep.add(this.jPanelfecha_emisionAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposAutoriConsep % 3==0) {
		iXPanelCamposAutoriConsep=0;
		iYPanelCamposAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAutoriConsep.add(this.jPanelfecha_vencimientoAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposAutoriConsep % 3==0) {
		iXPanelCamposAutoriConsep=0;
		iYPanelCamposAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAutoriConsep.add(this.jPanelfecha_ultimaAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposAutoriConsep % 3==0) {
		iXPanelCamposAutoriConsep=0;
		iYPanelCamposAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAutoriConsep.add(this.jPanelfechaAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposAutoriConsep % 3==0) {
		iXPanelCamposAutoriConsep=0;
		iYPanelCamposAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.gridBagConstraintsAutoriConsep.gridwidth = 2;

	this.jPanelCamposAutoriConsep.add(this.jPaneldescripcionAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposAutoriConsep % 3==0) {
		iXPanelCamposAutoriConsep=0;
		iYPanelCamposAutoriConsep++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposOcultosAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposOcultosAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAutoriConsep.add(this.jPanelid_empresaAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposOcultosAutoriConsep % 3==0) {
		iXPanelCamposOcultosAutoriConsep=0;
		iYPanelCamposOcultosAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposOcultosAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposOcultosAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAutoriConsep.add(this.jPanelid_usuarioAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposOcultosAutoriConsep % 3==0) {
		iXPanelCamposOcultosAutoriConsep=0;
		iYPanelCamposOcultosAutoriConsep++;
	}
	this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriConsep.gridy = iYPanelCamposOcultosAutoriConsep;
	this.gridBagConstraintsAutoriConsep.gridx = iXPanelCamposOcultosAutoriConsep++;
	this.gridBagConstraintsAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriConsep.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAutoriConsep.add(this.jPanelnombreAutoriConsep, this.gridBagConstraintsAutoriConsep);



	if(iXPanelCamposOcultosAutoriConsep % 3==0) {
		iXPanelCamposOcultosAutoriConsep=0;
		iYPanelCamposOcultosAutoriConsep++;
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
			
		GridBagLayout gridaBagLayoutAccionesAutoriConsep= new GridBagLayout();
		this.jPanelAccionesAutoriConsep.setLayout(gridaBagLayoutAccionesAutoriConsep);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAutoriConsep= new GridBagLayout();
		this.jPanelAccionesFormularioAutoriConsep.setLayout(gridaBagLayoutAccionesFormularioAutoriConsep);
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAutoriConsep.add(this.jComboBoxTiposAccionesFormularioAutoriConsep, this.gridBagConstraintsAutoriConsep);

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAutoriConsep.add(this.jCheckBoxPostAccionNuevoAutoriConsep, this.gridBagConstraintsAutoriConsep);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.autoriconsepSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAutoriConsep.add(this.jCheckBoxPostAccionSinCerrarAutoriConsep, this.gridBagConstraintsAutoriConsep);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.autoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAutoriConsep.add(this.jCheckBoxPostAccionSinMensajeAutoriConsep, this.gridBagConstraintsAutoriConsep);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = iPosXAccion++;
			
		this.jPanelAccionesAutoriConsep.add(this.jButtonModificarAutoriConsep, this.gridBagConstraintsAutoriConsep);							

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx =iPosXAccion++;
			
		this.jPanelAccionesAutoriConsep.add(this.jButtonEliminarAutoriConsep, this.gridBagConstraintsAutoriConsep);
		
			
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = 0;		
		this.gridBagConstraintsAutoriConsep.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutoriConsep.add(this.jButtonActualizarAutoriConsep, this.gridBagConstraintsAutoriConsep);


		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = 0;		
		this.gridBagConstraintsAutoriConsep.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutoriConsep.add(this.jButtonGuardarCambiosAutoriConsep, this.gridBagConstraintsAutoriConsep);	
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = 0;		
		this.gridBagConstraintsAutoriConsep.gridx =iPosXAccion++;
		
		this.jPanelAccionesAutoriConsep.add(this.jButtonCancelarAutoriConsep, this.gridBagConstraintsAutoriConsep);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutoriConsep = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutoriConsep);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();						
			this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriConsep.gridx = 0;		
			//this.gridBagConstraintsAutoriConsep.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutoriConsep.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutoriConsep.gridx =0;
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutoriConsep.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutoriConsep, this.gridBagConstraintsAutoriConsep);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AutoriConsepJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAutoriConsep = new AutoriConsepBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Autorizaciones Consep DATOS");
			
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
			
	        //this.setTitle("[FOR] - Autorizaciones Consep DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Autorizaciones Consep Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AutoriConsepModel autoriconsepModel=new AutoriConsepModel(this);
			
			//SI USARA CLASE INTERNA
			//AutoriConsepModel.AutoriConsepFocusTraversalPolicy autoriconsepFocusTraversalPolicy = autoriconsepModel.new AutoriConsepFocusTraversalPolicy(this);
			
			//autoriconsepFocusTraversalPolicy.setautoriconsepJInternalFrame(this);
			
			this.setFocusTraversalPolicy(autoriconsepModel);
			
			
			this.jContentPaneDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAutoriConsep = new GridBagLayout();	
			this.jContentPaneDetalleAutoriConsep.setLayout(gridaBagLayoutDetalleAutoriConsep);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutoriConsep = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsAutoriConsep.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAutoriConsep.gridx = 0;
					
				
				this.jContentPaneDetalleAutoriConsep.add(jTtoolBarDetalleAutoriConsep, gridBagConstraintsAutoriConsep);								
				
}
			
			this.jScrollPanelDatosEdicionAutoriConsep=   new JScrollPane(jContentPaneDetalleAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAutoriConsep=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsAutoriConsep.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAutoriConsep.gridx = 0;
	        
			this.jContentPaneDetalleAutoriConsep.add(jPanelCamposAutoriConsep, gridBagConstraintsAutoriConsep);
			
			
			
			
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
						&& autoriconsepSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleAutoriConsep(this.puedeCargarPorParteDetalleAutoriConsep,false,-1);
					
					if(this.autoriconsepSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAutoriConsep= new GridBagConstraints();
						this.gridBagConstraintsAutoriConsep.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAutoriConsep.gridx = 0;
						this.jContentPaneDetalleAutoriConsep.add(this.jTabbedPaneRelacionesAutoriConsep, this.gridBagConstraintsAutoriConsep);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAutoriConsep.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleAutoriConsep(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAutoriConsep.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
					this.gridBagConstraintsAutoriConsep.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAutoriConsep.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAutoriConsep.gridx = 0;
					
				
					this.jContentPaneDetalleAutoriConsep.add(jPanelCamposOcultosAutoriConsep, gridBagConstraintsAutoriConsep);
				
					this.jPanelCamposOcultosAutoriConsep.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsAutoriConsep.gridx = 0;
	        this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAutoriConsep.add(this.jPanelAccionesFormularioAutoriConsep, this.gridBagConstraintsAutoriConsep);							
			
			
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsAutoriConsep.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsAutoriConsep.gridx = 0;
	        
			
			this.jContentPaneDetalleAutoriConsep.add(this.jPanelAccionesAutoriConsep, this.gridBagConstraintsAutoriConsep);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAutoriConsep);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAutoriConsep=   new JScrollPane(this.jPanelCamposAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAutoriConsep.gridx = 0;
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAutoriConsep.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAutoriConsep, this.gridBagConstraintsAutoriConsep);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutoriConsep.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAutoriConsep, this.gridBagConstraintsAutoriConsep);			
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutoriConsep.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAutoriConsep, this.gridBagConstraintsAutoriConsep);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutoriConsep, this.gridBagConstraintsAutoriConsep);
			
			
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutoriConsep, this.gridBagConstraintsAutoriConsep);
		
			
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutoriConsep.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutoriConsep, this.gridBagConstraintsAutoriConsep);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAutoriConsep;//jContentPane;
		
		return jScrollPanelDatosEdicionAutoriConsep;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleAutoriConsep(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
		this.detalleautoriconsepSessionBean.setConGuardarRelaciones(false);
		this.detalleautoriconsepSessionBean.setEsGuardarRelacionado(true);

		this.detalleautoriconsepBeanSwingJInternalFrame=null;//new DetalleAutoriConsepBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleautoriconsepBeanSwingJInternalFramePopup=new DetalleAutoriConsepBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleautoriconsepBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {

				DetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL=AutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleautoriconsepSessionBean.setEsGuardarRelacionado(true);

				this.detalleautoriconsepBeanSwingJInternalFrame=new DetalleAutoriConsepBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleautoriconsepBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleautoriconsepBeanSwingJInternalFrame.setdetalleautoriconsepSessionBean(this.detalleautoriconsepSessionBean);

				//this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
				//this.gridBagConstraintsAutoriConsep.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAutoriConsep.gridx = 0;
				//this.jContentPaneDetalleAutoriConsep.add(this.detalleautoriconsepBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAutoriConsep);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesAutoriConsep.add("Detalle Autorizacion Consepes",this.detalleautoriconsepBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesAutoriConsep.setComponentAt(iIndexTab,this.detalleautoriconsepBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleAutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleautoriconsepSessionBean.setEsGuardarRelacionado(false);
				this.detalleautoriconsepBeanSwingJInternalFrame=null;//new DetalleAutoriConsepBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleAutoriConsep) {
					this.jTabbedPaneRelacionesAutoriConsep.add("Detalle Autorizacion Consepes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleAutoriConsepBeanSwingJInternalFrame(List<AutoriConsep> autoriconseps,AutoriConsep autoriconsep,DetalleAutoriConsepBeanSwingJInternalFrame detalleautoriconsepBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleautoriconsepBeanSwingJInternalFrame=new DetalleAutoriConsepBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleautoriconsepBeanSwingJInternalFrame.getDetalleAutoriConsepLogic().setConnexion(this.autoriconsepLogic.getConnexion());

					detalleautoriconsepBeanSwingJInternalFrame.setautoriconsepsForeignKey(autoriconseps);
					detalleautoriconsepBeanSwingJInternalFrame.setautoriconsepForeignKey(autoriconsep);
					detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepSessionBean.setisBusquedaDesdeForeignKeySesionAutoriConsep(true);
					detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepSessionBean.setlidAutoriConsepActual(autoriconsep.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleautoriconsepBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleAutoriConsep(detalleautoriconsepBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleautoriconsepBeanSwingJInternalFrame.setVisibilidadBusquedasParaAutoriConsep(true);
					detalleautoriconsepBeanSwingJInternalFrame.setid_autori_consepFK_IdAutoriConsep(autoriconsep.getId());

					if(!this.conCargarFormDetalle) {
						detalleautoriconsepBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleautoriconsepBeanSwingJInternalFrame.setSelectedItemCombosFrameAutoriConsepForeignKey(autoriconsep,1,false,true,true);
					detalleautoriconsepBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleautoriconsepBeanSwingJInternalFrame.procesarBusqueda("FK_IdAutoriConsep");
					detalleautoriconsepBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAutoriConsep");
					detalleautoriconsepBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleAutoriConsep(true);
					detalleautoriconsepBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleAutoriConsep("n",detalleautoriconsepBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleautoriconsepBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleautoriconsepBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleautoriconsepBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleautoriconsepBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleAutoriConsep("relacionado");
					} else {
						detalleautoriconsepBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleAutoriConsep("no_relacionado");
					}

					detalleautoriconsepBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleAutoriConsep().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
