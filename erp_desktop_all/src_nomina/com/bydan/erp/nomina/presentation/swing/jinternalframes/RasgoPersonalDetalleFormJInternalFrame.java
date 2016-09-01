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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.RasgoPersonalConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class RasgoPersonalDetalleFormJInternalFrame extends RasgoPersonalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRasgoPersonal;
	
	protected JMenuBar jmenuBarDetalleRasgoPersonal;
	
	protected JMenu jmenuDetalleRasgoPersonal;
	protected JMenu jmenuDetalleArchivoRasgoPersonal;
	protected JMenu jmenuDetalleAccionesRasgoPersonal;
	protected JMenu jmenuDetalleDatosRasgoPersonal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRasgoPersonal;	
	protected GridBagConstraints gridBagConstraintsRasgoPersonal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RasgoPersonalBeanSwingJInternalFrameAdditional jInternalFrameDetalleRasgoPersonal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoRasgoPersonalBeanSwingJInternalFrame tiporasgopersonalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporasgopersonal="";
	
	public RasgoPersonalSessionBean rasgopersonalSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoRasgoPersonalSessionBean tiporasgopersonalSessionBean;	
	
	public RasgoPersonalLogic rasgopersonalLogic;
	
	public JScrollPane jScrollPanelDatosRasgoPersonal;
	public JScrollPane jScrollPanelDatosEdicionRasgoPersonal;
	public JScrollPane jScrollPanelDatosGeneralRasgoPersonal;
	
	protected JPanel jPanelCamposRasgoPersonal;    
	protected JPanel jPanelCamposOcultosRasgoPersonal;    	
	protected JPanel jPanelAccionesRasgoPersonal;
	protected JPanel jPanelAccionesFormularioRasgoPersonal;
    
	
	
	protected Integer iXPanelCamposRasgoPersonal=0;
	protected Integer iYPanelCamposRasgoPersonal=0;
	
	protected Integer iXPanelCamposOcultosRasgoPersonal=0;
	protected Integer iYPanelCamposOcultosRasgoPersonal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRasgoPersonal;
	public JButton jButtonModificarRasgoPersonal;
	public JButton jButtonActualizarRasgoPersonal;
    public JButton jButtonEliminarRasgoPersonal;
	public JButton jButtonCancelarRasgoPersonal;
    public JButton jButtonGuardarCambiosRasgoPersonal;
	public JButton jButtonGuardarCambiosTablaRasgoPersonal;
	protected JButton jButtonCerrarRasgoPersonal;
	
	
	protected JButton jButtonProcesarInformacionRasgoPersonal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRasgoPersonal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRasgoPersonal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRasgoPersonal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRasgoPersonal;
	protected JButton jButtonModificarToolBarRasgoPersonal;
	protected JButton jButtonActualizarToolBarRasgoPersonal;
    protected JButton jButtonEliminarToolBarRasgoPersonal;
	protected JButton jButtonCancelarToolBarRasgoPersonal;
    protected JButton jButtonGuardarCambiosToolBarRasgoPersonal;
	protected JButton jButtonGuardarCambiosTablaToolBarRasgoPersonal;
	protected JButton jButtonMostrarOcultarTablaToolBarRasgoPersonal;
	protected JButton jButtonCerrarToolBarRasgoPersonal;
	
	protected JButton jButtonProcesarInformacionToolBarRasgoPersonal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRasgoPersonal;
	protected JMenuItem jMenuItemModificarRasgoPersonal;
	protected JMenuItem jMenuItemActualizarRasgoPersonal;
    protected JMenuItem jMenuItemEliminarRasgoPersonal;
	protected JMenuItem jMenuItemCancelarRasgoPersonal;
    protected JMenuItem jMenuItemGuardarCambiosRasgoPersonal;
	protected JMenuItem jMenuItemGuardarCambiosTablaRasgoPersonal;
	protected JMenuItem jMenuItemCerrarRasgoPersonal;
	protected JMenuItem jMenuItemDetalleCerrarRasgoPersonal;
	protected JMenuItem jMenuItemDetalleMostarOcultarRasgoPersonal;
	
	protected JMenuItem jMenuItemProcesarInformacionRasgoPersonal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRasgoPersonal;
	protected JMenuItem jMenuItemMostrarOcultarRasgoPersonal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRasgoPersonal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRasgoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRasgoPersonal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRasgoPersonal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRasgoPersonal;
	public JLabel jLabelIdRasgoPersonal;
	public JLabel jLabelidRasgoPersonal;
	public JButton jButtonidRasgoPersonalBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionRasgoPersonal;
	public JLabel jLabeldescripcionRasgoPersonal;
	public JTextArea jTextAreadescripcionRasgoPersonal;
	public JScrollPane jscrollPanedescripcionRasgoPersonal;
	public JButton jButtondescripcionRasgoPersonalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRasgoPersonal;
	public JLabel jLabelid_empresaRasgoPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRasgoPersonal;
	public JButton jButtonid_empresaRasgoPersonal= new JButtonMe();
	public JButton jButtonid_empresaRasgoPersonalUpdate= new JButtonMe();
	public JButton jButtonid_empresaRasgoPersonalBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoRasgoPersonal;
	public JLabel jLabelid_empleadoRasgoPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoRasgoPersonal;
	public JButton jButtonid_empleadoRasgoPersonal= new JButtonMe();
	public JButton jButtonid_empleadoRasgoPersonalUpdate= new JButtonMe();
	public JButton jButtonid_empleadoRasgoPersonalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_rasgo_personalRasgoPersonal;
	public JLabel jLabelid_tipo_rasgo_personalRasgoPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_rasgo_personalRasgoPersonal;
	public JButton jButtonid_tipo_rasgo_personalRasgoPersonal= new JButtonMe();
	public JButton jButtonid_tipo_rasgo_personalRasgoPersonalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRasgoPersonal;
	
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
	
	public RasgoPersonalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRasgoPersonal=new JPanel();
				this.jPanelAccionesFormularioRasgoPersonal=new JPanel();
				this.jmenuBarDetalleRasgoPersonal=new JMenuBar();
				this.jTtoolBarDetalleRasgoPersonal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RasgoPersonalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RasgoPersonalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RasgoPersonalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RasgoPersonalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RasgoPersonalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRasgoPersonal() {
		return this.jButtonActualizarToolBarRasgoPersonal;
	}
	
	public JButton getjButtonEliminarToolBarRasgoPersonal() {
		return this.jButtonEliminarToolBarRasgoPersonal;
	}
	
	public JButton getjButtonCancelarToolBarRasgoPersonal() {
		return this.jButtonCancelarToolBarRasgoPersonal;
	}		
	
	public JButton getjButtonProcesarInformacionRasgoPersonal() {
		return this.jButtonProcesarInformacionRasgoPersonal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRasgoPersonal)	{
		this.jButtonProcesarInformacionRasgoPersonal = jButtonProcesarInformacionRasgoPersonal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRasgoPersonal() {
		return this.jComboBoxTiposAccionesRasgoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRasgoPersonal(
			JComboBox jComboBoxTiposRelacionesRasgoPersonal) {
		this.jComboBoxTiposRelacionesRasgoPersonal = jComboBoxTiposRelacionesRasgoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRasgoPersonal(
			JComboBox jComboBoxTiposAccionesRasgoPersonal) {
		this.jComboBoxTiposAccionesRasgoPersonal = jComboBoxTiposAccionesRasgoPersonal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRasgoPersonal() {
		return this.jComboBoxTiposAccionesFormularioRasgoPersonal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRasgoPersonal(
			JComboBox jComboBoxTiposAccionesFormularioRasgoPersonal) {
		this.jComboBoxTiposAccionesFormularioRasgoPersonal = jComboBoxTiposAccionesFormularioRasgoPersonal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
		
		this.rasgopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rasgopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rasgopersonalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RasgoPersonalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rasgo Personal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
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
	
		RasgoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRasgoPersonal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRasgoPersonal=new JButtonMe();
				this.jButtonModificarToolBarRasgoPersonal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRasgoPersonal,this.jTtoolBarDetalleRasgoPersonal,
							"actualizar","actualizar","Actualizar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRasgoPersonal,this.jTtoolBarDetalleRasgoPersonal,
							"eliminar","eliminar","Eliminar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRasgoPersonal,this.jTtoolBarDetalleRasgoPersonal,
							"cancelar","cancelar","Cancelar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRasgoPersonal,this.jTtoolBarDetalleRasgoPersonal,
							"guardarcambios","guardarcambios","Guardar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRasgoPersonal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRasgoPersonal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRasgoPersonal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRasgoPersonal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRasgoPersonal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRasgoPersonal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRasgoPersonal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRasgoPersonal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRasgoPersonal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRasgoPersonal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRasgoPersonal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRasgoPersonal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRasgoPersonal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRasgoPersonal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRasgoPersonal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRasgoPersonal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRasgoPersonal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRasgoPersonal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRasgoPersonal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRasgoPersonal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRasgoPersonal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRasgoPersonal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRasgoPersonal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRasgoPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRasgoPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRasgoPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRasgoPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRasgoPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRasgoPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRasgoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRasgoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRasgoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRasgoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRasgoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRasgoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRasgoPersonal.add(this.jMenuItemDetalleCerrarRasgoPersonal);
		
		this.jmenuDetalleAccionesRasgoPersonal.add(this.jMenuItemActualizarRasgoPersonal);
		this.jmenuDetalleAccionesRasgoPersonal.add(this.jMenuItemEliminarRasgoPersonal);
		this.jmenuDetalleAccionesRasgoPersonal.add(this.jMenuItemCancelarRasgoPersonal);		
		
		//this.jmenuDetalleDatosRasgoPersonal.add(this.jMenuItemDetalleAbrirOrderByRasgoPersonal);				
		this.jmenuDetalleDatosRasgoPersonal.add(this.jMenuItemDetalleMostarOcultarRasgoPersonal);				
				
		//this.jmenuDetalleAccionesRasgoPersonal.add(this.jMenuItemGuardarCambiosRasgoPersonal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRasgoPersonal.add(this.jmenuDetalleArchivoRasgoPersonal);		
		this.jmenuBarDetalleRasgoPersonal.add(this.jmenuDetalleAccionesRasgoPersonal);		
		this.jmenuBarDetalleRasgoPersonal.add(this.jmenuDetalleDatosRasgoPersonal);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRasgoPersonal);				
	}
	
	
	public void inicializarElementosCamposRasgoPersonal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRasgoPersonal = new JLabelMe();
		jLabelIdRasgoPersonal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRasgoPersonal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRasgoPersonal.setToolTipText(RasgoPersonalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRasgoPersonal= new GridBagLayout();

		this.jPanelidRasgoPersonal.setLayout(this.gridaBagLayoutRasgoPersonal);

		jLabelidRasgoPersonal = new JLabel();
		jLabelidRasgoPersonal.setText("Id");

		jLabelidRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionRasgoPersonal = new JLabelMe();
		this.jLabeldescripcionRasgoPersonal.setText(""+RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionRasgoPersonal.setToolTipText("Descripcion");
		this.jLabeldescripcionRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionRasgoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionRasgoPersonal.setToolTipText(RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutRasgoPersonal = new GridBagLayout();
		this.jPaneldescripcionRasgoPersonal.setLayout(this.gridaBagLayoutRasgoPersonal);


		jTextAreadescripcionRasgoPersonal= new JTextAreaMe();
		jTextAreadescripcionRasgoPersonal.setEnabled(false);
		jTextAreadescripcionRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRasgoPersonal.setLineWrap(true);
		jTextAreadescripcionRasgoPersonal.setWrapStyleWord(true);
		jTextAreadescripcionRasgoPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionRasgoPersonal.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionRasgoPersonal = new JScrollPane(jTextAreadescripcionRasgoPersonal);
		jscrollPanedescripcionRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionRasgoPersonalBusqueda= new JButtonMe();
		this.jButtondescripcionRasgoPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionRasgoPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionRasgoPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionRasgoPersonalBusqueda.setText("U");
		this.jButtondescripcionRasgoPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionRasgoPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionRasgoPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionRasgoPersonalBusqueda"));

		if(this.rasgopersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionRasgoPersonalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRasgoPersonal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRasgoPersonal = new JLabelMe();
		this.jLabelid_empresaRasgoPersonal.setText(""+RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRasgoPersonal.setToolTipText("Empresa");
		this.jLabelid_empresaRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRasgoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRasgoPersonal.setToolTipText(RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRasgoPersonal = new GridBagLayout();
		this.jPanelid_empresaRasgoPersonal.setLayout(this.gridaBagLayoutRasgoPersonal);


		jComboBoxid_empresaRasgoPersonal= new JComboBoxMe();
		jComboBoxid_empresaRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRasgoPersonal.setEnabled(false);

		this.jButtonid_empresaRasgoPersonal= new JButtonMe();
		this.jButtonid_empresaRasgoPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRasgoPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRasgoPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRasgoPersonal.setText("Buscar");
		this.jButtonid_empresaRasgoPersonal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRasgoPersonal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRasgoPersonal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRasgoPersonal"));

		this.jButtonid_empresaRasgoPersonalBusqueda= new JButtonMe();
		this.jButtonid_empresaRasgoPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRasgoPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRasgoPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRasgoPersonalBusqueda.setText("U");
		this.jButtonid_empresaRasgoPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRasgoPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRasgoPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRasgoPersonalBusqueda"));

		if(this.rasgopersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRasgoPersonalBusqueda.setVisible(false);		}

		this.jButtonid_empresaRasgoPersonalUpdate= new JButtonMe();
		this.jButtonid_empresaRasgoPersonalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRasgoPersonalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRasgoPersonalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRasgoPersonalUpdate.setText("U");
		this.jButtonid_empresaRasgoPersonalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRasgoPersonalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRasgoPersonalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRasgoPersonalUpdate"));



					
		this.jLabelid_empleadoRasgoPersonal = new JLabelMe();
		this.jLabelid_empleadoRasgoPersonal.setText(""+RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoRasgoPersonal.setToolTipText("Empleado");
		this.jLabelid_empleadoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoRasgoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoRasgoPersonal.setToolTipText(RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutRasgoPersonal = new GridBagLayout();
		this.jPanelid_empleadoRasgoPersonal.setLayout(this.gridaBagLayoutRasgoPersonal);


		jComboBoxid_empleadoRasgoPersonal= new JComboBoxMe();
		jComboBoxid_empleadoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoRasgoPersonal= new JButtonMe();
		this.jButtonid_empleadoRasgoPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRasgoPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRasgoPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRasgoPersonal.setText("Buscar");
		this.jButtonid_empleadoRasgoPersonal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoRasgoPersonal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRasgoPersonal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRasgoPersonal"));

		this.jButtonid_empleadoRasgoPersonalBusqueda= new JButtonMe();
		this.jButtonid_empleadoRasgoPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRasgoPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRasgoPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoRasgoPersonalBusqueda.setText("U");
		this.jButtonid_empleadoRasgoPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoRasgoPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRasgoPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRasgoPersonalBusqueda"));

		if(this.rasgopersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoRasgoPersonalBusqueda.setVisible(false);		}

		this.jButtonid_empleadoRasgoPersonalUpdate= new JButtonMe();
		this.jButtonid_empleadoRasgoPersonalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRasgoPersonalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRasgoPersonalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoRasgoPersonalUpdate.setText("U");
		this.jButtonid_empleadoRasgoPersonalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoRasgoPersonalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRasgoPersonalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRasgoPersonalUpdate"));



					
		this.jLabelid_tipo_rasgo_personalRasgoPersonal = new JLabelMe();
		this.jLabelid_tipo_rasgo_personalRasgoPersonal.setText(""+RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL+" : *");
		this.jLabelid_tipo_rasgo_personalRasgoPersonal.setToolTipText("Tipo Rasgo Personal");
		this.jLabelid_tipo_rasgo_personalRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_rasgo_personalRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_rasgo_personalRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_rasgo_personalRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_rasgo_personalRasgoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_rasgo_personalRasgoPersonal.setToolTipText(RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL);
		this.gridaBagLayoutRasgoPersonal = new GridBagLayout();
		this.jPanelid_tipo_rasgo_personalRasgoPersonal.setLayout(this.gridaBagLayoutRasgoPersonal);


		jComboBoxid_tipo_rasgo_personalRasgoPersonal= new JComboBoxMe();
		jComboBoxid_tipo_rasgo_personalRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_rasgo_personalRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_rasgo_personalRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_rasgo_personalRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_rasgo_personalRasgoPersonal= new JButtonMe();
		this.jButtonid_tipo_rasgo_personalRasgoPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_rasgo_personalRasgoPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_rasgo_personalRasgoPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_rasgo_personalRasgoPersonal.setText("Buscar");
		this.jButtonid_tipo_rasgo_personalRasgoPersonal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_rasgo_personalRasgoPersonal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_rasgo_personalRasgoPersonal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_rasgo_personalRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_rasgo_personalRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_rasgo_personalRasgoPersonal"));

		this.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda= new JButtonMe();
		this.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda.setText("U");
		this.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_rasgo_personalRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_rasgo_personalRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_rasgo_personalRasgoPersonalBusqueda"));

		if(this.rasgopersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_rasgo_personalRasgoPersonalUpdate= new JButtonMe();
		this.jButtonid_tipo_rasgo_personalRasgoPersonalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_rasgo_personalRasgoPersonalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_rasgo_personalRasgoPersonalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_rasgo_personalRasgoPersonalUpdate.setText("U");
		this.jButtonid_tipo_rasgo_personalRasgoPersonalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_rasgo_personalRasgoPersonalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_rasgo_personalRasgoPersonalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_rasgo_personalRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_rasgo_personalRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_rasgo_personalRasgoPersonalUpdate"));



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
		//this.jInternalFrameDetalleRasgoPersonal = new RasgoPersonalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Rasgo Personal DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRasgoPersonal= new GridBagLayout();
		

		
		String sToolTipRasgoPersonal="";
		sToolTipRasgoPersonal=RasgoPersonalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRasgoPersonal+="(Nomina.RasgoPersonal)";
		}
		
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
			sToolTipRasgoPersonal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRasgoPersonal = new JButtonMe();
		this.jButtonModificarRasgoPersonal = new JButtonMe();
        this.jButtonActualizarRasgoPersonal = new JButtonMe();
        this.jButtonEliminarRasgoPersonal = new JButtonMe();
        this.jButtonCancelarRasgoPersonal = new JButtonMe();
        this.jButtonGuardarCambiosRasgoPersonal = new JButtonMe();
		this.jButtonGuardarCambiosTablaRasgoPersonal = new JButtonMe();
		this.jButtonCerrarRasgoPersonal = new JButtonMe();
		
		this.jScrollPanelDatosRasgoPersonal = new JScrollPane();   
        this.jScrollPanelDatosEdicionRasgoPersonal = new JScrollPane();
		this.jScrollPanelDatosGeneralRasgoPersonal = new JScrollPane();
				
		
		
		this.jPanelCamposRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Rasgo Personal";
		
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rasgo Personales" + this.sPath));
		} else {
			this.jScrollPanelDatosRasgoPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRasgoPersonal.setName("jPanelCamposRasgoPersonal"); 

		this.jPanelCamposOcultosRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRasgoPersonal.setName("jPanelCamposOcultosRasgoPersonal"); 

        this.jPanelAccionesRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRasgoPersonal.setToolTipText("Acciones");
        this.jPanelAccionesRasgoPersonal.setName("Acciones"); 

		this.jPanelAccionesFormularioRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRasgoPersonal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRasgoPersonal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRasgoPersonal.setText("Nuevo");
		this.jButtonModificarRasgoPersonal.setText("Editar");
        this.jButtonActualizarRasgoPersonal.setText("Actualizar");
        this.jButtonEliminarRasgoPersonal.setText("Eliminar");
        this.jButtonCancelarRasgoPersonal.setText("Cancelar");
        this.jButtonGuardarCambiosRasgoPersonal.setText("Guardar");
		this.jButtonGuardarCambiosTablaRasgoPersonal.setText("Guardar");
		this.jButtonCerrarRasgoPersonal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRasgoPersonal,"nuevo_button","Nuevo",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRasgoPersonal,"modificar_button","Editar",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRasgoPersonal,"actualizar_button","Actualizar",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRasgoPersonal,"eliminar_button","Eliminar",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRasgoPersonal,"cancelar_button","Cancelar",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRasgoPersonal,"guardarcambios_button","Guardar",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRasgoPersonal,"guardarcambiostabla_button","Guardar",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRasgoPersonal,"cerrar_button","Salir",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRasgoPersonal.setToolTipText("Nuevo"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRasgoPersonal.setToolTipText("Editar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRasgoPersonal.setToolTipText("Actualizar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRasgoPersonal.setToolTipText("Eliminar)"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRasgoPersonal.setToolTipText("Cancelar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRasgoPersonal.setToolTipText("Guardar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRasgoPersonal.setToolTipText("Guardar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRasgoPersonal.setToolTipText("Salir"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRasgoPersonal";
		inputMap = this.jButtonNuevoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRasgoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRasgoPersonal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRasgoPersonal";
		inputMap = this.jButtonActualizarRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRasgoPersonal"));
		
		//ELIMINAR
		sMapKey = "EliminarRasgoPersonal";
		inputMap = this.jButtonEliminarRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRasgoPersonal"));
		
		//CANCELAR	
		sMapKey = "CancelarRasgoPersonal";
		inputMap = this.jButtonCancelarRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRasgoPersonal"));
		
		//CERRAR		
		sMapKey = "CerrarRasgoPersonal";
		inputMap = this.jButtonCerrarRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRasgoPersonal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRasgoPersonal";
		inputMap = this.jButtonGuardarCambiosTablaRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRasgoPersonal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRasgoPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRasgoPersonal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRasgoPersonal.setToolTipText("Nuevo RasgoPersonal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRasgoPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRasgoPersonal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRasgoPersonal.setToolTipText("Sin Cerrar Ventana RasgoPersonal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRasgoPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRasgoPersonal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRasgoPersonal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRasgoPersonal.setText("Accion");
		this.jComboBoxTiposAccionesRasgoPersonal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRasgoPersonal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRasgoPersonal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRasgoPersonal = new JLabelMe();
		
		this.jLabelAccionesRasgoPersonal.setText("Acciones");		
		this.jLabelAccionesRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRasgoPersonal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRasgoPersonal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRasgoPersonal=new JTabbedPane();
		this.jTabbedPaneRelacionesRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRasgoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRasgoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRasgoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRasgoPersonal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRasgoPersonal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRasgoPersonal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRasgoPersonal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRasgoPersonal = new GridBagLayout();
		
		this.jPanelCamposRasgoPersonal.setLayout(gridaBagLayoutCamposRasgoPersonal);
		this.jPanelCamposOcultosRasgoPersonal.setLayout(gridaBagLayoutCamposOcultosRasgoPersonal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRasgoPersonal.gridy = 0;
	this.gridBagConstraintsRasgoPersonal.gridx = 0;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRasgoPersonal.add(jLabelIdRasgoPersonal, this.gridBagConstraintsRasgoPersonal);



	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRasgoPersonal.gridy = 0;
	this.gridBagConstraintsRasgoPersonal.gridx = 1;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRasgoPersonal.add(jLabelidRasgoPersonal, this.gridBagConstraintsRasgoPersonal);


	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRasgoPersonal.gridy = 0;
	this.gridBagConstraintsRasgoPersonal.gridx = 0;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRasgoPersonal.add(jLabelid_empresaRasgoPersonal, this.gridBagConstraintsRasgoPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = 0;
		this.gridBagConstraintsRasgoPersonal.gridx = 2;
		this.gridBagConstraintsRasgoPersonal.ipadx = 0;
		this.gridBagConstraintsRasgoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRasgoPersonal.add(jButtonid_empresaRasgoPersonalBusqueda, this.gridBagConstraintsRasgoPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = 0;
		this.gridBagConstraintsRasgoPersonal.gridx = 3;
		this.gridBagConstraintsRasgoPersonal.ipadx = 0;
		this.gridBagConstraintsRasgoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRasgoPersonal.add(jButtonid_empresaRasgoPersonalUpdate, this.gridBagConstraintsRasgoPersonal);
	}

	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRasgoPersonal.gridy = 0;
	this.gridBagConstraintsRasgoPersonal.gridx = 1;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRasgoPersonal.add(jComboBoxid_empresaRasgoPersonal, this.gridBagConstraintsRasgoPersonal);


	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRasgoPersonal.gridy = 0;
	this.gridBagConstraintsRasgoPersonal.gridx = 0;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoRasgoPersonal.add(jLabelid_empleadoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	//this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRasgoPersonal.gridy = 0;
	this.gridBagConstraintsRasgoPersonal.gridx = 2;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoRasgoPersonal.add(jButtonid_empleadoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = 0;
		this.gridBagConstraintsRasgoPersonal.gridx = 3;
		this.gridBagConstraintsRasgoPersonal.ipadx = 0;
		this.gridBagConstraintsRasgoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoRasgoPersonal.add(jButtonid_empleadoRasgoPersonalBusqueda, this.gridBagConstraintsRasgoPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = 0;
		this.gridBagConstraintsRasgoPersonal.gridx = 4;
		this.gridBagConstraintsRasgoPersonal.ipadx = 0;
		this.gridBagConstraintsRasgoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoRasgoPersonal.add(jButtonid_empleadoRasgoPersonalUpdate, this.gridBagConstraintsRasgoPersonal);
	}

	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRasgoPersonal.gridy = 0;
	this.gridBagConstraintsRasgoPersonal.gridx = 1;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoRasgoPersonal.add(jComboBoxid_empleadoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);


	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRasgoPersonal.gridy = 0;
	this.gridBagConstraintsRasgoPersonal.gridx = 0;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_rasgo_personalRasgoPersonal.add(jLabelid_tipo_rasgo_personalRasgoPersonal, this.gridBagConstraintsRasgoPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = 0;
		this.gridBagConstraintsRasgoPersonal.gridx = 2;
		this.gridBagConstraintsRasgoPersonal.ipadx = 0;
		this.gridBagConstraintsRasgoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_rasgo_personalRasgoPersonal.add(jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda, this.gridBagConstraintsRasgoPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = 0;
		this.gridBagConstraintsRasgoPersonal.gridx = 3;
		this.gridBagConstraintsRasgoPersonal.ipadx = 0;
		this.gridBagConstraintsRasgoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_rasgo_personalRasgoPersonal.add(jButtonid_tipo_rasgo_personalRasgoPersonalUpdate, this.gridBagConstraintsRasgoPersonal);
	}

	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRasgoPersonal.gridy = 0;
	this.gridBagConstraintsRasgoPersonal.gridx = 1;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_rasgo_personalRasgoPersonal.add(jComboBoxid_tipo_rasgo_personalRasgoPersonal, this.gridBagConstraintsRasgoPersonal);


	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRasgoPersonal.gridy = 0;
	this.gridBagConstraintsRasgoPersonal.gridx = 0;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionRasgoPersonal.add(jLabeldescripcionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = 0;
		this.gridBagConstraintsRasgoPersonal.gridx = 2;
		this.gridBagConstraintsRasgoPersonal.ipadx = 0;
		this.gridBagConstraintsRasgoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionRasgoPersonal.add(jButtondescripcionRasgoPersonalBusqueda, this.gridBagConstraintsRasgoPersonal);
	}

	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRasgoPersonal.gridy = 0;
	this.gridBagConstraintsRasgoPersonal.gridx = 1;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionRasgoPersonal.add(jscrollPanedescripcionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRasgoPersonal.gridy = iYPanelCamposRasgoPersonal;
	this.gridBagConstraintsRasgoPersonal.gridx = iXPanelCamposRasgoPersonal++;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRasgoPersonal.add(this.jPanelidRasgoPersonal, this.gridBagConstraintsRasgoPersonal);



	if(iXPanelCamposRasgoPersonal % 1==0) {
		iXPanelCamposRasgoPersonal=0;
		iYPanelCamposRasgoPersonal++;
	}
	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRasgoPersonal.gridy = iYPanelCamposRasgoPersonal;
	this.gridBagConstraintsRasgoPersonal.gridx = iXPanelCamposRasgoPersonal++;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRasgoPersonal.add(this.jPanelid_empleadoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);



	if(iXPanelCamposRasgoPersonal % 1==0) {
		iXPanelCamposRasgoPersonal=0;
		iYPanelCamposRasgoPersonal++;
	}
	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRasgoPersonal.gridy = iYPanelCamposRasgoPersonal;
	this.gridBagConstraintsRasgoPersonal.gridx = iXPanelCamposRasgoPersonal++;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRasgoPersonal.add(this.jPanelid_tipo_rasgo_personalRasgoPersonal, this.gridBagConstraintsRasgoPersonal);



	if(iXPanelCamposRasgoPersonal % 1==0) {
		iXPanelCamposRasgoPersonal=0;
		iYPanelCamposRasgoPersonal++;
	}
	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRasgoPersonal.gridy = iYPanelCamposRasgoPersonal;
	this.gridBagConstraintsRasgoPersonal.gridx = iXPanelCamposRasgoPersonal++;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRasgoPersonal.add(this.jPaneldescripcionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);



	if(iXPanelCamposRasgoPersonal % 1==0) {
		iXPanelCamposRasgoPersonal=0;
		iYPanelCamposRasgoPersonal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRasgoPersonal.gridy = iYPanelCamposOcultosRasgoPersonal;
	this.gridBagConstraintsRasgoPersonal.gridx = iXPanelCamposOcultosRasgoPersonal++;
	this.gridBagConstraintsRasgoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRasgoPersonal.add(this.jPanelid_empresaRasgoPersonal, this.gridBagConstraintsRasgoPersonal);



	if(iXPanelCamposOcultosRasgoPersonal % 1==0) {
		iXPanelCamposOcultosRasgoPersonal=0;
		iYPanelCamposOcultosRasgoPersonal++;
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
			
		GridBagLayout gridaBagLayoutAccionesRasgoPersonal= new GridBagLayout();
		this.jPanelAccionesRasgoPersonal.setLayout(gridaBagLayoutAccionesRasgoPersonal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRasgoPersonal= new GridBagLayout();
		this.jPanelAccionesFormularioRasgoPersonal.setLayout(gridaBagLayoutAccionesFormularioRasgoPersonal);
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRasgoPersonal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRasgoPersonal.add(this.jComboBoxTiposAccionesFormularioRasgoPersonal, this.gridBagConstraintsRasgoPersonal);

		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRasgoPersonal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRasgoPersonal.add(this.jCheckBoxPostAccionNuevoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRasgoPersonal.add(this.jCheckBoxPostAccionSinCerrarRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRasgoPersonal.add(this.jCheckBoxPostAccionSinMensajeRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.gridy = 0;
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccion++;
			
		this.jPanelAccionesRasgoPersonal.add(this.jButtonModificarRasgoPersonal, this.gridBagConstraintsRasgoPersonal);							

		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.gridy = 0;
		this.gridBagConstraintsRasgoPersonal.gridx =iPosXAccion++;
			
		this.jPanelAccionesRasgoPersonal.add(this.jButtonEliminarRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		
			
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = 0;		
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccion++;
		
		this.jPanelAccionesRasgoPersonal.add(this.jButtonActualizarRasgoPersonal, this.gridBagConstraintsRasgoPersonal);


		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = 0;		
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccion++;
		
		this.jPanelAccionesRasgoPersonal.add(this.jButtonGuardarCambiosRasgoPersonal, this.gridBagConstraintsRasgoPersonal);	
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = 0;		
		this.gridBagConstraintsRasgoPersonal.gridx =iPosXAccion++;
		
		this.jPanelAccionesRasgoPersonal.add(this.jButtonCancelarRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRasgoPersonal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRasgoPersonal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();						
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRasgoPersonal.gridx = 0;		
			//this.gridBagConstraintsRasgoPersonal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRasgoPersonal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRasgoPersonal.gridx =0;
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRasgoPersonal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RasgoPersonalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRasgoPersonal = new RasgoPersonalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Rasgo Personal DATOS");
			
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
			
	        //this.setTitle("[FOR] - Rasgo Personal DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rasgo Personal Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RasgoPersonalModel rasgopersonalModel=new RasgoPersonalModel(this);
			
			//SI USARA CLASE INTERNA
			//RasgoPersonalModel.RasgoPersonalFocusTraversalPolicy rasgopersonalFocusTraversalPolicy = rasgopersonalModel.new RasgoPersonalFocusTraversalPolicy(this);
			
			//rasgopersonalFocusTraversalPolicy.setrasgopersonalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(rasgopersonalModel);
			
			
			this.jContentPaneDetalleRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRasgoPersonal = new GridBagLayout();	
			this.jContentPaneDetalleRasgoPersonal.setLayout(gridaBagLayoutDetalleRasgoPersonal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRasgoPersonal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
				this.gridBagConstraintsRasgoPersonal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRasgoPersonal.gridx = 0;
					
				
				this.jContentPaneDetalleRasgoPersonal.add(jTtoolBarDetalleRasgoPersonal, gridBagConstraintsRasgoPersonal);								
				
}
			
			this.jScrollPanelDatosEdicionRasgoPersonal=   new JScrollPane(jContentPaneDetalleRasgoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRasgoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRasgoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRasgoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRasgoPersonal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRasgoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRasgoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRasgoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRasgoPersonal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRasgoPersonal.gridx = 0;
	        
			this.jContentPaneDetalleRasgoPersonal.add(jPanelCamposRasgoPersonal, gridBagConstraintsRasgoPersonal);
			
			
			
			
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
						&& rasgopersonalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.rasgopersonalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRasgoPersonal= new GridBagConstraints();
						this.gridBagConstraintsRasgoPersonal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRasgoPersonal.gridx = 0;
						this.jContentPaneDetalleRasgoPersonal.add(this.jTabbedPaneRelacionesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRasgoPersonal.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRasgoPersonal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
					this.gridBagConstraintsRasgoPersonal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRasgoPersonal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRasgoPersonal.gridx = 0;
					
				
					this.jContentPaneDetalleRasgoPersonal.add(jPanelCamposOcultosRasgoPersonal, gridBagConstraintsRasgoPersonal);
				
					this.jPanelCamposOcultosRasgoPersonal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRasgoPersonal.gridx = 0;
	        this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRasgoPersonal.add(this.jPanelAccionesFormularioRasgoPersonal, this.gridBagConstraintsRasgoPersonal);							
			
			
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
	        this.gridBagConstraintsRasgoPersonal.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRasgoPersonal.gridx = 0;
	        
			
			this.jContentPaneDetalleRasgoPersonal.add(this.jPanelAccionesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRasgoPersonal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRasgoPersonal=   new JScrollPane(this.jPanelCamposRasgoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRasgoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRasgoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRasgoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRasgoPersonal.gridx = 0;
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRasgoPersonal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRasgoPersonal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRasgoPersonal, this.gridBagConstraintsRasgoPersonal);			
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRasgoPersonal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRasgoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			
			
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRasgoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		
			
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRasgoPersonal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRasgoPersonal;//jContentPane;
		
		return jScrollPanelDatosEdicionRasgoPersonal;
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
