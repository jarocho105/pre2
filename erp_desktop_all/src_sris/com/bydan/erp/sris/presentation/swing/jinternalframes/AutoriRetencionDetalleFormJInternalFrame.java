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

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.sris.util.AutoriRetencionConstantesFunciones;

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
public class AutoriRetencionDetalleFormJInternalFrame extends AutoriRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAutoriRetencion;
	
	protected JMenuBar jmenuBarDetalleAutoriRetencion;
	
	protected JMenu jmenuDetalleAutoriRetencion;
	protected JMenu jmenuDetalleArchivoAutoriRetencion;
	protected JMenu jmenuDetalleAccionesAutoriRetencion;
	protected JMenu jmenuDetalleDatosAutoriRetencion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutoriRetencion;	
	protected GridBagConstraints gridBagConstraintsAutoriRetencion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AutoriRetencionBeanSwingJInternalFrameAdditional jInternalFrameDetalleAutoriRetencion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public AutoriRetencionSessionBean autoriretencionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;	
	
	public AutoriRetencionLogic autoriretencionLogic;
	
	public JScrollPane jScrollPanelDatosAutoriRetencion;
	public JScrollPane jScrollPanelDatosEdicionAutoriRetencion;
	public JScrollPane jScrollPanelDatosGeneralAutoriRetencion;
	
	protected JPanel jPanelCamposAutoriRetencion;    
	protected JPanel jPanelCamposOcultosAutoriRetencion;    	
	protected JPanel jPanelAccionesAutoriRetencion;
	protected JPanel jPanelAccionesFormularioAutoriRetencion;
    
	
	
	protected Integer iXPanelCamposAutoriRetencion=0;
	protected Integer iYPanelCamposAutoriRetencion=0;
	
	protected Integer iXPanelCamposOcultosAutoriRetencion=0;
	protected Integer iYPanelCamposOcultosAutoriRetencion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAutoriRetencion;
	public JButton jButtonModificarAutoriRetencion;
	public JButton jButtonActualizarAutoriRetencion;
    public JButton jButtonEliminarAutoriRetencion;
	public JButton jButtonCancelarAutoriRetencion;
    public JButton jButtonGuardarCambiosAutoriRetencion;
	public JButton jButtonGuardarCambiosTablaAutoriRetencion;
	protected JButton jButtonCerrarAutoriRetencion;
	
	
	protected JButton jButtonProcesarInformacionAutoriRetencion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAutoriRetencion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAutoriRetencion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAutoriRetencion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutoriRetencion;
	protected JButton jButtonModificarToolBarAutoriRetencion;
	protected JButton jButtonActualizarToolBarAutoriRetencion;
    protected JButton jButtonEliminarToolBarAutoriRetencion;
	protected JButton jButtonCancelarToolBarAutoriRetencion;
    protected JButton jButtonGuardarCambiosToolBarAutoriRetencion;
	protected JButton jButtonGuardarCambiosTablaToolBarAutoriRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarAutoriRetencion;
	protected JButton jButtonCerrarToolBarAutoriRetencion;
	
	protected JButton jButtonProcesarInformacionToolBarAutoriRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutoriRetencion;
	protected JMenuItem jMenuItemModificarAutoriRetencion;
	protected JMenuItem jMenuItemActualizarAutoriRetencion;
    protected JMenuItem jMenuItemEliminarAutoriRetencion;
	protected JMenuItem jMenuItemCancelarAutoriRetencion;
    protected JMenuItem jMenuItemGuardarCambiosAutoriRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutoriRetencion;
	protected JMenuItem jMenuItemCerrarAutoriRetencion;
	protected JMenuItem jMenuItemDetalleCerrarAutoriRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutoriRetencion;
	
	protected JMenuItem jMenuItemProcesarInformacionAutoriRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutoriRetencion;
	protected JMenuItem jMenuItemMostrarOcultarAutoriRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutoriRetencion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutoriRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutoriRetencion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAutoriRetencion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAutoriRetencion;
	public JLabel jLabelIdAutoriRetencion;
	public JLabel jLabelidAutoriRetencion;
	public JButton jButtonidAutoriRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serieAutoriRetencion;
	public JLabel jLabelnumero_serieAutoriRetencion;
	public JTextField jTextFieldnumero_serieAutoriRetencion;
	public JButton jButtonnumero_serieAutoriRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacionAutoriRetencion;
	public JLabel jLabelnumero_autorizacionAutoriRetencion;
	public JTextField jTextFieldnumero_autorizacionAutoriRetencion;
	public JButton jButtonnumero_autorizacionAutoriRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_inicialAutoriRetencion;
	public JLabel jLabelnumero_inicialAutoriRetencion;
	public JTextField jTextFieldnumero_inicialAutoriRetencion;
	public JButton jButtonnumero_inicialAutoriRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_finalAutoriRetencion;
	public JLabel jLabelnumero_finalAutoriRetencion;
	public JTextField jTextFieldnumero_finalAutoriRetencion;
	public JButton jButtonnumero_finalAutoriRetencionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caducidadAutoriRetencion;
	public JLabel jLabelfecha_caducidadAutoriRetencion;
	//public JFormattedTextField jDateChooserfecha_caducidadAutoriRetencion;

	public JDateChooser jDateChooserfecha_caducidadAutoriRetencion;
	public JButton jButtonfecha_caducidadAutoriRetencionBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoAutoriRetencion;
	public JLabel jLabelesta_activoAutoriRetencion;
	public JCheckBox jCheckBoxesta_activoAutoriRetencion;
	public JButton jButtonesta_activoAutoriRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAutoriRetencion;
	public JLabel jLabelid_empresaAutoriRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAutoriRetencion;
	public JButton jButtonid_empresaAutoriRetencion= new JButtonMe();
	public JButton jButtonid_empresaAutoriRetencionUpdate= new JButtonMe();
	public JButton jButtonid_empresaAutoriRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalAutoriRetencion;
	public JLabel jLabelid_sucursalAutoriRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalAutoriRetencion;
	public JButton jButtonid_sucursalAutoriRetencion= new JButtonMe();
	public JButton jButtonid_sucursalAutoriRetencionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalAutoriRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioAutoriRetencion;
	public JLabel jLabelid_usuarioAutoriRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioAutoriRetencion;
	public JButton jButtonid_usuarioAutoriRetencion= new JButtonMe();
	public JButton jButtonid_usuarioAutoriRetencionUpdate= new JButtonMe();
	public JButton jButtonid_usuarioAutoriRetencionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAutoriRetencion;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AutoriRetencionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAutoriRetencion=new JPanel();
				this.jPanelAccionesFormularioAutoriRetencion=new JPanel();
				this.jmenuBarDetalleAutoriRetencion=new JMenuBar();
				this.jTtoolBarDetalleAutoriRetencion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriRetencionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AutoriRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AutoriRetencionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AutoriRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriRetencionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriRetencionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriRetencionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutoriRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAutoriRetencion() {
		return this.jButtonActualizarToolBarAutoriRetencion;
	}
	
	public JButton getjButtonEliminarToolBarAutoriRetencion() {
		return this.jButtonEliminarToolBarAutoriRetencion;
	}
	
	public JButton getjButtonCancelarToolBarAutoriRetencion() {
		return this.jButtonCancelarToolBarAutoriRetencion;
	}		
	
	public JButton getjButtonProcesarInformacionAutoriRetencion() {
		return this.jButtonProcesarInformacionAutoriRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutoriRetencion)	{
		this.jButtonProcesarInformacionAutoriRetencion = jButtonProcesarInformacionAutoriRetencion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutoriRetencion() {
		return this.jComboBoxTiposAccionesAutoriRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutoriRetencion(
			JComboBox jComboBoxTiposRelacionesAutoriRetencion) {
		this.jComboBoxTiposRelacionesAutoriRetencion = jComboBoxTiposRelacionesAutoriRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutoriRetencion(
			JComboBox jComboBoxTiposAccionesAutoriRetencion) {
		this.jComboBoxTiposAccionesAutoriRetencion = jComboBoxTiposAccionesAutoriRetencion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAutoriRetencion() {
		return this.jComboBoxTiposAccionesFormularioAutoriRetencion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAutoriRetencion(
			JComboBox jComboBoxTiposAccionesFormularioAutoriRetencion) {
		this.jComboBoxTiposAccionesFormularioAutoriRetencion = jComboBoxTiposAccionesFormularioAutoriRetencion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
		
		this.autoriretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autoriretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autoriretencionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutoriRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutoriRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutoriRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autori Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
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
	
		AutoriRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAutoriRetencion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAutoriRetencion=new JButtonMe();
				this.jButtonModificarToolBarAutoriRetencion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAutoriRetencion,this.jTtoolBarDetalleAutoriRetencion,
							"actualizar","actualizar","Actualizar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAutoriRetencion,this.jTtoolBarDetalleAutoriRetencion,
							"eliminar","eliminar","Eliminar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAutoriRetencion,this.jTtoolBarDetalleAutoriRetencion,
							"cancelar","cancelar","Cancelar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAutoriRetencion,this.jTtoolBarDetalleAutoriRetencion,
							"guardarcambios","guardarcambios","Guardar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAutoriRetencion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAutoriRetencion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAutoriRetencion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAutoriRetencion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAutoriRetencion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutoriRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutoriRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutoriRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAutoriRetencion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAutoriRetencion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAutoriRetencion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAutoriRetencion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAutoriRetencion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAutoriRetencion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAutoriRetencion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAutoriRetencion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAutoriRetencion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAutoriRetencion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAutoriRetencion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAutoriRetencion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAutoriRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutoriRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutoriRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutoriRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutoriRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutoriRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAutoriRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAutoriRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAutoriRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutoriRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutoriRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutoriRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutoriRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutoriRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutoriRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAutoriRetencion.add(this.jMenuItemDetalleCerrarAutoriRetencion);
		
		this.jmenuDetalleAccionesAutoriRetencion.add(this.jMenuItemActualizarAutoriRetencion);
		this.jmenuDetalleAccionesAutoriRetencion.add(this.jMenuItemEliminarAutoriRetencion);
		this.jmenuDetalleAccionesAutoriRetencion.add(this.jMenuItemCancelarAutoriRetencion);		
		
		//this.jmenuDetalleDatosAutoriRetencion.add(this.jMenuItemDetalleAbrirOrderByAutoriRetencion);				
		this.jmenuDetalleDatosAutoriRetencion.add(this.jMenuItemDetalleMostarOcultarAutoriRetencion);				
				
		//this.jmenuDetalleAccionesAutoriRetencion.add(this.jMenuItemGuardarCambiosAutoriRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAutoriRetencion.add(this.jmenuDetalleArchivoAutoriRetencion);		
		this.jmenuBarDetalleAutoriRetencion.add(this.jmenuDetalleAccionesAutoriRetencion);		
		this.jmenuBarDetalleAutoriRetencion.add(this.jmenuDetalleDatosAutoriRetencion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAutoriRetencion);				
	}
	
	
	public void inicializarElementosCamposAutoriRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAutoriRetencion = new JLabelMe();
		jLabelIdAutoriRetencion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAutoriRetencion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAutoriRetencion.setToolTipText(AutoriRetencionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAutoriRetencion= new GridBagLayout();

		this.jPanelidAutoriRetencion.setLayout(this.gridaBagLayoutAutoriRetencion);

		jLabelidAutoriRetencion = new JLabel();
		jLabelidAutoriRetencion.setText("Id");

		jLabelidAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_serieAutoriRetencion = new JLabelMe();
		this.jLabelnumero_serieAutoriRetencion.setText(""+AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE+" : *");
		this.jLabelnumero_serieAutoriRetencion.setToolTipText("Numero Serie");
		this.jLabelnumero_serieAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serieAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serieAutoriRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serieAutoriRetencion.setToolTipText(AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE);
		this.gridaBagLayoutAutoriRetencion = new GridBagLayout();
		this.jPanelnumero_serieAutoriRetencion.setLayout(this.gridaBagLayoutAutoriRetencion);


		jTextFieldnumero_serieAutoriRetencion= new JTextFieldMe();

		jTextFieldnumero_serieAutoriRetencion.setEnabled(false);
		jTextFieldnumero_serieAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serieAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_serieAutoriRetencionBusqueda= new JButtonMe();
		this.jButtonnumero_serieAutoriRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieAutoriRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieAutoriRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serieAutoriRetencionBusqueda.setText("U");
		this.jButtonnumero_serieAutoriRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serieAutoriRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serieAutoriRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serieAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serieAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serieAutoriRetencionBusqueda"));

		if(this.autoriretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serieAutoriRetencionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacionAutoriRetencion = new JLabelMe();
		this.jLabelnumero_autorizacionAutoriRetencion.setText(""+AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION+" : *");
		this.jLabelnumero_autorizacionAutoriRetencion.setToolTipText("Numero Autorizacion");
		this.jLabelnumero_autorizacionAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacionAutoriRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacionAutoriRetencion.setToolTipText(AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutAutoriRetencion = new GridBagLayout();
		this.jPanelnumero_autorizacionAutoriRetencion.setLayout(this.gridaBagLayoutAutoriRetencion);


		jTextFieldnumero_autorizacionAutoriRetencion= new JTextFieldMe();

		jTextFieldnumero_autorizacionAutoriRetencion.setEnabled(false);
		jTextFieldnumero_autorizacionAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacionAutoriRetencionBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacionAutoriRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionAutoriRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionAutoriRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacionAutoriRetencionBusqueda.setText("U");
		this.jButtonnumero_autorizacionAutoriRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacionAutoriRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacionAutoriRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacionAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacionAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacionAutoriRetencionBusqueda"));

		if(this.autoriretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacionAutoriRetencionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_inicialAutoriRetencion = new JLabelMe();
		this.jLabelnumero_inicialAutoriRetencion.setText(""+AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL+" :");
		this.jLabelnumero_inicialAutoriRetencion.setToolTipText("Numero Inicial");
		this.jLabelnumero_inicialAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_inicialAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_inicialAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_inicialAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_inicialAutoriRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_inicialAutoriRetencion.setToolTipText(AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL);
		this.gridaBagLayoutAutoriRetencion = new GridBagLayout();
		this.jPanelnumero_inicialAutoriRetencion.setLayout(this.gridaBagLayoutAutoriRetencion);


		jTextFieldnumero_inicialAutoriRetencion= new JTextFieldMe();

		jTextFieldnumero_inicialAutoriRetencion.setEnabled(false);
		jTextFieldnumero_inicialAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_inicialAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_inicialAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_inicialAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_inicialAutoriRetencionBusqueda= new JButtonMe();
		this.jButtonnumero_inicialAutoriRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_inicialAutoriRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_inicialAutoriRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_inicialAutoriRetencionBusqueda.setText("U");
		this.jButtonnumero_inicialAutoriRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_inicialAutoriRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_inicialAutoriRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_inicialAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_inicialAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_inicialAutoriRetencionBusqueda"));

		if(this.autoriretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_inicialAutoriRetencionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_finalAutoriRetencion = new JLabelMe();
		this.jLabelnumero_finalAutoriRetencion.setText(""+AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL+" :");
		this.jLabelnumero_finalAutoriRetencion.setToolTipText("Numero Final");
		this.jLabelnumero_finalAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_finalAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_finalAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_finalAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_finalAutoriRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_finalAutoriRetencion.setToolTipText(AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL);
		this.gridaBagLayoutAutoriRetencion = new GridBagLayout();
		this.jPanelnumero_finalAutoriRetencion.setLayout(this.gridaBagLayoutAutoriRetencion);


		jTextFieldnumero_finalAutoriRetencion= new JTextFieldMe();

		jTextFieldnumero_finalAutoriRetencion.setEnabled(false);
		jTextFieldnumero_finalAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_finalAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_finalAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_finalAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_finalAutoriRetencionBusqueda= new JButtonMe();
		this.jButtonnumero_finalAutoriRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_finalAutoriRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_finalAutoriRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_finalAutoriRetencionBusqueda.setText("U");
		this.jButtonnumero_finalAutoriRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_finalAutoriRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_finalAutoriRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_finalAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_finalAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_finalAutoriRetencionBusqueda"));

		if(this.autoriretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_finalAutoriRetencionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caducidadAutoriRetencion = new JLabelMe();
		this.jLabelfecha_caducidadAutoriRetencion.setText(""+AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD+" : *");
		this.jLabelfecha_caducidadAutoriRetencion.setToolTipText("Fecha Caducad");
		this.jLabelfecha_caducidadAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caducidadAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caducidadAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caducidadAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caducidadAutoriRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caducidadAutoriRetencion.setToolTipText(AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD);
		this.gridaBagLayoutAutoriRetencion = new GridBagLayout();
		this.jPanelfecha_caducidadAutoriRetencion.setLayout(this.gridaBagLayoutAutoriRetencion);


		//jFormattedTextFieldfecha_caducidadAutoriRetencion= new JFormattedTextFieldMe();

		jDateChooserfecha_caducidadAutoriRetencion= new JDateChooser();
		jDateChooserfecha_caducidadAutoriRetencion.setEnabled(false);
		jDateChooserfecha_caducidadAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidadAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidadAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caducidadAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caducidadAutoriRetencion.setDate(new Date());
		jDateChooserfecha_caducidadAutoriRetencion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caducidadAutoriRetencion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caducidadAutoriRetencionBusqueda= new JButtonMe();
		this.jButtonfecha_caducidadAutoriRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidadAutoriRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidadAutoriRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caducidadAutoriRetencionBusqueda.setText("U");
		this.jButtonfecha_caducidadAutoriRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caducidadAutoriRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caducidadAutoriRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caducidadAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caducidadAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caducidadAutoriRetencionBusqueda"));

		if(this.autoriretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caducidadAutoriRetencionBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoAutoriRetencion = new JLabelMe();
		this.jLabelesta_activoAutoriRetencion.setText(""+AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoAutoriRetencion.setToolTipText("Esta Activo");
		this.jLabelesta_activoAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoAutoriRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoAutoriRetencion.setToolTipText(AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutAutoriRetencion = new GridBagLayout();
		this.jPanelesta_activoAutoriRetencion.setLayout(this.gridaBagLayoutAutoriRetencion);


		jCheckBoxesta_activoAutoriRetencion= new JCheckBoxMe();
		jCheckBoxesta_activoAutoriRetencion.setEnabled(false);

		jCheckBoxesta_activoAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoAutoriRetencionBusqueda= new JButtonMe();
		this.jButtonesta_activoAutoriRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoAutoriRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoAutoriRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoAutoriRetencionBusqueda.setText("U");
		this.jButtonesta_activoAutoriRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoAutoriRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoAutoriRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoAutoriRetencionBusqueda"));

		if(this.autoriretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoAutoriRetencionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAutoriRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAutoriRetencion = new JLabelMe();
		this.jLabelid_empresaAutoriRetencion.setText(""+AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAutoriRetencion.setToolTipText("Empresa");
		this.jLabelid_empresaAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAutoriRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAutoriRetencion.setToolTipText(AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAutoriRetencion = new GridBagLayout();
		this.jPanelid_empresaAutoriRetencion.setLayout(this.gridaBagLayoutAutoriRetencion);


		jComboBoxid_empresaAutoriRetencion= new JComboBoxMe();
		jComboBoxid_empresaAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAutoriRetencion.setEnabled(false);

		this.jButtonid_empresaAutoriRetencion= new JButtonMe();
		this.jButtonid_empresaAutoriRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriRetencion.setText("Buscar");
		this.jButtonid_empresaAutoriRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAutoriRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriRetencion"));

		this.jButtonid_empresaAutoriRetencionBusqueda= new JButtonMe();
		this.jButtonid_empresaAutoriRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutoriRetencionBusqueda.setText("U");
		this.jButtonid_empresaAutoriRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAutoriRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriRetencionBusqueda"));

		if(this.autoriretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAutoriRetencionBusqueda.setVisible(false);		}

		this.jButtonid_empresaAutoriRetencionUpdate= new JButtonMe();
		this.jButtonid_empresaAutoriRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutoriRetencionUpdate.setText("U");
		this.jButtonid_empresaAutoriRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAutoriRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriRetencionUpdate"));



					
		this.jLabelid_sucursalAutoriRetencion = new JLabelMe();
		this.jLabelid_sucursalAutoriRetencion.setText(""+AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalAutoriRetencion.setToolTipText("Sucursal");
		this.jLabelid_sucursalAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalAutoriRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalAutoriRetencion.setToolTipText(AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutAutoriRetencion = new GridBagLayout();
		this.jPanelid_sucursalAutoriRetencion.setLayout(this.gridaBagLayoutAutoriRetencion);


		jComboBoxid_sucursalAutoriRetencion= new JComboBoxMe();
		jComboBoxid_sucursalAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalAutoriRetencion.setEnabled(false);

		this.jButtonid_sucursalAutoriRetencion= new JButtonMe();
		this.jButtonid_sucursalAutoriRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriRetencion.setText("Buscar");
		this.jButtonid_sucursalAutoriRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalAutoriRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriRetencion"));

		this.jButtonid_sucursalAutoriRetencionBusqueda= new JButtonMe();
		this.jButtonid_sucursalAutoriRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAutoriRetencionBusqueda.setText("U");
		this.jButtonid_sucursalAutoriRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalAutoriRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriRetencionBusqueda"));

		if(this.autoriretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalAutoriRetencionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalAutoriRetencionUpdate= new JButtonMe();
		this.jButtonid_sucursalAutoriRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAutoriRetencionUpdate.setText("U");
		this.jButtonid_sucursalAutoriRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalAutoriRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriRetencionUpdate"));



					
		this.jLabelid_usuarioAutoriRetencion = new JLabelMe();
		this.jLabelid_usuarioAutoriRetencion.setText(""+AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioAutoriRetencion.setToolTipText("Usuario");
		this.jLabelid_usuarioAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioAutoriRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioAutoriRetencion.setToolTipText(AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutAutoriRetencion = new GridBagLayout();
		this.jPanelid_usuarioAutoriRetencion.setLayout(this.gridaBagLayoutAutoriRetencion);


		jComboBoxid_usuarioAutoriRetencion= new JComboBoxMe();
		jComboBoxid_usuarioAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioAutoriRetencion.setEnabled(false);

		this.jButtonid_usuarioAutoriRetencion= new JButtonMe();
		this.jButtonid_usuarioAutoriRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAutoriRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAutoriRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAutoriRetencion.setText("Buscar");
		this.jButtonid_usuarioAutoriRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioAutoriRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAutoriRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAutoriRetencion"));

		this.jButtonid_usuarioAutoriRetencionBusqueda= new JButtonMe();
		this.jButtonid_usuarioAutoriRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAutoriRetencionBusqueda.setText("U");
		this.jButtonid_usuarioAutoriRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioAutoriRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAutoriRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAutoriRetencionBusqueda"));

		if(this.autoriretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioAutoriRetencionBusqueda.setVisible(false);		}

		this.jButtonid_usuarioAutoriRetencionUpdate= new JButtonMe();
		this.jButtonid_usuarioAutoriRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAutoriRetencionUpdate.setText("U");
		this.jButtonid_usuarioAutoriRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioAutoriRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAutoriRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAutoriRetencionUpdate"));



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
		//this.jInternalFrameDetalleAutoriRetencion = new AutoriRetencionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Autori Retencion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutoriRetencion= new GridBagLayout();
		

		
		String sToolTipAutoriRetencion="";
		sToolTipAutoriRetencion=AutoriRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutoriRetencion+="(Sris.AutoriRetencion)";
		}
		
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutoriRetencion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAutoriRetencion = new JButtonMe();
		this.jButtonModificarAutoriRetencion = new JButtonMe();
        this.jButtonActualizarAutoriRetencion = new JButtonMe();
        this.jButtonEliminarAutoriRetencion = new JButtonMe();
        this.jButtonCancelarAutoriRetencion = new JButtonMe();
        this.jButtonGuardarCambiosAutoriRetencion = new JButtonMe();
		this.jButtonGuardarCambiosTablaAutoriRetencion = new JButtonMe();
		this.jButtonCerrarAutoriRetencion = new JButtonMe();
		
		this.jScrollPanelDatosAutoriRetencion = new JScrollPane();   
        this.jScrollPanelDatosEdicionAutoriRetencion = new JScrollPane();
		this.jScrollPanelDatosGeneralAutoriRetencion = new JScrollPane();
				
		
		
		this.jPanelCamposAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Autori Retencion";
		
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosAutoriRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAutoriRetencion.setName("jPanelCamposAutoriRetencion"); 

		this.jPanelCamposOcultosAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAutoriRetencion.setName("jPanelCamposOcultosAutoriRetencion"); 

        this.jPanelAccionesAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutoriRetencion.setToolTipText("Acciones");
        this.jPanelAccionesAutoriRetencion.setName("Acciones"); 

		this.jPanelAccionesFormularioAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAutoriRetencion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAutoriRetencion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAutoriRetencion.setText("Nuevo");
		this.jButtonModificarAutoriRetencion.setText("Editar");
        this.jButtonActualizarAutoriRetencion.setText("Actualizar");
        this.jButtonEliminarAutoriRetencion.setText("Eliminar");
        this.jButtonCancelarAutoriRetencion.setText("Cancelar");
        this.jButtonGuardarCambiosAutoriRetencion.setText("Guardar");
		this.jButtonGuardarCambiosTablaAutoriRetencion.setText("Guardar");
		this.jButtonCerrarAutoriRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutoriRetencion,"nuevo_button","Nuevo",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAutoriRetencion,"modificar_button","Editar",this.autoriretencionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAutoriRetencion,"actualizar_button","Actualizar",this.autoriretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAutoriRetencion,"eliminar_button","Eliminar",this.autoriretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAutoriRetencion,"cancelar_button","Cancelar",this.autoriretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAutoriRetencion,"guardarcambios_button","Guardar",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutoriRetencion,"guardarcambiostabla_button","Guardar",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutoriRetencion,"cerrar_button","Salir",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAutoriRetencion.setToolTipText("Nuevo"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAutoriRetencion.setToolTipText("Editar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAutoriRetencion.setToolTipText("Actualizar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAutoriRetencion.setToolTipText("Eliminar)"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAutoriRetencion.setToolTipText("Cancelar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAutoriRetencion.setToolTipText("Guardar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAutoriRetencion.setToolTipText("Guardar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutoriRetencion.setToolTipText("Salir"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutoriRetencion";
		inputMap = this.jButtonNuevoAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutoriRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutoriRetencion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAutoriRetencion";
		inputMap = this.jButtonActualizarAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAutoriRetencion"));
		
		//ELIMINAR
		sMapKey = "EliminarAutoriRetencion";
		inputMap = this.jButtonEliminarAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAutoriRetencion"));
		
		//CANCELAR	
		sMapKey = "CancelarAutoriRetencion";
		inputMap = this.jButtonCancelarAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAutoriRetencion"));
		
		//CERRAR		
		sMapKey = "CerrarAutoriRetencion";
		inputMap = this.jButtonCerrarAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutoriRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutoriRetencion";
		inputMap = this.jButtonGuardarCambiosTablaAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutoriRetencion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAutoriRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAutoriRetencion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAutoriRetencion.setToolTipText("Nuevo AutoriRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAutoriRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAutoriRetencion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAutoriRetencion.setToolTipText("Sin Cerrar Ventana AutoriRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAutoriRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAutoriRetencion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAutoriRetencion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAutoriRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutoriRetencion.setText("Accion");
		this.jComboBoxTiposAccionesAutoriRetencion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAutoriRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAutoriRetencion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAutoriRetencion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAutoriRetencion = new JLabelMe();
		
		this.jLabelAccionesAutoriRetencion.setText("Acciones");		
		this.jLabelAccionesAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAutoriRetencion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAutoriRetencion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAutoriRetencion=new JTabbedPane();
		this.jTabbedPaneRelacionesAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAutoriRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAutoriRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAutoriRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutoriRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutoriRetencion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAutoriRetencion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAutoriRetencion = new GridBagLayout();
		
		this.jPanelCamposAutoriRetencion.setLayout(gridaBagLayoutCamposAutoriRetencion);
		this.jPanelCamposOcultosAutoriRetencion.setLayout(gridaBagLayoutCamposOcultosAutoriRetencion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 0;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAutoriRetencion.add(jLabelIdAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 1;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAutoriRetencion.add(jLabelidAutoriRetencion, this.gridBagConstraintsAutoriRetencion);


	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 0;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAutoriRetencion.add(jLabelid_empresaAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 2;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutoriRetencion.add(jButtonid_empresaAutoriRetencionBusqueda, this.gridBagConstraintsAutoriRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 3;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutoriRetencion.add(jButtonid_empresaAutoriRetencionUpdate, this.gridBagConstraintsAutoriRetencion);
	}

	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 1;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAutoriRetencion.add(jComboBoxid_empresaAutoriRetencion, this.gridBagConstraintsAutoriRetencion);


	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 0;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalAutoriRetencion.add(jLabelid_sucursalAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 2;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAutoriRetencion.add(jButtonid_sucursalAutoriRetencionBusqueda, this.gridBagConstraintsAutoriRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 3;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAutoriRetencion.add(jButtonid_sucursalAutoriRetencionUpdate, this.gridBagConstraintsAutoriRetencion);
	}

	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 1;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalAutoriRetencion.add(jComboBoxid_sucursalAutoriRetencion, this.gridBagConstraintsAutoriRetencion);


	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 0;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioAutoriRetencion.add(jLabelid_usuarioAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 2;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAutoriRetencion.add(jButtonid_usuarioAutoriRetencionBusqueda, this.gridBagConstraintsAutoriRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 3;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAutoriRetencion.add(jButtonid_usuarioAutoriRetencionUpdate, this.gridBagConstraintsAutoriRetencion);
	}

	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 1;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioAutoriRetencion.add(jComboBoxid_usuarioAutoriRetencion, this.gridBagConstraintsAutoriRetencion);


	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 0;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_serieAutoriRetencion.add(jLabelnumero_serieAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 2;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serieAutoriRetencion.add(jButtonnumero_serieAutoriRetencionBusqueda, this.gridBagConstraintsAutoriRetencion);
	}

	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 1;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_serieAutoriRetencion.add(jTextFieldnumero_serieAutoriRetencion, this.gridBagConstraintsAutoriRetencion);


	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 0;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_autorizacionAutoriRetencion.add(jLabelnumero_autorizacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 2;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacionAutoriRetencion.add(jButtonnumero_autorizacionAutoriRetencionBusqueda, this.gridBagConstraintsAutoriRetencion);
	}

	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 1;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_autorizacionAutoriRetencion.add(jTextFieldnumero_autorizacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);


	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 0;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_inicialAutoriRetencion.add(jLabelnumero_inicialAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 2;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_inicialAutoriRetencion.add(jButtonnumero_inicialAutoriRetencionBusqueda, this.gridBagConstraintsAutoriRetencion);
	}

	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 1;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_inicialAutoriRetencion.add(jTextFieldnumero_inicialAutoriRetencion, this.gridBagConstraintsAutoriRetencion);


	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 0;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_finalAutoriRetencion.add(jLabelnumero_finalAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 2;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_finalAutoriRetencion.add(jButtonnumero_finalAutoriRetencionBusqueda, this.gridBagConstraintsAutoriRetencion);
	}

	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 1;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_finalAutoriRetencion.add(jTextFieldnumero_finalAutoriRetencion, this.gridBagConstraintsAutoriRetencion);


	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 0;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_caducidadAutoriRetencion.add(jLabelfecha_caducidadAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 2;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caducidadAutoriRetencion.add(jButtonfecha_caducidadAutoriRetencionBusqueda, this.gridBagConstraintsAutoriRetencion);
	}

	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 1;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_caducidadAutoriRetencion.add(jDateChooserfecha_caducidadAutoriRetencion, this.gridBagConstraintsAutoriRetencion);


	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 0;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoAutoriRetencion.add(jLabelesta_activoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 2;
		this.gridBagConstraintsAutoriRetencion.ipadx = 0;
		this.gridBagConstraintsAutoriRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoAutoriRetencion.add(jButtonesta_activoAutoriRetencionBusqueda, this.gridBagConstraintsAutoriRetencion);
	}

	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriRetencion.gridy = 0;
	this.gridBagConstraintsAutoriRetencion.gridx = 1;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoAutoriRetencion.add(jCheckBoxesta_activoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriRetencion.gridy = iYPanelCamposAutoriRetencion;
	this.gridBagConstraintsAutoriRetencion.gridx = iXPanelCamposAutoriRetencion++;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriRetencion.add(this.jPanelidAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(iXPanelCamposAutoriRetencion % 1==0) {
		iXPanelCamposAutoriRetencion=0;
		iYPanelCamposAutoriRetencion++;
	}
	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriRetencion.gridy = iYPanelCamposAutoriRetencion;
	this.gridBagConstraintsAutoriRetencion.gridx = iXPanelCamposAutoriRetencion++;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriRetencion.add(this.jPanelnumero_serieAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(iXPanelCamposAutoriRetencion % 1==0) {
		iXPanelCamposAutoriRetencion=0;
		iYPanelCamposAutoriRetencion++;
	}
	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriRetencion.gridy = iYPanelCamposAutoriRetencion;
	this.gridBagConstraintsAutoriRetencion.gridx = iXPanelCamposAutoriRetencion++;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriRetencion.add(this.jPanelnumero_autorizacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(iXPanelCamposAutoriRetencion % 1==0) {
		iXPanelCamposAutoriRetencion=0;
		iYPanelCamposAutoriRetencion++;
	}
	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriRetencion.gridy = iYPanelCamposAutoriRetencion;
	this.gridBagConstraintsAutoriRetencion.gridx = iXPanelCamposAutoriRetencion++;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriRetencion.add(this.jPanelnumero_inicialAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(iXPanelCamposAutoriRetencion % 1==0) {
		iXPanelCamposAutoriRetencion=0;
		iYPanelCamposAutoriRetencion++;
	}
	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriRetencion.gridy = iYPanelCamposAutoriRetencion;
	this.gridBagConstraintsAutoriRetencion.gridx = iXPanelCamposAutoriRetencion++;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriRetencion.add(this.jPanelnumero_finalAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(iXPanelCamposAutoriRetencion % 1==0) {
		iXPanelCamposAutoriRetencion=0;
		iYPanelCamposAutoriRetencion++;
	}
	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriRetencion.gridy = iYPanelCamposAutoriRetencion;
	this.gridBagConstraintsAutoriRetencion.gridx = iXPanelCamposAutoriRetencion++;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriRetencion.add(this.jPanelfecha_caducidadAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(iXPanelCamposAutoriRetencion % 1==0) {
		iXPanelCamposAutoriRetencion=0;
		iYPanelCamposAutoriRetencion++;
	}
	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriRetencion.gridy = iYPanelCamposAutoriRetencion;
	this.gridBagConstraintsAutoriRetencion.gridx = iXPanelCamposAutoriRetencion++;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriRetencion.add(this.jPanelesta_activoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(iXPanelCamposAutoriRetencion % 1==0) {
		iXPanelCamposAutoriRetencion=0;
		iYPanelCamposAutoriRetencion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriRetencion.gridy = iYPanelCamposOcultosAutoriRetencion;
	this.gridBagConstraintsAutoriRetencion.gridx = iXPanelCamposOcultosAutoriRetencion++;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriRetencion.add(this.jPanelid_empresaAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(iXPanelCamposOcultosAutoriRetencion % 1==0) {
		iXPanelCamposOcultosAutoriRetencion=0;
		iYPanelCamposOcultosAutoriRetencion++;
	}
	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriRetencion.gridy = iYPanelCamposOcultosAutoriRetencion;
	this.gridBagConstraintsAutoriRetencion.gridx = iXPanelCamposOcultosAutoriRetencion++;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriRetencion.add(this.jPanelid_sucursalAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(iXPanelCamposOcultosAutoriRetencion % 1==0) {
		iXPanelCamposOcultosAutoriRetencion=0;
		iYPanelCamposOcultosAutoriRetencion++;
	}
	this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriRetencion.gridy = iYPanelCamposOcultosAutoriRetencion;
	this.gridBagConstraintsAutoriRetencion.gridx = iXPanelCamposOcultosAutoriRetencion++;
	this.gridBagConstraintsAutoriRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriRetencion.add(this.jPanelid_usuarioAutoriRetencion, this.gridBagConstraintsAutoriRetencion);



	if(iXPanelCamposOcultosAutoriRetencion % 1==0) {
		iXPanelCamposOcultosAutoriRetencion=0;
		iYPanelCamposOcultosAutoriRetencion++;
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
			
		GridBagLayout gridaBagLayoutAccionesAutoriRetencion= new GridBagLayout();
		this.jPanelAccionesAutoriRetencion.setLayout(gridaBagLayoutAccionesAutoriRetencion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAutoriRetencion= new GridBagLayout();
		this.jPanelAccionesFormularioAutoriRetencion.setLayout(gridaBagLayoutAccionesFormularioAutoriRetencion);
		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAutoriRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAutoriRetencion.add(this.jComboBoxTiposAccionesFormularioAutoriRetencion, this.gridBagConstraintsAutoriRetencion);

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAutoriRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAutoriRetencion.add(this.jCheckBoxPostAccionNuevoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.autoriretencionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAutoriRetencion.add(this.jCheckBoxPostAccionSinCerrarAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.autoriretencionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAutoriRetencion.add(this.jCheckBoxPostAccionSinMensajeAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccion++;
			
		this.jPanelAccionesAutoriRetencion.add(this.jButtonModificarAutoriRetencion, this.gridBagConstraintsAutoriRetencion);							

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx =iPosXAccion++;
			
		this.jPanelAccionesAutoriRetencion.add(this.jButtonEliminarAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		
			
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = 0;		
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutoriRetencion.add(this.jButtonActualizarAutoriRetencion, this.gridBagConstraintsAutoriRetencion);


		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = 0;		
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutoriRetencion.add(this.jButtonGuardarCambiosAutoriRetencion, this.gridBagConstraintsAutoriRetencion);	
		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = 0;		
		this.gridBagConstraintsAutoriRetencion.gridx =iPosXAccion++;
		
		this.jPanelAccionesAutoriRetencion.add(this.jButtonCancelarAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutoriRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutoriRetencion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();						
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriRetencion.gridx = 0;		
			//this.gridBagConstraintsAutoriRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutoriRetencion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutoriRetencion.gridx =0;
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutoriRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AutoriRetencionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAutoriRetencion = new AutoriRetencionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Autori Retencion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Autori Retencion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Autori Retencion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AutoriRetencionModel autoriretencionModel=new AutoriRetencionModel(this);
			
			//SI USARA CLASE INTERNA
			//AutoriRetencionModel.AutoriRetencionFocusTraversalPolicy autoriretencionFocusTraversalPolicy = autoriretencionModel.new AutoriRetencionFocusTraversalPolicy(this);
			
			//autoriretencionFocusTraversalPolicy.setautoriretencionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(autoriretencionModel);
			
			
			this.jContentPaneDetalleAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAutoriRetencion = new GridBagLayout();	
			this.jContentPaneDetalleAutoriRetencion.setLayout(gridaBagLayoutDetalleAutoriRetencion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutoriRetencion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
				this.gridBagConstraintsAutoriRetencion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAutoriRetencion.gridx = 0;
					
				
				this.jContentPaneDetalleAutoriRetencion.add(jTtoolBarDetalleAutoriRetencion, gridBagConstraintsAutoriRetencion);								
				
}
			
			this.jScrollPanelDatosEdicionAutoriRetencion=   new JScrollPane(jContentPaneDetalleAutoriRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutoriRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAutoriRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutoriRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAutoriRetencion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAutoriRetencion.gridx = 0;
	        
			this.jContentPaneDetalleAutoriRetencion.add(jPanelCamposAutoriRetencion, gridBagConstraintsAutoriRetencion);
			
			
			
			
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
						&& autoriretencionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.autoriretencionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAutoriRetencion= new GridBagConstraints();
						this.gridBagConstraintsAutoriRetencion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAutoriRetencion.gridx = 0;
						this.jContentPaneDetalleAutoriRetencion.add(this.jTabbedPaneRelacionesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAutoriRetencion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAutoriRetencion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
					this.gridBagConstraintsAutoriRetencion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAutoriRetencion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAutoriRetencion.gridx = 0;
					
				
					this.jContentPaneDetalleAutoriRetencion.add(jPanelCamposOcultosAutoriRetencion, gridBagConstraintsAutoriRetencion);
				
					this.jPanelCamposOcultosAutoriRetencion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAutoriRetencion.gridx = 0;
	        this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAutoriRetencion.add(this.jPanelAccionesFormularioAutoriRetencion, this.gridBagConstraintsAutoriRetencion);							
			
			
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
	        this.gridBagConstraintsAutoriRetencion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAutoriRetencion.gridx = 0;
	        
			
			this.jContentPaneDetalleAutoriRetencion.add(this.jPanelAccionesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAutoriRetencion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAutoriRetencion=   new JScrollPane(this.jPanelCamposAutoriRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutoriRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAutoriRetencion.gridx = 0;
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAutoriRetencion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutoriRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAutoriRetencion, this.gridBagConstraintsAutoriRetencion);			
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutoriRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			
			
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		
			
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutoriRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAutoriRetencion;//jContentPane;
		
		return jScrollPanelDatosEdicionAutoriRetencion;
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
