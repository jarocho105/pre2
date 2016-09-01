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
import com.bydan.erp.inventario.util.MensajeCorreoInvenConstantesFunciones;

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
public class MensajeCorreoInvenDetalleFormJInternalFrame extends MensajeCorreoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMensajeCorreoInven;
	
	protected JMenuBar jmenuBarDetalleMensajeCorreoInven;
	
	protected JMenu jmenuDetalleMensajeCorreoInven;
	protected JMenu jmenuDetalleArchivoMensajeCorreoInven;
	protected JMenu jmenuDetalleAccionesMensajeCorreoInven;
	protected JMenu jmenuDetalleDatosMensajeCorreoInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMensajeCorreoInven;	
	protected GridBagConstraints gridBagConstraintsMensajeCorreoInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MensajeCorreoInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleMensajeCorreoInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMensajeCorreoInvenBeanSwingJInternalFrame tipomensajecorreoinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomensajecorreoinven="";
	
	public MensajeCorreoInvenSessionBean mensajecorreoinvenSessionBean;
	
	

	public DetalleMensajeCorreoInvenBeanSwingJInternalFrame detallemensajecorreoinvenBeanSwingJInternalFrame=null;
	public DetalleMensajeCorreoInvenBeanSwingJInternalFrame detallemensajecorreoinvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleMensajeCorreoInven=false;
	public DetalleMensajeCorreoInvenSessionBean detallemensajecorreoinvenSessionBean;

	public MailMensajeCorreoInvenBeanSwingJInternalFrame mailmensajecorreoinvenBeanSwingJInternalFrame=null;
	public MailMensajeCorreoInvenBeanSwingJInternalFrame mailmensajecorreoinvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteMailMensajeCorreoInven=false;
	public MailMensajeCorreoInvenSessionBean mailmensajecorreoinvenSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMensajeCorreoInvenSessionBean tipomensajecorreoinvenSessionBean;	
	
	public MensajeCorreoInvenLogic mensajecorreoinvenLogic;
	
	public JScrollPane jScrollPanelDatosMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosEdicionMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosGeneralMensajeCorreoInven;
	
	protected JPanel jPanelCamposMensajeCorreoInven;    
	protected JPanel jPanelCamposOcultosMensajeCorreoInven;    	
	protected JPanel jPanelAccionesMensajeCorreoInven;
	protected JPanel jPanelAccionesFormularioMensajeCorreoInven;
    
	
	
	protected Integer iXPanelCamposMensajeCorreoInven=0;
	protected Integer iYPanelCamposMensajeCorreoInven=0;
	
	protected Integer iXPanelCamposOcultosMensajeCorreoInven=0;
	protected Integer iYPanelCamposOcultosMensajeCorreoInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMensajeCorreoInven;
	public JButton jButtonModificarMensajeCorreoInven;
	public JButton jButtonActualizarMensajeCorreoInven;
    public JButton jButtonEliminarMensajeCorreoInven;
	public JButton jButtonCancelarMensajeCorreoInven;
    public JButton jButtonGuardarCambiosMensajeCorreoInven;
	public JButton jButtonGuardarCambiosTablaMensajeCorreoInven;
	protected JButton jButtonCerrarMensajeCorreoInven;
	
	
	protected JButton jButtonProcesarInformacionMensajeCorreoInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMensajeCorreoInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMensajeCorreoInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMensajeCorreoInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMensajeCorreoInven;
	protected JButton jButtonModificarToolBarMensajeCorreoInven;
	protected JButton jButtonActualizarToolBarMensajeCorreoInven;
    protected JButton jButtonEliminarToolBarMensajeCorreoInven;
	protected JButton jButtonCancelarToolBarMensajeCorreoInven;
    protected JButton jButtonGuardarCambiosToolBarMensajeCorreoInven;
	protected JButton jButtonGuardarCambiosTablaToolBarMensajeCorreoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarMensajeCorreoInven;
	protected JButton jButtonCerrarToolBarMensajeCorreoInven;
	
	protected JButton jButtonProcesarInformacionToolBarMensajeCorreoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMensajeCorreoInven;
	protected JMenuItem jMenuItemModificarMensajeCorreoInven;
	protected JMenuItem jMenuItemActualizarMensajeCorreoInven;
    protected JMenuItem jMenuItemEliminarMensajeCorreoInven;
	protected JMenuItem jMenuItemCancelarMensajeCorreoInven;
    protected JMenuItem jMenuItemGuardarCambiosMensajeCorreoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaMensajeCorreoInven;
	protected JMenuItem jMenuItemCerrarMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleCerrarMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarMensajeCorreoInven;
	
	protected JMenuItem jMenuItemProcesarInformacionMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMensajeCorreoInven;
	protected JMenuItem jMenuItemMostrarOcultarMensajeCorreoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMensajeCorreoInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMensajeCorreoInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMensajeCorreoInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMensajeCorreoInven;
	public JLabel jLabelIdMensajeCorreoInven;
	public JLabel jLabelidMensajeCorreoInven;
	public JButton jButtonidMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPaneltemaMensajeCorreoInven;
	public JLabel jLabeltemaMensajeCorreoInven;
	public JTextArea jTextAreatemaMensajeCorreoInven;
	public JScrollPane jscrollPanetemaMensajeCorreoInven;
	public JButton jButtontemaMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelmensajeMensajeCorreoInven;
	public JLabel jLabelmensajeMensajeCorreoInven;
	public JTextArea jTextAreamensajeMensajeCorreoInven;
	public JScrollPane jscrollPanemensajeMensajeCorreoInven;
	public JButton jButtonmensajeMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelavisoMensajeCorreoInven;
	public JLabel jLabelavisoMensajeCorreoInven;
	public JTextArea jTextAreaavisoMensajeCorreoInven;
	public JScrollPane jscrollPaneavisoMensajeCorreoInven;
	public JButton jButtonavisoMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoMensajeCorreoInven;
	public JLabel jLabelesta_activoMensajeCorreoInven;
	public JCheckBox jCheckBoxesta_activoMensajeCorreoInven;
	public JButton jButtonesta_activoMensajeCorreoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMensajeCorreoInven;
	public JLabel jLabelid_empresaMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMensajeCorreoInven;
	public JButton jButtonid_empresaMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_empresaMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalMensajeCorreoInven;
	public JLabel jLabelid_sucursalMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalMensajeCorreoInven;
	public JButton jButtonid_sucursalMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_sucursalMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_sucursalMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloMensajeCorreoInven;
	public JLabel jLabelid_moduloMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloMensajeCorreoInven;
	public JButton jButtonid_moduloMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_moduloMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_moduloMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_mensaje_correo_invenMensajeCorreoInven;
	public JLabel jLabelid_tipo_mensaje_correo_invenMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven;
	public JButton jButtonid_tipo_mensaje_correo_invenMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMensajeCorreoInven;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MensajeCorreoInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMensajeCorreoInven=new JPanel();
				this.jPanelAccionesFormularioMensajeCorreoInven=new JPanel();
				this.jmenuBarDetalleMensajeCorreoInven=new JMenuBar();
				this.jTtoolBarDetalleMensajeCorreoInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MensajeCorreoInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MensajeCorreoInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MensajeCorreoInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MensajeCorreoInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MensajeCorreoInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMensajeCorreoInven() {
		return this.jButtonActualizarToolBarMensajeCorreoInven;
	}
	
	public JButton getjButtonEliminarToolBarMensajeCorreoInven() {
		return this.jButtonEliminarToolBarMensajeCorreoInven;
	}
	
	public JButton getjButtonCancelarToolBarMensajeCorreoInven() {
		return this.jButtonCancelarToolBarMensajeCorreoInven;
	}		
	
	public JButton getjButtonProcesarInformacionMensajeCorreoInven() {
		return this.jButtonProcesarInformacionMensajeCorreoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMensajeCorreoInven)	{
		this.jButtonProcesarInformacionMensajeCorreoInven = jButtonProcesarInformacionMensajeCorreoInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMensajeCorreoInven(
			JComboBox jComboBoxTiposRelacionesMensajeCorreoInven) {
		this.jComboBoxTiposRelacionesMensajeCorreoInven = jComboBoxTiposRelacionesMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesMensajeCorreoInven) {
		this.jComboBoxTiposAccionesMensajeCorreoInven = jComboBoxTiposAccionesMensajeCorreoInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesFormularioMensajeCorreoInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesFormularioMensajeCorreoInven) {
		this.jComboBoxTiposAccionesFormularioMensajeCorreoInven = jComboBoxTiposAccionesFormularioMensajeCorreoInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
		
		this.mensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
		//this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MensajeCorreoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mensaje Correo MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		MensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMensajeCorreoInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMensajeCorreoInven=new JButtonMe();
				this.jButtonModificarToolBarMensajeCorreoInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"actualizar","actualizar","Actualizar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"eliminar","eliminar","Eliminar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"cancelar","cancelar","Cancelar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,
							"guardarcambios","guardarcambios","Guardar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMensajeCorreoInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMensajeCorreoInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMensajeCorreoInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMensajeCorreoInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMensajeCorreoInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMensajeCorreoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMensajeCorreoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMensajeCorreoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMensajeCorreoInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMensajeCorreoInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMensajeCorreoInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMensajeCorreoInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMensajeCorreoInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMensajeCorreoInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMensajeCorreoInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMensajeCorreoInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMensajeCorreoInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMensajeCorreoInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMensajeCorreoInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMensajeCorreoInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMensajeCorreoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMensajeCorreoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMensajeCorreoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMensajeCorreoInven.add(this.jMenuItemDetalleCerrarMensajeCorreoInven);
		
		this.jmenuDetalleAccionesMensajeCorreoInven.add(this.jMenuItemActualizarMensajeCorreoInven);
		this.jmenuDetalleAccionesMensajeCorreoInven.add(this.jMenuItemEliminarMensajeCorreoInven);
		this.jmenuDetalleAccionesMensajeCorreoInven.add(this.jMenuItemCancelarMensajeCorreoInven);		
		
		//this.jmenuDetalleDatosMensajeCorreoInven.add(this.jMenuItemDetalleAbrirOrderByMensajeCorreoInven);				
		this.jmenuDetalleDatosMensajeCorreoInven.add(this.jMenuItemDetalleMostarOcultarMensajeCorreoInven);				
				
		//this.jmenuDetalleAccionesMensajeCorreoInven.add(this.jMenuItemGuardarCambiosMensajeCorreoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMensajeCorreoInven.add(this.jmenuDetalleArchivoMensajeCorreoInven);		
		this.jmenuBarDetalleMensajeCorreoInven.add(this.jmenuDetalleAccionesMensajeCorreoInven);		
		this.jmenuBarDetalleMensajeCorreoInven.add(this.jmenuDetalleDatosMensajeCorreoInven);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleMensajeCorreoInven.add(this.jmenuDetalleMensajeCorreoInven);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMensajeCorreoInven);				
	}
	
	
	public void inicializarElementosCamposMensajeCorreoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMensajeCorreoInven = new JLabelMe();
		jLabelIdMensajeCorreoInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMensajeCorreoInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMensajeCorreoInven.setToolTipText(MensajeCorreoInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMensajeCorreoInven= new GridBagLayout();

		this.jPanelidMensajeCorreoInven.setLayout(this.gridaBagLayoutMensajeCorreoInven);

		jLabelidMensajeCorreoInven = new JLabel();
		jLabelidMensajeCorreoInven.setText("Id");

		jLabelidMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeltemaMensajeCorreoInven = new JLabelMe();
		this.jLabeltemaMensajeCorreoInven.setText(""+MensajeCorreoInvenConstantesFunciones.LABEL_TEMA+" : *");
		this.jLabeltemaMensajeCorreoInven.setToolTipText("Tema");
		this.jLabeltemaMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltemaMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltemaMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltemaMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltemaMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltemaMensajeCorreoInven.setToolTipText(MensajeCorreoInvenConstantesFunciones.LABEL_TEMA);
		this.gridaBagLayoutMensajeCorreoInven = new GridBagLayout();
		this.jPaneltemaMensajeCorreoInven.setLayout(this.gridaBagLayoutMensajeCorreoInven);


		jTextAreatemaMensajeCorreoInven= new JTextAreaMe();
		jTextAreatemaMensajeCorreoInven.setEnabled(false);
		jTextAreatemaMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatemaMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatemaMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatemaMensajeCorreoInven.setLineWrap(true);
		jTextAreatemaMensajeCorreoInven.setWrapStyleWord(true);
		jTextAreatemaMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatemaMensajeCorreoInven.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreatemaMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetemaMensajeCorreoInven = new JScrollPane(jTextAreatemaMensajeCorreoInven);
		jscrollPanetemaMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetemaMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetemaMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontemaMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtontemaMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontemaMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontemaMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontemaMensajeCorreoInvenBusqueda.setText("U");
		this.jButtontemaMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontemaMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontemaMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatemaMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatemaMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"temaMensajeCorreoInvenBusqueda"));

		if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontemaMensajeCorreoInvenBusqueda.setVisible(false);		}


					
		this.jLabelmensajeMensajeCorreoInven = new JLabelMe();
		this.jLabelmensajeMensajeCorreoInven.setText(""+MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE+" : *");
		this.jLabelmensajeMensajeCorreoInven.setToolTipText("Mensaje");
		this.jLabelmensajeMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmensajeMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmensajeMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmensajeMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmensajeMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmensajeMensajeCorreoInven.setToolTipText(MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE);
		this.gridaBagLayoutMensajeCorreoInven = new GridBagLayout();
		this.jPanelmensajeMensajeCorreoInven.setLayout(this.gridaBagLayoutMensajeCorreoInven);


		jTextAreamensajeMensajeCorreoInven= new JTextAreaMe();
		jTextAreamensajeMensajeCorreoInven.setEnabled(false);
		jTextAreamensajeMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamensajeMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamensajeMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamensajeMensajeCorreoInven.setLineWrap(true);
		jTextAreamensajeMensajeCorreoInven.setWrapStyleWord(true);
		jTextAreamensajeMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamensajeMensajeCorreoInven.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreamensajeMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemensajeMensajeCorreoInven = new JScrollPane(jTextAreamensajeMensajeCorreoInven);
		jscrollPanemensajeMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanemensajeMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanemensajeMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonmensajeMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonmensajeMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmensajeMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmensajeMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmensajeMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonmensajeMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmensajeMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmensajeMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamensajeMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamensajeMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"mensajeMensajeCorreoInvenBusqueda"));

		if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmensajeMensajeCorreoInvenBusqueda.setVisible(false);		}


					
		this.jLabelavisoMensajeCorreoInven = new JLabelMe();
		this.jLabelavisoMensajeCorreoInven.setText(""+MensajeCorreoInvenConstantesFunciones.LABEL_AVISO+" :");
		this.jLabelavisoMensajeCorreoInven.setToolTipText("Aviso");
		this.jLabelavisoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelavisoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelavisoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelavisoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelavisoMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelavisoMensajeCorreoInven.setToolTipText(MensajeCorreoInvenConstantesFunciones.LABEL_AVISO);
		this.gridaBagLayoutMensajeCorreoInven = new GridBagLayout();
		this.jPanelavisoMensajeCorreoInven.setLayout(this.gridaBagLayoutMensajeCorreoInven);


		jTextAreaavisoMensajeCorreoInven= new JTextAreaMe();
		jTextAreaavisoMensajeCorreoInven.setEnabled(false);
		jTextAreaavisoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaavisoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaavisoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaavisoMensajeCorreoInven.setLineWrap(true);
		jTextAreaavisoMensajeCorreoInven.setWrapStyleWord(true);
		jTextAreaavisoMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaavisoMensajeCorreoInven.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaavisoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneavisoMensajeCorreoInven = new JScrollPane(jTextAreaavisoMensajeCorreoInven);
		jscrollPaneavisoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneavisoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneavisoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonavisoMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonavisoMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonavisoMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonavisoMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonavisoMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonavisoMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonavisoMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonavisoMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaavisoMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaavisoMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"avisoMensajeCorreoInvenBusqueda"));

		if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonavisoMensajeCorreoInvenBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoMensajeCorreoInven = new JLabelMe();
		this.jLabelesta_activoMensajeCorreoInven.setText(""+MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoMensajeCorreoInven.setToolTipText("Esta Activo");
		this.jLabelesta_activoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoMensajeCorreoInven.setToolTipText(MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutMensajeCorreoInven = new GridBagLayout();
		this.jPanelesta_activoMensajeCorreoInven.setLayout(this.gridaBagLayoutMensajeCorreoInven);


		jCheckBoxesta_activoMensajeCorreoInven= new JCheckBoxMe();
		jCheckBoxesta_activoMensajeCorreoInven.setEnabled(false);

		jCheckBoxesta_activoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonesta_activoMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonesta_activoMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoMensajeCorreoInvenBusqueda"));

		if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoMensajeCorreoInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMensajeCorreoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMensajeCorreoInven = new JLabelMe();
		this.jLabelid_empresaMensajeCorreoInven.setText(""+MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMensajeCorreoInven.setToolTipText("Empresa");
		this.jLabelid_empresaMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMensajeCorreoInven.setToolTipText(MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_empresaMensajeCorreoInven.setLayout(this.gridaBagLayoutMensajeCorreoInven);


		jComboBoxid_empresaMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_empresaMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMensajeCorreoInven.setEnabled(false);

		this.jButtonid_empresaMensajeCorreoInven= new JButtonMe();
		this.jButtonid_empresaMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMensajeCorreoInven.setText("Buscar");
		this.jButtonid_empresaMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMensajeCorreoInven"));

		this.jButtonid_empresaMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_empresaMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMensajeCorreoInvenBusqueda"));

		if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_empresaMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_empresaMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMensajeCorreoInvenUpdate"));



					
		this.jLabelid_sucursalMensajeCorreoInven = new JLabelMe();
		this.jLabelid_sucursalMensajeCorreoInven.setText(""+MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalMensajeCorreoInven.setToolTipText("Sucursal");
		this.jLabelid_sucursalMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalMensajeCorreoInven.setToolTipText(MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_sucursalMensajeCorreoInven.setLayout(this.gridaBagLayoutMensajeCorreoInven);


		jComboBoxid_sucursalMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_sucursalMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalMensajeCorreoInven.setEnabled(false);

		this.jButtonid_sucursalMensajeCorreoInven= new JButtonMe();
		this.jButtonid_sucursalMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMensajeCorreoInven.setText("Buscar");
		this.jButtonid_sucursalMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMensajeCorreoInven"));

		this.jButtonid_sucursalMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_sucursalMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_sucursalMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMensajeCorreoInvenBusqueda"));

		if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_sucursalMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_sucursalMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_sucursalMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMensajeCorreoInvenUpdate"));



					
		this.jLabelid_moduloMensajeCorreoInven = new JLabelMe();
		this.jLabelid_moduloMensajeCorreoInven.setText(""+MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloMensajeCorreoInven.setToolTipText("Modulo");
		this.jLabelid_moduloMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloMensajeCorreoInven.setToolTipText(MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_moduloMensajeCorreoInven.setLayout(this.gridaBagLayoutMensajeCorreoInven);


		jComboBoxid_moduloMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_moduloMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloMensajeCorreoInven.setEnabled(false);

		this.jButtonid_moduloMensajeCorreoInven= new JButtonMe();
		this.jButtonid_moduloMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloMensajeCorreoInven.setText("Buscar");
		this.jButtonid_moduloMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloMensajeCorreoInven"));

		this.jButtonid_moduloMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_moduloMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_moduloMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloMensajeCorreoInvenBusqueda"));

		if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_moduloMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_moduloMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_moduloMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloMensajeCorreoInvenUpdate"));



					
		this.jLabelid_tipo_mensaje_correo_invenMensajeCorreoInven = new JLabelMe();
		this.jLabelid_tipo_mensaje_correo_invenMensajeCorreoInven.setText(""+MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN+" : *");
		this.jLabelid_tipo_mensaje_correo_invenMensajeCorreoInven.setToolTipText("T. Mensaje Correo");
		this.jLabelid_tipo_mensaje_correo_invenMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_mensaje_correo_invenMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_mensaje_correo_invenMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_mensaje_correo_invenMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_mensaje_correo_invenMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_mensaje_correo_invenMensajeCorreoInven.setToolTipText(MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN);
		this.gridaBagLayoutMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_tipo_mensaje_correo_invenMensajeCorreoInven.setLayout(this.gridaBagLayoutMensajeCorreoInven);


		jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInven= new JButtonMe();
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInven.setText("Buscar");
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_mensaje_correo_invenMensajeCorreoInven"));

		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda"));

		if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate"));



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
		//this.jInternalFrameDetalleMensajeCorreoInven = new MensajeCorreoInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Mensaje Correo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMensajeCorreoInven= new GridBagLayout();
		

		
		String sToolTipMensajeCorreoInven="";
		sToolTipMensajeCorreoInven=MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMensajeCorreoInven+="(Inventario.MensajeCorreoInven)";
		}
		
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipMensajeCorreoInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMensajeCorreoInven = new JButtonMe();
		this.jButtonModificarMensajeCorreoInven = new JButtonMe();
        this.jButtonActualizarMensajeCorreoInven = new JButtonMe();
        this.jButtonEliminarMensajeCorreoInven = new JButtonMe();
        this.jButtonCancelarMensajeCorreoInven = new JButtonMe();
        this.jButtonGuardarCambiosMensajeCorreoInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarMensajeCorreoInven = new JButtonMe();
		
		this.jScrollPanelDatosMensajeCorreoInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionMensajeCorreoInven = new JScrollPane();
		this.jScrollPanelDatosGeneralMensajeCorreoInven = new JScrollPane();
				
		
		
		this.jPanelCamposMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Mensaje Correo";
		
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mensaje Correoes" + this.sPath));
		} else {
			this.jScrollPanelDatosMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMensajeCorreoInven.setName("jPanelCamposMensajeCorreoInven"); 

		this.jPanelCamposOcultosMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMensajeCorreoInven.setName("jPanelCamposOcultosMensajeCorreoInven"); 

        this.jPanelAccionesMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesMensajeCorreoInven.setName("Acciones"); 

		this.jPanelAccionesFormularioMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMensajeCorreoInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMensajeCorreoInven.setText("Nuevo");
		this.jButtonModificarMensajeCorreoInven.setText("Editar");
        this.jButtonActualizarMensajeCorreoInven.setText("Actualizar");
        this.jButtonEliminarMensajeCorreoInven.setText("Eliminar");
        this.jButtonCancelarMensajeCorreoInven.setText("Cancelar");
        this.jButtonGuardarCambiosMensajeCorreoInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaMensajeCorreoInven.setText("Guardar");
		this.jButtonCerrarMensajeCorreoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMensajeCorreoInven,"nuevo_button","Nuevo",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMensajeCorreoInven,"modificar_button","Editar",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMensajeCorreoInven,"actualizar_button","Actualizar",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMensajeCorreoInven,"eliminar_button","Eliminar",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMensajeCorreoInven,"cancelar_button","Cancelar",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMensajeCorreoInven,"guardarcambios_button","Guardar",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMensajeCorreoInven,"guardarcambiostabla_button","Guardar",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMensajeCorreoInven,"cerrar_button","Salir",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMensajeCorreoInven.setToolTipText("Nuevo"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMensajeCorreoInven.setToolTipText("Editar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMensajeCorreoInven.setToolTipText("Actualizar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMensajeCorreoInven.setToolTipText("Eliminar)"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMensajeCorreoInven.setToolTipText("Cancelar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMensajeCorreoInven.setToolTipText("Guardar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMensajeCorreoInven.setToolTipText("Guardar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMensajeCorreoInven.setToolTipText("Salir"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMensajeCorreoInven";
		inputMap = this.jButtonNuevoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMensajeCorreoInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMensajeCorreoInven";
		inputMap = this.jButtonActualizarMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMensajeCorreoInven"));
		
		//ELIMINAR
		sMapKey = "EliminarMensajeCorreoInven";
		inputMap = this.jButtonEliminarMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMensajeCorreoInven"));
		
		//CANCELAR	
		sMapKey = "CancelarMensajeCorreoInven";
		inputMap = this.jButtonCancelarMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMensajeCorreoInven"));
		
		//CERRAR		
		sMapKey = "CerrarMensajeCorreoInven";
		inputMap = this.jButtonCerrarMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMensajeCorreoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMensajeCorreoInven";
		inputMap = this.jButtonGuardarCambiosTablaMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMensajeCorreoInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMensajeCorreoInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMensajeCorreoInven.setToolTipText("Nuevo MensajeCorreoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMensajeCorreoInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMensajeCorreoInven.setToolTipText("Sin Cerrar Ventana MensajeCorreoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMensajeCorreoInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMensajeCorreoInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposAccionesMensajeCorreoInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMensajeCorreoInven = new JLabelMe();
		
		this.jLabelAccionesMensajeCorreoInven.setText("Acciones");		
		this.jLabelAccionesMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMensajeCorreoInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMensajeCorreoInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMensajeCorreoInven=new JTabbedPane();
		this.jTabbedPaneRelacionesMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMensajeCorreoInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMensajeCorreoInven = new GridBagLayout();
		
		this.jPanelCamposMensajeCorreoInven.setLayout(gridaBagLayoutCamposMensajeCorreoInven);
		this.jPanelCamposOcultosMensajeCorreoInven.setLayout(gridaBagLayoutCamposOcultosMensajeCorreoInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMensajeCorreoInven.add(jLabelIdMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMensajeCorreoInven.add(jLabelidMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);


	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMensajeCorreoInven.add(jLabelid_empresaMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMensajeCorreoInven.add(jButtonid_empresaMensajeCorreoInvenBusqueda, this.gridBagConstraintsMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMensajeCorreoInven.add(jButtonid_empresaMensajeCorreoInvenUpdate, this.gridBagConstraintsMensajeCorreoInven);
	}

	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMensajeCorreoInven.add(jComboBoxid_empresaMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);


	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalMensajeCorreoInven.add(jLabelid_sucursalMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMensajeCorreoInven.add(jButtonid_sucursalMensajeCorreoInvenBusqueda, this.gridBagConstraintsMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMensajeCorreoInven.add(jButtonid_sucursalMensajeCorreoInvenUpdate, this.gridBagConstraintsMensajeCorreoInven);
	}

	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalMensajeCorreoInven.add(jComboBoxid_sucursalMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);


	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloMensajeCorreoInven.add(jLabelid_moduloMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloMensajeCorreoInven.add(jButtonid_moduloMensajeCorreoInvenBusqueda, this.gridBagConstraintsMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloMensajeCorreoInven.add(jButtonid_moduloMensajeCorreoInvenUpdate, this.gridBagConstraintsMensajeCorreoInven);
	}

	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloMensajeCorreoInven.add(jComboBoxid_moduloMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);


	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_mensaje_correo_invenMensajeCorreoInven.add(jLabelid_tipo_mensaje_correo_invenMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_mensaje_correo_invenMensajeCorreoInven.add(jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda, this.gridBagConstraintsMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_mensaje_correo_invenMensajeCorreoInven.add(jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate, this.gridBagConstraintsMensajeCorreoInven);
	}

	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_mensaje_correo_invenMensajeCorreoInven.add(jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);


	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltemaMensajeCorreoInven.add(jLabeltemaMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPaneltemaMensajeCorreoInven.add(jButtontemaMensajeCorreoInvenBusqueda, this.gridBagConstraintsMensajeCorreoInven);
	}

	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltemaMensajeCorreoInven.add(jscrollPanetemaMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);


	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmensajeMensajeCorreoInven.add(jLabelmensajeMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelmensajeMensajeCorreoInven.add(jButtonmensajeMensajeCorreoInvenBusqueda, this.gridBagConstraintsMensajeCorreoInven);
	}

	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmensajeMensajeCorreoInven.add(jscrollPanemensajeMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);


	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelavisoMensajeCorreoInven.add(jLabelavisoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelavisoMensajeCorreoInven.add(jButtonavisoMensajeCorreoInvenBusqueda, this.gridBagConstraintsMensajeCorreoInven);
	}

	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelavisoMensajeCorreoInven.add(jscrollPaneavisoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);


	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoMensajeCorreoInven.add(jLabelesta_activoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoMensajeCorreoInven.add(jButtonesta_activoMensajeCorreoInvenBusqueda, this.gridBagConstraintsMensajeCorreoInven);
	}

	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoMensajeCorreoInven.add(jCheckBoxesta_activoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMensajeCorreoInven.gridy = iYPanelCamposMensajeCorreoInven;
	this.gridBagConstraintsMensajeCorreoInven.gridx = iXPanelCamposMensajeCorreoInven++;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMensajeCorreoInven.add(this.jPanelidMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(iXPanelCamposMensajeCorreoInven % 1==0) {
		iXPanelCamposMensajeCorreoInven=0;
		iYPanelCamposMensajeCorreoInven++;
	}
	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMensajeCorreoInven.gridy = iYPanelCamposMensajeCorreoInven;
	this.gridBagConstraintsMensajeCorreoInven.gridx = iXPanelCamposMensajeCorreoInven++;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMensajeCorreoInven.add(this.jPanelid_tipo_mensaje_correo_invenMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(iXPanelCamposMensajeCorreoInven % 1==0) {
		iXPanelCamposMensajeCorreoInven=0;
		iYPanelCamposMensajeCorreoInven++;
	}
	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMensajeCorreoInven.gridy = iYPanelCamposMensajeCorreoInven;
	this.gridBagConstraintsMensajeCorreoInven.gridx = iXPanelCamposMensajeCorreoInven++;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMensajeCorreoInven.add(this.jPaneltemaMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(iXPanelCamposMensajeCorreoInven % 1==0) {
		iXPanelCamposMensajeCorreoInven=0;
		iYPanelCamposMensajeCorreoInven++;
	}
	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMensajeCorreoInven.gridy = iYPanelCamposMensajeCorreoInven;
	this.gridBagConstraintsMensajeCorreoInven.gridx = iXPanelCamposMensajeCorreoInven++;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMensajeCorreoInven.add(this.jPanelmensajeMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(iXPanelCamposMensajeCorreoInven % 1==0) {
		iXPanelCamposMensajeCorreoInven=0;
		iYPanelCamposMensajeCorreoInven++;
	}
	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMensajeCorreoInven.gridy = iYPanelCamposMensajeCorreoInven;
	this.gridBagConstraintsMensajeCorreoInven.gridx = iXPanelCamposMensajeCorreoInven++;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMensajeCorreoInven.add(this.jPanelavisoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(iXPanelCamposMensajeCorreoInven % 1==0) {
		iXPanelCamposMensajeCorreoInven=0;
		iYPanelCamposMensajeCorreoInven++;
	}
	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMensajeCorreoInven.gridy = iYPanelCamposMensajeCorreoInven;
	this.gridBagConstraintsMensajeCorreoInven.gridx = iXPanelCamposMensajeCorreoInven++;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMensajeCorreoInven.add(this.jPanelesta_activoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(iXPanelCamposMensajeCorreoInven % 1==0) {
		iXPanelCamposMensajeCorreoInven=0;
		iYPanelCamposMensajeCorreoInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMensajeCorreoInven.gridy = iYPanelCamposOcultosMensajeCorreoInven;
	this.gridBagConstraintsMensajeCorreoInven.gridx = iXPanelCamposOcultosMensajeCorreoInven++;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMensajeCorreoInven.add(this.jPanelid_empresaMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(iXPanelCamposOcultosMensajeCorreoInven % 1==0) {
		iXPanelCamposOcultosMensajeCorreoInven=0;
		iYPanelCamposOcultosMensajeCorreoInven++;
	}
	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMensajeCorreoInven.gridy = iYPanelCamposOcultosMensajeCorreoInven;
	this.gridBagConstraintsMensajeCorreoInven.gridx = iXPanelCamposOcultosMensajeCorreoInven++;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMensajeCorreoInven.add(this.jPanelid_sucursalMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(iXPanelCamposOcultosMensajeCorreoInven % 1==0) {
		iXPanelCamposOcultosMensajeCorreoInven=0;
		iYPanelCamposOcultosMensajeCorreoInven++;
	}
	this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMensajeCorreoInven.gridy = iYPanelCamposOcultosMensajeCorreoInven;
	this.gridBagConstraintsMensajeCorreoInven.gridx = iXPanelCamposOcultosMensajeCorreoInven++;
	this.gridBagConstraintsMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMensajeCorreoInven.add(this.jPanelid_moduloMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);



	if(iXPanelCamposOcultosMensajeCorreoInven % 1==0) {
		iXPanelCamposOcultosMensajeCorreoInven=0;
		iYPanelCamposOcultosMensajeCorreoInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesMensajeCorreoInven.setLayout(gridaBagLayoutAccionesMensajeCorreoInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesFormularioMensajeCorreoInven.setLayout(gridaBagLayoutAccionesFormularioMensajeCorreoInven);
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMensajeCorreoInven.add(this.jComboBoxTiposAccionesFormularioMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMensajeCorreoInven.add(this.jCheckBoxPostAccionNuevoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMensajeCorreoInven.add(this.jCheckBoxPostAccionSinCerrarMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMensajeCorreoInven.add(this.jCheckBoxPostAccionSinMensajeMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesMensajeCorreoInven.add(this.jButtonModificarMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);							

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesMensajeCorreoInven.add(this.jButtonEliminarMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		
			
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesMensajeCorreoInven.add(this.jButtonActualizarMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);


		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesMensajeCorreoInven.add(this.jButtonGuardarCambiosMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);	
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsMensajeCorreoInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesMensajeCorreoInven.add(this.jButtonCancelarMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMensajeCorreoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMensajeCorreoInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();						
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMensajeCorreoInven.gridx = 0;		
			//this.gridBagConstraintsMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMensajeCorreoInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMensajeCorreoInven.gridx =0;
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMensajeCorreoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMensajeCorreoInven = new MensajeCorreoInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Mensaje Correo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Mensaje Correo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mensaje Correo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MensajeCorreoInvenModel mensajecorreoinvenModel=new MensajeCorreoInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//MensajeCorreoInvenModel.MensajeCorreoInvenFocusTraversalPolicy mensajecorreoinvenFocusTraversalPolicy = mensajecorreoinvenModel.new MensajeCorreoInvenFocusTraversalPolicy(this);
			
			//mensajecorreoinvenFocusTraversalPolicy.setmensajecorreoinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(mensajecorreoinvenModel);
			
			
			this.jContentPaneDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMensajeCorreoInven = new GridBagLayout();	
			this.jContentPaneDetalleMensajeCorreoInven.setLayout(gridaBagLayoutDetalleMensajeCorreoInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMensajeCorreoInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
					
				
				this.jContentPaneDetalleMensajeCorreoInven.add(jTtoolBarDetalleMensajeCorreoInven, gridBagConstraintsMensajeCorreoInven);								
				
}
			
			this.jScrollPanelDatosEdicionMensajeCorreoInven=   new JScrollPane(jContentPaneDetalleMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMensajeCorreoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	        
			this.jContentPaneDetalleMensajeCorreoInven.add(jPanelCamposMensajeCorreoInven, gridBagConstraintsMensajeCorreoInven);
			
			
			
			
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
						&& mensajecorreoinvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleMensajeCorreoInven(this.puedeCargarPorParteDetalleMensajeCorreoInven,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMailMensajeCorreoInven(this.puedeCargarPorParteMailMensajeCorreoInven,false,-1);
					
					if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMensajeCorreoInven= new GridBagConstraints();
						this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
						this.jContentPaneDetalleMensajeCorreoInven.add(this.jTabbedPaneRelacionesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMensajeCorreoInven.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleMensajeCorreoInven(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMailMensajeCorreoInven(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMensajeCorreoInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
					this.gridBagConstraintsMensajeCorreoInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
					
				
					this.jContentPaneDetalleMensajeCorreoInven.add(jPanelCamposOcultosMensajeCorreoInven, gridBagConstraintsMensajeCorreoInven);
				
					this.jPanelCamposOcultosMensajeCorreoInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	        this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMensajeCorreoInven.add(this.jPanelAccionesFormularioMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);							
			
			
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
	        this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
	        
			
			this.jContentPaneDetalleMensajeCorreoInven.add(this.jPanelAccionesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMensajeCorreoInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMensajeCorreoInven=   new JScrollPane(this.jPanelCamposMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMensajeCorreoInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);			
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			
			
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		
			
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMensajeCorreoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMensajeCorreoInven;//jContentPane;
		
		return jScrollPanelDatosEdicionMensajeCorreoInven;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleMensajeCorreoInven(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
		this.detallemensajecorreoinvenSessionBean.setConGuardarRelaciones(false);
		this.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(true);

		this.detallemensajecorreoinvenBeanSwingJInternalFrame=null;//new DetalleMensajeCorreoInvenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallemensajecorreoinvenBeanSwingJInternalFramePopup=new DetalleMensajeCorreoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallemensajecorreoinvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {

				DetalleMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=MensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=MensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(true);

				this.detallemensajecorreoinvenBeanSwingJInternalFrame=new DetalleMensajeCorreoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallemensajecorreoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallemensajecorreoinvenBeanSwingJInternalFrame.setdetallemensajecorreoinvenSessionBean(this.detallemensajecorreoinvenSessionBean);

				//this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
				//this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
				//this.jContentPaneDetalleMensajeCorreoInven.add(this.detallemensajecorreoinvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsMensajeCorreoInven);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesMensajeCorreoInven.add("Detalle Mensaje Correo Invenes",this.detallemensajecorreoinvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesMensajeCorreoInven.setComponentAt(iIndexTab,this.detallemensajecorreoinvenBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(false);
				this.detallemensajecorreoinvenBeanSwingJInternalFrame=null;//new DetalleMensajeCorreoInvenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleMensajeCorreoInven) {
					this.jTabbedPaneRelacionesMensajeCorreoInven.add("Detalle Mensaje Correo Invenes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameMailMensajeCorreoInven(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
		this.mailmensajecorreoinvenSessionBean.setConGuardarRelaciones(false);
		this.mailmensajecorreoinvenSessionBean.setEsGuardarRelacionado(true);

		this.mailmensajecorreoinvenBeanSwingJInternalFrame=null;//new MailMensajeCorreoInvenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.mailmensajecorreoinvenBeanSwingJInternalFramePopup=new MailMensajeCorreoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.mailmensajecorreoinvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {

				MailMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=MensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
				MailMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=MensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.mailmensajecorreoinvenSessionBean.setEsGuardarRelacionado(true);

				this.mailmensajecorreoinvenBeanSwingJInternalFrame=new MailMensajeCorreoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.mailmensajecorreoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.mailmensajecorreoinvenBeanSwingJInternalFrame.setmailmensajecorreoinvenSessionBean(this.mailmensajecorreoinvenSessionBean);

				//this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
				//this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
				//this.jContentPaneDetalleMensajeCorreoInven.add(this.mailmensajecorreoinvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsMensajeCorreoInven);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesMensajeCorreoInven.add("Mail Mensaje Correo Invenes",this.mailmensajecorreoinvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesMensajeCorreoInven.setComponentAt(iIndexTab,this.mailmensajecorreoinvenBeanSwingJInternalFrame.getContentPane());
				}

				//MailMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.mailmensajecorreoinvenSessionBean.setEsGuardarRelacionado(false);
				this.mailmensajecorreoinvenBeanSwingJInternalFrame=null;//new MailMensajeCorreoInvenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteMailMensajeCorreoInven) {
					this.jTabbedPaneRelacionesMensajeCorreoInven.add("Mail Mensaje Correo Invenes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleMensajeCorreoInvenBeanSwingJInternalFrame(List<MensajeCorreoInven> mensajecorreoinvens,MensajeCorreoInven mensajecorreoinven,DetalleMensajeCorreoInvenBeanSwingJInternalFrame detallemensajecorreoinvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallemensajecorreoinvenBeanSwingJInternalFrame=new DetalleMensajeCorreoInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallemensajecorreoinvenBeanSwingJInternalFrame.getDetalleMensajeCorreoInvenLogic().setConnexion(this.mensajecorreoinvenLogic.getConnexion());

					detallemensajecorreoinvenBeanSwingJInternalFrame.setmensajecorreoinvensForeignKey(mensajecorreoinvens);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setmensajecorreoinvenForeignKey(mensajecorreoinven);
					detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.setisBusquedaDesdeForeignKeySesionMensajeCorreoInven(true);
					detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.setlidMensajeCorreoInvenActual(mensajecorreoinven.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallemensajecorreoinvenBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleMensajeCorreoInven(detallemensajecorreoinvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaMensajeCorreoInven(true);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setid_mensaje_correo_invenFK_IdMensajeCorreoInven(mensajecorreoinven.getId());

					if(!this.conCargarFormDetalle) {
						detallemensajecorreoinvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallemensajecorreoinvenBeanSwingJInternalFrame.setSelectedItemCombosFrameMensajeCorreoInvenForeignKey(mensajecorreoinven,1,false,true,true);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallemensajecorreoinvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdMensajeCorreoInven");
					detallemensajecorreoinvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdMensajeCorreoInven");
					detallemensajecorreoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(true);
					detallemensajecorreoinvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("n",detallemensajecorreoinvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallemensajecorreoinvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setAutoscrolls(true);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallemensajecorreoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMensajeCorreoInven("relacionado");
					} else {
						detallemensajecorreoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMensajeCorreoInven("no_relacionado");
					}

					detallemensajecorreoinvenBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleMensajeCorreoInven().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarMailMensajeCorreoInvenBeanSwingJInternalFrame(List<MensajeCorreoInven> mensajecorreoinvens,MensajeCorreoInven mensajecorreoinven,MailMensajeCorreoInvenBeanSwingJInternalFrame mailmensajecorreoinvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//mailmensajecorreoinvenBeanSwingJInternalFrame=new MailMensajeCorreoInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					mailmensajecorreoinvenBeanSwingJInternalFrame.getMailMensajeCorreoInvenLogic().setConnexion(this.mensajecorreoinvenLogic.getConnexion());

					mailmensajecorreoinvenBeanSwingJInternalFrame.setmensajecorreoinvensForeignKey(mensajecorreoinvens);
					mailmensajecorreoinvenBeanSwingJInternalFrame.setmensajecorreoinvenForeignKey(mensajecorreoinven);
					mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenSessionBean.setisBusquedaDesdeForeignKeySesionMensajeCorreoInven(true);
					mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenSessionBean.setlidMensajeCorreoInvenActual(mensajecorreoinven.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					mailmensajecorreoinvenBeanSwingJInternalFrame.cargarCombosForeignKeyMailMensajeCorreoInven(mailmensajecorreoinvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					mailmensajecorreoinvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaMensajeCorreoInven(true);
					mailmensajecorreoinvenBeanSwingJInternalFrame.setid_mensaje_correo_invenFK_IdMensajeCorreoInven(mensajecorreoinven.getId());

					if(!this.conCargarFormDetalle) {
						mailmensajecorreoinvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					mailmensajecorreoinvenBeanSwingJInternalFrame.setSelectedItemCombosFrameMensajeCorreoInvenForeignKey(mensajecorreoinven,1,false,true,true);
					mailmensajecorreoinvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					mailmensajecorreoinvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdMensajeCorreoInven");
					mailmensajecorreoinvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdMensajeCorreoInven");
					mailmensajecorreoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaMailMensajeCorreoInven(true);
					mailmensajecorreoinvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("n",mailmensajecorreoinvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, mailmensajecorreoinvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					mailmensajecorreoinvenBeanSwingJInternalFrame.setAutoscrolls(true);
					mailmensajecorreoinvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						mailmensajecorreoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsMailMensajeCorreoInven("relacionado");
					} else {
						mailmensajecorreoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsMailMensajeCorreoInven("no_relacionado");
					}

					mailmensajecorreoinvenBeanSwingJInternalFrame.getjButtonRecargarInformacionMailMensajeCorreoInven().setVisible(false);

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
