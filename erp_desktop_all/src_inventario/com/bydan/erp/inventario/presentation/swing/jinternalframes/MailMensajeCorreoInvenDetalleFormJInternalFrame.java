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
import com.bydan.erp.inventario.util.MailMensajeCorreoInvenConstantesFunciones;

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
public class MailMensajeCorreoInvenDetalleFormJInternalFrame extends MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMailMensajeCorreoInven;
	
	protected JMenuBar jmenuBarDetalleMailMensajeCorreoInven;
	
	protected JMenu jmenuDetalleMailMensajeCorreoInven;
	protected JMenu jmenuDetalleArchivoMailMensajeCorreoInven;
	protected JMenu jmenuDetalleAccionesMailMensajeCorreoInven;
	protected JMenu jmenuDetalleDatosMailMensajeCorreoInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMailMensajeCorreoInven;	
	protected GridBagConstraints gridBagConstraintsMailMensajeCorreoInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleMailMensajeCorreoInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected MensajeCorreoInvenBeanSwingJInternalFrame mensajecorreoinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mensajecorreoinven="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public MailMensajeCorreoInvenSessionBean mailmensajecorreoinvenSessionBean;
	
	
	
	
	public MensajeCorreoInvenSessionBean mensajecorreoinvenSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;	
	
	public MailMensajeCorreoInvenLogic mailmensajecorreoinvenLogic;
	
	public JScrollPane jScrollPanelDatosMailMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosEdicionMailMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosGeneralMailMensajeCorreoInven;
	
	protected JPanel jPanelCamposMailMensajeCorreoInven;    
	protected JPanel jPanelCamposOcultosMailMensajeCorreoInven;    	
	protected JPanel jPanelAccionesMailMensajeCorreoInven;
	protected JPanel jPanelAccionesFormularioMailMensajeCorreoInven;
    
	
	
	protected Integer iXPanelCamposMailMensajeCorreoInven=0;
	protected Integer iYPanelCamposMailMensajeCorreoInven=0;
	
	protected Integer iXPanelCamposOcultosMailMensajeCorreoInven=0;
	protected Integer iYPanelCamposOcultosMailMensajeCorreoInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMailMensajeCorreoInven;
	public JButton jButtonModificarMailMensajeCorreoInven;
	public JButton jButtonActualizarMailMensajeCorreoInven;
    public JButton jButtonEliminarMailMensajeCorreoInven;
	public JButton jButtonCancelarMailMensajeCorreoInven;
    public JButton jButtonGuardarCambiosMailMensajeCorreoInven;
	public JButton jButtonGuardarCambiosTablaMailMensajeCorreoInven;
	protected JButton jButtonCerrarMailMensajeCorreoInven;
	
	
	protected JButton jButtonProcesarInformacionMailMensajeCorreoInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMailMensajeCorreoInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMailMensajeCorreoInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMailMensajeCorreoInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMailMensajeCorreoInven;
	protected JButton jButtonModificarToolBarMailMensajeCorreoInven;
	protected JButton jButtonActualizarToolBarMailMensajeCorreoInven;
    protected JButton jButtonEliminarToolBarMailMensajeCorreoInven;
	protected JButton jButtonCancelarToolBarMailMensajeCorreoInven;
    protected JButton jButtonGuardarCambiosToolBarMailMensajeCorreoInven;
	protected JButton jButtonGuardarCambiosTablaToolBarMailMensajeCorreoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarMailMensajeCorreoInven;
	protected JButton jButtonCerrarToolBarMailMensajeCorreoInven;
	
	protected JButton jButtonProcesarInformacionToolBarMailMensajeCorreoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMailMensajeCorreoInven;
	protected JMenuItem jMenuItemModificarMailMensajeCorreoInven;
	protected JMenuItem jMenuItemActualizarMailMensajeCorreoInven;
    protected JMenuItem jMenuItemEliminarMailMensajeCorreoInven;
	protected JMenuItem jMenuItemCancelarMailMensajeCorreoInven;
    protected JMenuItem jMenuItemGuardarCambiosMailMensajeCorreoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaMailMensajeCorreoInven;
	protected JMenuItem jMenuItemCerrarMailMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleCerrarMailMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarMailMensajeCorreoInven;
	
	protected JMenuItem jMenuItemProcesarInformacionMailMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMailMensajeCorreoInven;
	protected JMenuItem jMenuItemMostrarOcultarMailMensajeCorreoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMailMensajeCorreoInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMailMensajeCorreoInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMailMensajeCorreoInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMailMensajeCorreoInven;
	public JLabel jLabelIdMailMensajeCorreoInven;
	public JLabel jLabelidMailMensajeCorreoInven;
	public JButton jButtonidMailMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelmailMailMensajeCorreoInven;
	public JLabel jLabelmailMailMensajeCorreoInven;
	public JTextArea jTextAreamailMailMensajeCorreoInven;
	public JScrollPane jscrollPanemailMailMensajeCorreoInven;
	public JButton jButtonmailMailMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoMailMensajeCorreoInven;
	public JLabel jLabelesta_activoMailMensajeCorreoInven;
	public JCheckBox jCheckBoxesta_activoMailMensajeCorreoInven;
	public JButton jButtonesta_activoMailMensajeCorreoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mensaje_correo_invenMailMensajeCorreoInven;
	public JLabel jLabelid_mensaje_correo_invenMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven;
	public JButton jButtonid_mensaje_correo_invenMailMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaMailMensajeCorreoInven;
	public JLabel jLabelid_empresaMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMailMensajeCorreoInven;
	public JButton jButtonid_empresaMailMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_empresaMailMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaMailMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalMailMensajeCorreoInven;
	public JLabel jLabelid_sucursalMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalMailMensajeCorreoInven;
	public JButton jButtonid_sucursalMailMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_sucursalMailMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_sucursalMailMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloMailMensajeCorreoInven;
	public JLabel jLabelid_moduloMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloMailMensajeCorreoInven;
	public JButton jButtonid_moduloMailMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_moduloMailMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_moduloMailMensajeCorreoInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMailMensajeCorreoInven;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MailMensajeCorreoInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMailMensajeCorreoInven=new JPanel();
				this.jPanelAccionesFormularioMailMensajeCorreoInven=new JPanel();
				this.jmenuBarDetalleMailMensajeCorreoInven=new JMenuBar();
				this.jTtoolBarDetalleMailMensajeCorreoInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MailMensajeCorreoInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MailMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MailMensajeCorreoInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MailMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MailMensajeCorreoInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MailMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MailMensajeCorreoInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MailMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MailMensajeCorreoInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MailMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMailMensajeCorreoInven() {
		return this.jButtonActualizarToolBarMailMensajeCorreoInven;
	}
	
	public JButton getjButtonEliminarToolBarMailMensajeCorreoInven() {
		return this.jButtonEliminarToolBarMailMensajeCorreoInven;
	}
	
	public JButton getjButtonCancelarToolBarMailMensajeCorreoInven() {
		return this.jButtonCancelarToolBarMailMensajeCorreoInven;
	}		
	
	public JButton getjButtonProcesarInformacionMailMensajeCorreoInven() {
		return this.jButtonProcesarInformacionMailMensajeCorreoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMailMensajeCorreoInven)	{
		this.jButtonProcesarInformacionMailMensajeCorreoInven = jButtonProcesarInformacionMailMensajeCorreoInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMailMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesMailMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMailMensajeCorreoInven(
			JComboBox jComboBoxTiposRelacionesMailMensajeCorreoInven) {
		this.jComboBoxTiposRelacionesMailMensajeCorreoInven = jComboBoxTiposRelacionesMailMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMailMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesMailMensajeCorreoInven) {
		this.jComboBoxTiposAccionesMailMensajeCorreoInven = jComboBoxTiposAccionesMailMensajeCorreoInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMailMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMailMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesFormularioMailMensajeCorreoInven) {
		this.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven = jComboBoxTiposAccionesFormularioMailMensajeCorreoInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
		
		this.mailmensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mailmensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MailMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MailMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MailMensajeCorreoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mail Mensaje Correo Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		MailMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMailMensajeCorreoInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMailMensajeCorreoInven=new JButtonMe();
				this.jButtonModificarToolBarMailMensajeCorreoInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMailMensajeCorreoInven,this.jTtoolBarDetalleMailMensajeCorreoInven,
							"actualizar","actualizar","Actualizar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMailMensajeCorreoInven,this.jTtoolBarDetalleMailMensajeCorreoInven,
							"eliminar","eliminar","Eliminar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMailMensajeCorreoInven,this.jTtoolBarDetalleMailMensajeCorreoInven,
							"cancelar","cancelar","Cancelar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMailMensajeCorreoInven,this.jTtoolBarDetalleMailMensajeCorreoInven,
							"guardarcambios","guardarcambios","Guardar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMailMensajeCorreoInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMailMensajeCorreoInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMailMensajeCorreoInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMailMensajeCorreoInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMailMensajeCorreoInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMailMensajeCorreoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMailMensajeCorreoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMailMensajeCorreoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMailMensajeCorreoInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMailMensajeCorreoInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMailMensajeCorreoInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMailMensajeCorreoInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMailMensajeCorreoInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMailMensajeCorreoInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMailMensajeCorreoInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMailMensajeCorreoInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMailMensajeCorreoInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMailMensajeCorreoInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMailMensajeCorreoInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMailMensajeCorreoInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMailMensajeCorreoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMailMensajeCorreoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMailMensajeCorreoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMailMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMailMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMailMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMailMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMailMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMailMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMailMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMailMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMailMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMailMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMailMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMailMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMailMensajeCorreoInven.add(this.jMenuItemDetalleCerrarMailMensajeCorreoInven);
		
		this.jmenuDetalleAccionesMailMensajeCorreoInven.add(this.jMenuItemActualizarMailMensajeCorreoInven);
		this.jmenuDetalleAccionesMailMensajeCorreoInven.add(this.jMenuItemEliminarMailMensajeCorreoInven);
		this.jmenuDetalleAccionesMailMensajeCorreoInven.add(this.jMenuItemCancelarMailMensajeCorreoInven);		
		
		//this.jmenuDetalleDatosMailMensajeCorreoInven.add(this.jMenuItemDetalleAbrirOrderByMailMensajeCorreoInven);				
		this.jmenuDetalleDatosMailMensajeCorreoInven.add(this.jMenuItemDetalleMostarOcultarMailMensajeCorreoInven);				
				
		//this.jmenuDetalleAccionesMailMensajeCorreoInven.add(this.jMenuItemGuardarCambiosMailMensajeCorreoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMailMensajeCorreoInven.add(this.jmenuDetalleArchivoMailMensajeCorreoInven);		
		this.jmenuBarDetalleMailMensajeCorreoInven.add(this.jmenuDetalleAccionesMailMensajeCorreoInven);		
		this.jmenuBarDetalleMailMensajeCorreoInven.add(this.jmenuDetalleDatosMailMensajeCorreoInven);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMailMensajeCorreoInven);				
	}
	
	
	public void inicializarElementosCamposMailMensajeCorreoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMailMensajeCorreoInven = new JLabelMe();
		jLabelIdMailMensajeCorreoInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMailMensajeCorreoInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMailMensajeCorreoInven.setToolTipText(MailMensajeCorreoInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMailMensajeCorreoInven= new GridBagLayout();

		this.jPanelidMailMensajeCorreoInven.setLayout(this.gridaBagLayoutMailMensajeCorreoInven);

		jLabelidMailMensajeCorreoInven = new JLabel();
		jLabelidMailMensajeCorreoInven.setText("Id");

		jLabelidMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelmailMailMensajeCorreoInven = new JLabelMe();
		this.jLabelmailMailMensajeCorreoInven.setText(""+MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL+" : *");
		this.jLabelmailMailMensajeCorreoInven.setToolTipText("Mail");
		this.jLabelmailMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmailMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmailMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmailMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmailMailMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmailMailMensajeCorreoInven.setToolTipText(MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL);
		this.gridaBagLayoutMailMensajeCorreoInven = new GridBagLayout();
		this.jPanelmailMailMensajeCorreoInven.setLayout(this.gridaBagLayoutMailMensajeCorreoInven);


		jTextAreamailMailMensajeCorreoInven= new JTextAreaMe();
		jTextAreamailMailMensajeCorreoInven.setEnabled(false);
		jTextAreamailMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailMailMensajeCorreoInven.setLineWrap(true);
		jTextAreamailMailMensajeCorreoInven.setWrapStyleWord(true);
		jTextAreamailMailMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamailMailMensajeCorreoInven.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamailMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemailMailMensajeCorreoInven = new JScrollPane(jTextAreamailMailMensajeCorreoInven);
		jscrollPanemailMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemailMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemailMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmailMailMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonmailMailMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmailMailMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmailMailMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmailMailMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonmailMailMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmailMailMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmailMailMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamailMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamailMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"mailMailMensajeCorreoInvenBusqueda"));

		if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmailMailMensajeCorreoInvenBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoMailMensajeCorreoInven = new JLabelMe();
		this.jLabelesta_activoMailMensajeCorreoInven.setText(""+MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoMailMensajeCorreoInven.setToolTipText("Esta Activo");
		this.jLabelesta_activoMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoMailMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoMailMensajeCorreoInven.setToolTipText(MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutMailMensajeCorreoInven = new GridBagLayout();
		this.jPanelesta_activoMailMensajeCorreoInven.setLayout(this.gridaBagLayoutMailMensajeCorreoInven);


		jCheckBoxesta_activoMailMensajeCorreoInven= new JCheckBoxMe();
		jCheckBoxesta_activoMailMensajeCorreoInven.setEnabled(false);

		jCheckBoxesta_activoMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoMailMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonesta_activoMailMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoMailMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoMailMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoMailMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonesta_activoMailMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoMailMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoMailMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoMailMensajeCorreoInvenBusqueda"));

		if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoMailMensajeCorreoInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMailMensajeCorreoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_mensaje_correo_invenMailMensajeCorreoInven = new JLabelMe();
		this.jLabelid_mensaje_correo_invenMailMensajeCorreoInven.setText(""+MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN+" : *");
		this.jLabelid_mensaje_correo_invenMailMensajeCorreoInven.setToolTipText("Mensaje Correo Inven");
		this.jLabelid_mensaje_correo_invenMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_mensaje_correo_invenMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_mensaje_correo_invenMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mensaje_correo_invenMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mensaje_correo_invenMailMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mensaje_correo_invenMailMensajeCorreoInven.setToolTipText(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN);
		this.gridaBagLayoutMailMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_mensaje_correo_invenMailMensajeCorreoInven.setLayout(this.gridaBagLayoutMailMensajeCorreoInven);


		jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInven= new JButtonMe();
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInven.setText("Buscar");
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mensaje_correo_invenMailMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mensaje_correo_invenMailMensajeCorreoInven"));

		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mensaje_correo_invenMailMensajeCorreoInvenBusqueda"));

		if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mensaje_correo_invenMailMensajeCorreoInvenUpdate"));



					
		this.jLabelid_empresaMailMensajeCorreoInven = new JLabelMe();
		this.jLabelid_empresaMailMensajeCorreoInven.setText(""+MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMailMensajeCorreoInven.setToolTipText("Empresa");
		this.jLabelid_empresaMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMailMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMailMensajeCorreoInven.setToolTipText(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMailMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_empresaMailMensajeCorreoInven.setLayout(this.gridaBagLayoutMailMensajeCorreoInven);


		jComboBoxid_empresaMailMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_empresaMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMailMensajeCorreoInven.setEnabled(false);

		this.jButtonid_empresaMailMensajeCorreoInven= new JButtonMe();
		this.jButtonid_empresaMailMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMailMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMailMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMailMensajeCorreoInven.setText("Buscar");
		this.jButtonid_empresaMailMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMailMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMailMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMailMensajeCorreoInven"));

		this.jButtonid_empresaMailMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaMailMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMailMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMailMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMailMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_empresaMailMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMailMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMailMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMailMensajeCorreoInvenBusqueda"));

		if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMailMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaMailMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_empresaMailMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMailMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMailMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMailMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_empresaMailMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMailMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMailMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMailMensajeCorreoInvenUpdate"));



					
		this.jLabelid_sucursalMailMensajeCorreoInven = new JLabelMe();
		this.jLabelid_sucursalMailMensajeCorreoInven.setText(""+MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalMailMensajeCorreoInven.setToolTipText("Sucursal");
		this.jLabelid_sucursalMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalMailMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalMailMensajeCorreoInven.setToolTipText(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutMailMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_sucursalMailMensajeCorreoInven.setLayout(this.gridaBagLayoutMailMensajeCorreoInven);


		jComboBoxid_sucursalMailMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_sucursalMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalMailMensajeCorreoInven.setEnabled(false);

		this.jButtonid_sucursalMailMensajeCorreoInven= new JButtonMe();
		this.jButtonid_sucursalMailMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMailMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMailMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMailMensajeCorreoInven.setText("Buscar");
		this.jButtonid_sucursalMailMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalMailMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMailMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMailMensajeCorreoInven"));

		this.jButtonid_sucursalMailMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_sucursalMailMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMailMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMailMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMailMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_sucursalMailMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalMailMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMailMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMailMensajeCorreoInvenBusqueda"));

		if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalMailMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_sucursalMailMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_sucursalMailMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMailMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMailMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMailMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_sucursalMailMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalMailMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMailMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMailMensajeCorreoInvenUpdate"));



					
		this.jLabelid_moduloMailMensajeCorreoInven = new JLabelMe();
		this.jLabelid_moduloMailMensajeCorreoInven.setText(""+MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloMailMensajeCorreoInven.setToolTipText("Modulo");
		this.jLabelid_moduloMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloMailMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloMailMensajeCorreoInven.setToolTipText(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutMailMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_moduloMailMensajeCorreoInven.setLayout(this.gridaBagLayoutMailMensajeCorreoInven);


		jComboBoxid_moduloMailMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_moduloMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloMailMensajeCorreoInven.setEnabled(false);

		this.jButtonid_moduloMailMensajeCorreoInven= new JButtonMe();
		this.jButtonid_moduloMailMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloMailMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloMailMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloMailMensajeCorreoInven.setText("Buscar");
		this.jButtonid_moduloMailMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloMailMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloMailMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloMailMensajeCorreoInven"));

		this.jButtonid_moduloMailMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_moduloMailMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMailMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMailMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloMailMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_moduloMailMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloMailMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloMailMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloMailMensajeCorreoInvenBusqueda"));

		if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloMailMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_moduloMailMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_moduloMailMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMailMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMailMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloMailMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_moduloMailMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloMailMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloMailMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloMailMensajeCorreoInvenUpdate"));



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
		//this.jInternalFrameDetalleMailMensajeCorreoInven = new MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Mail Mensaje Correo Inven DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMailMensajeCorreoInven= new GridBagLayout();
		

		
		String sToolTipMailMensajeCorreoInven="";
		sToolTipMailMensajeCorreoInven=MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMailMensajeCorreoInven+="(Inventario.MailMensajeCorreoInven)";
		}
		
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipMailMensajeCorreoInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMailMensajeCorreoInven = new JButtonMe();
		this.jButtonModificarMailMensajeCorreoInven = new JButtonMe();
        this.jButtonActualizarMailMensajeCorreoInven = new JButtonMe();
        this.jButtonEliminarMailMensajeCorreoInven = new JButtonMe();
        this.jButtonCancelarMailMensajeCorreoInven = new JButtonMe();
        this.jButtonGuardarCambiosMailMensajeCorreoInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaMailMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarMailMensajeCorreoInven = new JButtonMe();
		
		this.jScrollPanelDatosMailMensajeCorreoInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionMailMensajeCorreoInven = new JScrollPane();
		this.jScrollPanelDatosGeneralMailMensajeCorreoInven = new JScrollPane();
				
		
		
		this.jPanelCamposMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Mail Mensaje Correo Inven";
		
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mail Mensaje Correo Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosMailMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMailMensajeCorreoInven.setName("jPanelCamposMailMensajeCorreoInven"); 

		this.jPanelCamposOcultosMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMailMensajeCorreoInven.setName("jPanelCamposOcultosMailMensajeCorreoInven"); 

        this.jPanelAccionesMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMailMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesMailMensajeCorreoInven.setName("Acciones"); 

		this.jPanelAccionesFormularioMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMailMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMailMensajeCorreoInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMailMensajeCorreoInven.setText("Nuevo");
		this.jButtonModificarMailMensajeCorreoInven.setText("Editar");
        this.jButtonActualizarMailMensajeCorreoInven.setText("Actualizar");
        this.jButtonEliminarMailMensajeCorreoInven.setText("Eliminar");
        this.jButtonCancelarMailMensajeCorreoInven.setText("Cancelar");
        this.jButtonGuardarCambiosMailMensajeCorreoInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.setText("Guardar");
		this.jButtonCerrarMailMensajeCorreoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMailMensajeCorreoInven,"nuevo_button","Nuevo",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMailMensajeCorreoInven,"modificar_button","Editar",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMailMensajeCorreoInven,"actualizar_button","Actualizar",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMailMensajeCorreoInven,"eliminar_button","Eliminar",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMailMensajeCorreoInven,"cancelar_button","Cancelar",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMailMensajeCorreoInven,"guardarcambios_button","Guardar",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMailMensajeCorreoInven,"guardarcambiostabla_button","Guardar",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMailMensajeCorreoInven,"cerrar_button","Salir",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMailMensajeCorreoInven.setToolTipText("Nuevo"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMailMensajeCorreoInven.setToolTipText("Editar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMailMensajeCorreoInven.setToolTipText("Actualizar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMailMensajeCorreoInven.setToolTipText("Eliminar)"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMailMensajeCorreoInven.setToolTipText("Cancelar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMailMensajeCorreoInven.setToolTipText("Guardar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.setToolTipText("Guardar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMailMensajeCorreoInven.setToolTipText("Salir"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMailMensajeCorreoInven";
		inputMap = this.jButtonNuevoMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMailMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMailMensajeCorreoInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMailMensajeCorreoInven";
		inputMap = this.jButtonActualizarMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMailMensajeCorreoInven"));
		
		//ELIMINAR
		sMapKey = "EliminarMailMensajeCorreoInven";
		inputMap = this.jButtonEliminarMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMailMensajeCorreoInven"));
		
		//CANCELAR	
		sMapKey = "CancelarMailMensajeCorreoInven";
		inputMap = this.jButtonCancelarMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMailMensajeCorreoInven"));
		
		//CERRAR		
		sMapKey = "CerrarMailMensajeCorreoInven";
		inputMap = this.jButtonCerrarMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMailMensajeCorreoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMailMensajeCorreoInven";
		inputMap = this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMailMensajeCorreoInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMailMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMailMensajeCorreoInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMailMensajeCorreoInven.setToolTipText("Nuevo MailMensajeCorreoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMailMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMailMensajeCorreoInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMailMensajeCorreoInven.setToolTipText("Sin Cerrar Ventana MailMensajeCorreoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMailMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMailMensajeCorreoInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMailMensajeCorreoInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMailMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMailMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposAccionesMailMensajeCorreoInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMailMensajeCorreoInven = new JLabelMe();
		
		this.jLabelAccionesMailMensajeCorreoInven.setText("Acciones");		
		this.jLabelAccionesMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMailMensajeCorreoInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMailMensajeCorreoInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMailMensajeCorreoInven=new JTabbedPane();
		this.jTabbedPaneRelacionesMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMailMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMailMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMailMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMailMensajeCorreoInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMailMensajeCorreoInven = new GridBagLayout();
		
		this.jPanelCamposMailMensajeCorreoInven.setLayout(gridaBagLayoutCamposMailMensajeCorreoInven);
		this.jPanelCamposOcultosMailMensajeCorreoInven.setLayout(gridaBagLayoutCamposOcultosMailMensajeCorreoInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMailMensajeCorreoInven.add(jLabelIdMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMailMensajeCorreoInven.add(jLabelidMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);


	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mensaje_correo_invenMailMensajeCorreoInven.add(jLabelid_mensaje_correo_invenMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mensaje_correo_invenMailMensajeCorreoInven.add(jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda, this.gridBagConstraintsMailMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mensaje_correo_invenMailMensajeCorreoInven.add(jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate, this.gridBagConstraintsMailMensajeCorreoInven);
	}

	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mensaje_correo_invenMailMensajeCorreoInven.add(jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);


	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMailMensajeCorreoInven.add(jLabelid_empresaMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMailMensajeCorreoInven.add(jButtonid_empresaMailMensajeCorreoInvenBusqueda, this.gridBagConstraintsMailMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMailMensajeCorreoInven.add(jButtonid_empresaMailMensajeCorreoInvenUpdate, this.gridBagConstraintsMailMensajeCorreoInven);
	}

	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMailMensajeCorreoInven.add(jComboBoxid_empresaMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);


	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalMailMensajeCorreoInven.add(jLabelid_sucursalMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMailMensajeCorreoInven.add(jButtonid_sucursalMailMensajeCorreoInvenBusqueda, this.gridBagConstraintsMailMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMailMensajeCorreoInven.add(jButtonid_sucursalMailMensajeCorreoInvenUpdate, this.gridBagConstraintsMailMensajeCorreoInven);
	}

	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalMailMensajeCorreoInven.add(jComboBoxid_sucursalMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);


	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloMailMensajeCorreoInven.add(jLabelid_moduloMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloMailMensajeCorreoInven.add(jButtonid_moduloMailMensajeCorreoInvenBusqueda, this.gridBagConstraintsMailMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloMailMensajeCorreoInven.add(jButtonid_moduloMailMensajeCorreoInvenUpdate, this.gridBagConstraintsMailMensajeCorreoInven);
	}

	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloMailMensajeCorreoInven.add(jComboBoxid_moduloMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);


	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmailMailMensajeCorreoInven.add(jLabelmailMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelmailMailMensajeCorreoInven.add(jButtonmailMailMensajeCorreoInvenBusqueda, this.gridBagConstraintsMailMensajeCorreoInven);
	}

	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmailMailMensajeCorreoInven.add(jscrollPanemailMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);


	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoMailMensajeCorreoInven.add(jLabelesta_activoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoMailMensajeCorreoInven.add(jButtonesta_activoMailMensajeCorreoInvenBusqueda, this.gridBagConstraintsMailMensajeCorreoInven);
	}

	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoMailMensajeCorreoInven.add(jCheckBoxesta_activoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = iYPanelCamposMailMensajeCorreoInven;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = iXPanelCamposMailMensajeCorreoInven++;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMailMensajeCorreoInven.add(this.jPanelidMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(iXPanelCamposMailMensajeCorreoInven % 1==0) {
		iXPanelCamposMailMensajeCorreoInven=0;
		iYPanelCamposMailMensajeCorreoInven++;
	}
	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = iYPanelCamposMailMensajeCorreoInven;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = iXPanelCamposMailMensajeCorreoInven++;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMailMensajeCorreoInven.add(this.jPanelid_mensaje_correo_invenMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(iXPanelCamposMailMensajeCorreoInven % 1==0) {
		iXPanelCamposMailMensajeCorreoInven=0;
		iYPanelCamposMailMensajeCorreoInven++;
	}
	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = iYPanelCamposMailMensajeCorreoInven;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = iXPanelCamposMailMensajeCorreoInven++;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMailMensajeCorreoInven.add(this.jPanelmailMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(iXPanelCamposMailMensajeCorreoInven % 1==0) {
		iXPanelCamposMailMensajeCorreoInven=0;
		iYPanelCamposMailMensajeCorreoInven++;
	}
	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = iYPanelCamposMailMensajeCorreoInven;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = iXPanelCamposMailMensajeCorreoInven++;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMailMensajeCorreoInven.add(this.jPanelesta_activoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(iXPanelCamposMailMensajeCorreoInven % 1==0) {
		iXPanelCamposMailMensajeCorreoInven=0;
		iYPanelCamposMailMensajeCorreoInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = iYPanelCamposOcultosMailMensajeCorreoInven;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = iXPanelCamposOcultosMailMensajeCorreoInven++;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMailMensajeCorreoInven.add(this.jPanelid_empresaMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(iXPanelCamposOcultosMailMensajeCorreoInven % 1==0) {
		iXPanelCamposOcultosMailMensajeCorreoInven=0;
		iYPanelCamposOcultosMailMensajeCorreoInven++;
	}
	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = iYPanelCamposOcultosMailMensajeCorreoInven;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = iXPanelCamposOcultosMailMensajeCorreoInven++;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMailMensajeCorreoInven.add(this.jPanelid_sucursalMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(iXPanelCamposOcultosMailMensajeCorreoInven % 1==0) {
		iXPanelCamposOcultosMailMensajeCorreoInven=0;
		iYPanelCamposOcultosMailMensajeCorreoInven++;
	}
	this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMailMensajeCorreoInven.gridy = iYPanelCamposOcultosMailMensajeCorreoInven;
	this.gridBagConstraintsMailMensajeCorreoInven.gridx = iXPanelCamposOcultosMailMensajeCorreoInven++;
	this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMailMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMailMensajeCorreoInven.add(this.jPanelid_moduloMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);



	if(iXPanelCamposOcultosMailMensajeCorreoInven % 1==0) {
		iXPanelCamposOcultosMailMensajeCorreoInven=0;
		iYPanelCamposOcultosMailMensajeCorreoInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesMailMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesMailMensajeCorreoInven.setLayout(gridaBagLayoutAccionesMailMensajeCorreoInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMailMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesFormularioMailMensajeCorreoInven.setLayout(gridaBagLayoutAccionesFormularioMailMensajeCorreoInven);
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMailMensajeCorreoInven.add(this.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMailMensajeCorreoInven.add(this.jCheckBoxPostAccionNuevoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMailMensajeCorreoInven.add(this.jCheckBoxPostAccionSinCerrarMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMailMensajeCorreoInven.add(this.jCheckBoxPostAccionSinMensajeMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesMailMensajeCorreoInven.add(this.jButtonModificarMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);							

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesMailMensajeCorreoInven.add(this.jButtonEliminarMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		
			
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesMailMensajeCorreoInven.add(this.jButtonActualizarMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);


		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesMailMensajeCorreoInven.add(this.jButtonGuardarCambiosMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);	
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesMailMensajeCorreoInven.add(this.jButtonCancelarMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMailMensajeCorreoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMailMensajeCorreoInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();						
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;		
			//this.gridBagConstraintsMailMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx =0;
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMailMensajeCorreoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MailMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMailMensajeCorreoInven = new MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Mail Mensaje Correo Inven DATOS");
			
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
			
	        //this.setTitle("[FOR] - Mail Mensaje Correo Inven DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mail Mensaje Correo Inven Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MailMensajeCorreoInvenModel mailmensajecorreoinvenModel=new MailMensajeCorreoInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//MailMensajeCorreoInvenModel.MailMensajeCorreoInvenFocusTraversalPolicy mailmensajecorreoinvenFocusTraversalPolicy = mailmensajecorreoinvenModel.new MailMensajeCorreoInvenFocusTraversalPolicy(this);
			
			//mailmensajecorreoinvenFocusTraversalPolicy.setmailmensajecorreoinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(mailmensajecorreoinvenModel);
			
			
			this.jContentPaneDetalleMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMailMensajeCorreoInven = new GridBagLayout();	
			this.jContentPaneDetalleMailMensajeCorreoInven.setLayout(gridaBagLayoutDetalleMailMensajeCorreoInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMailMensajeCorreoInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
					
				
				this.jContentPaneDetalleMailMensajeCorreoInven.add(jTtoolBarDetalleMailMensajeCorreoInven, gridBagConstraintsMailMensajeCorreoInven);								
				
}
			
			this.jScrollPanelDatosEdicionMailMensajeCorreoInven=   new JScrollPane(jContentPaneDetalleMailMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMailMensajeCorreoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
	        
			this.jContentPaneDetalleMailMensajeCorreoInven.add(jPanelCamposMailMensajeCorreoInven, gridBagConstraintsMailMensajeCorreoInven);
			
			
			
			
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
						&& mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMailMensajeCorreoInven= new GridBagConstraints();
						this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
						this.jContentPaneDetalleMailMensajeCorreoInven.add(this.jTabbedPaneRelacionesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMailMensajeCorreoInven.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMailMensajeCorreoInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
					this.gridBagConstraintsMailMensajeCorreoInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
					
				
					this.jContentPaneDetalleMailMensajeCorreoInven.add(jPanelCamposOcultosMailMensajeCorreoInven, gridBagConstraintsMailMensajeCorreoInven);
				
					this.jPanelCamposOcultosMailMensajeCorreoInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
	        this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMailMensajeCorreoInven.add(this.jPanelAccionesFormularioMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);							
			
			
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
	        this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
	        
			
			this.jContentPaneDetalleMailMensajeCorreoInven.add(this.jPanelAccionesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMailMensajeCorreoInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMailMensajeCorreoInven=   new JScrollPane(this.jPanelCamposMailMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMailMensajeCorreoInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);			
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			
			
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		
			
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMailMensajeCorreoInven;//jContentPane;
		
		return jScrollPanelDatosEdicionMailMensajeCorreoInven;
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
