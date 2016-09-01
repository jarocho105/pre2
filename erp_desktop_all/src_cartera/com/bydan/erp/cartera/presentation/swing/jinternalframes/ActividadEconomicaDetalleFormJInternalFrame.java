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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.ActividadEconomicaConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class ActividadEconomicaDetalleFormJInternalFrame extends ActividadEconomicaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleActividadEconomica;
	
	protected JMenuBar jmenuBarDetalleActividadEconomica;
	
	protected JMenu jmenuDetalleActividadEconomica;
	protected JMenu jmenuDetalleArchivoActividadEconomica;
	protected JMenu jmenuDetalleAccionesActividadEconomica;
	protected JMenu jmenuDetalleDatosActividadEconomica;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutActividadEconomica;	
	protected GridBagConstraints gridBagConstraintsActividadEconomica;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ActividadEconomicaBeanSwingJInternalFrameAdditional jInternalFrameDetalleActividadEconomica;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public ActividadEconomicaSessionBean actividadeconomicaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public ActividadEconomicaLogic actividadeconomicaLogic;
	
	public JScrollPane jScrollPanelDatosActividadEconomica;
	public JScrollPane jScrollPanelDatosEdicionActividadEconomica;
	public JScrollPane jScrollPanelDatosGeneralActividadEconomica;
	
	protected JPanel jPanelCamposActividadEconomica;    
	protected JPanel jPanelCamposOcultosActividadEconomica;    	
	protected JPanel jPanelAccionesActividadEconomica;
	protected JPanel jPanelAccionesFormularioActividadEconomica;
    
	
	
	protected Integer iXPanelCamposActividadEconomica=0;
	protected Integer iYPanelCamposActividadEconomica=0;
	
	protected Integer iXPanelCamposOcultosActividadEconomica=0;
	protected Integer iYPanelCamposOcultosActividadEconomica=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoActividadEconomica;
	public JButton jButtonModificarActividadEconomica;
	public JButton jButtonActualizarActividadEconomica;
    public JButton jButtonEliminarActividadEconomica;
	public JButton jButtonCancelarActividadEconomica;
    public JButton jButtonGuardarCambiosActividadEconomica;
	public JButton jButtonGuardarCambiosTablaActividadEconomica;
	protected JButton jButtonCerrarActividadEconomica;
	
	
	protected JButton jButtonProcesarInformacionActividadEconomica;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoActividadEconomica;
	protected JCheckBox jCheckBoxPostAccionSinCerrarActividadEconomica;
	protected JCheckBox jCheckBoxPostAccionSinMensajeActividadEconomica;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarActividadEconomica;
	protected JButton jButtonModificarToolBarActividadEconomica;
	protected JButton jButtonActualizarToolBarActividadEconomica;
    protected JButton jButtonEliminarToolBarActividadEconomica;
	protected JButton jButtonCancelarToolBarActividadEconomica;
    protected JButton jButtonGuardarCambiosToolBarActividadEconomica;
	protected JButton jButtonGuardarCambiosTablaToolBarActividadEconomica;
	protected JButton jButtonMostrarOcultarTablaToolBarActividadEconomica;
	protected JButton jButtonCerrarToolBarActividadEconomica;
	
	protected JButton jButtonProcesarInformacionToolBarActividadEconomica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoActividadEconomica;
	protected JMenuItem jMenuItemModificarActividadEconomica;
	protected JMenuItem jMenuItemActualizarActividadEconomica;
    protected JMenuItem jMenuItemEliminarActividadEconomica;
	protected JMenuItem jMenuItemCancelarActividadEconomica;
    protected JMenuItem jMenuItemGuardarCambiosActividadEconomica;
	protected JMenuItem jMenuItemGuardarCambiosTablaActividadEconomica;
	protected JMenuItem jMenuItemCerrarActividadEconomica;
	protected JMenuItem jMenuItemDetalleCerrarActividadEconomica;
	protected JMenuItem jMenuItemDetalleMostarOcultarActividadEconomica;
	
	protected JMenuItem jMenuItemProcesarInformacionActividadEconomica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosActividadEconomica;
	protected JMenuItem jMenuItemMostrarOcultarActividadEconomica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesActividadEconomica;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesActividadEconomica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesActividadEconomica;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioActividadEconomica;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidActividadEconomica;
	public JLabel jLabelIdActividadEconomica;
	public JLabel jLabelidActividadEconomica;
	public JButton jButtonidActividadEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_negocioActividadEconomica;
	public JLabel jLabelnombre_negocioActividadEconomica;
	public JTextArea jTextAreanombre_negocioActividadEconomica;
	public JScrollPane jscrollPanenombre_negocioActividadEconomica;
	public JButton jButtonnombre_negocioActividadEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelactividadActividadEconomica;
	public JLabel jLabelactividadActividadEconomica;
	public JTextArea jTextAreaactividadActividadEconomica;
	public JScrollPane jscrollPaneactividadActividadEconomica;
	public JButton jButtonactividadActividadEconomicaBusqueda= new JButtonMe();

	public JPanel jPaneldireccionActividadEconomica;
	public JLabel jLabeldireccionActividadEconomica;
	public JTextArea jTextAreadireccionActividadEconomica;
	public JScrollPane jscrollPanedireccionActividadEconomica;
	public JButton jButtondireccionActividadEconomicaBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoActividadEconomica;
	public JLabel jLabeltelefonoActividadEconomica;
	public JTextArea jTextAreatelefonoActividadEconomica;
	public JScrollPane jscrollPanetelefonoActividadEconomica;
	public JButton jButtontelefonoActividadEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelingreso_netoActividadEconomica;
	public JLabel jLabelingreso_netoActividadEconomica;
	public JTextField jTextFieldingreso_netoActividadEconomica;
	public JButton jButtoningreso_netoActividadEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelingreso_brutoActividadEconomica;
	public JLabel jLabelingreso_brutoActividadEconomica;
	public JTextField jTextFieldingreso_brutoActividadEconomica;
	public JButton jButtoningreso_brutoActividadEconomicaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaActividadEconomica;
	public JLabel jLabelid_empresaActividadEconomica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaActividadEconomica;
	public JButton jButtonid_empresaActividadEconomica= new JButtonMe();
	public JButton jButtonid_empresaActividadEconomicaUpdate= new JButtonMe();
	public JButton jButtonid_empresaActividadEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteActividadEconomica;
	public JLabel jLabelid_clienteActividadEconomica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteActividadEconomica;
	public JButton jButtonid_clienteActividadEconomica= new JButtonMe();
	public JButton jButtonid_clienteActividadEconomicaUpdate= new JButtonMe();
	public JButton jButtonid_clienteActividadEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelid_paisActividadEconomica;
	public JLabel jLabelid_paisActividadEconomica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisActividadEconomica;
	public JButton jButtonid_paisActividadEconomica= new JButtonMe();
	public JButton jButtonid_paisActividadEconomicaUpdate= new JButtonMe();
	public JButton jButtonid_paisActividadEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadActividadEconomica;
	public JLabel jLabelid_ciudadActividadEconomica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadActividadEconomica;
	public JButton jButtonid_ciudadActividadEconomica= new JButtonMe();
	public JButton jButtonid_ciudadActividadEconomicaUpdate= new JButtonMe();
	public JButton jButtonid_ciudadActividadEconomicaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesActividadEconomica;
	
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
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ActividadEconomicaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposActividadEconomica=new JPanel();
				this.jPanelAccionesFormularioActividadEconomica=new JPanel();
				this.jmenuBarDetalleActividadEconomica=new JMenuBar();
				this.jTtoolBarDetalleActividadEconomica=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActividadEconomicaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ActividadEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ActividadEconomicaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ActividadEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActividadEconomicaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActividadEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActividadEconomicaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActividadEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActividadEconomicaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ActividadEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarActividadEconomica() {
		return this.jButtonActualizarToolBarActividadEconomica;
	}
	
	public JButton getjButtonEliminarToolBarActividadEconomica() {
		return this.jButtonEliminarToolBarActividadEconomica;
	}
	
	public JButton getjButtonCancelarToolBarActividadEconomica() {
		return this.jButtonCancelarToolBarActividadEconomica;
	}		
	
	public JButton getjButtonProcesarInformacionActividadEconomica() {
		return this.jButtonProcesarInformacionActividadEconomica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionActividadEconomica)	{
		this.jButtonProcesarInformacionActividadEconomica = jButtonProcesarInformacionActividadEconomica;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesActividadEconomica() {
		return this.jComboBoxTiposAccionesActividadEconomica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesActividadEconomica(
			JComboBox jComboBoxTiposRelacionesActividadEconomica) {
		this.jComboBoxTiposRelacionesActividadEconomica = jComboBoxTiposRelacionesActividadEconomica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesActividadEconomica(
			JComboBox jComboBoxTiposAccionesActividadEconomica) {
		this.jComboBoxTiposAccionesActividadEconomica = jComboBoxTiposAccionesActividadEconomica;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioActividadEconomica() {
		return this.jComboBoxTiposAccionesFormularioActividadEconomica;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioActividadEconomica(
			JComboBox jComboBoxTiposAccionesFormularioActividadEconomica) {
		this.jComboBoxTiposAccionesFormularioActividadEconomica = jComboBoxTiposAccionesFormularioActividadEconomica;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
		
		this.actividadeconomicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.actividadeconomicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.actividadeconomicaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ActividadEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ActividadEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ActividadEconomicaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Actividad Economica MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
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
	
		ActividadEconomicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleActividadEconomica= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarActividadEconomica=new JButtonMe();
				this.jButtonModificarToolBarActividadEconomica=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarActividadEconomica,this.jTtoolBarDetalleActividadEconomica,
							"actualizar","actualizar","Actualizar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarActividadEconomica,this.jTtoolBarDetalleActividadEconomica,
							"eliminar","eliminar","Eliminar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarActividadEconomica,this.jTtoolBarDetalleActividadEconomica,
							"cancelar","cancelar","Cancelar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarActividadEconomica,this.jTtoolBarDetalleActividadEconomica,
							"guardarcambios","guardarcambios","Guardar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleActividadEconomica=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleActividadEconomica=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoActividadEconomica=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesActividadEconomica=new JMenuMe("Acciones");
		this.jmenuDetalleDatosActividadEconomica=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoActividadEconomica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoActividadEconomica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoActividadEconomica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarActividadEconomica= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarActividadEconomica.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarActividadEconomica,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarActividadEconomica= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarActividadEconomica.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarActividadEconomica,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarActividadEconomica= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarActividadEconomica.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarActividadEconomica,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarActividadEconomica= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarActividadEconomica.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarActividadEconomica,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosActividadEconomica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosActividadEconomica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosActividadEconomica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarActividadEconomica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarActividadEconomica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarActividadEconomica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarActividadEconomica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarActividadEconomica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarActividadEconomica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarActividadEconomica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarActividadEconomica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarActividadEconomica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarActividadEconomica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarActividadEconomica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarActividadEconomica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoActividadEconomica.add(this.jMenuItemDetalleCerrarActividadEconomica);
		
		this.jmenuDetalleAccionesActividadEconomica.add(this.jMenuItemActualizarActividadEconomica);
		this.jmenuDetalleAccionesActividadEconomica.add(this.jMenuItemEliminarActividadEconomica);
		this.jmenuDetalleAccionesActividadEconomica.add(this.jMenuItemCancelarActividadEconomica);		
		
		//this.jmenuDetalleDatosActividadEconomica.add(this.jMenuItemDetalleAbrirOrderByActividadEconomica);				
		this.jmenuDetalleDatosActividadEconomica.add(this.jMenuItemDetalleMostarOcultarActividadEconomica);				
				
		//this.jmenuDetalleAccionesActividadEconomica.add(this.jMenuItemGuardarCambiosActividadEconomica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleActividadEconomica.add(this.jmenuDetalleArchivoActividadEconomica);		
		this.jmenuBarDetalleActividadEconomica.add(this.jmenuDetalleAccionesActividadEconomica);		
		this.jmenuBarDetalleActividadEconomica.add(this.jmenuDetalleDatosActividadEconomica);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleActividadEconomica);				
	}
	
	
	public void inicializarElementosCamposActividadEconomica() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdActividadEconomica = new JLabelMe();
		jLabelIdActividadEconomica.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidActividadEconomica = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidActividadEconomica.setToolTipText(ActividadEconomicaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutActividadEconomica= new GridBagLayout();

		this.jPanelidActividadEconomica.setLayout(this.gridaBagLayoutActividadEconomica);

		jLabelidActividadEconomica = new JLabel();
		jLabelidActividadEconomica.setText("Id");

		jLabelidActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_negocioActividadEconomica = new JLabelMe();
		this.jLabelnombre_negocioActividadEconomica.setText(""+ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO+" : *");
		this.jLabelnombre_negocioActividadEconomica.setToolTipText("Nombre Negocio");
		this.jLabelnombre_negocioActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_negocioActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_negocioActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_negocioActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_negocioActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_negocioActividadEconomica.setToolTipText(ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO);
		this.gridaBagLayoutActividadEconomica = new GridBagLayout();
		this.jPanelnombre_negocioActividadEconomica.setLayout(this.gridaBagLayoutActividadEconomica);


		jTextAreanombre_negocioActividadEconomica= new JTextAreaMe();
		jTextAreanombre_negocioActividadEconomica.setEnabled(false);
		jTextAreanombre_negocioActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_negocioActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_negocioActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_negocioActividadEconomica.setLineWrap(true);
		jTextAreanombre_negocioActividadEconomica.setWrapStyleWord(true);
		jTextAreanombre_negocioActividadEconomica.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_negocioActividadEconomica.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_negocioActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_negocioActividadEconomica = new JScrollPane(jTextAreanombre_negocioActividadEconomica);
		jscrollPanenombre_negocioActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_negocioActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_negocioActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_negocioActividadEconomicaBusqueda= new JButtonMe();
		this.jButtonnombre_negocioActividadEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_negocioActividadEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_negocioActividadEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_negocioActividadEconomicaBusqueda.setText("U");
		this.jButtonnombre_negocioActividadEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_negocioActividadEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_negocioActividadEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_negocioActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_negocioActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_negocioActividadEconomicaBusqueda"));

		if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_negocioActividadEconomicaBusqueda.setVisible(false);		}


					
		this.jLabelactividadActividadEconomica = new JLabelMe();
		this.jLabelactividadActividadEconomica.setText(""+ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD+" : *");
		this.jLabelactividadActividadEconomica.setToolTipText("Actividad");
		this.jLabelactividadActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelactividadActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelactividadActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelactividadActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelactividadActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelactividadActividadEconomica.setToolTipText(ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD);
		this.gridaBagLayoutActividadEconomica = new GridBagLayout();
		this.jPanelactividadActividadEconomica.setLayout(this.gridaBagLayoutActividadEconomica);


		jTextAreaactividadActividadEconomica= new JTextAreaMe();
		jTextAreaactividadActividadEconomica.setEnabled(false);
		jTextAreaactividadActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactividadActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactividadActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactividadActividadEconomica.setLineWrap(true);
		jTextAreaactividadActividadEconomica.setWrapStyleWord(true);
		jTextAreaactividadActividadEconomica.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaactividadActividadEconomica.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaactividadActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneactividadActividadEconomica = new JScrollPane(jTextAreaactividadActividadEconomica);
		jscrollPaneactividadActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneactividadActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneactividadActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonactividadActividadEconomicaBusqueda= new JButtonMe();
		this.jButtonactividadActividadEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactividadActividadEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactividadActividadEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonactividadActividadEconomicaBusqueda.setText("U");
		this.jButtonactividadActividadEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonactividadActividadEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonactividadActividadEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaactividadActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaactividadActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"actividadActividadEconomicaBusqueda"));

		if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonactividadActividadEconomicaBusqueda.setVisible(false);		}


					
		this.jLabeldireccionActividadEconomica = new JLabelMe();
		this.jLabeldireccionActividadEconomica.setText(""+ActividadEconomicaConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionActividadEconomica.setToolTipText("Direccion");
		this.jLabeldireccionActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionActividadEconomica.setToolTipText(ActividadEconomicaConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutActividadEconomica = new GridBagLayout();
		this.jPaneldireccionActividadEconomica.setLayout(this.gridaBagLayoutActividadEconomica);


		jTextAreadireccionActividadEconomica= new JTextAreaMe();
		jTextAreadireccionActividadEconomica.setEnabled(false);
		jTextAreadireccionActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionActividadEconomica.setLineWrap(true);
		jTextAreadireccionActividadEconomica.setWrapStyleWord(true);
		jTextAreadireccionActividadEconomica.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionActividadEconomica.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionActividadEconomica = new JScrollPane(jTextAreadireccionActividadEconomica);
		jscrollPanedireccionActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionActividadEconomicaBusqueda= new JButtonMe();
		this.jButtondireccionActividadEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionActividadEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionActividadEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionActividadEconomicaBusqueda.setText("U");
		this.jButtondireccionActividadEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionActividadEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionActividadEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionActividadEconomicaBusqueda"));

		if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionActividadEconomicaBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoActividadEconomica = new JLabelMe();
		this.jLabeltelefonoActividadEconomica.setText(""+ActividadEconomicaConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoActividadEconomica.setToolTipText("Telefono");
		this.jLabeltelefonoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoActividadEconomica.setToolTipText(ActividadEconomicaConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutActividadEconomica = new GridBagLayout();
		this.jPaneltelefonoActividadEconomica.setLayout(this.gridaBagLayoutActividadEconomica);


		jTextAreatelefonoActividadEconomica= new JTextAreaMe();
		jTextAreatelefonoActividadEconomica.setEnabled(false);
		jTextAreatelefonoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoActividadEconomica.setLineWrap(true);
		jTextAreatelefonoActividadEconomica.setWrapStyleWord(true);
		jTextAreatelefonoActividadEconomica.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoActividadEconomica.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoActividadEconomica = new JScrollPane(jTextAreatelefonoActividadEconomica);
		jscrollPanetelefonoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefonoActividadEconomicaBusqueda= new JButtonMe();
		this.jButtontelefonoActividadEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoActividadEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoActividadEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoActividadEconomicaBusqueda.setText("U");
		this.jButtontelefonoActividadEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoActividadEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoActividadEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoActividadEconomicaBusqueda"));

		if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoActividadEconomicaBusqueda.setVisible(false);		}


					
		this.jLabelingreso_netoActividadEconomica = new JLabelMe();
		this.jLabelingreso_netoActividadEconomica.setText(""+ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO+" : *");
		this.jLabelingreso_netoActividadEconomica.setToolTipText("Ingreso Neto");
		this.jLabelingreso_netoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso_netoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso_netoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingreso_netoActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingreso_netoActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingreso_netoActividadEconomica.setToolTipText(ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO);
		this.gridaBagLayoutActividadEconomica = new GridBagLayout();
		this.jPanelingreso_netoActividadEconomica.setLayout(this.gridaBagLayoutActividadEconomica);


		jTextFieldingreso_netoActividadEconomica= new JTextFieldMe();
		jTextFieldingreso_netoActividadEconomica.setEnabled(false);
		jTextFieldingreso_netoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso_netoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso_netoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingreso_netoActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingreso_netoActividadEconomica.setText("0.0");

		this.jButtoningreso_netoActividadEconomicaBusqueda= new JButtonMe();
		this.jButtoningreso_netoActividadEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso_netoActividadEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso_netoActividadEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningreso_netoActividadEconomicaBusqueda.setText("U");
		this.jButtoningreso_netoActividadEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningreso_netoActividadEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningreso_netoActividadEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingreso_netoActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingreso_netoActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingreso_netoActividadEconomicaBusqueda"));

		if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningreso_netoActividadEconomicaBusqueda.setVisible(false);		}


					
		this.jLabelingreso_brutoActividadEconomica = new JLabelMe();
		this.jLabelingreso_brutoActividadEconomica.setText(""+ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO+" : *");
		this.jLabelingreso_brutoActividadEconomica.setToolTipText("Ingreso Bruto");
		this.jLabelingreso_brutoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso_brutoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso_brutoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingreso_brutoActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingreso_brutoActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingreso_brutoActividadEconomica.setToolTipText(ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO);
		this.gridaBagLayoutActividadEconomica = new GridBagLayout();
		this.jPanelingreso_brutoActividadEconomica.setLayout(this.gridaBagLayoutActividadEconomica);


		jTextFieldingreso_brutoActividadEconomica= new JTextFieldMe();
		jTextFieldingreso_brutoActividadEconomica.setEnabled(false);
		jTextFieldingreso_brutoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso_brutoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso_brutoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingreso_brutoActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingreso_brutoActividadEconomica.setText("0.0");

		this.jButtoningreso_brutoActividadEconomicaBusqueda= new JButtonMe();
		this.jButtoningreso_brutoActividadEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso_brutoActividadEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso_brutoActividadEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningreso_brutoActividadEconomicaBusqueda.setText("U");
		this.jButtoningreso_brutoActividadEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningreso_brutoActividadEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningreso_brutoActividadEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingreso_brutoActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingreso_brutoActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingreso_brutoActividadEconomicaBusqueda"));

		if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningreso_brutoActividadEconomicaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysActividadEconomica() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaActividadEconomica = new JLabelMe();
		this.jLabelid_empresaActividadEconomica.setText(""+ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaActividadEconomica.setToolTipText("Empresa");
		this.jLabelid_empresaActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaActividadEconomica.setToolTipText(ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutActividadEconomica = new GridBagLayout();
		this.jPanelid_empresaActividadEconomica.setLayout(this.gridaBagLayoutActividadEconomica);


		jComboBoxid_empresaActividadEconomica= new JComboBoxMe();
		jComboBoxid_empresaActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaActividadEconomica.setEnabled(false);

		this.jButtonid_empresaActividadEconomica= new JButtonMe();
		this.jButtonid_empresaActividadEconomica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaActividadEconomica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaActividadEconomica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaActividadEconomica.setText("Buscar");
		this.jButtonid_empresaActividadEconomica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaActividadEconomica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaActividadEconomica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaActividadEconomica"));

		this.jButtonid_empresaActividadEconomicaBusqueda= new JButtonMe();
		this.jButtonid_empresaActividadEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActividadEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActividadEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaActividadEconomicaBusqueda.setText("U");
		this.jButtonid_empresaActividadEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaActividadEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaActividadEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaActividadEconomicaBusqueda"));

		if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaActividadEconomicaBusqueda.setVisible(false);		}

		this.jButtonid_empresaActividadEconomicaUpdate= new JButtonMe();
		this.jButtonid_empresaActividadEconomicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActividadEconomicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActividadEconomicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaActividadEconomicaUpdate.setText("U");
		this.jButtonid_empresaActividadEconomicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaActividadEconomicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaActividadEconomicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaActividadEconomicaUpdate"));



					
		this.jLabelid_clienteActividadEconomica = new JLabelMe();
		this.jLabelid_clienteActividadEconomica.setText(""+ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteActividadEconomica.setToolTipText("Cliente");
		this.jLabelid_clienteActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteActividadEconomica.setToolTipText(ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutActividadEconomica = new GridBagLayout();
		this.jPanelid_clienteActividadEconomica.setLayout(this.gridaBagLayoutActividadEconomica);


		jComboBoxid_clienteActividadEconomica= new JComboBoxMe();
		jComboBoxid_clienteActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteActividadEconomica= new JButtonMe();
		this.jButtonid_clienteActividadEconomica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteActividadEconomica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteActividadEconomica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteActividadEconomica.setText("Buscar");
		this.jButtonid_clienteActividadEconomica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteActividadEconomica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteActividadEconomica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteActividadEconomica"));

		this.jButtonid_clienteActividadEconomicaBusqueda= new JButtonMe();
		this.jButtonid_clienteActividadEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteActividadEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteActividadEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteActividadEconomicaBusqueda.setText("U");
		this.jButtonid_clienteActividadEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteActividadEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteActividadEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteActividadEconomicaBusqueda"));

		if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteActividadEconomicaBusqueda.setVisible(false);		}

		this.jButtonid_clienteActividadEconomicaUpdate= new JButtonMe();
		this.jButtonid_clienteActividadEconomicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteActividadEconomicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteActividadEconomicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteActividadEconomicaUpdate.setText("U");
		this.jButtonid_clienteActividadEconomicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteActividadEconomicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteActividadEconomicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteActividadEconomicaUpdate"));



					
		this.jLabelid_paisActividadEconomica = new JLabelMe();
		this.jLabelid_paisActividadEconomica.setText(""+ActividadEconomicaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisActividadEconomica.setToolTipText("Pais");
		this.jLabelid_paisActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisActividadEconomica.setToolTipText(ActividadEconomicaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutActividadEconomica = new GridBagLayout();
		this.jPanelid_paisActividadEconomica.setLayout(this.gridaBagLayoutActividadEconomica);


		jComboBoxid_paisActividadEconomica= new JComboBoxMe();
		jComboBoxid_paisActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisActividadEconomica= new JButtonMe();
		this.jButtonid_paisActividadEconomica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisActividadEconomica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisActividadEconomica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisActividadEconomica.setText("Buscar");
		this.jButtonid_paisActividadEconomica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisActividadEconomica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisActividadEconomica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisActividadEconomica"));

		this.jButtonid_paisActividadEconomicaBusqueda= new JButtonMe();
		this.jButtonid_paisActividadEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisActividadEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisActividadEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisActividadEconomicaBusqueda.setText("U");
		this.jButtonid_paisActividadEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisActividadEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisActividadEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisActividadEconomicaBusqueda"));

		if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisActividadEconomicaBusqueda.setVisible(false);		}

		this.jButtonid_paisActividadEconomicaUpdate= new JButtonMe();
		this.jButtonid_paisActividadEconomicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisActividadEconomicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisActividadEconomicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisActividadEconomicaUpdate.setText("U");
		this.jButtonid_paisActividadEconomicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisActividadEconomicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisActividadEconomicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisActividadEconomicaUpdate"));



					
		this.jLabelid_ciudadActividadEconomica = new JLabelMe();
		this.jLabelid_ciudadActividadEconomica.setText(""+ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadActividadEconomica.setToolTipText("Ciudad");
		this.jLabelid_ciudadActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadActividadEconomica.setToolTipText(ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutActividadEconomica = new GridBagLayout();
		this.jPanelid_ciudadActividadEconomica.setLayout(this.gridaBagLayoutActividadEconomica);


		jComboBoxid_ciudadActividadEconomica= new JComboBoxMe();
		jComboBoxid_ciudadActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadActividadEconomica= new JButtonMe();
		this.jButtonid_ciudadActividadEconomica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadActividadEconomica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadActividadEconomica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadActividadEconomica.setText("Buscar");
		this.jButtonid_ciudadActividadEconomica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadActividadEconomica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadActividadEconomica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadActividadEconomica"));

		this.jButtonid_ciudadActividadEconomicaBusqueda= new JButtonMe();
		this.jButtonid_ciudadActividadEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadActividadEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadActividadEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadActividadEconomicaBusqueda.setText("U");
		this.jButtonid_ciudadActividadEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadActividadEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadActividadEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadActividadEconomicaBusqueda"));

		if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadActividadEconomicaBusqueda.setVisible(false);		}

		this.jButtonid_ciudadActividadEconomicaUpdate= new JButtonMe();
		this.jButtonid_ciudadActividadEconomicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadActividadEconomicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadActividadEconomicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadActividadEconomicaUpdate.setText("U");
		this.jButtonid_ciudadActividadEconomicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadActividadEconomicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadActividadEconomicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadActividadEconomicaUpdate"));



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
		//this.jInternalFrameDetalleActividadEconomica = new ActividadEconomicaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Actividad Economica DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutActividadEconomica= new GridBagLayout();
		

		
		String sToolTipActividadEconomica="";
		sToolTipActividadEconomica=ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipActividadEconomica+="(Cartera.ActividadEconomica)";
		}
		
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
			sToolTipActividadEconomica+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoActividadEconomica = new JButtonMe();
		this.jButtonModificarActividadEconomica = new JButtonMe();
        this.jButtonActualizarActividadEconomica = new JButtonMe();
        this.jButtonEliminarActividadEconomica = new JButtonMe();
        this.jButtonCancelarActividadEconomica = new JButtonMe();
        this.jButtonGuardarCambiosActividadEconomica = new JButtonMe();
		this.jButtonGuardarCambiosTablaActividadEconomica = new JButtonMe();
		this.jButtonCerrarActividadEconomica = new JButtonMe();
		
		this.jScrollPanelDatosActividadEconomica = new JScrollPane();   
        this.jScrollPanelDatosEdicionActividadEconomica = new JScrollPane();
		this.jScrollPanelDatosGeneralActividadEconomica = new JScrollPane();
				
		
		
		this.jPanelCamposActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Actividad Economica";
		
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Actividad Economicas" + this.sPath));
		} else {
			this.jScrollPanelDatosActividadEconomica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposActividadEconomica.setName("jPanelCamposActividadEconomica"); 

		this.jPanelCamposOcultosActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosActividadEconomica.setName("jPanelCamposOcultosActividadEconomica"); 

        this.jPanelAccionesActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesActividadEconomica.setToolTipText("Acciones");
        this.jPanelAccionesActividadEconomica.setName("Acciones"); 

		this.jPanelAccionesFormularioActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioActividadEconomica.setToolTipText("Acciones");
        this.jPanelAccionesFormularioActividadEconomica.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoActividadEconomica.setText("Nuevo");
		this.jButtonModificarActividadEconomica.setText("Editar");
        this.jButtonActualizarActividadEconomica.setText("Actualizar");
        this.jButtonEliminarActividadEconomica.setText("Eliminar");
        this.jButtonCancelarActividadEconomica.setText("Cancelar");
        this.jButtonGuardarCambiosActividadEconomica.setText("Guardar");
		this.jButtonGuardarCambiosTablaActividadEconomica.setText("Guardar");
		this.jButtonCerrarActividadEconomica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoActividadEconomica,"nuevo_button","Nuevo",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarActividadEconomica,"modificar_button","Editar",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarActividadEconomica,"actualizar_button","Actualizar",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarActividadEconomica,"eliminar_button","Eliminar",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarActividadEconomica,"cancelar_button","Cancelar",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosActividadEconomica,"guardarcambios_button","Guardar",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaActividadEconomica,"guardarcambiostabla_button","Guardar",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarActividadEconomica,"cerrar_button","Salir",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoActividadEconomica.setToolTipText("Nuevo"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarActividadEconomica.setToolTipText("Editar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarActividadEconomica.setToolTipText("Actualizar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarActividadEconomica.setToolTipText("Eliminar)"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarActividadEconomica.setToolTipText("Cancelar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosActividadEconomica.setToolTipText("Guardar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaActividadEconomica.setToolTipText("Guardar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarActividadEconomica.setToolTipText("Salir"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoActividadEconomica";
		inputMap = this.jButtonNuevoActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoActividadEconomica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoActividadEconomica"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarActividadEconomica";
		inputMap = this.jButtonActualizarActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarActividadEconomica"));
		
		//ELIMINAR
		sMapKey = "EliminarActividadEconomica";
		inputMap = this.jButtonEliminarActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarActividadEconomica"));
		
		//CANCELAR	
		sMapKey = "CancelarActividadEconomica";
		inputMap = this.jButtonCancelarActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarActividadEconomica"));
		
		//CERRAR		
		sMapKey = "CerrarActividadEconomica";
		inputMap = this.jButtonCerrarActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarActividadEconomica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaActividadEconomica";
		inputMap = this.jButtonGuardarCambiosTablaActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaActividadEconomica"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoActividadEconomica = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoActividadEconomica.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoActividadEconomica.setToolTipText("Nuevo ActividadEconomica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarActividadEconomica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarActividadEconomica.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarActividadEconomica.setToolTipText("Sin Cerrar Ventana ActividadEconomica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeActividadEconomica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeActividadEconomica.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeActividadEconomica.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesActividadEconomica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesActividadEconomica.setText("Accion");
		this.jComboBoxTiposAccionesActividadEconomica.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioActividadEconomica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioActividadEconomica.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioActividadEconomica.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesActividadEconomica = new JLabelMe();
		
		this.jLabelAccionesActividadEconomica.setText("Acciones");		
		this.jLabelAccionesActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposActividadEconomica();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysActividadEconomica();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesActividadEconomica=new JTabbedPane();
		this.jTabbedPaneRelacionesActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesActividadEconomica,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesActividadEconomica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActividadEconomica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActividadEconomica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioActividadEconomica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioActividadEconomica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioActividadEconomica.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposActividadEconomica = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosActividadEconomica = new GridBagLayout();
		
		this.jPanelCamposActividadEconomica.setLayout(gridaBagLayoutCamposActividadEconomica);
		this.jPanelCamposOcultosActividadEconomica.setLayout(gridaBagLayoutCamposOcultosActividadEconomica);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 0;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidActividadEconomica.add(jLabelIdActividadEconomica, this.gridBagConstraintsActividadEconomica);



	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 1;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidActividadEconomica.add(jLabelidActividadEconomica, this.gridBagConstraintsActividadEconomica);


	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 0;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaActividadEconomica.add(jLabelid_empresaActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 2;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaActividadEconomica.add(jButtonid_empresaActividadEconomicaBusqueda, this.gridBagConstraintsActividadEconomica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 3;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaActividadEconomica.add(jButtonid_empresaActividadEconomicaUpdate, this.gridBagConstraintsActividadEconomica);
	}

	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 1;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaActividadEconomica.add(jComboBoxid_empresaActividadEconomica, this.gridBagConstraintsActividadEconomica);


	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 0;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteActividadEconomica.add(jLabelid_clienteActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 2;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteActividadEconomica.add(jButtonid_clienteActividadEconomica, this.gridBagConstraintsActividadEconomica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 3;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteActividadEconomica.add(jButtonid_clienteActividadEconomicaBusqueda, this.gridBagConstraintsActividadEconomica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 4;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteActividadEconomica.add(jButtonid_clienteActividadEconomicaUpdate, this.gridBagConstraintsActividadEconomica);
	}

	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 1;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteActividadEconomica.add(jComboBoxid_clienteActividadEconomica, this.gridBagConstraintsActividadEconomica);


	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 0;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_negocioActividadEconomica.add(jLabelnombre_negocioActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 2;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_negocioActividadEconomica.add(jButtonnombre_negocioActividadEconomicaBusqueda, this.gridBagConstraintsActividadEconomica);
	}

	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 1;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_negocioActividadEconomica.add(jscrollPanenombre_negocioActividadEconomica, this.gridBagConstraintsActividadEconomica);


	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 0;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelactividadActividadEconomica.add(jLabelactividadActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 2;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelactividadActividadEconomica.add(jButtonactividadActividadEconomicaBusqueda, this.gridBagConstraintsActividadEconomica);
	}

	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 1;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelactividadActividadEconomica.add(jscrollPaneactividadActividadEconomica, this.gridBagConstraintsActividadEconomica);


	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 0;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisActividadEconomica.add(jLabelid_paisActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 2;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisActividadEconomica.add(jButtonid_paisActividadEconomicaBusqueda, this.gridBagConstraintsActividadEconomica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 3;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisActividadEconomica.add(jButtonid_paisActividadEconomicaUpdate, this.gridBagConstraintsActividadEconomica);
	}

	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 1;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisActividadEconomica.add(jComboBoxid_paisActividadEconomica, this.gridBagConstraintsActividadEconomica);


	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 0;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadActividadEconomica.add(jLabelid_ciudadActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 2;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadActividadEconomica.add(jButtonid_ciudadActividadEconomicaBusqueda, this.gridBagConstraintsActividadEconomica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 3;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadActividadEconomica.add(jButtonid_ciudadActividadEconomicaUpdate, this.gridBagConstraintsActividadEconomica);
	}

	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 1;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadActividadEconomica.add(jComboBoxid_ciudadActividadEconomica, this.gridBagConstraintsActividadEconomica);


	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 0;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionActividadEconomica.add(jLabeldireccionActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 2;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionActividadEconomica.add(jButtondireccionActividadEconomicaBusqueda, this.gridBagConstraintsActividadEconomica);
	}

	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 1;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionActividadEconomica.add(jscrollPanedireccionActividadEconomica, this.gridBagConstraintsActividadEconomica);


	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 0;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoActividadEconomica.add(jLabeltelefonoActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 2;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoActividadEconomica.add(jButtontelefonoActividadEconomicaBusqueda, this.gridBagConstraintsActividadEconomica);
	}

	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 1;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoActividadEconomica.add(jscrollPanetelefonoActividadEconomica, this.gridBagConstraintsActividadEconomica);


	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 0;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingreso_netoActividadEconomica.add(jLabelingreso_netoActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 2;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelingreso_netoActividadEconomica.add(jButtoningreso_netoActividadEconomicaBusqueda, this.gridBagConstraintsActividadEconomica);
	}

	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 1;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingreso_netoActividadEconomica.add(jTextFieldingreso_netoActividadEconomica, this.gridBagConstraintsActividadEconomica);


	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 0;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingreso_brutoActividadEconomica.add(jLabelingreso_brutoActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 2;
		this.gridBagConstraintsActividadEconomica.ipadx = 0;
		this.gridBagConstraintsActividadEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelingreso_brutoActividadEconomica.add(jButtoningreso_brutoActividadEconomicaBusqueda, this.gridBagConstraintsActividadEconomica);
	}

	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActividadEconomica.gridy = 0;
	this.gridBagConstraintsActividadEconomica.gridx = 1;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingreso_brutoActividadEconomica.add(jTextFieldingreso_brutoActividadEconomica, this.gridBagConstraintsActividadEconomica);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActividadEconomica.gridy = iYPanelCamposActividadEconomica;
	this.gridBagConstraintsActividadEconomica.gridx = iXPanelCamposActividadEconomica++;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActividadEconomica.add(this.jPanelidActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(iXPanelCamposActividadEconomica % 1==0) {
		iXPanelCamposActividadEconomica=0;
		iYPanelCamposActividadEconomica++;
	}
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActividadEconomica.gridy = iYPanelCamposActividadEconomica;
	this.gridBagConstraintsActividadEconomica.gridx = iXPanelCamposActividadEconomica++;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActividadEconomica.add(this.jPanelid_clienteActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(iXPanelCamposActividadEconomica % 1==0) {
		iXPanelCamposActividadEconomica=0;
		iYPanelCamposActividadEconomica++;
	}
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActividadEconomica.gridy = iYPanelCamposActividadEconomica;
	this.gridBagConstraintsActividadEconomica.gridx = iXPanelCamposActividadEconomica++;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActividadEconomica.add(this.jPanelnombre_negocioActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(iXPanelCamposActividadEconomica % 1==0) {
		iXPanelCamposActividadEconomica=0;
		iYPanelCamposActividadEconomica++;
	}
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActividadEconomica.gridy = iYPanelCamposActividadEconomica;
	this.gridBagConstraintsActividadEconomica.gridx = iXPanelCamposActividadEconomica++;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActividadEconomica.add(this.jPanelactividadActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(iXPanelCamposActividadEconomica % 1==0) {
		iXPanelCamposActividadEconomica=0;
		iYPanelCamposActividadEconomica++;
	}
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActividadEconomica.gridy = iYPanelCamposActividadEconomica;
	this.gridBagConstraintsActividadEconomica.gridx = iXPanelCamposActividadEconomica++;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActividadEconomica.add(this.jPanelid_paisActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(iXPanelCamposActividadEconomica % 1==0) {
		iXPanelCamposActividadEconomica=0;
		iYPanelCamposActividadEconomica++;
	}
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActividadEconomica.gridy = iYPanelCamposActividadEconomica;
	this.gridBagConstraintsActividadEconomica.gridx = iXPanelCamposActividadEconomica++;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActividadEconomica.add(this.jPanelid_ciudadActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(iXPanelCamposActividadEconomica % 1==0) {
		iXPanelCamposActividadEconomica=0;
		iYPanelCamposActividadEconomica++;
	}
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActividadEconomica.gridy = iYPanelCamposActividadEconomica;
	this.gridBagConstraintsActividadEconomica.gridx = iXPanelCamposActividadEconomica++;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActividadEconomica.add(this.jPaneldireccionActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(iXPanelCamposActividadEconomica % 1==0) {
		iXPanelCamposActividadEconomica=0;
		iYPanelCamposActividadEconomica++;
	}
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActividadEconomica.gridy = iYPanelCamposActividadEconomica;
	this.gridBagConstraintsActividadEconomica.gridx = iXPanelCamposActividadEconomica++;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActividadEconomica.add(this.jPaneltelefonoActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(iXPanelCamposActividadEconomica % 1==0) {
		iXPanelCamposActividadEconomica=0;
		iYPanelCamposActividadEconomica++;
	}
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActividadEconomica.gridy = iYPanelCamposActividadEconomica;
	this.gridBagConstraintsActividadEconomica.gridx = iXPanelCamposActividadEconomica++;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActividadEconomica.add(this.jPanelingreso_netoActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(iXPanelCamposActividadEconomica % 1==0) {
		iXPanelCamposActividadEconomica=0;
		iYPanelCamposActividadEconomica++;
	}
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActividadEconomica.gridy = iYPanelCamposActividadEconomica;
	this.gridBagConstraintsActividadEconomica.gridx = iXPanelCamposActividadEconomica++;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActividadEconomica.add(this.jPanelingreso_brutoActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(iXPanelCamposActividadEconomica % 1==0) {
		iXPanelCamposActividadEconomica=0;
		iYPanelCamposActividadEconomica++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActividadEconomica.gridy = iYPanelCamposOcultosActividadEconomica;
	this.gridBagConstraintsActividadEconomica.gridx = iXPanelCamposOcultosActividadEconomica++;
	this.gridBagConstraintsActividadEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActividadEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosActividadEconomica.add(this.jPanelid_empresaActividadEconomica, this.gridBagConstraintsActividadEconomica);



	if(iXPanelCamposOcultosActividadEconomica % 1==0) {
		iXPanelCamposOcultosActividadEconomica=0;
		iYPanelCamposOcultosActividadEconomica++;
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
			
		GridBagLayout gridaBagLayoutAccionesActividadEconomica= new GridBagLayout();
		this.jPanelAccionesActividadEconomica.setLayout(gridaBagLayoutAccionesActividadEconomica);
		
		GridBagLayout gridaBagLayoutAccionesFormularioActividadEconomica= new GridBagLayout();
		this.jPanelAccionesFormularioActividadEconomica.setLayout(gridaBagLayoutAccionesFormularioActividadEconomica);
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsActividadEconomica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioActividadEconomica.add(this.jComboBoxTiposAccionesFormularioActividadEconomica, this.gridBagConstraintsActividadEconomica);

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsActividadEconomica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioActividadEconomica.add(this.jCheckBoxPostAccionNuevoActividadEconomica, this.gridBagConstraintsActividadEconomica);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioActividadEconomica.add(this.jCheckBoxPostAccionSinCerrarActividadEconomica, this.gridBagConstraintsActividadEconomica);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioActividadEconomica.add(this.jCheckBoxPostAccionSinMensajeActividadEconomica, this.gridBagConstraintsActividadEconomica);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = iPosXAccion++;
			
		this.jPanelAccionesActividadEconomica.add(this.jButtonModificarActividadEconomica, this.gridBagConstraintsActividadEconomica);							

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx =iPosXAccion++;
			
		this.jPanelAccionesActividadEconomica.add(this.jButtonEliminarActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
			
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = 0;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXAccion++;
		
		this.jPanelAccionesActividadEconomica.add(this.jButtonActualizarActividadEconomica, this.gridBagConstraintsActividadEconomica);


		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = 0;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXAccion++;
		
		this.jPanelAccionesActividadEconomica.add(this.jButtonGuardarCambiosActividadEconomica, this.gridBagConstraintsActividadEconomica);	
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = 0;		
		this.gridBagConstraintsActividadEconomica.gridx =iPosXAccion++;
		
		this.jPanelAccionesActividadEconomica.add(this.jButtonCancelarActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutActividadEconomica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutActividadEconomica);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();						
			this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsActividadEconomica.gridx = 0;		
			//this.gridBagConstraintsActividadEconomica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsActividadEconomica.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsActividadEconomica.gridx =0;
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsActividadEconomica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosActividadEconomica, this.gridBagConstraintsActividadEconomica);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ActividadEconomicaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleActividadEconomica = new ActividadEconomicaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Actividad Economica DATOS");
			
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
			
	        //this.setTitle("[FOR] - Actividad Economica DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Actividad Economica Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ActividadEconomicaModel actividadeconomicaModel=new ActividadEconomicaModel(this);
			
			//SI USARA CLASE INTERNA
			//ActividadEconomicaModel.ActividadEconomicaFocusTraversalPolicy actividadeconomicaFocusTraversalPolicy = actividadeconomicaModel.new ActividadEconomicaFocusTraversalPolicy(this);
			
			//actividadeconomicaFocusTraversalPolicy.setactividadeconomicaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(actividadeconomicaModel);
			
			
			this.jContentPaneDetalleActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleActividadEconomica = new GridBagLayout();	
			this.jContentPaneDetalleActividadEconomica.setLayout(gridaBagLayoutDetalleActividadEconomica);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosActividadEconomica = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
				this.gridBagConstraintsActividadEconomica.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsActividadEconomica.gridx = 0;
					
				
				this.jContentPaneDetalleActividadEconomica.add(jTtoolBarDetalleActividadEconomica, gridBagConstraintsActividadEconomica);								
				
}
			
			this.jScrollPanelDatosEdicionActividadEconomica=   new JScrollPane(jContentPaneDetalleActividadEconomica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionActividadEconomica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActividadEconomica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActividadEconomica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralActividadEconomica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralActividadEconomica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActividadEconomica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActividadEconomica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			
			
	        this.gridBagConstraintsActividadEconomica.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsActividadEconomica.gridx = 0;
	        
			this.jContentPaneDetalleActividadEconomica.add(jPanelCamposActividadEconomica, gridBagConstraintsActividadEconomica);
			
			
			
			
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
						&& actividadeconomicaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.actividadeconomicaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsActividadEconomica= new GridBagConstraints();
						this.gridBagConstraintsActividadEconomica.gridy = iGridyRelaciones++;
						this.gridBagConstraintsActividadEconomica.gridx = 0;
						this.jContentPaneDetalleActividadEconomica.add(this.jTabbedPaneRelacionesActividadEconomica, this.gridBagConstraintsActividadEconomica);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesActividadEconomica.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosActividadEconomica.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
					this.gridBagConstraintsActividadEconomica.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsActividadEconomica.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsActividadEconomica.gridx = 0;
					
				
					this.jContentPaneDetalleActividadEconomica.add(jPanelCamposOcultosActividadEconomica, gridBagConstraintsActividadEconomica);
				
					this.jPanelCamposOcultosActividadEconomica.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsActividadEconomica.gridx = 0;
	        this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleActividadEconomica.add(this.jPanelAccionesFormularioActividadEconomica, this.gridBagConstraintsActividadEconomica);							
			
			
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
	        this.gridBagConstraintsActividadEconomica.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsActividadEconomica.gridx = 0;
	        
			
			this.jContentPaneDetalleActividadEconomica.add(this.jPanelAccionesActividadEconomica, this.gridBagConstraintsActividadEconomica);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionActividadEconomica);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionActividadEconomica=   new JScrollPane(this.jPanelCamposActividadEconomica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionActividadEconomica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActividadEconomica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActividadEconomica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsActividadEconomica.gridx = 0;
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsActividadEconomica.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionActividadEconomica, this.gridBagConstraintsActividadEconomica);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsActividadEconomica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioActividadEconomica, this.gridBagConstraintsActividadEconomica);			
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsActividadEconomica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesActividadEconomica, this.gridBagConstraintsActividadEconomica);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActividadEconomica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposActividadEconomica, this.gridBagConstraintsActividadEconomica);
			
			
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActividadEconomica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
			
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsActividadEconomica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesActividadEconomica, this.gridBagConstraintsActividadEconomica);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralActividadEconomica;//jContentPane;
		
		return jScrollPanelDatosEdicionActividadEconomica;
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
